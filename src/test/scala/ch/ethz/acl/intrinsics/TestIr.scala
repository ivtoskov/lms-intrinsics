package ch.ethz.acl.intrinsics

import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.lms.common._
import scala.lms.internal.CCodegen

trait TestIr extends ArrayOpsExp with SeqOpsExp with RangeOpsExp with LiftNumeric with PrimitiveOpsExp {
  implicit def uIntTyp    : Typ[UInt] = manifestTyp
  implicit def uByteTyp   : Typ[UByte] = manifestTyp
  implicit def uShortTyp  : Typ[UShort] = manifestTyp
  implicit def uLongTyp   : Typ[ULong] = manifestTyp
  implicit def anyTyp     : Typ[Any] = manifestTyp
}

trait BaseTestCgen extends CCodegen with CLikeGenArrayOps with CLikeGenPrimitiveOps with CLikeGenSeqOps with CGenRangeOps {
  val IR: TestIr
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
    rhs match {
      case ArrayUpdate(x,n,y) => stream.println(src"$x[$n] = $y;")
      case _ => super.emitNode(sym, rhs)
    }
  }

  override def remap[A](m: Typ[A]) : String = {
    if (m.runtimeClass == classOf[Variable[Any]] ) {
      remap(m.typeArguments.head)
    } else if (m.runtimeClass.isArray) {
      remap(m.typeArguments.head) + "*"
    } else {
      super.remap(m)
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
