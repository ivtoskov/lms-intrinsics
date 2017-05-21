package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
protected trait AVX51200 extends IntrinsicsBase {
  /**
   * Compute the bitwise NOT of 16-bit masks "a" and then AND with "b", and store
   * the result in "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KANDN(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KAND(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy 16-bit mask "a" to "k".
   * a: __mmask16
   */
  case class MM512_KMOV(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 16-bit mask "a", and store the result in "k".
   * a: __mmask16
   */
  case class MM512_KNOT(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8 bits from masks "a" and "b", and store the 16-bit
   * result in "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KUNPACKB(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XNOR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KXNOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KXOR(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_ADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_ADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_ADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 		[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_ADD_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ADD_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_ADD_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ADD_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 		[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_ADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 		[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_ADD_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_ADD_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_ADD_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_ADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 32-bit elements, and stores the low 64 bytes (16 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 64 bytes (8 elements) in
   * "dst".
   * a: __m512i, b: __m512i, count: const int
   */
  case class MM512_ALIGNR_EPI64(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 64 bytes (8 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASK_ALIGNR_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 64-bit elements, and stores the low 64 bytes (8 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASKZ_ALIGNR_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128
   */
  case class MM512_BROADCAST_F32X4(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m128
   */
  case class MM512_MASK_BROADCAST_F32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128
   */
  case class MM512_MASKZ_BROADCAST_F32X4(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m256d
   */
  case class MM512_BROADCAST_F64X4(a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m256d
   */
  case class MM512_MASK_BROADCAST_F64X4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM512_MASKZ_BROADCAST_F64X4(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCAST_I32X4(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_BROADCAST_I32X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 32-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i
   */
  case class MM512_MASKZ_BROADCAST_I32X4(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 64-bit integers from "a" to all elements of "dst".
   * a: __m256i
   */
  case class MM512_BROADCAST_I64X4(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_BROADCAST_I64X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 64-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_BROADCAST_I64X4(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128d
   */
  case class MM512_BROADCASTSD_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m128d
   */
  case class MM512_MASK_BROADCASTSD_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
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
  case class MM512_MASKZ_BROADCASTSD_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128
   */
  case class MM512_BROADCASTSS_PS(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m128
   */
  case class MM512_MASK_BROADCASTSS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128
   */
  case class MM512_MASKZ_BROADCASTSS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k".
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m128d, b: __m128d, imm8: const int, sae: const int
   */
  case class MM_CMP_ROUND_SD_MASK(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_SD_MASK(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k" using zeromask "k1" (the element is zeroed out when mask
   * bit 0 is not set).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k1: __mmask8, a: __m128d, b: __m128d, imm8: const int, sae: const int
   */
  case class MM_MASK_CMP_ROUND_SD_MASK(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k" using zeromask "k1" (the element is zeroed out when mask
   * bit 0 is not set).
   * k1: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_CMP_SD_MASK(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k".
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m128, b: __m128, imm8: const int, sae: const int
   */
  case class MM_CMP_ROUND_SS_MASK(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_CMP_SS_MASK(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k" using zeromask "k1" (the element is zeroed out when mask
   * bit 0 is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k1: __mmask8, a: __m128, b: __m128, imm8: const int, sae: const int
   */
  case class MM_MASK_CMP_ROUND_SS_MASK(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k" using zeromask "k1" (the element is zeroed out when mask
   * bit 0 is not set).
   * k1: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_CMP_SS_MASK(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and return the
   * boolean result (0 or 1).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m128d, b: __m128d, imm8: const int, sae: const int
   */
  case class MM_COMI_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and return the
   * boolean result (0 or 1).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m128, b: __m128, imm8: const int, sae: const int
   */
  case class MM_COMI_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_COMPRESS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512d, base_addrOffset: int
   */
  case class MM512_MASK_COMPRESSSTOREU_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_COMPRESS_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_COMPRESS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512, base_addrOffset: int
   */
  case class MM512_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_COMPRESS_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPI32_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_CVTEPI32_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPI32_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPI32_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI32_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPI32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTEPI32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPI32_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI32_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPI32(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_EPI32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m256i, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPI32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_EPI32(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_PS(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_PS(a: Exp[__m512d]) extends IntrinsicsDef[__m256] {
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
   * 	[round_note]
   * src: __m256, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
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
   * src: __m256, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256] {
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
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_PS(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
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
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_PS(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPU32(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_EPU32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
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
   * 	[round_note]
   * src: __m256i, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPU32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_EPU32(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m256i, sae: int
   */
  case class MM512_CVT_ROUNDPH_PS(a: Exp[__m256i], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m256i
   */
  case class MM512_CVTPH_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512, k: __mmask16, a: __m256i, sae: int
   */
  case class MM512_MASK_CVT_ROUNDPH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * src: __m512, k: __mmask16, a: __m256i
   */
  case class MM512_MASK_CVTPH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * k: __mmask16, a: __m256i, sae: int
   */
  case class MM512_MASKZ_CVT_ROUNDPH_PS(k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * k: __mmask16, a: __m256i
   */
  case class MM512_MASKZ_CVTPH_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst". 
   * 	[round_note]
   * a: __m512, rounding: int
   */
  case class MM512_CVT_ROUNDPS_EPI32(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst".
   * a: __m512
   */
  case class MM512_CVTPS_EPI32(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m512i, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CVTPS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_EPI32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTPS_EPI32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m256, sae: int
   */
  case class MM512_CVT_ROUNDPS_PD(a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m256
   */
  case class MM512_CVTPS_PD(a: Exp[__m256]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512d, k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASK_CVT_ROUNDPS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTPS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_PD(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTPS_PD(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst".
   * 	[round_note]
   * a: __m512, rounding: int
   */
  case class MM512_CVT_ROUNDPS_PH(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst".
   * 	[round_note]
   * a: __m512, rounding: int
   */
  case class MM512_CVTPS_PH(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * src: __m256i, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_PH(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * src: __m256i, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_CVTPS_PH(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_PH(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_CVTPS_PH(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * 
   * 	[round_note]
   * a: __m512, rounding: int
   */
  case class MM512_CVT_ROUNDPS_EPU32(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m512
   */
  case class MM512_CVTPS_EPU32(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
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
   * 	[round_note]
   * src: __m512i, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
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
   * src: __m512i, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CVTPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_EPU32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTPS_EPU32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_I32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_I64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_SI32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_SI64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_I32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_I64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper 3 packed elements from "a" to the
   * upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_SS(a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and copy the upper element from "a" to the upper
   * element of "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128d, rounding: int
   */
  case class MM_MASK_CVT_ROUNDSD_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and copy the upper element from "a" to the upper
   * element of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128d
   */
  case class MM_MASK_CVTSD_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128d, rounding: int
   */
  case class MM_MASKZ_CVT_ROUNDSD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst".
   * k: __mmask8, a: __m128, b: __m128d
   */
  case class MM_MASKZ_CVTSD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_U32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_U64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_U32(a: Exp[__m128d]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_U64(a: Exp[__m128d]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst". 
   * 	[round_note]
   * a: __m128d, b: __int64, rounding: int
   */
  case class MM_CVT_ROUNDI64_SD(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst". 
   * 	[round_note]
   * a: __m128d, b: __int64, rounding: int
   */
  case class MM_CVT_ROUNDSI64_SD(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: int
   */
  case class MM_CVTI32_SD(a: Exp[__m128d], b: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __int64
   */
  case class MM_CVTI64_SD(a: Exp[__m128d], b: Exp[Long]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: int, rounding: int
   */
  case class MM_CVT_ROUNDI32_SS(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: __int64, rounding: int
   */
  case class MM_CVT_ROUNDI64_SS(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: int, rounding: int
   */
  case class MM_CVT_ROUNDSI32_SS(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: __int64, rounding: int
   */
  case class MM_CVT_ROUNDSI64_SS(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: int
   */
  case class MM_CVTI32_SS(a: Exp[__m128], b: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 64-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __int64
   */
  case class MM_CVTI64_SS(a: Exp[__m128], b: Exp[Long]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst". 
   * 	[round_note]
   * a: __m128d, b: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_SD(a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and copy the upper element from "a" to the upper
   * element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128, rounding: int
   */
  case class MM_MASK_CVT_ROUNDSS_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and copy the upper element from "a" to the upper
   * element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128
   */
  case class MM_MASK_CVTSS_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128, rounding: int
   */
  case class MM_MASKZ_CVT_ROUNDSS_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst".
   * k: __mmask8, a: __m128d, b: __m128
   */
  case class MM_MASKZ_CVTSS_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_I32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_I64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_SI32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_SI64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_I32(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_I64(a: Exp[__m128]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_U32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_U64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_U32(a: Exp[__m128]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 64-bit integer, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTSS_U64(a: Exp[__m128]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst". 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPI32(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPI32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).  Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m256i, k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTTPD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPI32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPI32(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst". 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPU32(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPU32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m256i, k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTTPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPU32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPU32(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst". 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512, sae: int
   */
  case class MM512_CVTT_ROUNDPS_EPI32(a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m512
   */
  case class MM512_CVTTPS_EPI32(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512i, k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
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
   * src: __m512i, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CVTTPS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
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
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPI32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
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
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTTPS_EPI32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_kandn(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KANDN(a, b)
  }
            
  def _mm512_kand(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KAND(a, b)
  }
            
  def _mm512_kmov(a: Exp[Int]): Exp[Int] = {
    MM512_KMOV(a)
  }
            
  def _mm512_knot(a: Exp[Int]): Exp[Int] = {
    MM512_KNOT(a)
  }
            
  def _mm512_kor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KOR(a, b)
  }
            
  def _mm512_kunpackb(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KUNPACKB(a, b)
  }
            
  def _mm512_kxnor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KXNOR(a, b)
  }
            
  def _mm512_kxor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KXOR(a, b)
  }
            
  def _mm512_maskz_add_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm512_maskz_add_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ADD_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_maskz_add_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm512_maskz_add_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ADD_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm_add_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_ADD_ROUND_SD(a, b, rounding)
  }
            
  def _mm_mask_add_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ADD_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_add_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ADD_SD(src, k, a, b)
  }
            
  def _mm_maskz_add_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ADD_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_add_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ADD_SD(k, a, b)
  }
            
  def _mm_add_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_ADD_ROUND_SS(a, b, rounding)
  }
            
  def _mm_mask_add_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_ADD_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_add_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_ADD_SS(src, k, a, b)
  }
            
  def _mm_maskz_add_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ADD_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_add_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_ADD_SS(k, a, b)
  }
            
  def _mm512_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm512_alignr_epi64(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm512_mask_alignr_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm512_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm512_broadcast_f32x4(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCAST_F32X4(a)
  }
            
  def _mm512_mask_broadcast_f32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASK_BROADCAST_F32X4(src, k, a)
  }
            
  def _mm512_maskz_broadcast_f32x4(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X4(k, a)
  }
            
  def _mm512_broadcast_f64x4(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_BROADCAST_F64X4(a)
  }
            
  def _mm512_mask_broadcast_f64x4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256d]): Exp[__m512d] = {
    MM512_MASK_BROADCAST_F64X4(src, k, a)
  }
            
  def _mm512_maskz_broadcast_f64x4(k: Exp[Int], a: Exp[__m256d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCAST_F64X4(k, a)
  }
            
  def _mm512_broadcast_i32x4(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X4(a)
  }
            
  def _mm512_mask_broadcast_i32x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X4(src, k, a)
  }
            
  def _mm512_maskz_broadcast_i32x4(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I32X4(k, a)
  }
            
  def _mm512_broadcast_i64x4(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_BROADCAST_I64X4(a)
  }
            
  def _mm512_mask_broadcast_i64x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I64X4(src, k, a)
  }
            
  def _mm512_maskz_broadcast_i64x4(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I64X4(k, a)
  }
            
  def _mm512_broadcastsd_pd(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_BROADCASTSD_PD(a)
  }
            
  def _mm512_mask_broadcastsd_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASK_BROADCASTSD_PD(src, k, a)
  }
            
  def _mm512_maskz_broadcastsd_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCASTSD_PD(k, a)
  }
            
  def _mm512_broadcastss_ps(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCASTSS_PS(a)
  }
            
  def _mm512_mask_broadcastss_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm512_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm_cmp_round_sd_mask(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_CMP_ROUND_SD_MASK(a, b, imm8, sae)
  }
            
  def _mm_cmp_sd_mask(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_SD_MASK(a, b, imm8)
  }
            
  def _mm_mask_cmp_round_sd_mask(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_ROUND_SD_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm_mask_cmp_sd_mask(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_SD_MASK(k1, a, b, imm8)
  }
            
  def _mm_cmp_round_ss_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_CMP_ROUND_SS_MASK(a, b, imm8, sae)
  }
            
  def _mm_cmp_ss_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_SS_MASK(a, b, imm8)
  }
            
  def _mm_mask_cmp_round_ss_mask(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_ROUND_SS_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm_mask_cmp_ss_mask(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_SS_MASK(k1, a, b, imm8)
  }
            
  def _mm_comi_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_COMI_ROUND_SD(a, b, imm8, sae)
  }
            
  def _mm_comi_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_COMI_ROUND_SS(a, b, imm8, sae)
  }
            
  def _mm512_mask_compress_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm512_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_compress_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_COMPRESS_PD(k, a)
  }
            
  def _mm512_mask_compress_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm512_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_compress_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm512_cvtepi32_pd(a: Exp[__m256i]): Exp[__m512d] = {
    MM512_CVTEPI32_PD(a)
  }
            
  def _mm512_mask_cvtepi32_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm512_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm512_cvt_roundepi32_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDEPI32_PS(a, rounding)
  }
            
  def _mm512_cvtepi32_ps(a: Exp[__m512i]): Exp[__m512] = {
    MM512_CVTEPI32_PS(a)
  }
            
  def _mm512_mask_cvt_roundepi32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDEPI32_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepi32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepi32_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDEPI32_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm512_cvt_roundpd_epi32(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPD_EPI32(a, rounding)
  }
            
  def _mm512_cvtpd_epi32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTPD_EPI32(a)
  }
            
  def _mm512_mask_cvt_roundpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPD_EPI32(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_epi32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPI32(k, a, rounding)
  }
            
  def _mm512_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm512_cvt_roundpd_ps(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256] = {
    MM512_CVT_ROUNDPD_PS(a, rounding)
  }
            
  def _mm512_cvtpd_ps(a: Exp[__m512d]): Exp[__m256] = {
    MM512_CVTPD_PS(a)
  }
            
  def _mm512_mask_cvt_roundpd_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASK_CVT_ROUNDPD_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtpd_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d]): Exp[__m256] = {
    MM512_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_ps(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDPD_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m512d]): Exp[__m256] = {
    MM512_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm512_cvt_roundpd_epu32(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPD_EPU32(a, rounding)
  }
            
  def _mm512_cvtpd_epu32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTPD_EPU32(a)
  }
            
  def _mm512_mask_cvt_roundpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPD_EPU32(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_epu32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPU32(k, a, rounding)
  }
            
  def _mm512_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm512_cvt_roundph_ps(a: Exp[__m256i], sae: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDPH_PS(a, sae)
  }
            
  def _mm512_cvtph_ps(a: Exp[__m256i]): Exp[__m512] = {
    MM512_CVTPH_PS(a)
  }
            
  def _mm512_mask_cvt_roundph_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDPH_PS(src, k, a, sae)
  }
            
  def _mm512_mask_cvtph_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i]): Exp[__m512] = {
    MM512_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundph_ps(k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDPH_PS(k, a, sae)
  }
            
  def _mm512_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m512] = {
    MM512_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm512_cvt_roundps_epi32(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPI32(a, rounding)
  }
            
  def _mm512_cvtps_epi32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTPS_EPI32(a)
  }
            
  def _mm512_mask_cvt_roundps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPI32(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundps_epi32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPI32(k, a, rounding)
  }
            
  def _mm512_maskz_cvtps_epi32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPI32(k, a)
  }
            
  def _mm512_cvt_roundps_pd(a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_CVT_ROUNDPS_PD(a, sae)
  }
            
  def _mm512_cvtps_pd(a: Exp[__m256]): Exp[__m512d] = {
    MM512_CVTPS_PD(a)
  }
            
  def _mm512_mask_cvt_roundps_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDPS_PD(src, k, a, sae)
  }
            
  def _mm512_mask_cvtps_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256]): Exp[__m512d] = {
    MM512_MASK_CVTPS_PD(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundps_pd(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_CVT_ROUNDPS_PD(k, a, sae)
  }
            
  def _mm512_maskz_cvtps_pd(k: Exp[Int], a: Exp[__m256]): Exp[__m512d] = {
    MM512_MASKZ_CVTPS_PD(k, a)
  }
            
  def _mm512_cvt_roundps_ph(a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPS_PH(a, rounding)
  }
            
  def _mm512_cvtps_ph(a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVTPS_PH(a, rounding)
  }
            
  def _mm512_mask_cvt_roundps_ph(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtps_ph(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVTPS_PH(src, k, a, rounding)
  }
            
  def _mm512_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm512_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm512_cvt_roundps_epu32(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPU32(a, rounding)
  }
            
  def _mm512_cvtps_epu32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTPS_EPU32(a)
  }
            
  def _mm512_mask_cvt_roundps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPU32(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPU32(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundps_epu32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPU32(k, a, rounding)
  }
            
  def _mm512_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm_cvt_roundsd_i32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSD_I32(a, rounding)
  }
            
  def _mm_cvt_roundsd_i64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSD_I64(a, rounding)
  }
            
  def _mm_cvt_roundsd_si32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSD_SI32(a, rounding)
  }
            
  def _mm_cvt_roundsd_si64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSD_SI64(a, rounding)
  }
            
  def _mm_cvtsd_i32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTSD_I32(a)
  }
            
  def _mm_cvtsd_i64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_I64(a)
  }
            
  def _mm_cvt_roundsd_ss(a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSD_SS(a, b, rounding)
  }
            
  def _mm_mask_cvt_roundsd_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_CVT_ROUNDSD_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_cvtsd_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]): Exp[__m128] = {
    MM_MASK_CVTSD_SS(src, k, a, b)
  }
            
  def _mm_maskz_cvt_roundsd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_CVT_ROUNDSD_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_cvtsd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]): Exp[__m128] = {
    MM_MASKZ_CVTSD_SS(k, a, b)
  }
            
  def _mm_cvt_roundsd_u32(a: Exp[__m128d], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVT_ROUNDSD_U32(a, rounding)
  }
            
  def _mm_cvt_roundsd_u64(a: Exp[__m128d], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVT_ROUNDSD_U64(a, rounding)
  }
            
  def _mm_cvtsd_u32(a: Exp[__m128d]): Exp[UInt] = {
    MM_CVTSD_U32(a)
  }
            
  def _mm_cvtsd_u64(a: Exp[__m128d]): Exp[ULong] = {
    MM_CVTSD_U64(a)
  }
            
  def _mm_cvt_roundi64_sd(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDI64_SD(a, b, rounding)
  }
            
  def _mm_cvt_roundsi64_sd(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDSI64_SD(a, b, rounding)
  }
            
  def _mm_cvti32_sd(a: Exp[__m128d], b: Exp[Int]): Exp[__m128d] = {
    MM_CVTI32_SD(a, b)
  }
            
  def _mm_cvti64_sd(a: Exp[__m128d], b: Exp[Long]): Exp[__m128d] = {
    MM_CVTI64_SD(a, b)
  }
            
  def _mm_cvt_roundi32_ss(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDI32_SS(a, b, rounding)
  }
            
  def _mm_cvt_roundi64_ss(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDI64_SS(a, b, rounding)
  }
            
  def _mm_cvt_roundsi32_ss(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSI32_SS(a, b, rounding)
  }
            
  def _mm_cvt_roundsi64_ss(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSI64_SS(a, b, rounding)
  }
            
  def _mm_cvti32_ss(a: Exp[__m128], b: Exp[Int]): Exp[__m128] = {
    MM_CVTI32_SS(a, b)
  }
            
  def _mm_cvti64_ss(a: Exp[__m128], b: Exp[Long]): Exp[__m128] = {
    MM_CVTI64_SS(a, b)
  }
            
  def _mm_cvt_roundss_sd(a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDSS_SD(a, b, rounding)
  }
            
  def _mm_mask_cvt_roundss_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_CVT_ROUNDSS_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_cvtss_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128]): Exp[__m128d] = {
    MM_MASK_CVTSS_SD(src, k, a, b)
  }
            
  def _mm_maskz_cvt_roundss_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_CVT_ROUNDSS_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_cvtss_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128]): Exp[__m128d] = {
    MM_MASKZ_CVTSS_SD(k, a, b)
  }
            
  def _mm_cvt_roundss_i32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSS_I32(a, rounding)
  }
            
  def _mm_cvt_roundss_i64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSS_I64(a, rounding)
  }
            
  def _mm_cvt_roundss_si32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSS_SI32(a, rounding)
  }
            
  def _mm_cvt_roundss_si64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSS_SI64(a, rounding)
  }
            
  def _mm_cvtss_i32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTSS_I32(a)
  }
            
  def _mm_cvtss_i64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTSS_I64(a)
  }
            
  def _mm_cvt_roundss_u32(a: Exp[__m128], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVT_ROUNDSS_U32(a, rounding)
  }
            
  def _mm_cvt_roundss_u64(a: Exp[__m128], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVT_ROUNDSS_U64(a, rounding)
  }
            
  def _mm_cvtss_u32(a: Exp[__m128]): Exp[UInt] = {
    MM_CVTSS_U32(a)
  }
            
  def _mm_cvtss_u64(a: Exp[__m128]): Exp[ULong] = {
    MM_CVTSS_U64(a)
  }
            
  def _mm512_cvtt_roundpd_epi32(a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_CVTT_ROUNDPD_EPI32(a, sae)
  }
            
  def _mm512_cvttpd_epi32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTTPD_EPI32(a)
  }
            
  def _mm512_mask_cvtt_roundpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVTT_ROUNDPD_EPI32(src, k, a, sae)
  }
            
  def _mm512_mask_cvttpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundpd_epi32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPI32(k, a, sae)
  }
            
  def _mm512_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm512_cvtt_roundpd_epu32(a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_CVTT_ROUNDPD_EPU32(a, sae)
  }
            
  def _mm512_cvttpd_epu32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTTPD_EPU32(a)
  }
            
  def _mm512_mask_cvtt_roundpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVTT_ROUNDPD_EPU32(src, k, a, sae)
  }
            
  def _mm512_mask_cvttpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTTPD_EPU32(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundpd_epu32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPU32(k, a, sae)
  }
            
  def _mm512_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm512_cvtt_roundps_epi32(a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPI32(a, sae)
  }
            
  def _mm512_cvttps_epi32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTTPS_EPI32(a)
  }
            
  def _mm512_mask_cvtt_roundps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPI32(src, k, a, sae)
  }
            
  def _mm512_mask_cvttps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundps_epi32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPI32(k, a, sae)
  }
            
  def _mm512_maskz_cvttps_epi32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPI32(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_KANDN (a, b) =>
      _mm512_kandn(f(a), f(b))
    case MM512_KAND (a, b) =>
      _mm512_kand(f(a), f(b))
    case MM512_KMOV (a) =>
      _mm512_kmov(f(a))
    case MM512_KNOT (a) =>
      _mm512_knot(f(a))
    case MM512_KOR (a, b) =>
      _mm512_kor(f(a), f(b))
    case MM512_KUNPACKB (a, b) =>
      _mm512_kunpackb(f(a), f(b))
    case MM512_KXNOR (a, b) =>
      _mm512_kxnor(f(a), f(b))
    case MM512_KXOR (a, b) =>
      _mm512_kxor(f(a), f(b))
    case MM512_MASKZ_ADD_PD (k, a, b) =>
      _mm512_maskz_add_pd(f(k), f(a), f(b))
    case MM512_MASKZ_ADD_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_add_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_ADD_PS (k, a, b) =>
      _mm512_maskz_add_ps(f(k), f(a), f(b))
    case MM512_MASKZ_ADD_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_add_round_ps(f(k), f(a), f(b), f(rounding))
    case MM_ADD_ROUND_SD (a, b, rounding) =>
      _mm_add_round_sd(f(a), f(b), f(rounding))
    case MM_MASK_ADD_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_add_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_ADD_SD (src, k, a, b) =>
      _mm_mask_add_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADD_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_add_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_ADD_SD (k, a, b) =>
      _mm_maskz_add_sd(f(k), f(a), f(b))
    case MM_ADD_ROUND_SS (a, b, rounding) =>
      _mm_add_round_ss(f(a), f(b), f(rounding))
    case MM_MASK_ADD_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_add_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_ADD_SS (src, k, a, b) =>
      _mm_mask_add_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ADD_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_add_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_ADD_SS (k, a, b) =>
      _mm_maskz_add_ss(f(k), f(a), f(b))
    case MM512_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm512_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case MM512_ALIGNR_EPI64 (a, b, count) =>
      _mm512_alignr_epi64(f(a), f(b), f(count))
    case MM512_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM512_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm512_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM512_BROADCAST_F32X4 (a) =>
      _mm512_broadcast_f32x4(f(a))
    case MM512_MASK_BROADCAST_F32X4 (src, k, a) =>
      _mm512_mask_broadcast_f32x4(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_F32X4 (k, a) =>
      _mm512_maskz_broadcast_f32x4(f(k), f(a))
    case MM512_BROADCAST_F64X4 (a) =>
      _mm512_broadcast_f64x4(f(a))
    case MM512_MASK_BROADCAST_F64X4 (src, k, a) =>
      _mm512_mask_broadcast_f64x4(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_F64X4 (k, a) =>
      _mm512_maskz_broadcast_f64x4(f(k), f(a))
    case MM512_BROADCAST_I32X4 (a) =>
      _mm512_broadcast_i32x4(f(a))
    case MM512_MASK_BROADCAST_I32X4 (src, k, a) =>
      _mm512_mask_broadcast_i32x4(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_I32X4 (k, a) =>
      _mm512_maskz_broadcast_i32x4(f(k), f(a))
    case MM512_BROADCAST_I64X4 (a) =>
      _mm512_broadcast_i64x4(f(a))
    case MM512_MASK_BROADCAST_I64X4 (src, k, a) =>
      _mm512_mask_broadcast_i64x4(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCAST_I64X4 (k, a) =>
      _mm512_maskz_broadcast_i64x4(f(k), f(a))
    case MM512_BROADCASTSD_PD (a) =>
      _mm512_broadcastsd_pd(f(a))
    case MM512_MASK_BROADCASTSD_PD (src, k, a) =>
      _mm512_mask_broadcastsd_pd(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCASTSD_PD (k, a) =>
      _mm512_maskz_broadcastsd_pd(f(k), f(a))
    case MM512_BROADCASTSS_PS (a) =>
      _mm512_broadcastss_ps(f(a))
    case MM512_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm512_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm512_maskz_broadcastss_ps(f(k), f(a))
    case MM_CMP_ROUND_SD_MASK (a, b, imm8, sae) =>
      _mm_cmp_round_sd_mask(f(a), f(b), f(imm8), f(sae))
    case MM_CMP_SD_MASK (a, b, imm8) =>
      _mm_cmp_sd_mask(f(a), f(b), f(imm8))
    case MM_MASK_CMP_ROUND_SD_MASK (k1, a, b, imm8, sae) =>
      _mm_mask_cmp_round_sd_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM_MASK_CMP_SD_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_sd_mask(f(k1), f(a), f(b), f(imm8))
    case MM_CMP_ROUND_SS_MASK (a, b, imm8, sae) =>
      _mm_cmp_round_ss_mask(f(a), f(b), f(imm8), f(sae))
    case MM_CMP_SS_MASK (a, b, imm8) =>
      _mm_cmp_ss_mask(f(a), f(b), f(imm8))
    case MM_MASK_CMP_ROUND_SS_MASK (k1, a, b, imm8, sae) =>
      _mm_mask_cmp_round_ss_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM_MASK_CMP_SS_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_ss_mask(f(k1), f(a), f(b), f(imm8))
    case MM_COMI_ROUND_SD (a, b, imm8, sae) =>
      _mm_comi_round_sd(f(a), f(b), f(imm8), f(sae))
    case MM_COMI_ROUND_SS (a, b, imm8, sae) =>
      _mm_comi_round_ss(f(a), f(b), f(imm8), f(sae))
    case MM512_MASK_COMPRESS_PD (src, k, a) =>
      _mm512_mask_compress_pd(f(src), f(k), f(a))
    case iDef@MM512_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_COMPRESS_PD (k, a) =>
      _mm512_maskz_compress_pd(f(k), f(a))
    case MM512_MASK_COMPRESS_PS (src, k, a) =>
      _mm512_mask_compress_ps(f(src), f(k), f(a))
    case iDef@MM512_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_COMPRESS_PS (k, a) =>
      _mm512_maskz_compress_ps(f(k), f(a))
    case MM512_CVTEPI32_PD (a) =>
      _mm512_cvtepi32_pd(f(a))
    case MM512_MASK_CVTEPI32_PD (src, k, a) =>
      _mm512_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPI32_PD (k, a) =>
      _mm512_maskz_cvtepi32_pd(f(k), f(a))
    case MM512_CVT_ROUNDEPI32_PS (a, rounding) =>
      _mm512_cvt_roundepi32_ps(f(a), f(rounding))
    case MM512_CVTEPI32_PS (a) =>
      _mm512_cvtepi32_ps(f(a))
    case MM512_MASK_CVT_ROUNDEPI32_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi32_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPI32_PS (src, k, a) =>
      _mm512_mask_cvtepi32_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPI32_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi32_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPI32_PS (k, a) =>
      _mm512_maskz_cvtepi32_ps(f(k), f(a))
    case MM512_CVT_ROUNDPD_EPI32 (a, rounding) =>
      _mm512_cvt_roundpd_epi32(f(a), f(rounding))
    case MM512_CVTPD_EPI32 (a) =>
      _mm512_cvtpd_epi32(f(a))
    case MM512_MASK_CVT_ROUNDPD_EPI32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epi32(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm512_mask_cvtpd_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPI32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epi32(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm512_maskz_cvtpd_epi32(f(k), f(a))
    case MM512_CVT_ROUNDPD_PS (a, rounding) =>
      _mm512_cvt_roundpd_ps(f(a), f(rounding))
    case MM512_CVTPD_PS (a) =>
      _mm512_cvtpd_ps(f(a))
    case MM512_MASK_CVT_ROUNDPD_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPD_PS (src, k, a) =>
      _mm512_mask_cvtpd_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPD_PS (k, a) =>
      _mm512_maskz_cvtpd_ps(f(k), f(a))
    case MM512_CVT_ROUNDPD_EPU32 (a, rounding) =>
      _mm512_cvt_roundpd_epu32(f(a), f(rounding))
    case MM512_CVTPD_EPU32 (a) =>
      _mm512_cvtpd_epu32(f(a))
    case MM512_MASK_CVT_ROUNDPD_EPU32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epu32(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm512_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPU32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epu32(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm512_maskz_cvtpd_epu32(f(k), f(a))
    case MM512_CVT_ROUNDPH_PS (a, sae) =>
      _mm512_cvt_roundph_ps(f(a), f(sae))
    case MM512_CVTPH_PS (a) =>
      _mm512_cvtph_ps(f(a))
    case MM512_MASK_CVT_ROUNDPH_PS (src, k, a, sae) =>
      _mm512_mask_cvt_roundph_ps(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTPH_PS (src, k, a) =>
      _mm512_mask_cvtph_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPH_PS (k, a, sae) =>
      _mm512_maskz_cvt_roundph_ps(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTPH_PS (k, a) =>
      _mm512_maskz_cvtph_ps(f(k), f(a))
    case MM512_CVT_ROUNDPS_EPI32 (a, rounding) =>
      _mm512_cvt_roundps_epi32(f(a), f(rounding))
    case MM512_CVTPS_EPI32 (a) =>
      _mm512_cvtps_epi32(f(a))
    case MM512_MASK_CVT_ROUNDPS_EPI32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epi32(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm512_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPS_EPI32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epi32(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPS_EPI32 (k, a) =>
      _mm512_maskz_cvtps_epi32(f(k), f(a))
    case MM512_CVT_ROUNDPS_PD (a, sae) =>
      _mm512_cvt_roundps_pd(f(a), f(sae))
    case MM512_CVTPS_PD (a) =>
      _mm512_cvtps_pd(f(a))
    case MM512_MASK_CVT_ROUNDPS_PD (src, k, a, sae) =>
      _mm512_mask_cvt_roundps_pd(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTPS_PD (src, k, a) =>
      _mm512_mask_cvtps_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPS_PD (k, a, sae) =>
      _mm512_maskz_cvt_roundps_pd(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTPS_PD (k, a) =>
      _mm512_maskz_cvtps_pd(f(k), f(a))
    case MM512_CVT_ROUNDPS_PH (a, rounding) =>
      _mm512_cvt_roundps_ph(f(a), f(rounding))
    case MM512_CVTPS_PH (a, rounding) =>
      _mm512_cvtps_ph(f(a), f(rounding))
    case MM512_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPS_PH (src, k, a, rounding) =>
      _mm512_mask_cvtps_ph(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm512_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM512_CVT_ROUNDPS_EPU32 (a, rounding) =>
      _mm512_cvt_roundps_epu32(f(a), f(rounding))
    case MM512_CVTPS_EPU32 (a) =>
      _mm512_cvtps_epu32(f(a))
    case MM512_MASK_CVT_ROUNDPS_EPU32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epu32(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTPS_EPU32 (src, k, a) =>
      _mm512_mask_cvtps_epu32(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPS_EPU32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epu32(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm512_maskz_cvtps_epu32(f(k), f(a))
    case MM_CVT_ROUNDSD_I32 (a, rounding) =>
      _mm_cvt_roundsd_i32(f(a), f(rounding))
    case MM_CVT_ROUNDSD_I64 (a, rounding) =>
      _mm_cvt_roundsd_i64(f(a), f(rounding))
    case MM_CVT_ROUNDSD_SI32 (a, rounding) =>
      _mm_cvt_roundsd_si32(f(a), f(rounding))
    case MM_CVT_ROUNDSD_SI64 (a, rounding) =>
      _mm_cvt_roundsd_si64(f(a), f(rounding))
    case MM_CVTSD_I32 (a) =>
      _mm_cvtsd_i32(f(a))
    case MM_CVTSD_I64 (a) =>
      _mm_cvtsd_i64(f(a))
    case MM_CVT_ROUNDSD_SS (a, b, rounding) =>
      _mm_cvt_roundsd_ss(f(a), f(b), f(rounding))
    case MM_MASK_CVT_ROUNDSD_SS (src, k, a, b, rounding) =>
      _mm_mask_cvt_roundsd_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_CVTSD_SS (src, k, a, b) =>
      _mm_mask_cvtsd_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_CVT_ROUNDSD_SS (k, a, b, rounding) =>
      _mm_maskz_cvt_roundsd_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_CVTSD_SS (k, a, b) =>
      _mm_maskz_cvtsd_ss(f(k), f(a), f(b))
    case MM_CVT_ROUNDSD_U32 (a, rounding) =>
      _mm_cvt_roundsd_u32(f(a), f(rounding))
    case MM_CVT_ROUNDSD_U64 (a, rounding) =>
      _mm_cvt_roundsd_u64(f(a), f(rounding))
    case MM_CVTSD_U32 (a) =>
      _mm_cvtsd_u32(f(a))
    case MM_CVTSD_U64 (a) =>
      _mm_cvtsd_u64(f(a))
    case MM_CVT_ROUNDI64_SD (a, b, rounding) =>
      _mm_cvt_roundi64_sd(f(a), f(b), f(rounding))
    case MM_CVT_ROUNDSI64_SD (a, b, rounding) =>
      _mm_cvt_roundsi64_sd(f(a), f(b), f(rounding))
    case MM_CVTI32_SD (a, b) =>
      _mm_cvti32_sd(f(a), f(b))
    case MM_CVTI64_SD (a, b) =>
      _mm_cvti64_sd(f(a), f(b))
    case MM_CVT_ROUNDI32_SS (a, b, rounding) =>
      _mm_cvt_roundi32_ss(f(a), f(b), f(rounding))
    case MM_CVT_ROUNDI64_SS (a, b, rounding) =>
      _mm_cvt_roundi64_ss(f(a), f(b), f(rounding))
    case MM_CVT_ROUNDSI32_SS (a, b, rounding) =>
      _mm_cvt_roundsi32_ss(f(a), f(b), f(rounding))
    case MM_CVT_ROUNDSI64_SS (a, b, rounding) =>
      _mm_cvt_roundsi64_ss(f(a), f(b), f(rounding))
    case MM_CVTI32_SS (a, b) =>
      _mm_cvti32_ss(f(a), f(b))
    case MM_CVTI64_SS (a, b) =>
      _mm_cvti64_ss(f(a), f(b))
    case MM_CVT_ROUNDSS_SD (a, b, rounding) =>
      _mm_cvt_roundss_sd(f(a), f(b), f(rounding))
    case MM_MASK_CVT_ROUNDSS_SD (src, k, a, b, rounding) =>
      _mm_mask_cvt_roundss_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_CVTSS_SD (src, k, a, b) =>
      _mm_mask_cvtss_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_CVT_ROUNDSS_SD (k, a, b, rounding) =>
      _mm_maskz_cvt_roundss_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_CVTSS_SD (k, a, b) =>
      _mm_maskz_cvtss_sd(f(k), f(a), f(b))
    case MM_CVT_ROUNDSS_I32 (a, rounding) =>
      _mm_cvt_roundss_i32(f(a), f(rounding))
    case MM_CVT_ROUNDSS_I64 (a, rounding) =>
      _mm_cvt_roundss_i64(f(a), f(rounding))
    case MM_CVT_ROUNDSS_SI32 (a, rounding) =>
      _mm_cvt_roundss_si32(f(a), f(rounding))
    case MM_CVT_ROUNDSS_SI64 (a, rounding) =>
      _mm_cvt_roundss_si64(f(a), f(rounding))
    case MM_CVTSS_I32 (a) =>
      _mm_cvtss_i32(f(a))
    case MM_CVTSS_I64 (a) =>
      _mm_cvtss_i64(f(a))
    case MM_CVT_ROUNDSS_U32 (a, rounding) =>
      _mm_cvt_roundss_u32(f(a), f(rounding))
    case MM_CVT_ROUNDSS_U64 (a, rounding) =>
      _mm_cvt_roundss_u64(f(a), f(rounding))
    case MM_CVTSS_U32 (a) =>
      _mm_cvtss_u32(f(a))
    case MM_CVTSS_U64 (a) =>
      _mm_cvtss_u64(f(a))
    case MM512_CVTT_ROUNDPD_EPI32 (a, sae) =>
      _mm512_cvtt_roundpd_epi32(f(a), f(sae))
    case MM512_CVTTPD_EPI32 (a) =>
      _mm512_cvttpd_epi32(f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPI32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epi32(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm512_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPD_EPI32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epi32(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm512_maskz_cvttpd_epi32(f(k), f(a))
    case MM512_CVTT_ROUNDPD_EPU32 (a, sae) =>
      _mm512_cvtt_roundpd_epu32(f(a), f(sae))
    case MM512_CVTTPD_EPU32 (a) =>
      _mm512_cvttpd_epu32(f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPU32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epu32(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPD_EPU32 (src, k, a) =>
      _mm512_mask_cvttpd_epu32(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPD_EPU32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epu32(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm512_maskz_cvttpd_epu32(f(k), f(a))
    case MM512_CVTT_ROUNDPS_EPI32 (a, sae) =>
      _mm512_cvtt_roundps_epi32(f(a), f(sae))
    case MM512_CVTTPS_EPI32 (a) =>
      _mm512_cvttps_epi32(f(a))
    case MM512_MASK_CVTT_ROUNDPS_EPI32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epi32(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm512_mask_cvttps_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPS_EPI32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epi32(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPS_EPI32 (k, a) =>
      _mm512_maskz_cvttps_epi32(f(k), f(a))

    case Reflect(MM512_KANDN (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KANDN (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KAND (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KAND (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMOV (a), u, es) =>
      reflectMirrored(Reflect(MM512_KMOV (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KNOT (a), u, es) =>
      reflectMirrored(Reflect(MM512_KNOT (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKB (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KXNOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KXNOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KXOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KXOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ADD_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ADD_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F64X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F64X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F64X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F64X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F64X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F64X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I64X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I64X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I64X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I64X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I64X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I64X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTSD_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTSD_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTSD_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTSD_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTSS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTSS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_ROUND_SD_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_CMP_ROUND_SD_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_ROUND_SD_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_ROUND_SD_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_SD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_SD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_ROUND_SS_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_CMP_ROUND_SS_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_ROUND_SS_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_ROUND_SS_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_SS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_SS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMI_ROUND_SD (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_COMI_ROUND_SD (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMI_ROUND_SS (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_COMI_ROUND_SS (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPI32_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPI32_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI32_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI32_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI32_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI32_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPI32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPI32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPU32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPU32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPU32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPU32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPH_PS (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPH_PS (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPH_PS (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPH_PS (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPH_PS (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPH_PS (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPI32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPI32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_PD (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_PD (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_PD (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_PD (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_PD (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_PD (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPU32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPU32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPU32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPU32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDSD_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDSD_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSD_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSD_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVT_ROUNDSD_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVT_ROUNDSD_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSD_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSD_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI32_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI32_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI64_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI64_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI32_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI32_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI64_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI64_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDSS_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDSS_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSS_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSS_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVT_ROUNDSS_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVT_ROUNDSS_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSS_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSS_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPI32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPI32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPI32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPI32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPU32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPU32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPU32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPU32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPI32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPI32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPI32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPI32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
  }).asInstanceOf[Exp[A]] // why??
}

protected trait CGenAVX51200 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case MM512_KANDN(a, b) =>
      emitValDef(sym, s"_mm512_kandn(${quote(a)}, ${quote(b)})")
    case MM512_KAND(a, b) =>
      emitValDef(sym, s"_mm512_kand(${quote(a)}, ${quote(b)})")
    case MM512_KMOV(a) =>
      emitValDef(sym, s"_mm512_kmov(${quote(a)})")
    case MM512_KNOT(a) =>
      emitValDef(sym, s"_mm512_knot(${quote(a)})")
    case MM512_KOR(a, b) =>
      emitValDef(sym, s"_mm512_kor(${quote(a)}, ${quote(b)})")
    case MM512_KUNPACKB(a, b) =>
      emitValDef(sym, s"_mm512_kunpackb(${quote(a)}, ${quote(b)})")
    case MM512_KXNOR(a, b) =>
      emitValDef(sym, s"_mm512_kxnor(${quote(a)}, ${quote(b)})")
    case MM512_KXOR(a, b) =>
      emitValDef(sym, s"_mm512_kxor(${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADD_PD(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADD_ROUND_PD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_add_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM512_MASKZ_ADD_PS(k, a, b) =>
      emitValDef(sym, s"_mm512_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ADD_ROUND_PS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm512_maskz_add_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_ADD_ROUND_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_add_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_ADD_ROUND_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_add_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_ADD_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_add_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADD_ROUND_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_add_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_ADD_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_add_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_ADD_ROUND_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_add_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_ADD_ROUND_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_add_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_ADD_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_add_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_ADD_ROUND_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_add_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_ADD_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_add_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM512_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      emitValDef(sym, s"_mm512_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_ALIGNR_EPI64(a, b, count) =>
      emitValDef(sym, s"_mm512_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      emitValDef(sym, s"_mm512_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      emitValDef(sym, s"_mm512_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case MM512_BROADCAST_F32X4(a) =>
      emitValDef(sym, s"_mm512_broadcast_f32x4(${quote(a)})")
    case MM512_MASK_BROADCAST_F32X4(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_F32X4(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_F64X4(a) =>
      emitValDef(sym, s"_mm512_broadcast_f64x4(${quote(a)})")
    case MM512_MASK_BROADCAST_F64X4(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_f64x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_F64X4(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_f64x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_I32X4(a) =>
      emitValDef(sym, s"_mm512_broadcast_i32x4(${quote(a)})")
    case MM512_MASK_BROADCAST_I32X4(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_I32X4(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_i32x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCAST_I64X4(a) =>
      emitValDef(sym, s"_mm512_broadcast_i64x4(${quote(a)})")
    case MM512_MASK_BROADCAST_I64X4(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcast_i64x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCAST_I64X4(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcast_i64x4(${quote(k)}, ${quote(a)})")
    case MM512_BROADCASTSD_PD(a) =>
      emitValDef(sym, s"_mm512_broadcastsd_pd(${quote(a)})")
    case MM512_MASK_BROADCASTSD_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcastsd_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCASTSD_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcastsd_pd(${quote(k)}, ${quote(a)})")
    case MM512_BROADCASTSS_PS(a) =>
      emitValDef(sym, s"_mm512_broadcastss_ps(${quote(a)})")
    case MM512_MASK_BROADCASTSS_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_BROADCASTSS_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case MM_CMP_ROUND_SD_MASK(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_cmp_round_sd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM_CMP_SD_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_sd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMP_ROUND_SD_MASK(k1, a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_mask_cmp_round_sd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM_MASK_CMP_SD_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_sd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_CMP_ROUND_SS_MASK(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_cmp_round_ss_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM_CMP_SS_MASK(a, b, imm8) =>
      emitValDef(sym, s"_mm_cmp_ss_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_MASK_CMP_ROUND_SS_MASK(k1, a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_mask_cmp_round_ss_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM_MASK_CMP_SS_MASK(k1, a, b, imm8) =>
      emitValDef(sym, s"_mm_mask_cmp_ss_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case MM_COMI_ROUND_SD(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_comi_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM_COMI_ROUND_SS(a, b, imm8, sae) =>
      emitValDef(sym, s"_mm_comi_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case MM512_MASK_COMPRESS_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm512_mask_compressstoreu_pd(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_COMPRESS_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_compress_pd(${quote(k)}, ${quote(a)})")
    case MM512_MASK_COMPRESS_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      stream.println(s"_mm512_mask_compressstoreu_ps(${quote(base_addr) + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}, ${quote(k)}, ${quote(a)});")
    case MM512_MASKZ_COMPRESS_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVTEPI32_PD(a) =>
      emitValDef(sym, s"_mm512_cvtepi32_pd(${quote(a)})")
    case MM512_MASK_CVTEPI32_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTEPI32_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDEPI32_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundepi32_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTEPI32_PS(a) =>
      emitValDef(sym, s"_mm512_cvtepi32_ps(${quote(a)})")
    case MM512_MASK_CVT_ROUNDEPI32_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTEPI32_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDEPI32_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi32_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTEPI32_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPD_EPI32(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_epi32(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPD_EPI32(a) =>
      emitValDef(sym, s"_mm512_cvtpd_epi32(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPD_EPI32(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPD_EPI32(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epi32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPD_PS(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_ps(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPD_PS(a) =>
      emitValDef(sym, s"_mm512_cvtpd_ps(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPD_PS(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPD_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPD_PS(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPD_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPD_EPU32(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundpd_epu32(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPD_EPU32(a) =>
      emitValDef(sym, s"_mm512_cvtpd_epu32(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPD_EPU32(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPD_EPU32(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epu32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPH_PS(a, sae) =>
      emitValDef(sym, s"_mm512_cvt_roundph_ps(${quote(a)}, ${quote(sae)})")
    case MM512_CVTPH_PS(a) =>
      emitValDef(sym, s"_mm512_cvtph_ps(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPH_PS(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundph_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTPH_PS(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPH_PS(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundph_ps(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTPH_PS(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPS_EPI32(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundps_epi32(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPS_EPI32(a) =>
      emitValDef(sym, s"_mm512_cvtps_epi32(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPS_EPI32(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPS_EPI32(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epi32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_epi32(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPS_PD(a, sae) =>
      emitValDef(sym, s"_mm512_cvt_roundps_pd(${quote(a)}, ${quote(sae)})")
    case MM512_CVTPS_PD(a) =>
      emitValDef(sym, s"_mm512_cvtps_pd(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPS_PD(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTPS_PD(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtps_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPS_PD(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_pd(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTPS_PD(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_pd(${quote(k)}, ${quote(a)})")
    case MM512_CVT_ROUNDPS_PH(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundps_ph(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPS_PH(a, rounding) =>
      emitValDef(sym, s"_mm512_cvtps_ph(${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPS_PH(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvtps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPS_PH(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_CVT_ROUNDPS_EPU32(a, rounding) =>
      emitValDef(sym, s"_mm512_cvt_roundps_epu32(${quote(a)}, ${quote(rounding)})")
    case MM512_CVTPS_EPU32(a) =>
      emitValDef(sym, s"_mm512_cvtps_epu32(${quote(a)})")
    case MM512_MASK_CVT_ROUNDPS_EPU32(src, k, a, rounding) =>
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASK_CVTPS_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvtps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVT_ROUNDPS_EPU32(k, a, rounding) =>
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epu32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case MM512_MASKZ_CVTPS_EPU32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case MM_CVT_ROUNDSD_I32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_i32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSD_I64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_i64(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSD_SI32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_si32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSD_SI64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_si64(${quote(a)}, ${quote(rounding)})")
    case MM_CVTSD_I32(a) =>
      emitValDef(sym, s"_mm_cvtsd_i32(${quote(a)})")
    case MM_CVTSD_I64(a) =>
      emitValDef(sym, s"_mm_cvtsd_i64(${quote(a)})")
    case MM_CVT_ROUNDSD_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_CVT_ROUNDSD_SS(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_cvt_roundsd_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_CVTSD_SS(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_cvtsd_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_CVT_ROUNDSD_SS(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_cvt_roundsd_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_CVTSD_SS(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_cvtsd_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_CVT_ROUNDSD_U32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_u32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSD_U64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsd_u64(${quote(a)}, ${quote(rounding)})")
    case MM_CVTSD_U32(a) =>
      emitValDef(sym, s"_mm_cvtsd_u32(${quote(a)})")
    case MM_CVTSD_U64(a) =>
      emitValDef(sym, s"_mm_cvtsd_u64(${quote(a)})")
    case MM_CVT_ROUNDI64_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundi64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSI64_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsi64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVTI32_SD(a, b) =>
      emitValDef(sym, s"_mm_cvti32_sd(${quote(a)}, ${quote(b)})")
    case MM_CVTI64_SD(a, b) =>
      emitValDef(sym, s"_mm_cvti64_sd(${quote(a)}, ${quote(b)})")
    case MM_CVT_ROUNDI32_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundi32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVT_ROUNDI64_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundi64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSI32_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsi32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSI64_SS(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundsi64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_CVTI32_SS(a, b) =>
      emitValDef(sym, s"_mm_cvti32_ss(${quote(a)}, ${quote(b)})")
    case MM_CVTI64_SS(a, b) =>
      emitValDef(sym, s"_mm_cvti64_ss(${quote(a)}, ${quote(b)})")
    case MM_CVT_ROUNDSS_SD(a, b, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_CVT_ROUNDSS_SD(src, k, a, b, rounding) =>
      emitValDef(sym, s"_mm_mask_cvt_roundss_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASK_CVTSS_SD(src, k, a, b) =>
      emitValDef(sym, s"_mm_mask_cvtss_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_MASKZ_CVT_ROUNDSS_SD(k, a, b, rounding) =>
      emitValDef(sym, s"_mm_maskz_cvt_roundss_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case MM_MASKZ_CVTSS_SD(k, a, b) =>
      emitValDef(sym, s"_mm_maskz_cvtss_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case MM_CVT_ROUNDSS_I32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_i32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSS_I64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_i64(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSS_SI32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_si32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSS_SI64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_si64(${quote(a)}, ${quote(rounding)})")
    case MM_CVTSS_I32(a) =>
      emitValDef(sym, s"_mm_cvtss_i32(${quote(a)})")
    case MM_CVTSS_I64(a) =>
      emitValDef(sym, s"_mm_cvtss_i64(${quote(a)})")
    case MM_CVT_ROUNDSS_U32(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_u32(${quote(a)}, ${quote(rounding)})")
    case MM_CVT_ROUNDSS_U64(a, rounding) =>
      emitValDef(sym, s"_mm_cvt_roundss_u64(${quote(a)}, ${quote(rounding)})")
    case MM_CVTSS_U32(a) =>
      emitValDef(sym, s"_mm_cvtss_u32(${quote(a)})")
    case MM_CVTSS_U64(a) =>
      emitValDef(sym, s"_mm_cvtss_u64(${quote(a)})")
    case MM512_CVTT_ROUNDPD_EPI32(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundpd_epi32(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPD_EPI32(a) =>
      emitValDef(sym, s"_mm512_cvttpd_epi32(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPD_EPI32(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPD_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPD_EPI32(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epi32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPD_EPI32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPD_EPU32(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundpd_epu32(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPD_EPU32(a) =>
      emitValDef(sym, s"_mm512_cvttpd_epu32(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPD_EPU32(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPD_EPU32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPD_EPU32(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epu32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPD_EPU32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case MM512_CVTT_ROUNDPS_EPI32(a, sae) =>
      emitValDef(sym, s"_mm512_cvtt_roundps_epi32(${quote(a)}, ${quote(sae)})")
    case MM512_CVTTPS_EPI32(a) =>
      emitValDef(sym, s"_mm512_cvttps_epi32(${quote(a)})")
    case MM512_MASK_CVTT_ROUNDPS_EPI32(src, k, a, sae) =>
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASK_CVTTPS_EPI32(src, k, a) =>
      emitValDef(sym, s"_mm512_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case MM512_MASKZ_CVTT_ROUNDPS_EPI32(k, a, sae) =>
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epi32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case MM512_MASKZ_CVTTPS_EPI32(k, a) =>
      emitValDef(sym, s"_mm512_maskz_cvttps_epi32(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
