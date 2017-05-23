package ch.ethz.acl.intrinsics

import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.lms.common._
import scala.lms.internal.CCodegen

trait TestIr extends ArrayOpsExp with SeqOpsExp with RangeOpsExp with LiftNumeric with PrimitiveOpsExp with CastingOpsExp {
  implicit def uIntTyp    : Typ[UInt] = manifestTyp
  implicit def uByteTyp   : Typ[UByte] = manifestTyp
  implicit def uShortTyp  : Typ[UShort] = manifestTyp
  implicit def uLongTyp   : Typ[ULong] = manifestTyp
  implicit def anyTyp     : Typ[Any] = manifestTyp

  override def isPrimitiveType[T](m: Typ[T]): Boolean = m match {
    case _ if m <:< manifestTyp[UByte]  => true
    case _ if m <:< manifestTyp[UShort] => true
    case _ if m <:< manifestTyp[UInt]   => true
    case _ if m <:< manifestTyp[ULong]  => true
    case _ => super.isPrimitiveType(m)
  }
}

trait BaseTestCgen extends CCodegen with CGenArrayOps with CGenPrimitiveOps with CGenSeqOps with CGenRangeOps with CGenCastingOps {
  val IR: TestIr
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
    rhs match {
      case ArrayApply(x,n) => emitValDef(sym, src"$x[$n]")
      case ArrayUpdate(x,n,y) => stream.println(src"$x[$n] = $y;")
      case ArrayNew(n) => emitValDef(sym, src"(${remap(sym.tp)}) malloc($n * sizeof(${remap(sym.tp)}))")
      case _ => super.emitNode(sym, rhs)
    }
  }

  override def remap[A](m: Typ[A]) : String = {
    if (m.runtimeClass == classOf[Variable[Any]] ) {
      remap(m.typeArguments.head)
    } else if (m.runtimeClass.isArray) {
      remap(m.typeArguments.head) + "*"
    } else {
      m match {
        case _ if m <:< ManifestTyp(manifest[UByte])  => "uint8_t"
        case _ if m <:< ManifestTyp(manifest[UShort]) => "uint16_t"
        case _ if m <:< ManifestTyp(manifest[UInt])   => "uint32_t"
        case _ if m <:< ManifestTyp(manifest[ULong])  => "uint64_t"
        case _ => super.remap(m)
      }
    }
  }

  override def remapWithRef[A](m: Typ[A]): String = remap(m) + " "

  override def isPrimitiveType(tpe: String) : Boolean = {
    tpe match {
      case "double"   | "float"    | "char"     | "bool"    => true
      case "int64_t"  | "int32_t"  | "int16_t"  | "int8_t"  => true
      case "uint64_t" | "uint32_t" | "uint16_t" | "uint8_t" => true
      case _ => super.isPrimitiveType(tpe)
    }
  }
}
