package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX51209 extends IntrinsicsBase {
  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMADDSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMADDSUB_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMADDSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADDSUB_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMADDSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMADDSUB_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMADDSUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMADDSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMADDSUB_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADDSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMSUB_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUB_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMSUB_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUB_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMSUBADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMSUBADD_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMSUBADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMSUBADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUBADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMSUBADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMSUBADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMSUBADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMSUBADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMSUBADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUBADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMSUBADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FNMADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FNMADD_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FNMADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FNMADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FNMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FNMSUB_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FNMSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMSUB_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMSUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FNMSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FNMSUB_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMSUB_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m256d, imm8: int
   */
  case class MM256_FPCLASS_PD_MASK(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_FPCLASS_PD_MASK(k1: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m512d, imm8: int
   */
  case class MM512_FPCLASS_PD_MASK(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_FPCLASS_PD_MASK(k1: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128d, imm8: int
   */
  case class MM_FPCLASS_PD_MASK(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_FPCLASS_PD_MASK(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m256, imm8: int
   */
  case class MM256_FPCLASS_PS_MASK(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_FPCLASS_PS_MASK(k1: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m512, imm8: int
   */
  case class MM512_FPCLASS_PS_MASK(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASK_FPCLASS_PS_MASK(k1: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128, imm8: int
   */
  case class MM_FPCLASS_PS_MASK(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_FPCLASS_PS_MASK(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower double-precision (64-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128d, imm8: int
   */
  case class MM_FPCLASS_SD_MASK(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower double-precision (64-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k" using zeromask "k1" (the element is zeroed out when mask bit 0 is not
   * set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_FPCLASS_SD_MASK(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower single-precision (32-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k.
   * 	[fpclass_note]
   * a: __m128, imm8: int
   */
  case class MM_FPCLASS_SS_MASK(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower single-precision (32-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k" using zeromask "k1" (the element is zeroed out when mask bit 0 is not
   * set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_FPCLASS_SS_MASK(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256d, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m256d
   */
  case class MM256_GETEXP_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_GETEXP_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_GETEXP_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m128d
   */
  case class MM_GETEXP_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_GETEXP_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_GETEXP_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m256
   */
  case class MM256_GETEXP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_GETEXP_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_GETEXP_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m128
   */
  case class MM_GETEXP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_GETEXP_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_GETEXP_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_GETMANT_PD(a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m256d, k: __mmask8, a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASK_GETMANT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASKZ_GETMANT_PD(k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_PD(a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m128d, k: __mmask8, a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_PD(k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_GETMANT_PS(a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m256, k: __mmask8, a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASK_GETMANT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_PS(a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m128, k: __mmask8, a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256, b: __m128, imm8: int
   */
  case class MM256_INSERTF32X4(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m128, imm8: int
   */
  case class MM256_MASK_INSERTF32X4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m128, imm8: int
   */
  case class MM256_MASKZ_INSERTF32X4(k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512, b: __m256, imm8: int
   */
  case class MM512_INSERTF32X8(a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m256, imm8: int
   */
  case class MM512_MASK_INSERTF32X8(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m256, imm8: int
   */
  case class MM512_MASKZ_INSERTF32X8(k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256d, b: __m128d, imm8: int
   */
  case class MM256_INSERTF64X2(a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m128d, imm8: int
   */
  case class MM256_MASK_INSERTF64X2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m128d, imm8: int
   */
  case class MM256_MASKZ_INSERTF64X2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512d, b: __m128d, imm8: int
   */
  case class MM512_INSERTF64X2(a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m128d, imm8: int
   */
  case class MM512_MASK_INSERTF64X2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m128d, imm8: int
   */
  case class MM512_MASKZ_INSERTF64X2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_INSERTI32X4(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASK_INSERTI32X4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASKZ_INSERTI32X4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_INSERTI32X8(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASK_INSERTI32X8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASKZ_INSERTI32X8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_INSERTI64X2(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASK_INSERTI64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASKZ_INSERTI64X2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_INSERTI64X2(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASK_INSERTI64X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASKZ_INSERTI64X2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_MAX_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MAX_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_MAX_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_MAX_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MAX_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MAX_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_MIN_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_MIN_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MIN_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MIN_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_MIN_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MIN_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * src: __m256d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_MOV_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 32-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m256d, mem_addrOffset: int
   */
  case class MM256_MASK_STORE_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * src: __m128d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_MOV_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASK_STORE_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * src: __m256, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_MOV_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 32-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m256, mem_addrOffset: int
   */
  case class MM256_MASK_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * src: __m128, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_MOV_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128, mem_addrOffset: int
   */
  case class MM_MASK_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMADD_PS(a, b, c, k)
  }
            
  def _mm256_mask_fmadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm_mask3_fmadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADD_PS(a, b, c, k)
  }
            
  def _mm_mask_fmadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm256_mask3_fmaddsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm256_mask_fmaddsub_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm_mask3_fmaddsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm_mask_fmaddsub_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fmaddsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm256_mask_fmaddsub_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fmaddsub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMADDSUB_PS(k, a, b, c)
  }
            
  def _mm_mask3_fmaddsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm_mask_fmaddsub_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm_maskz_fmaddsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADDSUB_PS(k, a, b, c)
  }
            
  def _mm256_mask3_fmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMSUB_PD(a, b, c, k)
  }
            
  def _mm256_mask_fmsub_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMSUB_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm_mask3_fmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_PD(a, b, c, k)
  }
            
  def _mm_mask_fmsub_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUB_PD(a, k, b, c)
  }
            
  def _mm_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMSUB_PS(a, b, c, k)
  }
            
  def _mm256_mask_fmsub_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMSUB_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm_mask3_fmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_PS(a, b, c, k)
  }
            
  def _mm_mask_fmsub_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUB_PS(a, k, b, c)
  }
            
  def _mm_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm256_mask3_fmsubadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm256_mask_fmsubadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fmsubadd_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMSUBADD_PD(k, a, b, c)
  }
            
  def _mm_mask3_fmsubadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm_mask_fmsubadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm_maskz_fmsubadd_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMSUBADD_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fmsubadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm256_mask_fmsubadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fmsubadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMSUBADD_PS(k, a, b, c)
  }
            
  def _mm_mask3_fmsubadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm_mask_fmsubadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm_maskz_fmsubadd_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMSUBADD_PS(k, a, b, c)
  }
            
  def _mm256_mask3_fnmadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm256_mask_fnmadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FNMADD_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm_mask3_fnmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm_mask_fnmadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMADD_PD(a, k, b, c)
  }
            
  def _mm_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fnmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm256_mask_fnmadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm_mask3_fnmadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm_mask_fnmadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm256_mask3_fnmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FNMSUB_PD(a, b, c, k)
  }
            
  def _mm256_mask_fnmsub_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FNMSUB_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm_mask3_fnmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_PD(a, b, c, k)
  }
            
  def _mm_mask_fnmsub_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMSUB_PD(a, k, b, c)
  }
            
  def _mm_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm256_mask3_fnmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm256_mask_fnmsub_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FNMSUB_PS(a, k, b, c)
  }
            
  def _mm256_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm_mask3_fnmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm_mask_fnmsub_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMSUB_PS(a, k, b, c)
  }
            
  def _mm_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm256_fpclass_pd_mask(a: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_FPCLASS_PD_MASK(a, imm8)
  }
            
  def _mm256_mask_fpclass_pd_mask(k1: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_FPCLASS_PD_MASK(k1, a, imm8)
  }
            
  def _mm512_fpclass_pd_mask(a: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_FPCLASS_PD_MASK(a, imm8)
  }
            
  def _mm512_mask_fpclass_pd_mask(k1: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_FPCLASS_PD_MASK(k1, a, imm8)
  }
            
  def _mm_fpclass_pd_mask(a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_PD_MASK(a, imm8)
  }
            
  def _mm_mask_fpclass_pd_mask(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_PD_MASK(k1, a, imm8)
  }
            
  def _mm256_fpclass_ps_mask(a: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm256_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm512_fpclass_ps_mask(a: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm512_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm_fpclass_ps_mask(a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm_fpclass_sd_mask(a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_SD_MASK(a, imm8)
  }
            
  def _mm_mask_fpclass_sd_mask(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_SD_MASK(k1, a, imm8)
  }
            
  def _mm_fpclass_ss_mask(a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_SS_MASK(a, imm8)
  }
            
  def _mm_mask_fpclass_ss_mask(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_SS_MASK(k1, a, imm8)
  }
            
  def _mm256_mmask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i32gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i32gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mmask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_getexp_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_GETEXP_PD(a)
  }
            
  def _mm256_mask_getexp_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm256_maskz_getexp_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_GETEXP_PD(k, a)
  }
            
  def _mm_getexp_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_GETEXP_PD(a)
  }
            
  def _mm_mask_getexp_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm_maskz_getexp_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_PD(k, a)
  }
            
  def _mm256_getexp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_GETEXP_PS(a)
  }
            
  def _mm256_mask_getexp_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm256_maskz_getexp_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_GETEXP_PS(k, a)
  }
            
  def _mm_getexp_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_GETEXP_PS(a)
  }
            
  def _mm_mask_getexp_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm_maskz_getexp_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_GETEXP_PS(k, a)
  }
            
  def _mm256_getmant_pd(a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_GETMANT_PD(a, interv, sc)
  }
            
  def _mm256_mask_getmant_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_GETMANT_PD(src, k, a, interv, sc)
  }
            
  def _mm256_maskz_getmant_pd(k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_GETMANT_PD(k, a, interv, sc)
  }
            
  def _mm_getmant_pd(a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_PD(a, interv, sc)
  }
            
  def _mm_mask_getmant_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_PD(src, k, a, interv, sc)
  }
            
  def _mm_maskz_getmant_pd(k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_PD(k, a, interv, sc)
  }
            
  def _mm256_getmant_ps(a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_GETMANT_PS(a, interv, sc)
  }
            
  def _mm256_mask_getmant_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm256_maskz_getmant_ps(k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm_getmant_ps(a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_GETMANT_PS(a, interv, sc)
  }
            
  def _mm_mask_getmant_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm_maskz_getmant_ps(k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm256_insertf32x4(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_INSERTF32X4(a, b, imm8)
  }
            
  def _mm256_mask_insertf32x4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_INSERTF32X4(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_insertf32x4(k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_INSERTF32X4(k, a, b, imm8)
  }
            
  def _mm512_insertf32x8(a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_INSERTF32X8(a, b, imm8)
  }
            
  def _mm512_mask_insertf32x8(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_INSERTF32X8(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_insertf32x8(k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_INSERTF32X8(k, a, b, imm8)
  }
            
  def _mm256_insertf64x2(a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_INSERTF64X2(a, b, imm8)
  }
            
  def _mm256_mask_insertf64x2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_INSERTF64X2(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_insertf64x2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_INSERTF64X2(k, a, b, imm8)
  }
            
  def _mm512_insertf64x2(a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_INSERTF64X2(a, b, imm8)
  }
            
  def _mm512_mask_insertf64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_INSERTF64X2(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_insertf64x2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_INSERTF64X2(k, a, b, imm8)
  }
            
  def _mm256_inserti32x4(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTI32X4(a, b, imm8)
  }
            
  def _mm256_mask_inserti32x4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_INSERTI32X4(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_inserti32x4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_INSERTI32X4(k, a, b, imm8)
  }
            
  def _mm512_inserti32x8(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI32X8(a, b, imm8)
  }
            
  def _mm512_mask_inserti32x8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI32X8(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_inserti32x8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI32X8(k, a, b, imm8)
  }
            
  def _mm256_inserti64x2(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTI64X2(a, b, imm8)
  }
            
  def _mm256_mask_inserti64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_INSERTI64X2(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_inserti64x2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_INSERTI64X2(k, a, b, imm8)
  }
            
  def _mm512_inserti64x2(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI64X2(a, b, imm8)
  }
            
  def _mm512_mask_inserti64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI64X2(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_inserti64x2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI64X2(k, a, b, imm8)
  }
            
  def _mm256_mask_max_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm256_maskz_max_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm_mask_max_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm_maskz_max_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm256_mask_max_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm256_maskz_max_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MAX_PS(k, a, b)
  }
            
  def _mm_mask_max_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm_maskz_max_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MAX_PS(k, a, b)
  }
            
  def _mm256_mask_min_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MIN_PD(src, k, a, b)
  }
            
  def _mm256_maskz_min_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MIN_PD(k, a, b)
  }
            
  def _mm_mask_min_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MIN_PD(src, k, a, b)
  }
            
  def _mm_maskz_min_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MIN_PD(k, a, b)
  }
            
  def _mm256_mask_min_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm256_maskz_min_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm_mask_min_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm_maskz_min_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm256_mask_load_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_mov_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MOV_PD(src, k, a)
  }
            
  def _mm256_mask_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_mov_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MOV_PD(k, a)
  }
            
  def _mm_mask_load_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_mov_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MOV_PD(src, k, a)
  }
            
  def _mm_mask_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_mov_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MOV_PD(k, a)
  }
            
  def _mm256_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_mov_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MOV_PS(src, k, a)
  }
            
  def _mm256_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_mov_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MOV_PS(k, a)
  }
            
  def _mm_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_mov_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOV_PS(src, k, a)
  }
            
  def _mm_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_mov_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOV_PS(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMADD_PS (a, b, c, k) =>
      _mm256_mask3_fmadd_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMADD_PS (a, k, b, c) =>
      _mm256_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm256_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADD_PS (a, b, c, k) =>
      _mm_mask3_fmadd_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FMADD_PS (a, k, b, c) =>
      _mm_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm256_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm256_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm256_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm256_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm256_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMADDSUB_PS (k, a, b, c) =>
      _mm256_maskz_fmaddsub_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMADDSUB_PS (k, a, b, c) =>
      _mm_maskz_fmaddsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMSUB_PD (a, b, c, k) =>
      _mm256_mask3_fmsub_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMSUB_PD (a, k, b, c) =>
      _mm256_mask_fmsub_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm256_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMSUB_PD (a, b, c, k) =>
      _mm_mask3_fmsub_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUB_PD (a, k, b, c) =>
      _mm_mask_fmsub_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMSUB_PS (a, b, c, k) =>
      _mm256_mask3_fmsub_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMSUB_PS (a, k, b, c) =>
      _mm256_mask_fmsub_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm256_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMSUB_PS (a, b, c, k) =>
      _mm_mask3_fmsub_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUB_PS (a, k, b, c) =>
      _mm_mask_fmsub_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm256_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm256_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMSUBADD_PD (k, a, b, c) =>
      _mm256_maskz_fmsubadd_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUBADD_PD (k, a, b, c) =>
      _mm_maskz_fmsubadd_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm256_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm256_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMSUBADD_PS (k, a, b, c) =>
      _mm256_maskz_fmsubadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUBADD_PS (k, a, b, c) =>
      _mm_maskz_fmsubadd_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm256_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FNMADD_PD (a, k, b, c) =>
      _mm256_mask_fnmadd_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm256_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMADD_PD (a, k, b, c) =>
      _mm_mask_fnmadd_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm256_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FNMADD_PS (a, k, b, c) =>
      _mm256_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm256_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMADD_PS (a, k, b, c) =>
      _mm_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FNMSUB_PD (a, b, c, k) =>
      _mm256_mask3_fnmsub_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FNMSUB_PD (a, k, b, c) =>
      _mm256_mask_fnmsub_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm256_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FNMSUB_PD (a, b, c, k) =>
      _mm_mask3_fnmsub_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMSUB_PD (a, k, b, c) =>
      _mm_mask_fnmsub_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm256_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_FNMSUB_PS (a, k, b, c) =>
      _mm256_mask_fnmsub_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm256_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_FNMSUB_PS (a, k, b, c) =>
      _mm_mask_fnmsub_ps(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_FPCLASS_PD_MASK (a, imm8) =>
      _mm256_fpclass_pd_mask(f(a), f(imm8))
    case MM256_MASK_FPCLASS_PD_MASK (k1, a, imm8) =>
      _mm256_mask_fpclass_pd_mask(f(k1), f(a), f(imm8))
    case MM512_FPCLASS_PD_MASK (a, imm8) =>
      _mm512_fpclass_pd_mask(f(a), f(imm8))
    case MM512_MASK_FPCLASS_PD_MASK (k1, a, imm8) =>
      _mm512_mask_fpclass_pd_mask(f(k1), f(a), f(imm8))
    case MM_FPCLASS_PD_MASK (a, imm8) =>
      _mm_fpclass_pd_mask(f(a), f(imm8))
    case MM_MASK_FPCLASS_PD_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_pd_mask(f(k1), f(a), f(imm8))
    case MM256_FPCLASS_PS_MASK (a, imm8) =>
      _mm256_fpclass_ps_mask(f(a), f(imm8))
    case MM256_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm256_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM512_FPCLASS_PS_MASK (a, imm8) =>
      _mm512_fpclass_ps_mask(f(a), f(imm8))
    case MM512_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm512_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM_FPCLASS_PS_MASK (a, imm8) =>
      _mm_fpclass_ps_mask(f(a), f(imm8))
    case MM_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM_FPCLASS_SD_MASK (a, imm8) =>
      _mm_fpclass_sd_mask(f(a), f(imm8))
    case MM_MASK_FPCLASS_SD_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_sd_mask(f(k1), f(a), f(imm8))
    case MM_FPCLASS_SS_MASK (a, imm8) =>
      _mm_fpclass_ss_mask(f(a), f(imm8))
    case MM_MASK_FPCLASS_SS_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_ss_mask(f(k1), f(a), f(imm8))
    case iDef@MM256_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_GETEXP_PD (a) =>
      _mm256_getexp_pd(f(a))
    case MM256_MASK_GETEXP_PD (src, k, a) =>
      _mm256_mask_getexp_pd(f(src), f(k), f(a))
    case MM256_MASKZ_GETEXP_PD (k, a) =>
      _mm256_maskz_getexp_pd(f(k), f(a))
    case MM_GETEXP_PD (a) =>
      _mm_getexp_pd(f(a))
    case MM_MASK_GETEXP_PD (src, k, a) =>
      _mm_mask_getexp_pd(f(src), f(k), f(a))
    case MM_MASKZ_GETEXP_PD (k, a) =>
      _mm_maskz_getexp_pd(f(k), f(a))
    case MM256_GETEXP_PS (a) =>
      _mm256_getexp_ps(f(a))
    case MM256_MASK_GETEXP_PS (src, k, a) =>
      _mm256_mask_getexp_ps(f(src), f(k), f(a))
    case MM256_MASKZ_GETEXP_PS (k, a) =>
      _mm256_maskz_getexp_ps(f(k), f(a))
    case MM_GETEXP_PS (a) =>
      _mm_getexp_ps(f(a))
    case MM_MASK_GETEXP_PS (src, k, a) =>
      _mm_mask_getexp_ps(f(src), f(k), f(a))
    case MM_MASKZ_GETEXP_PS (k, a) =>
      _mm_maskz_getexp_ps(f(k), f(a))
    case MM256_GETMANT_PD (a, interv, sc) =>
      _mm256_getmant_pd(f(a), f(interv), f(sc))
    case MM256_MASK_GETMANT_PD (src, k, a, interv, sc) =>
      _mm256_mask_getmant_pd(f(src), f(k), f(a), f(interv), f(sc))
    case MM256_MASKZ_GETMANT_PD (k, a, interv, sc) =>
      _mm256_maskz_getmant_pd(f(k), f(a), f(interv), f(sc))
    case MM_GETMANT_PD (a, interv, sc) =>
      _mm_getmant_pd(f(a), f(interv), f(sc))
    case MM_MASK_GETMANT_PD (src, k, a, interv, sc) =>
      _mm_mask_getmant_pd(f(src), f(k), f(a), f(interv), f(sc))
    case MM_MASKZ_GETMANT_PD (k, a, interv, sc) =>
      _mm_maskz_getmant_pd(f(k), f(a), f(interv), f(sc))
    case MM256_GETMANT_PS (a, interv, sc) =>
      _mm256_getmant_ps(f(a), f(interv), f(sc))
    case MM256_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm256_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM256_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm256_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM_GETMANT_PS (a, interv, sc) =>
      _mm_getmant_ps(f(a), f(interv), f(sc))
    case MM_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM256_INSERTF32X4 (a, b, imm8) =>
      _mm256_insertf32x4(f(a), f(b), f(imm8))
    case MM256_MASK_INSERTF32X4 (src, k, a, b, imm8) =>
      _mm256_mask_insertf32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_INSERTF32X4 (k, a, b, imm8) =>
      _mm256_maskz_insertf32x4(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTF32X8 (a, b, imm8) =>
      _mm512_insertf32x8(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTF32X8 (src, k, a, b, imm8) =>
      _mm512_mask_insertf32x8(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTF32X8 (k, a, b, imm8) =>
      _mm512_maskz_insertf32x8(f(k), f(a), f(b), f(imm8))
    case MM256_INSERTF64X2 (a, b, imm8) =>
      _mm256_insertf64x2(f(a), f(b), f(imm8))
    case MM256_MASK_INSERTF64X2 (src, k, a, b, imm8) =>
      _mm256_mask_insertf64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_INSERTF64X2 (k, a, b, imm8) =>
      _mm256_maskz_insertf64x2(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTF64X2 (a, b, imm8) =>
      _mm512_insertf64x2(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTF64X2 (src, k, a, b, imm8) =>
      _mm512_mask_insertf64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTF64X2 (k, a, b, imm8) =>
      _mm512_maskz_insertf64x2(f(k), f(a), f(b), f(imm8))
    case MM256_INSERTI32X4 (a, b, imm8) =>
      _mm256_inserti32x4(f(a), f(b), f(imm8))
    case MM256_MASK_INSERTI32X4 (src, k, a, b, imm8) =>
      _mm256_mask_inserti32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_INSERTI32X4 (k, a, b, imm8) =>
      _mm256_maskz_inserti32x4(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTI32X8 (a, b, imm8) =>
      _mm512_inserti32x8(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTI32X8 (src, k, a, b, imm8) =>
      _mm512_mask_inserti32x8(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTI32X8 (k, a, b, imm8) =>
      _mm512_maskz_inserti32x8(f(k), f(a), f(b), f(imm8))
    case MM256_INSERTI64X2 (a, b, imm8) =>
      _mm256_inserti64x2(f(a), f(b), f(imm8))
    case MM256_MASK_INSERTI64X2 (src, k, a, b, imm8) =>
      _mm256_mask_inserti64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_INSERTI64X2 (k, a, b, imm8) =>
      _mm256_maskz_inserti64x2(f(k), f(a), f(b), f(imm8))
    case MM512_INSERTI64X2 (a, b, imm8) =>
      _mm512_inserti64x2(f(a), f(b), f(imm8))
    case MM512_MASK_INSERTI64X2 (src, k, a, b, imm8) =>
      _mm512_mask_inserti64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTI64X2 (k, a, b, imm8) =>
      _mm512_maskz_inserti64x2(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_MAX_PD (src, k, a, b) =>
      _mm256_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_PD (k, a, b) =>
      _mm256_maskz_max_pd(f(k), f(a), f(b))
    case MM_MASK_MAX_PD (src, k, a, b) =>
      _mm_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_PD (k, a, b) =>
      _mm_maskz_max_pd(f(k), f(a), f(b))
    case MM256_MASK_MAX_PS (src, k, a, b) =>
      _mm256_mask_max_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MAX_PS (k, a, b) =>
      _mm256_maskz_max_ps(f(k), f(a), f(b))
    case MM_MASK_MAX_PS (src, k, a, b) =>
      _mm_mask_max_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_PS (k, a, b) =>
      _mm_maskz_max_ps(f(k), f(a), f(b))
    case MM256_MASK_MIN_PD (src, k, a, b) =>
      _mm256_mask_min_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_PD (k, a, b) =>
      _mm256_maskz_min_pd(f(k), f(a), f(b))
    case MM_MASK_MIN_PD (src, k, a, b) =>
      _mm_mask_min_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_PD (k, a, b) =>
      _mm_maskz_min_pd(f(k), f(a), f(b))
    case MM256_MASK_MIN_PS (src, k, a, b) =>
      _mm256_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MIN_PS (k, a, b) =>
      _mm256_maskz_min_ps(f(k), f(a), f(b))
    case MM_MASK_MIN_PS (src, k, a, b) =>
      _mm_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_PS (k, a, b) =>
      _mm_maskz_min_ps(f(k), f(a), f(b))
    case iDef@MM256_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MOV_PD (src, k, a) =>
      _mm256_mask_mov_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MOV_PD (k, a) =>
      _mm256_maskz_mov_pd(f(k), f(a))
    case iDef@MM_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_MOV_PD (src, k, a) =>
      _mm_mask_mov_pd(f(src), f(k), f(a))
    case iDef@MM_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MOV_PD (k, a) =>
      _mm_maskz_mov_pd(f(k), f(a))
    case iDef@MM256_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MOV_PS (src, k, a) =>
      _mm256_mask_mov_ps(f(src), f(k), f(a))
    case iDef@MM256_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MOV_PS (k, a) =>
      _mm256_maskz_mov_ps(f(k), f(a))
    case iDef@MM_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_MOV_PS (src, k, a) =>
      _mm_mask_mov_ps(f(src), f(k), f(a))
    case iDef@MM_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MOV_PS (k, a) =>
      _mm_maskz_mov_ps(f(k), f(a))

    case Reflect(MM_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADDSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADDSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADDSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADDSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUBADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUBADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUBADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUBADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUBADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUBADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUBADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUBADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FPCLASS_PD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FPCLASS_PD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FPCLASS_PD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FPCLASS_PD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FPCLASS_PD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FPCLASS_PD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FPCLASS_PD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FPCLASS_PD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_PD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_PD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_PD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_PD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_SD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_SD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_SD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_SD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_SS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_SS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_SS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_SS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETEXP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETEXP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETEXP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETEXP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETMANT_PD (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_GETMANT_PD (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETMANT_PD (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETMANT_PD (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETMANT_PD (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETMANT_PD (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_PD (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_PD (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_PD (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_PD (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_PD (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_PD (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETMANT_PS (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_GETMANT_PS (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_PS (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_PS (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTF32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTF32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTF32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTF32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF32X8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF32X8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF32X8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF32X8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF32X8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF32X8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTF64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTF64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTF64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTF64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTI32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTI32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTI32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTI32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTI32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTI32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI32X8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI32X8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI32X8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI32X8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI32X8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI32X8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTI64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTI64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTI64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTI64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTI64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTI64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51209 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_MASKZ_FMADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMADDSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMADDSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMADDSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMADDSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMADDSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMADDSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMADDSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmaddsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMADDSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMADDSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMADDSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmaddsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMSUBADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMSUBADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMSUBADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmsubadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMSUBADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMSUBADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMSUBADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmsubadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FMSUBADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMSUBADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMSUBADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmsubadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMSUBADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMSUBADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FMSUBADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fmsubadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FNMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FNMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fnmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FNMADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FNMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FNMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FNMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FNMADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FNMADD_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMADD_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMADD_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FNMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FNMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fnmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FNMSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FNMSUB_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMSUB_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMSUB_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASK3_FNMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FNMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fnmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FNMSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FNMSUB_PS(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FNMSUB_PS(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fnmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM_MASKZ_FNMSUB_PS(k, a, b, c) =>
      emitValDef(sym, s"_mm_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM256_FPCLASS_PD_MASK(a, imm8) =>
      emitValDef(sym, s"_mm256_fpclass_pd_mask(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_FPCLASS_PD_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_fpclass_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_FPCLASS_PD_MASK(a, imm8) =>
      emitValDef(sym, s"_mm512_fpclass_pd_mask(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_FPCLASS_PD_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_fpclass_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM_FPCLASS_PD_MASK(a, imm8) =>
      emitValDef(sym, s"_mm_fpclass_pd_mask(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_FPCLASS_PD_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm_mask_fpclass_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_FPCLASS_PS_MASK(a, imm8) =>
      emitValDef(sym, s"_mm256_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_FPCLASS_PS_MASK(a, imm8) =>
      emitValDef(sym, s"_mm512_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM_FPCLASS_PS_MASK(a, imm8) =>
      emitValDef(sym, s"_mm_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM_FPCLASS_SD_MASK(a, imm8) =>
      emitValDef(sym, s"_mm_fpclass_sd_mask(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_FPCLASS_SD_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm_mask_fpclass_sd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM_FPCLASS_SS_MASK(a, imm8) =>
      emitValDef(sym, s"_mm_fpclass_ss_mask(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_FPCLASS_SS_MASK(k1, a, imm8) =>
      emitValDef(sym, s"_mm_mask_fpclass_ss_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i32gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i32gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm256_mmask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      emitValDef(sym, s"_mm_mmask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, ${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(scale)})")
    case MM256_GETEXP_PD(a) =>
      emitValDef(sym, s"_mm256_getexp_pd(${quote(a)})")
    case MM256_MASK_GETEXP_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_GETEXP_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_getexp_pd(${quote(k)}, ${quote(a)})")
    case MM_GETEXP_PD(a) =>
      emitValDef(sym, s"_mm_getexp_pd(${quote(a)})")
    case MM_MASK_GETEXP_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_GETEXP_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_getexp_pd(${quote(k)}, ${quote(a)})")
    case MM256_GETEXP_PS(a) =>
      emitValDef(sym, s"_mm256_getexp_ps(${quote(a)})")
    case MM256_MASK_GETEXP_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_GETEXP_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_getexp_ps(${quote(k)}, ${quote(a)})")
    case MM_GETEXP_PS(a) =>
      emitValDef(sym, s"_mm_getexp_ps(${quote(a)})")
    case MM_MASK_GETEXP_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_GETEXP_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_getexp_ps(${quote(k)}, ${quote(a)})")
    case MM256_GETMANT_PD(a, interv, sc) =>
      emitValDef(sym, s"_mm256_getmant_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_MASK_GETMANT_PD(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm256_mask_getmant_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_MASKZ_GETMANT_PD(k, a, interv, sc) =>
      emitValDef(sym, s"_mm256_maskz_getmant_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_GETMANT_PD(a, interv, sc) =>
      emitValDef(sym, s"_mm_getmant_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASK_GETMANT_PD(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm_mask_getmant_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASKZ_GETMANT_PD(k, a, interv, sc) =>
      emitValDef(sym, s"_mm_maskz_getmant_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_GETMANT_PS(a, interv, sc) =>
      emitValDef(sym, s"_mm256_getmant_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm256_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      emitValDef(sym, s"_mm256_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_GETMANT_PS(a, interv, sc) =>
      emitValDef(sym, s"_mm_getmant_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      emitValDef(sym, s"_mm_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      emitValDef(sym, s"_mm_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case MM256_INSERTF32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm256_insertf32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_INSERTF32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_insertf32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_INSERTF32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_insertf32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTF32X8(a, b, imm8) =>
      emitValDef(sym, s"_mm512_insertf32x8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTF32X8(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_insertf32x8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTF32X8(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_insertf32x8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_INSERTF64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm256_insertf64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_INSERTF64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_insertf64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_INSERTF64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_insertf64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTF64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm512_insertf64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTF64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_insertf64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTF64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_insertf64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_INSERTI32X4(a, b, imm8) =>
      emitValDef(sym, s"_mm256_inserti32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_INSERTI32X4(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_inserti32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_INSERTI32X4(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_inserti32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTI32X8(a, b, imm8) =>
      emitValDef(sym, s"_mm512_inserti32x8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTI32X8(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_inserti32x8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTI32X8(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_inserti32x8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_INSERTI64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm256_inserti64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_INSERTI64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_inserti64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_INSERTI64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_inserti64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_INSERTI64X2(a, b, imm8) =>
      emitValDef(sym, s"_mm512_inserti64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_INSERTI64X2(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_inserti64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_INSERTI64X2(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_inserti64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_MAX_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MAX_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MAX_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_max_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MAX_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MAX_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_max_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MIN_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MIN_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MIN_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MIN_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_load_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASK_MOV_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm256_mask_store_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_load_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_MOV_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case MM_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_load_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_MOV_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm_mask_store_pd(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_load_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_MOV_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_load_ps(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASK_MOV_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_mov_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm256_mask_store_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_load_ps(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_MOV_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_load_ps(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_MOV_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_mov_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      stream.println(s"_mm_mask_store_ps(${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_load_ps(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_MOV_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
