package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51205 extends IntrinsicsBase {
  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_TERNARYLOGIC_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 64-bit granularity (64-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASK_TERNARYLOGIC_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 64-bit granularity (64-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_TERNARYLOGIC_EPI64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI32_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RCP14_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m512d
   */
  case class MM512_RCP14_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RCP14_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RCP14_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m512
   */
  case class MM512_RCP14_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * maximum relative error for this approximation is less than 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RCP14_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RCP14_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128d, b: __m128d
   */
  case class MM_RCP14_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RCP14_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RCP14_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * The maximum relative error for this approximation is less than 2^-14.
   * a: __m128, b: __m128
   */
  case class MM_RCP14_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_ROUNDSCALE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_ROUNDSCALE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_ROUNDSCALE_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASKZ_ROUNDSCALE_ROUND_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_ROUNDSCALE_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512d, imm8: int, rounding: int
   */
  case class MM512_ROUNDSCALE_ROUND_PD(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASK_ROUNDSCALE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_ROUNDSCALE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASKZ_ROUNDSCALE_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_ROUNDSCALE_ROUND_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_ROUNDSCALE_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512, imm8: int, rounding: int
   */
  case class MM512_ROUNDSCALE_ROUND_PS(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper element from "b" to the upper
   * element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_MASK_ROUNDSCALE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper element from "b" to the upper
   * element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_ROUNDSCALE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_MASKZ_ROUNDSCALE_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "b" to the upper element of
   * "dst".
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASKZ_ROUNDSCALE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_ROUNDSCALE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper element from "b" to the upper element of
   * "dst".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_ROUNDSCALE_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper 3 packed elements from "b" to the
   * upper elements of "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: const int, rounding: const int
   */
  case class MM_MASK_ROUNDSCALE_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper 3 packed elements from "b" to the
   * upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_ROUNDSCALE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, imm8: const int, rounding: const int
   */
  case class MM_MASKZ_ROUNDSCALE_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASKZ_ROUNDSCALE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, imm8: const int, rounding: const int
   */
  case class MM_ROUNDSCALE_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_ROUNDSCALE_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-14.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RSQRT14_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-14.
   * a: __m512d
   */
  case class MM512_RSQRT14_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-14.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RSQRT14_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-14.
   * a: __m512
   */
  case class MM512_RSQRT14_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RSQRT14_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RSQRT14_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-14.
   * a: __m128d, b: __m128d
   */
  case class MM_RSQRT14_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * than 2^-14.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RSQRT14_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RSQRT14_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * 2^-14.
   * a: __m128, b: __m128
   */
  case class MM_RSQRT14_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_SCALEF_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_SCALEF_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_SCALEF_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_SCALEF_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_SCALEF_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_SCALEF_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_SCALEF_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_SCALEF_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_SCALEF_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_SCALEF_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_SCALEF_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_SCALEF_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper element from "b" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SCALEF_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_SCALEF_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SCALEF_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper element from "b" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_SCALEF_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper element from "b" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SCALEF_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_SCALEF_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper 3 packed elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SCALEF_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SCALEF_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SCALEF_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SCALEF_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "b" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_SCALEF_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m512i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m256, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m512i, a: __m256, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_F32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_F32X4(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512, imm8: const int
   */
  case class MM512_SHUFFLE_F32X4(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_F64X2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_F64X2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_SHUFFLE_F64X2(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_I32X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_I32X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_SHUFFLE_I32X4(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_I64X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_I64X2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_SHUFFLE_I64X2(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_SHUFFLE_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m512, b: __m512, imm8: const int
   */
  case class MM512_SHUFFLE_PS(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SQRT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_SQRT_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	[round_note].
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_SQRT_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SQRT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * 	[round_note].
   * a: __m512d, rounding: int
   */
  case class MM512_SQRT_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_SQRT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_SQRT_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_SQRT_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_SQRT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * 	[round_note].
   * a: __m512, rounding: int
   */
  case class MM512_SQRT_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_SQRT_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SQRT_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_SQRT_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SQRT_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst", and copy the
   * upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_SQRT_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_SQRT_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SQRT_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SQRT_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SQRT_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SQRT_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_SUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_SUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_SUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_SUB_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SUB_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_SUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst", and copy the upper element from "a"
   * to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_SUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_SUB_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SUB_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_UNPACKHI_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_UNPACKHI_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_UNPACKHI_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_UNPACKHI_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512
   */
  case class MM512_UNPACKHI_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_UNPACKLO_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_UNPACKLO_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_UNPACKLO_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_UNPACKLO_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_UNPACKLO_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512
   */
  case class MM512_UNPACKLO_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m512d; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM512_CASTPD128_PD512(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256d to type __m512d; the upper 256 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256d
   */
  case class MM512_CASTPD256_PD512(a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512d to type __m128d. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512d
   */
  case class MM512_CASTPD512_PD128(a: Exp[__m512d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512 to type __m128. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS512_PS128(a: Exp[__m512]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512d to type __m256d. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512d
   */
  case class MM512_CASTPD512_PD256(a: Exp[__m512d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m512; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM512_CASTPS128_PS512(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256 to type __m512; the upper 256 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256
   */
  case class MM512_CASTPS256_PS512(a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_ternarylogic_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm512_mask_ternarylogic_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm512_ternarylogic_epi64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_TERNARYLOGIC_EPI64(a, b, c, imm8)
  }
            
  def _mm512_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_test_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TEST_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_testn_epi32_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TESTN_EPI32_MASK(a, b)
  }
            
  def _mm512_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_testn_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_unpackhi_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm512_unpackhi_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI32(a, b)
  }
            
  def _mm512_mask_unpackhi_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm512_unpackhi_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI64(a, b)
  }
            
  def _mm512_mask_unpacklo_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm512_unpacklo_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI32(a, b)
  }
            
  def _mm512_mask_unpacklo_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm512_unpacklo_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI64(a, b)
  }
            
  def _mm512_maskz_xor_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm512_maskz_xor_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm512_mask_rcp14_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RCP14_PD(src, k, a)
  }
            
  def _mm512_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm512_rcp14_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RCP14_PD(a)
  }
            
  def _mm512_mask_rcp14_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm512_maskz_rcp14_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RCP14_PS(k, a)
  }
            
  def _mm512_rcp14_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP14_PS(a)
  }
            
  def _mm_mask_rcp14_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RCP14_SD(src, k, a, b)
  }
            
  def _mm_maskz_rcp14_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP14_SD(k, a, b)
  }
            
  def _mm_rcp14_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP14_SD(a, b)
  }
            
  def _mm_mask_rcp14_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP14_SS(src, k, a, b)
  }
            
  def _mm_maskz_rcp14_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RCP14_SS(k, a, b)
  }
            
  def _mm_rcp14_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RCP14_SS(a, b)
  }
            
  def _mm512_mask_roundscale_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm512_mask_roundscale_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDSCALE_ROUND_PD(src, k, a, imm8, rounding)
  }
            
  def _mm512_maskz_roundscale_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ROUNDSCALE_PD(k, a, imm8)
  }
            
  def _mm512_maskz_roundscale_round_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ROUNDSCALE_ROUND_PD(k, a, imm8, rounding)
  }
            
  def _mm512_roundscale_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_ROUNDSCALE_PD(a, imm8)
  }
            
  def _mm512_roundscale_round_pd(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ROUNDSCALE_ROUND_PD(a, imm8, rounding)
  }
            
  def _mm512_mask_roundscale_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDSCALE_PS(src, k, a, imm8)
  }
            
  def _mm512_mask_roundscale_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDSCALE_ROUND_PS(src, k, a, imm8, rounding)
  }
            
  def _mm512_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm512_maskz_roundscale_round_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ROUNDSCALE_ROUND_PS(k, a, imm8, rounding)
  }
            
  def _mm512_roundscale_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm512_roundscale_round_ps(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDSCALE_ROUND_PS(a, imm8, rounding)
  }
            
  def _mm_mask_roundscale_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm_mask_roundscale_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_SD(src, k, a, b, imm8)
  }
            
  def _mm_maskz_roundscale_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ROUNDSCALE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_roundscale_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ROUNDSCALE_SD(k, a, b, imm8)
  }
            
  def _mm_roundscale_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_ROUNDSCALE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm_roundscale_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_ROUNDSCALE_SD(a, b, imm8)
  }
            
  def _mm_mask_roundscale_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_ROUNDSCALE_ROUND_SS(src, k, a, b, imm8, rounding)
  }
            
  def _mm_mask_roundscale_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_ROUNDSCALE_SS(src, k, a, b, imm8)
  }
            
  def _mm_maskz_roundscale_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_ROUND_SS(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_roundscale_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_SS(k, a, b, imm8)
  }
            
  def _mm_roundscale_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm_roundscale_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_SS(a, b, imm8)
  }
            
  def _mm512_mask_rsqrt14_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm512_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm512_rsqrt14_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RSQRT14_PD(a)
  }
            
  def _mm512_mask_rsqrt14_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RSQRT14_PS(src, k, a)
  }
            
  def _mm512_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm512_rsqrt14_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT14_PS(a)
  }
            
  def _mm_mask_rsqrt14_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT14_SD(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt14_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT14_SD(k, a, b)
  }
            
  def _mm_rsqrt14_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RSQRT14_SD(a, b)
  }
            
  def _mm_mask_rsqrt14_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT14_SS(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt14_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT14_SS(k, a, b)
  }
            
  def _mm_rsqrt14_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT14_SS(a, b)
  }
            
  def _mm512_mask_scalef_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm512_mask_scalef_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SCALEF_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_scalef_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_SCALEF_PD(k, a, b)
  }
            
  def _mm512_maskz_scalef_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SCALEF_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_scalef_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_SCALEF_PD(a, b)
  }
            
  def _mm512_scalef_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SCALEF_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_mask_scalef_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm512_mask_scalef_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SCALEF_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_scalef_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm512_maskz_scalef_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SCALEF_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm512_scalef_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_SCALEF_PS(a, b)
  }
            
  def _mm512_scalef_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SCALEF_ROUND_PS(a, b, rounding)
  }
            
  def _mm_mask_scalef_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SCALEF_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_scalef_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SCALEF_SD(src, k, a, b)
  }
            
  def _mm_maskz_scalef_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_scalef_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_SD(k, a, b)
  }
            
  def _mm_scalef_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_SCALEF_ROUND_SD(a, b, rounding)
  }
            
  def _mm_scalef_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SCALEF_SD(a, b)
  }
            
  def _mm_mask_scalef_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_SCALEF_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_scalef_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SCALEF_SS(src, k, a, b)
  }
            
  def _mm_maskz_scalef_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SCALEF_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_scalef_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SCALEF_SS(k, a, b)
  }
            
  def _mm_scalef_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SCALEF_ROUND_SS(a, b, rounding)
  }
            
  def _mm_scalef_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SCALEF_SS(a, b)
  }
            
  def _mm512_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_shuffle_f32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SHUFFLE_F32X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_f32x4(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SHUFFLE_F32X4(k, a, b, imm8)
  }
            
  def _mm512_shuffle_f32x4(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_SHUFFLE_F32X4(a, b, imm8)
  }
            
  def _mm512_mask_shuffle_f64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SHUFFLE_F64X2(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_f64x2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SHUFFLE_F64X2(k, a, b, imm8)
  }
            
  def _mm512_shuffle_f64x2(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_SHUFFLE_F64X2(a, b, imm8)
  }
            
  def _mm512_mask_shuffle_i32x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_I32X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_i32x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_I32X4(k, a, b, imm8)
  }
            
  def _mm512_shuffle_i32x4(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLE_I32X4(a, b, imm8)
  }
            
  def _mm512_mask_shuffle_i64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_I64X2(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_i64x2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_I64X2(k, a, b, imm8)
  }
            
  def _mm512_shuffle_i64x2(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLE_I64X2(a, b, imm8)
  }
            
  def _mm512_mask_shuffle_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm512_shuffle_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_SHUFFLE_PD(a, b, imm8)
  }
            
  def _mm512_mask_shuffle_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SHUFFLE_PS(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm512_shuffle_ps(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_SHUFFLE_PS(a, b, imm8)
  }
            
  def _mm512_mask_sqrt_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm512_mask_sqrt_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SQRT_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm512_maskz_sqrt_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SQRT_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_sqrt_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SQRT_PD(a)
  }
            
  def _mm512_sqrt_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SQRT_ROUND_PD(a, rounding)
  }
            
  def _mm512_mask_sqrt_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SQRT_PS(src, k, a)
  }
            
  def _mm512_mask_sqrt_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SQRT_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm512_maskz_sqrt_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SQRT_ROUND_PS(k, a, rounding)
  }
            
  def _mm512_sqrt_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SQRT_PS(a)
  }
            
  def _mm512_sqrt_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SQRT_ROUND_PS(a, rounding)
  }
            
  def _mm_mask_sqrt_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SQRT_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_sqrt_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SQRT_SD(src, k, a, b)
  }
            
  def _mm_maskz_sqrt_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SQRT_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_sqrt_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SQRT_SD(k, a, b)
  }
            
  def _mm_sqrt_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_SQRT_ROUND_SD(a, b, rounding)
  }
            
  def _mm_mask_sqrt_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_SQRT_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_sqrt_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SQRT_SS(src, k, a, b)
  }
            
  def _mm_maskz_sqrt_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SQRT_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_sqrt_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SQRT_SS(k, a, b)
  }
            
  def _mm_sqrt_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SQRT_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_maskz_sub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_SUB_PD(k, a, b)
  }
            
  def _mm512_maskz_sub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SUB_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_maskz_sub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm512_maskz_sub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SUB_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm_mask_sub_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SUB_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_sub_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SUB_SD(src, k, a, b)
  }
            
  def _mm_maskz_sub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SUB_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_sub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SUB_SD(k, a, b)
  }
            
  def _mm_sub_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_SUB_ROUND_SD(a, b, rounding)
  }
            
  def _mm_mask_sub_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_SUB_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_sub_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SUB_SS(src, k, a, b)
  }
            
  def _mm_maskz_sub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SUB_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_sub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SUB_SS(k, a, b)
  }
            
  def _mm_sub_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SUB_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_mask_unpackhi_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm512_unpackhi_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_UNPACKHI_PD(a, b)
  }
            
  def _mm512_mask_unpackhi_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_UNPACKHI_PS(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm512_unpackhi_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_UNPACKHI_PS(a, b)
  }
            
  def _mm512_mask_unpacklo_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_UNPACKLO_PD(k, a, b)
  }
            
  def _mm512_unpacklo_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_UNPACKLO_PD(a, b)
  }
            
  def _mm512_mask_unpacklo_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm512_maskz_unpacklo_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_UNPACKLO_PS(k, a, b)
  }
            
  def _mm512_unpacklo_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_UNPACKLO_PS(a, b)
  }
            
  def _mm512_castpd128_pd512(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_CASTPD128_PD512(a)
  }
            
  def _mm512_castpd256_pd512(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_CASTPD256_PD512(a)
  }
            
  def _mm512_castpd512_pd128(a: Exp[__m512d]): Exp[__m128d] = {
    MM512_CASTPD512_PD128(a)
  }
            
  def _mm512_castps512_ps128(a: Exp[__m512]): Exp[__m128] = {
    MM512_CASTPS512_PS128(a)
  }
            
  def _mm512_castpd512_pd256(a: Exp[__m512d]): Exp[__m256d] = {
    MM512_CASTPD512_PD256(a)
  }
            
  def _mm512_castps128_ps512(a: Exp[__m128]): Exp[__m512] = {
    MM512_CASTPS128_PS512(a)
  }
            
  def _mm512_castps256_ps512(a: Exp[__m256]): Exp[__m512] = {
    MM512_CASTPS256_PS512(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm512_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM512_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm512_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm512_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_TERNARYLOGIC_EPI64 (a, b, c, imm8) =>
      _mm512_ternarylogic_epi64(f(a), f(b), f(c), f(imm8))
    case MM512_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm512_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM512_TEST_EPI64_MASK (a, b) =>
      _mm512_test_epi64_mask(f(a), f(b))
    case MM512_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm512_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM512_TESTN_EPI32_MASK (a, b) =>
      _mm512_testn_epi32_mask(f(a), f(b))
    case MM512_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm512_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM512_TESTN_EPI64_MASK (a, b) =>
      _mm512_testn_epi64_mask(f(a), f(b))
    case MM512_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm512_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM512_UNPACKHI_EPI32 (a, b) =>
      _mm512_unpackhi_epi32(f(a), f(b))
    case MM512_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm512_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM512_UNPACKHI_EPI64 (a, b) =>
      _mm512_unpackhi_epi64(f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI32 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm512_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM512_UNPACKLO_EPI32 (a, b) =>
      _mm512_unpacklo_epi32(f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm512_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case MM512_UNPACKLO_EPI64 (a, b) =>
      _mm512_unpacklo_epi64(f(a), f(b))
    case MM512_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm512_maskz_xor_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm512_maskz_xor_epi64(f(k), f(a), f(b))
    case MM512_MASK_RCP14_PD (src, k, a) =>
      _mm512_mask_rcp14_pd(f(src), f(k), f(a))
    case MM512_MASKZ_RCP14_PD (k, a) =>
      _mm512_maskz_rcp14_pd(f(k), f(a))
    case MM512_RCP14_PD (a) =>
      _mm512_rcp14_pd(f(a))
    case MM512_MASK_RCP14_PS (src, k, a) =>
      _mm512_mask_rcp14_ps(f(src), f(k), f(a))
    case MM512_MASKZ_RCP14_PS (k, a) =>
      _mm512_maskz_rcp14_ps(f(k), f(a))
    case MM512_RCP14_PS (a) =>
      _mm512_rcp14_ps(f(a))
    case MM_MASK_RCP14_SD (src, k, a, b) =>
      _mm_mask_rcp14_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RCP14_SD (k, a, b) =>
      _mm_maskz_rcp14_sd(f(k), f(a), f(b))
    case MM_RCP14_SD (a, b) =>
      _mm_rcp14_sd(f(a), f(b))
    case MM_MASK_RCP14_SS (src, k, a, b) =>
      _mm_mask_rcp14_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RCP14_SS (k, a, b) =>
      _mm_maskz_rcp14_ss(f(k), f(a), f(b))
    case MM_RCP14_SS (a, b) =>
      _mm_rcp14_ss(f(a), f(b))
    case MM512_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm512_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_ROUNDSCALE_ROUND_PD (src, k, a, imm8, rounding) =>
      _mm512_mask_roundscale_round_pd(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_MASKZ_ROUNDSCALE_PD (k, a, imm8) =>
      _mm512_maskz_roundscale_pd(f(k), f(a), f(imm8))
    case MM512_MASKZ_ROUNDSCALE_ROUND_PD (k, a, imm8, rounding) =>
      _mm512_maskz_roundscale_round_pd(f(k), f(a), f(imm8), f(rounding))
    case MM512_ROUNDSCALE_PD (a, imm8) =>
      _mm512_roundscale_pd(f(a), f(imm8))
    case MM512_ROUNDSCALE_ROUND_PD (a, imm8, rounding) =>
      _mm512_roundscale_round_pd(f(a), f(imm8), f(rounding))
    case MM512_MASK_ROUNDSCALE_PS (src, k, a, imm8) =>
      _mm512_mask_roundscale_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_ROUNDSCALE_ROUND_PS (src, k, a, imm8, rounding) =>
      _mm512_mask_roundscale_round_ps(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm512_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM512_MASKZ_ROUNDSCALE_ROUND_PS (k, a, imm8, rounding) =>
      _mm512_maskz_roundscale_round_ps(f(k), f(a), f(imm8), f(rounding))
    case MM512_ROUNDSCALE_PS (a, imm8) =>
      _mm512_roundscale_ps(f(a), f(imm8))
    case MM512_ROUNDSCALE_ROUND_PS (a, imm8, rounding) =>
      _mm512_roundscale_round_ps(f(a), f(imm8), f(rounding))
    case MM_MASK_ROUNDSCALE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_roundscale_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_ROUNDSCALE_SD (src, k, a, b, imm8) =>
      _mm_mask_roundscale_sd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_ROUNDSCALE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_roundscale_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_ROUNDSCALE_SD (k, a, b, imm8) =>
      _mm_maskz_roundscale_sd(f(k), f(a), f(b), f(imm8))
    case MM_ROUNDSCALE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_roundscale_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM_ROUNDSCALE_SD (a, b, imm8) =>
      _mm_roundscale_sd(f(a), f(b), f(imm8))
    case MM_MASK_ROUNDSCALE_ROUND_SS (src, k, a, b, imm8, rounding) =>
      _mm_mask_roundscale_round_ss(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_ROUNDSCALE_SS (src, k, a, b, imm8) =>
      _mm_mask_roundscale_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_ROUNDSCALE_ROUND_SS (k, a, b, imm8, rounding) =>
      _mm_maskz_roundscale_round_ss(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_ROUNDSCALE_SS (k, a, b, imm8) =>
      _mm_maskz_roundscale_ss(f(k), f(a), f(b), f(imm8))
    case MM_ROUNDSCALE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_roundscale_round_ss(f(a), f(b), f(imm8), f(rounding))
    case MM_ROUNDSCALE_SS (a, b, imm8) =>
      _mm_roundscale_ss(f(a), f(b), f(imm8))
    case MM512_MASK_RSQRT14_PD (src, k, a) =>
      _mm512_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM512_MASKZ_RSQRT14_PD (k, a) =>
      _mm512_maskz_rsqrt14_pd(f(k), f(a))
    case MM512_RSQRT14_PD (a) =>
      _mm512_rsqrt14_pd(f(a))
    case MM512_MASK_RSQRT14_PS (src, k, a) =>
      _mm512_mask_rsqrt14_ps(f(src), f(k), f(a))
    case MM512_MASKZ_RSQRT14_PS (k, a) =>
      _mm512_maskz_rsqrt14_ps(f(k), f(a))
    case MM512_RSQRT14_PS (a) =>
      _mm512_rsqrt14_ps(f(a))
    case MM_MASK_RSQRT14_SD (src, k, a, b) =>
      _mm_mask_rsqrt14_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT14_SD (k, a, b) =>
      _mm_maskz_rsqrt14_sd(f(k), f(a), f(b))
    case MM_RSQRT14_SD (a, b) =>
      _mm_rsqrt14_sd(f(a), f(b))
    case MM_MASK_RSQRT14_SS (src, k, a, b) =>
      _mm_mask_rsqrt14_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT14_SS (k, a, b) =>
      _mm_maskz_rsqrt14_ss(f(k), f(a), f(b))
    case MM_RSQRT14_SS (a, b) =>
      _mm_rsqrt14_ss(f(a), f(b))
    case MM512_MASK_SCALEF_PD (src, k, a, b) =>
      _mm512_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_SCALEF_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_scalef_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_SCALEF_PD (k, a, b) =>
      _mm512_maskz_scalef_pd(f(k), f(a), f(b))
    case MM512_MASKZ_SCALEF_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_scalef_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_SCALEF_PD (a, b) =>
      _mm512_scalef_pd(f(a), f(b))
    case MM512_SCALEF_ROUND_PD (a, b, rounding) =>
      _mm512_scalef_round_pd(f(a), f(b), f(rounding))
    case MM512_MASK_SCALEF_PS (src, k, a, b) =>
      _mm512_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_SCALEF_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_scalef_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_SCALEF_PS (k, a, b) =>
      _mm512_maskz_scalef_ps(f(k), f(a), f(b))
    case MM512_MASKZ_SCALEF_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_scalef_round_ps(f(k), f(a), f(b), f(rounding))
    case MM512_SCALEF_PS (a, b) =>
      _mm512_scalef_ps(f(a), f(b))
    case MM512_SCALEF_ROUND_PS (a, b, rounding) =>
      _mm512_scalef_round_ps(f(a), f(b), f(rounding))
    case MM_MASK_SCALEF_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_scalef_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SCALEF_SD (src, k, a, b) =>
      _mm_mask_scalef_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SCALEF_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_scalef_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SCALEF_SD (k, a, b) =>
      _mm_maskz_scalef_sd(f(k), f(a), f(b))
    case MM_SCALEF_ROUND_SD (a, b, rounding) =>
      _mm_scalef_round_sd(f(a), f(b), f(rounding))
    case MM_SCALEF_SD (a, b) =>
      _mm_scalef_sd(f(a), f(b))
    case MM_MASK_SCALEF_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_scalef_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SCALEF_SS (src, k, a, b) =>
      _mm_mask_scalef_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SCALEF_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_scalef_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SCALEF_SS (k, a, b) =>
      _mm_maskz_scalef_ss(f(k), f(a), f(b))
    case MM_SCALEF_ROUND_SS (a, b, rounding) =>
      _mm_scalef_round_ss(f(a), f(b), f(rounding))
    case MM_SCALEF_SS (a, b) =>
      _mm_scalef_ss(f(a), f(b))
    case iDef@MM512_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_f32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_f32x4(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_F32X4 (a, b, imm8) =>
      _mm512_shuffle_f32x4(f(a), f(b), f(imm8))
    case MM512_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_f64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_f64x2(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_F64X2 (a, b, imm8) =>
      _mm512_shuffle_f64x2(f(a), f(b), f(imm8))
    case MM512_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_i32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_i32x4(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_I32X4 (a, b, imm8) =>
      _mm512_shuffle_i32x4(f(a), f(b), f(imm8))
    case MM512_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_i64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_i64x2(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_I64X2 (a, b, imm8) =>
      _mm512_shuffle_i64x2(f(a), f(b), f(imm8))
    case MM512_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm512_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_PD (a, b, imm8) =>
      _mm512_shuffle_pd(f(a), f(b), f(imm8))
    case MM512_MASK_SHUFFLE_PS (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm512_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM512_SHUFFLE_PS (a, b, imm8) =>
      _mm512_shuffle_ps(f(a), f(b), f(imm8))
    case MM512_MASK_SQRT_PD (src, k, a) =>
      _mm512_mask_sqrt_pd(f(src), f(k), f(a))
    case MM512_MASK_SQRT_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_sqrt_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_SQRT_PD (k, a) =>
      _mm512_maskz_sqrt_pd(f(k), f(a))
    case MM512_MASKZ_SQRT_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_sqrt_round_pd(f(k), f(a), f(rounding))
    case MM512_SQRT_PD (a) =>
      _mm512_sqrt_pd(f(a))
    case MM512_SQRT_ROUND_PD (a, rounding) =>
      _mm512_sqrt_round_pd(f(a), f(rounding))
    case MM512_MASK_SQRT_PS (src, k, a) =>
      _mm512_mask_sqrt_ps(f(src), f(k), f(a))
    case MM512_MASK_SQRT_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_sqrt_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_SQRT_PS (k, a) =>
      _mm512_maskz_sqrt_ps(f(k), f(a))
    case MM512_MASKZ_SQRT_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_sqrt_round_ps(f(k), f(a), f(rounding))
    case MM512_SQRT_PS (a) =>
      _mm512_sqrt_ps(f(a))
    case MM512_SQRT_ROUND_PS (a, rounding) =>
      _mm512_sqrt_round_ps(f(a), f(rounding))
    case MM_MASK_SQRT_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_sqrt_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SQRT_SD (src, k, a, b) =>
      _mm_mask_sqrt_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SQRT_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_sqrt_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SQRT_SD (k, a, b) =>
      _mm_maskz_sqrt_sd(f(k), f(a), f(b))
    case MM_SQRT_ROUND_SD (a, b, rounding) =>
      _mm_sqrt_round_sd(f(a), f(b), f(rounding))
    case MM_MASK_SQRT_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_sqrt_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SQRT_SS (src, k, a, b) =>
      _mm_mask_sqrt_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SQRT_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_sqrt_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SQRT_SS (k, a, b) =>
      _mm_maskz_sqrt_ss(f(k), f(a), f(b))
    case MM_SQRT_ROUND_SS (a, b, rounding) =>
      _mm_sqrt_round_ss(f(a), f(b), f(rounding))
    case MM512_MASKZ_SUB_PD (k, a, b) =>
      _mm512_maskz_sub_pd(f(k), f(a), f(b))
    case MM512_MASKZ_SUB_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_sub_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_SUB_PS (k, a, b) =>
      _mm512_maskz_sub_ps(f(k), f(a), f(b))
    case MM512_MASKZ_SUB_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_sub_round_ps(f(k), f(a), f(b), f(rounding))
    case MM_MASK_SUB_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_sub_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SUB_SD (src, k, a, b) =>
      _mm_mask_sub_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_sub_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SUB_SD (k, a, b) =>
      _mm_maskz_sub_sd(f(k), f(a), f(b))
    case MM_SUB_ROUND_SD (a, b, rounding) =>
      _mm_sub_round_sd(f(a), f(b), f(rounding))
    case MM_MASK_SUB_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_sub_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_SUB_SS (src, k, a, b) =>
      _mm_mask_sub_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_sub_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SUB_SS (k, a, b) =>
      _mm_maskz_sub_ss(f(k), f(a), f(b))
    case MM_SUB_ROUND_SS (a, b, rounding) =>
      _mm_sub_round_ss(f(a), f(b), f(rounding))
    case MM512_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm512_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm512_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM512_UNPACKHI_PD (a, b) =>
      _mm512_unpackhi_pd(f(a), f(b))
    case MM512_MASK_UNPACKHI_PS (src, k, a, b) =>
      _mm512_mask_unpackhi_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm512_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM512_UNPACKHI_PS (a, b) =>
      _mm512_unpackhi_ps(f(a), f(b))
    case MM512_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm512_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_PD (k, a, b) =>
      _mm512_maskz_unpacklo_pd(f(k), f(a), f(b))
    case MM512_UNPACKLO_PD (a, b) =>
      _mm512_unpacklo_pd(f(a), f(b))
    case MM512_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm512_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_PS (k, a, b) =>
      _mm512_maskz_unpacklo_ps(f(k), f(a), f(b))
    case MM512_UNPACKLO_PS (a, b) =>
      _mm512_unpacklo_ps(f(a), f(b))
    case MM512_CASTPD128_PD512 (a) =>
      _mm512_castpd128_pd512(f(a))
    case MM512_CASTPD256_PD512 (a) =>
      _mm512_castpd256_pd512(f(a))
    case MM512_CASTPD512_PD128 (a) =>
      _mm512_castpd512_pd128(f(a))
    case MM512_CASTPS512_PS128 (a) =>
      _mm512_castps512_ps128(f(a))
    case MM512_CASTPD512_PD256 (a) =>
      _mm512_castpd512_pd256(f(a))
    case MM512_CASTPS128_PS512 (a) =>
      _mm512_castps128_ps512(f(a))
    case MM512_CASTPS256_PS512 (a) =>
      _mm512_castps256_ps512(f(a))

    case Reflect(MM512_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TERNARYLOGIC_EPI64 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_TERNARYLOGIC_EPI64 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_ROUND_PD (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_ROUND_PD (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PD (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PD (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_ROUND_PD (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_ROUND_PD (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_ROUND_PS (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_ROUND_PS (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PS (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PS (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_ROUND_PS (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_ROUND_PS (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_SD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_SD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_SD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_SD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_ROUND_SS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_ROUND_SS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_SS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_SS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT14_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT14_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT14_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT14_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_F32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_F32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_F32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_F32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_F64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_F64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_F64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_F64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_I32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_I32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_I32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_I32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_I64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_I64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_I64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_I64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SUB_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SUB_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD128_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD128_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD256_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD256_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD512_PD128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD512_PD128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS512_PS128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS512_PS128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD512_PD256 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD512_PD256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS128_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS128_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS256_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS256_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51205 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      emitValDef(sym, s"_mm512_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM512_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm512_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM512_TERNARYLOGIC_EPI64(a, b, c, imm8) =>
      emitValDef(sym, s"_mm512_ternarylogic_epi64(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM512_MASK_TEST_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TEST_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm512_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TESTN_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm512_testn_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_TESTN_EPI64_MASK(a, b) =>
      emitValDef(sym, s"_mm512_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_epi32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_EPI32(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_epi32(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_XOR_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_XOR_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_RCP14_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rcp14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RCP14_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case MM512_RCP14_PD(a) =>
      emitValDef(sym, s"_mm512_rcp14_pd(${quote(a)})")
    case MM512_MASK_RCP14_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RCP14_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rcp14_ps(${quote(k)}, ${quote(a)})")
    case MM512_RCP14_PS(a) =>
      emitValDef(sym, s"_mm512_rcp14_ps(${quote(a)})")
    case MM_MASK_RCP14_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rcp14_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RCP14_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rcp14_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RCP14_SD(a, b) =>
      emitValDef(sym, s"_mm_rcp14_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_RCP14_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rcp14_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RCP14_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rcp14_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RCP14_SS(a, b) =>
      emitValDef(sym, s"_mm_rcp14_ss(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_ROUNDSCALE_ROUND_PD(src, k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_roundscale_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_ROUNDSCALE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_roundscale_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_ROUNDSCALE_ROUND_PD(k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_roundscale_round_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_ROUNDSCALE_PD(a, imm8) =>
      emitValDef(sym, s"_mm512_roundscale_pd(${quote(a)}, ${quote(imm8)})")
    case MM512_ROUNDSCALE_ROUND_PD(a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_roundscale_round_pd(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASK_ROUNDSCALE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_roundscale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_ROUNDSCALE_ROUND_PS(src, k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_roundscale_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_ROUNDSCALE_ROUND_PS(k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_roundscale_round_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_ROUNDSCALE_PS(a, imm8) =>
      emitValDef(sym, s"_mm512_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case MM512_ROUNDSCALE_ROUND_PS(a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_roundscale_round_ps(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_ROUNDSCALE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_roundscale_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_ROUNDSCALE_SD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_roundscale_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_ROUNDSCALE_ROUND_SD(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_roundscale_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_ROUNDSCALE_SD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_roundscale_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_ROUNDSCALE_ROUND_SD(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_roundscale_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_ROUNDSCALE_SD(a, b, imm8) =>
      emitValDef(sym, s"_mm_roundscale_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_ROUNDSCALE_ROUND_SS(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_roundscale_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_ROUNDSCALE_SS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_roundscale_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_ROUNDSCALE_ROUND_SS(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_roundscale_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_ROUNDSCALE_SS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_roundscale_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_ROUNDSCALE_ROUND_SS(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_roundscale_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_ROUNDSCALE_SS(a, b, imm8) =>
      emitValDef(sym, s"_mm_roundscale_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_RSQRT14_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RSQRT14_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case MM512_RSQRT14_PD(a) =>
      emitValDef(sym, s"_mm512_rsqrt14_pd(${quote(a)})")
    case MM512_MASK_RSQRT14_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_rsqrt14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_RSQRT14_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case MM512_RSQRT14_PS(a) =>
      emitValDef(sym, s"_mm512_rsqrt14_ps(${quote(a)})")
    case MM_MASK_RSQRT14_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rsqrt14_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RSQRT14_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rsqrt14_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RSQRT14_SD(a, b) =>
      emitValDef(sym, s"_mm_rsqrt14_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_RSQRT14_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rsqrt14_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RSQRT14_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rsqrt14_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RSQRT14_SS(a, b) =>
      emitValDef(sym, s"_mm_rsqrt14_ss(${quote(a)}, ${quote(b)})")
    case MM512_MASK_SCALEF_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SCALEF_ROUND_PD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_scalef_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASKZ_SCALEF_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_scalef_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SCALEF_ROUND_PD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_scalef_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_SCALEF_PD(a, b) =>
      emitValDef(sym, s"_mm512_scalef_pd(${quote(a)}, ${quote(b)})")
    case MM512_SCALEF_ROUND_PD(a, b, rounding) =>
      emitValDef(sym, s"_mm512_scalef_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_SCALEF_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SCALEF_ROUND_PS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_mask_scalef_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASKZ_SCALEF_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SCALEF_ROUND_PS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_scalef_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_SCALEF_PS(a, b) =>
      emitValDef(sym, s"_mm512_scalef_ps(${quote(a)}, ${quote(b)})")
    case MM512_SCALEF_ROUND_PS(a, b, rounding) =>
      emitValDef(sym, s"_mm512_scalef_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SCALEF_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_scalef_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SCALEF_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_scalef_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SCALEF_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_scalef_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SCALEF_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_scalef_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SCALEF_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_scalef_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_SCALEF_SD(a, b) =>
      emitValDef(sym, s"_mm_scalef_sd(${quote(a)}, ${quote(b)})")
    case MM_MASK_SCALEF_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_scalef_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SCALEF_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_scalef_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SCALEF_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_scalef_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SCALEF_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_scalef_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SCALEF_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_scalef_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_SCALEF_SS(a, b) =>
      emitValDef(sym, s"_mm_scalef_ss(${quote(a)}, ${quote(b)})")
    case MM512_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_mask_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_mask_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm512_mask_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM512_MASK_SHUFFLE_F32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_F32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_f32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_F32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_f32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLE_F64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_F64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_f64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_F64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_f64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLE_I32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_I32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_i32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_I32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_i32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLE_I64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_I64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_i64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_I64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_i64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_PD(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_shuffle_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_SHUFFLE_PS(a, b, imm8) =>
      emitValDef(sym, s"_mm512_shuffle_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_SQRT_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_SQRT_ROUND_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_sqrt_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_SQRT_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_SQRT_ROUND_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_sqrt_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_SQRT_PD(a) =>
      emitValDef(sym, s"_mm512_sqrt_pd(${quote(a)})")
    case MM512_SQRT_ROUND_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_sqrt_round_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_SQRT_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_sqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_SQRT_ROUND_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_sqrt_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_SQRT_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_SQRT_ROUND_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_sqrt_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_SQRT_PS(a) =>
      emitValDef(sym, s"_mm512_sqrt_ps(${quote(a)})")
    case MM512_SQRT_ROUND_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_sqrt_round_ps(${quote(a)}, ${quote(rounding)})")
    case MM_MASK_SQRT_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_sqrt_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SQRT_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sqrt_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SQRT_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_sqrt_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SQRT_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sqrt_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SQRT_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_sqrt_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SQRT_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_sqrt_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SQRT_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sqrt_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SQRT_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_sqrt_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SQRT_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sqrt_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SQRT_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_sqrt_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASKZ_SUB_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_sub_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUB_ROUND_PD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_sub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASKZ_SUB_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUB_ROUND_PS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_sub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SUB_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_sub_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SUB_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_sub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SUB_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SUB_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_sub_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SUB_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_sub_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_SUB_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_sub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_SUB_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SUB_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_sub_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASK_UNPACKHI_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_PD(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_pd(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKHI_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKHI_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKHI_PS(a, b) =>
      emitValDef(sym, s"_mm512_unpackhi_ps(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_PD(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_pd(${quote(a)}, ${quote(b)})")
    case MM512_MASK_UNPACKLO_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_UNPACKLO_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_unpacklo_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_UNPACKLO_PS(a, b) =>
      emitValDef(sym, s"_mm512_unpacklo_ps(${quote(a)}, ${quote(b)})")
    case MM512_CASTPD128_PD512(a) =>
      emitValDef(sym, s"_mm512_castpd128_pd512(${quote(a)})")
    case MM512_CASTPD256_PD512(a) =>
      emitValDef(sym, s"_mm512_castpd256_pd512(${quote(a)})")
    case MM512_CASTPD512_PD128(a) =>
      emitValDef(sym, s"_mm512_castpd512_pd128(${quote(a)})")
    case MM512_CASTPS512_PS128(a) =>
      emitValDef(sym, s"_mm512_castps512_ps128(${quote(a)})")
    case MM512_CASTPD512_PD256(a) =>
      emitValDef(sym, s"_mm512_castpd512_pd256(${quote(a)})")
    case MM512_CASTPS128_PS512(a) =>
      emitValDef(sym, s"_mm512_castps128_ps512(${quote(a)})")
    case MM512_CASTPS256_PS512(a) =>
      emitValDef(sym, s"_mm512_castps256_ps512(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
