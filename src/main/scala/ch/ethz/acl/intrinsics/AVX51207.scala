package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51207 extends IntrinsicsBase {
  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst".
   * a: __m128
   */
  case class MM512_BROADCAST_F32X2(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m128
   */
  case class MM512_MASK_BROADCAST_F32X2(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128
   */
  case class MM512_MASKZ_BROADCAST_F32X2(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128
   */
  case class MM256_BROADCAST_F32X4(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128
   */
  case class MM256_MASK_BROADCAST_F32X4(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_BROADCAST_F32X4(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m256
   */
  case class MM512_BROADCAST_F32X8(a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m256
   */
  case class MM512_MASK_BROADCAST_F32X8(src: Exp[__m512], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m256
   */
  case class MM512_MASKZ_BROADCAST_F32X8(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128d
   */
  case class MM256_BROADCAST_F64X2(a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m128d
   */
  case class MM256_MASK_BROADCAST_F64X2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM256_MASKZ_BROADCAST_F64X2(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128d
   */
  case class MM512_BROADCAST_F64X2(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m128d
   */
  case class MM512_MASK_BROADCAST_F64X2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM512_MASKZ_BROADCAST_F64X2(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst.
   * a: __m128i
   */
  case class MM256_BROADCAST_I32X2(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCAST_I32X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCAST_I32X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst.
   * a: __m128i
   */
  case class MM512_BROADCAST_I32X2(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_BROADCAST_I32X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m128i
   */
  case class MM512_MASKZ_BROADCAST_I32X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst.
   * a: __m128i
   */
  case class MM_BROADCAST_I32X2(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCAST_I32X2(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCAST_I32X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCAST_I32X4(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCAST_I32X4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCAST_I32X4(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed 32-bit integers from "a" to all elements of "dst".
   * a: __m256i
   */
  case class MM512_BROADCAST_I32X8(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed 32-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask16, a: __m256i
   */
  case class MM512_MASK_BROADCAST_I32X8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed 32-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m256i
   */
  case class MM512_MASKZ_BROADCAST_I32X8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCAST_I64X2(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCAST_I64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCAST_I64X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCAST_I64X2(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m128i
   */
  case class MM512_MASK_BROADCAST_I64X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM512_MASKZ_BROADCAST_I64X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m128d
   */
  case class MM256_MASK_BROADCASTSD_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM256_MASKZ_BROADCASTSD_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128
   */
  case class MM256_MASK_BROADCASTSS_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_BROADCASTSS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_BROADCASTSS_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_BROADCASTSS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_CMP_PD_MASK(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_CMP_PD_MASK(k1: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_PD_MASK(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_CMP_PD_MASK(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_CMP_PS_MASK(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASK_CMP_PS_MASK(k1: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_CMP_PS_MASK(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_CMP_PS_MASK(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_COMPRESS_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256d, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_COMPRESS_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_COMPRESS_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128d, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_COMPRESS_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_COMPRESS_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_COMPRESS_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_COMPRESS_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_COMPRESS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI32_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI32_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_EPI32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPI32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_PS(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_PS(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPI64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_EPI64(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst". 
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPI64(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_EPI64(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m512i, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPI64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_EPI64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPI64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPI64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPU32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_EPU32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPU32(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPU32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPU64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_EPU64(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * 
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPU64(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_EPU64(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512i, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPU64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_EPU64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPU64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPU64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTPH_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTPH_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTPH_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTPH_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256
   */
  case class MM256_MASK_CVTPS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTPS_EPI32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTPS_EPI32(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m128i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASK_CVT_ROUNDPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m128i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASK_CVTPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASKZ_CVT_ROUNDPS_PH(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASKZ_CVTPS_PH(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m128i, k: __mmask8, a: __m128, rounding: int
   */
  case class MM_MASK_CVT_ROUNDPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m128i, k: __mmask8, a: __m128, rounding: int
   */
  case class MM_MASK_CVTPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m128, rounding: int
   */
  case class MM_MASKZ_CVT_ROUNDPS_PH(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m128, rounding: int
   */
  case class MM_MASKZ_CVTPS_PH(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM256_CVTPS_EPI64(a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128
   */
  case class MM256_MASK_CVTPS_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst". 
   * 	[round_note]
   * a: __m256, rounding: int
   */
  case class MM512_CVT_ROUNDPS_EPI64(a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m256
   */
  case class MM512_CVTPS_EPI64(a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	 [round_note]
   * src: __m512i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m256, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_EPI64(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTPS_EPI64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_EPI64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m256
   */
  case class MM256_CVTPS_EPU32(a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256
   */
  case class MM256_MASK_CVTPS_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTPS_EPU32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_EPU32(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTPS_EPU32(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM256_CVTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m128
   */
  case class MM256_MASK_CVTPS_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * 
   * 	[round_note]
   * a: __m256, rounding: int
   */
  case class MM512_CVT_ROUNDPS_EPU64(a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m256
   */
  case class MM512_CVTPS_EPU64(a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTPS_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m256, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_EPU64(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTPS_EPU64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst". 
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPI64_PD(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_PD(a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPI64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPI64_PD(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_PD(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPI64_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m256, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPI64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPI64_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_broadcast_f32x2(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCAST_F32X2(a)
  }
            
  def _mm512_mask_broadcast_f32x2(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASK_BROADCAST_F32X2(src, k, a)
  }
            
  def _mm512_maskz_broadcast_f32x2(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X2(k, a)
  }
            
  def _mm256_broadcast_f32x4(a: Exp[__m128]): Exp[__m256] = {
    MM256_BROADCAST_F32X4(a)
  }
            
  def _mm256_mask_broadcast_f32x4(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASK_BROADCAST_F32X4(src, k, a)
  }
            
  def _mm256_maskz_broadcast_f32x4(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCAST_F32X4(k, a)
  }
            
  def _mm512_broadcast_f32x8(a: Exp[__m256]): Exp[__m512] = {
    MM512_BROADCAST_F32X8(a)
  }
            
  def _mm512_mask_broadcast_f32x8(src: Exp[__m512], k: Exp[Int], a: Exp[__m256]): Exp[__m512] = {
    MM512_MASK_BROADCAST_F32X8(src, k, a)
  }
            
  def _mm512_maskz_broadcast_f32x8(k: Exp[Int], a: Exp[__m256]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X8(k, a)
  }
            
  def _mm256_broadcast_f64x2(a: Exp[__m128d]): Exp[__m256d] = {
    MM256_BROADCAST_F64X2(a)
  }
            
  def _mm256_mask_broadcast_f64x2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASK_BROADCAST_F64X2(src, k, a)
  }
            
  def _mm256_maskz_broadcast_f64x2(k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASKZ_BROADCAST_F64X2(k, a)
  }
            
  def _mm512_broadcast_f64x2(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_BROADCAST_F64X2(a)
  }
            
  def _mm512_mask_broadcast_f64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASK_BROADCAST_F64X2(src, k, a)
  }
            
  def _mm512_maskz_broadcast_f64x2(k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCAST_F64X2(k, a)
  }
            
  def _mm256_broadcast_i32x2(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCAST_I32X2(a)
  }
            
  def _mm256_mask_broadcast_i32x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm256_maskz_broadcast_i32x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCAST_I32X2(k, a)
  }
            
  def _mm512_broadcast_i32x2(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X2(a)
  }
            
  def _mm512_mask_broadcast_i32x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm512_maskz_broadcast_i32x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I32X2(k, a)
  }
            
  def _mm_broadcast_i32x2(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCAST_I32X2(a)
  }
            
  def _mm_mask_broadcast_i32x2(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm_maskz_broadcast_i32x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCAST_I32X2(k, a)
  }
            
  def _mm256_broadcast_i32x4(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCAST_I32X4(a)
  }
            
  def _mm256_mask_broadcast_i32x4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCAST_I32X4(src, k, a)
  }
            
  def _mm256_maskz_broadcast_i32x4(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCAST_I32X4(k, a)
  }
            
  def _mm512_broadcast_i32x8(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X8(a)
  }
            
  def _mm512_mask_broadcast_i32x8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X8(src, k, a)
  }
            
  def _mm512_maskz_broadcast_i32x8(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I32X8(k, a)
  }
            
  def _mm256_broadcast_i64x2(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCAST_I64X2(a)
  }
            
  def _mm256_mask_broadcast_i64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCAST_I64X2(src, k, a)
  }
            
  def _mm256_maskz_broadcast_i64x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCAST_I64X2(k, a)
  }
            
  def _mm512_broadcast_i64x2(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I64X2(a)
  }
            
  def _mm512_mask_broadcast_i64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I64X2(src, k, a)
  }
            
  def _mm512_maskz_broadcast_i64x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I64X2(k, a)
  }
            
  def _mm256_mask_broadcastsd_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASK_BROADCASTSD_PD(src, k, a)
  }
            
  def _mm256_maskz_broadcastsd_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASKZ_BROADCASTSD_PD(k, a)
  }
            
  def _mm256_mask_broadcastss_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm256_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm_mask_broadcastss_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm256_cmp_pd_mask(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_PD_MASK(a, b, imm8)
  }
            
  def _mm256_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm_cmp_pd_mask(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_PD_MASK(a, b, imm8)
  }
            
  def _mm_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm256_cmp_ps_mask(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_PS_MASK(a, b, imm8)
  }
            
  def _mm256_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm_cmp_ps_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_PS_MASK(a, b, imm8)
  }
            
  def _mm_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm256_mask_compress_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_compress_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_COMPRESS_PD(k, a)
  }
            
  def _mm_mask_compress_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_compress_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_COMPRESS_PD(k, a)
  }
            
  def _mm256_mask_compress_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_compress_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm_mask_compress_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_compress_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm256_mask_cvtepi32_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm256_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm_mask_cvtepi32_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm256_mask_cvtepi32_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256i]): Exp[__m256] = {
    MM256_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm256_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m256] = {
    MM256_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm_mask_cvtepi32_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm256_mask_cvtpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm_mask_cvtpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm256_mask_cvtpd_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256d]): Exp[__m128] = {
    MM256_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m256d]): Exp[__m128] = {
    MM256_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm_mask_cvtpd_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128d]): Exp[__m128] = {
    MM_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m128d]): Exp[__m128] = {
    MM_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm256_cvtpd_epi64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTPD_EPI64(a)
  }
            
  def _mm256_mask_cvtpd_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTPD_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm512_cvt_roundpd_epi64(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPD_EPI64(a, rounding)
  }
            
  def _mm512_cvtpd_epi64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTPD_EPI64(a)
  }
            
  def _mm512_mask_cvt_roundpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPD_EPI64(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTPD_EPI64(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_epi64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPI64(k, a, rounding)
  }
            
  def _mm512_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm_cvtpd_epi64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPI64(a)
  }
            
  def _mm_mask_cvtpd_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm256_cvtpd_epu32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTPD_EPU32(a)
  }
            
  def _mm256_mask_cvtpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm_cvtpd_epu32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPU32(a)
  }
            
  def _mm_mask_cvtpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm256_cvtpd_epu64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTPD_EPU64(a)
  }
            
  def _mm256_mask_cvtpd_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm512_cvt_roundpd_epu64(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPD_EPU64(a, rounding)
  }
            
  def _mm512_cvtpd_epu64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTPD_EPU64(a)
  }
            
  def _mm512_mask_cvt_roundpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPD_EPU64(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_epu64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPU64(k, a, rounding)
  }
            
  def _mm512_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm_cvtpd_epu64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPU64(a)
  }
            
  def _mm_mask_cvtpd_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm256_mask_cvtph_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m128i]): Exp[__m256] = {
    MM256_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm256_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m256] = {
    MM256_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm_mask_cvtph_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm256_mask_cvtps_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtps_epi32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPI32(k, a)
  }
            
  def _mm_mask_cvtps_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtps_epi32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPI32(k, a)
  }
            
  def _mm256_mask_cvt_roundps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm256_mask_cvtps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_CVTPS_PH(src, k, a, rounding)
  }
            
  def _mm256_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm256_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm_mask_cvt_roundps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm_mask_cvtps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASK_CVTPS_PH(src, k, a, rounding)
  }
            
  def _mm_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm256_cvtps_epi64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTPS_EPI64(a)
  }
            
  def _mm256_mask_cvtps_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm256_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm512_cvt_roundps_epi64(a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPI64(a, rounding)
  }
            
  def _mm512_cvtps_epi64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTPS_EPI64(a)
  }
            
  def _mm512_mask_cvt_roundps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPI64(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundps_epi64(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPI64(k, a, rounding)
  }
            
  def _mm512_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm_cvtps_epi64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPI64(a)
  }
            
  def _mm_mask_cvtps_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm256_cvtps_epu32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTPS_EPU32(a)
  }
            
  def _mm256_mask_cvtps_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPU32(src, k, a)
  }
            
  def _mm256_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm_cvtps_epu32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPU32(a)
  }
            
  def _mm_mask_cvtps_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPU32(src, k, a)
  }
            
  def _mm_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm256_cvtps_epu64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTPS_EPU64(a)
  }
            
  def _mm256_mask_cvtps_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm256_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm512_cvt_roundps_epu64(a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPU64(a, rounding)
  }
            
  def _mm512_cvtps_epu64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTPS_EPU64(a)
  }
            
  def _mm512_mask_cvt_roundps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPU64(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundps_epu64(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPU64(k, a, rounding)
  }
            
  def _mm512_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm_cvtps_epu64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPU64(a)
  }
            
  def _mm_mask_cvtps_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm256_cvtepi64_pd(a: Exp[__m256i]): Exp[__m256d] = {
    MM256_CVTEPI64_PD(a)
  }
            
  def _mm256_mask_cvtepi64_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm256_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm512_cvt_roundepi64_pd(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_CVT_ROUNDEPI64_PD(a, rounding)
  }
            
  def _mm512_cvtepi64_pd(a: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPI64_PD(a)
  }
            
  def _mm512_mask_cvt_roundepi64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDEPI64_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepi64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepi64_pd(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_CVT_ROUNDEPI64_PD(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm_cvtepi64_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPI64_PD(a)
  }
            
  def _mm_mask_cvtepi64_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm256_cvtepi64_ps(a: Exp[__m256i]): Exp[__m128] = {
    MM256_CVTEPI64_PS(a)
  }
            
  def _mm256_mask_cvtepi64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm256_maskz_cvtepi64_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASKZ_CVTEPI64_PS(k, a)
  }
            
  def _mm512_cvt_roundepi64_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_CVT_ROUNDEPI64_PS(a, rounding)
  }
            
  def _mm512_cvtepi64_ps(a: Exp[__m512i]): Exp[__m256] = {
    MM512_CVTEPI64_PS(a)
  }
            
  def _mm512_mask_cvt_roundepi64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASK_CVT_ROUNDEPI64_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepi64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepi64_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDEPI64_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepi64_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASKZ_CVTEPI64_PS(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_BROADCAST_F32X2 (a) =>
      _mm512_broadcast_f32x2(f(a))
    case MM512_MASK_BROADCAST_F32X2 (src, k, a) =>
      _mm512_mask_broadcast_f32x2(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_F32X2 (k, a) =>
      _mm512_maskz_broadcast_f32x2(f(k), f(a))
    case MM256_BROADCAST_F32X4 (a) =>
      _mm256_broadcast_f32x4(f(a))
    case MM256_MASK_BROADCAST_F32X4 (src, k, a) =>
      _mm256_mask_broadcast_f32x4(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_F32X4 (k, a) =>
      _mm256_maskz_broadcast_f32x4(f(k), f(a))
    case MM512_BROADCAST_F32X8 (a) =>
      _mm512_broadcast_f32x8(f(a))
    case MM512_MASK_BROADCAST_F32X8 (src, k, a) =>
      _mm512_mask_broadcast_f32x8(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_F32X8 (k, a) =>
      _mm512_maskz_broadcast_f32x8(f(k), f(a))
    case MM256_BROADCAST_F64X2 (a) =>
      _mm256_broadcast_f64x2(f(a))
    case MM256_MASK_BROADCAST_F64X2 (src, k, a) =>
      _mm256_mask_broadcast_f64x2(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_F64X2 (k, a) =>
      _mm256_maskz_broadcast_f64x2(f(k), f(a))
    case MM512_BROADCAST_F64X2 (a) =>
      _mm512_broadcast_f64x2(f(a))
    case MM512_MASK_BROADCAST_F64X2 (src, k, a) =>
      _mm512_mask_broadcast_f64x2(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_F64X2 (k, a) =>
      _mm512_maskz_broadcast_f64x2(f(k), f(a))
    case MM256_BROADCAST_I32X2 (a) =>
      _mm256_broadcast_i32x2(f(a))
    case MM256_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm256_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_I32X2 (k, a) =>
      _mm256_maskz_broadcast_i32x2(f(k), f(a))
    case MM512_BROADCAST_I32X2 (a) =>
      _mm512_broadcast_i32x2(f(a))
    case MM512_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm512_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_I32X2 (k, a) =>
      _mm512_maskz_broadcast_i32x2(f(k), f(a))
    case MM_BROADCAST_I32X2 (a) =>
      _mm_broadcast_i32x2(f(a))
    case MM_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM_MASKZ_BROADCAST_I32X2 (k, a) =>
      _mm_maskz_broadcast_i32x2(f(k), f(a))
    case MM256_BROADCAST_I32X4 (a) =>
      _mm256_broadcast_i32x4(f(a))
    case MM256_MASK_BROADCAST_I32X4 (src, k, a) =>
      _mm256_mask_broadcast_i32x4(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_I32X4 (k, a) =>
      _mm256_maskz_broadcast_i32x4(f(k), f(a))
    case MM512_BROADCAST_I32X8 (a) =>
      _mm512_broadcast_i32x8(f(a))
    case MM512_MASK_BROADCAST_I32X8 (src, k, a) =>
      _mm512_mask_broadcast_i32x8(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_I32X8 (k, a) =>
      _mm512_maskz_broadcast_i32x8(f(k), f(a))
    case MM256_BROADCAST_I64X2 (a) =>
      _mm256_broadcast_i64x2(f(a))
    case MM256_MASK_BROADCAST_I64X2 (src, k, a) =>
      _mm256_mask_broadcast_i64x2(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_I64X2 (k, a) =>
      _mm256_maskz_broadcast_i64x2(f(k), f(a))
    case MM512_BROADCAST_I64X2 (a) =>
      _mm512_broadcast_i64x2(f(a))
    case MM512_MASK_BROADCAST_I64X2 (src, k, a) =>
      _mm512_mask_broadcast_i64x2(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_I64X2 (k, a) =>
      _mm512_maskz_broadcast_i64x2(f(k), f(a))
    case MM256_MASK_BROADCASTSD_PD (src, k, a) =>
      _mm256_mask_broadcastsd_pd(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTSD_PD (k, a) =>
      _mm256_maskz_broadcastsd_pd(f(k), f(a))
    case MM256_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm256_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm256_maskz_broadcastss_ps(f(k), f(a))
    case MM_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm_maskz_broadcastss_ps(f(k), f(a))
    case MM256_CMP_PD_MASK (a, b, imm8) =>
      _mm256_cmp_pd_mask(f(a), f(b), f(imm8))
    case MM256_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM_CMP_PD_MASK (a, b, imm8) =>
      _mm_cmp_pd_mask(f(a), f(b), f(imm8))
    case MM_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_CMP_PS_MASK (a, b, imm8) =>
      _mm256_cmp_ps_mask(f(a), f(b), f(imm8))
    case MM256_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM_CMP_PS_MASK (a, b, imm8) =>
      _mm_cmp_ps_mask(f(a), f(b), f(imm8))
    case MM_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASK_COMPRESS_PD (src, k, a) =>
      _mm256_mask_compress_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_COMPRESS_PD (k, a) =>
      _mm256_maskz_compress_pd(f(k), f(a))
    case MM_MASK_COMPRESS_PD (src, k, a) =>
      _mm_mask_compress_pd(f(src), f(k), f(a))
    case iDef@MM_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_COMPRESS_PD (k, a) =>
      _mm_maskz_compress_pd(f(k), f(a))
    case MM256_MASK_COMPRESS_PS (src, k, a) =>
      _mm256_mask_compress_ps(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_COMPRESS_PS (k, a) =>
      _mm256_maskz_compress_ps(f(k), f(a))
    case MM_MASK_COMPRESS_PS (src, k, a) =>
      _mm_mask_compress_ps(f(src), f(k), f(a))
    case iDef@MM_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_COMPRESS_PS (k, a) =>
      _mm_maskz_compress_ps(f(k), f(a))
    case MM256_MASK_CVTEPI32_PD (src, k, a) =>
      _mm256_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI32_PD (k, a) =>
      _mm256_maskz_cvtepi32_pd(f(k), f(a))
    case MM_MASK_CVTEPI32_PD (src, k, a) =>
      _mm_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI32_PD (k, a) =>
      _mm_maskz_cvtepi32_pd(f(k), f(a))
    case MM256_MASK_CVTEPI32_PS (src, k, a) =>
      _mm256_mask_cvtepi32_ps(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI32_PS (k, a) =>
      _mm256_maskz_cvtepi32_ps(f(k), f(a))
    case MM_MASK_CVTEPI32_PS (src, k, a) =>
      _mm_mask_cvtepi32_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI32_PS (k, a) =>
      _mm_maskz_cvtepi32_ps(f(k), f(a))
    case MM256_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm256_mask_cvtpd_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm256_maskz_cvtpd_epi32(f(k), f(a))
    case MM_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm_mask_cvtpd_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm_maskz_cvtpd_epi32(f(k), f(a))
    case MM256_MASK_CVTPD_PS (src, k, a) =>
      _mm256_mask_cvtpd_ps(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_PS (k, a) =>
      _mm256_maskz_cvtpd_ps(f(k), f(a))
    case MM_MASK_CVTPD_PS (src, k, a) =>
      _mm_mask_cvtpd_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTPD_PS (k, a) =>
      _mm_maskz_cvtpd_ps(f(k), f(a))
    case MM256_CVTPD_EPI64 (a) =>
      _mm256_cvtpd_epi64(f(a))
    case MM256_MASK_CVTPD_EPI64 (src, k, a) =>
      _mm256_mask_cvtpd_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm256_maskz_cvtpd_epi64(f(k), f(a))
    case MM512_CVT_ROUNDPD_EPI64 (a, rounding) =>
      _mm512_cvt_roundpd_epi64(f(a), f(rounding))
    case MM512_CVTPD_EPI64 (a) =>
      _mm512_cvtpd_epi64(f(a))
    case MM512_MASK_CVT_ROUNDPD_EPI64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epi64(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPD_EPI64 (src, k, a) =>
      _mm512_mask_cvtpd_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPI64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epi64(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm512_maskz_cvtpd_epi64(f(k), f(a))
    case MM_CVTPD_EPI64 (a) =>
      _mm_cvtpd_epi64(f(a))
    case MM_MASK_CVTPD_EPI64 (src, k, a) =>
      _mm_mask_cvtpd_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm_maskz_cvtpd_epi64(f(k), f(a))
    case MM256_CVTPD_EPU32 (a) =>
      _mm256_cvtpd_epu32(f(a))
    case MM256_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm256_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm256_maskz_cvtpd_epu32(f(k), f(a))
    case MM_CVTPD_EPU32 (a) =>
      _mm_cvtpd_epu32(f(a))
    case MM_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm_maskz_cvtpd_epu32(f(k), f(a))
    case MM256_CVTPD_EPU64 (a) =>
      _mm256_cvtpd_epu64(f(a))
    case MM256_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm256_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm256_maskz_cvtpd_epu64(f(k), f(a))
    case MM512_CVT_ROUNDPD_EPU64 (a, rounding) =>
      _mm512_cvt_roundpd_epu64(f(a), f(rounding))
    case MM512_CVTPD_EPU64 (a) =>
      _mm512_cvtpd_epu64(f(a))
    case MM512_MASK_CVT_ROUNDPD_EPU64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epu64(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm512_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPU64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epu64(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm512_maskz_cvtpd_epu64(f(k), f(a))
    case MM_CVTPD_EPU64 (a) =>
      _mm_cvtpd_epu64(f(a))
    case MM_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm_maskz_cvtpd_epu64(f(k), f(a))
    case MM256_MASK_CVTPH_PS (src, k, a) =>
      _mm256_mask_cvtph_ps(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPH_PS (k, a) =>
      _mm256_maskz_cvtph_ps(f(k), f(a))
    case MM_MASK_CVTPH_PS (src, k, a) =>
      _mm_mask_cvtph_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTPH_PS (k, a) =>
      _mm_maskz_cvtph_ps(f(k), f(a))
    case MM256_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm256_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPS_EPI32 (k, a) =>
      _mm256_maskz_cvtps_epi32(f(k), f(a))
    case MM_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTPS_EPI32 (k, a) =>
      _mm_maskz_cvtps_epi32(f(k), f(a))
    case MM256_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm256_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM256_MASK_CVTPS_PH (src, k, a, rounding) =>
      _mm256_mask_cvtps_ph(f(src), f(k), f(a), f(rounding))
    case MM256_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm256_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM256_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm256_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM_MASK_CVTPS_PH (src, k, a, rounding) =>
      _mm_mask_cvtps_ph(f(src), f(k), f(a), f(rounding))
    case MM_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM256_CVTPS_EPI64 (a) =>
      _mm256_cvtps_epi64(f(a))
    case MM256_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm256_mask_cvtps_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm256_maskz_cvtps_epi64(f(k), f(a))
    case MM512_CVT_ROUNDPS_EPI64 (a, rounding) =>
      _mm512_cvt_roundps_epi64(f(a), f(rounding))
    case MM512_CVTPS_EPI64 (a) =>
      _mm512_cvtps_epi64(f(a))
    case MM512_MASK_CVT_ROUNDPS_EPI64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epi64(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm512_mask_cvtps_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPS_EPI64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epi64(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm512_maskz_cvtps_epi64(f(k), f(a))
    case MM_CVTPS_EPI64 (a) =>
      _mm_cvtps_epi64(f(a))
    case MM_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm_mask_cvtps_epi64(f(src), f(k), f(a))
    case MM_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm_maskz_cvtps_epi64(f(k), f(a))
    case MM256_CVTPS_EPU32 (a) =>
      _mm256_cvtps_epu32(f(a))
    case MM256_MASK_CVTPS_EPU32 (src, k, a) =>
      _mm256_mask_cvtps_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm256_maskz_cvtps_epu32(f(k), f(a))
    case MM_CVTPS_EPU32 (a) =>
      _mm_cvtps_epu32(f(a))
    case MM_MASK_CVTPS_EPU32 (src, k, a) =>
      _mm_mask_cvtps_epu32(f(src), f(k), f(a))
    case MM_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm_maskz_cvtps_epu32(f(k), f(a))
    case MM256_CVTPS_EPU64 (a) =>
      _mm256_cvtps_epu64(f(a))
    case MM256_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm256_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm256_maskz_cvtps_epu64(f(k), f(a))
    case MM512_CVT_ROUNDPS_EPU64 (a, rounding) =>
      _mm512_cvt_roundps_epu64(f(a), f(rounding))
    case MM512_CVTPS_EPU64 (a) =>
      _mm512_cvtps_epu64(f(a))
    case MM512_MASK_CVT_ROUNDPS_EPU64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epu64(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm512_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPS_EPU64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epu64(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm512_maskz_cvtps_epu64(f(k), f(a))
    case MM_CVTPS_EPU64 (a) =>
      _mm_cvtps_epu64(f(a))
    case MM_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm_maskz_cvtps_epu64(f(k), f(a))
    case MM256_CVTEPI64_PD (a) =>
      _mm256_cvtepi64_pd(f(a))
    case MM256_MASK_CVTEPI64_PD (src, k, a) =>
      _mm256_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI64_PD (k, a) =>
      _mm256_maskz_cvtepi64_pd(f(k), f(a))
    case MM512_CVT_ROUNDEPI64_PD (a, rounding) =>
      _mm512_cvt_roundepi64_pd(f(a), f(rounding))
    case MM512_CVTEPI64_PD (a) =>
      _mm512_cvtepi64_pd(f(a))
    case MM512_MASK_CVT_ROUNDEPI64_PD (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi64_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPI64_PD (src, k, a) =>
      _mm512_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPI64_PD (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi64_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPI64_PD (k, a) =>
      _mm512_maskz_cvtepi64_pd(f(k), f(a))
    case MM_CVTEPI64_PD (a) =>
      _mm_cvtepi64_pd(f(a))
    case MM_MASK_CVTEPI64_PD (src, k, a) =>
      _mm_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI64_PD (k, a) =>
      _mm_maskz_cvtepi64_pd(f(k), f(a))
    case MM256_CVTEPI64_PS (a) =>
      _mm256_cvtepi64_ps(f(a))
    case MM256_MASK_CVTEPI64_PS (src, k, a) =>
      _mm256_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI64_PS (k, a) =>
      _mm256_maskz_cvtepi64_ps(f(k), f(a))
    case MM512_CVT_ROUNDEPI64_PS (a, rounding) =>
      _mm512_cvt_roundepi64_ps(f(a), f(rounding))
    case MM512_CVTEPI64_PS (a) =>
      _mm512_cvtepi64_ps(f(a))
    case MM512_MASK_CVT_ROUNDEPI64_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi64_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPI64_PS (src, k, a) =>
      _mm512_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPI64_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi64_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPI64_PS (k, a) =>
      _mm512_maskz_cvtepi64_ps(f(k), f(a))

    case Reflect(MM512_BROADCAST_F32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_F32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_F32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F32X8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F32X8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F32X8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_F64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_F64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_I32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_I32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_I32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_I32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCAST_I32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCAST_I32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCAST_I32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCAST_I32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_I32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_I32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_I32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_I32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_I32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_I32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I32X8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I32X8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_I64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_I64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_I64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_I64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_I64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_I64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTSD_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTSD_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTSD_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTSD_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPI64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPI64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPU64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPU64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPU64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPU64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPI64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPI64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPU64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPU64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPU64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPU64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPI64_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPI64_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI64_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI64_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPI64_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPI64_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI64_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI64_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51207 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_BROADCAST_F32X2(a) =>
      emitValDef(sym, s"_mm512_broadcast_f32x2(${quote(a)})")
    case MM512_MASK_BROADCAST_F32X2(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_f32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_F32X2(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x2(${quote(k)}, ${quote(a)})")
    case MM256_BROADCAST_F32X4(a) =>
      emitValDef(sym, s"_mm256_broadcast_f32x4(${quote(a)})")
    case MM256_MASK_BROADCAST_F32X4(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_F32X4(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_f32x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_F32X8(a) =>
      emitValDef(sym, s"_mm512_broadcast_f32x8(${quote(a)})")
    case MM512_MASK_BROADCAST_F32X8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_f32x8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_F32X8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x8(${quote(k)}, ${quote(a)})")
    case MM256_BROADCAST_F64X2(a) =>
      emitValDef(sym, s"_mm256_broadcast_f64x2(${quote(a)})")
    case MM256_MASK_BROADCAST_F64X2(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_F64X2(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_f64x2(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_F64X2(a) =>
      emitValDef(sym, s"_mm512_broadcast_f64x2(${quote(a)})")
    case MM512_MASK_BROADCAST_F64X2(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_F64X2(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_f64x2(${quote(k)}, ${quote(a)})")
    case MM256_BROADCAST_I32X2(a) =>
      emitValDef(sym, s"_mm256_broadcast_i32x2(${quote(a)})")
    case MM256_MASK_BROADCAST_I32X2(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_I32X2(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_i32x2(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_I32X2(a) =>
      emitValDef(sym, s"_mm512_broadcast_i32x2(${quote(a)})")
    case MM512_MASK_BROADCAST_I32X2(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_I32X2(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_i32x2(${quote(k)}, ${quote(a)})")
    case MM_BROADCAST_I32X2(a) =>
      emitValDef(sym, s"_mm_broadcast_i32x2(${quote(a)})")
    case MM_MASK_BROADCAST_I32X2(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCAST_I32X2(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcast_i32x2(${quote(k)}, ${quote(a)})")
    case MM256_BROADCAST_I32X4(a) =>
      emitValDef(sym, s"_mm256_broadcast_i32x4(${quote(a)})")
    case MM256_MASK_BROADCAST_I32X4(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_I32X4(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_i32x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_I32X8(a) =>
      emitValDef(sym, s"_mm512_broadcast_i32x8(${quote(a)})")
    case MM512_MASK_BROADCAST_I32X8(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_i32x8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_I32X8(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_i32x8(${quote(k)}, ${quote(a)})")
    case MM256_BROADCAST_I64X2(a) =>
      emitValDef(sym, s"_mm256_broadcast_i64x2(${quote(a)})")
    case MM256_MASK_BROADCAST_I64X2(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcast_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCAST_I64X2(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcast_i64x2(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_I64X2(a) =>
      emitValDef(sym, s"_mm512_broadcast_i64x2(${quote(a)})")
    case MM512_MASK_BROADCAST_I64X2(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_I64X2(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_i64x2(${quote(k)}, ${quote(a)})")
    case MM256_MASK_BROADCASTSD_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastsd_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTSD_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastsd_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_BROADCASTSS_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_BROADCASTSS_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_BROADCASTSS_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_BROADCASTSS_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case MM256_CMP_PD_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm256_cmp_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMP_PD_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_CMP_PS_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm256_cmp_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm256_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMP_PS_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM256_MASK_COMPRESS_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_compressstoreu_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_COMPRESS_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_compress_pd(${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESS_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_compressstoreu_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_COMPRESS_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_compress_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESS_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm256_mask_compressstoreu_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM256_MASKZ_COMPRESS_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESS_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm_mask_compressstoreu_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM_MASKZ_COMPRESS_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI32_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI32_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI32_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI32_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTEPI32_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI32_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTEPI32_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI32_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTPD_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPD_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTPD_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPD_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case MM256_CVTPD_EPI64(a) =>
      emitValDef(sym, s"_mm256_cvtpd_epi64(${quote(a)})")
    case MM256_MASK_CVTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPD_EPI64(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_epi64(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPD_EPI64(a) =>
      emitValDef(sym, s"_mm512_cvtpd_epi64(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPD_EPI64(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPD_EPI64(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epi64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case MM_CVTPD_EPI64(a) =>
      emitValDef(sym, s"_mm_cvtpd_epi64(${quote(a)})")
    case MM_MASK_CVTPD_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPD_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CVTPD_EPU32(a) =>
      emitValDef(sym, s"_mm256_cvtpd_epu32(${quote(a)})")
    case MM256_MASK_CVTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case MM_CVTPD_EPU32(a) =>
      emitValDef(sym, s"_mm_cvtpd_epu32(${quote(a)})")
    case MM_MASK_CVTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case MM256_CVTPD_EPU64(a) =>
      emitValDef(sym, s"_mm256_cvtpd_epu64(${quote(a)})")
    case MM256_MASK_CVTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPD_EPU64(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_epu64(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPD_EPU64(a) =>
      emitValDef(sym, s"_mm512_cvtpd_epu64(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPD_EPU64(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPD_EPU64(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epu64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case MM_CVTPD_EPU64(a) =>
      emitValDef(sym, s"_mm_cvtpd_epu64(${quote(a)})")
    case MM_MASK_CVTPD_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPD_EPU64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTPH_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPH_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTPH_PS(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPH_PS(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtps_epi32(${quote(k)}, ${quote(a)})")
    case MM_MASK_CVTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtps_epi32(${quote(k)}, ${quote(a)})")
    case MM256_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm256_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM256_MASK_CVTPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm256_mask_cvtps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM256_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm256_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM256_MASKZ_CVTPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm256_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM_MASK_CVTPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm_mask_cvtps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM_MASKZ_CVTPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM256_CVTPS_EPI64(a) =>
      emitValDef(sym, s"_mm256_cvtps_epi64(${quote(a)})")
    case MM256_MASK_CVTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPS_EPI64(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundps_epi64(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPS_EPI64(a) =>
      emitValDef(sym, s"_mm512_cvtps_epi64(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPS_EPI64(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPS_EPI64(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epi64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case MM_CVTPS_EPI64(a) =>
      emitValDef(sym, s"_mm_cvtps_epi64(${quote(a)})")
    case MM_MASK_CVTPS_EPI64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPS_EPI64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case MM256_CVTPS_EPU32(a) =>
      emitValDef(sym, s"_mm256_cvtps_epu32(${quote(a)})")
    case MM256_MASK_CVTPS_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPS_EPU32(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case MM_CVTPS_EPU32(a) =>
      emitValDef(sym, s"_mm_cvtps_epu32(${quote(a)})")
    case MM_MASK_CVTPS_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPS_EPU32(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case MM256_CVTPS_EPU64(a) =>
      emitValDef(sym, s"_mm256_cvtps_epu64(${quote(a)})")
    case MM256_MASK_CVTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPS_EPU64(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundps_epu64(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPS_EPU64(a) =>
      emitValDef(sym, s"_mm512_cvtps_epu64(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPS_EPU64(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPS_EPU64(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epu64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case MM_CVTPS_EPU64(a) =>
      emitValDef(sym, s"_mm_cvtps_epu64(${quote(a)})")
    case MM_MASK_CVTPS_EPU64(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTPS_EPU64(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPI64_PD(a) =>
      emitValDef(sym, s"_mm256_cvtepi64_pd(${quote(a)})")
    case MM256_MASK_CVTEPI64_PD(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI64_PD(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDEPI64_PD(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundepi64_pd(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTEPI64_PD(a) =>
      emitValDef(sym, s"_mm512_cvtepi64_pd(${quote(a)})")
    case MM512_MASK_CVT_ROUNDEPI64_PD(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTEPI64_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDEPI64_PD(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi64_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTEPI64_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case MM_CVTEPI64_PD(a) =>
      emitValDef(sym, s"_mm_cvtepi64_pd(${quote(a)})")
    case MM_MASK_CVTEPI64_PD(src, k, a) =>
      emitValDef(sym, s"_mm_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM_MASKZ_CVTEPI64_PD(k, a) =>
      emitValDef(sym, s"_mm_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case MM256_CVTEPI64_PS(a) =>
      emitValDef(sym, s"_mm256_cvtepi64_ps(${quote(a)})")
    case MM256_MASK_CVTEPI64_PS(src, k, a) =>
      emitValDef(sym, s"_mm256_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM256_MASKZ_CVTEPI64_PS(k, a) =>
      emitValDef(sym, s"_mm256_maskz_cvtepi64_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDEPI64_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundepi64_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTEPI64_PS(a) =>
      emitValDef(sym, s"_mm512_cvtepi64_ps(${quote(a)})")
    case MM512_MASK_CVT_ROUNDEPI64_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTEPI64_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDEPI64_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi64_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTEPI64_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi64_ps(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
