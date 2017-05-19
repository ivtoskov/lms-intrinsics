package ch.ethz.acl.intrinsics

import java.io.{File, FileOutputStream, PrintStream}

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.xml.{Node, XML}
import scala.lms.common.{ArrayOpsExp, BooleanOpsExp, PrimitiveOpsExp, SeqOpsExp}

class ZGenerator extends IntrinsicsBase with ArrayOpsExp with SeqOpsExp with PrimitiveOpsExp with BooleanOpsExp {

  val rootPath = new File(".").getAbsolutePath
  val srcPath = rootPath + "/src/main/scala/ch/ethz/acl/intrinsics/"
  val resourcePath = rootPath + "/src/main/resources/"
  val xmlFile = resourcePath + "data-3.3.16.xml"
  val nrIntrinsicsPerFile = 175
  val temporaryDisabledIntrinsics = List(
    "_bnd_copy_ptr_bounds",
    "_bnd_get_ptr_lbound",
    "_bnd_get_ptr_ubound",
    "_bnd_init_ptr_bounds",
    "_bnd_narrow_ptr_bounds",
    "_bnd_set_ptr_bounds",
    "_bnd_store_ptr_bounds",
    "_mm_malloc",
    "_mm512_i32extscatter_ps")

  case class Parameter (varName: String, pType: String)

  case class Intrinsic (node: Node,
                        name: String,
                        tech: String,
                        CPUID: List[String],
                        returnType: String,
                        intrinsicType: List[IntrinsicsType.IntrinsicsType],
                        category: List[IntrinsicsCategory.IntrinsicsCategory],
                        performance: Map[MicroArchType, Performance],
                        nonOffsetParams: List[Parameter],
                        offsetParams: List[Parameter],
                        description: String,
                        operation: List[String],
                        header: String
                       ) {

    def getAllTypeStrings = returnType :: offsetParams.map(_.pType)
    def toXML = node.toString()
    def allParams = nonOffsetParams ::: offsetParams

    def mirroringPrefix = {
      if (extractArrayParams.nonEmpty) {
        "iDef@"
      } else {
        ""
      }
    }

    def getDefName = {
      var defName = name.toUpperCase()

      while (defName.charAt(0) == '_') {
        defName = defName.substring(1)
      }

      assert(!defName.equals(name), "Method and class have the same name")
      defName
    }

    def getParamsAsStrings = {
      allParams.map(p => {
        p.varName + ": " + p.pType
      }).mkString(", ")
    }

    def getLMSParams = {
      allParams.map(p => {
        p.varName + ": Exp[" + remap(p.pType) + "]" + (if (offsetParams.contains(p)) " = Const(0)" else "")
      }).mkString(", ")
    }

    def getParams = {
      allParams.map(p => p.varName).mkString(", ")
    }

    def getReturnType = {
      remap(returnType)
    }

    def extractArrayParams = {
      nonOffsetParams.filter(isArrayParam)
    }

    def prettyDescription = {
      Utils.wrap(description, 78)
    }

    def hasVoidPointers = {
      nonOffsetParams.exists(p => remap(p.pType) == "A[T]") || getReturnType == "A[T]"
    }

    def hasArrayTypes = {
      extractArrayParams.nonEmpty || typeMappings(returnType).typeArguments.nonEmpty
    }

    def typeParams = {
      if (hasArrayTypes) {
        if (hasVoidPointers) "[A[_], T:Typ]" else "[A[_]]"
      } else {
        ""
      }
    }

    def abstractContainer = {
      if (hasArrayTypes) {
        "(implicit val cont: Container[A])"
      } else {
        ""
      }
    }

    def genMirror(varName: String) = {
      if (extractArrayParams.nonEmpty) {
        s"iDef.cont.apply($varName, f)"
      } else {
        s"f($varName)"
      }
    }

    def optionallyAddImplContMirror = {
      if (hasArrayTypes) {
        if (hasVoidPointers) "(iDef.voidType, iDef.cont)" else "(iDef.cont)"
      } else {
        ""
      }
    }

    def addImplCont() = if (hasVoidPointers) "(typ[T], cont)" else "(cont)"

    def addSuperClass() = {
      if (hasVoidPointers)
        s"VoidPointerIntrinsicsDef[T, $getReturnType]"
      else
        s"IntrinsicsDef[$getReturnType]"
    }
  }

  def isArrayParam(p: Parameter) = {
    val tpe = typeMappings(p.pType)
    tpe.typeArguments.nonEmpty
  }

  def santizeParamName(s: String) = s match {
    case "RoundKey" => "roundKey"
    case "type" => "tpe"
    case "val" => "value"
    case _ => s
  }

  def manifestSimple[T](tp: Typ[T]): String = {
    val name = tp match {
      case _ if tp <:< typ[Unit]    => "Unit"
      case _ if tp <:< typ[Double]  => "Double"
      case _ if tp <:< typ[Float]   => "Float"
      case _ if tp <:< typ[Char]    => "Char"
      case _ if tp <:< typ[Boolean] => "Boolean"
      case _ if tp <:< typ[Long]    => "Long"
      case _ if tp <:< typ[Int]     => "Int"
      case _ if tp <:< typ[Short]   => "Short"
      case _ if tp <:< typ[Byte]    => "Byte"
      case _ if tp.runtimeClass.getSimpleName == "Object" => "Any"
      case _ => tp.runtimeClass.getSimpleName
    }
    tp.typeArguments.isEmpty match {
      case true => name
      case _ =>
        val simpleType = manifestSimple(tp.typeArguments.head)
        "A[" + (if (simpleType == "Any") "T" else simpleType) + "]"
    }
  }

  def remap(tpe: String) = {
    val m = typeMappings(tpe)
    manifestSimple(m)
  }


  val typeMappings = Map (

    /* ============= Enums ============= */

    "_MM_BROADCAST32_ENUM"     -> typ[Int],
    "_MM_BROADCAST64_ENUM"     -> typ[Int],
    "_MM_DOWNCONV_EPI32_ENUM"  -> typ[Int],
    "_MM_DOWNCONV_EPI64_ENUM"  -> typ[Int],
    "_MM_DOWNCONV_PD_ENUM"     -> typ[Int],
    "_MM_DOWNCONV_PS_ENUM"     -> typ[Int],
    "_MM_EXP_ADJ_ENUM"         -> typ[Int],
    "_MM_MANTISSA_NORM_ENUM"   -> typ[Int],
    "_MM_MANTISSA_SIGN_ENUM"   -> typ[Int],
    "_MM_PERM_ENUM"            -> typ[Int],
    "_MM_SWIZZLE_ENUM"         -> typ[Int],
    "_MM_UPCONV_EPI32_ENUM"    -> typ[Int],
    "_MM_UPCONV_EPI64_ENUM"    -> typ[Int],
    "_MM_UPCONV_PD_ENUM"       -> typ[Int],
    "_MM_UPCONV_PS_ENUM"       -> typ[Int],
    "const _MM_UPCONV_PS_ENUM" -> typ[Int],
    "const _MM_CMPINT_ENUM"    -> typ[Int],


    /* ============= Intrinsics ============= */

    "__m64"           -> typ[__m64],
    "__m64*"          -> typ[Array[__m64]],
    "__m64 const*"    -> typ[Array[__m64]],

    "__m128"          -> typ[__m128],
    "__m128 *"        -> typ[Array[__m128]],
    "__m128 const *"  -> typ[Array[__m128]],

    "__m128d"         -> typ[__m128d],
    "__m128d *"       -> typ[Array[__m128d]],
    "__m128d const *" -> typ[Array[__m128d]],

    "__m128i"         -> typ[__m128i],
    "__m128i*"        -> typ[Array[__m128i]],
    "__m128i *"       -> typ[Array[__m128i]],
    "const __m128i*"  -> typ[Array[__m128i]],
    "__m128i const*"  -> typ[Array[__m128i]],

    "__m256"          -> typ[__m256],
    "__m256 *"        -> typ[Array[__m256]],

    "__m256d"         -> typ[__m256d],
    "__m256d *"       -> typ[Array[__m256d]],

    "__m256i"         -> typ[__m256i],
    "__m256i *"       -> typ[Array[__m256i]],
    "__m256i const *" -> typ[Array[__m256i]],
    "__m256i const*"  -> typ[Array[__m256i]],

    "__m512"          -> typ[__m512],
    "__m512 *"        -> typ[Array[__m512]],
    "__m512d"         -> typ[__m512d],
    "__m512d *"       -> typ[Array[__m512d]],
    "__m512i"         -> typ[__m512i],

    "__mmask8"        -> typ[Int],
    "__mmask16"       -> typ[Int],
    "__mmask16 *"     -> typ[Array[Int]],
    "__mmask32"       -> typ[Int],
    "__mmask64"       -> typ[Long],

    /* ============= Char / Byte ============= */

    "unsigned char"      -> typ[UByte],

    "char"               -> typ[Byte],
    "__int8"             -> typ[Byte],
    "char const*"        -> typ[Array[Byte]],
    "char*"              -> typ[Array[Byte]],

    /* =============== Short ================ */

    "unsigned short"     -> typ[UShort],
    "unsigned short*"    -> typ[Array[UShort]],
    "unsigned short *"   -> typ[Array[UShort]],

    "short"              -> typ[Short],
    "__int16"            -> typ[Short],

    /* =============== Integer ================ */

    "unsigned"           -> typ[UInt],
    "unsigned int"       -> typ[UInt],
    "unsigned __int32"   -> typ[UInt],
    "const unsigned int" -> typ[UInt],
    "unsigned int*"      -> typ[Array[UInt]],
    "unsigned int *"     -> typ[Array[UInt]],
    "unsigned __int32*"  -> typ[Array[UInt]],

    "int"                -> typ[Int],
    "size_t"             -> typ[Int],
    "__int32"            -> typ[Int],
    "const int"          -> typ[Int],
    "int*"               -> typ[Array[Int]],
    "__int32*"           -> typ[Array[Int]],
    "int const*"         -> typ[Array[Int]],

    /* ================ Long ================== */

    "unsigned long"      -> typ[ULong],
    "unsigned __int64"   -> typ[ULong],
    "unsigned __int64*"  -> typ[Array[ULong]],
    "unsigned __int64 *" -> typ[Array[ULong]],

    "__int64"            -> typ[Long],
    "long long"          -> typ[Long],
    "__int64*"           -> typ[Array[Long]],
    "__int64 const*"     -> typ[Array[Long]],

    /* ================ Float ================== */

    "float"              -> typ[Float],
    "float*"             -> typ[Array[Float]],
    "float *"            -> typ[Array[Float]],
    "float const *"      -> typ[Array[Float]],
    "float const*"       -> typ[Array[Float]],
    "const float*"       -> typ[Array[Float]],

    /* ================ Double ================= */

    "double"             -> typ[Double],
    "double*"            -> typ[Array[Double]],
    "double *"           -> typ[Array[Double]],
    "double const*"      -> typ[Array[Double]],
    "double const *"     -> typ[Array[Double]],
    "const double*"      -> typ[Array[Double]],


    /* ================ Void ================= */

    "void"               -> typ[Unit],
    "void*"              -> typ[Array[Any]],
    "void *"             -> typ[Array[Any]],
    "void const*"        -> typ[Array[Any]],
    "void const *"       -> typ[Array[Any]],
    "const void *"       -> typ[Array[Any]],
    "const void **"      -> typ[Array[Array[Any]]]
  )


  def indent(s: String, ind: String) = {
    s.trim.lines.map(l => ind + l).mkString("\n")
  }


  def generateISA(isa: String, intrinsics: List[Intrinsic], out: PrintStream) = {

    val statsOutputFile = new File(rootPath + "/stats/" + isa + ".txt")
    statsOutputFile.createNewFile()
    val statsOutput = new PrintStream(new FileOutputStream(statsOutputFile), false)
    statsOutput.println(s"$isa statistics:\n\n")

    out.println(getLogo)

    out.println("trait " + isa + " extends IntrinsicsBase {")

    var numberOfPointerArguments = 0
    var pointerArgumentsNames: List[String] = List()

    // Generate code for LMS case classes
    intrinsics foreach { in => {
      if (in.extractArrayParams.size > 1) {
        statsOutput.println(s"Intrinsic ${in.name} has ${in.extractArrayParams.size} pointer arguments")
      }
      if (in.getReturnType == "A[T]") {
        statsOutput.println(s"Intrinsic ${in.name} has void return type")
      }

      val perfs = in.performance.keys.map({ arch =>
        val perf = in.performance(arch)
        arch.toString + " -> Performance(" + perf.latency + ", " + perf.throughput + ")"
      }).mkString(", \n")
      val performanceMap = in.performance.size match {
        case 0 => "Map.empty[MicroArchType, Performance]"
        case _ => "Map (\n" + indent(perfs, "      ") + "\n    )"
      }

      out.println("  /**")
      out.println(indent(in.prettyDescription, "   * "))
      out.println(indent(in.getParamsAsStrings, "   * "))
      out.println("   */")

      out.println(
        s"""  case class ${in.getDefName}${in.typeParams}(${in.getLMSParams})${in.abstractContainer} extends ${in.addSuperClass()} {
            |    val category = List(${ in.category.map(c => "IntrinsicsCategory." + c.toString).mkString(", ") })
            |    val intrinsicType = List(${ in.intrinsicType.map(c => "IntrinsicsType." + c.toString).mkString(", ") })
            |    val performance = $performanceMap
            |    val header = "${in.header}"
            |  }
      """.stripMargin)

      out.println()

    }}

    // Generate code for LMS methods
    intrinsics foreach { in =>
      in.getReturnType match {
        case _ if in.category.contains(IntrinsicsCategory.Load) =>
          out.println(
            s"""  def ${in.name}${in.typeParams}(${in.getLMSParams})(implicit cont: Container[A]): Exp[${in.getReturnType}] = {
                |    cont.read(${in.extractArrayParams.map(_.varName).mkString(", ")})(${in.getDefName}(${in.getParams})${in.addImplCont()})
                |  }
            """.stripMargin)
        case _ if in.extractArrayParams.nonEmpty =>
          numberOfPointerArguments = numberOfPointerArguments + 1
          pointerArgumentsNames = pointerArgumentsNames ::: List(in.name)

          val arrays = in.extractArrayParams
          out.println(
            s"""  def ${in.name}${in.typeParams}(${in.getLMSParams})(implicit cont: Container[A]): Exp[${in.getReturnType}] = {
                |    cont.write(${arrays.map(_.varName).mkString(", ")})(${in.getDefName}(${in.getParams})${in.addImplCont()})
                |  }
            """.stripMargin)
        case "Unit" =>
          out.println(
            s"""  def ${in.name}${in.typeParams}(${in.getLMSParams}): Exp[${in.getReturnType}] = {
                |    reflectEffect(${in.getDefName}(${in.getParams}))
                |  }
            """.stripMargin)
        case _ =>
          out.println(
            s"""  def ${in.name}${in.typeParams}(${in.getLMSParams}): Exp[${in.getReturnType}] = {
                |    ${in.getDefName}(${in.getParams})
                |  }
            """.stripMargin)
      }
    }

    statsOutput.println(s"Number of $isa intrinsics: ${intrinsics.size}")
    statsOutput.println(s"Number of intrinsics with pointer arguments: $numberOfPointerArguments")
    pointerArgumentsNames foreach statsOutput.println

    // Generate code for mirroring
    out.println("  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {")
    intrinsics foreach { in =>
      out.println(
        s"""    case ${in.mirroringPrefix}${in.getDefName} (${in.getParams}) =>
            |      ${in.name}(${in.allParams.map(p => in.genMirror(p.varName)).mkString(", ")})${in.optionallyAddImplContMirror}""".stripMargin)
    }
    out.println()
    intrinsics foreach { in =>
      out.println(
        s"""    case Reflect(${in.mirroringPrefix}${in.getDefName} (${in.getParams}), u, es) =>
            |      reflectMirrored(Reflect(${in.getDefName} (${in.allParams.map(p => in.genMirror(p.varName)).mkString(", ")})${in.optionallyAddImplContMirror}, mapOver(f,u), f(es)))(mtype(typ[A]), pos)""".stripMargin)
    }

    out.println("  }).asInstanceOf[Exp[A]] // why??")
    out.println("}")
    out.println()

    // Generate trait for code generation
    out.println(
      s"""trait CGen$isa extends CGenIntrinsics {
          |
         |  val IR: $isa
          |  import IR._
          |
         |  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       """.stripMargin)

    def paramPlusOffset(parameter: Parameter) = {
      val basis = "${quote(" + parameter.varName + ")"
      if (isArrayParam(parameter))
        basis + " + (if(" + parameter.varName + "Offset == Const(0)) \"\" else \" + \" + quote(" + parameter.varName + "Offset))}"
      else
        basis + "}"
    }

    intrinsics foreach { in =>
      out.println(s"    case ${in.getDefName}(${in.getParams}) =>")
      if (in.getReturnType == "Unit")
        out.println("      stream.println(%s)".format(s"""s\"${in.name}(${in.nonOffsetParams.map(paramPlusOffset).mkString(", ")});\""""))
      else
        out.println("      emitValDef(sym, %s)".format(s"""s\"${in.name}(${in.nonOffsetParams.map(paramPlusOffset).mkString(", ")})\""""))

    }

    out.println("    case _ => super.emitNode(sym, rhs)")
    out.println("  }")
    out.println("}")
  }

  def getAttribute(node: Node, attr: String) = {
    val value = node.attribute(attr) match {
      case Some(x) => x.toString()
      case None =>
        println(node)
        throw new RuntimeException(s"Can not find attr $attr")
    }
    if (value.trim().equals("")) {
      println(node)
      throw new RuntimeException(s"attr $attr is empty")
    } else {
      value
    }
  }

  def parseIntrinsics(nodes: List[Node]) = {

    nodes map { node =>
      val name = getAttribute(node, "name")
      val techRaw = getAttribute(node, "tech")
      val returnType = name match {
        case "_MM_TRANSPOSE4_PS" => "void"
        case _ => getAttribute(node, "rettype")
      }
      val CPUID           = (node \ "CPUID").map(_.text).toList
      val intrinsicType   = (node \ "type").map(t => strToIntrisicsType(t.text)).toList
      val category        = (node \ "category").map(c => strToIntrinsicsCategory(c.text)).toList
      val descriptionList = (node \ "description").map(_.text).toList
      val operation       = (node \ "operation").map(_.text).toList
      val headerList      = (node \ "header").map(_.text).toList

      val primitiveParams = (node \ "parameter").toList flatMap { param =>
        val pType   = getAttribute(param, "type")
        pType match {
          case "void" => None
          case _ =>
            val varName = santizeParamName(getAttribute(param, "varname"))
            Some(Parameter(varName, pType))
        }
      }
      val arrayParams = primitiveParams.filter(isArrayParam).map(p => Parameter(p.varName + "Offset", "int"))

      val performance = (node \ "perfdata").toList.flatMap({ perf =>
        val arch = strToMicroArchType(getAttribute(perf, "arch"))
        val lat = perf.attribute("lat") match {
          case Some(latNode) => latNode.text.trim match {
            case "" => None
            case "Varies" => None
            case txt => Some(java.lang.Double.parseDouble(txt))
          }
          case None => None
        }

        val tpt = perf.attribute("tpt") match {
          case Some(tptNode) => tptNode.text.trim match {
            case "" => None
            case "Varies" => None
            case txt => Some(java.lang.Double.parseDouble(txt))
          }
          case None => None
        }
        (lat, tpt) match {
          case (None, None) => None
          case _ => Some(arch -> Performance(lat, tpt))
        }
      }).toMap

      // Cleanup
      val tech = techRaw.replace(".", "").replace("-", "").replace("/", "_")
      val description = descriptionList.head
      val header = headerList.head

      Intrinsic (node, name, tech, CPUID, returnType, intrinsicType, category,
        performance, primitiveParams, arrayParams, description, operation, header
      )
    }

  }

  def createISA(isa: String, allIntrinsics: List[Intrinsic]) = {
    val intrinsics = allIntrinsics.filter(in => in.tech.equals(isa)).filterNot(in => temporaryDisabledIntrinsics.contains(in.name))
    if (intrinsics.size < nrIntrinsicsPerFile) {
      createSimpleISA(isa, intrinsics)
    } else {
      createComplexISA(isa, intrinsics)
    }
  }

  def createSimpleISA(name: String, intrinsics: List[Intrinsic]) = {
    val path = srcPath + name + ".scala"
    val output = new PrintStream(new FileOutputStream(path))
    generateISA(name, intrinsics, output)
  }

  def createComplexISA(name: String, intrinsics: List[Intrinsic]) = {
    val subFiles = intrinsics.grouped(nrIntrinsicsPerFile).toList.zipWithIndex
    subFiles foreach {case (subIntrinsics, index) => createSimpleISA(name + index, subIntrinsics)}
    val path = srcPath + name + ".scala"
    val out = new PrintStream(new FileOutputStream(path))
    out.println("package ch.ethz.acl.intrinsics")
    out.println()
    out.print("trait " + name + " extends IntrinsicsBase")
    subFiles foreach {case (_, index) => out.print(" with " + name + index)}
    if ((name == "AVX512" || name == "KNC") && new java.io.File(srcPath + "AVX512_KNC.scala").exists) {
      out.print(" with AVX512_KNC")
    }
    out.println()
  }

  def generate (): Unit = {
    val xml: Node = XML.loadFile(xmlFile)
    val nodes = (xml \\ "intrinsic").toList

    val intrinsics = parseIntrinsics(nodes)
    //    generateISAs(ch.ethz.acl.intrinsics)

    //    createISA("MMX", intrinsics)

        createISA("SSE", intrinsics)
    //    createISA("SSE2", intrinsics)
    //    createISA("SSE3", intrinsics)
    //    createISA("SSSE3", intrinsics)
    //    createISA("SSE41", intrinsics)
    //    createISA("SSE42", intrinsics)
    //
    //    createISA("AVX", intrinsics)
    //    createISA("AVX2", intrinsics)
    //
    //    createISA("AVX512_KNC", intrinsics)
    //    createISA("AVX512", intrinsics)
    //    createISA("FMA", intrinsics)
    //    createISA("KNC", intrinsics)
    //    createISA("SVML", intrinsics)
    //
    //    createISA("Other", intrinsics)
  }

  def strToMicroArchType(s: String): MicroArchType = s match {
    case "Haswell"      => Haswell
    case "Ivy Bridge"   => IvyBridge
    case "Nehalem"      => Nehalem
    case "Sandy Bridge" => SandyBridge
    case "Westmere"     => Westmere
  }

  def strToIntrisicsType(s: String): IntrinsicsType.IntrinsicsType = s match {
    case "Floating Point" => IntrinsicsType.FloatingPoint
    case "Integer" => IntrinsicsType.Integer
    case "Mask" => IntrinsicsType.Mask
  }

  def strToIntrinsicsCategory(s: String): IntrinsicsCategory.IntrinsicsCategory = {
    import IntrinsicsCategory._
    s match {
      case "Application-Targeted" => ApplicationTargeted
      case "Arithmetic" => Arithmetic
      case "Bit Manipulation" => BitManipulation
      case "Cast" => Cast
      case "Compare" => Compare
      case "Convert" => Convert
      case "Cryptography" => Cryptography
      case "Elementary Math Functions" => ElementaryMathFunctions
      case "General Support" => GeneralSupport
      case "Load" => Load
      case "Logical" => Logical
      case "Mask" => Mask
      case "Miscellaneous" => Miscellaneous
      case "Move" => Move
      case "OS-Targeted" => OSTargeted
      case "Probability/Statistics" => ProbabilityStatistics
      case "Random" => Random
      case "Set" => IntrinsicsSet
      case "Shift" => Shift
      case "Special Math Functions" => SpecialMathFunctions
      case "Store" => Store
      case "String Compare" => StringCompare
      case "Swizzle" => Swizzle
      case "Trigonometry" => Trigonometry
      case _ => throw new RuntimeException("Intrinsics category unknown")
    }
  }

  def getLogo = {
    """package ch.ethz.acl.intrinsics
      |
      |import ch.ethz.acl.intrinsics.MicroArchType._
      |import passera.unsigned.{UByte, UInt, ULong, UShort}
      |
      |import scala.reflect.SourceContext
      |import scala.language.higherKinds
      |
    """.stripMargin
  }

}
