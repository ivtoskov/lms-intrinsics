package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX512015 extends IntrinsicsBase {
  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 64-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI64_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 64-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI64_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI32_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI32_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI32_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI32_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI32_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI32_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI64_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI64_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI64_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI64_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI64_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI64_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI64_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI64_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI64_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI64_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI64_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI64_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI16_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_CVTSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI16_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTSEPI16_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m512i
   */
  case class MM512_MASK_CVTSEPI16_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask32, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI16_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI16_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 32-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI8_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 32-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 4 bytes of "a" to packed 32-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI8_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 4 bytes of "a" to packed 32-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI8_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 2 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI8_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 2 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m128i
   */
  case class MM256_MASK_CVTEPI8_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI8_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPI8_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m256i
   */
  case class MM512_MASK_CVTEPI8_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i
   */
  case class MM512_MASKZ_CVTEPI8_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI8_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI8_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI32_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI16_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI16_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI16_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI16_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI16_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI16_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI32_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI32_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI32_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI32_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI32_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI32_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI64_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI64_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI64_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI64_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI64_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI64_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI64_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI64_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI64_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI64_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI64_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI64_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI16_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI16_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI16_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask32, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTUSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI16_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 16-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI16_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 16-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI16_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 16-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI16_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI16_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_CVTEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI16_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI16_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m512i
   */
  case class MM512_MASK_CVTEPI16_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask32, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI16_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI16_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU8_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_movepi64_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI64_MASK(a)
  }
            
  def _mm_movepi64_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI64_MASK(a)
  }
            
  def _mm256_cvtepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI8(a)
  }
            
  def _mm256_mask_cvtepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI8(k, a)
  }
            
  def _mm_cvtepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI8(a)
  }
            
  def _mm_mask_cvtepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI8(k, a)
  }
            
  def _mm256_cvtepi64_epi32(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI32(a)
  }
            
  def _mm256_mask_cvtepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI32(src, k, a)
  }
            
  def _mm256_mask_cvtepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI32(k, a)
  }
            
  def _mm_cvtepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI32(a)
  }
            
  def _mm_mask_cvtepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI32(src, k, a)
  }
            
  def _mm_mask_cvtepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI32(k, a)
  }
            
  def _mm256_cvtepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI16(a)
  }
            
  def _mm256_mask_cvtepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI16(k, a)
  }
            
  def _mm_cvtepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI16(a)
  }
            
  def _mm_mask_cvtepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi64_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI16(k, a)
  }
            
  def _mm256_cvtsepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI32_EPI8(a)
  }
            
  def _mm256_mask_cvtsepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI32_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtsepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI32_EPI8(k, a)
  }
            
  def _mm_cvtsepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI32_EPI8(a)
  }
            
  def _mm_mask_cvtsepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtsepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI32_EPI8(k, a)
  }
            
  def _mm256_cvtsepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI32_EPI16(a)
  }
            
  def _mm256_mask_cvtsepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI32_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtsepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI32_EPI16(k, a)
  }
            
  def _mm_cvtsepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI32_EPI16(a)
  }
            
  def _mm_mask_cvtsepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI32_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtsepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI32_EPI16(k, a)
  }
            
  def _mm256_cvtsepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI64_EPI8(a)
  }
            
  def _mm256_mask_cvtsepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI64_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI8(k, a)
  }
            
  def _mm_cvtsepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI8(a)
  }
            
  def _mm_mask_cvtsepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtsepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI64_EPI8(k, a)
  }
            
  def _mm256_cvtsepi64_epi32(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI64_EPI32(a)
  }
            
  def _mm256_mask_cvtsepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI64_EPI32(src, k, a)
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI32(k, a)
  }
            
  def _mm_cvtsepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI32(a)
  }
            
  def _mm_mask_cvtsepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI32(src, k, a)
  }
            
  def _mm_mask_cvtsepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI64_EPI32(k, a)
  }
            
  def _mm256_cvtsepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI64_EPI16(a)
  }
            
  def _mm256_mask_cvtsepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI64_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI16(k, a)
  }
            
  def _mm_cvtsepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI16(a)
  }
            
  def _mm_mask_cvtsepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtsepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi64_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI64_EPI16(k, a)
  }
            
  def _mm256_cvtsepi16_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI16_EPI8(a)
  }
            
  def _mm256_mask_cvtsepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtsepi16_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI16_EPI8(k, a)
  }
            
  def _mm512_cvtsepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTSEPI16_EPI8(a)
  }
            
  def _mm512_mask_cvtsepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm512_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvtsepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTSEPI16_EPI8(k, a)
  }
            
  def _mm_cvtsepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI16_EPI8(a)
  }
            
  def _mm_mask_cvtsepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtsepi16_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI16_EPI8(k, a)
  }
            
  def _mm256_mask_cvtepi8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtepi8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI32(k, a)
  }
            
  def _mm_mask_cvtepi8_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtepi8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI32(k, a)
  }
            
  def _mm256_mask_cvtepi8_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepi8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI64(k, a)
  }
            
  def _mm_mask_cvtepi8_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepi8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI64(k, a)
  }
            
  def _mm256_mask_cvtepi8_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm256_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm512_cvtepi8_epi16(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPI8_EPI16(a)
  }
            
  def _mm512_mask_cvtepi8_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm512_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm_mask_cvtepi8_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm256_mask_cvtepi32_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI32_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepi32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI32_EPI64(k, a)
  }
            
  def _mm_mask_cvtepi32_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI32_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepi32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI64(k, a)
  }
            
  def _mm256_mask_cvtepi16_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI16_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtepi16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI16_EPI32(k, a)
  }
            
  def _mm_mask_cvtepi16_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtepi16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI16_EPI32(k, a)
  }
            
  def _mm256_mask_cvtepi16_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI16_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtepi16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI16_EPI64(k, a)
  }
            
  def _mm_mask_cvtepi16_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtepi16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI16_EPI64(k, a)
  }
            
  def _mm256_cvtusepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI32_EPI8(a)
  }
            
  def _mm256_mask_cvtusepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI32_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtusepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI32_EPI8(k, a)
  }
            
  def _mm_cvtusepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI32_EPI8(a)
  }
            
  def _mm_mask_cvtusepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtusepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI32_EPI8(k, a)
  }
            
  def _mm256_cvtusepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI32_EPI16(a)
  }
            
  def _mm256_mask_cvtusepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI32_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtusepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI32_EPI16(k, a)
  }
            
  def _mm_cvtusepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI32_EPI16(a)
  }
            
  def _mm_mask_cvtusepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI32_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtusepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI32_EPI16(k, a)
  }
            
  def _mm256_cvtusepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI8(a)
  }
            
  def _mm256_mask_cvtusepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtusepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI8(k, a)
  }
            
  def _mm_cvtusepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI8(a)
  }
            
  def _mm_mask_cvtusepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtusepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI8(k, a)
  }
            
  def _mm256_cvtusepi64_epi32(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI32(a)
  }
            
  def _mm256_mask_cvtusepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI32(src, k, a)
  }
            
  def _mm256_mask_cvtusepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI32(k, a)
  }
            
  def _mm_cvtusepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI32(a)
  }
            
  def _mm_mask_cvtusepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI32(src, k, a)
  }
            
  def _mm_mask_cvtusepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI32(k, a)
  }
            
  def _mm256_cvtusepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI16(a)
  }
            
  def _mm256_mask_cvtusepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI16(src, k, a)
  }
            
  def _mm256_mask_cvtusepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI16(k, a)
  }
            
  def _mm_cvtusepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI16(a)
  }
            
  def _mm_mask_cvtusepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI16(src, k, a)
  }
            
  def _mm_mask_cvtusepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi64_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI16(k, a)
  }
            
  def _mm256_cvtusepi16_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI16_EPI8(a)
  }
            
  def _mm256_mask_cvtusepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm512_cvtusepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTUSEPI16_EPI8(a)
  }
            
  def _mm512_mask_cvtusepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm512_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm_cvtusepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI16_EPI8(a)
  }
            
  def _mm_mask_cvtusepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm256_movepi16_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI16_MASK(a)
  }
            
  def _mm512_movepi16_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI16_MASK(a)
  }
            
  def _mm_movepi16_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI16_MASK(a)
  }
            
  def _mm256_cvtepi16_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI16_EPI8(a)
  }
            
  def _mm256_mask_cvtepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi16_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI16_EPI8(k, a)
  }
            
  def _mm512_cvtepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTEPI16_EPI8(a)
  }
            
  def _mm512_mask_cvtepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm512_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvtepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTEPI16_EPI8(k, a)
  }
            
  def _mm_cvtepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI16_EPI8(a)
  }
            
  def _mm_mask_cvtepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepi16_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI16_EPI8(k, a)
  }
            
  def _mm256_mask_cvtepu8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtepu8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI32(k, a)
  }
            
  def _mm_mask_cvtepu8_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI32(src, k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MOVEPI64_MASK (a) =>
      _mm512_movepi64_mask(f(a))
    case MM_MOVEPI64_MASK (a) =>
      _mm_movepi64_mask(f(a))
    case MM256_CVTEPI64_EPI8 (a) =>
      _mm256_cvtepi64_epi8(f(a))
    case MM256_MASK_CVTEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi64_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtepi64_epi8(f(k), f(a))
    case MM_CVTEPI64_EPI8 (a) =>
      _mm_cvtepi64_epi8(f(a))
    case MM_MASK_CVTEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtepi64_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtepi64_epi8(f(k), f(a))
    case MM256_CVTEPI64_EPI32 (a) =>
      _mm256_cvtepi64_epi32(f(a))
    case MM256_MASK_CVTEPI64_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi64_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtepi64_epi32(f(k), f(a))
    case MM_CVTEPI64_EPI32 (a) =>
      _mm_cvtepi64_epi32(f(a))
    case MM_MASK_CVTEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtepi64_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtepi64_epi32(f(k), f(a))
    case MM256_CVTEPI64_EPI16 (a) =>
      _mm256_cvtepi64_epi16(f(a))
    case MM256_MASK_CVTEPI64_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi64_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtepi64_epi16(f(k), f(a))
    case MM_CVTEPI64_EPI16 (a) =>
      _mm_cvtepi64_epi16(f(a))
    case MM_MASK_CVTEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtepi64_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI64_EPI16 (k, a) =>
      _mm_maskz_cvtepi64_epi16(f(k), f(a))
    case MM256_CVTSEPI32_EPI8 (a) =>
      _mm256_cvtsepi32_epi8(f(a))
    case MM256_MASK_CVTSEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi32_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtsepi32_epi8(f(k), f(a))
    case MM_CVTSEPI32_EPI8 (a) =>
      _mm_cvtsepi32_epi8(f(a))
    case MM_MASK_CVTSEPI32_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi32_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtsepi32_epi8(f(k), f(a))
    case MM256_CVTSEPI32_EPI16 (a) =>
      _mm256_cvtsepi32_epi16(f(a))
    case MM256_MASK_CVTSEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtsepi32_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtsepi32_epi16(f(k), f(a))
    case MM_CVTSEPI32_EPI16 (a) =>
      _mm_cvtsepi32_epi16(f(a))
    case MM_MASK_CVTSEPI32_EPI16 (src, k, a) =>
      _mm_mask_cvtsepi32_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtsepi32_epi16(f(k), f(a))
    case MM256_CVTSEPI64_EPI8 (a) =>
      _mm256_cvtsepi64_epi8(f(a))
    case MM256_MASK_CVTSEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi64_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtsepi64_epi8(f(k), f(a))
    case MM_CVTSEPI64_EPI8 (a) =>
      _mm_cvtsepi64_epi8(f(a))
    case MM_MASK_CVTSEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi64_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtsepi64_epi8(f(k), f(a))
    case MM256_CVTSEPI64_EPI32 (a) =>
      _mm256_cvtsepi64_epi32(f(a))
    case MM256_MASK_CVTSEPI64_EPI32 (src, k, a) =>
      _mm256_mask_cvtsepi64_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtsepi64_epi32(f(k), f(a))
    case MM_CVTSEPI64_EPI32 (a) =>
      _mm_cvtsepi64_epi32(f(a))
    case MM_MASK_CVTSEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtsepi64_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtsepi64_epi32(f(k), f(a))
    case MM256_CVTSEPI64_EPI16 (a) =>
      _mm256_cvtsepi64_epi16(f(a))
    case MM256_MASK_CVTSEPI64_EPI16 (src, k, a) =>
      _mm256_mask_cvtsepi64_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtsepi64_epi16(f(k), f(a))
    case MM_CVTSEPI64_EPI16 (a) =>
      _mm_cvtsepi64_epi16(f(a))
    case MM_MASK_CVTSEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtsepi64_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI64_EPI16 (k, a) =>
      _mm_maskz_cvtsepi64_epi16(f(k), f(a))
    case MM256_CVTSEPI16_EPI8 (a) =>
      _mm256_cvtsepi16_epi8(f(a))
    case MM256_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTSEPI16_EPI8 (k, a) =>
      _mm256_maskz_cvtsepi16_epi8(f(k), f(a))
    case MM512_CVTSEPI16_EPI8 (a) =>
      _mm512_cvtsepi16_epi8(f(a))
    case MM512_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case iDef@MM512_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTSEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtsepi16_epi8(f(k), f(a))
    case MM_CVTSEPI16_EPI8 (a) =>
      _mm_cvtsepi16_epi8(f(a))
    case MM_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTSEPI16_EPI8 (k, a) =>
      _mm_maskz_cvtsepi16_epi8(f(k), f(a))
    case MM256_MASK_CVTEPI8_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi8_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI8_EPI32 (k, a) =>
      _mm256_maskz_cvtepi8_epi32(f(k), f(a))
    case MM_MASK_CVTEPI8_EPI32 (src, k, a) =>
      _mm_mask_cvtepi8_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI8_EPI32 (k, a) =>
      _mm_maskz_cvtepi8_epi32(f(k), f(a))
    case MM256_MASK_CVTEPI8_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi8_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI8_EPI64 (k, a) =>
      _mm256_maskz_cvtepi8_epi64(f(k), f(a))
    case MM_MASK_CVTEPI8_EPI64 (src, k, a) =>
      _mm_mask_cvtepi8_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI8_EPI64 (k, a) =>
      _mm_maskz_cvtepi8_epi64(f(k), f(a))
    case MM256_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm256_maskz_cvtepi8_epi16(f(k), f(a))
    case MM512_CVTEPI8_EPI16 (a) =>
      _mm512_cvtepi8_epi16(f(a))
    case MM512_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm512_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm512_maskz_cvtepi8_epi16(f(k), f(a))
    case MM_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm_maskz_cvtepi8_epi16(f(k), f(a))
    case MM256_MASK_CVTEPI32_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi32_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI32_EPI64 (k, a) =>
      _mm256_maskz_cvtepi32_epi64(f(k), f(a))
    case MM_MASK_CVTEPI32_EPI64 (src, k, a) =>
      _mm_mask_cvtepi32_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI32_EPI64 (k, a) =>
      _mm_maskz_cvtepi32_epi64(f(k), f(a))
    case MM256_MASK_CVTEPI16_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi16_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI16_EPI32 (k, a) =>
      _mm256_maskz_cvtepi16_epi32(f(k), f(a))
    case MM_MASK_CVTEPI16_EPI32 (src, k, a) =>
      _mm_mask_cvtepi16_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI16_EPI32 (k, a) =>
      _mm_maskz_cvtepi16_epi32(f(k), f(a))
    case MM256_MASK_CVTEPI16_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi16_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI16_EPI64 (k, a) =>
      _mm256_maskz_cvtepi16_epi64(f(k), f(a))
    case MM_MASK_CVTEPI16_EPI64 (src, k, a) =>
      _mm_mask_cvtepi16_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI16_EPI64 (k, a) =>
      _mm_maskz_cvtepi16_epi64(f(k), f(a))
    case MM256_CVTUSEPI32_EPI8 (a) =>
      _mm256_cvtusepi32_epi8(f(a))
    case MM256_MASK_CVTUSEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi32_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi32_epi8(f(k), f(a))
    case MM_CVTUSEPI32_EPI8 (a) =>
      _mm_cvtusepi32_epi8(f(a))
    case MM_MASK_CVTUSEPI32_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi32_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtusepi32_epi8(f(k), f(a))
    case MM256_CVTUSEPI32_EPI16 (a) =>
      _mm256_cvtusepi32_epi16(f(a))
    case MM256_MASK_CVTUSEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtusepi32_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtusepi32_epi16(f(k), f(a))
    case MM_CVTUSEPI32_EPI16 (a) =>
      _mm_cvtusepi32_epi16(f(a))
    case MM_MASK_CVTUSEPI32_EPI16 (src, k, a) =>
      _mm_mask_cvtusepi32_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtusepi32_epi16(f(k), f(a))
    case MM256_CVTUSEPI64_EPI8 (a) =>
      _mm256_cvtusepi64_epi8(f(a))
    case MM256_MASK_CVTUSEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi64_epi8(f(k), f(a))
    case MM_CVTUSEPI64_EPI8 (a) =>
      _mm_cvtusepi64_epi8(f(a))
    case MM_MASK_CVTUSEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi64_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtusepi64_epi8(f(k), f(a))
    case MM256_CVTUSEPI64_EPI32 (a) =>
      _mm256_cvtusepi64_epi32(f(a))
    case MM256_MASK_CVTUSEPI64_EPI32 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtusepi64_epi32(f(k), f(a))
    case MM_CVTUSEPI64_EPI32 (a) =>
      _mm_cvtusepi64_epi32(f(a))
    case MM_MASK_CVTUSEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtusepi64_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtusepi64_epi32(f(k), f(a))
    case MM256_CVTUSEPI64_EPI16 (a) =>
      _mm256_cvtusepi64_epi16(f(a))
    case MM256_MASK_CVTUSEPI64_EPI16 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi16(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtusepi64_epi16(f(k), f(a))
    case MM_CVTUSEPI64_EPI16 (a) =>
      _mm_cvtusepi64_epi16(f(a))
    case MM_MASK_CVTUSEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtusepi64_epi16(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI64_EPI16 (k, a) =>
      _mm_maskz_cvtusepi64_epi16(f(k), f(a))
    case MM256_CVTUSEPI16_EPI8 (a) =>
      _mm256_cvtusepi16_epi8(f(a))
    case MM256_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM512_CVTUSEPI16_EPI8 (a) =>
      _mm512_cvtusepi16_epi8(f(a))
    case MM512_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case iDef@MM512_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM_CVTUSEPI16_EPI8 (a) =>
      _mm_cvtusepi16_epi8(f(a))
    case MM_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM256_MOVEPI16_MASK (a) =>
      _mm256_movepi16_mask(f(a))
    case MM512_MOVEPI16_MASK (a) =>
      _mm512_movepi16_mask(f(a))
    case MM_MOVEPI16_MASK (a) =>
      _mm_movepi16_mask(f(a))
    case MM256_CVTEPI16_EPI8 (a) =>
      _mm256_cvtepi16_epi8(f(a))
    case MM256_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI16_EPI8 (k, a) =>
      _mm256_maskz_cvtepi16_epi8(f(k), f(a))
    case MM512_CVTEPI16_EPI8 (a) =>
      _mm512_cvtepi16_epi8(f(a))
    case MM512_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case iDef@MM512_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtepi16_epi8(f(k), f(a))
    case MM_CVTEPI16_EPI8 (a) =>
      _mm_cvtepi16_epi8(f(a))
    case MM_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPI16_EPI8 (k, a) =>
      _mm_maskz_cvtepi16_epi8(f(k), f(a))
    case MM256_MASK_CVTEPU8_EPI32 (src, k, a) =>
      _mm256_mask_cvtepu8_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPU8_EPI32 (k, a) =>
      _mm256_maskz_cvtepu8_epi32(f(k), f(a))
    case MM_MASK_CVTEPU8_EPI32 (src, k, a) =>
      _mm_mask_cvtepu8_epi32(f(src), f(k), f(a))

    case Reflect(MM512_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512015 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_MOVEPI64_MASK(a) =>
      emitValDef(sym, s"_mm512_movepi64_mask(${quote(a)})")
    case MM_MOVEPI64_MASK(a) =>
      emitValDef(sym, s"_mm_movepi64_mask(${quote(a)})")
    case MM256_CVTEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtepi64_epi8(${quote(a)})")
    case MM256_MASK_CVTEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtepi64_epi8(${quote(a)})")
    case MM_MASK_CVTEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm256_cvtepi64_epi32(${quote(a)})")
    case MM256_MASK_CVTEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm_cvtepi64_epi32(${quote(a)})")
    case MM_MASK_CVTEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtepi64_epi16(${quote(a)})")
    case MM256_MASK_CVTEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtepi64_epi16(${quote(a)})")
    case MM_MASK_CVTEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtsepi32_epi8(${quote(a)})")
    case MM256_MASK_CVTSEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtsepi32_epi8(${quote(a)})")
    case MM_MASK_CVTSEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtsepi32_epi16(${quote(a)})")
    case MM256_MASK_CVTSEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtsepi32_epi16(${quote(a)})")
    case MM_MASK_CVTSEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtsepi64_epi8(${quote(a)})")
    case MM256_MASK_CVTSEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtsepi64_epi8(${quote(a)})")
    case MM_MASK_CVTSEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm256_cvtsepi64_epi32(${quote(a)})")
    case MM256_MASK_CVTSEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm_cvtsepi64_epi32(${quote(a)})")
    case MM_MASK_CVTSEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtsepi64_epi16(${quote(a)})")
    case MM256_MASK_CVTSEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtsepi64_epi16(${quote(a)})")
    case MM_MASK_CVTSEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CVTSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtsepi16_epi8(${quote(a)})")
    case MM256_MASK_CVTSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtsepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtsepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM512_CVTSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm512_cvtsepi16_epi8(${quote(a)})")
    case MM512_MASK_CVTSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm512_mask_cvtsepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_CVTSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtsepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtsepi16_epi8(${quote(a)})")
    case MM_MASK_CVTSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtsepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtsepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI8_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI8_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI8_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI8_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI8_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI8_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI8_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI8_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI8_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case MM512_CVTEPI8_EPI16(a) =>
      emitValDef(sym, s"_mm512_cvtepi8_epi16(${quote(a)})")
    case MM512_MASK_CVTEPI8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTEPI8_EPI16(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI8_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI8_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI32_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI32_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI32_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI32_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI16_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI16_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi16_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI16_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI16_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi16_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI16_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI16_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi16_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI16_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI16_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi16_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtusepi32_epi8(${quote(a)})")
    case MM256_MASK_CVTUSEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI32_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtusepi32_epi8(${quote(a)})")
    case MM_MASK_CVTUSEPI32_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi32_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI32_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi32_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtusepi32_epi16(${quote(a)})")
    case MM256_MASK_CVTUSEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI32_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtusepi32_epi16(${quote(a)})")
    case MM_MASK_CVTUSEPI32_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi32_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI32_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi32_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtusepi64_epi8(${quote(a)})")
    case MM256_MASK_CVTUSEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI64_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtusepi64_epi8(${quote(a)})")
    case MM_MASK_CVTUSEPI64_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi64_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI64_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi8(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm256_cvtusepi64_epi32(${quote(a)})")
    case MM256_MASK_CVTUSEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI64_EPI32(a) =>
      emitValDef(sym, s"_mm_cvtusepi64_epi32(${quote(a)})")
    case MM_MASK_CVTUSEPI64_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi64_storeu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI64_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm256_cvtusepi64_epi16(${quote(a)})")
    case MM256_MASK_CVTUSEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI64_EPI16(a) =>
      emitValDef(sym, s"_mm_cvtusepi64_epi16(${quote(a)})")
    case MM_MASK_CVTUSEPI64_EPI16(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi64_storeu_epi16(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI64_EPI16(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi16(${quote(k)}, ${quote(a)})")
    case MM256_CVTUSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtusepi16_epi8(${quote(a)})")
    case MM256_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtusepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM512_CVTUSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm512_cvtusepi16_epi8(${quote(a)})")
    case MM512_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm512_mask_cvtusepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTUSEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtusepi16_epi8(${quote(a)})")
    case MM_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtusepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM256_MOVEPI16_MASK(a) =>
      emitValDef(sym, s"_mm256_movepi16_mask(${quote(a)})")
    case MM512_MOVEPI16_MASK(a) =>
      emitValDef(sym, s"_mm512_movepi16_mask(${quote(a)})")
    case MM_MOVEPI16_MASK(a) =>
      emitValDef(sym, s"_mm_movepi16_mask(${quote(a)})")
    case MM256_CVTEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm256_cvtepi16_epi8(${quote(a)})")
    case MM256_MASK_CVTEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_cvtepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_CVTEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM512_CVTEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm512_cvtepi16_epi8(${quote(a)})")
    case MM512_MASK_CVTEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm512_mask_cvtepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_CVTEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI16_EPI8(a) =>
      emitValDef(sym, s"_mm_cvtepi16_epi8(${quote(a)})")
    case MM_MASK_CVTEPI16_EPI8(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_cvtepi16_storeu_epi8(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_CVTEPI16_EPI8(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi16_epi8(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPU8_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPU8_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPU8_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepu8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
