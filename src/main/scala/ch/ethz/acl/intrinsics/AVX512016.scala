package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX512016 extends IntrinsicsBase {
  /**
   * Zero extend packed unsigned 8-bit integers in th elow 4 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU8_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 2 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 2 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m128i
   */
  case class MM256_MASK_CVTEPU8_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU8_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU8_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m256i
   */
  case class MM512_MASK_CVTEPU8_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i
   */
  case class MM512_MASKZ_CVTEPU8_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU8_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU32_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU32_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU16_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU16_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU16_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU16_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 8 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU16_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 8 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 4 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU16_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 4 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MUL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MUL_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MUL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MUL_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHRS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULHRS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHRS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULHRS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHRS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULHRS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULHRS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHI_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULHI_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULHI_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHI_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULHI_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULHI_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULHI_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULHI_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHI_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULHI_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULLO_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULLO_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLO_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLO_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULLO_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULLO_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLO_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULLO_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLO_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULLO_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MUL_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MUL_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MUL_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MUL_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_OR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_OR_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_OR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_OR_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_OR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_OR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_OR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_OR_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROL_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROL_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROL_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: int
   */
  case class MM_ROL_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROL_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROL_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROL_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROL_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROL_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ROLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ROLV_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ROLV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ROLV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ROLV_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ROLV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ROLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ROLV_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_ROLV_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ROLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ROLV_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ROLV_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROR_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROR_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROR_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROR_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROR_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROR_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROR_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROR_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_RORV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_RORV_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_RORV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_RORV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_RORV_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_RORV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_RORV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_RORV_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_RORV_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_RORV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_RORV_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_RORV_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce eight
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of 64-bit elements in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SAD_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SHUFFLE_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SHUFFLE_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" within 128-bit lanes using the control in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SHUFFLE_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SHUFFLE_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SHUFFLE_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SHUFFLE_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SHUFFLE_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: _MM_PERM_ENUM
   */
  case class MM256_MASK_SHUFFLE_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: _MM_PERM_ENUM
   */
  case class MM256_MASKZ_SHUFFLE_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" using the control in "imm8", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: _MM_PERM_ENUM
   */
  case class MM_MASK_SHUFFLE_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" using the control in "imm8", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: _MM_PERM_ENUM
   */
  case class MM_MASKZ_SHUFFLE_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASK_SHUFFLEHI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASK_SHUFFLEHI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_SHUFFLEHI_EPI16(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of "a" using the control in
   * "imm8". Store the results in the high 64 bits of "dst", with the low 64 bits
   * being copied from from "a" to "dst", using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASK_SHUFFLEHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of "a" using the control in
   * "imm8". Store the results in the high 64 bits of "dst", with the low 64 bits
   * being copied from from "a" to "dst", using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASK_SHUFFLELO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_SHUFFLELO_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASK_SHUFFLELO_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SHUFFLELO_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_SHUFFLELO_EPI16(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of "a" using the control in "imm8".
   * Store the results in the low 64 bits of "dst", with the high 64 bits being
   * copied from from "a" to "dst", using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASK_SHUFFLELO_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of "a" using the control in "imm8".
   * Store the results in the low 64 bits of "dst", with the high 64 bits being
   * copied from from "a" to "dst", using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SHUFFLELO_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SLL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SLLI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SLL_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_maskz_cvtepu8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU8_EPI32(k, a)
  }
            
  def _mm256_mask_cvtepu8_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepu8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI64(k, a)
  }
            
  def _mm_mask_cvtepu8_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepu8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU8_EPI64(k, a)
  }
            
  def _mm256_mask_cvtepu8_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm256_maskz_cvtepu8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI16(k, a)
  }
            
  def _mm512_cvtepu8_epi16(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPU8_EPI16(a)
  }
            
  def _mm512_mask_cvtepu8_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm512_maskz_cvtepu8_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU8_EPI16(k, a)
  }
            
  def _mm_mask_cvtepu8_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm_maskz_cvtepu8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU8_EPI16(k, a)
  }
            
  def _mm256_mask_cvtepu32_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU32_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepu32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU32_EPI64(k, a)
  }
            
  def _mm_mask_cvtepu32_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU32_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepu32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU32_EPI64(k, a)
  }
            
  def _mm256_mask_cvtepu16_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU16_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtepu16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU16_EPI32(k, a)
  }
            
  def _mm_mask_cvtepu16_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU16_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtepu16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU16_EPI32(k, a)
  }
            
  def _mm256_mask_cvtepu16_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU16_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepu16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU16_EPI64(k, a)
  }
            
  def _mm_mask_cvtepu16_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU16_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepu16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU16_EPI64(k, a)
  }
            
  def _mm256_mask_mul_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MUL_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_mul_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MUL_EPI32(k, a, b)
  }
            
  def _mm_mask_mul_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MUL_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_mul_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MUL_EPI32(k, a, b)
  }
            
  def _mm256_mask_mulhrs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm512_mask_mulhrs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm512_mulhrs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHRS_EPI16(a, b)
  }
            
  def _mm_mask_mulhrs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm256_mask_mulhi_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm512_mask_mulhi_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm512_mulhi_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPU16(a, b)
  }
            
  def _mm_mask_mulhi_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm256_mask_mulhi_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_mulhi_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULHI_EPI16(k, a, b)
  }
            
  def _mm512_mask_mulhi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_mulhi_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHI_EPI16(k, a, b)
  }
            
  def _mm512_mulhi_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPI16(a, b)
  }
            
  def _mm_mask_mulhi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_mulhi_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHI_EPI16(k, a, b)
  }
            
  def _mm256_mask_mullo_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm512_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm_mask_mullo_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULLO_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm256_mask_mullo_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm256_mullo_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULLO_EPI64(a, b)
  }
            
  def _mm512_mask_mullo_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLO_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm512_mullo_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLO_EPI64(a, b)
  }
            
  def _mm_mask_mullo_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULLO_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm_mullo_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULLO_EPI64(a, b)
  }
            
  def _mm256_mask_mullo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_mullo_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI16(k, a, b)
  }
            
  def _mm512_mask_mullo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLO_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_mullo_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULLO_EPI16(k, a, b)
  }
            
  def _mm512_mullo_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLO_EPI16(a, b)
  }
            
  def _mm_mask_mullo_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULLO_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_mullo_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI16(k, a, b)
  }
            
  def _mm256_mask_mul_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MUL_EPU32(src, k, a, b)
  }
            
  def _mm256_maskz_mul_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MUL_EPU32(k, a, b)
  }
            
  def _mm_mask_mul_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MUL_EPU32(src, k, a, b)
  }
            
  def _mm_maskz_mul_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MUL_EPU32(k, a, b)
  }
            
  def _mm256_mask_or_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_OR_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_or_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_OR_EPI32(k, a, b)
  }
            
  def _mm_mask_or_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_OR_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_or_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_OR_EPI32(k, a, b)
  }
            
  def _mm256_mask_or_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_OR_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_or_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_OR_EPI64(k, a, b)
  }
            
  def _mm_mask_or_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_OR_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_or_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_OR_EPI64(k, a, b)
  }
            
  def _mm256_mask_rol_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROL_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_rol_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROL_EPI32(k, a, imm8)
  }
            
  def _mm256_rol_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROL_EPI32(a, imm8)
  }
            
  def _mm_mask_rol_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROL_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_rol_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROL_EPI32(k, a, imm8)
  }
            
  def _mm_rol_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROL_EPI32(a, imm8)
  }
            
  def _mm256_mask_rol_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROL_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_rol_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROL_EPI64(k, a, imm8)
  }
            
  def _mm256_rol_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROL_EPI64(a, imm8)
  }
            
  def _mm_mask_rol_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROL_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_rol_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROL_EPI64(k, a, imm8)
  }
            
  def _mm_rol_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROL_EPI64(a, imm8)
  }
            
  def _mm256_mask_rolv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ROLV_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_rolv_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ROLV_EPI32(k, a, b)
  }
            
  def _mm256_rolv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ROLV_EPI32(a, b)
  }
            
  def _mm_mask_rolv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ROLV_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_rolv_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ROLV_EPI32(k, a, b)
  }
            
  def _mm_rolv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ROLV_EPI32(a, b)
  }
            
  def _mm256_mask_rolv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ROLV_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_rolv_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ROLV_EPI64(k, a, b)
  }
            
  def _mm256_rolv_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ROLV_EPI64(a, b)
  }
            
  def _mm_mask_rolv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ROLV_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_rolv_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ROLV_EPI64(k, a, b)
  }
            
  def _mm_rolv_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ROLV_EPI64(a, b)
  }
            
  def _mm256_mask_ror_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROR_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_ror_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROR_EPI32(k, a, imm8)
  }
            
  def _mm256_ror_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROR_EPI32(a, imm8)
  }
            
  def _mm_mask_ror_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROR_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_ror_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROR_EPI32(k, a, imm8)
  }
            
  def _mm_ror_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROR_EPI32(a, imm8)
  }
            
  def _mm256_mask_ror_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROR_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_ror_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROR_EPI64(k, a, imm8)
  }
            
  def _mm256_ror_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROR_EPI64(a, imm8)
  }
            
  def _mm_mask_ror_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROR_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_ror_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROR_EPI64(k, a, imm8)
  }
            
  def _mm_ror_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROR_EPI64(a, imm8)
  }
            
  def _mm256_mask_rorv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_RORV_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_rorv_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_RORV_EPI32(k, a, b)
  }
            
  def _mm256_rorv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_RORV_EPI32(a, b)
  }
            
  def _mm_mask_rorv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_RORV_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_rorv_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_RORV_EPI32(k, a, b)
  }
            
  def _mm_rorv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_RORV_EPI32(a, b)
  }
            
  def _mm256_mask_rorv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_RORV_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_rorv_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_RORV_EPI64(k, a, b)
  }
            
  def _mm256_rorv_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_RORV_EPI64(a, b)
  }
            
  def _mm_mask_rorv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_RORV_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_rorv_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_RORV_EPI64(k, a, b)
  }
            
  def _mm_rorv_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_RORV_EPI64(a, b)
  }
            
  def _mm512_sad_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SAD_EPU8(a, b)
  }
            
  def _mm256_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_shuffle_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_shuffle_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_EPI8(k, a, b)
  }
            
  def _mm512_mask_shuffle_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_shuffle_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_EPI8(k, a, b)
  }
            
  def _mm512_shuffle_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SHUFFLE_EPI8(a, b)
  }
            
  def _mm_mask_shuffle_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SHUFFLE_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_shuffle_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLE_EPI8(k, a, b)
  }
            
  def _mm256_mask_shuffle_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_shuffle_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_EPI32(k, a, imm8)
  }
            
  def _mm_mask_shuffle_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLE_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_shuffle_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLE_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_shufflehi_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLEHI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_shufflehi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLEHI_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm512_shufflehi_epi16(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLEHI_EPI16(a, imm8)
  }
            
  def _mm_mask_shufflehi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLEHI_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_shufflelo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_shufflelo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm512_shufflelo_epi16(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLELO_EPI16(a, imm8)
  }
            
  def _mm_mask_shufflelo_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_sll_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SLL_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_slli_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SLLI_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_sll_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI32(k, a, count)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MASKZ_CVTEPU8_EPI32 (k, a) =>
      _mm_maskz_cvtepu8_epi32(f(k), f(a))
    case MM256_MASK_CVTEPU8_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu8_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU8_EPI64 (k, a) =>
      _mm256_maskz_cvtepu8_epi64(f(k), f(a))
    case MM_MASK_CVTEPU8_EPI64 (src, k, a) =>
      _mm_mask_cvtepu8_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU8_EPI64 (k, a) =>
      _mm_maskz_cvtepu8_epi64(f(k), f(a))
    case MM256_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm256_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU8_EPI16 (k, a) =>
      _mm256_maskz_cvtepu8_epi16(f(k), f(a))
    case MM512_CVTEPU8_EPI16 (a) =>
      _mm512_cvtepu8_epi16(f(a))
    case MM512_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm512_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPU8_EPI16 (k, a) =>
      _mm512_maskz_cvtepu8_epi16(f(k), f(a))
    case MM_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU8_EPI16 (k, a) =>
      _mm_maskz_cvtepu8_epi16(f(k), f(a))
    case MM256_MASK_CVTEPU32_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu32_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU32_EPI64 (k, a) =>
      _mm256_maskz_cvtepu32_epi64(f(k), f(a))
    case MM_MASK_CVTEPU32_EPI64 (src, k, a) =>
      _mm_mask_cvtepu32_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU32_EPI64 (k, a) =>
      _mm_maskz_cvtepu32_epi64(f(k), f(a))
    case MM256_MASK_CVTEPU16_EPI32 (src, k, a) =>
      _mm256_mask_cvtepu16_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU16_EPI32 (k, a) =>
      _mm256_maskz_cvtepu16_epi32(f(k), f(a))
    case MM_MASK_CVTEPU16_EPI32 (src, k, a) =>
      _mm_mask_cvtepu16_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU16_EPI32 (k, a) =>
      _mm_maskz_cvtepu16_epi32(f(k), f(a))
    case MM256_MASK_CVTEPU16_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu16_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU16_EPI64 (k, a) =>
      _mm256_maskz_cvtepu16_epi64(f(k), f(a))
    case MM_MASK_CVTEPU16_EPI64 (src, k, a) =>
      _mm_mask_cvtepu16_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU16_EPI64 (k, a) =>
      _mm_maskz_cvtepu16_epi64(f(k), f(a))
    case MM256_MASK_MUL_EPI32 (src, k, a, b) =>
      _mm256_mask_mul_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MUL_EPI32 (k, a, b) =>
      _mm256_maskz_mul_epi32(f(k), f(a), f(b))
    case MM_MASK_MUL_EPI32 (src, k, a, b) =>
      _mm_mask_mul_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MUL_EPI32 (k, a, b) =>
      _mm_maskz_mul_epi32(f(k), f(a), f(b))
    case MM256_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm256_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm256_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case MM512_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm512_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm512_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case MM512_MULHRS_EPI16 (a, b) =>
      _mm512_mulhrs_epi16(f(a), f(b))
    case MM_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case MM256_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm256_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm256_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM512_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm512_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm512_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM512_MULHI_EPU16 (a, b) =>
      _mm512_mulhi_epu16(f(a), f(b))
    case MM_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM256_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm256_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULHI_EPI16 (k, a, b) =>
      _mm256_maskz_mulhi_epi16(f(k), f(a), f(b))
    case MM512_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm512_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULHI_EPI16 (k, a, b) =>
      _mm512_maskz_mulhi_epi16(f(k), f(a), f(b))
    case MM512_MULHI_EPI16 (a, b) =>
      _mm512_mulhi_epi16(f(a), f(b))
    case MM_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULHI_EPI16 (k, a, b) =>
      _mm_maskz_mulhi_epi16(f(k), f(a), f(b))
    case MM256_MASK_MULLO_EPI32 (src, k, a, b) =>
      _mm256_mask_mullo_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm256_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm512_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM_MASK_MULLO_EPI32 (src, k, a, b) =>
      _mm_mask_mullo_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM256_MASK_MULLO_EPI64 (src, k, a, b) =>
      _mm256_mask_mullo_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm256_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM256_MULLO_EPI64 (a, b) =>
      _mm256_mullo_epi64(f(a), f(b))
    case MM512_MASK_MULLO_EPI64 (src, k, a, b) =>
      _mm512_mask_mullo_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm512_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM512_MULLO_EPI64 (a, b) =>
      _mm512_mullo_epi64(f(a), f(b))
    case MM_MASK_MULLO_EPI64 (src, k, a, b) =>
      _mm_mask_mullo_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM_MULLO_EPI64 (a, b) =>
      _mm_mullo_epi64(f(a), f(b))
    case MM256_MASK_MULLO_EPI16 (src, k, a, b) =>
      _mm256_mask_mullo_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULLO_EPI16 (k, a, b) =>
      _mm256_maskz_mullo_epi16(f(k), f(a), f(b))
    case MM512_MASK_MULLO_EPI16 (src, k, a, b) =>
      _mm512_mask_mullo_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MULLO_EPI16 (k, a, b) =>
      _mm512_maskz_mullo_epi16(f(k), f(a), f(b))
    case MM512_MULLO_EPI16 (a, b) =>
      _mm512_mullo_epi16(f(a), f(b))
    case MM_MASK_MULLO_EPI16 (src, k, a, b) =>
      _mm_mask_mullo_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MULLO_EPI16 (k, a, b) =>
      _mm_maskz_mullo_epi16(f(k), f(a), f(b))
    case MM256_MASK_MUL_EPU32 (src, k, a, b) =>
      _mm256_mask_mul_epu32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MUL_EPU32 (k, a, b) =>
      _mm256_maskz_mul_epu32(f(k), f(a), f(b))
    case MM_MASK_MUL_EPU32 (src, k, a, b) =>
      _mm_mask_mul_epu32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MUL_EPU32 (k, a, b) =>
      _mm_maskz_mul_epu32(f(k), f(a), f(b))
    case MM256_MASK_OR_EPI32 (src, k, a, b) =>
      _mm256_mask_or_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_OR_EPI32 (k, a, b) =>
      _mm256_maskz_or_epi32(f(k), f(a), f(b))
    case MM_MASK_OR_EPI32 (src, k, a, b) =>
      _mm_mask_or_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_OR_EPI32 (k, a, b) =>
      _mm_maskz_or_epi32(f(k), f(a), f(b))
    case MM256_MASK_OR_EPI64 (src, k, a, b) =>
      _mm256_mask_or_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_OR_EPI64 (k, a, b) =>
      _mm256_maskz_or_epi64(f(k), f(a), f(b))
    case MM_MASK_OR_EPI64 (src, k, a, b) =>
      _mm_mask_or_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_OR_EPI64 (k, a, b) =>
      _mm_maskz_or_epi64(f(k), f(a), f(b))
    case MM256_MASK_ROL_EPI32 (src, k, a, imm8) =>
      _mm256_mask_rol_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROL_EPI32 (k, a, imm8) =>
      _mm256_maskz_rol_epi32(f(k), f(a), f(imm8))
    case MM256_ROL_EPI32 (a, imm8) =>
      _mm256_rol_epi32(f(a), f(imm8))
    case MM_MASK_ROL_EPI32 (src, k, a, imm8) =>
      _mm_mask_rol_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROL_EPI32 (k, a, imm8) =>
      _mm_maskz_rol_epi32(f(k), f(a), f(imm8))
    case MM_ROL_EPI32 (a, imm8) =>
      _mm_rol_epi32(f(a), f(imm8))
    case MM256_MASK_ROL_EPI64 (src, k, a, imm8) =>
      _mm256_mask_rol_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROL_EPI64 (k, a, imm8) =>
      _mm256_maskz_rol_epi64(f(k), f(a), f(imm8))
    case MM256_ROL_EPI64 (a, imm8) =>
      _mm256_rol_epi64(f(a), f(imm8))
    case MM_MASK_ROL_EPI64 (src, k, a, imm8) =>
      _mm_mask_rol_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROL_EPI64 (k, a, imm8) =>
      _mm_maskz_rol_epi64(f(k), f(a), f(imm8))
    case MM_ROL_EPI64 (a, imm8) =>
      _mm_rol_epi64(f(a), f(imm8))
    case MM256_MASK_ROLV_EPI32 (src, k, a, b) =>
      _mm256_mask_rolv_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ROLV_EPI32 (k, a, b) =>
      _mm256_maskz_rolv_epi32(f(k), f(a), f(b))
    case MM256_ROLV_EPI32 (a, b) =>
      _mm256_rolv_epi32(f(a), f(b))
    case MM_MASK_ROLV_EPI32 (src, k, a, b) =>
      _mm_mask_rolv_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ROLV_EPI32 (k, a, b) =>
      _mm_maskz_rolv_epi32(f(k), f(a), f(b))
    case MM_ROLV_EPI32 (a, b) =>
      _mm_rolv_epi32(f(a), f(b))
    case MM256_MASK_ROLV_EPI64 (src, k, a, b) =>
      _mm256_mask_rolv_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ROLV_EPI64 (k, a, b) =>
      _mm256_maskz_rolv_epi64(f(k), f(a), f(b))
    case MM256_ROLV_EPI64 (a, b) =>
      _mm256_rolv_epi64(f(a), f(b))
    case MM_MASK_ROLV_EPI64 (src, k, a, b) =>
      _mm_mask_rolv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ROLV_EPI64 (k, a, b) =>
      _mm_maskz_rolv_epi64(f(k), f(a), f(b))
    case MM_ROLV_EPI64 (a, b) =>
      _mm_rolv_epi64(f(a), f(b))
    case MM256_MASK_ROR_EPI32 (src, k, a, imm8) =>
      _mm256_mask_ror_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROR_EPI32 (k, a, imm8) =>
      _mm256_maskz_ror_epi32(f(k), f(a), f(imm8))
    case MM256_ROR_EPI32 (a, imm8) =>
      _mm256_ror_epi32(f(a), f(imm8))
    case MM_MASK_ROR_EPI32 (src, k, a, imm8) =>
      _mm_mask_ror_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROR_EPI32 (k, a, imm8) =>
      _mm_maskz_ror_epi32(f(k), f(a), f(imm8))
    case MM_ROR_EPI32 (a, imm8) =>
      _mm_ror_epi32(f(a), f(imm8))
    case MM256_MASK_ROR_EPI64 (src, k, a, imm8) =>
      _mm256_mask_ror_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_ROR_EPI64 (k, a, imm8) =>
      _mm256_maskz_ror_epi64(f(k), f(a), f(imm8))
    case MM256_ROR_EPI64 (a, imm8) =>
      _mm256_ror_epi64(f(a), f(imm8))
    case MM_MASK_ROR_EPI64 (src, k, a, imm8) =>
      _mm_mask_ror_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_ROR_EPI64 (k, a, imm8) =>
      _mm_maskz_ror_epi64(f(k), f(a), f(imm8))
    case MM_ROR_EPI64 (a, imm8) =>
      _mm_ror_epi64(f(a), f(imm8))
    case MM256_MASK_RORV_EPI32 (src, k, a, b) =>
      _mm256_mask_rorv_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_RORV_EPI32 (k, a, b) =>
      _mm256_maskz_rorv_epi32(f(k), f(a), f(b))
    case MM256_RORV_EPI32 (a, b) =>
      _mm256_rorv_epi32(f(a), f(b))
    case MM_MASK_RORV_EPI32 (src, k, a, b) =>
      _mm_mask_rorv_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RORV_EPI32 (k, a, b) =>
      _mm_maskz_rorv_epi32(f(k), f(a), f(b))
    case MM_RORV_EPI32 (a, b) =>
      _mm_rorv_epi32(f(a), f(b))
    case MM256_MASK_RORV_EPI64 (src, k, a, b) =>
      _mm256_mask_rorv_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_RORV_EPI64 (k, a, b) =>
      _mm256_maskz_rorv_epi64(f(k), f(a), f(b))
    case MM256_RORV_EPI64 (a, b) =>
      _mm256_rorv_epi64(f(a), f(b))
    case MM_MASK_RORV_EPI64 (src, k, a, b) =>
      _mm_mask_rorv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RORV_EPI64 (k, a, b) =>
      _mm_maskz_rorv_epi64(f(k), f(a), f(b))
    case MM_RORV_EPI64 (a, b) =>
      _mm_rorv_epi64(f(a), f(b))
    case MM512_SAD_EPU8 (a, b) =>
      _mm512_sad_epu8(f(a), f(b))
    case iDef@MM256_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SHUFFLE_EPI8 (src, k, a, b) =>
      _mm256_mask_shuffle_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SHUFFLE_EPI8 (k, a, b) =>
      _mm256_maskz_shuffle_epi8(f(k), f(a), f(b))
    case MM512_MASK_SHUFFLE_EPI8 (src, k, a, b) =>
      _mm512_mask_shuffle_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SHUFFLE_EPI8 (k, a, b) =>
      _mm512_maskz_shuffle_epi8(f(k), f(a), f(b))
    case MM512_SHUFFLE_EPI8 (a, b) =>
      _mm512_shuffle_epi8(f(a), f(b))
    case MM_MASK_SHUFFLE_EPI8 (src, k, a, b) =>
      _mm_mask_shuffle_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SHUFFLE_EPI8 (k, a, b) =>
      _mm_maskz_shuffle_epi8(f(k), f(a), f(b))
    case MM256_MASK_SHUFFLE_EPI32 (src, k, a, imm8) =>
      _mm256_mask_shuffle_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SHUFFLE_EPI32 (k, a, imm8) =>
      _mm256_maskz_shuffle_epi32(f(k), f(a), f(imm8))
    case MM_MASK_SHUFFLE_EPI32 (src, k, a, imm8) =>
      _mm_mask_shuffle_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SHUFFLE_EPI32 (k, a, imm8) =>
      _mm_maskz_shuffle_epi32(f(k), f(a), f(imm8))
    case MM256_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_shufflehi_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm256_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_shufflehi_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm512_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM512_SHUFFLEHI_EPI16 (a, imm8) =>
      _mm512_shufflehi_epi16(f(a), f(imm8))
    case MM_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8) =>
      _mm_mask_shufflehi_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm256_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm256_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm512_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm512_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM512_SHUFFLELO_EPI16 (a, imm8) =>
      _mm512_shufflelo_epi16(f(a), f(imm8))
    case MM_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_SLL_EPI32 (src, k, a, count) =>
      _mm256_mask_sll_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_SLLI_EPI32 (src, k, a, imm8) =>
      _mm256_mask_slli_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_SLL_EPI32 (k, a, count) =>
      _mm256_maskz_sll_epi32(f(k), f(a), f(count))

    case Reflect(MM_MASKZ_CVTEPU8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MUL_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MUL_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHRS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHRS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MUL_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MUL_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_OR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_OR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_OR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_OR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_OR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_OR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_OR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_OR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROL_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROL_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROL_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROL_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROL_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROL_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROL_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROL_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROL_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROL_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROL_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROL_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROL_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROL_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROL_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROL_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROL_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROL_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROL_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROL_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROL_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROL_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROL_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROL_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROLV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROLV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROLV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROLV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROLV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ROLV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROLV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROLV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROLV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROLV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROLV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ROLV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROLV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROLV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROLV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROLV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROLV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ROLV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROLV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROLV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROLV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROLV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROLV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ROLV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROR_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROR_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROR_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROR_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROR_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROR_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROR_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROR_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROR_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROR_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROR_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROR_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROR_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROR_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROR_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROR_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROR_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROR_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROR_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROR_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROR_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROR_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROR_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROR_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RORV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RORV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RORV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RORV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RORV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_RORV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RORV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RORV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RORV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RORV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RORV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RORV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RORV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RORV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RORV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RORV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RORV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_RORV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RORV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RORV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RORV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RORV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RORV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RORV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SAD_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SAD_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLEHI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLEHI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLEHI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLEHI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLEHI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLELO_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLELO_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512016 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_MASKZ_CVTEPU8_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu8_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU8_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU8_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU8_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU8_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu8_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU8_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi16(${quote(k)}, ${quote(a)})")
    case MM512_CVTEPU8_EPI16(a) =>
      emitValDef(sym, s"_mm512_cvtepu8_epi16(${quote(a)})")
    case MM512_MASK_CVTEPU8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTEPU8_EPI16(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepu8_epi16(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU8_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu8_epi16(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU32_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU32_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu32_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU32_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU32_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu32_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU16_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU16_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu16_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU16_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU16_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu16_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU16_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU16_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu16_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU16_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU16_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu16_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_MUL_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mul_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MUL_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mul_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MUL_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mul_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MUL_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mul_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULHRS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULHRS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULHRS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULHRS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MULHRS_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_mulhrs_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULHRS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULHRS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULHI_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULHI_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULHI_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULHI_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MULHI_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_mulhi_epu16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULHI_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULHI_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mulhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mulhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MULHI_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_mulhi_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULHI_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULHI_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mulhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULLO_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mullo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MULLO_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mullo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULLO_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mullo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MULLO_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_mullo_epi64(${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mullo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MULLO_EPI64(a, b) =>
      emitValDef(sym, s"_mm512_mullo_epi64(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULLO_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mullo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULLO_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MULLO_EPI64(a, b) =>
      emitValDef(sym, s"_mm_mullo_epi64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_MULLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mullo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MULLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mullo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_MULLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_mullo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_MULLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_mullo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MULLO_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_mullo_epi16(${quote(a)}, ${quote(b)})")
    case MM_MASK_MULLO_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mullo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MULLO_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mullo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_MUL_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_mul_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_MUL_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_mul_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_MUL_EPU32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_mul_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_MUL_EPU32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_mul_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_OR_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_or_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_OR_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_or_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_OR_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_or_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_OR_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_or_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_OR_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_or_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_OR_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_or_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_OR_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_or_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_OR_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_or_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ROL_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_rol_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROL_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_rol_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROL_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm256_rol_epi32(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROL_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_rol_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROL_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_rol_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROL_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm_rol_epi32(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_ROL_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_rol_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROL_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_rol_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROL_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm256_rol_epi64(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROL_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_rol_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROL_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_rol_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROL_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm_rol_epi64(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_ROLV_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_rolv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ROLV_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_rolv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_ROLV_EPI32(a, b) =>
      emitValDef(sym, s"_mm256_rolv_epi32(${quote(a)}, ${quote(b)})")
    case MM_MASK_ROLV_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rolv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ROLV_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rolv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_ROLV_EPI32(a, b) =>
      emitValDef(sym, s"_mm_rolv_epi32(${quote(a)}, ${quote(b)})")
    case MM256_MASK_ROLV_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_rolv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ROLV_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_rolv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_ROLV_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_rolv_epi64(${quote(a)}, ${quote(b)})")
    case MM_MASK_ROLV_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rolv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ROLV_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rolv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_ROLV_EPI64(a, b) =>
      emitValDef(sym, s"_mm_rolv_epi64(${quote(a)}, ${quote(b)})")
    case MM256_MASK_ROR_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_ror_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROR_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_ror_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROR_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm256_ror_epi32(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROR_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_ror_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROR_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_ror_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROR_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm_ror_epi32(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_ROR_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_ror_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_ROR_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_ror_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_ROR_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm256_ror_epi64(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_ROR_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_ror_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_ROR_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_ror_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_ROR_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm_ror_epi64(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_RORV_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_rorv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_RORV_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_rorv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_RORV_EPI32(a, b) =>
      emitValDef(sym, s"_mm256_rorv_epi32(${quote(a)}, ${quote(b)})")
    case MM_MASK_RORV_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rorv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RORV_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rorv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RORV_EPI32(a, b) =>
      emitValDef(sym, s"_mm_rorv_epi32(${quote(a)}, ${quote(b)})")
    case MM256_MASK_RORV_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_rorv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_RORV_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_rorv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_RORV_EPI64(a, b) =>
      emitValDef(sym, s"_mm256_rorv_epi64(${quote(a)}, ${quote(b)})")
    case MM_MASK_RORV_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_rorv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_RORV_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_rorv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_RORV_EPI64(a, b) =>
      emitValDef(sym, s"_mm_rorv_epi64(${quote(a)}, ${quote(b)})")
    case MM512_SAD_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_sad_epu8(${quote(a)}, ${quote(b)})")
    case MM256_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i32scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i32scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i32scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i32scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i32scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i32scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i32scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i32scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i64scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i64scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i64scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i64scatter_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_i64scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm256_mask_i64scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_i64scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      stream.println(s"_mm_mask_i64scatter_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case MM256_MASK_SHUFFLE_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_shuffle_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_SHUFFLE_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_SHUFFLE_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_shuffle_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_SHUFFLE_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_shuffle_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_SHUFFLE_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_shuffle_epi8(${quote(a)}, ${quote(b)})")
    case MM_MASK_SHUFFLE_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_shuffle_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_SHUFFLE_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_shuffle_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_SHUFFLE_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_shuffle_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLE_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shuffle_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SHUFFLE_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_shuffle_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SHUFFLE_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_shuffle_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLEHI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_shufflehi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLEHI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_shufflehi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_SHUFFLEHI_EPI16(a, imm8) =>
      emitValDef(sym, s"_mm512_shufflehi_epi16(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SHUFFLEHI_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_shufflehi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_SHUFFLELO_EPI16(a, imm8) =>
      emitValDef(sym, s"_mm512_shufflelo_epi16(${quote(a)}, ${quote(imm8)})")
    case MM_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_SLL_EPI32(src, k, a, count) =>
      emitValDef(sym, s"_mm256_mask_sll_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case MM256_MASK_SLLI_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_slli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_SLL_EPI32(k, a, count) =>
      emitValDef(sym, s"_mm256_maskz_sll_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case _ => super.emitNode(sym, rhs)
  }
}
