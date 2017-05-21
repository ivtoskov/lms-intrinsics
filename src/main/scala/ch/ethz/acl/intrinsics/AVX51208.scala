package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51208 extends IntrinsicsBase {
  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPI32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPI32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPI64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPI64(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst". Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPI64(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPI64(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512i, k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPD_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTTPD_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPI64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPI64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPI64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPI64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPU32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPU32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPU32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPU32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPU64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPU64(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst". Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPU64(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPU64(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512i, k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPD_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTTPD_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPU64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPU64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPU64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPU64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256
   */
  case class MM256_MASK_CVTTPS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTTPS_EPI32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPI32(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM256_CVTTPS_EPI64(a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m128
   */
  case class MM256_MASK_CVTTPS_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst". Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m256, sae: int
   */
  case class MM512_CVTT_ROUNDPS_EPI64(a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m256
   */
  case class MM512_CVTTPS_EPI64(a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512i, k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTTPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPI64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPI64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_CVTTPS_EPU32(a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256
   */
  case class MM256_MASK_CVTTPS_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPU32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM256_CVTTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128
   */
  case class MM256_MASK_CVTTPS_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst". Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m256, sae: int
   */
  case class MM512_CVTT_ROUNDPS_EPU64(a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM512_CVTTPS_EPU64(a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512i, k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPS_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTTPS_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPU64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU32_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU32_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPU64_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPU64_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPU64_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPU64_PD(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPU64_PD(a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPU64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPU64_PD(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPU64_PD(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU64_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU64_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU64_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPU64_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPU64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPU64_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPU64_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPU64_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m256, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPU64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPU64_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPU64_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU64_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU64_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Four SADs are performed on four 8-bit quadruplets for each 64-bit
   * lane. The first two SADs use the lower 8-bit quadruplet of the lane from "a",
   * and the last two SADs use the uppper 8-bit quadruplet of the lane from "a".
   * Quadruplets from "b" are selected from within 128-bit lanes according to the
   * control in "imm8", and each SAD in each 64-bit lane uses the selected
   * quadruplet at 8-bit offsets.
   * a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_DBSAD_EPU8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	Four SADs are performed on four 8-bit
   * quadruplets for each 64-bit lane. The first two SADs use the lower 8-bit
   * quadruplet of the lane from "a", and the last two SADs use the uppper 8-bit
   * quadruplet of the lane from "a". Quadruplets from "b" are selected from within
   * 128-bit lanes according to the control in "imm8", and each SAD in each 64-bit
   * lane uses the selected quadruplet at 8-bit offsets.
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_DBSAD_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	Four SADs are performed on four 8-bit quadruplets for
   * each 64-bit lane. The first two SADs use the lower 8-bit quadruplet of the
   * lane from "a", and the last two SADs use the uppper 8-bit quadruplet of the
   * lane from "a". Quadruplets from "b" are selected from within 128-bit lanes
   * according to the control in "imm8", and each SAD in each 64-bit lane uses the
   * selected quadruplet at 8-bit offsets.
   * k: __mmask16, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Four SADs are performed on four 8-bit quadruplets for each 64-bit
   * lane. The first two SADs use the lower 8-bit quadruplet of the lane from "a",
   * and the last two SADs use the uppper 8-bit quadruplet of the lane from "a".
   * Quadruplets from "b" are selected from within 128-bit lanes according to the
   * control in "imm8", and each SAD in each 64-bit lane uses the selected
   * quadruplet at 8-bit offsets.
   * a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_DBSAD_EPU8(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	Four SADs are performed on four 8-bit
   * quadruplets for each 64-bit lane. The first two SADs use the lower 8-bit
   * quadruplet of the lane from "a", and the last two SADs use the uppper 8-bit
   * quadruplet of the lane from "a". Quadruplets from "b" are selected from within
   * 128-bit lanes according to the control in "imm8", and each SAD in each 64-bit
   * lane uses the selected quadruplet at 8-bit offsets.
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASK_DBSAD_EPU8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	Four SADs are performed on four 8-bit quadruplets for
   * each 64-bit lane. The first two SADs use the lower 8-bit quadruplet of the
   * lane from "a", and the last two SADs use the uppper 8-bit quadruplet of the
   * lane from "a". Quadruplets from "b" are selected from within 128-bit lanes
   * according to the control in "imm8", and each SAD in each 64-bit lane uses the
   * selected quadruplet at 8-bit offsets.
   * k: __mmask32, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Four SADs are performed on four 8-bit quadruplets for each 64-bit
   * lane. The first two SADs use the lower 8-bit quadruplet of the lane from "a",
   * and the last two SADs use the uppper 8-bit quadruplet of the lane from "a".
   * Quadruplets from "b" are selected according to the control in "imm8", and each
   * SAD in each 64-bit lane uses the selected quadruplet at 8-bit offsets.
   * a: __m128i, b: __m128i, imm8: int
   */
  case class MM_DBSAD_EPU8(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	Four SADs are performed on four 8-bit
   * quadruplets for each 64-bit lane. The first two SADs use the lower 8-bit
   * quadruplet of the lane from "a", and the last two SADs use the uppper 8-bit
   * quadruplet of the lane from "a". Quadruplets from "b" are selected according
   * to the control in "imm8", and each SAD in each 64-bit lane uses the selected
   * quadruplet at 8-bit offsets.
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_DBSAD_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	Four SADs are performed on four 8-bit quadruplets for
   * each 64-bit lane. The first two SADs use the lower 8-bit quadruplet of the
   * lane from "a", and the last two SADs use the uppper 8-bit quadruplet of the
   * lane from "a". Quadruplets from "b" are selected according to the control in
   * "imm8", and each SAD in each 64-bit lane uses the selected quadruplet at 8-bit
   * offsets.
   * k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_DIV_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_DIV_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_DIV_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_DIV_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_DIV_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_DIV_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_EXPAND_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_EXPAND_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_EXPAND_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_EXPAND_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_EXPAND_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_EXPAND_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_EXPAND_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_EXPAND_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_EXTRACTF32X4_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_EXTRACTF32X4_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASKZ_EXTRACTF32X4_PS(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_EXTRACTF32X8_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m512, imm8: int
   */
  case class MM512_MASK_EXTRACTF32X8_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF32X8_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_EXTRACTF64X2_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_EXTRACTF64X2_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_EXTRACTF64X2_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_EXTRACTF64X2_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_EXTRACTF64X2_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF64X2_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_EXTRACTI32X4_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASK_EXTRACTI32X4_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_EXTRACTI32X4_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed 32-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI32X8_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI32X8_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI32X8_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_EXTRACTI64X2_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASK_EXTRACTI64X2_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_EXTRACTI64X2_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI64X2_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI64X2_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI64X2_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m256d, b: __m256d, c: __m256i, imm8: int
   */
  case class MM256_FIXUPIMM_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256i, imm8: int
   */
  case class MM256_MASK_FIXUPIMM_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_FIXUPIMM_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m256, b: __m256, c: __m256i, imm8: int
   */
  case class MM256_FIXUPIMM_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m256, k: __mmask8, b: __m256, c: __m256i, imm8: int
   */
  case class MM256_MASK_FIXUPIMM_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m256, b: __m256, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_FIXUPIMM_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMADD_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_cvtepi64_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CVTEPI64_PS(a)
  }
            
  def _mm_mask_cvtepi64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm_maskz_cvtepi64_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTEPI64_PS(k, a)
  }
            
  def _mm256_mask_cvttpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm_mask_cvttpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm256_cvttpd_epi64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTTPD_EPI64(a)
  }
            
  def _mm256_mask_cvttpd_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvttpd_epi64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPD_EPI64(k, a)
  }
            
  def _mm512_cvtt_roundpd_epi64(a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPD_EPI64(a, sae)
  }
            
  def _mm512_cvttpd_epi64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTTPD_EPI64(a)
  }
            
  def _mm512_mask_cvtt_roundpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPD_EPI64(src, k, a, sae)
  }
            
  def _mm512_mask_cvttpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundpd_epi64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPI64(k, a, sae)
  }
            
  def _mm512_maskz_cvttpd_epi64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPD_EPI64(k, a)
  }
            
  def _mm_cvttpd_epi64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPI64(a)
  }
            
  def _mm_mask_cvttpd_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvttpd_epi64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPI64(k, a)
  }
            
  def _mm256_cvttpd_epu32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTTPD_EPU32(a)
  }
            
  def _mm256_mask_cvttpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTTPD_EPU32(src, k, a)
  }
            
  def _mm256_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm_cvttpd_epu32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPU32(a)
  }
            
  def _mm_mask_cvttpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPU32(src, k, a)
  }
            
  def _mm_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm256_cvttpd_epu64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTTPD_EPU64(a)
  }
            
  def _mm256_mask_cvttpd_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTTPD_EPU64(src, k, a)
  }
            
  def _mm256_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm512_cvtt_roundpd_epu64(a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPD_EPU64(a, sae)
  }
            
  def _mm512_cvttpd_epu64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTTPD_EPU64(a)
  }
            
  def _mm512_mask_cvtt_roundpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPD_EPU64(src, k, a, sae)
  }
            
  def _mm512_mask_cvttpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTTPD_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundpd_epu64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPU64(k, a, sae)
  }
            
  def _mm512_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm_cvttpd_epu64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPU64(a)
  }
            
  def _mm_mask_cvttpd_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPU64(src, k, a)
  }
            
  def _mm_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm256_mask_cvttps_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvttps_epi32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPI32(k, a)
  }
            
  def _mm_mask_cvttps_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvttps_epi32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPI32(k, a)
  }
            
  def _mm256_cvttps_epi64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTTPS_EPI64(a)
  }
            
  def _mm256_mask_cvttps_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm512_cvtt_roundps_epi64(a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPI64(a, sae)
  }
            
  def _mm512_cvttps_epi64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTTPS_EPI64(a)
  }
            
  def _mm512_mask_cvtt_roundps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPI64(src, k, a, sae)
  }
            
  def _mm512_mask_cvttps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundps_epi64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPI64(k, a, sae)
  }
            
  def _mm512_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm_cvttps_epi64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPI64(a)
  }
            
  def _mm_mask_cvttps_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm256_cvttps_epu32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTTPS_EPU32(a)
  }
            
  def _mm256_mask_cvttps_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm256_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm_cvttps_epu32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPU32(a)
  }
            
  def _mm_mask_cvttps_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm256_cvttps_epu64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTTPS_EPU64(a)
  }
            
  def _mm256_mask_cvttps_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPU64(src, k, a)
  }
            
  def _mm256_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm512_cvtt_roundps_epu64(a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPU64(a, sae)
  }
            
  def _mm512_cvttps_epu64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTTPS_EPU64(a)
  }
            
  def _mm512_mask_cvtt_roundps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPU64(src, k, a, sae)
  }
            
  def _mm512_mask_cvttps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundps_epu64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPU64(k, a, sae)
  }
            
  def _mm512_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm_cvttps_epu64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPU64(a)
  }
            
  def _mm_mask_cvttps_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPU64(src, k, a)
  }
            
  def _mm_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm256_cvtepu32_pd(a: Exp[__m128i]): Exp[__m256d] = {
    MM256_CVTEPU32_PD(a)
  }
            
  def _mm256_mask_cvtepu32_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm256_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm_cvtepu32_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPU32_PD(a)
  }
            
  def _mm_mask_cvtepu32_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm256_cvtepu64_pd(a: Exp[__m256i]): Exp[__m256d] = {
    MM256_CVTEPU64_PD(a)
  }
            
  def _mm256_mask_cvtepu64_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm256_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm512_cvt_roundepu64_pd(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_CVT_ROUNDEPU64_PD(a, rounding)
  }
            
  def _mm512_cvtepu64_pd(a: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPU64_PD(a)
  }
            
  def _mm512_mask_cvt_roundepu64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDEPU64_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepu64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepu64_pd(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_CVT_ROUNDEPU64_PD(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm_cvtepu64_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPU64_PD(a)
  }
            
  def _mm_mask_cvtepu64_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm256_cvtepu64_ps(a: Exp[__m256i]): Exp[__m128] = {
    MM256_CVTEPU64_PS(a)
  }
            
  def _mm256_mask_cvtepu64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm256_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm512_cvt_roundepu64_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_CVT_ROUNDEPU64_PS(a, rounding)
  }
            
  def _mm512_cvtepu64_ps(a: Exp[__m512i]): Exp[__m256] = {
    MM512_CVTEPU64_PS(a)
  }
            
  def _mm512_mask_cvt_roundepu64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASK_CVT_ROUNDEPU64_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepu64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepu64_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDEPU64_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm_cvtepu64_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CVTEPU64_PS(a)
  }
            
  def _mm_mask_cvtepu64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm256_dbsad_epu8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_DBSAD_EPU8(a, b, imm8)
  }
            
  def _mm256_mask_dbsad_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm256_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm512_dbsad_epu8(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_DBSAD_EPU8(a, b, imm8)
  }
            
  def _mm512_mask_dbsad_epu8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm_dbsad_epu8(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_DBSAD_EPU8(a, b, imm8)
  }
            
  def _mm_mask_dbsad_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm256_mask_div_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_DIV_PD(src, k, a, b)
  }
            
  def _mm256_maskz_div_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_DIV_PD(k, a, b)
  }
            
  def _mm_mask_div_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_DIV_PD(src, k, a, b)
  }
            
  def _mm_maskz_div_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_DIV_PD(k, a, b)
  }
            
  def _mm256_mask_div_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_DIV_PS(src, k, a, b)
  }
            
  def _mm256_maskz_div_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm_mask_div_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_DIV_PS(src, k, a, b)
  }
            
  def _mm_maskz_div_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm256_mask_expand_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm256_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_expand_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_EXPAND_PD(k, a)
  }
            
  def _mm256_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_expand_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_expand_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_EXPAND_PD(k, a)
  }
            
  def _mm_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_expand_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm256_mask_expandloadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_expand_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_EXPAND_PS(k, a)
  }
            
  def _mm256_maskz_expandloadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_expand_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm_mask_expandloadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_expand_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_EXPAND_PS(k, a)
  }
            
  def _mm_maskz_expandloadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_extractf32x4_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_EXTRACTF32X4_PS(a, imm8)
  }
            
  def _mm256_mask_extractf32x4_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_MASK_EXTRACTF32X4_PS(src, k, a, imm8)
  }
            
  def _mm256_maskz_extractf32x4_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_MASKZ_EXTRACTF32X4_PS(k, a, imm8)
  }
            
  def _mm512_extractf32x8_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m256] = {
    MM512_EXTRACTF32X8_PS(a, imm8)
  }
            
  def _mm512_mask_extractf32x8_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m256] = {
    MM512_MASK_EXTRACTF32X8_PS(src, k, a, imm8)
  }
            
  def _mm512_maskz_extractf32x8_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_EXTRACTF32X8_PS(k, a, imm8)
  }
            
  def _mm256_extractf64x2_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_EXTRACTF64X2_PD(a, imm8)
  }
            
  def _mm256_mask_extractf64x2_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_MASK_EXTRACTF64X2_PD(src, k, a, imm8)
  }
            
  def _mm256_maskz_extractf64x2_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_MASKZ_EXTRACTF64X2_PD(k, a, imm8)
  }
            
  def _mm512_extractf64x2_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m128d] = {
    MM512_EXTRACTF64X2_PD(a, imm8)
  }
            
  def _mm512_mask_extractf64x2_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m128d] = {
    MM512_MASK_EXTRACTF64X2_PD(src, k, a, imm8)
  }
            
  def _mm512_maskz_extractf64x2_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m128d] = {
    MM512_MASKZ_EXTRACTF64X2_PD(k, a, imm8)
  }
            
  def _mm256_extracti32x4_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTI32X4_EPI32(a, imm8)
  }
            
  def _mm256_mask_extracti32x4_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8)
  }
            
  def _mm256_maskz_extracti32x4_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8)
  }
            
  def _mm512_extracti32x8_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_EXTRACTI32X8_EPI32(a, imm8)
  }
            
  def _mm512_mask_extracti32x8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_EXTRACTI32X8_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_extracti32x8_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_EXTRACTI32X8_EPI32(k, a, imm8)
  }
            
  def _mm256_extracti64x2_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTI64X2_EPI64(a, imm8)
  }
            
  def _mm256_mask_extracti64x2_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8)
  }
            
  def _mm256_maskz_extracti64x2_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8)
  }
            
  def _mm512_extracti64x2_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_EXTRACTI64X2_EPI64(a, imm8)
  }
            
  def _mm512_mask_extracti64x2_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8)
  }
            
  def _mm512_maskz_extracti64x2_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8)
  }
            
  def _mm256_fixupimm_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  def _mm256_mask_fixupimm_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm256_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm_fixupimm_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  def _mm_mask_fixupimm_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm256_fixupimm_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm256_mask_fixupimm_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm256_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm_fixupimm_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm_mask_fixupimm_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm256_mask3_fmadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMADD_PD(a, b, c, k)
  }
            
  def _mm256_mask_fmadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMADD_PD(a, k, b, c)
  }
            
  def _mm256_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm_mask3_fmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_PD(a, b, c, k)
  }
            
  def _mm_mask_fmadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADD_PD(a, k, b, c)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_CVTEPI64_PS (a) =>
      _mm_cvtepi64_ps(f(a))
    case MM_MASK_CVTEPI64_PS (src, k, a) =>
      _mm_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI64_PS (k, a) =>
      _mm_maskz_cvtepi64_ps(f(k), f(a))
    case MM256_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm256_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm256_maskz_cvttpd_epi32(f(k), f(a))
    case MM_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm_maskz_cvttpd_epi32(f(k), f(a))
    case MM256_CVTTPD_EPI64 (a) =>
      _mm256_cvttpd_epi64(f(a))
    case MM256_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm256_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPD_EPI64 (k, a) =>
      _mm256_maskz_cvttpd_epi64(f(k), f(a))
    case MM512_CVTT_ROUNDPD_EPI64 (a, sae) =>
      _mm512_cvtt_roundpd_epi64(f(a), f(sae))
    case MM512_CVTTPD_EPI64 (a) =>
      _mm512_cvttpd_epi64(f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPI64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epi64(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm512_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPD_EPI64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epi64(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPD_EPI64 (k, a) =>
      _mm512_maskz_cvttpd_epi64(f(k), f(a))
    case MM_CVTTPD_EPI64 (a) =>
      _mm_cvttpd_epi64(f(a))
    case MM_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPD_EPI64 (k, a) =>
      _mm_maskz_cvttpd_epi64(f(k), f(a))
    case MM256_CVTTPD_EPU32 (a) =>
      _mm256_cvttpd_epu32(f(a))
    case MM256_MASK_CVTTPD_EPU32 (src, k, a) =>
      _mm256_mask_cvttpd_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm256_maskz_cvttpd_epu32(f(k), f(a))
    case MM_CVTTPD_EPU32 (a) =>
      _mm_cvttpd_epu32(f(a))
    case MM_MASK_CVTTPD_EPU32 (src, k, a) =>
      _mm_mask_cvttpd_epu32(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm_maskz_cvttpd_epu32(f(k), f(a))
    case MM256_CVTTPD_EPU64 (a) =>
      _mm256_cvttpd_epu64(f(a))
    case MM256_MASK_CVTTPD_EPU64 (src, k, a) =>
      _mm256_mask_cvttpd_epu64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm256_maskz_cvttpd_epu64(f(k), f(a))
    case MM512_CVTT_ROUNDPD_EPU64 (a, sae) =>
      _mm512_cvtt_roundpd_epu64(f(a), f(sae))
    case MM512_CVTTPD_EPU64 (a) =>
      _mm512_cvttpd_epu64(f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPU64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epu64(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPD_EPU64 (src, k, a) =>
      _mm512_mask_cvttpd_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPD_EPU64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epu64(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm512_maskz_cvttpd_epu64(f(k), f(a))
    case MM_CVTTPD_EPU64 (a) =>
      _mm_cvttpd_epu64(f(a))
    case MM_MASK_CVTTPD_EPU64 (src, k, a) =>
      _mm_mask_cvttpd_epu64(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm_maskz_cvttpd_epu64(f(k), f(a))
    case MM256_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm256_mask_cvttps_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPS_EPI32 (k, a) =>
      _mm256_maskz_cvttps_epi32(f(k), f(a))
    case MM_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm_mask_cvttps_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPS_EPI32 (k, a) =>
      _mm_maskz_cvttps_epi32(f(k), f(a))
    case MM256_CVTTPS_EPI64 (a) =>
      _mm256_cvttps_epi64(f(a))
    case MM256_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm256_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm256_maskz_cvttps_epi64(f(k), f(a))
    case MM512_CVTT_ROUNDPS_EPI64 (a, sae) =>
      _mm512_cvtt_roundps_epi64(f(a), f(sae))
    case MM512_CVTTPS_EPI64 (a) =>
      _mm512_cvttps_epi64(f(a))
    case MM512_MASK_CVTT_ROUNDPS_EPI64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epi64(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm512_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPS_EPI64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epi64(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm512_maskz_cvttps_epi64(f(k), f(a))
    case MM_CVTTPS_EPI64 (a) =>
      _mm_cvttps_epi64(f(a))
    case MM_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm_maskz_cvttps_epi64(f(k), f(a))
    case MM256_CVTTPS_EPU32 (a) =>
      _mm256_cvttps_epu32(f(a))
    case MM256_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm256_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm256_maskz_cvttps_epu32(f(k), f(a))
    case MM_CVTTPS_EPU32 (a) =>
      _mm_cvttps_epu32(f(a))
    case MM_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm_maskz_cvttps_epu32(f(k), f(a))
    case MM256_CVTTPS_EPU64 (a) =>
      _mm256_cvttps_epu64(f(a))
    case MM256_MASK_CVTTPS_EPU64 (src, k, a) =>
      _mm256_mask_cvttps_epu64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm256_maskz_cvttps_epu64(f(k), f(a))
    case MM512_CVTT_ROUNDPS_EPU64 (a, sae) =>
      _mm512_cvtt_roundps_epu64(f(a), f(sae))
    case MM512_CVTTPS_EPU64 (a) =>
      _mm512_cvttps_epu64(f(a))
    case MM512_MASK_CVTT_ROUNDPS_EPU64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epu64(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPS_EPU64 (src, k, a) =>
      _mm512_mask_cvttps_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPS_EPU64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epu64(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm512_maskz_cvttps_epu64(f(k), f(a))
    case MM_CVTTPS_EPU64 (a) =>
      _mm_cvttps_epu64(f(a))
    case MM_MASK_CVTTPS_EPU64 (src, k, a) =>
      _mm_mask_cvttps_epu64(f(src), f(k), f(a))
    case MM_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm_maskz_cvttps_epu64(f(k), f(a))
    case MM256_CVTEPU32_PD (a) =>
      _mm256_cvtepu32_pd(f(a))
    case MM256_MASK_CVTEPU32_PD (src, k, a) =>
      _mm256_mask_cvtepu32_pd(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU32_PD (k, a) =>
      _mm256_maskz_cvtepu32_pd(f(k), f(a))
    case MM_CVTEPU32_PD (a) =>
      _mm_cvtepu32_pd(f(a))
    case MM_MASK_CVTEPU32_PD (src, k, a) =>
      _mm_mask_cvtepu32_pd(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU32_PD (k, a) =>
      _mm_maskz_cvtepu32_pd(f(k), f(a))
    case MM256_CVTEPU64_PD (a) =>
      _mm256_cvtepu64_pd(f(a))
    case MM256_MASK_CVTEPU64_PD (src, k, a) =>
      _mm256_mask_cvtepu64_pd(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU64_PD (k, a) =>
      _mm256_maskz_cvtepu64_pd(f(k), f(a))
    case MM512_CVT_ROUNDEPU64_PD (a, rounding) =>
      _mm512_cvt_roundepu64_pd(f(a), f(rounding))
    case MM512_CVTEPU64_PD (a) =>
      _mm512_cvtepu64_pd(f(a))
    case MM512_MASK_CVT_ROUNDEPU64_PD (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu64_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPU64_PD (src, k, a) =>
      _mm512_mask_cvtepu64_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPU64_PD (k, a, rounding) =>
      _mm512_maskz_cvt_roundepu64_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPU64_PD (k, a) =>
      _mm512_maskz_cvtepu64_pd(f(k), f(a))
    case MM_CVTEPU64_PD (a) =>
      _mm_cvtepu64_pd(f(a))
    case MM_MASK_CVTEPU64_PD (src, k, a) =>
      _mm_mask_cvtepu64_pd(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU64_PD (k, a) =>
      _mm_maskz_cvtepu64_pd(f(k), f(a))
    case MM256_CVTEPU64_PS (a) =>
      _mm256_cvtepu64_ps(f(a))
    case MM256_MASK_CVTEPU64_PS (src, k, a) =>
      _mm256_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU64_PS (k, a) =>
      _mm256_maskz_cvtepu64_ps(f(k), f(a))
    case MM512_CVT_ROUNDEPU64_PS (a, rounding) =>
      _mm512_cvt_roundepu64_ps(f(a), f(rounding))
    case MM512_CVTEPU64_PS (a) =>
      _mm512_cvtepu64_ps(f(a))
    case MM512_MASK_CVT_ROUNDEPU64_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu64_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPU64_PS (src, k, a) =>
      _mm512_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPU64_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepu64_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPU64_PS (k, a) =>
      _mm512_maskz_cvtepu64_ps(f(k), f(a))
    case MM_CVTEPU64_PS (a) =>
      _mm_cvtepu64_ps(f(a))
    case MM_MASK_CVTEPU64_PS (src, k, a) =>
      _mm_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU64_PS (k, a) =>
      _mm_maskz_cvtepu64_ps(f(k), f(a))
    case MM256_DBSAD_EPU8 (a, b, imm8) =>
      _mm256_dbsad_epu8(f(a), f(b), f(imm8))
    case MM256_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm256_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm256_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case MM512_DBSAD_EPU8 (a, b, imm8) =>
      _mm512_dbsad_epu8(f(a), f(b), f(imm8))
    case MM512_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm512_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm512_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case MM_DBSAD_EPU8 (a, b, imm8) =>
      _mm_dbsad_epu8(f(a), f(b), f(imm8))
    case MM_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_DIV_PD (src, k, a, b) =>
      _mm256_mask_div_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_DIV_PD (k, a, b) =>
      _mm256_maskz_div_pd(f(k), f(a), f(b))
    case MM_MASK_DIV_PD (src, k, a, b) =>
      _mm_mask_div_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_DIV_PD (k, a, b) =>
      _mm_maskz_div_pd(f(k), f(a), f(b))
    case MM256_MASK_DIV_PS (src, k, a, b) =>
      _mm256_mask_div_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_DIV_PS (k, a, b) =>
      _mm256_maskz_div_ps(f(k), f(a), f(b))
    case MM_MASK_DIV_PS (src, k, a, b) =>
      _mm_mask_div_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_DIV_PS (k, a, b) =>
      _mm_maskz_div_ps(f(k), f(a), f(b))
    case MM256_MASK_EXPAND_PD (src, k, a) =>
      _mm256_mask_expand_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_EXPAND_PD (k, a) =>
      _mm256_maskz_expand_pd(f(k), f(a))
    case iDef@MM256_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_EXPAND_PD (src, k, a) =>
      _mm_mask_expand_pd(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_EXPAND_PD (k, a) =>
      _mm_maskz_expand_pd(f(k), f(a))
    case iDef@MM_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_EXPAND_PS (src, k, a) =>
      _mm256_mask_expand_ps(f(src), f(k), f(a))
    case iDef@MM256_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_EXPAND_PS (k, a) =>
      _mm256_maskz_expand_ps(f(k), f(a))
    case iDef@MM256_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_EXPAND_PS (src, k, a) =>
      _mm_mask_expand_ps(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_EXPAND_PS (k, a) =>
      _mm_maskz_expand_ps(f(k), f(a))
    case iDef@MM_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_EXTRACTF32X4_PS (a, imm8) =>
      _mm256_extractf32x4_ps(f(a), f(imm8))
    case MM256_MASK_EXTRACTF32X4_PS (src, k, a, imm8) =>
      _mm256_mask_extractf32x4_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_EXTRACTF32X4_PS (k, a, imm8) =>
      _mm256_maskz_extractf32x4_ps(f(k), f(a), f(imm8))
    case MM512_EXTRACTF32X8_PS (a, imm8) =>
      _mm512_extractf32x8_ps(f(a), f(imm8))
    case MM512_MASK_EXTRACTF32X8_PS (src, k, a, imm8) =>
      _mm512_mask_extractf32x8_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTF32X8_PS (k, a, imm8) =>
      _mm512_maskz_extractf32x8_ps(f(k), f(a), f(imm8))
    case MM256_EXTRACTF64X2_PD (a, imm8) =>
      _mm256_extractf64x2_pd(f(a), f(imm8))
    case MM256_MASK_EXTRACTF64X2_PD (src, k, a, imm8) =>
      _mm256_mask_extractf64x2_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_EXTRACTF64X2_PD (k, a, imm8) =>
      _mm256_maskz_extractf64x2_pd(f(k), f(a), f(imm8))
    case MM512_EXTRACTF64X2_PD (a, imm8) =>
      _mm512_extractf64x2_pd(f(a), f(imm8))
    case MM512_MASK_EXTRACTF64X2_PD (src, k, a, imm8) =>
      _mm512_mask_extractf64x2_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTF64X2_PD (k, a, imm8) =>
      _mm512_maskz_extractf64x2_pd(f(k), f(a), f(imm8))
    case MM256_EXTRACTI32X4_EPI32 (a, imm8) =>
      _mm256_extracti32x4_epi32(f(a), f(imm8))
    case MM256_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8) =>
      _mm256_mask_extracti32x4_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8) =>
      _mm256_maskz_extracti32x4_epi32(f(k), f(a), f(imm8))
    case MM512_EXTRACTI32X8_EPI32 (a, imm8) =>
      _mm512_extracti32x8_epi32(f(a), f(imm8))
    case MM512_MASK_EXTRACTI32X8_EPI32 (src, k, a, imm8) =>
      _mm512_mask_extracti32x8_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTI32X8_EPI32 (k, a, imm8) =>
      _mm512_maskz_extracti32x8_epi32(f(k), f(a), f(imm8))
    case MM256_EXTRACTI64X2_EPI64 (a, imm8) =>
      _mm256_extracti64x2_epi64(f(a), f(imm8))
    case MM256_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8) =>
      _mm256_mask_extracti64x2_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8) =>
      _mm256_maskz_extracti64x2_epi64(f(k), f(a), f(imm8))
    case MM512_EXTRACTI64X2_EPI64 (a, imm8) =>
      _mm512_extracti64x2_epi64(f(a), f(imm8))
    case MM512_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8) =>
      _mm512_mask_extracti64x2_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8) =>
      _mm512_maskz_extracti64x2_epi64(f(k), f(a), f(imm8))
    case MM256_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm256_fixupimm_pd(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm256_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM256_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm256_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm_fixupimm_pd(f(a), f(b), f(c), f(imm8))
    case MM_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm256_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm256_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case MM256_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm256_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case MM_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case MM_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASK3_FMADD_PD (a, b, c, k) =>
      _mm256_mask3_fmadd_pd(f(a), f(b), f(c), f(k))
    case MM256_MASK_FMADD_PD (a, k, b, c) =>
      _mm256_mask_fmadd_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm256_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADD_PD (a, b, c, k) =>
      _mm_mask3_fmadd_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMADD_PD (a, k, b, c) =>
      _mm_mask_fmadd_pd(f(a), f(k), f(b), f(c))

    case Reflect(MM_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPI64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPI64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPI64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPI64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPU64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPU64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPU64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPU64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPI64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPI64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPI64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPI64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPU64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPU64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPU64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPU64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU64_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU64_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU64_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU64_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU64_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU64_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU64_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU64_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DBSAD_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_DBSAD_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DBSAD_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_DBSAD_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DBSAD_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_DBSAD_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DIV_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DIV_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DIV_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DIV_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DIV_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DIV_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF32X4_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF32X4_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTF32X4_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTF32X4_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTF32X4_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTF32X4_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF32X8_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF32X8_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF32X8_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF32X8_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF32X8_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF32X8_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF64X2_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF64X2_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTF64X2_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTF64X2_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTF64X2_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTF64X2_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF64X2_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF64X2_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF64X2_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF64X2_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF64X2_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF64X2_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTI32X4_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTI32X4_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTI32X4_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTI32X4_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI32X8_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI32X8_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI32X8_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI32X8_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI32X8_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI32X8_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTI64X2_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTI64X2_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTI64X2_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTI64X2_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI64X2_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI64X2_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI64X2_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI64X2_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51208 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM_CVTEPI64_PS(a) =>
      emitValDef(sym, s"_mm_cvtepi64_ps(${quote(a)})")
    case MM_MASK_CVTEPI64_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI64_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi64_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPD_EPI64(a) =>
      emitValDef(sym, s"_mm256_cvttpd_epi64(${quote(a)})")
    case MM256_MASK_CVTTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttpd_epi64(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPD_EPI64(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundpd_epi64(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPD_EPI64(a) =>
      emitValDef(sym, s"_mm512_cvttpd_epi64(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPD_EPI64(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPD_EPI64(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epi64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttpd_epi64(${quote(k)}, ${quote(a)})")
    case MM_CVTTPD_EPI64(a) =>
      emitValDef(sym, s"_mm_cvttpd_epi64(${quote(a)})")
    case MM_MASK_CVTTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttpd_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPD_EPU32(a) =>
      emitValDef(sym, s"_mm256_cvttpd_epu32(${quote(a)})")
    case MM256_MASK_CVTTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case MM_CVTTPD_EPU32(a) =>
      emitValDef(sym, s"_mm_cvttpd_epu32(${quote(a)})")
    case MM_MASK_CVTTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPD_EPU64(a) =>
      emitValDef(sym, s"_mm256_cvttpd_epu64(${quote(a)})")
    case MM256_MASK_CVTTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPD_EPU64(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundpd_epu64(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPD_EPU64(a) =>
      emitValDef(sym, s"_mm512_cvttpd_epu64(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPD_EPU64(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPD_EPU64(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epu64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case MM_CVTTPD_EPU64(a) =>
      emitValDef(sym, s"_mm_cvttpd_epu64(${quote(a)})")
    case MM_MASK_CVTTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttps_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttps_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPS_EPI64(a) =>
      emitValDef(sym, s"_mm256_cvttps_epi64(${quote(a)})")
    case MM256_MASK_CVTTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPS_EPI64(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundps_epi64(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPS_EPI64(a) =>
      emitValDef(sym, s"_mm512_cvttps_epi64(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPS_EPI64(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPS_EPI64(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epi64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case MM_CVTTPS_EPI64(a) =>
      emitValDef(sym, s"_mm_cvttps_epi64(${quote(a)})")
    case MM_MASK_CVTTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPS_EPU32(a) =>
      emitValDef(sym, s"_mm256_cvttps_epu32(${quote(a)})")
    case MM256_MASK_CVTTPS_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPS_EPU32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case MM_CVTTPS_EPU32(a) =>
      emitValDef(sym, s"_mm_cvttps_epu32(${quote(a)})")
    case MM_MASK_CVTTPS_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPS_EPU32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case MM256_CVTTPS_EPU64(a) =>
      emitValDef(sym, s"_mm256_cvttps_epu64(${quote(a)})")
    case MM256_MASK_CVTTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvttps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPS_EPU64(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundps_epu64(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPS_EPU64(a) =>
      emitValDef(sym, s"_mm512_cvttps_epu64(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPS_EPU64(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPS_EPU64(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epu64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case MM_CVTTPS_EPU64(a) =>
      emitValDef(sym, s"_mm_cvttps_epu64(${quote(a)})")
    case MM_MASK_CVTTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvttps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPU32_PD(a) =>
      emitValDef(sym, s"_mm256_cvtepu32_pd(${quote(a)})")
    case MM256_MASK_CVTEPU32_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU32_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case MM_CVTEPU32_PD(a) =>
      emitValDef(sym, s"_mm_cvtepu32_pd(${quote(a)})")
    case MM_MASK_CVTEPU32_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU32_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPU64_PD(a) =>
      emitValDef(sym, s"_mm256_cvtepu64_pd(${quote(a)})")
    case MM256_MASK_CVTEPU64_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU64_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDEPU64_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundepu64_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTEPU64_PD(a) =>
      emitValDef(sym, s"_mm512_cvtepu64_pd(${quote(a)})")
    case MM512_MASK_CVT_ROUNDEPU64_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTEPU64_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDEPU64_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundepu64_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTEPU64_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case MM_CVTEPU64_PD(a) =>
      emitValDef(sym, s"_mm_cvtepu64_pd(${quote(a)})")
    case MM_MASK_CVTEPU64_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU64_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPU64_PS(a) =>
      emitValDef(sym, s"_mm256_cvtepu64_ps(${quote(a)})")
    case MM256_MASK_CVTEPU64_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU64_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDEPU64_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundepu64_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTEPU64_PS(a) =>
      emitValDef(sym, s"_mm512_cvtepu64_ps(${quote(a)})")
    case MM512_MASK_CVT_ROUNDEPU64_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTEPU64_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDEPU64_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundepu64_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTEPU64_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case MM_CVTEPU64_PS(a) =>
      emitValDef(sym, s"_mm_cvtepu64_ps(${quote(a)})")
    case MM_MASK_CVTEPU64_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPU64_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case MM256_DBSAD_EPU8(a, b, imm8) =>
      emitValDef(sym, s"_mm256_dbsad_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      emitValDef(sym, s"_mm256_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_DBSAD_EPU8(a, b, imm8) =>
      emitValDef(sym, s"_mm512_dbsad_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      emitValDef(sym, s"_mm512_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_DBSAD_EPU8(a, b, imm8) =>
      emitValDef(sym, s"_mm_dbsad_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      emitValDef(sym, s"_mm_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_DIV_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_div_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_DIV_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_div_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_DIV_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_div_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_DIV_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_div_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_DIV_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_div_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_DIV_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_DIV_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_div_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_DIV_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_EXPAND_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_EXPAND_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_expand_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_expandloadu_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_EXPAND_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_EXPAND_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_expand_pd(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_expandloadu_pd(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASK_EXPAND_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_expandloadu_ps(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_EXPAND_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_expand_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_expandloadu_ps(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_EXPAND_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_expandloadu_ps(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASKZ_EXPAND_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_expand_ps(${quote(k)}, ${quote(a)})")
    case MM_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_maskz_expandloadu_ps(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_EXTRACTF32X4_PS(a, imm8) =>
      emitValDef(sym, s"_mm256_extractf32x4_ps(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_EXTRACTF32X4_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_extractf32x4_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_EXTRACTF32X4_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_extractf32x4_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_EXTRACTF32X8_PS(a, imm8) =>
      emitValDef(sym, s"_mm512_extractf32x8_ps(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_EXTRACTF32X8_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_extractf32x8_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_EXTRACTF32X8_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_extractf32x8_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_EXTRACTF64X2_PD(a, imm8) =>
      emitValDef(sym, s"_mm256_extractf64x2_pd(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_EXTRACTF64X2_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_extractf64x2_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_EXTRACTF64X2_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_extractf64x2_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_EXTRACTF64X2_PD(a, imm8) =>
      emitValDef(sym, s"_mm512_extractf64x2_pd(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_EXTRACTF64X2_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_extractf64x2_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_EXTRACTF64X2_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_extractf64x2_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_EXTRACTI32X4_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm256_extracti32x4_epi32(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_extracti32x4_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_extracti32x4_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_EXTRACTI32X8_EPI32(a, imm8) =>
      emitValDef(sym, s"_mm512_extracti32x8_epi32(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_EXTRACTI32X8_EPI32(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_extracti32x8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_EXTRACTI32X8_EPI32(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_extracti32x8_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_EXTRACTI64X2_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm256_extracti64x2_epi64(${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_extracti64x2_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_extracti64x2_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_EXTRACTI64X2_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm512_extracti64x2_epi64(${quote(a)}, ${quote(imm8)})")
    case MM512_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm512_mask_extracti64x2_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM512_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm512_maskz_extracti64x2_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_FIXUPIMM_PD(a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      emitValDef(sym, s"_mm256_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_FIXUPIMM_PD(a, b, c, imm8) =>
      emitValDef(sym, s"_mm_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      emitValDef(sym, s"_mm_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_FIXUPIMM_PS(a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      emitValDef(sym, s"_mm256_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm256_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_FIXUPIMM_PS(a, b, c, imm8) =>
      emitValDef(sym, s"_mm_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      emitValDef(sym, s"_mm_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      emitValDef(sym, s"_mm_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case MM256_MASK3_FMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm256_mask3_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM256_MASK_FMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm256_mask_fmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case MM256_MASKZ_FMADD_PD(k, a, b, c) =>
      emitValDef(sym, s"_mm256_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case MM_MASK3_FMADD_PD(a, b, c, k) =>
      emitValDef(sym, s"_mm_mask3_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case MM_MASK_FMADD_PD(a, k, b, c) =>
      emitValDef(sym, s"_mm_mask_fmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case _ => super.emitNode(sym, rhs)
  }
}
