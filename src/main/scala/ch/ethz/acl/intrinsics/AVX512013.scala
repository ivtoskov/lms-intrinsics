package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX512013 extends IntrinsicsBase {
  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MASK_CMP_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_CMP_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_CMP_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_CMP_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MASK_CMP_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_COMPRESS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_COMPRESS_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_COMPRESS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_COMPRESS_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_COMPRESS_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_COMPRESS_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_COMPRESS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_COMPRESS_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m256i
   */
  case class MM256_CONFLICT_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CONFLICT_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CONFLICT_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m128i
   */
  case class MM_CONFLICT_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CONFLICT_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CONFLICT_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m256i
   */
  case class MM256_CONFLICT_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CONFLICT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CONFLICT_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m128i
   */
  case class MM_CONFLICT_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CONFLICT_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CONFLICT_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI32(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI32(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI32(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m256i, idx: __m256i, k: __mmask8, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI32(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI32(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI32(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI32(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "idx" when the corresponding mask bit is not set).
   * a: __m128i, idx: __m128i, k: __mmask8, b: __m128i
   */
  case class MM_MASK2_PERMUTEX2VAR_EPI32(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI32(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_MASKZ_PERMUTEX2VAR_EPI32(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI32(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "idx" when
   * the corresponding mask bit is not set).
   * a: __m256d, idx: __m256i, k: __mmask8, b: __m256d
   */
  case class MM256_MASK2_PERMUTEX2VAR_PD(a: Exp[__m256d], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, idx: __m256i, b: __m256d
   */
  case class MM256_MASK_PERMUTEX2VAR_PD(a: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, idx: __m256i, b: __m256d
   */
  case class MM256_MASKZ_PERMUTEX2VAR_PD(k: Exp[Int], a: Exp[__m256d], idx: Exp[__m256i], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst".
   * a: __m256d, idx: __m256i, b: __m256d
   */
  case class MM256_PERMUTEX2VAR_PD(a: Exp[__m256d], idx: Exp[__m256i], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "idx" when the corresponding
   * mask bit is not set)
   * a: __m128d, idx: __m128i, k: __mmask8, b: __m128d
   */
  case class MM_MASK2_PERMUTEX2VAR_PD(a: Exp[__m128d], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "a" when the corresponding mask
   * bit is not set).
   * a: __m128d, k: __mmask8, idx: __m128i, b: __m128d
   */
  case class MM_MASK_PERMUTEX2VAR_PD(a: Exp[__m128d], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128d, idx: __m128i, b: __m128d
   */
  case class MM_MASKZ_PERMUTEX2VAR_PD(k: Exp[Int], a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst".
   * a: __m128d, idx: __m128i, b: __m128d
   */
  case class MM_PERMUTEX2VAR_PD(a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "idx" when
   * the corresponding mask bit is not set).
   * a: __m256, idx: __m256i, k: __mmask8, b: __m256
   */
  case class MM256_MASK2_PERMUTEX2VAR_PS(a: Exp[__m256], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, idx: __m256i, b: __m256
   */
  case class MM256_MASK_PERMUTEX2VAR_PS(a: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, idx: __m256i, b: __m256
   */
  case class MM256_MASKZ_PERMUTEX2VAR_PS(k: Exp[Int], a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst".
   * a: __m256, idx: __m256i, b: __m256
   */
  case class MM256_PERMUTEX2VAR_PS(a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "idx" when the corresponding
   * mask bit is not set).
   * a: __m128, idx: __m128i, k: __mmask8, b: __m128
   */
  case class MM_MASK2_PERMUTEX2VAR_PS(a: Exp[__m128], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "a" when the corresponding mask
   * bit is not set).
   * a: __m128, k: __mmask8, idx: __m128i, b: __m128
   */
  case class MM_MASK_PERMUTEX2VAR_PS(a: Exp[__m128], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128, idx: __m128i, b: __m128
   */
  case class MM_MASKZ_PERMUTEX2VAR_PS(k: Exp[Int], a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst".
   * a: __m128, idx: __m128i, b: __m128
   */
  case class MM_PERMUTEX2VAR_PS(a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m256i, idx: __m256i, k: __mmask8, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI64(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI64(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI64(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI64(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "idx" when the corresponding mask bit is not set).
   * a: __m128i, idx: __m128i, k: __mmask8, b: __m128i
   */
  case class MM_MASK2_PERMUTEX2VAR_EPI64(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI64(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_MASKZ_PERMUTEX2VAR_EPI64(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI64(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m256i, idx: __m256i, k: __mmask16, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI16(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask16, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI16(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI16(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI16(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m512i, idx: __m512i, k: __mmask32, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI16(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask32, idx: __m512i, b: __m512i
   */
  case class MM512_MASK_PERMUTEX2VAR_EPI16(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI16(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI16(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "idx" when the corresponding mask bit is not set).
   * a: __m128i, idx: __m128i, k: __mmask8, b: __m128i
   */
  case class MM_MASK2_PERMUTEX2VAR_EPI16(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI16(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_MASKZ_PERMUTEX2VAR_EPI16(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI16(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: const int
   */
  case class MM256_MASK_PERMUTE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256i
   */
  case class MM256_MASK_PERMUTEVAR_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256d, imm8: const int
   */
  case class MM256_MASKZ_PERMUTE_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEVAR_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, imm8: const int
   */
  case class MM_MASK_PERMUTE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128i
   */
  case class MM_MASK_PERMUTEVAR_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, imm8: const int
   */
  case class MM_MASKZ_PERMUTE_PD(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128i
   */
  case class MM_MASKZ_PERMUTEVAR_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
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
   * src: __m256, k: __mmask8, a: __m256, imm8: const int
   */
  case class MM256_MASK_PERMUTE_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256i
   */
  case class MM256_MASK_PERMUTEVAR_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]) extends IntrinsicsDef[__m256] {
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
   * k: __mmask8, a: __m256, imm8: const int
   */
  case class MM256_MASKZ_PERMUTE_PS(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEVAR_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, imm8: const int
   */
  case class MM_MASK_PERMUTE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128i
   */
  case class MM_MASK_PERMUTEVAR_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, imm8: const int
   */
  case class MM_MASKZ_PERMUTE_PS(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128i
   */
  case class MM_MASKZ_PERMUTEVAR_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_PERMUTEX_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, idx: __m256i, a: __m256d
   */
  case class MM256_MASK_PERMUTEXVAR_PD(src: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_PERMUTEX_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, idx: __m256i, a: __m256d
   */
  case class MM256_MASKZ_PERMUTEXVAR_PD(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_PERMUTEX_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst".
   * idx: __m256i, a: __m256d
   */
  case class MM256_PERMUTEXVAR_PD(idx: Exp[__m256i], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, idx: __m256i, a: __m256
   */
  case class MM256_MASK_PERMUTEXVAR_PS(src: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, idx: __m256i, a: __m256
   */
  case class MM256_MASKZ_PERMUTEXVAR_PS(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx".
   * idx: __m256i, a: __m256
   */
  case class MM256_PERMUTEXVAR_PS(idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes lanes using the control in "imm8",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_PERMUTEX_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI64(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the control in "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_PERMUTEX_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI64(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the control in "imm8", and
   * store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_PERMUTEX_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI64(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI16(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI16(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI16(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI16(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, idx: __m128i, a: __m128i
   */
  case class MM_MASK_PERMUTEXVAR_EPI16(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, idx: __m128i, a: __m128i
   */
  case class MM_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst".
   * idx: __m128i, a: __m128i
   */
  case class MM_PERMUTEXVAR_EPI16(idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_EXPAND_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_EXPAND_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_EXPAND_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_cmplt_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm_cmp_epu16_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPU16_MASK(a, b, imm8)
  }
            
  def _mm_cmpeq_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPU16_MASK(a, b)
  }
            
  def _mm_cmpge_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPU16_MASK(a, b)
  }
            
  def _mm_cmpgt_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPU16_MASK(a, b)
  }
            
  def _mm_cmple_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPU16_MASK(a, b)
  }
            
  def _mm_cmplt_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPU16_MASK(a, b)
  }
            
  def _mm_cmpneq_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPU16_MASK(a, b)
  }
            
  def _mm_mask_cmp_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPU16_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_cmpeq_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpge_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpgt_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmple_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmplt_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpneq_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm256_cmp_epi16_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI16_MASK(a, b, imm8)
  }
            
  def _mm256_cmpeq_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm256_cmpge_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm256_cmpgt_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm256_cmple_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm256_cmplt_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm256_cmpneq_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_cmp_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPI16_MASK(k1, a, b, imm8)
  }
            
  def _mm256_mask_cmpeq_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmplt_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_cmp_epi16_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPI16_MASK(a, b, imm8)
  }
            
  def _mm512_cmpeq_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm512_cmpge_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm512_cmpgt_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm512_cmple_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm512_cmplt_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm512_cmpneq_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPNEQ_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_cmp_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPI16_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmpeq_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmplt_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm_cmp_epi16_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI16_MASK(a, b, imm8)
  }
            
  def _mm_cmpeq_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm_cmpge_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm_cmpgt_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm_cmple_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm_cmplt_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm_cmpneq_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI16_MASK(a, b)
  }
            
  def _mm_mask_cmp_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPI16_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_cmpeq_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmplt_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_compress_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_COMPRESS_EPI32(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_compress_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_COMPRESS_EPI32(k, a)
  }
            
  def _mm_mask_compress_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_COMPRESS_EPI32(src, k, a)
  }
            
  def _mm_mask_compressstoreu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_compress_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_COMPRESS_EPI32(k, a)
  }
            
  def _mm256_mask_compress_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_COMPRESS_EPI64(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_compress_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_COMPRESS_EPI64(k, a)
  }
            
  def _mm_mask_compress_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_COMPRESS_EPI64(src, k, a)
  }
            
  def _mm_mask_compressstoreu_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_compress_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_COMPRESS_EPI64(k, a)
  }
            
  def _mm256_conflict_epi32(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_CONFLICT_EPI32(a)
  }
            
  def _mm256_mask_conflict_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_CONFLICT_EPI32(src, k, a)
  }
            
  def _mm256_maskz_conflict_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_CONFLICT_EPI32(k, a)
  }
            
  def _mm_conflict_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CONFLICT_EPI32(a)
  }
            
  def _mm_mask_conflict_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CONFLICT_EPI32(src, k, a)
  }
            
  def _mm_maskz_conflict_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CONFLICT_EPI32(k, a)
  }
            
  def _mm256_conflict_epi64(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_CONFLICT_EPI64(a)
  }
            
  def _mm256_mask_conflict_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_CONFLICT_EPI64(src, k, a)
  }
            
  def _mm256_maskz_conflict_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_CONFLICT_EPI64(k, a)
  }
            
  def _mm_conflict_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CONFLICT_EPI64(a)
  }
            
  def _mm_mask_conflict_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CONFLICT_EPI64(src, k, a)
  }
            
  def _mm_maskz_conflict_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CONFLICT_EPI64(k, a)
  }
            
  def _mm256_mask_permutexvar_epi32(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI32(src, k, idx, a)
  }
            
  def _mm256_maskz_permutexvar_epi32(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI32(k, idx, a)
  }
            
  def _mm256_permutexvar_epi32(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI32(idx, a)
  }
            
  def _mm256_mask2_permutex2var_epi32(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b)
  }
            
  def _mm256_mask_permutex2var_epi32(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b)
  }
            
  def _mm256_maskz_permutex2var_epi32(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b)
  }
            
  def _mm256_permutex2var_epi32(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI32(a, idx, b)
  }
            
  def _mm_mask2_permutex2var_epi32(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b)
  }
            
  def _mm_mask_permutex2var_epi32(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b)
  }
            
  def _mm_maskz_permutex2var_epi32(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b)
  }
            
  def _mm_permutex2var_epi32(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI32(a, idx, b)
  }
            
  def _mm256_mask2_permutex2var_pd(a: Exp[__m256d], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK2_PERMUTEX2VAR_PD(a, idx, k, b)
  }
            
  def _mm256_mask_permutex2var_pd(a: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_PERMUTEX2VAR_PD(a, k, idx, b)
  }
            
  def _mm256_maskz_permutex2var_pd(k: Exp[Int], a: Exp[__m256d], idx: Exp[__m256i], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b)
  }
            
  def _mm256_permutex2var_pd(a: Exp[__m256d], idx: Exp[__m256i], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_PERMUTEX2VAR_PD(a, idx, b)
  }
            
  def _mm_mask2_permutex2var_pd(a: Exp[__m128d], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK2_PERMUTEX2VAR_PD(a, idx, k, b)
  }
            
  def _mm_mask_permutex2var_pd(a: Exp[__m128d], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_PERMUTEX2VAR_PD(a, k, idx, b)
  }
            
  def _mm_maskz_permutex2var_pd(k: Exp[Int], a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b)
  }
            
  def _mm_permutex2var_pd(a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_PERMUTEX2VAR_PD(a, idx, b)
  }
            
  def _mm256_mask2_permutex2var_ps(a: Exp[__m256], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK2_PERMUTEX2VAR_PS(a, idx, k, b)
  }
            
  def _mm256_mask_permutex2var_ps(a: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_PERMUTEX2VAR_PS(a, k, idx, b)
  }
            
  def _mm256_maskz_permutex2var_ps(k: Exp[Int], a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b)
  }
            
  def _mm256_permutex2var_ps(a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_PERMUTEX2VAR_PS(a, idx, b)
  }
            
  def _mm_mask2_permutex2var_ps(a: Exp[__m128], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK2_PERMUTEX2VAR_PS(a, idx, k, b)
  }
            
  def _mm_mask_permutex2var_ps(a: Exp[__m128], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_PERMUTEX2VAR_PS(a, k, idx, b)
  }
            
  def _mm_maskz_permutex2var_ps(k: Exp[Int], a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b)
  }
            
  def _mm_permutex2var_ps(a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_PERMUTEX2VAR_PS(a, idx, b)
  }
            
  def _mm256_mask2_permutex2var_epi64(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b)
  }
            
  def _mm256_mask_permutex2var_epi64(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b)
  }
            
  def _mm256_maskz_permutex2var_epi64(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b)
  }
            
  def _mm256_permutex2var_epi64(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI64(a, idx, b)
  }
            
  def _mm_mask2_permutex2var_epi64(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b)
  }
            
  def _mm_mask_permutex2var_epi64(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b)
  }
            
  def _mm_maskz_permutex2var_epi64(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b)
  }
            
  def _mm_permutex2var_epi64(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI64(a, idx, b)
  }
            
  def _mm256_mask2_permutex2var_epi16(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm256_mask_permutex2var_epi16(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b)
  }
            
  def _mm256_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm256_permutex2var_epi16(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm512_mask2_permutex2var_epi16(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm512_mask_permutex2var_epi16(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b)
  }
            
  def _mm512_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm512_permutex2var_epi16(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm_mask2_permutex2var_epi16(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm_mask_permutex2var_epi16(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b)
  }
            
  def _mm_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm_permutex2var_epi16(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm256_mask_permute_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_PERMUTE_PD(src, k, a, imm8)
  }
            
  def _mm256_mask_permutevar_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_PERMUTEVAR_PD(src, k, a, b)
  }
            
  def _mm256_maskz_permute_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTE_PD(k, a, imm8)
  }
            
  def _mm256_maskz_permutevar_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEVAR_PD(k, a, b)
  }
            
  def _mm_mask_permute_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_PERMUTE_PD(src, k, a, imm8)
  }
            
  def _mm_mask_permutevar_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_PERMUTEVAR_PD(src, k, a, b)
  }
            
  def _mm_maskz_permute_pd(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_PERMUTE_PD(k, a, imm8)
  }
            
  def _mm_maskz_permutevar_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_PERMUTEVAR_PD(k, a, b)
  }
            
  def _mm256_mask_permute_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_PERMUTE_PS(src, k, a, imm8)
  }
            
  def _mm256_mask_permutevar_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]): Exp[__m256] = {
    MM256_MASK_PERMUTEVAR_PS(src, k, a, b)
  }
            
  def _mm256_maskz_permute_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_PERMUTE_PS(k, a, imm8)
  }
            
  def _mm256_maskz_permutevar_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEVAR_PS(k, a, b)
  }
            
  def _mm_mask_permute_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_PERMUTE_PS(src, k, a, imm8)
  }
            
  def _mm_mask_permutevar_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_PERMUTEVAR_PS(src, k, a, b)
  }
            
  def _mm_maskz_permute_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_PERMUTE_PS(k, a, imm8)
  }
            
  def _mm_maskz_permutevar_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_PERMUTEVAR_PS(k, a, b)
  }
            
  def _mm256_mask_permutex_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_PERMUTEX_PD(src, k, a, imm8)
  }
            
  def _mm256_mask_permutexvar_pd(src: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_PERMUTEXVAR_PD(src, k, idx, a)
  }
            
  def _mm256_maskz_permutex_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEX_PD(k, a, imm8)
  }
            
  def _mm256_maskz_permutexvar_pd(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEXVAR_PD(k, idx, a)
  }
            
  def _mm256_permutex_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_PERMUTEX_PD(a, imm8)
  }
            
  def _mm256_permutexvar_pd(idx: Exp[__m256i], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_PERMUTEXVAR_PD(idx, a)
  }
            
  def _mm256_mask_permutexvar_ps(src: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_PERMUTEXVAR_PS(src, k, idx, a)
  }
            
  def _mm256_maskz_permutexvar_ps(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEXVAR_PS(k, idx, a)
  }
            
  def _mm256_permutexvar_ps(idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_PERMUTEXVAR_PS(idx, a)
  }
            
  def _mm256_mask_permutex_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX_EPI64(src, k, a, imm8)
  }
            
  def _mm256_mask_permutexvar_epi64(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI64(src, k, idx, a)
  }
            
  def _mm256_maskz_permutex_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX_EPI64(k, a, imm8)
  }
            
  def _mm256_maskz_permutexvar_epi64(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI64(k, idx, a)
  }
            
  def _mm256_permutex_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_PERMUTEX_EPI64(a, imm8)
  }
            
  def _mm256_permutexvar_epi64(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI64(idx, a)
  }
            
  def _mm256_mask_permutexvar_epi16(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm256_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm256_permutexvar_epi16(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm512_mask_permutexvar_epi16(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm512_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm512_permutexvar_epi16(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm_mask_permutexvar_epi16(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm_permutexvar_epi16(idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm256_mask_expand_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_EXPAND_EPI32(src, k, a)
  }
            
  def _mm256_mask_expandloadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_expand_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_EXPAND_EPI32(k, a)
  }
            
  def _mm256_maskz_expandloadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_expand_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_EXPAND_EPI32(src, k, a)
  }
            
  def _mm_mask_expandloadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_CMPLT_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epu16_mask(f(k1), f(a), f(b))
    case MM_CMP_EPU16_MASK (a, b, imm8) =>
      _mm_cmp_epu16_mask(f(a), f(b), f(imm8))
    case MM_CMPEQ_EPU16_MASK (a, b) =>
      _mm_cmpeq_epu16_mask(f(a), f(b))
    case MM_CMPGE_EPU16_MASK (a, b) =>
      _mm_cmpge_epu16_mask(f(a), f(b))
    case MM_CMPGT_EPU16_MASK (a, b) =>
      _mm_cmpgt_epu16_mask(f(a), f(b))
    case MM_CMPLE_EPU16_MASK (a, b) =>
      _mm_cmple_epu16_mask(f(a), f(b))
    case MM_CMPLT_EPU16_MASK (a, b) =>
      _mm_cmplt_epu16_mask(f(a), f(b))
    case MM_CMPNEQ_EPU16_MASK (a, b) =>
      _mm_cmpneq_epu16_mask(f(a), f(b))
    case MM_MASK_CMP_EPU16_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epu16_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK_CMPEQ_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGE_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpge_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGT_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLE_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmple_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLT_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmplt_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPNEQ_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epu16_mask(f(k1), f(a), f(b))
    case MM256_CMP_EPI16_MASK (a, b, imm8) =>
      _mm256_cmp_epi16_mask(f(a), f(b), f(imm8))
    case MM256_CMPEQ_EPI16_MASK (a, b) =>
      _mm256_cmpeq_epi16_mask(f(a), f(b))
    case MM256_CMPGE_EPI16_MASK (a, b) =>
      _mm256_cmpge_epi16_mask(f(a), f(b))
    case MM256_CMPGT_EPI16_MASK (a, b) =>
      _mm256_cmpgt_epi16_mask(f(a), f(b))
    case MM256_CMPLE_EPI16_MASK (a, b) =>
      _mm256_cmple_epi16_mask(f(a), f(b))
    case MM256_CMPLT_EPI16_MASK (a, b) =>
      _mm256_cmplt_epi16_mask(f(a), f(b))
    case MM256_CMPNEQ_EPI16_MASK (a, b) =>
      _mm256_cmpneq_epi16_mask(f(a), f(b))
    case MM256_MASK_CMP_EPI16_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epi16_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASK_CMPEQ_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPLT_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM512_CMP_EPI16_MASK (a, b, imm8) =>
      _mm512_cmp_epi16_mask(f(a), f(b), f(imm8))
    case MM512_CMPEQ_EPI16_MASK (a, b) =>
      _mm512_cmpeq_epi16_mask(f(a), f(b))
    case MM512_CMPGE_EPI16_MASK (a, b) =>
      _mm512_cmpge_epi16_mask(f(a), f(b))
    case MM512_CMPGT_EPI16_MASK (a, b) =>
      _mm512_cmpgt_epi16_mask(f(a), f(b))
    case MM512_CMPLE_EPI16_MASK (a, b) =>
      _mm512_cmple_epi16_mask(f(a), f(b))
    case MM512_CMPLT_EPI16_MASK (a, b) =>
      _mm512_cmplt_epi16_mask(f(a), f(b))
    case MM512_CMPNEQ_EPI16_MASK (a, b) =>
      _mm512_cmpneq_epi16_mask(f(a), f(b))
    case MM512_MASK_CMP_EPI16_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epi16_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMPEQ_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPLT_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM_CMP_EPI16_MASK (a, b, imm8) =>
      _mm_cmp_epi16_mask(f(a), f(b), f(imm8))
    case MM_CMPEQ_EPI16_MASK (a, b) =>
      _mm_cmpeq_epi16_mask(f(a), f(b))
    case MM_CMPGE_EPI16_MASK (a, b) =>
      _mm_cmpge_epi16_mask(f(a), f(b))
    case MM_CMPGT_EPI16_MASK (a, b) =>
      _mm_cmpgt_epi16_mask(f(a), f(b))
    case MM_CMPLE_EPI16_MASK (a, b) =>
      _mm_cmple_epi16_mask(f(a), f(b))
    case MM_CMPLT_EPI16_MASK (a, b) =>
      _mm_cmplt_epi16_mask(f(a), f(b))
    case MM_CMPNEQ_EPI16_MASK (a, b) =>
      _mm_cmpneq_epi16_mask(f(a), f(b))
    case MM_MASK_CMP_EPI16_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epi16_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK_CMPEQ_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPLT_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_COMPRESS_EPI32 (src, k, a) =>
      _mm256_mask_compress_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_COMPRESS_EPI32 (k, a) =>
      _mm256_maskz_compress_epi32(f(k), f(a))
    case MM_MASK_COMPRESS_EPI32 (src, k, a) =>
      _mm_mask_compress_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_COMPRESS_EPI32 (k, a) =>
      _mm_maskz_compress_epi32(f(k), f(a))
    case MM256_MASK_COMPRESS_EPI64 (src, k, a) =>
      _mm256_mask_compress_epi64(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_COMPRESS_EPI64 (k, a) =>
      _mm256_maskz_compress_epi64(f(k), f(a))
    case MM_MASK_COMPRESS_EPI64 (src, k, a) =>
      _mm_mask_compress_epi64(f(src), f(k), f(a))
    case iDef@MM_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_COMPRESS_EPI64 (k, a) =>
      _mm_maskz_compress_epi64(f(k), f(a))
    case MM256_CONFLICT_EPI32 (a) =>
      _mm256_conflict_epi32(f(a))
    case MM256_MASK_CONFLICT_EPI32 (src, k, a) =>
      _mm256_mask_conflict_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CONFLICT_EPI32 (k, a) =>
      _mm256_maskz_conflict_epi32(f(k), f(a))
    case MM_CONFLICT_EPI32 (a) =>
      _mm_conflict_epi32(f(a))
    case MM_MASK_CONFLICT_EPI32 (src, k, a) =>
      _mm_mask_conflict_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CONFLICT_EPI32 (k, a) =>
      _mm_maskz_conflict_epi32(f(k), f(a))
    case MM256_CONFLICT_EPI64 (a) =>
      _mm256_conflict_epi64(f(a))
    case MM256_MASK_CONFLICT_EPI64 (src, k, a) =>
      _mm256_mask_conflict_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CONFLICT_EPI64 (k, a) =>
      _mm256_maskz_conflict_epi64(f(k), f(a))
    case MM_CONFLICT_EPI64 (a) =>
      _mm_conflict_epi64(f(a))
    case MM_MASK_CONFLICT_EPI64 (src, k, a) =>
      _mm_mask_conflict_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CONFLICT_EPI64 (k, a) =>
      _mm_maskz_conflict_epi64(f(k), f(a))
    case MM256_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi32(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi32(f(k), f(idx), f(a))
    case MM256_PERMUTEXVAR_EPI32 (idx, a) =>
      _mm256_permutexvar_epi32(f(idx), f(a))
    case MM256_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi32(f(a), f(idx), f(k), f(b))
    case MM256_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi32(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi32(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_EPI32 (a, idx, b) =>
      _mm256_permutex2var_epi32(f(a), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi32(f(a), f(idx), f(k), f(b))
    case MM_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi32(f(a), f(k), f(idx), f(b))
    case MM_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi32(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_EPI32 (a, idx, b) =>
      _mm_permutex2var_epi32(f(a), f(idx), f(b))
    case MM256_MASK2_PERMUTEX2VAR_PD (a, idx, k, b) =>
      _mm256_mask2_permutex2var_pd(f(a), f(idx), f(k), f(b))
    case MM256_MASK_PERMUTEX2VAR_PD (a, k, idx, b) =>
      _mm256_mask_permutex2var_pd(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b) =>
      _mm256_maskz_permutex2var_pd(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_PD (a, idx, b) =>
      _mm256_permutex2var_pd(f(a), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_PD (a, idx, k, b) =>
      _mm_mask2_permutex2var_pd(f(a), f(idx), f(k), f(b))
    case MM_MASK_PERMUTEX2VAR_PD (a, k, idx, b) =>
      _mm_mask_permutex2var_pd(f(a), f(k), f(idx), f(b))
    case MM_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b) =>
      _mm_maskz_permutex2var_pd(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_PD (a, idx, b) =>
      _mm_permutex2var_pd(f(a), f(idx), f(b))
    case MM256_MASK2_PERMUTEX2VAR_PS (a, idx, k, b) =>
      _mm256_mask2_permutex2var_ps(f(a), f(idx), f(k), f(b))
    case MM256_MASK_PERMUTEX2VAR_PS (a, k, idx, b) =>
      _mm256_mask_permutex2var_ps(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b) =>
      _mm256_maskz_permutex2var_ps(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_PS (a, idx, b) =>
      _mm256_permutex2var_ps(f(a), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_PS (a, idx, k, b) =>
      _mm_mask2_permutex2var_ps(f(a), f(idx), f(k), f(b))
    case MM_MASK_PERMUTEX2VAR_PS (a, k, idx, b) =>
      _mm_mask_permutex2var_ps(f(a), f(k), f(idx), f(b))
    case MM_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b) =>
      _mm_maskz_permutex2var_ps(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_PS (a, idx, b) =>
      _mm_permutex2var_ps(f(a), f(idx), f(b))
    case MM256_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi64(f(a), f(idx), f(k), f(b))
    case MM256_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi64(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi64(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_EPI64 (a, idx, b) =>
      _mm256_permutex2var_epi64(f(a), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi64(f(a), f(idx), f(k), f(b))
    case MM_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi64(f(a), f(k), f(idx), f(b))
    case MM_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi64(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_EPI64 (a, idx, b) =>
      _mm_permutex2var_epi64(f(a), f(idx), f(b))
    case MM256_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM256_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi16(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm256_permutex2var_epi16(f(a), f(idx), f(b))
    case MM512_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM512_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b) =>
      _mm512_mask_permutex2var_epi16(f(a), f(k), f(idx), f(b))
    case MM512_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM512_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm512_permutex2var_epi16(f(a), f(idx), f(b))
    case MM_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi16(f(a), f(k), f(idx), f(b))
    case MM_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm_permutex2var_epi16(f(a), f(idx), f(b))
    case MM256_MASK_PERMUTE_PD (src, k, a, imm8) =>
      _mm256_mask_permute_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEVAR_PD (src, k, a, b) =>
      _mm256_mask_permutevar_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_PERMUTE_PD (k, a, imm8) =>
      _mm256_maskz_permute_pd(f(k), f(a), f(imm8))
    case MM256_MASKZ_PERMUTEVAR_PD (k, a, b) =>
      _mm256_maskz_permutevar_pd(f(k), f(a), f(b))
    case MM_MASK_PERMUTE_PD (src, k, a, imm8) =>
      _mm_mask_permute_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASK_PERMUTEVAR_PD (src, k, a, b) =>
      _mm_mask_permutevar_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_PERMUTE_PD (k, a, imm8) =>
      _mm_maskz_permute_pd(f(k), f(a), f(imm8))
    case MM_MASKZ_PERMUTEVAR_PD (k, a, b) =>
      _mm_maskz_permutevar_pd(f(k), f(a), f(b))
    case MM256_MASK_PERMUTE_PS (src, k, a, imm8) =>
      _mm256_mask_permute_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEVAR_PS (src, k, a, b) =>
      _mm256_mask_permutevar_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_PERMUTE_PS (k, a, imm8) =>
      _mm256_maskz_permute_ps(f(k), f(a), f(imm8))
    case MM256_MASKZ_PERMUTEVAR_PS (k, a, b) =>
      _mm256_maskz_permutevar_ps(f(k), f(a), f(b))
    case MM_MASK_PERMUTE_PS (src, k, a, imm8) =>
      _mm_mask_permute_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASK_PERMUTEVAR_PS (src, k, a, b) =>
      _mm_mask_permutevar_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_PERMUTE_PS (k, a, imm8) =>
      _mm_maskz_permute_ps(f(k), f(a), f(imm8))
    case MM_MASKZ_PERMUTEVAR_PS (k, a, b) =>
      _mm_maskz_permutevar_ps(f(k), f(a), f(b))
    case MM256_MASK_PERMUTEX_PD (src, k, a, imm8) =>
      _mm256_mask_permutex_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEXVAR_PD (src, k, idx, a) =>
      _mm256_mask_permutexvar_pd(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEX_PD (k, a, imm8) =>
      _mm256_maskz_permutex_pd(f(k), f(a), f(imm8))
    case MM256_MASKZ_PERMUTEXVAR_PD (k, idx, a) =>
      _mm256_maskz_permutexvar_pd(f(k), f(idx), f(a))
    case MM256_PERMUTEX_PD (a, imm8) =>
      _mm256_permutex_pd(f(a), f(imm8))
    case MM256_PERMUTEXVAR_PD (idx, a) =>
      _mm256_permutexvar_pd(f(idx), f(a))
    case MM256_MASK_PERMUTEXVAR_PS (src, k, idx, a) =>
      _mm256_mask_permutexvar_ps(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEXVAR_PS (k, idx, a) =>
      _mm256_maskz_permutexvar_ps(f(k), f(idx), f(a))
    case MM256_PERMUTEXVAR_PS (idx, a) =>
      _mm256_permutexvar_ps(f(idx), f(a))
    case MM256_MASK_PERMUTEX_EPI64 (src, k, a, imm8) =>
      _mm256_mask_permutex_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi64(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEX_EPI64 (k, a, imm8) =>
      _mm256_maskz_permutex_epi64(f(k), f(a), f(imm8))
    case MM256_MASKZ_PERMUTEXVAR_EPI64 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi64(f(k), f(idx), f(a))
    case MM256_PERMUTEX_EPI64 (a, imm8) =>
      _mm256_permutex_epi64(f(a), f(imm8))
    case MM256_PERMUTEXVAR_EPI64 (idx, a) =>
      _mm256_permutexvar_epi64(f(idx), f(a))
    case MM256_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case MM256_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm256_permutexvar_epi16(f(idx), f(a))
    case MM512_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case MM512_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case MM512_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm512_permutexvar_epi16(f(idx), f(a))
    case MM_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case MM_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case MM_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm_permutexvar_epi16(f(idx), f(a))
    case MM256_MASK_EXPAND_EPI32 (src, k, a) =>
      _mm256_mask_expand_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_EXPAND_EPI32 (k, a) =>
      _mm256_maskz_expand_epi32(f(k), f(a))
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_EXPAND_EPI32 (src, k, a) =>
      _mm_mask_expand_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)

    case Reflect(MM512_MASK_CMPLT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPU16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPU16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPU16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPU16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPI16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPI16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPI16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPI16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPI16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPI16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CONFLICT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CONFLICT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CONFLICT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CONFLICT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CONFLICT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CONFLICT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CONFLICT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CONFLICT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CONFLICT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CONFLICT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CONFLICT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CONFLICT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CONFLICT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CONFLICT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CONFLICT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CONFLICT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CONFLICT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CONFLICT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CONFLICT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CONFLICT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CONFLICT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CONFLICT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CONFLICT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CONFLICT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI32 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI32 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI32 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI32 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI32 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI32 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI32 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI32 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI32 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI32 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_PD (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_PD (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_PD (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_PD (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_PD (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_PD (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_PD (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_PD (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_PD (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_PD (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_PD (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_PD (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_PD (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_PD (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_PS (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_PS (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_PS (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_PS (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_PS (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_PS (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_PS (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_PS (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_PS (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_PS (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_PS (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_PS (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_PS (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_PS (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI64 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI64 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI64 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI64 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI64 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI64 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI16 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_EPI16 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI16 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEVAR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEVAR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEVAR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEVAR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEVAR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEVAR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEVAR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEVAR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEVAR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEVAR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEVAR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEVAR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEVAR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEVAR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEVAR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEVAR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_PD (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_PD (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_PD (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_PD (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_PD (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_PD (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_PS (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_PS (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_PS (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_PS (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_PS (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_PS (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI64 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI64 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI64 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI64 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI64 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX512013 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_MASK_CMPLT_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_CMP_EPU16_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_epu16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMPEQ_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpeq_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGE_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpge_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGT_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpgt_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLE_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmple_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLT_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmplt_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPNEQ_EPU16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpneq_epu16_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_CMP_EPU16_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMPEQ_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpeq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGE_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpge_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGT_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpgt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLE_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmple_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLT_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmplt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPNEQ_EPU16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpneq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_CMP_EPI16_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm256_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_CMPEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPGT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPLE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPLT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_CMPNEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm256_cmpneq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMP_EPI16_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_cmp_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_CMPEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpeq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPLT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmplt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm256_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_CMP_EPI16_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm512_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_CMPEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPGT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPLT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_CMPNEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm512_cmpneq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMP_EPI16_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm512_mask_cmp_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM512_MASK_CMPEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpeq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPLT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmplt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm512_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_CMP_EPI16_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMPEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPGT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLE_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPLT_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_CMPNEQ_EPI16_MASK(a, b) =>
      emitValDef(sym, s"_mm_cmpneq_epi16_mask(${quote(a)}, ${quote(b)})")
    case MM_MASK_CMP_EPI16_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMPEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpeq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPLT_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmplt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      emitValDef(sym, s"_mm_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_COMPRESS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_compress_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_compressstoreu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_COMPRESS_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_compress_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_compress_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_compressstoreu_epi32(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_COMPRESS_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_compress_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_compress_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_compressstoreu_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_COMPRESS_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_compress_epi64(${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_compress_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_compressstoreu_epi64(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_COMPRESS_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_compress_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CONFLICT_EPI32(a) =>
      emitValDef(sym, s"_mm256_conflict_epi32(${quote(a)})")
    case MM256_MASK_CONFLICT_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_conflict_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CONFLICT_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_conflict_epi32(${quote(k)}, ${quote(a)})")
    case MM_CONFLICT_EPI32(a) =>
      emitValDef(sym, s"_mm_conflict_epi32(${quote(a)})")
    case MM_MASK_CONFLICT_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_conflict_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CONFLICT_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_conflict_epi32(${quote(k)}, ${quote(a)})")
    case MM256_CONFLICT_EPI64(a) =>
      emitValDef(sym, s"_mm256_conflict_epi64(${quote(a)})")
    case MM256_MASK_CONFLICT_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_conflict_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CONFLICT_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_conflict_epi64(${quote(k)}, ${quote(a)})")
    case MM_CONFLICT_EPI64(a) =>
      emitValDef(sym, s"_mm_conflict_epi64(${quote(a)})")
    case MM_MASK_CONFLICT_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_conflict_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CONFLICT_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_conflict_epi64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_PERMUTEXVAR_EPI32(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_epi32(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEXVAR_EPI32(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi32(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEXVAR_EPI32(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_epi32(${quote(idx)}, ${quote(a)})")
    case MM256_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_epi32(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi32(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_EPI32(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_epi32(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_epi32(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_EPI32(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK2_PERMUTEX2VAR_PD(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_PD(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_pd(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_pd(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_PD(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_PD(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_PD(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_pd(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_pd(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_PD(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK2_PERMUTEX2VAR_PS(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_PS(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_ps(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_ps(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_PS(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_PS(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_PS(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_ps(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_ps(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_PS(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_epi64(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi64(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_EPI64(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_epi64(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_epi64(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_EPI64(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b) =>
      emitValDef(sym, s"_mm256_mask_permutex2var_epi16(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_PERMUTEX2VAR_EPI16(a, idx, b) =>
      emitValDef(sym, s"_mm256_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM512_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM512_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b) =>
      emitValDef(sym, s"_mm512_mask_permutex2var_epi16(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM512_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM512_PERMUTEX2VAR_EPI16(a, idx, b) =>
      emitValDef(sym, s"_mm512_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      emitValDef(sym, s"_mm_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case MM_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b) =>
      emitValDef(sym, s"_mm_mask_permutex2var_epi16(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case MM_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      emitValDef(sym, s"_mm_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM_PERMUTEX2VAR_EPI16(a, idx, b) =>
      emitValDef(sym, s"_mm_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case MM256_MASK_PERMUTE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_permute_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_PERMUTEVAR_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_permutevar_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_permute_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_PERMUTEVAR_PD(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_permutevar_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_PERMUTE_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_permute_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_PERMUTEVAR_PD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_permutevar_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_PERMUTE_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_permute_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_PERMUTEVAR_PD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_permutevar_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_PERMUTE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_permute_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_PERMUTEVAR_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm256_mask_permutevar_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASKZ_PERMUTE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_permute_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_PERMUTEVAR_PS(k, a, b) =>
      emitValDef(sym, s"_mm256_maskz_permutevar_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASK_PERMUTE_PS(src, k, a, imm8) =>
      emitValDef(sym, s"_mm_mask_permute_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASK_PERMUTEVAR_PS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_permutevar_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_PERMUTE_PS(k, a, imm8) =>
      emitValDef(sym, s"_mm_maskz_permute_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM_MASKZ_PERMUTEVAR_PS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_permutevar_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM256_MASK_PERMUTEX_PD(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_permutex_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_PERMUTEXVAR_PD(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_pd(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEX_PD(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_permutex_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_PERMUTEXVAR_PD(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_pd(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEX_PD(a, imm8) =>
      emitValDef(sym, s"_mm256_permutex_pd(${quote(a)}, ${quote(imm8)})")
    case MM256_PERMUTEXVAR_PD(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_pd(${quote(idx)}, ${quote(a)})")
    case MM256_MASK_PERMUTEXVAR_PS(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_ps(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEXVAR_PS(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_ps(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEXVAR_PS(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_ps(${quote(idx)}, ${quote(a)})")
    case MM256_MASK_PERMUTEX_EPI64(src, k, a, imm8) =>
      emitValDef(sym, s"_mm256_mask_permutex_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASK_PERMUTEXVAR_EPI64(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_epi64(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEX_EPI64(k, a, imm8) =>
      emitValDef(sym, s"_mm256_maskz_permutex_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case MM256_MASKZ_PERMUTEXVAR_EPI64(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi64(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEX_EPI64(a, imm8) =>
      emitValDef(sym, s"_mm256_permutex_epi64(${quote(a)}, ${quote(imm8)})")
    case MM256_PERMUTEXVAR_EPI64(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_epi64(${quote(idx)}, ${quote(a)})")
    case MM256_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      emitValDef(sym, s"_mm256_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM256_PERMUTEXVAR_EPI16(idx, a) =>
      emitValDef(sym, s"_mm256_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case MM512_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      emitValDef(sym, s"_mm512_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM512_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM512_PERMUTEXVAR_EPI16(idx, a) =>
      emitValDef(sym, s"_mm512_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case MM_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      emitValDef(sym, s"_mm_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      emitValDef(sym, s"_mm_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case MM_PERMUTEXVAR_EPI16(idx, a) =>
      emitValDef(sym, s"_mm_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case MM256_MASK_EXPAND_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_expand_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_mask_expandloadu_epi32(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM256_MASKZ_EXPAND_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_expand_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm256_maskz_expandloadu_epi32(${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case MM_MASK_EXPAND_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_expand_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      emitValDef(sym, s"_mm_mask_expandloadu_epi32(${quote(src)}, ${quote(k)}, ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case _ => super.emitNode(sym, rhs)
  }
}
