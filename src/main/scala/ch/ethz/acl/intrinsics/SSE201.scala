package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait SSE201 extends IntrinsicsBase {
  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for less-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMILE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMIGT_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for greater-than-or-equal, and return the boolean result (0 or 1). This
   * instruction will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMIGE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" for not-equal, and return the boolean result (0 or 1). This instruction
   * will not signal an exception for QNaNs.
   * a: __m128d, b: __m128d
   */
  case class MM_UCOMINEQ_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_PS(a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_PD(a: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPI32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_SI64X(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128, b: __m128d
   */
  case class MM_CVTSD_SS(a: Exp[__m128], b: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m128d
   */
  case class MM_CVTSD_F64(a: Exp[__m128d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128d, b: __m128
   */
  case class MM_CVTSS_SD(a: Exp[__m128d], b: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPI32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_SI64X(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_EPI32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPI32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_PI32(a: Exp[__m128d]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_PI32(a: Exp[__m128d]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Copy double-precision (64-bit) floating-point element "a" to the lower element
   * of "dst", and zero the upper element.
   * a: double
   */
  case class MM_SET_SD(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM_SET1_PD(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM_SET_PD1(a: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values.
   * e1: double, e0: double
   */
  case class MM_SET_PD(e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e1: double, e0: double
   */
  case class MM_SETR_PD(e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128d with all elements set to zero.

   */
  case class MM_SETZERO_PD() extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into both
   * elements of "dst".
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD1_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into both
   * elements of "dst".
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_PD1[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 2 double-precision (64-bit) floating-point elements from memory into
   * "dst" in reverse order. mem_addr must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADR_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from memory into "dst".
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower of "dst", and zero the upper element. "mem_addr" does not need to be
   * aligned on any particular boundary.
   * mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOAD_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * upper element of "dst", and copy the lower element from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128d, mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADH_PD[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst", and copy the upper element from "a" to "dst".
   * "mem_addr" does not need to be aligned on any particular boundary.
   * a: __m128d, mem_addr: double const*, mem_addrOffset: int
   */
  case class MM_LOADL_PD[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint.
   * 	"mem_addr"
   * must be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STREAM_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory. "mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * 2 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE1_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * 2 contiguous elements in memory. "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_PD1[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORE_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 128-bits (composed of 2 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory.
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREU_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store 2 double-precision (64-bit) floating-point elements from "a" into memory
   * in reverse order.
   * 	"mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STORER_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the upper double-precision (64-bit) floating-point element from "a" into
   * memory.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREH_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory.
   * mem_addr: double*, a: __m128d, mem_addrOffset: int
   */
  case class MM_STOREL_PD[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_UNPACKHI_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_UNPACKLO_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Set each bit of mask "dst" based on the most significant bit of the
   * corresponding packed double-precision (64-bit) floating-point element in "a".
   * a: __m128d
   */
  case class MM_MOVEMASK_PD(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst".
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_SHUFFLE_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Move the lower double-precision (64-bit) floating-point element from "b" to
   * the lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_MOVE_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m128. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM_CASTPD_PS(a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m128i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM_CASTPD_SI128(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m128d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM_CASTPS_PD(a: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m128i. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM_CASTPS_SI128(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m128d. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM_CASTSI128_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m128. This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM_CASTSI128_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "emmintrin.h"
  }
      

  /**
   * Return vector of type __m128d with undefined elements.

   */
  case class MM_UNDEFINED_PD() extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m128i with undefined elements.

   */
  case class MM_UNDEFINED_SI128() extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTSD_F64(a: Exp[__m256d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m256i
   */
  case class MM256_CVTSI256_SI32(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the lower double-precision (64-bit) floating-point element of "a" to
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTSD_F64(a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy the lower 32-bit integer in "a" to "dst".
   * a: __m512i
   */
  case class MM512_CVTSI512_SI32(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_ucomile_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMILE_SD(a, b)
  }
            
  def _mm_ucomigt_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMIGT_SD(a, b)
  }
            
  def _mm_ucomige_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMIGE_SD(a, b)
  }
            
  def _mm_ucomineq_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[Int] = {
    MM_UCOMINEQ_SD(a, b)
  }
            
  def _mm_cvtpd_ps(a: Exp[__m128d]): Exp[__m128] = {
    MM_CVTPD_PS(a)
  }
            
  def _mm_cvtps_pd(a: Exp[__m128]): Exp[__m128d] = {
    MM_CVTPS_PD(a)
  }
            
  def _mm_cvtpd_epi32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPI32(a)
  }
            
  def _mm_cvtsd_si32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTSD_SI32(a)
  }
            
  def _mm_cvtsd_si64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_SI64(a)
  }
            
  def _mm_cvtsd_si64x(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_SI64X(a)
  }
            
  def _mm_cvtsd_ss(a: Exp[__m128], b: Exp[__m128d]): Exp[__m128] = {
    MM_CVTSD_SS(a, b)
  }
            
  def _mm_cvtsd_f64(a: Exp[__m128d]): Exp[Double] = {
    MM_CVTSD_F64(a)
  }
            
  def _mm_cvtss_sd(a: Exp[__m128d], b: Exp[__m128]): Exp[__m128d] = {
    MM_CVTSS_SD(a, b)
  }
            
  def _mm_cvttpd_epi32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPI32(a)
  }
            
  def _mm_cvttsd_si32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTTSD_SI32(a)
  }
            
  def _mm_cvttsd_si64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_SI64(a)
  }
            
  def _mm_cvttsd_si64x(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_SI64X(a)
  }
            
  def _mm_cvtps_epi32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPI32(a)
  }
            
  def _mm_cvttps_epi32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPI32(a)
  }
            
  def _mm_cvtpd_pi32(a: Exp[__m128d]): Exp[__m64] = {
    MM_CVTPD_PI32(a)
  }
            
  def _mm_cvttpd_pi32(a: Exp[__m128d]): Exp[__m64] = {
    MM_CVTTPD_PI32(a)
  }
            
  def _mm_set_sd(a: Exp[Double]): Exp[__m128d] = {
    MM_SET_SD(a)
  }
            
  def _mm_set1_pd(a: Exp[Double]): Exp[__m128d] = {
    MM_SET1_PD(a)
  }
            
  def _mm_set_pd1(a: Exp[Double]): Exp[__m128d] = {
    MM_SET_PD1(a)
  }
            
  def _mm_set_pd(e1: Exp[Double], e0: Exp[Double]): Exp[__m128d] = {
    MM_SET_PD(e1, e0)
  }
            
  def _mm_setr_pd(e1: Exp[Double], e0: Exp[Double]): Exp[__m128d] = {
    MM_SETR_PD(e1, e0)
  }
            
  def _mm_setzero_pd(): Exp[__m128d] = {
    MM_SETZERO_PD()
  }
            
  def _mm_load_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_load1_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD1_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_load_pd1[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_PD1(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadr_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADR_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADU_PD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_load_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOAD_SD(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadh_pd[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADH_PD(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_loadl_pd[A[_], U:Integral](a: Exp[__m128d], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_LOADL_PD(a, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_stream_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STREAM_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_store_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_SD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_store1_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE1_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_store_pd1[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PD1(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_store_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORE_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_storeu_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREU_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_storer_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STORER_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_storeh_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREH_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_storel_pd[A[_], U:Integral](mem_addr: Exp[A[Double]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_STOREL_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_unpackhi_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_UNPACKHI_PD(a, b)
  }
            
  def _mm_unpacklo_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_UNPACKLO_PD(a, b)
  }
            
  def _mm_movemask_pd(a: Exp[__m128d]): Exp[Int] = {
    MM_MOVEMASK_PD(a)
  }
            
  def _mm_shuffle_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_SHUFFLE_PD(a, b, imm8)
  }
            
  def _mm_move_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MOVE_SD(a, b)
  }
            
  def _mm_castpd_ps(a: Exp[__m128d]): Exp[__m128] = {
    MM_CASTPD_PS(a)
  }
            
  def _mm_castpd_si128(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CASTPD_SI128(a)
  }
            
  def _mm_castps_pd(a: Exp[__m128]): Exp[__m128d] = {
    MM_CASTPS_PD(a)
  }
            
  def _mm_castps_si128(a: Exp[__m128]): Exp[__m128i] = {
    MM_CASTPS_SI128(a)
  }
            
  def _mm_castsi128_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CASTSI128_PD(a)
  }
            
  def _mm_castsi128_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CASTSI128_PS(a)
  }
            
  def _mm_undefined_pd(): Exp[__m128d] = {
    MM_UNDEFINED_PD()
  }
            
  def _mm_undefined_si128(): Exp[__m128i] = {
    MM_UNDEFINED_SI128()
  }
            
  def _mm256_cvtsd_f64(a: Exp[__m256d]): Exp[Double] = {
    MM256_CVTSD_F64(a)
  }
            
  def _mm256_cvtsi256_si32(a: Exp[__m256i]): Exp[Int] = {
    MM256_CVTSI256_SI32(a)
  }
            
  def _mm512_cvtsd_f64(a: Exp[__m512d]): Exp[Double] = {
    MM512_CVTSD_F64(a)
  }
            
  def _mm512_cvtsi512_si32(a: Exp[__m512i]): Exp[Int] = {
    MM512_CVTSI512_SI32(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_UCOMILE_SD (a, b) =>
      _mm_ucomile_sd(f(a), f(b))
    case MM_UCOMIGT_SD (a, b) =>
      _mm_ucomigt_sd(f(a), f(b))
    case MM_UCOMIGE_SD (a, b) =>
      _mm_ucomige_sd(f(a), f(b))
    case MM_UCOMINEQ_SD (a, b) =>
      _mm_ucomineq_sd(f(a), f(b))
    case MM_CVTPD_PS (a) =>
      _mm_cvtpd_ps(f(a))
    case MM_CVTPS_PD (a) =>
      _mm_cvtps_pd(f(a))
    case MM_CVTPD_EPI32 (a) =>
      _mm_cvtpd_epi32(f(a))
    case MM_CVTSD_SI32 (a) =>
      _mm_cvtsd_si32(f(a))
    case MM_CVTSD_SI64 (a) =>
      _mm_cvtsd_si64(f(a))
    case MM_CVTSD_SI64X (a) =>
      _mm_cvtsd_si64x(f(a))
    case MM_CVTSD_SS (a, b) =>
      _mm_cvtsd_ss(f(a), f(b))
    case MM_CVTSD_F64 (a) =>
      _mm_cvtsd_f64(f(a))
    case MM_CVTSS_SD (a, b) =>
      _mm_cvtss_sd(f(a), f(b))
    case MM_CVTTPD_EPI32 (a) =>
      _mm_cvttpd_epi32(f(a))
    case MM_CVTTSD_SI32 (a) =>
      _mm_cvttsd_si32(f(a))
    case MM_CVTTSD_SI64 (a) =>
      _mm_cvttsd_si64(f(a))
    case MM_CVTTSD_SI64X (a) =>
      _mm_cvttsd_si64x(f(a))
    case MM_CVTPS_EPI32 (a) =>
      _mm_cvtps_epi32(f(a))
    case MM_CVTTPS_EPI32 (a) =>
      _mm_cvttps_epi32(f(a))
    case MM_CVTPD_PI32 (a) =>
      _mm_cvtpd_pi32(f(a))
    case MM_CVTTPD_PI32 (a) =>
      _mm_cvttpd_pi32(f(a))
    case MM_SET_SD (a) =>
      _mm_set_sd(f(a))
    case MM_SET1_PD (a) =>
      _mm_set1_pd(f(a))
    case MM_SET_PD1 (a) =>
      _mm_set_pd1(f(a))
    case MM_SET_PD (e1, e0) =>
      _mm_set_pd(f(e1), f(e0))
    case MM_SETR_PD (e1, e0) =>
      _mm_setr_pd(f(e1), f(e0))
    case MM_SETZERO_PD () =>
      _mm_setzero_pd()
    case iDef@MM_LOAD_PD (mem_addr, mem_addrOffset) =>
      _mm_load_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOAD1_PD (mem_addr, mem_addrOffset) =>
      _mm_load1_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOAD_PD1 (mem_addr, mem_addrOffset) =>
      _mm_load_pd1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADR_PD (mem_addr, mem_addrOffset) =>
      _mm_loadr_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADU_PD (mem_addr, mem_addrOffset) =>
      _mm_loadu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOAD_SD (mem_addr, mem_addrOffset) =>
      _mm_load_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADH_PD (a, mem_addr, mem_addrOffset) =>
      _mm_loadh_pd(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_LOADL_PD (a, mem_addr, mem_addrOffset) =>
      _mm_loadl_pd(iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STREAM_PD (mem_addr, a, mem_addrOffset) =>
      _mm_stream_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORE_SD (mem_addr, a, mem_addrOffset) =>
      _mm_store_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORE1_PD (mem_addr, a, mem_addrOffset) =>
      _mm_store1_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORE_PD1 (mem_addr, a, mem_addrOffset) =>
      _mm_store_pd1(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORE_PD (mem_addr, a, mem_addrOffset) =>
      _mm_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STOREU_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STORER_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storer_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STOREH_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storeh_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_STOREL_PD (mem_addr, a, mem_addrOffset) =>
      _mm_storel_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UNPACKHI_PD (a, b) =>
      _mm_unpackhi_pd(f(a), f(b))
    case MM_UNPACKLO_PD (a, b) =>
      _mm_unpacklo_pd(f(a), f(b))
    case MM_MOVEMASK_PD (a) =>
      _mm_movemask_pd(f(a))
    case MM_SHUFFLE_PD (a, b, imm8) =>
      _mm_shuffle_pd(f(a), f(b), f(imm8))
    case MM_MOVE_SD (a, b) =>
      _mm_move_sd(f(a), f(b))
    case MM_CASTPD_PS (a) =>
      _mm_castpd_ps(f(a))
    case MM_CASTPD_SI128 (a) =>
      _mm_castpd_si128(f(a))
    case MM_CASTPS_PD (a) =>
      _mm_castps_pd(f(a))
    case MM_CASTPS_SI128 (a) =>
      _mm_castps_si128(f(a))
    case MM_CASTSI128_PD (a) =>
      _mm_castsi128_pd(f(a))
    case MM_CASTSI128_PS (a) =>
      _mm_castsi128_ps(f(a))
    case MM_UNDEFINED_PD () =>
      _mm_undefined_pd()
    case MM_UNDEFINED_SI128 () =>
      _mm_undefined_si128()
    case MM256_CVTSD_F64 (a) =>
      _mm256_cvtsd_f64(f(a))
    case MM256_CVTSI256_SI32 (a) =>
      _mm256_cvtsi256_si32(f(a))
    case MM512_CVTSD_F64 (a) =>
      _mm512_cvtsd_f64(f(a))
    case MM512_CVTSI512_SI32 (a) =>
      _mm512_cvtsi512_si32(f(a))

    case Reflect(MM_UCOMILE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMILE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGT_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGT_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMIGE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMIGE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UCOMINEQ_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UCOMINEQ_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_SI64X (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_SI64X (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_SD (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_SD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SET1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PD1 (a), u, es) =>
      reflectMirrored(Reflect(MM_SET_PD1 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SET_PD (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SET_PD (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETR_PD (e1, e0), u, es) =>
      reflectMirrored(Reflect(MM_SETR_PD (f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SETZERO_PD (), u, es) =>
      reflectMirrored(Reflect(MM_SETZERO_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD1_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD1_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_PD1 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_PD1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADR_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADR_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADU_PD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOAD_SD (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOAD_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADH_PD (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADH_PD (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_LOADL_PD (a, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_LOADL_PD (iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_SD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE1_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE1_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PD1 (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PD1 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORE_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREU_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STORER_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STORER_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREH_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREH_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STOREL_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STOREL_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKHI_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKHI_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNPACKLO_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UNPACKLO_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEMASK_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEMASK_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVE_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MOVE_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPD_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPD_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTPS_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTPS_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTSI128_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTSI128_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CASTSI128_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CASTSI128_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNDEFINED_PD (), u, es) =>
      reflectMirrored(Reflect(MM_UNDEFINED_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UNDEFINED_SI128 (), u, es) =>
      reflectMirrored(Reflect(MM_UNDEFINED_SI128 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSI256_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSI256_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSD_F64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSD_F64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSI512_SI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSI512_SI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE201 extends CGenIntrinsics {

  val IR: SSE2
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_UCOMILE_SD(a, b) =>
      emitValDef(sym, s"_mm_ucomile_sd(${quote(a)}, ${quote(b)})")
    case MM_UCOMIGT_SD(a, b) =>
      emitValDef(sym, s"_mm_ucomigt_sd(${quote(a)}, ${quote(b)})")
    case MM_UCOMIGE_SD(a, b) =>
      emitValDef(sym, s"_mm_ucomige_sd(${quote(a)}, ${quote(b)})")
    case MM_UCOMINEQ_SD(a, b) =>
      emitValDef(sym, s"_mm_ucomineq_sd(${quote(a)}, ${quote(b)})")
    case MM_CVTPD_PS(a) =>
      emitValDef(sym, s"_mm_cvtpd_ps(${quote(a)})")
    case MM_CVTPS_PD(a) =>
      emitValDef(sym, s"_mm_cvtps_pd(${quote(a)})")
    case MM_CVTPD_EPI32(a) =>
      emitValDef(sym, s"_mm_cvtpd_epi32(${quote(a)})")
    case MM_CVTSD_SI32(a) =>
      emitValDef(sym, s"_mm_cvtsd_si32(${quote(a)})")
    case MM_CVTSD_SI64(a) =>
      emitValDef(sym, s"_mm_cvtsd_si64(${quote(a)})")
    case MM_CVTSD_SI64X(a) =>
      emitValDef(sym, s"_mm_cvtsd_si64x(${quote(a)})")
    case MM_CVTSD_SS(a, b) =>
      emitValDef(sym, s"_mm_cvtsd_ss(${quote(a)}, ${quote(b)})")
    case MM_CVTSD_F64(a) =>
      emitValDef(sym, s"_mm_cvtsd_f64(${quote(a)})")
    case MM_CVTSS_SD(a, b) =>
      emitValDef(sym, s"_mm_cvtss_sd(${quote(a)}, ${quote(b)})")
    case MM_CVTTPD_EPI32(a) =>
      emitValDef(sym, s"_mm_cvttpd_epi32(${quote(a)})")
    case MM_CVTTSD_SI32(a) =>
      emitValDef(sym, s"_mm_cvttsd_si32(${quote(a)})")
    case MM_CVTTSD_SI64(a) =>
      emitValDef(sym, s"_mm_cvttsd_si64(${quote(a)})")
    case MM_CVTTSD_SI64X(a) =>
      emitValDef(sym, s"_mm_cvttsd_si64x(${quote(a)})")
    case MM_CVTPS_EPI32(a) =>
      emitValDef(sym, s"_mm_cvtps_epi32(${quote(a)})")
    case MM_CVTTPS_EPI32(a) =>
      emitValDef(sym, s"_mm_cvttps_epi32(${quote(a)})")
    case MM_CVTPD_PI32(a) =>
      emitValDef(sym, s"_mm_cvtpd_pi32(${quote(a)})")
    case MM_CVTTPD_PI32(a) =>
      emitValDef(sym, s"_mm_cvttpd_pi32(${quote(a)})")
    case MM_SET_SD(a) =>
      emitValDef(sym, s"_mm_set_sd(${quote(a)})")
    case MM_SET1_PD(a) =>
      emitValDef(sym, s"_mm_set1_pd(${quote(a)})")
    case MM_SET_PD1(a) =>
      emitValDef(sym, s"_mm_set_pd1(${quote(a)})")
    case MM_SET_PD(e1, e0) =>
      emitValDef(sym, s"_mm_set_pd(${quote(e1)}, ${quote(e0)})")
    case MM_SETR_PD(e1, e0) =>
      emitValDef(sym, s"_mm_setr_pd(${quote(e1)}, ${quote(e0)})")
    case MM_SETZERO_PD() =>
      emitValDef(sym, s"_mm_setzero_pd()")
    case MM_LOAD_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_load_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOAD1_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_load1_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOAD_PD1(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_load_pd1(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOADR_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_loadr_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOADU_PD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_loadu_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOAD_SD(mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_load_sd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOADH_PD(a, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_loadh_pd(${quote(a)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_LOADL_PD(a, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_loadl_pd(${quote(a)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_STREAM_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_stream_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STORE_SD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_store_sd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STORE1_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_store1_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STORE_PD1(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_store_pd1(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STORE_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_store_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STOREU_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_storeu_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STORER_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_storer_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STOREH_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_storeh_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_STOREL_PD(mem_addr, a, mem_addrOffset) =>
      stream.println(s"_mm_storel_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)});")
    case MM_UNPACKHI_PD(a, b) =>
      emitValDef(sym, s"_mm_unpackhi_pd(${quote(a)}, ${quote(b)})")
    case MM_UNPACKLO_PD(a, b) =>
      emitValDef(sym, s"_mm_unpacklo_pd(${quote(a)}, ${quote(b)})")
    case MM_MOVEMASK_PD(a) =>
      emitValDef(sym, s"_mm_movemask_pd(${quote(a)})")
    case MM_SHUFFLE_PD(a, b, imm8) =>
      emitValDef(sym, s"_mm_shuffle_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MOVE_SD(a, b) =>
      emitValDef(sym, s"_mm_move_sd(${quote(a)}, ${quote(b)})")
    case MM_CASTPD_PS(a) =>
      emitValDef(sym, s"_mm_castpd_ps(${quote(a)})")
    case MM_CASTPD_SI128(a) =>
      emitValDef(sym, s"_mm_castpd_si128(${quote(a)})")
    case MM_CASTPS_PD(a) =>
      emitValDef(sym, s"_mm_castps_pd(${quote(a)})")
    case MM_CASTPS_SI128(a) =>
      emitValDef(sym, s"_mm_castps_si128(${quote(a)})")
    case MM_CASTSI128_PD(a) =>
      emitValDef(sym, s"_mm_castsi128_pd(${quote(a)})")
    case MM_CASTSI128_PS(a) =>
      emitValDef(sym, s"_mm_castsi128_ps(${quote(a)})")
    case MM_UNDEFINED_PD() =>
      emitValDef(sym, s"_mm_undefined_pd()")
    case MM_UNDEFINED_SI128() =>
      emitValDef(sym, s"_mm_undefined_si128()")
    case MM256_CVTSD_F64(a) =>
      emitValDef(sym, s"_mm256_cvtsd_f64(${quote(a)})")
    case MM256_CVTSI256_SI32(a) =>
      emitValDef(sym, s"_mm256_cvtsi256_si32(${quote(a)})")
    case MM512_CVTSD_F64(a) =>
      emitValDef(sym, s"_mm512_cvtsd_f64(${quote(a)})")
    case MM512_CVTSI512_SI32(a) =>
      emitValDef(sym, s"_mm512_cvtsi512_si32(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
