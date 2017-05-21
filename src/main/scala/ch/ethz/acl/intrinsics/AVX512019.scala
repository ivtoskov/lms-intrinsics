package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512019 extends IntrinsicsBase {
  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_REDUCE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_REDUCE_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASKZ_REDUCE_ROUND_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_REDUCE_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * 	[round_note]
   * a: __m512d, imm8: int, rounding: int
   */
  case class MM512_REDUCE_ROUND_PD(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_REDUCE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASKZ_REDUCE_PD(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m128d, imm8: int
   */
  case class MM_REDUCE_PD(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_REDUCE_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASKZ_REDUCE_PS(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_REDUCE_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASK_REDUCE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_REDUCE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASKZ_REDUCE_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_REDUCE_ROUND_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_REDUCE_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * 	[round_note]
   * a: __m512, imm8: int, rounding: int
   */
  case class MM512_REDUCE_ROUND_PS(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_REDUCE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASKZ_REDUCE_PS(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m128, imm8: int
   */
  case class MM_REDUCE_PS(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "b" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASK_REDUCE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "b" to the upper element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASK_REDUCE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "b" to
   * the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_REDUCE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "b" to
   * the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASKZ_REDUCE_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper element from "b"
   * to the upper element of "dst".
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_REDUCE_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper element from "b"
   * to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_REDUCE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_REDUCE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "b" to the upper elements of "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASK_REDUCE_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "b" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_REDUCE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "b" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASKZ_REDUCE_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "b" to the upper elements of "dst".
   * a: __m128, b: __m128, imm8: int
   */
  case class MM_REDUCE_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "b" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_REDUCE_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
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
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_ROUNDSCALE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
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
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_ROUNDSCALE_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_ROUNDSCALE_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
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
   * src: __m128d, k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_ROUNDSCALE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASKZ_ROUNDSCALE_PD(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m128d, imm8: int
   */
  case class MM_ROUNDSCALE_PD(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * src: __m256, k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_ROUNDSCALE_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
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
   * k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASKZ_ROUNDSCALE_PS(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_ROUNDSCALE_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
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
   * src: __m128, k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_ROUNDSCALE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
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
   * k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASKZ_ROUNDSCALE_PS(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m128, imm8: int
   */
  case class MM_ROUNDSCALE_PS(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
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
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_RSQRT14_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_RSQRT14_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_RSQRT14_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_RSQRT14_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_SCALEF_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_SCALEF_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_SCALEF_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SCALEF_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SCALEF_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SCALEF_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_SCALEF_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_SCALEF_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SCALEF_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_SCALEF_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * base_addr: void*, vindex: __m128i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, vindex: __m256i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, vindex: __m256i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
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
   * src: __m256, k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_F32X4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_F32X4(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in
   * "dst".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_SHUFFLE_F32X4(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_F64X2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_F64X2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_SHUFFLE_F64X2(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_I32X4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_I32X4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_SHUFFLE_I32X4(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_I64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_I64X2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_SHUFFLE_I64X2(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_SHUFFLE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_SHUFFLE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASKZ_SHUFFLE_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_SQRT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_SQRT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_SQRT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_SQRT_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_SUB_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_SUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SUB_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_SUB_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SUB_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
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
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_UNPACKHI_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_UNPACKHI_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_UNPACKHI_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_UNPACKHI_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_UNPACKHI_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_UNPACKHI_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_UNPACKLO_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_UNPACKLO_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_UNPACKLO_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_UNPACKLO_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_UNPACKLO_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_UNPACKLO_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_UNPACKLO_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_UNPACKLO_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_XOR_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_XOR_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_XOR_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_XOR_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_XOR_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_XOR_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_XOR_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_XOR_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MADD52LO_EPU64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask8, b: __m512i, c: __m512i
   */
  case class MM512_MASK_MADD52LO_EPU64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MADD52LO_EPU64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, b: __m256i, c: __m256i
   */
  case class MM256_MASK_MADD52LO_EPU64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MADD52LO_EPU64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, b: __m128i, c: __m128i
   */
  case class MM_MASK_MADD52LO_EPU64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MADD52HI_EPU64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask8, b: __m512i, c: __m512i
   */
  case class MM512_MASK_MADD52HI_EPU64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MADD52HI_EPU64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, b: __m256i, c: __m256i
   */
  case class MM256_MASK_MADD52HI_EPU64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MADD52HI_EPU64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, b: __m128i, c: __m128i
   */
  case class MM_MASK_MADD52HI_EPU64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULTISHIFT_EPI64_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULTISHIFT_EPI64_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULTISHIFT_EPI64_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI8(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI8(src: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_reduce_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_REDUCE_ROUND_PD(src, k, a, imm8, rounding)
  }
            
  def _mm512_maskz_reduce_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_REDUCE_PD(k, a, imm8)
  }
            
  def _mm512_maskz_reduce_round_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_REDUCE_ROUND_PD(k, a, imm8, rounding)
  }
            
  def _mm512_reduce_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_REDUCE_PD(a, imm8)
  }
            
  def _mm512_reduce_round_pd(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_REDUCE_ROUND_PD(a, imm8, rounding)
  }
            
  def _mm_mask_reduce_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  def _mm_maskz_reduce_pd(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_REDUCE_PD(k, a, imm8)
  }
            
  def _mm_reduce_pd(a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_PD(a, imm8)
  }
            
  def _mm256_mask_reduce_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm256_maskz_reduce_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm256_reduce_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_REDUCE_PS(a, imm8)
  }
            
  def _mm512_mask_reduce_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm512_mask_reduce_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_REDUCE_ROUND_PS(src, k, a, imm8, rounding)
  }
            
  def _mm512_maskz_reduce_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm512_maskz_reduce_round_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_REDUCE_ROUND_PS(k, a, imm8, rounding)
  }
            
  def _mm512_reduce_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_REDUCE_PS(a, imm8)
  }
            
  def _mm512_reduce_round_ps(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_REDUCE_ROUND_PS(a, imm8, rounding)
  }
            
  def _mm_mask_reduce_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm_maskz_reduce_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm_reduce_ps(a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_REDUCE_PS(a, imm8)
  }
            
  def _mm_mask_reduce_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_SD(src, k, a, b, imm8)
  }
            
  def _mm_mask_reduce_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_reduce_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_REDUCE_SD(k, a, b, imm8)
  }
            
  def _mm_maskz_reduce_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_REDUCE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm_reduce_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_SD(a, b, imm8)
  }
            
  def _mm_reduce_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm_mask_reduce_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_REDUCE_SS(src, k, a, b, imm8)
  }
            
  def _mm_mask_reduce_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_REDUCE_ROUND_SS(src, k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_reduce_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_SS(k, a, b, imm8)
  }
            
  def _mm_maskz_reduce_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_ROUND_SS(k, a, b, imm8, rounding)
  }
            
  def _mm_reduce_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_REDUCE_SS(a, b, imm8)
  }
            
  def _mm_reduce_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_REDUCE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm256_mask_roundscale_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm256_maskz_roundscale_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_ROUNDSCALE_PD(k, a, imm8)
  }
            
  def _mm256_roundscale_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_ROUNDSCALE_PD(a, imm8)
  }
            
  def _mm_mask_roundscale_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm_maskz_roundscale_pd(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ROUNDSCALE_PD(k, a, imm8)
  }
            
  def _mm_roundscale_pd(a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_ROUNDSCALE_PD(a, imm8)
  }
            
  def _mm256_mask_roundscale_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_ROUNDSCALE_PS(src, k, a, imm8)
  }
            
  def _mm256_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm256_roundscale_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm_mask_roundscale_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_ROUNDSCALE_PS(src, k, a, imm8)
  }
            
  def _mm_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm_roundscale_ps(a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm256_mask_rsqrt14_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm256_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm_mask_rsqrt14_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm256_mask_rsqrt14_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_RSQRT14_PS(src, k, a)
  }
            
  def _mm256_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm_mask_rsqrt14_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT14_PS(src, k, a)
  }
            
  def _mm_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm256_mask_scalef_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm256_maskz_scalef_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SCALEF_PD(k, a, b)
  }
            
  def _mm256_scalef_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_SCALEF_PD(a, b)
  }
            
  def _mm_mask_scalef_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm_maskz_scalef_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_PD(k, a, b)
  }
            
  def _mm_scalef_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SCALEF_PD(a, b)
  }
            
  def _mm256_mask_scalef_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm256_maskz_scalef_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm256_scalef_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_SCALEF_PS(a, b)
  }
            
  def _mm_mask_scalef_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm_maskz_scalef_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm_scalef_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SCALEF_PS(a, b)
  }
            
  def _mm256_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_shuffle_f32x4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_SHUFFLE_F32X4(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_f32x4(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_SHUFFLE_F32X4(k, a, b, imm8)
  }
            
  def _mm256_shuffle_f32x4(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_SHUFFLE_F32X4(a, b, imm8)
  }
            
  def _mm256_mask_shuffle_f64x2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_SHUFFLE_F64X2(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_f64x2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_SHUFFLE_F64X2(k, a, b, imm8)
  }
            
  def _mm256_shuffle_f64x2(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_SHUFFLE_F64X2(a, b, imm8)
  }
            
  def _mm256_mask_shuffle_i32x4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_I32X4(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_i32x4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_I32X4(k, a, b, imm8)
  }
            
  def _mm256_shuffle_i32x4(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLE_I32X4(a, b, imm8)
  }
            
  def _mm256_mask_shuffle_i64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_I64X2(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_i64x2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_I64X2(k, a, b, imm8)
  }
            
  def _mm256_shuffle_i64x2(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLE_I64X2(a, b, imm8)
  }
            
  def _mm256_mask_shuffle_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm_mask_shuffle_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm256_mask_shuffle_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_SHUFFLE_PS(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm_mask_shuffle_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_SHUFFLE_PS(src, k, a, b, imm8)
  }
            
  def _mm_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm256_mask_sqrt_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm256_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm_mask_sqrt_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm256_mask_sqrt_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SQRT_PS(src, k, a)
  }
            
  def _mm256_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm_mask_sqrt_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SQRT_PS(src, k, a)
  }
            
  def _mm_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm256_mask_sub_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SUB_PD(src, k, a, b)
  }
            
  def _mm256_maskz_sub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SUB_PD(k, a, b)
  }
            
  def _mm_mask_sub_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SUB_PD(src, k, a, b)
  }
            
  def _mm_maskz_sub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SUB_PD(k, a, b)
  }
            
  def _mm256_mask_sub_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SUB_PS(src, k, a, b)
  }
            
  def _mm256_maskz_sub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm_mask_sub_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SUB_PS(src, k, a, b)
  }
            
  def _mm_maskz_sub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm256_mask_unpackhi_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm_mask_unpackhi_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm256_mask_unpackhi_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_UNPACKHI_PS(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm_mask_unpackhi_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_UNPACKHI_PS(src, k, a, b)
  }
            
  def _mm_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm256_mask_unpacklo_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_UNPACKLO_PD(k, a, b)
  }
            
  def _mm_mask_unpacklo_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_UNPACKLO_PD(k, a, b)
  }
            
  def _mm256_mask_unpacklo_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm256_maskz_unpacklo_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_UNPACKLO_PS(k, a, b)
  }
            
  def _mm_mask_unpacklo_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm_maskz_unpacklo_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_UNPACKLO_PS(k, a, b)
  }
            
  def _mm256_mask_xor_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm256_maskz_xor_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm512_mask_xor_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm512_maskz_xor_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm512_xor_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_XOR_PD(a, b)
  }
            
  def _mm_mask_xor_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm_maskz_xor_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm256_mask_xor_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_XOR_PS(src, k, a, b)
  }
            
  def _mm256_maskz_xor_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm512_mask_xor_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_XOR_PS(src, k, a, b)
  }
            
  def _mm512_maskz_xor_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm512_xor_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_XOR_PS(a, b)
  }
            
  def _mm_mask_xor_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_XOR_PS(src, k, a, b)
  }
            
  def _mm_maskz_xor_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm512_madd52lo_epu64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm512_mask_madd52lo_epu64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm512_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm256_madd52lo_epu64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm256_mask_madd52lo_epu64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm256_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm_madd52lo_epu64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm_mask_madd52lo_epu64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm512_madd52hi_epu64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD52HI_EPU64(a, b, c)
  }
            
  def _mm512_mask_madd52hi_epu64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm512_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm256_madd52hi_epu64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADD52HI_EPU64(a, b, c)
  }
            
  def _mm256_mask_madd52hi_epu64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm256_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm_madd52hi_epu64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MADD52HI_EPU64(a, b, c)
  }
            
  def _mm_mask_madd52hi_epu64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm512_multishift_epi64_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm512_mask_multishift_epi64_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_multishift_epi64_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm256_multishift_epi64_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm256_mask_multishift_epi64_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_multishift_epi64_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm_multishift_epi64_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm_mask_multishift_epi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_multishift_epi64_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm512_permutexvar_epi8(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm512_mask_permutexvar_epi8(src: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_REDUCE_ROUND_PD (src, k, a, imm8, rounding) =>
      _mm512_mask_reduce_round_pd(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_MASKZ_REDUCE_PD (k, a, imm8) =>
      _mm512_maskz_reduce_pd(f(k), f(a), f(imm8))
    case MM512_MASKZ_REDUCE_ROUND_PD (k, a, imm8, rounding) =>
      _mm512_maskz_reduce_round_pd(f(k), f(a), f(imm8), f(rounding))
    case MM512_REDUCE_PD (a, imm8) =>
      _mm512_reduce_pd(f(a), f(imm8))
    case MM512_REDUCE_ROUND_PD (a, imm8, rounding) =>
      _mm512_reduce_round_pd(f(a), f(imm8), f(rounding))
    case MM_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm_mask_reduce_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_REDUCE_PD (k, a, imm8) =>
      _mm_maskz_reduce_pd(f(k), f(a), f(imm8))
    case MM_REDUCE_PD (a, imm8) =>
      _mm_reduce_pd(f(a), f(imm8))
    case MM256_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm256_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm256_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM256_REDUCE_PS (a, imm8) =>
      _mm256_reduce_ps(f(a), f(imm8))
    case MM512_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm512_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_REDUCE_ROUND_PS (src, k, a, imm8, rounding) =>
      _mm512_mask_reduce_round_ps(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm512_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM512_MASKZ_REDUCE_ROUND_PS (k, a, imm8, rounding) =>
      _mm512_maskz_reduce_round_ps(f(k), f(a), f(imm8), f(rounding))
    case MM512_REDUCE_PS (a, imm8) =>
      _mm512_reduce_ps(f(a), f(imm8))
    case MM512_REDUCE_ROUND_PS (a, imm8, rounding) =>
      _mm512_reduce_round_ps(f(a), f(imm8), f(rounding))
    case MM_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM_REDUCE_PS (a, imm8) =>
      _mm_reduce_ps(f(a), f(imm8))
    case MM_MASK_REDUCE_SD (src, k, a, b, imm8) =>
      _mm_mask_reduce_sd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_REDUCE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_reduce_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_REDUCE_SD (k, a, b, imm8) =>
      _mm_maskz_reduce_sd(f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_REDUCE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_reduce_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_REDUCE_SD (a, b, imm8) =>
      _mm_reduce_sd(f(a), f(b), f(imm8))
    case MM_REDUCE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_reduce_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_REDUCE_SS (src, k, a, b, imm8) =>
      _mm_mask_reduce_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_REDUCE_ROUND_SS (src, k, a, b, imm8, rounding) =>
      _mm_mask_reduce_round_ss(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_REDUCE_SS (k, a, b, imm8) =>
      _mm_maskz_reduce_ss(f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_REDUCE_ROUND_SS (k, a, b, imm8, rounding) =>
      _mm_maskz_reduce_round_ss(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_REDUCE_SS (a, b, imm8) =>
      _mm_reduce_ss(f(a), f(b), f(imm8))
    case MM_REDUCE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_reduce_round_ss(f(a), f(b), f(imm8), f(rounding))
    case MM256_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm256_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROUNDSCALE_PD (k, a, imm8) =>
      _mm256_maskz_roundscale_pd(f(k), f(a), f(imm8))
    case MM256_ROUNDSCALE_PD (a, imm8) =>
      _mm256_roundscale_pd(f(a), f(imm8))
    case MM_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROUNDSCALE_PD (k, a, imm8) =>
      _mm_maskz_roundscale_pd(f(k), f(a), f(imm8))
    case MM_ROUNDSCALE_PD (a, imm8) =>
      _mm_roundscale_pd(f(a), f(imm8))
    case MM256_MASK_ROUNDSCALE_PS (src, k, a, imm8) =>
      _mm256_mask_roundscale_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm256_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM256_ROUNDSCALE_PS (a, imm8) =>
      _mm256_roundscale_ps(f(a), f(imm8))
    case MM_MASK_ROUNDSCALE_PS (src, k, a, imm8) =>
      _mm_mask_roundscale_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM_ROUNDSCALE_PS (a, imm8) =>
      _mm_roundscale_ps(f(a), f(imm8))
    case MM256_MASK_RSQRT14_PD (src, k, a) =>
      _mm256_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM256_MASKZ_RSQRT14_PD (k, a) =>
      _mm256_maskz_rsqrt14_pd(f(k), f(a))
    case MM_MASK_RSQRT14_PD (src, k, a) =>
      _mm_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM_MASKZ_RSQRT14_PD (k, a) =>
      _mm_maskz_rsqrt14_pd(f(k), f(a))
    case MM256_MASK_RSQRT14_PS (src, k, a) =>
      _mm256_mask_rsqrt14_ps(f(src), f(k), f(a))
    case MM256_MASKZ_RSQRT14_PS (k, a) =>
      _mm256_maskz_rsqrt14_ps(f(k), f(a))
    case MM_MASK_RSQRT14_PS (src, k, a) =>
      _mm_mask_rsqrt14_ps(f(src), f(k), f(a))
    case MM_MASKZ_RSQRT14_PS (k, a) =>
      _mm_maskz_rsqrt14_ps(f(k), f(a))
    case MM256_MASK_SCALEF_PD (src, k, a, b) =>
      _mm256_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SCALEF_PD (k, a, b) =>
      _mm256_maskz_scalef_pd(f(k), f(a), f(b))
    case MM256_SCALEF_PD (a, b) =>
      _mm256_scalef_pd(f(a), f(b))
    case MM_MASK_SCALEF_PD (src, k, a, b) =>
      _mm_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SCALEF_PD (k, a, b) =>
      _mm_maskz_scalef_pd(f(k), f(a), f(b))
    case MM_SCALEF_PD (a, b) =>
      _mm_scalef_pd(f(a), f(b))
    case MM256_MASK_SCALEF_PS (src, k, a, b) =>
      _mm256_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SCALEF_PS (k, a, b) =>
      _mm256_maskz_scalef_ps(f(k), f(a), f(b))
    case MM256_SCALEF_PS (a, b) =>
      _mm256_scalef_ps(f(a), f(b))
    case MM_MASK_SCALEF_PS (src, k, a, b) =>
      _mm_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SCALEF_PS (k, a, b) =>
      _mm_maskz_scalef_ps(f(k), f(a), f(b))
    case MM_SCALEF_PS (a, b) =>
      _mm_scalef_ps(f(a), f(b))
    case iDef@MM256_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_f32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_f32x4(f(k), f(a), f(b), f(imm8))
    case MM256_SHUFFLE_F32X4 (a, b, imm8) =>
      _mm256_shuffle_f32x4(f(a), f(b), f(imm8))
    case MM256_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_f64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_f64x2(f(k), f(a), f(b), f(imm8))
    case MM256_SHUFFLE_F64X2 (a, b, imm8) =>
      _mm256_shuffle_f64x2(f(a), f(b), f(imm8))
    case MM256_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_i32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_i32x4(f(k), f(a), f(b), f(imm8))
    case MM256_SHUFFLE_I32X4 (a, b, imm8) =>
      _mm256_shuffle_i32x4(f(a), f(b), f(imm8))
    case MM256_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_i64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_i64x2(f(k), f(a), f(b), f(imm8))
    case MM256_SHUFFLE_I64X2 (a, b, imm8) =>
      _mm256_shuffle_i64x2(f(a), f(b), f(imm8))
    case MM256_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm256_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_SHUFFLE_PS (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm256_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM_MASK_SHUFFLE_PS (src, k, a, b, imm8) =>
      _mm_mask_shuffle_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_SQRT_PD (src, k, a) =>
      _mm256_mask_sqrt_pd(f(src), f(k), f(a))
    case MM256_MASKZ_SQRT_PD (k, a) =>
      _mm256_maskz_sqrt_pd(f(k), f(a))
    case MM_MASK_SQRT_PD (src, k, a) =>
      _mm_mask_sqrt_pd(f(src), f(k), f(a))
    case MM_MASKZ_SQRT_PD (k, a) =>
      _mm_maskz_sqrt_pd(f(k), f(a))
    case MM256_MASK_SQRT_PS (src, k, a) =>
      _mm256_mask_sqrt_ps(f(src), f(k), f(a))
    case MM256_MASKZ_SQRT_PS (k, a) =>
      _mm256_maskz_sqrt_ps(f(k), f(a))
    case MM_MASK_SQRT_PS (src, k, a) =>
      _mm_mask_sqrt_ps(f(src), f(k), f(a))
    case MM_MASKZ_SQRT_PS (k, a) =>
      _mm_maskz_sqrt_ps(f(k), f(a))
    case MM256_MASK_SUB_PD (src, k, a, b) =>
      _mm256_mask_sub_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_PD (k, a, b) =>
      _mm256_maskz_sub_pd(f(k), f(a), f(b))
    case MM_MASK_SUB_PD (src, k, a, b) =>
      _mm_mask_sub_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_PD (k, a, b) =>
      _mm_maskz_sub_pd(f(k), f(a), f(b))
    case MM256_MASK_SUB_PS (src, k, a, b) =>
      _mm256_mask_sub_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_PS (k, a, b) =>
      _mm256_maskz_sub_ps(f(k), f(a), f(b))
    case MM_MASK_SUB_PS (src, k, a, b) =>
      _mm_mask_sub_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_PS (k, a, b) =>
      _mm_maskz_sub_ps(f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm256_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm256_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_PS (src, k, a, b) =>
      _mm256_mask_unpackhi_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm256_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM_MASK_UNPACKHI_PS (src, k, a, b) =>
      _mm_mask_unpackhi_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm256_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_PD (k, a, b) =>
      _mm256_maskz_unpacklo_pd(f(k), f(a), f(b))
    case MM_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_PD (k, a, b) =>
      _mm_maskz_unpacklo_pd(f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm256_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_PS (k, a, b) =>
      _mm256_maskz_unpacklo_ps(f(k), f(a), f(b))
    case MM_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_UNPACKLO_PS (k, a, b) =>
      _mm_maskz_unpacklo_ps(f(k), f(a), f(b))
    case MM256_MASK_XOR_PD (src, k, a, b) =>
      _mm256_mask_xor_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_XOR_PD (k, a, b) =>
      _mm256_maskz_xor_pd(f(k), f(a), f(b))
    case MM512_MASK_XOR_PD (src, k, a, b) =>
      _mm512_mask_xor_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_XOR_PD (k, a, b) =>
      _mm512_maskz_xor_pd(f(k), f(a), f(b))
    case MM512_XOR_PD (a, b) =>
      _mm512_xor_pd(f(a), f(b))
    case MM_MASK_XOR_PD (src, k, a, b) =>
      _mm_mask_xor_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_PD (k, a, b) =>
      _mm_maskz_xor_pd(f(k), f(a), f(b))
    case MM256_MASK_XOR_PS (src, k, a, b) =>
      _mm256_mask_xor_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_XOR_PS (k, a, b) =>
      _mm256_maskz_xor_ps(f(k), f(a), f(b))
    case MM512_MASK_XOR_PS (src, k, a, b) =>
      _mm512_mask_xor_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_XOR_PS (k, a, b) =>
      _mm512_maskz_xor_ps(f(k), f(a), f(b))
    case MM512_XOR_PS (a, b) =>
      _mm512_xor_ps(f(a), f(b))
    case MM_MASK_XOR_PS (src, k, a, b) =>
      _mm_mask_xor_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_PS (k, a, b) =>
      _mm_maskz_xor_ps(f(k), f(a), f(b))
    case MM512_MADD52LO_EPU64 (a, b, c) =>
      _mm512_madd52lo_epu64(f(a), f(b), f(c))
    case MM512_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm512_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm512_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM256_MADD52LO_EPU64 (a, b, c) =>
      _mm256_madd52lo_epu64(f(a), f(b), f(c))
    case MM256_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm256_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm256_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM_MADD52LO_EPU64 (a, b, c) =>
      _mm_madd52lo_epu64(f(a), f(b), f(c))
    case MM_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM512_MADD52HI_EPU64 (a, b, c) =>
      _mm512_madd52hi_epu64(f(a), f(b), f(c))
    case MM512_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm512_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm512_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM256_MADD52HI_EPU64 (a, b, c) =>
      _mm256_madd52hi_epu64(f(a), f(b), f(c))
    case MM256_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm256_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm256_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM_MADD52HI_EPU64 (a, b, c) =>
      _mm_madd52hi_epu64(f(a), f(b), f(c))
    case MM_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM512_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm512_multishift_epi64_epi8(f(a), f(b))
    case MM512_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm512_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm512_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case MM256_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm256_multishift_epi64_epi8(f(a), f(b))
    case MM256_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm256_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm256_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case MM_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm_multishift_epi64_epi8(f(a), f(b))
    case MM_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case MM512_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm512_permutexvar_epi8(f(idx), f(a))
    case MM512_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))

    case Reflect(MM512_MASK_REDUCE_ROUND_PD (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_ROUND_PD (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_ROUND_PD (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_ROUND_PD (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ROUND_PD (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ROUND_PD (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REDUCE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_REDUCE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_ROUND_PS (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_ROUND_PS (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_ROUND_PS (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_ROUND_PS (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ROUND_PS (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ROUND_PS (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_SD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_SD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_SD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_SD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_ROUND_SS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_ROUND_SS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_ROUND_SS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_ROUND_SS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_SS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_SS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROUNDSCALE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROUNDSCALE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUNDSCALE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROUNDSCALE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROUNDSCALE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROUNDSCALE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RSQRT14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RSQRT14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SCALEF_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SCALEF_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_F32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_F32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_F32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_F32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_F64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_F64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_F64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_F64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_I32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_I32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_I32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_I32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_I64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_I64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_I64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_I64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_XOR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_XOR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_XOR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_XOR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_XOR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_XOR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512019 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_MASK_REDUCE_ROUND_PD(src, k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_reduce_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_REDUCE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_reduce_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_REDUCE_ROUND_PD(k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_reduce_round_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_REDUCE_PD(a, imm8) =>
      emitValDef(sym, s"_mm512_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case MM512_REDUCE_ROUND_PD(a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_reduce_round_pd(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_REDUCE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_REDUCE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_reduce_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_REDUCE_PD(a, imm8) =>
      emitValDef(sym, s"_mm_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_REDUCE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_REDUCE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_REDUCE_PS(a, imm8) =>
      emitValDef(sym, s"_mm256_reduce_ps(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_REDUCE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_REDUCE_ROUND_PS(src, k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_mask_reduce_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_MASKZ_REDUCE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_REDUCE_ROUND_PS(k, a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_maskz_reduce_round_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM512_REDUCE_PS(a, imm8) =>
      emitValDef(sym, s"_mm512_reduce_ps(${quote(a)}, ${quote(imm8)})")
    case MM512_REDUCE_ROUND_PS(a, imm8, rounding) =>
      emitValDef(sym, s"_mm512_reduce_round_ps(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_REDUCE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_REDUCE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_REDUCE_PS(a, imm8) =>
      emitValDef(sym, s"_mm_reduce_ps(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_REDUCE_SD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_reduce_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_REDUCE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_reduce_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_REDUCE_SD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_reduce_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_REDUCE_ROUND_SD(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_reduce_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_REDUCE_SD(a, b, imm8) =>
      emitValDef(sym, s"_mm_reduce_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_REDUCE_ROUND_SD(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_reduce_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASK_REDUCE_SS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_reduce_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_REDUCE_ROUND_SS(src, k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_mask_reduce_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_MASKZ_REDUCE_SS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_reduce_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_REDUCE_ROUND_SS(k, a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_maskz_reduce_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM_REDUCE_SS(a, b, imm8) =>
      emitValDef(sym, s"_mm_reduce_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_REDUCE_ROUND_SS(a, b, imm8, rounding) =>
      emitValDef(sym, s"_mm_reduce_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case MM256_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROUNDSCALE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_roundscale_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROUNDSCALE_PD(a, imm8) =>
      emitValDef(sym, s"_mm256_roundscale_pd(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROUNDSCALE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_roundscale_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROUNDSCALE_PD(a, imm8) =>
      emitValDef(sym, s"_mm_roundscale_pd(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_ROUNDSCALE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_roundscale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROUNDSCALE_PS(a, imm8) =>
      emitValDef(sym, s"_mm256_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROUNDSCALE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_roundscale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROUNDSCALE_PS(a, imm8) =>
      emitValDef(sym, s"_mm_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_RSQRT14_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_RSQRT14_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case MM_MASK_RSQRT14_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_RSQRT14_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_RSQRT14_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_rsqrt14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_RSQRT14_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_RSQRT14_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_rsqrt14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_RSQRT14_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_SCALEF_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SCALEF_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_scalef_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_SCALEF_PD(a, b) =>
      emitValDef(sym, s"_mm256_scalef_pd(${quote(a)}, ${quote(b)})")
    case MM_MASK_SCALEF_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SCALEF_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_scalef_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SCALEF_PD(a, b) =>
      emitValDef(sym, s"_mm_scalef_pd(${quote(a)}, ${quote(b)})")
    case MM256_MASK_SCALEF_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SCALEF_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_SCALEF_PS(a, b) =>
      emitValDef(sym, s"_mm256_scalef_ps(${quote(a)}, ${quote(b)})")
    case MM_MASK_SCALEF_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SCALEF_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_SCALEF_PS(a, b) =>
      emitValDef(sym, s"_mm_scalef_ps(${quote(a)}, ${quote(b)})")
    case MM256_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i32scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i32scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i32scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i32scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i32scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i64scatter_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i64scatter_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_SHUFFLE_F32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_F32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_f32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_SHUFFLE_F32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm256_shuffle_f32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLE_F64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_F64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_f64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_SHUFFLE_F64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm256_shuffle_f64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLE_I32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_I32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_i32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_SHUFFLE_I32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm256_shuffle_i32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLE_I64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_I64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_i64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_SHUFFLE_I64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm256_shuffle_i64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_SHUFFLE_PS(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_shuffle_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_SQRT_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SQRT_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case MM_MASK_SQRT_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SQRT_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_SQRT_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_sqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SQRT_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_SQRT_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_sqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SQRT_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_SUB_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUB_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKHI_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKHI_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKHI_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKHI_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_UNPACKLO_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_UNPACKLO_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_unpacklo_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_UNPACKLO_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_UNPACKLO_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_unpacklo_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_XOR_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_XOR_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_XOR_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_XOR_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_XOR_PD(a, b) =>
      emitValDef(sym, s"_mm512_xor_pd(${quote(a)}, ${quote(b)})")
    case MM_MASK_XOR_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_XOR_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_XOR_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_xor_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_XOR_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_XOR_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_xor_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_XOR_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_XOR_PS(a, b) =>
      emitValDef(sym, s"_mm512_xor_ps(${quote(a)}, ${quote(b)})")
    case MM_MASK_XOR_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_xor_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_XOR_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MADD52LO_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm512_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_MADD52LO_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MADD52LO_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm256_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK_MADD52LO_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MADD52LO_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK_MADD52LO_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MADD52HI_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm512_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASK_MADD52HI_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm512_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM512_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm512_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MADD52HI_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm256_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK_MADD52HI_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MADD52HI_EPU64(a, b, c) =>
      emitValDef(sym, s"_mm_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK_MADD52HI_EPU64(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM512_MULTISHIFT_EPI64_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MULTISHIFT_EPI64_EPI8(a, b) =>
      emitValDef(sym, s"_mm256_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MULTISHIFT_EPI64_EPI8(a, b) =>
      emitValDef(sym, s"_mm_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_PERMUTEXVAR_EPI8(idx, a) =>
      emitValDef(sym, s"_mm512_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case MM512_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      emitValDef(sym, s"_mm512_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
