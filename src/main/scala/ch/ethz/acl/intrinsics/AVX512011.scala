package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX512011 extends IntrinsicsBase {
  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADDS_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADDS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADDS_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADDS_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADD_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADD_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADD_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADD_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst".
   * a: __m512i, b: __m512i, count: const int
   */
  case class MM512_ALIGNR_EPI8(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASK_ALIGNR_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASKZ_ALIGNR_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASK_ALIGNR_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AND_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AND_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_AND_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AND_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ANDNOT_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ANDNOT_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ANDNOT_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ANDNOT_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ANDNOT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ANDNOT_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ANDNOT_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ANDNOT_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AND_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AND_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_AND_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AND_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AVG_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AVG_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AVG_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_AVG_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_AVG_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_AVG_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AVG_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AVG_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AVG_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AVG_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_AVG_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_AVG_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_AVG_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AVG_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using control mask "k", and store
   * the results in "dst".
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using control mask "k", and store
   * the results in "dst".
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_BLEND_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using control mask "k", and store
   * the results in "dst".
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 64-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 64-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_BLEND_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m128i
   */
  case class MM256_MASK_BROADCASTB_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: char
   */
  case class MM256_MASK_SET1_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTB_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: char
   */
  case class MM256_MASKZ_SET1_EPI8(k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCASTB_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m128i
   */
  case class MM512_MASK_BROADCASTB_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: char
   */
  case class MM512_MASK_SET1_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask64, a: __m128i
   */
  case class MM512_MASKZ_BROADCASTB_EPI8(k: Exp[Long], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: char
   */
  case class MM512_MASKZ_SET1_EPI8(k: Exp[Long], a: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i
   */
  case class MM_MASK_BROADCASTB_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: char
   */
  case class MM_MASK_SET1_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i
   */
  case class MM_MASKZ_BROADCASTB_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: char
   */
  case class MM_MASKZ_SET1_EPI8(k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCASTD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: int
   */
  case class MM256_MASK_SET1_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTD_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: int
   */
  case class MM256_MASKZ_SET1_EPI32(k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCASTD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: int
   */
  case class MM_MASK_SET1_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCASTD_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: int
   */
  case class MM_MASKZ_SET1_EPI32(k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 8-bits from input mask "k" to all 64-bit elements of "dst".
   * k: __mmask8
   */
  case class MM256_BROADCASTMB_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 8-bits from input mask "k" to all 64-bit elements of "dst".
   * k: __mmask8
   */
  case class MM_BROADCASTMB_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 16-bits from input mask "k" to all 32-bit elements of "dst".
   * k: __mmask16
   */
  case class MM256_BROADCASTMW_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 16-bits from input mask "k" to all 32-bit elements of "dst".
   * k: __mmask16
   */
  case class MM_BROADCASTMW_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCASTQ_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __int64
   */
  case class MM256_MASK_SET1_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTQ_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __int64
   */
  case class MM256_MASKZ_SET1_EPI64(k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCASTQ_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __int64
   */
  case class MM_MASK_SET1_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCASTQ_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __int64
   */
  case class MM_MASKZ_SET1_EPI64(k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m128i
   */
  case class MM256_MASK_BROADCASTW_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask16, a: short
   */
  case class MM256_MASK_SET1_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTW_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 16-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: short
   */
  case class MM256_MASKZ_SET1_EPI16(k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCASTW_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m128i
   */
  case class MM512_MASK_BROADCASTW_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 16-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: short
   */
  case class MM512_MASK_SET1_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: __m128i
   */
  case class MM512_MASKZ_BROADCASTW_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: short
   */
  case class MM512_MASKZ_SET1_EPI16(k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCASTW_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: short
   */
  case class MM_MASK_SET1_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCASTW_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: short
   */
  case class MM_MASKZ_SET1_EPI16(k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_CMP_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k" using zeromask "k1" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_CMP_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_CMP_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k" using zeromask "k1" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MASK_CMP_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k" using zeromask "k1" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_CMP_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_mask_adds_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_adds_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm512_adds_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPI8(a, b)
  }
            
  def _mm512_mask_adds_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_adds_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm_mask_adds_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_adds_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm256_mask_adds_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_adds_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm512_adds_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPI16(a, b)
  }
            
  def _mm512_mask_adds_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_adds_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm_mask_adds_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_adds_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm256_mask_adds_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_adds_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm512_adds_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPU8(a, b)
  }
            
  def _mm512_mask_adds_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_adds_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm_mask_adds_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm_maskz_adds_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm256_mask_adds_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_adds_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm512_adds_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPU16(a, b)
  }
            
  def _mm512_mask_adds_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_adds_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm_mask_adds_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_adds_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm256_mask_add_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_add_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm512_add_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADD_EPI16(a, b)
  }
            
  def _mm512_mask_add_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_add_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm_mask_add_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_add_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm256_mask_alignr_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm256_maskz_alignr_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI8(k, a, b, count)
  }
            
  def _mm512_alignr_epi8(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI8(a, b, count)
  }
            
  def _mm512_mask_alignr_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm512_maskz_alignr_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ALIGNR_EPI8(k, a, b, count)
  }
            
  def _mm_mask_alignr_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm_maskz_alignr_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI8(k, a, b, count)
  }
            
  def _mm256_mask_and_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AND_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_and_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AND_EPI32(k, a, b)
  }
            
  def _mm_mask_and_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AND_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_and_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AND_EPI32(k, a, b)
  }
            
  def _mm256_mask_andnot_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ANDNOT_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_andnot_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ANDNOT_EPI32(k, a, b)
  }
            
  def _mm_mask_andnot_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ANDNOT_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_andnot_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ANDNOT_EPI32(k, a, b)
  }
            
  def _mm256_mask_andnot_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ANDNOT_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_andnot_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ANDNOT_EPI64(k, a, b)
  }
            
  def _mm_mask_andnot_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ANDNOT_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_andnot_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ANDNOT_EPI64(k, a, b)
  }
            
  def _mm256_mask_and_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AND_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_and_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AND_EPI64(k, a, b)
  }
            
  def _mm_mask_and_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AND_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_and_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AND_EPI64(k, a, b)
  }
            
  def _mm256_mask_avg_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AVG_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_avg_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm512_avg_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AVG_EPU8(a, b)
  }
            
  def _mm512_mask_avg_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_AVG_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_avg_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm_mask_avg_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AVG_EPU8(src, k, a, b)
  }
            
  def _mm_maskz_avg_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm256_mask_avg_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_avg_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm512_avg_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AVG_EPU16(a, b)
  }
            
  def _mm512_mask_avg_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_avg_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm_mask_avg_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm_maskz_avg_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm256_mask_blend_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI8(k, a, b)
  }
            
  def _mm512_mask_blend_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI8(k, a, b)
  }
            
  def _mm_mask_blend_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI8(k, a, b)
  }
            
  def _mm256_mask_blend_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI32(k, a, b)
  }
            
  def _mm_mask_blend_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI32(k, a, b)
  }
            
  def _mm256_mask_blend_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm_mask_blend_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm256_mask_blend_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI16(k, a, b)
  }
            
  def _mm512_mask_blend_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI16(k, a, b)
  }
            
  def _mm_mask_blend_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI16(k, a, b)
  }
            
  def _mm256_mask_broadcastb_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm256_mask_set1_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[Byte]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm256_maskz_broadcastb_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm256_maskz_set1_epi8(k: Exp[Int], a: Exp[Byte]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm512_broadcastb_epi8(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTB_EPI8(a)
  }
            
  def _mm512_mask_broadcastb_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm512_mask_set1_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[Byte]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm512_maskz_broadcastb_epi8(k: Exp[Long], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm512_maskz_set1_epi8(k: Exp[Long], a: Exp[Byte]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm_mask_broadcastb_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm_mask_set1_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[Byte]): Exp[__m128i] = {
    MM_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm_maskz_broadcastb_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm_maskz_set1_epi8(k: Exp[Int], a: Exp[Byte]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm256_mask_broadcastd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTD_EPI32(src, k, a)
  }
            
  def _mm256_mask_set1_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI32(src, k, a)
  }
            
  def _mm256_maskz_broadcastd_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTD_EPI32(k, a)
  }
            
  def _mm256_maskz_set1_epi32(k: Exp[Int], a: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI32(k, a)
  }
            
  def _mm_mask_broadcastd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTD_EPI32(src, k, a)
  }
            
  def _mm_mask_set1_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SET1_EPI32(src, k, a)
  }
            
  def _mm_maskz_broadcastd_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTD_EPI32(k, a)
  }
            
  def _mm_maskz_set1_epi32(k: Exp[Int], a: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI32(k, a)
  }
            
  def _mm256_broadcastmb_epi64(k: Exp[Int]): Exp[__m256i] = {
    MM256_BROADCASTMB_EPI64(k)
  }
            
  def _mm_broadcastmb_epi64(k: Exp[Int]): Exp[__m128i] = {
    MM_BROADCASTMB_EPI64(k)
  }
            
  def _mm256_broadcastmw_epi32(k: Exp[Int]): Exp[__m256i] = {
    MM256_BROADCASTMW_EPI32(k)
  }
            
  def _mm_broadcastmw_epi32(k: Exp[Int]): Exp[__m128i] = {
    MM_BROADCASTMW_EPI32(k)
  }
            
  def _mm256_mask_broadcastq_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTQ_EPI64(src, k, a)
  }
            
  def _mm256_mask_set1_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[Long]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI64(src, k, a)
  }
            
  def _mm256_maskz_broadcastq_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTQ_EPI64(k, a)
  }
            
  def _mm256_maskz_set1_epi64(k: Exp[Int], a: Exp[Long]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI64(k, a)
  }
            
  def _mm_mask_broadcastq_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTQ_EPI64(src, k, a)
  }
            
  def _mm_mask_set1_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[Long]): Exp[__m128i] = {
    MM_MASK_SET1_EPI64(src, k, a)
  }
            
  def _mm_maskz_broadcastq_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTQ_EPI64(k, a)
  }
            
  def _mm_maskz_set1_epi64(k: Exp[Int], a: Exp[Long]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI64(k, a)
  }
            
  def _mm256_mask_broadcastw_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm256_mask_set1_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[Short]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm256_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm256_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm512_broadcastw_epi16(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTW_EPI16(a)
  }
            
  def _mm512_mask_broadcastw_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm512_mask_set1_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[Short]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm512_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm512_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm_mask_broadcastw_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm_mask_set1_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[Short]): Exp[__m128i] = {
    MM_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm256_cmp_epi8_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm256_cmpeq_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm256_cmpge_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI8_MASK(a, b)
  }
            
  def _mm256_cmpgt_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm256_cmple_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm256_cmplt_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPI8_MASK(a, b)
  }
            
  def _mm256_cmpneq_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_cmp_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPI8_MASK(k1, a, b, imm8)
  }
            
  def _mm256_mask_cmpeq_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpge_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpgt_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmple_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmplt_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpneq_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_cmp_epi8_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Long] = {
    MM512_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm512_cmpeq_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_cmpge_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGE_EPI8_MASK(a, b)
  }
            
  def _mm512_cmpgt_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm512_cmple_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm512_cmplt_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLT_EPI8_MASK(a, b)
  }
            
  def _mm512_cmpneq_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_cmp_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Long] = {
    MM512_MASK_CMP_EPI8_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmpeq_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpge_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpgt_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmplt_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPNEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_cmp_epi8_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm_cmpeq_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm_cmpge_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPI8_MASK(a, b)
  }
            
  def _mm_cmpgt_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm_cmple_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm_cmplt_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI8_MASK(a, b)
  }
            
  def _mm_cmpneq_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm_mask_cmp_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPI8_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_cmpeq_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpge_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpgt_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cmple_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cmplt_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpneq_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_cmp_epi32_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI32_MASK(a, b, imm8)
  }
            
  def _mm256_cmpeq_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI32_MASK(a, b)
  }
            
  def _mm256_cmpge_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI32_MASK(a, b)
  }
            
  def _mm256_cmpgt_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI32_MASK(a, b)
  }
            
  def _mm256_cmple_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI32_MASK(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm256_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm256_maskz_adds_epi8(f(k), f(a), f(b))
    case MM512_ADDS_EPI8 (a, b) =>
      _mm512_adds_epi8(f(a), f(b))
    case MM512_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm512_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm512_maskz_adds_epi8(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm_maskz_adds_epi8(f(k), f(a), f(b))
    case MM256_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm256_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm256_maskz_adds_epi16(f(k), f(a), f(b))
    case MM512_ADDS_EPI16 (a, b) =>
      _mm512_adds_epi16(f(a), f(b))
    case MM512_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm512_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm512_maskz_adds_epi16(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm_maskz_adds_epi16(f(k), f(a), f(b))
    case MM256_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm256_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm256_maskz_adds_epu8(f(k), f(a), f(b))
    case MM512_ADDS_EPU8 (a, b) =>
      _mm512_adds_epu8(f(a), f(b))
    case MM512_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm512_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm512_maskz_adds_epu8(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm_maskz_adds_epu8(f(k), f(a), f(b))
    case MM256_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm256_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm256_maskz_adds_epu16(f(k), f(a), f(b))
    case MM512_ADDS_EPU16 (a, b) =>
      _mm512_adds_epu16(f(a), f(b))
    case MM512_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm512_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm512_maskz_adds_epu16(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm_maskz_adds_epu16(f(k), f(a), f(b))
    case MM256_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm256_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm256_maskz_add_epi16(f(k), f(a), f(b))
    case MM512_ADD_EPI16 (a, b) =>
      _mm512_add_epi16(f(a), f(b))
    case MM512_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm512_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm512_maskz_add_epi16(f(k), f(a), f(b))
    case MM_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm_maskz_add_epi16(f(k), f(a), f(b))
    case MM256_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM256_MASKZ_ALIGNR_EPI8 (k, a, b, count) =>
      _mm256_maskz_alignr_epi8(f(k), f(a), f(b), f(count))
    case MM512_ALIGNR_EPI8 (a, b, count) =>
      _mm512_alignr_epi8(f(a), f(b), f(count))
    case MM512_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM512_MASKZ_ALIGNR_EPI8 (k, a, b, count) =>
      _mm512_maskz_alignr_epi8(f(k), f(a), f(b), f(count))
    case MM_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM_MASKZ_ALIGNR_EPI8 (k, a, b, count) =>
      _mm_maskz_alignr_epi8(f(k), f(a), f(b), f(count))
    case MM256_MASK_AND_EPI32 (src, k, a, b) =>
      _mm256_mask_and_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AND_EPI32 (k, a, b) =>
      _mm256_maskz_and_epi32(f(k), f(a), f(b))
    case MM_MASK_AND_EPI32 (src, k, a, b) =>
      _mm_mask_and_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AND_EPI32 (k, a, b) =>
      _mm_maskz_and_epi32(f(k), f(a), f(b))
    case MM256_MASK_ANDNOT_EPI32 (src, k, a, b) =>
      _mm256_mask_andnot_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ANDNOT_EPI32 (k, a, b) =>
      _mm256_maskz_andnot_epi32(f(k), f(a), f(b))
    case MM_MASK_ANDNOT_EPI32 (src, k, a, b) =>
      _mm_mask_andnot_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ANDNOT_EPI32 (k, a, b) =>
      _mm_maskz_andnot_epi32(f(k), f(a), f(b))
    case MM256_MASK_ANDNOT_EPI64 (src, k, a, b) =>
      _mm256_mask_andnot_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_ANDNOT_EPI64 (k, a, b) =>
      _mm256_maskz_andnot_epi64(f(k), f(a), f(b))
    case MM_MASK_ANDNOT_EPI64 (src, k, a, b) =>
      _mm_mask_andnot_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ANDNOT_EPI64 (k, a, b) =>
      _mm_maskz_andnot_epi64(f(k), f(a), f(b))
    case MM256_MASK_AND_EPI64 (src, k, a, b) =>
      _mm256_mask_and_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AND_EPI64 (k, a, b) =>
      _mm256_maskz_and_epi64(f(k), f(a), f(b))
    case MM_MASK_AND_EPI64 (src, k, a, b) =>
      _mm_mask_and_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AND_EPI64 (k, a, b) =>
      _mm_maskz_and_epi64(f(k), f(a), f(b))
    case MM256_MASK_AVG_EPU8 (src, k, a, b) =>
      _mm256_mask_avg_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm256_maskz_avg_epu8(f(k), f(a), f(b))
    case MM512_AVG_EPU8 (a, b) =>
      _mm512_avg_epu8(f(a), f(b))
    case MM512_MASK_AVG_EPU8 (src, k, a, b) =>
      _mm512_mask_avg_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm512_maskz_avg_epu8(f(k), f(a), f(b))
    case MM_MASK_AVG_EPU8 (src, k, a, b) =>
      _mm_mask_avg_epu8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm_maskz_avg_epu8(f(k), f(a), f(b))
    case MM256_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm256_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm256_maskz_avg_epu16(f(k), f(a), f(b))
    case MM512_AVG_EPU16 (a, b) =>
      _mm512_avg_epu16(f(a), f(b))
    case MM512_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm512_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm512_maskz_avg_epu16(f(k), f(a), f(b))
    case MM_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm_maskz_avg_epu16(f(k), f(a), f(b))
    case MM256_MASK_BLEND_EPI8 (k, a, b) =>
      _mm256_mask_blend_epi8(f(k), f(a), f(b))
    case MM512_MASK_BLEND_EPI8 (k, a, b) =>
      _mm512_mask_blend_epi8(f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI8 (k, a, b) =>
      _mm_mask_blend_epi8(f(k), f(a), f(b))
    case MM256_MASK_BLEND_EPI32 (k, a, b) =>
      _mm256_mask_blend_epi32(f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI32 (k, a, b) =>
      _mm_mask_blend_epi32(f(k), f(a), f(b))
    case MM256_MASK_BLEND_EPI64 (k, a, b) =>
      _mm256_mask_blend_epi64(f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI64 (k, a, b) =>
      _mm_mask_blend_epi64(f(k), f(a), f(b))
    case MM256_MASK_BLEND_EPI16 (k, a, b) =>
      _mm256_mask_blend_epi16(f(k), f(a), f(b))
    case MM512_MASK_BLEND_EPI16 (k, a, b) =>
      _mm512_mask_blend_epi16(f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI16 (k, a, b) =>
      _mm_mask_blend_epi16(f(k), f(a), f(b))
    case MM256_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm256_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM256_MASK_SET1_EPI8 (src, k, a) =>
      _mm256_mask_set1_epi8(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm256_maskz_broadcastb_epi8(f(k), f(a))
    case MM256_MASKZ_SET1_EPI8 (k, a) =>
      _mm256_maskz_set1_epi8(f(k), f(a))
    case MM512_BROADCASTB_EPI8 (a) =>
      _mm512_broadcastb_epi8(f(a))
    case MM512_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm512_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM512_MASK_SET1_EPI8 (src, k, a) =>
      _mm512_mask_set1_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm512_maskz_broadcastb_epi8(f(k), f(a))
    case MM512_MASKZ_SET1_EPI8 (k, a) =>
      _mm512_maskz_set1_epi8(f(k), f(a))
    case MM_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM_MASK_SET1_EPI8 (src, k, a) =>
      _mm_mask_set1_epi8(f(src), f(k), f(a))
    case MM_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm_maskz_broadcastb_epi8(f(k), f(a))
    case MM_MASKZ_SET1_EPI8 (k, a) =>
      _mm_maskz_set1_epi8(f(k), f(a))
    case MM256_MASK_BROADCASTD_EPI32 (src, k, a) =>
      _mm256_mask_broadcastd_epi32(f(src), f(k), f(a))
    case MM256_MASK_SET1_EPI32 (src, k, a) =>
      _mm256_mask_set1_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTD_EPI32 (k, a) =>
      _mm256_maskz_broadcastd_epi32(f(k), f(a))
    case MM256_MASKZ_SET1_EPI32 (k, a) =>
      _mm256_maskz_set1_epi32(f(k), f(a))
    case MM_MASK_BROADCASTD_EPI32 (src, k, a) =>
      _mm_mask_broadcastd_epi32(f(src), f(k), f(a))
    case MM_MASK_SET1_EPI32 (src, k, a) =>
      _mm_mask_set1_epi32(f(src), f(k), f(a))
    case MM_MASKZ_BROADCASTD_EPI32 (k, a) =>
      _mm_maskz_broadcastd_epi32(f(k), f(a))
    case MM_MASKZ_SET1_EPI32 (k, a) =>
      _mm_maskz_set1_epi32(f(k), f(a))
    case MM256_BROADCASTMB_EPI64 (k) =>
      _mm256_broadcastmb_epi64(f(k))
    case MM_BROADCASTMB_EPI64 (k) =>
      _mm_broadcastmb_epi64(f(k))
    case MM256_BROADCASTMW_EPI32 (k) =>
      _mm256_broadcastmw_epi32(f(k))
    case MM_BROADCASTMW_EPI32 (k) =>
      _mm_broadcastmw_epi32(f(k))
    case MM256_MASK_BROADCASTQ_EPI64 (src, k, a) =>
      _mm256_mask_broadcastq_epi64(f(src), f(k), f(a))
    case MM256_MASK_SET1_EPI64 (src, k, a) =>
      _mm256_mask_set1_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTQ_EPI64 (k, a) =>
      _mm256_maskz_broadcastq_epi64(f(k), f(a))
    case MM256_MASKZ_SET1_EPI64 (k, a) =>
      _mm256_maskz_set1_epi64(f(k), f(a))
    case MM_MASK_BROADCASTQ_EPI64 (src, k, a) =>
      _mm_mask_broadcastq_epi64(f(src), f(k), f(a))
    case MM_MASK_SET1_EPI64 (src, k, a) =>
      _mm_mask_set1_epi64(f(src), f(k), f(a))
    case MM_MASKZ_BROADCASTQ_EPI64 (k, a) =>
      _mm_maskz_broadcastq_epi64(f(k), f(a))
    case MM_MASKZ_SET1_EPI64 (k, a) =>
      _mm_maskz_set1_epi64(f(k), f(a))
    case MM256_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm256_mask_broadcastw_epi16(f(src), f(k), f(a))
    case MM256_MASK_SET1_EPI16 (src, k, a) =>
      _mm256_mask_set1_epi16(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm256_maskz_broadcastw_epi16(f(k), f(a))
    case MM256_MASKZ_SET1_EPI16 (k, a) =>
      _mm256_maskz_set1_epi16(f(k), f(a))
    case MM512_BROADCASTW_EPI16 (a) =>
      _mm512_broadcastw_epi16(f(a))
    case MM512_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm512_mask_broadcastw_epi16(f(src), f(k), f(a))
    case MM512_MASK_SET1_EPI16 (src, k, a) =>
      _mm512_mask_set1_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm512_maskz_broadcastw_epi16(f(k), f(a))
    case MM512_MASKZ_SET1_EPI16 (k, a) =>
      _mm512_maskz_set1_epi16(f(k), f(a))
    case MM_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm_mask_broadcastw_epi16(f(src), f(k), f(a))
    case MM_MASK_SET1_EPI16 (src, k, a) =>
      _mm_mask_set1_epi16(f(src), f(k), f(a))
    case MM_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm_maskz_broadcastw_epi16(f(k), f(a))
    case MM_MASKZ_SET1_EPI16 (k, a) =>
      _mm_maskz_set1_epi16(f(k), f(a))
    case MM256_CMP_EPI8_MASK (a, b, imm8) =>
      _mm256_cmp_epi8_mask(f(a), f(b), f(imm8))
    case MM256_CMPEQ_EPI8_MASK (a, b) =>
      _mm256_cmpeq_epi8_mask(f(a), f(b))
    case MM256_CMPGE_EPI8_MASK (a, b) =>
      _mm256_cmpge_epi8_mask(f(a), f(b))
    case MM256_CMPGT_EPI8_MASK (a, b) =>
      _mm256_cmpgt_epi8_mask(f(a), f(b))
    case MM256_CMPLE_EPI8_MASK (a, b) =>
      _mm256_cmple_epi8_mask(f(a), f(b))
    case MM256_CMPLT_EPI8_MASK (a, b) =>
      _mm256_cmplt_epi8_mask(f(a), f(b))
    case MM256_CMPNEQ_EPI8_MASK (a, b) =>
      _mm256_cmpneq_epi8_mask(f(a), f(b))
    case MM256_MASK_CMP_EPI8_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epi8_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epi8_mask(f(k1), f(a), f(b))
    case MM512_CMP_EPI8_MASK (a, b, imm8) =>
      _mm512_cmp_epi8_mask(f(a), f(b), f(imm8))
    case MM512_CMPEQ_EPI8_MASK (a, b) =>
      _mm512_cmpeq_epi8_mask(f(a), f(b))
    case MM512_CMPGE_EPI8_MASK (a, b) =>
      _mm512_cmpge_epi8_mask(f(a), f(b))
    case MM512_CMPGT_EPI8_MASK (a, b) =>
      _mm512_cmpgt_epi8_mask(f(a), f(b))
    case MM512_CMPLE_EPI8_MASK (a, b) =>
      _mm512_cmple_epi8_mask(f(a), f(b))
    case MM512_CMPLT_EPI8_MASK (a, b) =>
      _mm512_cmplt_epi8_mask(f(a), f(b))
    case MM512_CMPNEQ_EPI8_MASK (a, b) =>
      _mm512_cmpneq_epi8_mask(f(a), f(b))
    case MM512_MASK_CMP_EPI8_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epi8_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi8_mask(f(k1), f(a), f(b))
    case MM_CMP_EPI8_MASK (a, b, imm8) =>
      _mm_cmp_epi8_mask(f(a), f(b), f(imm8))
    case MM_CMPEQ_EPI8_MASK (a, b) =>
      _mm_cmpeq_epi8_mask(f(a), f(b))
    case MM_CMPGE_EPI8_MASK (a, b) =>
      _mm_cmpge_epi8_mask(f(a), f(b))
    case MM_CMPGT_EPI8_MASK (a, b) =>
      _mm_cmpgt_epi8_mask(f(a), f(b))
    case MM_CMPLE_EPI8_MASK (a, b) =>
      _mm_cmple_epi8_mask(f(a), f(b))
    case MM_CMPLT_EPI8_MASK (a, b) =>
      _mm_cmplt_epi8_mask(f(a), f(b))
    case MM_CMPNEQ_EPI8_MASK (a, b) =>
      _mm_cmpneq_epi8_mask(f(a), f(b))
    case MM_MASK_CMP_EPI8_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epi8_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmple_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPNEQ_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi8_mask(f(k1), f(a), f(b))
    case MM256_CMP_EPI32_MASK (a, b, imm8) =>
      _mm256_cmp_epi32_mask(f(a), f(b), f(imm8))
    case MM256_CMPEQ_EPI32_MASK (a, b) =>
      _mm256_cmpeq_epi32_mask(f(a), f(b))
    case MM256_CMPGE_EPI32_MASK (a, b) =>
      _mm256_cmpge_epi32_mask(f(a), f(b))
    case MM256_CMPGT_EPI32_MASK (a, b) =>
      _mm256_cmpgt_epi32_mask(f(a), f(b))
    case MM256_CMPLE_EPI32_MASK (a, b) =>
      _mm256_cmple_epi32_mask(f(a), f(b))

    case Reflect(MM256_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI8 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI8 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI8 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI8 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ALIGNR_EPI8 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ALIGNR_EPI8 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI8 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI8 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AVG_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AVG_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AVG_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AVG_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AVG_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AVG_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AVG_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AVG_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AVG_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AVG_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTB_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTB_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTMB_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTMB_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTMB_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTMB_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTMW_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTMW_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTMW_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTMW_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTQ_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTQ_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTQ_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTQ_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTQ_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTQ_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTQ_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTQ_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTW_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTW_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPI8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPI8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPI8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPI8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPI8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPI8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512011 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM256_MASK_ADDS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADDS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ADDS_EPI8(a, b) =>
      emitValDef(sym, s"_mm512_adds_epi8(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADDS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADDS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADDS_EPI8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADDS_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADDS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADDS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ADDS_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_adds_epi16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADDS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADDS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADDS_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADDS_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADDS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADDS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ADDS_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_adds_epu8(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADDS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADDS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADDS_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADDS_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADDS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADDS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ADDS_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_adds_epu16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADDS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADDS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADDS_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADDS_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_ADD_EPI16(a, b) =>
      emitValDef(sym, s"_mm512_add_epi16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_ADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ADD_EPI16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADD_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      emitValDef(sym, s"_mm256_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASKZ_ALIGNR_EPI8(k, a, b, count) =>
      emitValDef(sym, s"_mm256_maskz_alignr_epi8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_ALIGNR_EPI8(a, b, count) =>
      emitValDef(sym, s"_mm512_alignr_epi8(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      emitValDef(sym, s"_mm512_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASKZ_ALIGNR_EPI8(k, a, b, count) =>
      emitValDef(sym, s"_mm512_maskz_alignr_epi8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      emitValDef(sym, s"_mm_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM_MASKZ_ALIGNR_EPI8(k, a, b, count) =>
      emitValDef(sym, s"_mm_maskz_alignr_epi8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM256_MASK_AND_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_and_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AND_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_and_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AND_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_and_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AND_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_and_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ANDNOT_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_andnot_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ANDNOT_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_andnot_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ANDNOT_EPI32(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_andnot_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ANDNOT_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_andnot_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_ANDNOT_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_andnot_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_ANDNOT_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_andnot_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_ANDNOT_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_andnot_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ANDNOT_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_andnot_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_AND_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_and_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AND_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_and_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AND_EPI64(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_and_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AND_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_and_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_AVG_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_avg_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AVG_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AVG_EPU8(a, b) =>
      emitValDef(sym, s"_mm512_avg_epu8(${quote(a)}, ${quote(b)})")
    case MM512_MASK_AVG_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_avg_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_AVG_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AVG_EPU8(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_avg_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AVG_EPU8(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_AVG_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_AVG_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_AVG_EPU16(a, b) =>
      emitValDef(sym, s"_mm512_avg_epu16(${quote(a)}, ${quote(b)})")
    case MM512_MASK_AVG_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm512_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_AVG_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_AVG_EPU16(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_AVG_EPU16(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_BLEND_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_EPI8(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_EPI32(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_EPI64(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BLEND_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm256_mask_blend_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_BLEND_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm512_mask_blend_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_BLEND_EPI16(k, a, b) =>
      emitValDef(sym, s"_mm_mask_blend_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_BROADCASTB_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_SET1_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTB_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SET1_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case MM512_BROADCASTB_EPI8(a) =>
      emitValDef(sym, s"_mm512_broadcastb_epi8(${quote(a)})")
    case MM512_MASK_BROADCASTB_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_SET1_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCASTB_EPI8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_SET1_EPI8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case MM_MASK_BROADCASTB_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_SET1_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCASTB_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SET1_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case MM256_MASK_BROADCASTD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_SET1_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_set1_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTD_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastd_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SET1_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_set1_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_BROADCASTD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcastd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_SET1_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_set1_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCASTD_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcastd_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SET1_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_set1_epi32(${quote(k)}, ${quote(a)})")
    case MM256_BROADCASTMB_EPI64(k) =>
      emitValDef(sym, s"_mm256_broadcastmb_epi64(${quote(k)})")
    case MM_BROADCASTMB_EPI64(k) =>
      emitValDef(sym, s"_mm_broadcastmb_epi64(${quote(k)})")
    case MM256_BROADCASTMW_EPI32(k) =>
      emitValDef(sym, s"_mm256_broadcastmw_epi32(${quote(k)})")
    case MM_BROADCASTMW_EPI32(k) =>
      emitValDef(sym, s"_mm_broadcastmw_epi32(${quote(k)})")
    case MM256_MASK_BROADCASTQ_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastq_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_SET1_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_set1_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTQ_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastq_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SET1_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_set1_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_BROADCASTQ_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcastq_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_SET1_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_set1_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCASTQ_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcastq_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SET1_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_set1_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_BROADCASTW_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_SET1_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTW_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_SET1_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case MM512_BROADCASTW_EPI16(a) =>
      emitValDef(sym, s"_mm512_broadcastw_epi16(${quote(a)})")
    case MM512_MASK_BROADCASTW_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_SET1_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCASTW_EPI16(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_SET1_EPI16(k, a) =>
      emitValDef(sym, s"_mm512_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case MM_MASK_BROADCASTW_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_SET1_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCASTW_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_SET1_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CMP_EPI8_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm256_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_CMPEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpge_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPLE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPLT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmplt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPNEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMP_EPI8_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_cmp_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPNEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpneq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_EPI8_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMPEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpge_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmplt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMP_EPI8_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_cmp_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_CMP_EPI8_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMPEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpge_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLE_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLT_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmplt_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPNEQ_EPI8_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_CMP_EPI8_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPNEQ_EPI8_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpneq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_CMP_EPI32_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm256_cmp_epi32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_CMPEQ_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpeq_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGE_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpge_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGT_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpgt_epi32_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPLE_EPI32_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmple_epi32_mask(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
