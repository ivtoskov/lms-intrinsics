package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512017 extends IntrinsicsBase {
  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SLLI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SLLI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" left by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_BSLLI_EPI128(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SLL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SLLI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SLL_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SLLI_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLL_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SLLI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SLLV_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLLV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SLLV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SLLV_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SLLV_EPI16(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SLLV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SLLV_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SLLV_EPI16(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLLV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLLV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SLL_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SLLI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SLL_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SLLI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SLL_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SLLI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SLL_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SLLI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SLL_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SLLI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLL_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SLLI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRA_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRA_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRA_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRAI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRA_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRA_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, count: __m128i
   */
  case class MM256_SRA_EPI64(a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, imm8: unsigned int
   */
  case class MM256_SRAI_EPI64(a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRA_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRAI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRA_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, imm8: unsigned int
   */
  case class MM_SRAI_EPI64(a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRAV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRAV_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRAV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRAV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRAV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRAV_EPI64(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRAV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRAV_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRAV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRAV_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRAV_EPI16(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SRAV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRAV_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRAV_EPI16(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRAV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRAV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRA_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRA_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRA_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRAI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRA_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRA_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SRAI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRA_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRAI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRLI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRL_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRLI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRLI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRL_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRLI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift 128-bit lanes in "a" right by "imm8" bytes while shifting in zeros, and
   * store the results in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_BSRLI_EPI128(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRLI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRL_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRLI_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRLI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRL_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRLI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRLV_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRLV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRLV_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRLV_EPI16(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SRLV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRLV_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRLV_EPI16(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRLV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASK_SRLI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRL_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_SRLI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRL_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRLI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRL_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SRLI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRL_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SRLI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASK_SRLI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRL_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SRLI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUB_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUB_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUB_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUB_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUB_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_maskz_slli_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SLLI_EPI32(k, a, imm8)
  }
            
  def _mm_mask_sll_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI32(src, k, a, count)
  }
            
  def _mm_mask_slli_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SLLI_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_sll_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI32(k, a, count)
  }
            
  def _mm_maskz_slli_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI32(k, a, imm8)
  }
            
  def _mm512_bslli_epi128(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_BSLLI_EPI128(a, imm8)
  }
            
  def _mm256_mask_sll_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SLL_EPI64(src, k, a, count)
  }
            
  def _mm256_mask_slli_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SLLI_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_sll_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI64(k, a, count)
  }
            
  def _mm256_maskz_slli_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SLLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_sll_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI64(src, k, a, count)
  }
            
  def _mm_mask_slli_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SLLI_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_sll_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI64(k, a, count)
  }
            
  def _mm_maskz_slli_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI64(k, a, imm8)
  }
            
  def _mm256_mask_sllv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI32(src, k, a, count)
  }
            
  def _mm256_maskz_sllv_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI32(k, a, count)
  }
            
  def _mm_mask_sllv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI32(src, k, a, count)
  }
            
  def _mm_maskz_sllv_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI32(k, a, count)
  }
            
  def _mm256_mask_sllv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_sllv_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI64(k, a, count)
  }
            
  def _mm_mask_sllv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI64(src, k, a, count)
  }
            
  def _mm_maskz_sllv_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI64(k, a, count)
  }
            
  def _mm256_mask_sllv_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_sllv_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI16(k, a, count)
  }
            
  def _mm256_sllv_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SLLV_EPI16(a, count)
  }
            
  def _mm512_mask_sllv_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm512_maskz_sllv_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SLLV_EPI16(k, a, count)
  }
            
  def _mm512_sllv_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SLLV_EPI16(a, count)
  }
            
  def _mm_mask_sllv_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_sllv_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI16(k, a, count)
  }
            
  def _mm_sllv_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLLV_EPI16(a, count)
  }
            
  def _mm256_mask_sll_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm256_mask_slli_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SLLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_sll_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm256_maskz_slli_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SLLI_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_sll_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm512_mask_slli_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SLLI_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_sll_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm512_maskz_slli_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SLLI_EPI16(k, a, imm8)
  }
            
  def _mm512_sll_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SLL_EPI16(a, count)
  }
            
  def _mm512_slli_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SLLI_EPI16(a, imm8)
  }
            
  def _mm_mask_sll_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm_mask_slli_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SLLI_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_sll_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm_maskz_slli_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_sra_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_srai_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_sra_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRA_EPI32(k, a, count)
  }
            
  def _mm256_maskz_srai_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI32(k, a, imm8)
  }
            
  def _mm_mask_sra_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRA_EPI32(src, k, a, count)
  }
            
  def _mm_mask_srai_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_sra_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI32(k, a, count)
  }
            
  def _mm_maskz_srai_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_sra_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI64(src, k, a, count)
  }
            
  def _mm256_mask_srai_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_sra_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRA_EPI64(k, a, count)
  }
            
  def _mm256_maskz_srai_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI64(k, a, imm8)
  }
            
  def _mm256_sra_epi64(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRA_EPI64(a, count)
  }
            
  def _mm256_srai_epi64(a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_SRAI_EPI64(a, imm8)
  }
            
  def _mm_mask_sra_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRA_EPI64(src, k, a, count)
  }
            
  def _mm_mask_srai_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_sra_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI64(k, a, count)
  }
            
  def _mm_maskz_srai_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI64(k, a, imm8)
  }
            
  def _mm_sra_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRA_EPI64(a, count)
  }
            
  def _mm_srai_epi64(a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_SRAI_EPI64(a, imm8)
  }
            
  def _mm256_mask_srav_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRAV_EPI32(src, k, a, count)
  }
            
  def _mm256_maskz_srav_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRAV_EPI32(k, a, count)
  }
            
  def _mm_mask_srav_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI32(src, k, a, count)
  }
            
  def _mm_maskz_srav_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI32(k, a, count)
  }
            
  def _mm256_mask_srav_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRAV_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_srav_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRAV_EPI64(k, a, count)
  }
            
  def _mm256_srav_epi64(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRAV_EPI64(a, count)
  }
            
  def _mm_mask_srav_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI64(src, k, a, count)
  }
            
  def _mm_maskz_srav_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI64(k, a, count)
  }
            
  def _mm_srav_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRAV_EPI64(a, count)
  }
            
  def _mm256_mask_srav_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_srav_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRAV_EPI16(k, a, count)
  }
            
  def _mm256_srav_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRAV_EPI16(a, count)
  }
            
  def _mm512_mask_srav_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm512_maskz_srav_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRAV_EPI16(k, a, count)
  }
            
  def _mm512_srav_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRAV_EPI16(a, count)
  }
            
  def _mm_mask_srav_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_srav_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI16(k, a, count)
  }
            
  def _mm_srav_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRAV_EPI16(a, count)
  }
            
  def _mm256_mask_sra_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI16(src, k, a, count)
  }
            
  def _mm256_mask_srai_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_sra_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm256_maskz_srai_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_sra_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRA_EPI16(src, k, a, count)
  }
            
  def _mm512_mask_srai_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRAI_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_sra_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm512_maskz_srai_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm512_sra_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRA_EPI16(a, count)
  }
            
  def _mm512_srai_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SRAI_EPI16(a, imm8)
  }
            
  def _mm_mask_sra_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRA_EPI16(src, k, a, count)
  }
            
  def _mm_mask_srai_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_sra_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm_maskz_srai_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_srl_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_srli_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_srl_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRL_EPI32(k, a, count)
  }
            
  def _mm256_maskz_srli_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRLI_EPI32(k, a, imm8)
  }
            
  def _mm_mask_srl_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI32(src, k, a, count)
  }
            
  def _mm_mask_srli_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_srl_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRL_EPI32(k, a, count)
  }
            
  def _mm_maskz_srli_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI32(k, a, imm8)
  }
            
  def _mm512_bsrli_epi128(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_BSRLI_EPI128(a, imm8)
  }
            
  def _mm256_mask_srl_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI64(src, k, a, count)
  }
            
  def _mm256_mask_srli_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_srl_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRL_EPI64(k, a, count)
  }
            
  def _mm256_maskz_srli_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_srl_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI64(src, k, a, count)
  }
            
  def _mm_mask_srli_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_srl_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRL_EPI64(k, a, count)
  }
            
  def _mm_maskz_srli_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI64(k, a, imm8)
  }
            
  def _mm256_mask_srlv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI32(src, k, a, count)
  }
            
  def _mm256_maskz_srlv_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI32(k, a, count)
  }
            
  def _mm_mask_srlv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI32(src, k, a, count)
  }
            
  def _mm_maskz_srlv_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI32(k, a, count)
  }
            
  def _mm256_mask_srlv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_srlv_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI64(k, a, count)
  }
            
  def _mm_mask_srlv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI64(src, k, a, count)
  }
            
  def _mm_maskz_srlv_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI64(k, a, count)
  }
            
  def _mm256_mask_srlv_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_srlv_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI16(k, a, count)
  }
            
  def _mm256_srlv_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRLV_EPI16(a, count)
  }
            
  def _mm512_mask_srlv_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm512_maskz_srlv_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRLV_EPI16(k, a, count)
  }
            
  def _mm512_srlv_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRLV_EPI16(a, count)
  }
            
  def _mm_mask_srlv_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_srlv_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI16(k, a, count)
  }
            
  def _mm_srlv_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRLV_EPI16(a, count)
  }
            
  def _mm256_mask_srl_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI16(src, k, a, count)
  }
            
  def _mm256_mask_srli_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_srl_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRL_EPI16(k, a, count)
  }
            
  def _mm256_maskz_srli_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_srl_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRL_EPI16(src, k, a, count)
  }
            
  def _mm512_mask_srli_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_srl_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRL_EPI16(k, a, count)
  }
            
  def _mm512_maskz_srli_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm512_srl_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRL_EPI16(a, count)
  }
            
  def _mm512_srli_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SRLI_EPI16(a, imm8)
  }
            
  def _mm_mask_srl_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI16(src, k, a, count)
  }
            
  def _mm_mask_srli_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_srl_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRL_EPI16(k, a, count)
  }
            
  def _mm_maskz_srli_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_sub_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_sub_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm512_mask_sub_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_sub_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm512_sub_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUB_EPI8(a, b)
  }
            
  def _mm_mask_sub_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_sub_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm256_mask_sub_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_sub_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUB_EPI32(k, a, b)
  }
            
  def _mm_mask_sub_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_sub_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI32(k, a, b)
  }
            
  def _mm256_mask_sub_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_sub_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUB_EPI64(k, a, b)
  }
            
  def _mm_mask_sub_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_sub_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI64(k, a, b)
  }
            
  def _mm256_mask_subs_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_subs_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm512_mask_subs_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_subs_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm512_subs_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPI8(a, b)
  }
            
  def _mm_mask_subs_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_subs_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm256_mask_subs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_subs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  def _mm512_mask_subs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_subs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  def _mm512_subs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPI16(a, b)
  }
            
  def _mm_mask_subs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_subs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASKZ_SLLI_EPI32 (k, a, imm8) =>
      _mm256_maskz_slli_epi32(f(k), f(a), f(imm8))
    case MM_MASK_SLL_EPI32 (src, k, a, count) =>
      _mm_mask_sll_epi32(f(src), f(k), f(a), f(count))
    case MM_MASK_SLLI_EPI32 (src, k, a, imm8) =>
      _mm_mask_slli_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SLL_EPI32 (k, a, count) =>
      _mm_maskz_sll_epi32(f(k), f(a), f(count))
    case MM_MASKZ_SLLI_EPI32 (k, a, imm8) =>
      _mm_maskz_slli_epi32(f(k), f(a), f(imm8))
    case MM512_BSLLI_EPI128 (a, imm8) =>
      _mm512_bslli_epi128(f(a), f(imm8))
    case MM256_MASK_SLL_EPI64 (src, k, a, count) =>
      _mm256_mask_sll_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASK_SLLI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_slli_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SLL_EPI64 (k, a, count) =>
      _mm256_maskz_sll_epi64(f(k), f(a), f(count))
    case MM256_MASKZ_SLLI_EPI64 (k, a, imm8) =>
      _mm256_maskz_slli_epi64(f(k), f(a), f(imm8))
    case MM_MASK_SLL_EPI64 (src, k, a, count) =>
      _mm_mask_sll_epi64(f(src), f(k), f(a), f(count))
    case MM_MASK_SLLI_EPI64 (src, k, a, imm8) =>
      _mm_mask_slli_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SLL_EPI64 (k, a, count) =>
      _mm_maskz_sll_epi64(f(k), f(a), f(count))
    case MM_MASKZ_SLLI_EPI64 (k, a, imm8) =>
      _mm_maskz_slli_epi64(f(k), f(a), f(imm8))
    case MM256_MASK_SLLV_EPI32 (src, k, a, count) =>
      _mm256_mask_sllv_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SLLV_EPI32 (k, a, count) =>
      _mm256_maskz_sllv_epi32(f(k), f(a), f(count))
    case MM_MASK_SLLV_EPI32 (src, k, a, count) =>
      _mm_mask_sllv_epi32(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SLLV_EPI32 (k, a, count) =>
      _mm_maskz_sllv_epi32(f(k), f(a), f(count))
    case MM256_MASK_SLLV_EPI64 (src, k, a, count) =>
      _mm256_mask_sllv_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SLLV_EPI64 (k, a, count) =>
      _mm256_maskz_sllv_epi64(f(k), f(a), f(count))
    case MM_MASK_SLLV_EPI64 (src, k, a, count) =>
      _mm_mask_sllv_epi64(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SLLV_EPI64 (k, a, count) =>
      _mm_maskz_sllv_epi64(f(k), f(a), f(count))
    case MM256_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm256_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SLLV_EPI16 (k, a, count) =>
      _mm256_maskz_sllv_epi16(f(k), f(a), f(count))
    case MM256_SLLV_EPI16 (a, count) =>
      _mm256_sllv_epi16(f(a), f(count))
    case MM512_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm512_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_SLLV_EPI16 (k, a, count) =>
      _mm512_maskz_sllv_epi16(f(k), f(a), f(count))
    case MM512_SLLV_EPI16 (a, count) =>
      _mm512_sllv_epi16(f(a), f(count))
    case MM_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SLLV_EPI16 (k, a, count) =>
      _mm_maskz_sllv_epi16(f(k), f(a), f(count))
    case MM_SLLV_EPI16 (a, count) =>
      _mm_sllv_epi16(f(a), f(count))
    case MM256_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm256_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASK_SLLI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_slli_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm256_maskz_sll_epi16(f(k), f(a), f(count))
    case MM256_MASKZ_SLLI_EPI16 (k, a, imm8) =>
      _mm256_maskz_slli_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm512_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASK_SLLI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_slli_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm512_maskz_sll_epi16(f(k), f(a), f(count))
    case MM512_MASKZ_SLLI_EPI16 (k, a, imm8) =>
      _mm512_maskz_slli_epi16(f(k), f(a), f(imm8))
    case MM512_SLL_EPI16 (a, count) =>
      _mm512_sll_epi16(f(a), f(count))
    case MM512_SLLI_EPI16 (a, imm8) =>
      _mm512_slli_epi16(f(a), f(imm8))
    case MM_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM_MASK_SLLI_EPI16 (src, k, a, imm8) =>
      _mm_mask_slli_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm_maskz_sll_epi16(f(k), f(a), f(count))
    case MM_MASKZ_SLLI_EPI16 (k, a, imm8) =>
      _mm_maskz_slli_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_SRA_EPI32 (src, k, a, count) =>
      _mm256_mask_sra_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRAI_EPI32 (src, k, a, imm8) =>
      _mm256_mask_srai_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRA_EPI32 (k, a, count) =>
      _mm256_maskz_sra_epi32(f(k), f(a), f(count))
    case MM256_MASKZ_SRAI_EPI32 (k, a, imm8) =>
      _mm256_maskz_srai_epi32(f(k), f(a), f(imm8))
    case MM_MASK_SRA_EPI32 (src, k, a, count) =>
      _mm_mask_sra_epi32(f(src), f(k), f(a), f(count))
    case MM_MASK_SRAI_EPI32 (src, k, a, imm8) =>
      _mm_mask_srai_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRA_EPI32 (k, a, count) =>
      _mm_maskz_sra_epi32(f(k), f(a), f(count))
    case MM_MASKZ_SRAI_EPI32 (k, a, imm8) =>
      _mm_maskz_srai_epi32(f(k), f(a), f(imm8))
    case MM256_MASK_SRA_EPI64 (src, k, a, count) =>
      _mm256_mask_sra_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRAI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_srai_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRA_EPI64 (k, a, count) =>
      _mm256_maskz_sra_epi64(f(k), f(a), f(count))
    case MM256_MASKZ_SRAI_EPI64 (k, a, imm8) =>
      _mm256_maskz_srai_epi64(f(k), f(a), f(imm8))
    case MM256_SRA_EPI64 (a, count) =>
      _mm256_sra_epi64(f(a), f(count))
    case MM256_SRAI_EPI64 (a, imm8) =>
      _mm256_srai_epi64(f(a), f(imm8))
    case MM_MASK_SRA_EPI64 (src, k, a, count) =>
      _mm_mask_sra_epi64(f(src), f(k), f(a), f(count))
    case MM_MASK_SRAI_EPI64 (src, k, a, imm8) =>
      _mm_mask_srai_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRA_EPI64 (k, a, count) =>
      _mm_maskz_sra_epi64(f(k), f(a), f(count))
    case MM_MASKZ_SRAI_EPI64 (k, a, imm8) =>
      _mm_maskz_srai_epi64(f(k), f(a), f(imm8))
    case MM_SRA_EPI64 (a, count) =>
      _mm_sra_epi64(f(a), f(count))
    case MM_SRAI_EPI64 (a, imm8) =>
      _mm_srai_epi64(f(a), f(imm8))
    case MM256_MASK_SRAV_EPI32 (src, k, a, count) =>
      _mm256_mask_srav_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRAV_EPI32 (k, a, count) =>
      _mm256_maskz_srav_epi32(f(k), f(a), f(count))
    case MM_MASK_SRAV_EPI32 (src, k, a, count) =>
      _mm_mask_srav_epi32(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRAV_EPI32 (k, a, count) =>
      _mm_maskz_srav_epi32(f(k), f(a), f(count))
    case MM256_MASK_SRAV_EPI64 (src, k, a, count) =>
      _mm256_mask_srav_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRAV_EPI64 (k, a, count) =>
      _mm256_maskz_srav_epi64(f(k), f(a), f(count))
    case MM256_SRAV_EPI64 (a, count) =>
      _mm256_srav_epi64(f(a), f(count))
    case MM_MASK_SRAV_EPI64 (src, k, a, count) =>
      _mm_mask_srav_epi64(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRAV_EPI64 (k, a, count) =>
      _mm_maskz_srav_epi64(f(k), f(a), f(count))
    case MM_SRAV_EPI64 (a, count) =>
      _mm_srav_epi64(f(a), f(count))
    case MM256_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm256_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRAV_EPI16 (k, a, count) =>
      _mm256_maskz_srav_epi16(f(k), f(a), f(count))
    case MM256_SRAV_EPI16 (a, count) =>
      _mm256_srav_epi16(f(a), f(count))
    case MM512_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm512_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_SRAV_EPI16 (k, a, count) =>
      _mm512_maskz_srav_epi16(f(k), f(a), f(count))
    case MM512_SRAV_EPI16 (a, count) =>
      _mm512_srav_epi16(f(a), f(count))
    case MM_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRAV_EPI16 (k, a, count) =>
      _mm_maskz_srav_epi16(f(k), f(a), f(count))
    case MM_SRAV_EPI16 (a, count) =>
      _mm_srav_epi16(f(a), f(count))
    case MM256_MASK_SRA_EPI16 (src, k, a, count) =>
      _mm256_mask_sra_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRAI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_srai_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm256_maskz_sra_epi16(f(k), f(a), f(count))
    case MM256_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm256_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_SRA_EPI16 (src, k, a, count) =>
      _mm512_mask_sra_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASK_SRAI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_srai_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm512_maskz_sra_epi16(f(k), f(a), f(count))
    case MM512_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm512_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM512_SRA_EPI16 (a, count) =>
      _mm512_sra_epi16(f(a), f(count))
    case MM512_SRAI_EPI16 (a, imm8) =>
      _mm512_srai_epi16(f(a), f(imm8))
    case MM_MASK_SRA_EPI16 (src, k, a, count) =>
      _mm_mask_sra_epi16(f(src), f(k), f(a), f(count))
    case MM_MASK_SRAI_EPI16 (src, k, a, imm8) =>
      _mm_mask_srai_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm_maskz_sra_epi16(f(k), f(a), f(count))
    case MM_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_SRL_EPI32 (src, k, a, count) =>
      _mm256_mask_srl_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRLI_EPI32 (src, k, a, imm8) =>
      _mm256_mask_srli_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRL_EPI32 (k, a, count) =>
      _mm256_maskz_srl_epi32(f(k), f(a), f(count))
    case MM256_MASKZ_SRLI_EPI32 (k, a, imm8) =>
      _mm256_maskz_srli_epi32(f(k), f(a), f(imm8))
    case MM_MASK_SRL_EPI32 (src, k, a, count) =>
      _mm_mask_srl_epi32(f(src), f(k), f(a), f(count))
    case MM_MASK_SRLI_EPI32 (src, k, a, imm8) =>
      _mm_mask_srli_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRL_EPI32 (k, a, count) =>
      _mm_maskz_srl_epi32(f(k), f(a), f(count))
    case MM_MASKZ_SRLI_EPI32 (k, a, imm8) =>
      _mm_maskz_srli_epi32(f(k), f(a), f(imm8))
    case MM512_BSRLI_EPI128 (a, imm8) =>
      _mm512_bsrli_epi128(f(a), f(imm8))
    case MM256_MASK_SRL_EPI64 (src, k, a, count) =>
      _mm256_mask_srl_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRLI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_srli_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRL_EPI64 (k, a, count) =>
      _mm256_maskz_srl_epi64(f(k), f(a), f(count))
    case MM256_MASKZ_SRLI_EPI64 (k, a, imm8) =>
      _mm256_maskz_srli_epi64(f(k), f(a), f(imm8))
    case MM_MASK_SRL_EPI64 (src, k, a, count) =>
      _mm_mask_srl_epi64(f(src), f(k), f(a), f(count))
    case MM_MASK_SRLI_EPI64 (src, k, a, imm8) =>
      _mm_mask_srli_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRL_EPI64 (k, a, count) =>
      _mm_maskz_srl_epi64(f(k), f(a), f(count))
    case MM_MASKZ_SRLI_EPI64 (k, a, imm8) =>
      _mm_maskz_srli_epi64(f(k), f(a), f(imm8))
    case MM256_MASK_SRLV_EPI32 (src, k, a, count) =>
      _mm256_mask_srlv_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRLV_EPI32 (k, a, count) =>
      _mm256_maskz_srlv_epi32(f(k), f(a), f(count))
    case MM_MASK_SRLV_EPI32 (src, k, a, count) =>
      _mm_mask_srlv_epi32(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRLV_EPI32 (k, a, count) =>
      _mm_maskz_srlv_epi32(f(k), f(a), f(count))
    case MM256_MASK_SRLV_EPI64 (src, k, a, count) =>
      _mm256_mask_srlv_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRLV_EPI64 (k, a, count) =>
      _mm256_maskz_srlv_epi64(f(k), f(a), f(count))
    case MM_MASK_SRLV_EPI64 (src, k, a, count) =>
      _mm_mask_srlv_epi64(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRLV_EPI64 (k, a, count) =>
      _mm_maskz_srlv_epi64(f(k), f(a), f(count))
    case MM256_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm256_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRLV_EPI16 (k, a, count) =>
      _mm256_maskz_srlv_epi16(f(k), f(a), f(count))
    case MM256_SRLV_EPI16 (a, count) =>
      _mm256_srlv_epi16(f(a), f(count))
    case MM512_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm512_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_SRLV_EPI16 (k, a, count) =>
      _mm512_maskz_srlv_epi16(f(k), f(a), f(count))
    case MM512_SRLV_EPI16 (a, count) =>
      _mm512_srlv_epi16(f(a), f(count))
    case MM_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_SRLV_EPI16 (k, a, count) =>
      _mm_maskz_srlv_epi16(f(k), f(a), f(count))
    case MM_SRLV_EPI16 (a, count) =>
      _mm_srlv_epi16(f(a), f(count))
    case MM256_MASK_SRL_EPI16 (src, k, a, count) =>
      _mm256_mask_srl_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SRL_EPI16 (k, a, count) =>
      _mm256_maskz_srl_epi16(f(k), f(a), f(count))
    case MM256_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm256_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_SRL_EPI16 (src, k, a, count) =>
      _mm512_mask_srl_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SRL_EPI16 (k, a, count) =>
      _mm512_maskz_srl_epi16(f(k), f(a), f(count))
    case MM512_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm512_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM512_SRL_EPI16 (a, count) =>
      _mm512_srl_epi16(f(a), f(count))
    case MM512_SRLI_EPI16 (a, imm8) =>
      _mm512_srli_epi16(f(a), f(imm8))
    case MM_MASK_SRL_EPI16 (src, k, a, count) =>
      _mm_mask_srl_epi16(f(src), f(k), f(a), f(count))
    case MM_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SRL_EPI16 (k, a, count) =>
      _mm_maskz_srl_epi16(f(k), f(a), f(count))
    case MM_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm256_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm256_maskz_sub_epi8(f(k), f(a), f(b))
    case MM512_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm512_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm512_maskz_sub_epi8(f(k), f(a), f(b))
    case MM512_SUB_EPI8 (a, b) =>
      _mm512_sub_epi8(f(a), f(b))
    case MM_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm_maskz_sub_epi8(f(k), f(a), f(b))
    case MM256_MASK_SUB_EPI32 (src, k, a, b) =>
      _mm256_mask_sub_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_EPI32 (k, a, b) =>
      _mm256_maskz_sub_epi32(f(k), f(a), f(b))
    case MM_MASK_SUB_EPI32 (src, k, a, b) =>
      _mm_mask_sub_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_EPI32 (k, a, b) =>
      _mm_maskz_sub_epi32(f(k), f(a), f(b))
    case MM256_MASK_SUB_EPI64 (src, k, a, b) =>
      _mm256_mask_sub_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_EPI64 (k, a, b) =>
      _mm256_maskz_sub_epi64(f(k), f(a), f(b))
    case MM_MASK_SUB_EPI64 (src, k, a, b) =>
      _mm_mask_sub_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUB_EPI64 (k, a, b) =>
      _mm_maskz_sub_epi64(f(k), f(a), f(b))
    case MM256_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm256_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm256_maskz_subs_epi8(f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm512_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm512_maskz_subs_epi8(f(k), f(a), f(b))
    case MM512_SUBS_EPI8 (a, b) =>
      _mm512_subs_epi8(f(a), f(b))
    case MM_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm_maskz_subs_epi8(f(k), f(a), f(b))
    case MM256_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm256_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm256_maskz_subs_epi16(f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm512_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm512_maskz_subs_epi16(f(k), f(a), f(b))
    case MM512_SUBS_EPI16 (a, b) =>
      _mm512_subs_epi16(f(a), f(b))
    case MM_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm_maskz_subs_epi16(f(k), f(a), f(b))

    case Reflect(MM256_MASKZ_SLLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BSLLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_BSLLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SLLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRA_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRA_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRA_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRA_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRA_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRA_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRA_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRA_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRAI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRA_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRA_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRAV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRAV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRA_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRA_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRAI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRAI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRA_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRA_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SRAI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRA_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRA_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BSRLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_BSRLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SRLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512017 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM256_MASKZ_SLLI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_slli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SLL_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sll_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_slli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SLL_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sll_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_slli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_BSLLI_EPI128(a, imm8) =>
      emitValDef(sym, s"_mm512_bslli_epi128(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SLL_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sll_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLLI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_slli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SLL_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sll_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SLLI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_slli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SLL_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sll_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_slli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SLL_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sll_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_slli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SLLV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sllv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SLLV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sllv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sllv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sllv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLLV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sllv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SLLV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sllv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sllv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sllv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SLLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sllv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_SLLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm256_sllv_epi16(${quote(a)}, ${quote(count)})")
    case MM512_MASK_SLLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SLLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_sllv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_SLLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_sllv_epi16(${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sllv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_SLLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm_sllv_epi16(${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_slli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SLL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SLLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_slli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_SLL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASK_SLLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_slli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_SLL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SLLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_slli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_SLL_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_sll_epi16(${quote(a)}, ${quote(count)})")
    case MM512_SLLI_EPI16(a, imm8) =>
      emitValDef(sym, s"_mm512_slli_epi16(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SLL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SLLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_slli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SLL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SLLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_slli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRA_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sra_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRAI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srai_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRA_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sra_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srai_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRA_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sra_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srai_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRA_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sra_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srai_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRA_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sra_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRAI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srai_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRA_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sra_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srai_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_SRA_EPI64(a, count) =>
      emitValDef(sym, s"_mm256_sra_epi64(${quote(a)}, ${quote(count)})")
    case MM256_SRAI_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm256_srai_epi64(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRA_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sra_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srai_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRA_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sra_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srai_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_SRA_EPI64(a, count) =>
      emitValDef(sym, s"_mm_sra_epi64(${quote(a)}, ${quote(count)})")
    case MM_SRAI_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm_srai_epi64(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRAV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srav_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srav_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srav_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srav_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRAV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srav_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srav_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_SRAV_EPI64(a, count) =>
      emitValDef(sym, s"_mm256_srav_epi64(${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srav_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srav_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_SRAV_EPI64(a, count) =>
      emitValDef(sym, s"_mm_srav_epi64(${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRAV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srav_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_SRAV_EPI16(a, count) =>
      emitValDef(sym, s"_mm256_srav_epi16(${quote(a)}, ${quote(count)})")
    case MM512_MASK_SRAV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SRAV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_srav_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_SRAV_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_srav_epi16(${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srav_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_SRAV_EPI16(a, count) =>
      emitValDef(sym, s"_mm_srav_epi16(${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRA_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sra_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRAI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srai_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRA_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRAI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_SRA_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_sra_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASK_SRAI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_srai_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_SRA_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SRAI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_SRA_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_sra_epi16(${quote(a)}, ${quote(count)})")
    case MM512_SRAI_EPI16(a, imm8) =>
      emitValDef(sym, s"_mm512_srai_epi16(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRA_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_sra_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRAI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srai_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRA_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRAI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRL_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srl_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRLI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRL_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srl_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRL_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srl_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRL_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srl_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLI_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_BSRLI_EPI128(a, imm8) =>
      emitValDef(sym, s"_mm512_bsrli_epi128(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRL_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srl_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRLI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRL_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srl_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRL_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srl_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLI_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRL_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srl_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLI_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SRLV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srlv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srlv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLV_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srlv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLV_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srlv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRLV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srlv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srlv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLV_EPI64(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srlv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLV_EPI64(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srlv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srlv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_SRLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm256_srlv_epi16(${quote(a)}, ${quote(count)})")
    case MM512_MASK_SRLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SRLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_srlv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_SRLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_srlv_epi16(${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLV_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLV_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srlv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_SRLV_EPI16(a, count) =>
      emitValDef(sym, s"_mm_srlv_epi16(${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_srl_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SRLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SRL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_srl_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASKZ_SRLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_SRL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm512_mask_srl_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASK_SRLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_SRL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm512_maskz_srl_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM512_MASKZ_SRLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_SRL_EPI16(a, count) =>
      emitValDef(sym, s"_mm512_srl_epi16(${quote(a)}, ${quote(count)})")
    case MM512_SRLI_EPI16(a, imm8) =>
      emitValDef(sym, s"_mm512_srli_epi16(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SRL_EPI16(src, k, a, count) =>
      emitValDef(sym, s"_mm_mask_srl_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASK_SRLI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SRL_EPI16(k, a, count) =>
      emitValDef(sym, s"_mm_maskz_srl_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM_MASKZ_SRLI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SUB_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUB_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUB_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUB_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_sub_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUB_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUB_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_sub_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUB_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_sub_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_SUB_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_sub_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUB_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_sub_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUBS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUBS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUBS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUBS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUBS_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_subs_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUBS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUBS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SUBS_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_subs_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_SUBS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SUBS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
