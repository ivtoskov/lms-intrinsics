package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51206 extends IntrinsicsBase {
  /**
   * Cast vector of type __m512 to type __m256. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS512_PS256(a: Exp[__m512]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m512i; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM512_CASTSI128_SI512(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256i to type __m512i; the upper 256 bits of the result
   * are undefined.
   * 	 This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256i
   */
  case class MM512_CASTSI256_SI512(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512i to type __m128i.
   * 	 This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512i
   */
  case class MM512_CASTSI512_SI128(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512i to type __m256i.
   * 	 This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512i
   */
  case class MM512_CASTSI512_SI256(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128d to type __m512d; the upper 384 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM512_ZEXTPD128_PD512(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128 to type __m512; the upper 384 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM512_ZEXTPS128_PS512(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128i to type __m512i; the upper 384 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM512_ZEXTSI128_SI512(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256d to type __m512d; the upper 256 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m256d
   */
  case class MM512_ZEXTPD256_PD512(a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256 to type __m512; the upper 256 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m256
   */
  case class MM512_ZEXTPS256_PS512(a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256i to type __m512i; the upper 256 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m256i
   */
  case class MM512_ZEXTSI256_SI512(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM512_SET1_PD(a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast single-precision (32-bit) floating-point value "a" to all elements
   * of "dst".
   * a: float
   */
  case class MM512_SET1_PS(a: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the repeated 4 element sequence.
   * d: int, c: int, b: int, a: int
   */
  case class MM512_SET4_EPI32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the repeated 4 element sequence.
   * d: __int64, c: __int64, b: __int64, a: __int64
   */
  case class MM512_SET4_EPI64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence.
   * d: double, c: double, b: double, a: double
   */
  case class MM512_SET4_PD(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence.
   * d: float, c: float, b: float, a: float
   */
  case class MM512_SET4_PS(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e63: char, e62: char, e61: char, e60: char, e59: char, e58: char, e57: char, e56: char, e55: char, e54: char, e53: char, e52: char, e51: char, e50: char, e49: char, e48: char, e47: char, e46: char, e45: char, e44: char, e43: char, e42: char, e41: char, e40: char, e39: char, e38: char, e37: char, e36: char, e35: char, e34: char, e33: char, e32: char, e31: char, e30: char, e29: char, e28: char, e27: char, e26: char, e25: char, e24: char, e23: char, e22: char, e21: char, e20: char, e19: char, e18: char, e17: char, e16: char, e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM512_SET_EPI8(e63: Exp[Byte], e62: Exp[Byte], e61: Exp[Byte], e60: Exp[Byte], e59: Exp[Byte], e58: Exp[Byte], e57: Exp[Byte], e56: Exp[Byte], e55: Exp[Byte], e54: Exp[Byte], e53: Exp[Byte], e52: Exp[Byte], e51: Exp[Byte], e50: Exp[Byte], e49: Exp[Byte], e48: Exp[Byte], e47: Exp[Byte], e46: Exp[Byte], e45: Exp[Byte], e44: Exp[Byte], e43: Exp[Byte], e42: Exp[Byte], e41: Exp[Byte], e40: Exp[Byte], e39: Exp[Byte], e38: Exp[Byte], e37: Exp[Byte], e36: Exp[Byte], e35: Exp[Byte], e34: Exp[Byte], e33: Exp[Byte], e32: Exp[Byte], e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values in reverse order.
   * e31: short, e30: short, e29: short, e28: short, e27: short, e26: short, e25: short, e24: short, e23: short, e22: short, e21: short, e20: short, e19: short, e18: short, e17: short, e16: short, e15: short, e14: short, e13: short, e12: short, e11: short, e10: short, e9: short, e8: short, e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM512_SET_EPI16(e31: Exp[Short], e30: Exp[Short], e29: Exp[Short], e28: Exp[Short], e27: Exp[Short], e26: Exp[Short], e25: Exp[Short], e24: Exp[Short], e23: Exp[Short], e22: Exp[Short], e21: Exp[Short], e20: Exp[Short], e19: Exp[Short], e18: Exp[Short], e17: Exp[Short], e16: Exp[Short], e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values.
   * e15: int, e14: int, e13: int, e12: int, e11: int, e10: int, e9: int, e8: int, e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM512_SET_EPI32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values.
   * e7: __int64, e6: __int64, e5: __int64, e4: __int64, e3: __int64, e2: __int64, e1: __int64, e0: __int64
   */
  case class MM512_SET_EPI64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values.
   * e7: double, e6: double, e5: double, e4: double, e3: double, e2: double, e1: double, e0: double
   */
  case class MM512_SET_PD(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values.
   * e15: float, e14: float, e13: float, e12: float, e11: float, e10: float, e9: float, e8: float, e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM512_SET_PS(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the repeated 4 element sequence in
   * reverse order.
   * d: int, c: int, b: int, a: int
   */
  case class MM512_SETR4_EPI32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the repeated 4 element sequence in
   * reverse order.
   * d: __int64, c: __int64, b: __int64, a: __int64
   */
  case class MM512_SETR4_EPI64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence in reverse order.
   * d: double, c: double, b: double, a: double
   */
  case class MM512_SETR4_PD(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence in reverse order.
   * d: float, c: float, b: float, a: float
   */
  case class MM512_SETR4_PS(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values in reverse order.
   * e15: int, e14: int, e13: int, e12: int, e11: int, e10: int, e9: int, e8: int, e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM512_SETR_EPI32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the supplied values in reverse order.
   * e7: __int64, e6: __int64, e5: __int64, e4: __int64, e3: __int64, e2: __int64, e1: __int64, e0: __int64
   */
  case class MM512_SETR_EPI64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e7: double, e6: double, e5: double, e4: double, e3: double, e2: double, e1: double, e0: double
   */
  case class MM512_SETR_PD(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e15: float, e14: float, e13: float, e12: float, e11: float, e10: float, e9: float, e8: float, e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM512_SETR_PS(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with all elements set to zero.

   */
  case class MM512_SETZERO() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with all elements set to zero.

   */
  case class MM512_SETZERO_EPI32() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512d with all elements set to zero.

   */
  case class MM512_SETZERO_PD() extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with all elements set to zero.

   */
  case class MM512_SETZERO_PS() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with all elements set to zero.

   */
  case class MM512_SETZERO_SI512() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with undefined elements.

   */
  case class MM512_UNDEFINED() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with undefined elements.

   */
  case class MM512_UNDEFINED_EPI32() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512d with undefined elements.

   */
  case class MM512_UNDEFINED_PD() extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with undefined elements.

   */
  case class MM512_UNDEFINED_PS() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache.
   * "scale" should be 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0)
   * for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m512i, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache using
   * writemask "k" (elements are only brought into cache when their corresponding
   * mask bit is set). "scale" should be 1, 2, 4 or 8.. The "hint" parameter may be
   * 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for
   * prefetching to L2 cache.
   * vindex: __m512i, mask: __mmask8, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. Elements are prefetched into cache
   * level "hint", where "hint" is 0 or 1. 32-bit elements are stored at addresses
   * starting at "base_addr" and offset by each 64-bit element in "vindex" (each
   * index is scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. The "hint" parameter may be 1
   * (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching
   * to L2 cache. 32-bit elements are stored at addresses starting at "base_addr"
   * and offset by each 64-bit element in "vindex" (each index is scaled by the
   * factor in "scale") subject to mask "k" (elements are not brought into cache
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache.
   * "scale" should be 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0)
   * for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m256i, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache using
   * writemask "k" (elements are brought into cache only when their corresponding
   * mask bits are set). "scale" should be 1, 2, 4 or 8. The "hint" parameter may
   * be 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for
   * prefetching to L2 cache.
   * vindex: __m256i, mask: __mmask8, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write using 32-bit indices. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * 64-bit elements are brought into cache from addresses starting at "base_addr"
   * and offset by each 32-bit element in "vindex" (each index is scaled by the
   * factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write using 32-bit indices. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * 64-bit elements are brought into cache from addresses starting at "base_addr"
   * and offset by each 32-bit element in "vindex" (each index is scaled by the
   * factor in "scale") subject to mask "k" (elements are not brought into cache
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vinde: __m256i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vinde: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory into
   * cache level specified by "hint" using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). "scale"
   * should be 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m512i, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory into
   * cache level specified by "hint" using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale").
   * Prefetched elements are merged in cache using writemask "k" (elements are
   * copied from memory when the corresponding mask bit is set). "scale" should be
   * 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0) for prefetching to
   * L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m512i, mask: __mmask8, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. The "hint" parameter may be 1
   * (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching
   * to L2 cache. 64-bit elements are brought into cache from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. The "hint" parameter may be 1
   * (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching
   * to L2 cache. 64-bit elements are brought into cache from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not brought
   * into cache when the corresponding mask bit is not set). "scale" should be 1,
   * 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_EXP2A23_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23.
   * a: __m512
   */
  case class MM512_EXP2A23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_EXP2A23_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXP2A23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_EXP2A23_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_EXP2A23_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_EXP2A23_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23.
   * a: __m512d
   */
  case class MM512_EXP2A23_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * a: __m512d, k: __mmask8, src: __m512d, rounding: int
   */
  case class MM512_MASK_EXP2A23_ROUND_PD(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * a: __m512d, k: __mmask8, src: __m512d
   */
  case class MM512_MASK_EXP2A23_PD(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_EXP2A23_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_EXP2A23_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_RCP28_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m128d, b: __m128d
   */
  case class MM_RCP28_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_RCP28_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RCP28_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_RCP28_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RCP28_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst".
   * The maximum relative error for this approximation is less than 2^-28, and copy
   * the upper 3 packed elements from "a" to the upper elements of "dst".
   * [round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_RCP28_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * a: __m128, b: __m128
   */
  case class MM_RCP28_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_RCP28_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RCP28_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_RCP28_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RCP28_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_RCP28_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m512
   */
  case class MM512_RCP28_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_RCP28_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RCP28_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_RCP28_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RCP28_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_RCP28_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m512d
   */
  case class MM512_RCP28_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_RCP28_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RCP28_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_RCP28_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RCP28_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_RSQRT28_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * a: __m128d, b: __m128d
   */
  case class MM_RSQRT28_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_RSQRT28_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RSQRT28_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_RSQRT28_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RSQRT28_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_RSQRT28_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 2^-28.
   * a: __m128, b: __m128
   */
  case class MM_RSQRT28_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". The maximum relative error for this approximation is less
   * than 2^-28. [round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_RSQRT28_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". The maximum relative error for this approximation is less
   * than 2^-28.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RSQRT28_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_RSQRT28_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RSQRT28_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_RSQRT28_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * a: __m512
   */
  case class MM512_RSQRT28_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_RSQRT28_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RSQRT28_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_RSQRT28_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RSQRT28_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_RSQRT28_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * a: __m512d
   */
  case class MM512_RSQRT28_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_RSQRT28_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RSQRT28_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_RSQRT28_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RSQRT28_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs bitwise OR between "k1" and "k2", storing the result in "dst". ZF
   * flag is set if "dst" is 0.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KORTESTZ(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs bitwise OR between "k1" and "k2", storing the result in "dst". CF
   * flag is set if "dst" consists of all 1's.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KORTESTC(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Converts bit mask "k1" into an integer value, storing the results in "dst".
   * k1: __mmask16
   */
  case class MM512_MASK2INT(k1: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Converts integer "mask" into bitmask, storing the result in "dst".
   * mask: int
   */
  case class MM512_INT2MASK(mask: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiplies elements in packed 64-bit integer vectors "a" and "b" together,
   * storing the lower 64 bits of the result in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLOX_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiplies elements in packed 64-bit integer vectors "a" and "b" together,
   * storing the lower 64 bits of the result in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLOX_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32 bits from masks "a" and "b", and store the 64-bit
   * result in "k".
   * a: __mmask64, b: __mmask64
   */
  case class MM512_KUNPACKD(a: Exp[Long], b: Exp[Long]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16 bits from masks "a" and "b", and store the 32-bit
   * result in "k".
   * a: __mmask32, b: __mmask32
   */
  case class MM512_KUNPACKW(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_ADD_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ADD_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_ADD_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_ADD_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst".
   * a: __m256i, b: __m256i, count: const int
   */
  case class MM256_ALIGNR_EPI32(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst".
   * a: __m128i, b: __m128i, count: const int
   */
  case class MM_ALIGNR_EPI32(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASK_ALIGNR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst".
   * a: __m256i, b: __m256i, count: const int
   */
  case class MM256_ALIGNR_EPI64(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst".
   * a: __m128i, b: __m128i, count: const int
   */
  case class MM_ALIGNR_EPI64(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASK_ALIGNR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_ANDNOT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_ANDNOT_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_ANDNOT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ANDNOT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_ANDNOT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_ANDNOT_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_ANDNOT_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_ANDNOT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_ANDNOT_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_ANDNOT_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_ANDNOT_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_AND_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_AND_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_AND_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_AND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_AND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_AND_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_AND_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_AND_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_AND_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_AND_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_AND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_AND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_AND_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_AND_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_BLEND_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_BLEND_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_BLEND_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_BLEND_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst".
   * a: __m128
   */
  case class MM256_BROADCAST_F32X2(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128
   */
  case class MM256_MASK_BROADCAST_F32X2(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_BROADCAST_F32X2(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_castps512_ps256(a: Exp[__m512]): Exp[__m256] = {
    MM512_CASTPS512_PS256(a)
  }
            
  def _mm512_castsi128_si512(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CASTSI128_SI512(a)
  }
            
  def _mm512_castsi256_si512(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CASTSI256_SI512(a)
  }
            
  def _mm512_castsi512_si128(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CASTSI512_SI128(a)
  }
            
  def _mm512_castsi512_si256(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CASTSI512_SI256(a)
  }
            
  def _mm512_zextpd128_pd512(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_ZEXTPD128_PD512(a)
  }
            
  def _mm512_zextps128_ps512(a: Exp[__m128]): Exp[__m512] = {
    MM512_ZEXTPS128_PS512(a)
  }
            
  def _mm512_zextsi128_si512(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_ZEXTSI128_SI512(a)
  }
            
  def _mm512_zextpd256_pd512(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_ZEXTPD256_PD512(a)
  }
            
  def _mm512_zextps256_ps512(a: Exp[__m256]): Exp[__m512] = {
    MM512_ZEXTPS256_PS512(a)
  }
            
  def _mm512_zextsi256_si512(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_ZEXTSI256_SI512(a)
  }
            
  def _mm512_set1_pd(a: Exp[Double]): Exp[__m512d] = {
    MM512_SET1_PD(a)
  }
            
  def _mm512_set1_ps(a: Exp[Float]): Exp[__m512] = {
    MM512_SET1_PS(a)
  }
            
  def _mm512_set4_epi32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_SET4_EPI32(d, c, b, a)
  }
            
  def _mm512_set4_epi64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]): Exp[__m512i] = {
    MM512_SET4_EPI64(d, c, b, a)
  }
            
  def _mm512_set4_pd(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]): Exp[__m512d] = {
    MM512_SET4_PD(d, c, b, a)
  }
            
  def _mm512_set4_ps(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]): Exp[__m512] = {
    MM512_SET4_PS(d, c, b, a)
  }
            
  def _mm512_set_epi8(e63: Exp[Byte], e62: Exp[Byte], e61: Exp[Byte], e60: Exp[Byte], e59: Exp[Byte], e58: Exp[Byte], e57: Exp[Byte], e56: Exp[Byte], e55: Exp[Byte], e54: Exp[Byte], e53: Exp[Byte], e52: Exp[Byte], e51: Exp[Byte], e50: Exp[Byte], e49: Exp[Byte], e48: Exp[Byte], e47: Exp[Byte], e46: Exp[Byte], e45: Exp[Byte], e44: Exp[Byte], e43: Exp[Byte], e42: Exp[Byte], e41: Exp[Byte], e40: Exp[Byte], e39: Exp[Byte], e38: Exp[Byte], e37: Exp[Byte], e36: Exp[Byte], e35: Exp[Byte], e34: Exp[Byte], e33: Exp[Byte], e32: Exp[Byte], e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m512i] = {
    MM512_SET_EPI8(e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_set_epi16(e31: Exp[Short], e30: Exp[Short], e29: Exp[Short], e28: Exp[Short], e27: Exp[Short], e26: Exp[Short], e25: Exp[Short], e24: Exp[Short], e23: Exp[Short], e22: Exp[Short], e21: Exp[Short], e20: Exp[Short], e19: Exp[Short], e18: Exp[Short], e17: Exp[Short], e16: Exp[Short], e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m512i] = {
    MM512_SET_EPI16(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_set_epi32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m512i] = {
    MM512_SET_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_set_epi64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]): Exp[__m512i] = {
    MM512_SET_EPI64(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_set_pd(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m512d] = {
    MM512_SET_PD(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_set_ps(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m512] = {
    MM512_SET_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_setr4_epi32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_SETR4_EPI32(d, c, b, a)
  }
            
  def _mm512_setr4_epi64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]): Exp[__m512i] = {
    MM512_SETR4_EPI64(d, c, b, a)
  }
            
  def _mm512_setr4_pd(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]): Exp[__m512d] = {
    MM512_SETR4_PD(d, c, b, a)
  }
            
  def _mm512_setr4_ps(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]): Exp[__m512] = {
    MM512_SETR4_PS(d, c, b, a)
  }
            
  def _mm512_setr_epi32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m512i] = {
    MM512_SETR_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_setr_epi64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]): Exp[__m512i] = {
    MM512_SETR_EPI64(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_setr_pd(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m512d] = {
    MM512_SETR_PD(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_setr_ps(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m512] = {
    MM512_SETR_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_setzero(): Exp[__m512] = {
    MM512_SETZERO()
  }
            
  def _mm512_setzero_epi32(): Exp[__m512i] = {
    MM512_SETZERO_EPI32()
  }
            
  def _mm512_setzero_pd(): Exp[__m512d] = {
    MM512_SETZERO_PD()
  }
            
  def _mm512_setzero_ps(): Exp[__m512] = {
    MM512_SETZERO_PS()
  }
            
  def _mm512_setzero_si512(): Exp[__m512i] = {
    MM512_SETZERO_SI512()
  }
            
  def _mm512_undefined(): Exp[__m512] = {
    MM512_UNDEFINED()
  }
            
  def _mm512_undefined_epi32(): Exp[__m512i] = {
    MM512_UNDEFINED_EPI32()
  }
            
  def _mm512_undefined_pd(): Exp[__m512d] = {
    MM512_UNDEFINED_PD()
  }
            
  def _mm512_undefined_ps(): Exp[__m512] = {
    MM512_UNDEFINED_PS()
  }
            
  def _mm512_prefetch_i64gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_PREFETCH_I64GATHER_PS(vindex, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i64gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I64GATHER_PS(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_prefetch_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I64SCATTER_PS(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I64SCATTER_PS(base_addr, mask, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_prefetch_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_PREFETCH_I32GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I32GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_prefetch_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I32SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vinde: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I32SCATTER_PD(base_addr, mask, vinde, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_prefetch_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_PREFETCH_I64GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I64GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_prefetch_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I64SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_prefetch_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I64SCATTER_PD(base_addr, mask, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_exp2a23_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_EXP2A23_ROUND_PS(a, rounding)
  }
            
  def _mm512_exp2a23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXP2A23_PS(a)
  }
            
  def _mm512_mask_exp2a23_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_EXP2A23_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_exp2a23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXP2A23_PS(src, k, a)
  }
            
  def _mm512_maskz_exp2a23_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_EXP2A23_ROUND_PS(k, a, rounding)
  }
            
  def _mm512_maskz_exp2a23_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_EXP2A23_PS(k, a)
  }
            
  def _mm512_exp2a23_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_EXP2A23_ROUND_PD(a, rounding)
  }
            
  def _mm512_exp2a23_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXP2A23_PD(a)
  }
            
  def _mm512_mask_exp2a23_round_pd(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_EXP2A23_ROUND_PD(a, k, src, rounding)
  }
            
  def _mm512_mask_exp2a23_pd(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP2A23_PD(a, k, src)
  }
            
  def _mm512_maskz_exp2a23_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_EXP2A23_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_maskz_exp2a23_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_EXP2A23_PD(k, a)
  }
            
  def _mm_rcp28_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RCP28_ROUND_SD(a, b, rounding)
  }
            
  def _mm_rcp28_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP28_SD(a, b)
  }
            
  def _mm_mask_rcp28_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RCP28_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_rcp28_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RCP28_SD(src, k, a, b)
  }
            
  def _mm_maskz_rcp28_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RCP28_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_rcp28_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP28_SD(k, a, b)
  }
            
  def _mm_rcp28_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_RCP28_ROUND_SS(a, b, rounding)
  }
            
  def _mm_rcp28_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RCP28_SS(a, b)
  }
            
  def _mm_mask_rcp28_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RCP28_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_rcp28_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP28_SS(src, k, a, b)
  }
            
  def _mm_maskz_rcp28_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RCP28_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_rcp28_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RCP28_SS(k, a, b)
  }
            
  def _mm512_rcp28_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RCP28_ROUND_PS(a, rounding)
  }
            
  def _mm512_rcp28_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP28_PS(a)
  }
            
  def _mm512_mask_rcp28_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RCP28_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_rcp28_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP28_PS(src, k, a)
  }
            
  def _mm512_maskz_rcp28_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RCP28_ROUND_PS(k, a, rounding)
  }
            
  def _mm512_maskz_rcp28_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RCP28_PS(k, a)
  }
            
  def _mm512_rcp28_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RCP28_ROUND_PD(a, rounding)
  }
            
  def _mm512_rcp28_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RCP28_PD(a)
  }
            
  def _mm512_mask_rcp28_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RCP28_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_rcp28_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RCP28_PD(src, k, a)
  }
            
  def _mm512_maskz_rcp28_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RCP28_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_maskz_rcp28_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RCP28_PD(k, a)
  }
            
  def _mm_rsqrt28_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RSQRT28_ROUND_SD(a, b, rounding)
  }
            
  def _mm_rsqrt28_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RSQRT28_SD(a, b)
  }
            
  def _mm_mask_rsqrt28_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RSQRT28_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_rsqrt28_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT28_SD(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt28_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RSQRT28_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_rsqrt28_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT28_SD(k, a, b)
  }
            
  def _mm_rsqrt28_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_RSQRT28_ROUND_SS(a, b, rounding)
  }
            
  def _mm_rsqrt28_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT28_SS(a, b)
  }
            
  def _mm_mask_rsqrt28_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RSQRT28_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_rsqrt28_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT28_SS(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt28_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RSQRT28_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_rsqrt28_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT28_SS(k, a, b)
  }
            
  def _mm512_rsqrt28_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RSQRT28_ROUND_PS(a, rounding)
  }
            
  def _mm512_rsqrt28_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT28_PS(a)
  }
            
  def _mm512_mask_rsqrt28_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RSQRT28_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_rsqrt28_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RSQRT28_PS(src, k, a)
  }
            
  def _mm512_maskz_rsqrt28_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RSQRT28_ROUND_PS(k, a, rounding)
  }
            
  def _mm512_maskz_rsqrt28_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RSQRT28_PS(k, a)
  }
            
  def _mm512_rsqrt28_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RSQRT28_ROUND_PD(a, rounding)
  }
            
  def _mm512_rsqrt28_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RSQRT28_PD(a)
  }
            
  def _mm512_mask_rsqrt28_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RSQRT28_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_rsqrt28_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RSQRT28_PD(src, k, a)
  }
            
  def _mm512_maskz_rsqrt28_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT28_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_maskz_rsqrt28_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT28_PD(k, a)
  }
            
  def _mm512_kortestz(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTZ(k1, k2)
  }
            
  def _mm512_kortestc(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTC(k1, k2)
  }
            
  def _mm512_mask2int(k1: Exp[Int]): Exp[Int] = {
    MM512_MASK2INT(k1)
  }
            
  def _mm512_int2mask(mask: Exp[Int]): Exp[Int] = {
    MM512_INT2MASK(mask)
  }
            
  def _mm512_mullox_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLOX_EPI64(a, b)
  }
            
  def _mm512_mask_mullox_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLOX_EPI64(src, k, a, b)
  }
            
  def _mm512_kunpackd(a: Exp[Long], b: Exp[Long]): Exp[Long] = {
    MM512_KUNPACKD(a, b)
  }
            
  def _mm512_kunpackw(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KUNPACKW(a, b)
  }
            
  def _mm256_mask_add_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_ADD_PD(src, k, a, b)
  }
            
  def _mm256_maskz_add_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm_mask_add_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ADD_PD(src, k, a, b)
  }
            
  def _mm_maskz_add_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm256_mask_add_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_ADD_PS(src, k, a, b)
  }
            
  def _mm256_maskz_add_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm_mask_add_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_ADD_PS(src, k, a, b)
  }
            
  def _mm_maskz_add_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm256_alignr_epi32(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm256_mask_alignr_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm256_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm_alignr_epi32(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm_mask_alignr_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm256_alignr_epi64(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm256_mask_alignr_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm256_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm_alignr_epi64(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm_mask_alignr_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm256_mask_andnot_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm256_maskz_andnot_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm512_andnot_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_ANDNOT_PD(a, b)
  }
            
  def _mm512_mask_andnot_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm512_maskz_andnot_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm_mask_andnot_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm_maskz_andnot_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm256_mask_andnot_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_ANDNOT_PS(src, k, a, b)
  }
            
  def _mm256_maskz_andnot_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_ANDNOT_PS(k, a, b)
  }
            
  def _mm512_andnot_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_ANDNOT_PS(a, b)
  }
            
  def _mm512_mask_andnot_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ANDNOT_PS(src, k, a, b)
  }
            
  def _mm512_maskz_andnot_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_ANDNOT_PS(k, a, b)
  }
            
  def _mm_mask_andnot_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_ANDNOT_PS(src, k, a, b)
  }
            
  def _mm_maskz_andnot_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_ANDNOT_PS(k, a, b)
  }
            
  def _mm256_mask_and_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm256_maskz_and_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_AND_PD(k, a, b)
  }
            
  def _mm512_and_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_AND_PD(a, b)
  }
            
  def _mm512_mask_and_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm512_maskz_and_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_AND_PD(k, a, b)
  }
            
  def _mm_mask_and_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm_maskz_and_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_AND_PD(k, a, b)
  }
            
  def _mm256_mask_and_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_AND_PS(src, k, a, b)
  }
            
  def _mm256_maskz_and_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_AND_PS(k, a, b)
  }
            
  def _mm512_and_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_AND_PS(a, b)
  }
            
  def _mm512_mask_and_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_AND_PS(src, k, a, b)
  }
            
  def _mm512_maskz_and_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_AND_PS(k, a, b)
  }
            
  def _mm_mask_and_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_AND_PS(src, k, a, b)
  }
            
  def _mm_maskz_and_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_AND_PS(k, a, b)
  }
            
  def _mm256_mask_blend_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_BLEND_PD(k, a, b)
  }
            
  def _mm_mask_blend_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_BLEND_PD(k, a, b)
  }
            
  def _mm256_mask_blend_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm_mask_blend_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm256_broadcast_f32x2(a: Exp[__m128]): Exp[__m256] = {
    MM256_BROADCAST_F32X2(a)
  }
            
  def _mm256_mask_broadcast_f32x2(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASK_BROADCAST_F32X2(src, k, a)
  }
            
  def _mm256_maskz_broadcast_f32x2(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCAST_F32X2(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_CASTPS512_PS256 (a) =>
      _mm512_castps512_ps256(f(a))
    case MM512_CASTSI128_SI512 (a) =>
      _mm512_castsi128_si512(f(a))
    case MM512_CASTSI256_SI512 (a) =>
      _mm512_castsi256_si512(f(a))
    case MM512_CASTSI512_SI128 (a) =>
      _mm512_castsi512_si128(f(a))
    case MM512_CASTSI512_SI256 (a) =>
      _mm512_castsi512_si256(f(a))
    case MM512_ZEXTPD128_PD512 (a) =>
      _mm512_zextpd128_pd512(f(a))
    case MM512_ZEXTPS128_PS512 (a) =>
      _mm512_zextps128_ps512(f(a))
    case MM512_ZEXTSI128_SI512 (a) =>
      _mm512_zextsi128_si512(f(a))
    case MM512_ZEXTPD256_PD512 (a) =>
      _mm512_zextpd256_pd512(f(a))
    case MM512_ZEXTPS256_PS512 (a) =>
      _mm512_zextps256_ps512(f(a))
    case MM512_ZEXTSI256_SI512 (a) =>
      _mm512_zextsi256_si512(f(a))
    case MM512_SET1_PD (a) =>
      _mm512_set1_pd(f(a))
    case MM512_SET1_PS (a) =>
      _mm512_set1_ps(f(a))
    case MM512_SET4_EPI32 (d, c, b, a) =>
      _mm512_set4_epi32(f(d), f(c), f(b), f(a))
    case MM512_SET4_EPI64 (d, c, b, a) =>
      _mm512_set4_epi64(f(d), f(c), f(b), f(a))
    case MM512_SET4_PD (d, c, b, a) =>
      _mm512_set4_pd(f(d), f(c), f(b), f(a))
    case MM512_SET4_PS (d, c, b, a) =>
      _mm512_set4_ps(f(d), f(c), f(b), f(a))
    case MM512_SET_EPI8 (e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi8(f(e63), f(e62), f(e61), f(e60), f(e59), f(e58), f(e57), f(e56), f(e55), f(e54), f(e53), f(e52), f(e51), f(e50), f(e49), f(e48), f(e47), f(e46), f(e45), f(e44), f(e43), f(e42), f(e41), f(e40), f(e39), f(e38), f(e37), f(e36), f(e35), f(e34), f(e33), f(e32), f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SET_EPI16 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi16(f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SET_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi32(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SET_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi64(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SET_PD (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_pd(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SET_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_ps(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SETR4_EPI32 (d, c, b, a) =>
      _mm512_setr4_epi32(f(d), f(c), f(b), f(a))
    case MM512_SETR4_EPI64 (d, c, b, a) =>
      _mm512_setr4_epi64(f(d), f(c), f(b), f(a))
    case MM512_SETR4_PD (d, c, b, a) =>
      _mm512_setr4_pd(f(d), f(c), f(b), f(a))
    case MM512_SETR4_PS (d, c, b, a) =>
      _mm512_setr4_ps(f(d), f(c), f(b), f(a))
    case MM512_SETR_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_epi32(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SETR_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_epi64(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SETR_PD (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_pd(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SETR_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_ps(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM512_SETZERO () =>
      _mm512_setzero()
    case MM512_SETZERO_EPI32 () =>
      _mm512_setzero_epi32()
    case MM512_SETZERO_PD () =>
      _mm512_setzero_pd()
    case MM512_SETZERO_PS () =>
      _mm512_setzero_ps()
    case MM512_SETZERO_SI512 () =>
      _mm512_setzero_si512()
    case MM512_UNDEFINED () =>
      _mm512_undefined()
    case MM512_UNDEFINED_EPI32 () =>
      _mm512_undefined_epi32()
    case MM512_UNDEFINED_PD () =>
      _mm512_undefined_pd()
    case MM512_UNDEFINED_PS () =>
      _mm512_undefined_ps()
    case iDef@MM512_PREFETCH_I64GATHER_PS (vindex, base_addr, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I64GATHER_PS (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PREFETCH_I64SCATTER_PS (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PS (base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PREFETCH_I32GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I32GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PREFETCH_I32SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I32SCATTER_PD (base_addr, mask, vinde, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vinde, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PREFETCH_I64GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I64GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_PREFETCH_I64SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PD (base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_EXP2A23_ROUND_PS (a, rounding) =>
      _mm512_exp2a23_round_ps(f(a), f(rounding))
    case MM512_EXP2A23_PS (a) =>
      _mm512_exp2a23_ps(f(a))
    case MM512_MASK_EXP2A23_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_exp2a23_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_EXP2A23_PS (src, k, a) =>
      _mm512_mask_exp2a23_ps(f(src), f(k), f(a))
    case MM512_MASKZ_EXP2A23_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_exp2a23_round_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_EXP2A23_PS (k, a) =>
      _mm512_maskz_exp2a23_ps(f(k), f(a))
    case MM512_EXP2A23_ROUND_PD (a, rounding) =>
      _mm512_exp2a23_round_pd(f(a), f(rounding))
    case MM512_EXP2A23_PD (a) =>
      _mm512_exp2a23_pd(f(a))
    case MM512_MASK_EXP2A23_ROUND_PD (a, k, src, rounding) =>
      _mm512_mask_exp2a23_round_pd(f(a), f(k), f(src), f(rounding))
    case MM512_MASK_EXP2A23_PD (a, k, src) =>
      _mm512_mask_exp2a23_pd(f(a), f(k), f(src))
    case MM512_MASKZ_EXP2A23_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_exp2a23_round_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_EXP2A23_PD (k, a) =>
      _mm512_maskz_exp2a23_pd(f(k), f(a))
    case MM_RCP28_ROUND_SD (a, b, rounding) =>
      _mm_rcp28_round_sd(f(a), f(b), f(rounding))
    case MM_RCP28_SD (a, b) =>
      _mm_rcp28_sd(f(a), f(b))
    case MM_MASK_RCP28_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_rcp28_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_RCP28_SD (src, k, a, b) =>
      _mm_mask_rcp28_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RCP28_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_rcp28_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_RCP28_SD (k, a, b) =>
      _mm_maskz_rcp28_sd(f(k), f(a), f(b))
    case MM_RCP28_ROUND_SS (a, b, rounding) =>
      _mm_rcp28_round_ss(f(a), f(b), f(rounding))
    case MM_RCP28_SS (a, b) =>
      _mm_rcp28_ss(f(a), f(b))
    case MM_MASK_RCP28_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_rcp28_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_RCP28_SS (src, k, a, b) =>
      _mm_mask_rcp28_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RCP28_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_rcp28_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_RCP28_SS (k, a, b) =>
      _mm_maskz_rcp28_ss(f(k), f(a), f(b))
    case MM512_RCP28_ROUND_PS (a, rounding) =>
      _mm512_rcp28_round_ps(f(a), f(rounding))
    case MM512_RCP28_PS (a) =>
      _mm512_rcp28_ps(f(a))
    case MM512_MASK_RCP28_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_rcp28_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_RCP28_PS (src, k, a) =>
      _mm512_mask_rcp28_ps(f(src), f(k), f(a))
    case MM512_MASKZ_RCP28_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_rcp28_round_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_RCP28_PS (k, a) =>
      _mm512_maskz_rcp28_ps(f(k), f(a))
    case MM512_RCP28_ROUND_PD (a, rounding) =>
      _mm512_rcp28_round_pd(f(a), f(rounding))
    case MM512_RCP28_PD (a) =>
      _mm512_rcp28_pd(f(a))
    case MM512_MASK_RCP28_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_rcp28_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_RCP28_PD (src, k, a) =>
      _mm512_mask_rcp28_pd(f(src), f(k), f(a))
    case MM512_MASKZ_RCP28_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_rcp28_round_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_RCP28_PD (k, a) =>
      _mm512_maskz_rcp28_pd(f(k), f(a))
    case MM_RSQRT28_ROUND_SD (a, b, rounding) =>
      _mm_rsqrt28_round_sd(f(a), f(b), f(rounding))
    case MM_RSQRT28_SD (a, b) =>
      _mm_rsqrt28_sd(f(a), f(b))
    case MM_MASK_RSQRT28_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_rsqrt28_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_RSQRT28_SD (src, k, a, b) =>
      _mm_mask_rsqrt28_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT28_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_rsqrt28_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_RSQRT28_SD (k, a, b) =>
      _mm_maskz_rsqrt28_sd(f(k), f(a), f(b))
    case MM_RSQRT28_ROUND_SS (a, b, rounding) =>
      _mm_rsqrt28_round_ss(f(a), f(b), f(rounding))
    case MM_RSQRT28_SS (a, b) =>
      _mm_rsqrt28_ss(f(a), f(b))
    case MM_MASK_RSQRT28_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_rsqrt28_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_RSQRT28_SS (src, k, a, b) =>
      _mm_mask_rsqrt28_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT28_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_rsqrt28_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_RSQRT28_SS (k, a, b) =>
      _mm_maskz_rsqrt28_ss(f(k), f(a), f(b))
    case MM512_RSQRT28_ROUND_PS (a, rounding) =>
      _mm512_rsqrt28_round_ps(f(a), f(rounding))
    case MM512_RSQRT28_PS (a) =>
      _mm512_rsqrt28_ps(f(a))
    case MM512_MASK_RSQRT28_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_rsqrt28_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_RSQRT28_PS (src, k, a) =>
      _mm512_mask_rsqrt28_ps(f(src), f(k), f(a))
    case MM512_MASKZ_RSQRT28_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_rsqrt28_round_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_RSQRT28_PS (k, a) =>
      _mm512_maskz_rsqrt28_ps(f(k), f(a))
    case MM512_RSQRT28_ROUND_PD (a, rounding) =>
      _mm512_rsqrt28_round_pd(f(a), f(rounding))
    case MM512_RSQRT28_PD (a) =>
      _mm512_rsqrt28_pd(f(a))
    case MM512_MASK_RSQRT28_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_rsqrt28_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_RSQRT28_PD (src, k, a) =>
      _mm512_mask_rsqrt28_pd(f(src), f(k), f(a))
    case MM512_MASKZ_RSQRT28_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_rsqrt28_round_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_RSQRT28_PD (k, a) =>
      _mm512_maskz_rsqrt28_pd(f(k), f(a))
    case MM512_KORTESTZ (k1, k2) =>
      _mm512_kortestz(f(k1), f(k2))
    case MM512_KORTESTC (k1, k2) =>
      _mm512_kortestc(f(k1), f(k2))
    case MM512_MASK2INT (k1) =>
      _mm512_mask2int(f(k1))
    case MM512_INT2MASK (mask) =>
      _mm512_int2mask(f(mask))
    case MM512_MULLOX_EPI64 (a, b) =>
      _mm512_mullox_epi64(f(a), f(b))
    case MM512_MASK_MULLOX_EPI64 (src, k, a, b) =>
      _mm512_mask_mullox_epi64(f(src), f(k), f(a), f(b))
    case MM512_KUNPACKD (a, b) =>
      _mm512_kunpackd(f(a), f(b))
    case MM512_KUNPACKW (a, b) =>
      _mm512_kunpackw(f(a), f(b))
    case MM256_MASK_ADD_PD (src, k, a, b) =>
      _mm256_mask_add_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADD_PD (k, a, b) =>
      _mm256_maskz_add_pd(f(k), f(a), f(b))
    case MM_MASK_ADD_PD (src, k, a, b) =>
      _mm_mask_add_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADD_PD (k, a, b) =>
      _mm_maskz_add_pd(f(k), f(a), f(b))
    case MM256_MASK_ADD_PS (src, k, a, b) =>
      _mm256_mask_add_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADD_PS (k, a, b) =>
      _mm256_maskz_add_ps(f(k), f(a), f(b))
    case MM_MASK_ADD_PS (src, k, a, b) =>
      _mm_mask_add_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADD_PS (k, a, b) =>
      _mm_maskz_add_ps(f(k), f(a), f(b))
    case MM256_ALIGNR_EPI32 (a, b, count) =>
      _mm256_alignr_epi32(f(a), f(b), f(count))
    case MM256_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM256_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm256_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case MM_ALIGNR_EPI32 (a, b, count) =>
      _mm_alignr_epi32(f(a), f(b), f(count))
    case MM_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case MM256_ALIGNR_EPI64 (a, b, count) =>
      _mm256_alignr_epi64(f(a), f(b), f(count))
    case MM256_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM256_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm256_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM_ALIGNR_EPI64 (a, b, count) =>
      _mm_alignr_epi64(f(a), f(b), f(count))
    case MM_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM256_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm256_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm256_maskz_andnot_pd(f(k), f(a), f(b))
    case MM512_ANDNOT_PD (a, b) =>
      _mm512_andnot_pd(f(a), f(b))
    case MM512_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm512_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm512_maskz_andnot_pd(f(k), f(a), f(b))
    case MM_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm_maskz_andnot_pd(f(k), f(a), f(b))
    case MM256_MASK_ANDNOT_PS (src, k, a, b) =>
      _mm256_mask_andnot_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ANDNOT_PS (k, a, b) =>
      _mm256_maskz_andnot_ps(f(k), f(a), f(b))
    case MM512_ANDNOT_PS (a, b) =>
      _mm512_andnot_ps(f(a), f(b))
    case MM512_MASK_ANDNOT_PS (src, k, a, b) =>
      _mm512_mask_andnot_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ANDNOT_PS (k, a, b) =>
      _mm512_maskz_andnot_ps(f(k), f(a), f(b))
    case MM_MASK_ANDNOT_PS (src, k, a, b) =>
      _mm_mask_andnot_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ANDNOT_PS (k, a, b) =>
      _mm_maskz_andnot_ps(f(k), f(a), f(b))
    case MM256_MASK_AND_PD (src, k, a, b) =>
      _mm256_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AND_PD (k, a, b) =>
      _mm256_maskz_and_pd(f(k), f(a), f(b))
    case MM512_AND_PD (a, b) =>
      _mm512_and_pd(f(a), f(b))
    case MM512_MASK_AND_PD (src, k, a, b) =>
      _mm512_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_AND_PD (k, a, b) =>
      _mm512_maskz_and_pd(f(k), f(a), f(b))
    case MM_MASK_AND_PD (src, k, a, b) =>
      _mm_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AND_PD (k, a, b) =>
      _mm_maskz_and_pd(f(k), f(a), f(b))
    case MM256_MASK_AND_PS (src, k, a, b) =>
      _mm256_mask_and_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AND_PS (k, a, b) =>
      _mm256_maskz_and_ps(f(k), f(a), f(b))
    case MM512_AND_PS (a, b) =>
      _mm512_and_ps(f(a), f(b))
    case MM512_MASK_AND_PS (src, k, a, b) =>
      _mm512_mask_and_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_AND_PS (k, a, b) =>
      _mm512_maskz_and_ps(f(k), f(a), f(b))
    case MM_MASK_AND_PS (src, k, a, b) =>
      _mm_mask_and_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AND_PS (k, a, b) =>
      _mm_maskz_and_ps(f(k), f(a), f(b))
    case MM256_MASK_BLEND_PD (k, a, b) =>
      _mm256_mask_blend_pd(f(k), f(a), f(b))
    case MM_MASK_BLEND_PD (k, a, b) =>
      _mm_mask_blend_pd(f(k), f(a), f(b))
    case MM256_MASK_BLEND_PS (k, a, b) =>
      _mm256_mask_blend_ps(f(k), f(a), f(b))
    case MM_MASK_BLEND_PS (k, a, b) =>
      _mm_mask_blend_ps(f(k), f(a), f(b))
    case MM256_BROADCAST_F32X2 (a) =>
      _mm256_broadcast_f32x2(f(a))
    case MM256_MASK_BROADCAST_F32X2 (src, k, a) =>
      _mm256_mask_broadcast_f32x2(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_F32X2 (k, a) =>
      _mm256_maskz_broadcast_f32x2(f(k), f(a))

    case Reflect(MM512_CASTPS512_PS256 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS512_PS256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI128_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI128_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI256_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI256_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI512_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI512_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI512_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI512_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPD128_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPD128_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPS128_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPS128_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTSI128_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTSI128_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPD256_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPD256_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPS256_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPS256_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTSI256_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTSI256_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_EPI32 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_EPI32 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_EPI64 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_EPI64 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_PD (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_PD (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_PS (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_PS (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI8 (e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI8 (f(e63), f(e62), f(e61), f(e60), f(e59), f(e58), f(e57), f(e56), f(e55), f(e54), f(e53), f(e52), f(e51), f(e50), f(e49), f(e48), f(e47), f(e46), f(e45), f(e44), f(e43), f(e42), f(e41), f(e40), f(e39), f(e38), f(e37), f(e36), f(e35), f(e34), f(e33), f(e32), f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI16 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI16 (f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI32 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI64 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_PD (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_PD (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_PS (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_EPI32 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_EPI32 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_EPI64 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_EPI64 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_PD (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_PD (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_PS (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_PS (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_EPI32 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_EPI64 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_PD (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_PD (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_PS (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_EPI32 (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_EPI32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_PD (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_PS (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_SI512 (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_SI512 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_EPI32 (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_EPI32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_PD (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_PS (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64GATHER_PS (vindex, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64GATHER_PS (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64SCATTER_PS (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64SCATTER_PS (base_addr, mask, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I32GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I32SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32SCATTER_PD (base_addr, mask, vinde, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vinde, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64SCATTER_PD (base_addr, mask, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_ROUND_PD (a, k, src, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_ROUND_PD (f(a), f(k), f(src), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_PD (a, k, src), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_PD (f(a), f(k), f(src)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTZ (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTZ (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTC (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTC (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2INT (k1), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2INT (f(k1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INT2MASK (mask), u, es) =>
      reflectMirrored(Reflect(MM512_INT2MASK (f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLOX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLOX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLOX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLOX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKW (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ANDNOT_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ANDNOT_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AND_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AND_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_F32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_F32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51206 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_CASTPS512_PS256(a) =>
      emitValDef(sym, s"_mm512_castps512_ps256(${quote(a)})")
    case MM512_CASTSI128_SI512(a) =>
      emitValDef(sym, s"_mm512_castsi128_si512(${quote(a)})")
    case MM512_CASTSI256_SI512(a) =>
      emitValDef(sym, s"_mm512_castsi256_si512(${quote(a)})")
    case MM512_CASTSI512_SI128(a) =>
      emitValDef(sym, s"_mm512_castsi512_si128(${quote(a)})")
    case MM512_CASTSI512_SI256(a) =>
      emitValDef(sym, s"_mm512_castsi512_si256(${quote(a)})")
    case MM512_ZEXTPD128_PD512(a) =>
      emitValDef(sym, s"_mm512_zextpd128_pd512(${quote(a)})")
    case MM512_ZEXTPS128_PS512(a) =>
      emitValDef(sym, s"_mm512_zextps128_ps512(${quote(a)})")
    case MM512_ZEXTSI128_SI512(a) =>
      emitValDef(sym, s"_mm512_zextsi128_si512(${quote(a)})")
    case MM512_ZEXTPD256_PD512(a) =>
      emitValDef(sym, s"_mm512_zextpd256_pd512(${quote(a)})")
    case MM512_ZEXTPS256_PS512(a) =>
      emitValDef(sym, s"_mm512_zextps256_ps512(${quote(a)})")
    case MM512_ZEXTSI256_SI512(a) =>
      emitValDef(sym, s"_mm512_zextsi256_si512(${quote(a)})")
    case MM512_SET1_PD(a) =>
      emitValDef(sym, s"_mm512_set1_pd(${quote(a)})")
    case MM512_SET1_PS(a) =>
      emitValDef(sym, s"_mm512_set1_ps(${quote(a)})")
    case MM512_SET4_EPI32(d, c, b, a) =>
      emitValDef(sym, s"_mm512_set4_epi32(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SET4_EPI64(d, c, b, a) =>
      emitValDef(sym, s"_mm512_set4_epi64(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SET4_PD(d, c, b, a) =>
      emitValDef(sym, s"_mm512_set4_pd(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SET4_PS(d, c, b, a) =>
      emitValDef(sym, s"_mm512_set4_ps(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SET_EPI8(e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_epi8(${quote(e63)}, ${quote(e62)}, ${quote(e61)}, ${quote(e60)}, ${quote(e59)}, ${quote(e58)}, ${quote(e57)}, ${quote(e56)}, ${quote(e55)}, ${quote(e54)}, ${quote(e53)}, ${quote(e52)}, ${quote(e51)}, ${quote(e50)}, ${quote(e49)}, ${quote(e48)}, ${quote(e47)}, ${quote(e46)}, ${quote(e45)}, ${quote(e44)}, ${quote(e43)}, ${quote(e42)}, ${quote(e41)}, ${quote(e40)}, ${quote(e39)}, ${quote(e38)}, ${quote(e37)}, ${quote(e36)}, ${quote(e35)}, ${quote(e34)}, ${quote(e33)}, ${quote(e32)}, ${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SET_EPI16(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_epi16(${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SET_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_epi32(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SET_EPI64(e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_epi64(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SET_PD(e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_pd(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SET_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_set_ps(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SETR4_EPI32(d, c, b, a) =>
      emitValDef(sym, s"_mm512_setr4_epi32(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SETR4_EPI64(d, c, b, a) =>
      emitValDef(sym, s"_mm512_setr4_epi64(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SETR4_PD(d, c, b, a) =>
      emitValDef(sym, s"_mm512_setr4_pd(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SETR4_PS(d, c, b, a) =>
      emitValDef(sym, s"_mm512_setr4_ps(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case MM512_SETR_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_setr_epi32(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SETR_EPI64(e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_setr_epi64(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SETR_PD(e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_setr_pd(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SETR_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      emitValDef(sym, s"_mm512_setr_ps(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case MM512_SETZERO() =>
      emitValDef(sym, s"_mm512_setzero()")
    case MM512_SETZERO_EPI32() =>
      emitValDef(sym, s"_mm512_setzero_epi32()")
    case MM512_SETZERO_PD() =>
      emitValDef(sym, s"_mm512_setzero_pd()")
    case MM512_SETZERO_PS() =>
      emitValDef(sym, s"_mm512_setzero_ps()")
    case MM512_SETZERO_SI512() =>
      emitValDef(sym, s"_mm512_setzero_si512()")
    case MM512_UNDEFINED() =>
      emitValDef(sym, s"_mm512_undefined()")
    case MM512_UNDEFINED_EPI32() =>
      emitValDef(sym, s"_mm512_undefined_epi32()")
    case MM512_UNDEFINED_PD() =>
      emitValDef(sym, s"_mm512_undefined_pd()")
    case MM512_UNDEFINED_PS() =>
      emitValDef(sym, s"_mm512_undefined_ps()")
    case MM512_PREFETCH_I64GATHER_PS(vindex, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i64gather_ps(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I64GATHER_PS(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i64gather_ps(${quote(vindex)}, ${quote(mask)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_PREFETCH_I64SCATTER_PS(base_addr, vindex, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I64SCATTER_PS(base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(mask)}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_PREFETCH_I32GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i32gather_pd(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I32GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i32gather_pd(${quote(vindex)}, ${quote(mask)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_PREFETCH_I32SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I32SCATTER_PD(base_addr, mask, vinde, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(mask)}, ${quote(vinde)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_PREFETCH_I64GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i64gather_pd(${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I64GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i64gather_pd(${quote(vindex)}, ${quote(mask)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)}, ${quote(hint)});")
    case MM512_PREFETCH_I64SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_prefetch_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_MASK_PREFETCH_I64SCATTER_PD(base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      stream.println(s"_mm512_mask_prefetch_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(mask)}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case MM512_EXP2A23_ROUND_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_exp2a23_round_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_EXP2A23_PS(a) =>
      emitValDef(sym, s"_mm512_exp2a23_ps(${quote(a)})")
    case MM512_MASK_EXP2A23_ROUND_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_exp2a23_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_EXP2A23_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_exp2a23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_EXP2A23_ROUND_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_exp2a23_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_EXP2A23_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_exp2a23_ps(${quote(k)}, ${quote(a)})")
    case MM512_EXP2A23_ROUND_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_exp2a23_round_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_EXP2A23_PD(a) =>
      emitValDef(sym, s"_mm512_exp2a23_pd(${quote(a)})")
    case MM512_MASK_EXP2A23_ROUND_PD(a, k, src, rounding) =>
      emitValDef(sym, s"_mm512_mask_exp2a23_round_pd(${quote(a)}, ${quote(k)}, ${quote(src)}, ${quote(rounding)})")
    case MM512_MASK_EXP2A23_PD(a, k, src) =>
      emitValDef(sym, s"_mm512_mask_exp2a23_pd(${quote(a)}, ${quote(k)}, ${quote(src)})")
    case MM512_MASKZ_EXP2A23_ROUND_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_exp2a23_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_EXP2A23_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_exp2a23_pd(${quote(k)}, ${quote(a)})")
    case MM_RCP28_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_rcp28_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_RCP28_SD(a, b) =>
      emitValDef(sym, s"_mm_rcp28_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_RCP28_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_rcp28_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_RCP28_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rcp28_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RCP28_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_rcp28_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_RCP28_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rcp28_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RCP28_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_rcp28_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_RCP28_SS(a, b) =>
      emitValDef(sym, s"_mm_rcp28_ss(${quote(a)}, ${quote(b)})")
    case MM_MASK_RCP28_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_rcp28_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_RCP28_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rcp28_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RCP28_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_rcp28_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_RCP28_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rcp28_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_RCP28_ROUND_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_rcp28_round_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_RCP28_PS(a) =>
      emitValDef(sym, s"_mm512_rcp28_ps(${quote(a)})")
    case MM512_MASK_RCP28_ROUND_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_rcp28_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_RCP28_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rcp28_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RCP28_ROUND_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_rcp28_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_RCP28_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rcp28_ps(${quote(k)}, ${quote(a)})")
    case MM512_RCP28_ROUND_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_rcp28_round_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_RCP28_PD(a) =>
      emitValDef(sym, s"_mm512_rcp28_pd(${quote(a)})")
    case MM512_MASK_RCP28_ROUND_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_rcp28_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_RCP28_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rcp28_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RCP28_ROUND_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_rcp28_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_RCP28_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rcp28_pd(${quote(k)}, ${quote(a)})")
    case MM_RSQRT28_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_rsqrt28_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_RSQRT28_SD(a, b) =>
      emitValDef(sym, s"_mm_rsqrt28_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_RSQRT28_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_rsqrt28_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_RSQRT28_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rsqrt28_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RSQRT28_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_rsqrt28_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_RSQRT28_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rsqrt28_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RSQRT28_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_rsqrt28_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_RSQRT28_SS(a, b) =>
      emitValDef(sym, s"_mm_rsqrt28_ss(${quote(a)}, ${quote(b)})")
    case MM_MASK_RSQRT28_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_rsqrt28_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_RSQRT28_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rsqrt28_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RSQRT28_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_rsqrt28_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_RSQRT28_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rsqrt28_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_RSQRT28_ROUND_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_rsqrt28_round_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_RSQRT28_PS(a) =>
      emitValDef(sym, s"_mm512_rsqrt28_ps(${quote(a)})")
    case MM512_MASK_RSQRT28_ROUND_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_rsqrt28_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_RSQRT28_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rsqrt28_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RSQRT28_ROUND_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt28_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_RSQRT28_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt28_ps(${quote(k)}, ${quote(a)})")
    case MM512_RSQRT28_ROUND_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_rsqrt28_round_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_RSQRT28_PD(a) =>
      emitValDef(sym, s"_mm512_rsqrt28_pd(${quote(a)})")
    case MM512_MASK_RSQRT28_ROUND_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_rsqrt28_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_RSQRT28_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rsqrt28_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RSQRT28_ROUND_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt28_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_RSQRT28_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt28_pd(${quote(k)}, ${quote(a)})")
    case MM512_KORTESTZ(k1, k2) =>
      emitValDef(sym, s"_mm512_kortestz(${quote(k1)}, ${quote(k2)})")
    case MM512_KORTESTC(k1, k2) =>
      emitValDef(sym, s"_mm512_kortestc(${quote(k1)}, ${quote(k2)})")
    case MM512_MASK2INT(k1) =>
      emitValDef(sym, s"_mm512_mask2int(${quote(k1)})")
    case MM512_INT2MASK(mask) =>
      emitValDef(sym, s"_mm512_int2mask(${quote(mask)})")
    case MM512_MULLOX_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_mullox_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULLOX_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mullox_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_KUNPACKD(a, b) =>
      emitValDef(sym, s"_mm512_kunpackd(${quote(a)}, ${quote(b)})")
    case MM512_KUNPACKW(a, b) =>
      emitValDef(sym, s"_mm512_kunpackw(${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADD_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_add_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADD_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADD_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_add_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADD_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADD_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_add_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADD_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADD_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_add_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADD_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_ALIGNR_EPI32(a, b, count) =>
      emitValDef(sym, s"_mm256_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      emitValDef(sym, s"_mm256_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      emitValDef(sym, s"_mm256_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_ALIGNR_EPI32(a, b, count) =>
      emitValDef(sym, s"_mm_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      emitValDef(sym, s"_mm_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      emitValDef(sym, s"_mm_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_ALIGNR_EPI64(a, b, count) =>
      emitValDef(sym, s"_mm256_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      emitValDef(sym, s"_mm256_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      emitValDef(sym, s"_mm256_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_ALIGNR_EPI64(a, b, count) =>
      emitValDef(sym, s"_mm_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      emitValDef(sym, s"_mm_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      emitValDef(sym, s"_mm_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASK_ANDNOT_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ANDNOT_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ANDNOT_PD(a, b) =>
      emitValDef(sym, s"_mm512_andnot_pd(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ANDNOT_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ANDNOT_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ANDNOT_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ANDNOT_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ANDNOT_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_andnot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ANDNOT_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_andnot_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ANDNOT_PS(a, b) =>
      emitValDef(sym, s"_mm512_andnot_ps(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ANDNOT_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_andnot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ANDNOT_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_andnot_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ANDNOT_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_andnot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ANDNOT_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_andnot_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_AND_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AND_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_and_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AND_PD(a, b) =>
      emitValDef(sym, s"_mm512_and_pd(${quote(a)}, ${quote(b)})")
    case MM512_MASK_AND_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_AND_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_and_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AND_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AND_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_and_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_AND_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_and_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AND_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_and_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AND_PS(a, b) =>
      emitValDef(sym, s"_mm512_and_ps(${quote(a)}, ${quote(b)})")
    case MM512_MASK_AND_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_and_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_AND_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_and_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AND_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_and_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AND_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_and_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_PD(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_PS(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_BROADCAST_F32X2(a) =>
      emitValDef(sym, s"_mm256_broadcast_f32x2(${quote(a)})")
    case MM256_MASK_BROADCAST_F32X2(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_f32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_F32X2(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_f32x2(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
