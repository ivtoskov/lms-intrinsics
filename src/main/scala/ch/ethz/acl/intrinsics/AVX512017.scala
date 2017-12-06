/**
  *  Intel Intrinsics for Lightweight Modular Staging Framework
  *  https://github.com/ivtoskov/lms-intrinsics
  *  Department of Computer Science, ETH Zurich, Switzerland
  *      __                         _         __         _               _
  *     / /____ ___   _____        (_)____   / /_ _____ (_)____   _____ (_)_____ _____
  *    / // __ `__ \ / ___/______ / // __ \ / __// ___// // __ \ / ___// // ___// ___/
  *   / // / / / / /(__  )/_____// // / / // /_ / /   / // / / /(__  )/ // /__ (__  )
  *  /_//_/ /_/ /_//____/       /_//_/ /_/ \__//_/   /_//_/ /_//____//_/ \___//____/
  *
  *  Copyright (C) 2017 Ivaylo Toskov (itoskov@ethz.ch)
  *                     Alen Stojanov (astojanov@inf.ethz.ch)
  *
  *  Licensed under the Apache License, Version 2.0 (the "License");
  *  you may not use this file except in compliance with the License.
  *  You may obtain a copy of the License at
  *
  *  http://www.apache.org/licenses/LICENSE-2.0
  *
  *  Unless required by applicable law or agreed to in writing, software
  *  distributed under the License is distributed on an "AS IS" BASIS,
  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  *  See the License for the specific language governing permissions and
  *  limitations under the License.
  */
    
package ch.ethz.acl.intrinsics

import ch.ethz.acl.intrinsics.MicroArchType._
import ch.ethz.acl.passera.unsigned.{UByte, UInt, ULong, UShort}

import scala.reflect.SourceContext
import scala.language.higherKinds

    
trait AVX512017 extends IntrinsicsBase {
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
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RSQRT28_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_PACKS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RSQRT14_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 8-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i
   */
  case class MM256_MASKZ_MOV_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_AND_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Set packed 64-bit integers in "dst" with the supplied values.
   * e7: __int64, e6: __int64, e5: __int64, e4: __int64, e3: __int64, e2: __int64, e1: __int64, e0: __int64
   */
  case class MM512_SET_EPI64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRLI_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
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
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 		[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_DIV_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_XOR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPI32_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Broadcast 64-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __int64
   */
  case class MM512_MASK_SET1_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASKZ_ROUNDSCALE_ROUND_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "a" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_SQRT_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Return vector of type __m512 with all elements set to zero.

   */
  case class MM512_SETZERO() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List()
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
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_UNPACKHI_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_CMP_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512d, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEVAR_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RSQRT28_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper element from "b" to the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SCALEF_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "b" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_SCALEF_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMSUBADD_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI32_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU16_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_MASKZ_ROUNDSCALE_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMSUBADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128, b: __m128, sae: int
   */
  case class MM_MIN_ROUND_SS(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPU32_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	"mem_addr" does not need to be aligned on any particular
   * boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * 	[round_note].
   * a: __m512, rounding: int
   */
  case class MM512_SQRT_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-14.
   * a: __m512
   */
  case class MM512_RSQRT14_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst", and copy the upper element from "a"
   * to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU32_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, imm8: const int, rounding: const int
   */
  case class MM_MASKZ_ROUNDSCALE_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_SCALEF_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRA_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_RCP28_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	[round_note].
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_SQRT_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMSUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_FIXUPIMM_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower single-precision (32-bit) floating-point element from "b" to
   * the lower element of "dst" using writemask "k" (the element is copied from
   * "src" when mask bit 0 is not set), and copy the upper 3 packed elements from
   * "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MOVE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_FMSUBADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
      

  def _mm512_mask_xor_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_XOR_PS(src, k, a, b)
  }
            
  def _mm512_mask_cvtepi64_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTEPI64_EPI32(src, k, a)
  }
            
  def _mm256_mask_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_dbsad_epu8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm_mask_min_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MIN_PD(src, k, a, b)
  }
            
  def _mm_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm512_mask_rsqrt28_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RSQRT28_PS(src, k, a)
  }
            
  def _mm_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtsepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTSEPI64_EPI8(src, k, a)
  }
            
  def _mm256_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm512_maskz_reduce_round_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_REDUCE_ROUND_PD(k, a, imm8, rounding)
  }
            
  def _mm_mask_packs_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PACKS_EPI32(src, k, a, b)
  }
            
  def _mm_getexp_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_GETEXP_PD(a)
  }
            
  def _mm512_mask_cvt_roundepi64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASK_CVT_ROUNDEPI64_PS(src, k, a, rounding)
  }
            
  def _mm_maskz_rsqrt14_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT14_SD(k, a, b)
  }
            
  def _mm256_maskz_mov_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MOV_EPI8(k, a)
  }
            
  def _mm512_maskz_and_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AND_EPI64(k, a, b)
  }
            
  def _mm256_maskz_max_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MAX_PS(k, a, b)
  }
            
  def _mm512_broadcast_i32x8(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X8(a)
  }
            
  def _mm512_set_epi64(e7: Exp[Long], e6: Exp[Long], e5: Exp[Long], e4: Exp[Long], e3: Exp[Long], e2: Exp[Long], e1: Exp[Long], e0: Exp[Long]): Exp[__m512i] = {
    MM512_SET_EPI64(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_mask_cmpgt_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPU64_MASK(k1, a, b)
  }
            
  def _mm_mask_max_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm512_mask_srli_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRLI_EPI64(src, k, a, imm8)
  }
            
  def _mm512_bslli_epi128(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_BSLLI_EPI128(a, imm8)
  }
            
  def _mm_mask_sllv_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_andnot_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ANDNOT_EPI32(k, a, b)
  }
            
  def _mm256_maskz_cvtepu8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI16(k, a)
  }
            
  def _mm_mask_div_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_DIV_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm512_mask_cvt_roundps_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDPS_PD(src, k, a, sae)
  }
            
  def _mm256_mask_reduce_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm_maskz_permutex2var_epi64(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b)
  }
            
  def _mm512_cvtt_roundps_epi32(a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPI32(a, sae)
  }
            
  def _mm_mask_cvt_roundss_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_CVT_ROUNDSS_SD(src, k, a, b, rounding)
  }
            
  def _mm256_mask_broadcastss_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm512_mask_cvtusepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTUSEPI64_EPI16(src, k, a)
  }
            
  def _mm_fixupimm_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_SS(a, b, c, imm8)
  }
            
  def _mm256_mask_xor_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_XOR_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_cvtepi32_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI32_EPI64(k, a)
  }
            
  def _mm512_mask_cmpge_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPU64_MASK(k1, a, b)
  }
            
  def _mm_cvt_roundsd_u64(a: Exp[__m128d], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVT_ROUNDSD_U64(a, rounding)
  }
            
  def _mm512_mask_set1_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[Long]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI64(src, k, a)
  }
            
  def _mm512_maskz_roundscale_round_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ROUNDSCALE_ROUND_PD(k, a, imm8, rounding)
  }
            
  def _mm256_mask_fixupimm_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm256_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPU32(src, k, a)
  }
            
  def _mm_cmple_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPU32_MASK(a, b)
  }
            
  def _mm512_maskz_fmadd_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMADD_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm512_mask_sqrt_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SQRT_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_maskz_broadcast_f32x2(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X2(k, a)
  }
            
  def _mm256_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm_mask3_fnmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_SD(a, b, c, k)
  }
            
  def _mm_cmp_round_ss_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_CMP_ROUND_SS_MASK(a, b, imm8, sae)
  }
            
  def _mm512_setzero(): Exp[__m512] = {
    MM512_SETZERO()
  }
            
  def _mm_movepi64_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI64_MASK(a)
  }
            
  def _mm256_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm256_maskz_cvtsepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI8(k, a)
  }
            
  def _mm512_unpackhi_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_UNPACKHI_PD(a, b)
  }
            
  def _mm256_cmp_epu32_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPU32_MASK(a, b, imm8)
  }
            
  def _mm_reduce_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_REDUCE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm256_mask3_fmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMSUB_PS(a, b, c, k)
  }
            
  def _mm_maskz_sub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SUB_SS(k, a, b)
  }
            
  def _mm512_maskz_permutevar_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASKZ_PERMUTEVAR_PD(k, a, b)
  }
            
  def _mm_maskz_rsqrt28_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT28_SS(k, a, b)
  }
            
  def _mm_mask_max_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm256_mask_cvtepi32_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm512_max_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPU16(a, b)
  }
            
  def _mm_mask_cmple_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPU16_MASK(k1, a, b)
  }
            
  def _mm_scalef_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SCALEF_SD(a, b)
  }
            
  def _mm512_cvt_roundps_pd(a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_CVT_ROUNDPS_PD(a, sae)
  }
            
  def _mm256_mask_rorv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_RORV_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_min_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm512_maskz_fmsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm256_mask_unpacklo_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm512_inserti64x2(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI64X2(a, b, imm8)
  }
            
  def _mm256_mask_add_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm_mask_or_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_OR_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm512_mask_min_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm256_mask_compress_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm_cvtsepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI16_EPI8(a)
  }
            
  def _mm256_mmask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_srl_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRL_EPI64(k, a, count)
  }
            
  def _mm256_cmple_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPU16_MASK(a, b)
  }
            
  def _mm_maskz_cvtsepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI32_EPI16(k, a)
  }
            
  def _mm256_testn_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_cmpge_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPI64_MASK(k1, a, b)
  }
            
  def _mm_scalef_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SCALEF_SS(a, b)
  }
            
  def _mm_mask_unpacklo_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm512_maskz_cvt_roundps_epi32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPI32(k, a, rounding)
  }
            
  def _mm512_mask_fmsubadd_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm256_movepi32_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI32_MASK(a)
  }
            
  def _mm_mask_sll_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI32(src, k, a, count)
  }
            
  def _mm_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm512_cvtepu16_epi32(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPU16_EPI32(a)
  }
            
  def _mm_mask_cmplt_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI32_MASK(k1, a, b)
  }
            
  def _mm_mask_fixupimm_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_SS(a, k, b, c, imm8)
  }
            
  def _mm_mask_cvt_roundps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm_mask_cvtps_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm512_cvt_roundps_epi64(a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPI64(a, rounding)
  }
            
  def _mm_maskz_roundscale_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ROUNDSCALE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm512_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm_maskz_reduce_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_REDUCE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_fmadd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADD_SS(k, a, b, c)
  }
            
  def _mm_mask2_permutex2var_epi32(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b)
  }
            
  def _mm256_mask_cvtepi32_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256i]): Exp[__m256] = {
    MM256_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm256_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm512_maskz_min_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU64(k, a, b)
  }
            
  def _mm256_cmpneq_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvttps_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm512_mask_cvtt_roundpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPD_EPU64(src, k, a, sae)
  }
            
  def _mm512_mask_cvtepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm512_mask3_fmsubadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm256_maskz_srli_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm512_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm_multishift_epi64_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm_min_round_ss(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MIN_ROUND_SS(a, b, sae)
  }
            
  def _mm256_mask_fnmadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FNMADD_PD(a, k, b, c)
  }
            
  def _mm_mask_cmplt_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPU64_MASK(k1, a, b)
  }
            
  def _mm_maskz_set1_epi8(k: Exp[Int], a: Exp[Byte]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm512_maskz_avg_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm256_mask_cvtps_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepu32_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDEPU32_PS(k, a, rounding)
  }
            
  def _mm_mask_cvtepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI32_EPI16(src, k, a)
  }
            
  def _mm_mask_alignr_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm256_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_maskz_loadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_sqrt_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SQRT_ROUND_PS(a, rounding)
  }
            
  def _mm512_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm512_rsqrt14_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT14_PS(a)
  }
            
  def _mm_fmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FMADD_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm512_cvtepu32_epi64(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPU32_EPI64(a)
  }
            
  def _mm_maskz_roundscale_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_ROUND_SS(k, a, b, imm8, rounding)
  }
            
  def _mm_maskz_or_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_OR_EPI32(k, a, b)
  }
            
  def _mm256_rolv_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ROLV_EPI64(a, b)
  }
            
  def _mm512_testn_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm256_srav_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRAV_EPI16(a, count)
  }
            
  def _mm512_knot(a: Exp[Int]): Exp[Int] = {
    MM512_KNOT(a)
  }
            
  def _mm512_mask_alignr_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm512_mask_scalef_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm256_cvtsepi16_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI16_EPI8(a)
  }
            
  def _mm_mask_cvtepi32_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI32_EPI64(src, k, a)
  }
            
  def _mm256_maskz_reduce_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm256_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm512_mask_sra_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRA_EPI64(src, k, a, count)
  }
            
  def _mm_cvtepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI32(a)
  }
            
  def _mm256_mask_max_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU64(src, k, a, b)
  }
            
  def _mm512_mask_cvtsepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI8(a)
  }
            
  def _mm_mask_sll_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI64(src, k, a, count)
  }
            
  def _mm512_cmpge_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGE_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_cvtpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTPD_EPI64(src, k, a)
  }
            
  def _mm512_cmple_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLE_EPU8_MASK(a, b)
  }
            
  def _mm512_mask_rcp28_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RCP28_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm_cvtepi64_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPI64_PD(a)
  }
            
  def _mm_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm_movepi16_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI16_MASK(a)
  }
            
  def _mm256_cmp_ps_mask(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_PS_MASK(a, b, imm8)
  }
            
  def _mm512_maskz_sqrt_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SQRT_ROUND_PD(k, a, rounding)
  }
            
  def _mm_mask3_fnmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm512_mask_cmple_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_cmplt_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPI64_MASK(a, b)
  }
            
  def _mm256_maskz_sll_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm256_maskz_cvtsepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI16(k, a)
  }
            
  def _mm_maskz_fmsub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_SD(k, a, b, c)
  }
            
  def _mm256_mask_sra_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_fmsubadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMSUBADD_PS(k, a, b, c)
  }
            
  def _mm_fixupimm_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_ROUND_SS(a, b, c, imm8, rounding)
  }
            
  def _mm_mask_move_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOVE_SS(src, k, a, b)
  }
            
  def _mm256_mask_unpackhi_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_subs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm256_extractf32x4_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_EXTRACTF32X4_PS(a, imm8)
  }
            
  def _mm512_fmsubadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMSUBADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm256_fixupimm_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_XOR_PS (src, k, a, b) =>
      _mm512_mask_xor_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_CVTEPI64_EPI32 (src, k, a) =>
      _mm512_mask_cvtepi64_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm512_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_MIN_PD (src, k, a, b) =>
      _mm_mask_min_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM512_MASK_RSQRT28_PS (src, k, a) =>
      _mm512_mask_rsqrt28_ps(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTSEPI64_EPI8 (src, k, a) =>
      _mm512_mask_cvtsepi64_epi8(f(src), f(k), f(a))
    case MM256_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm256_maskz_cvtpd_epu32(f(k), f(a))
    case MM512_MASKZ_REDUCE_ROUND_PD (k, a, imm8, rounding) =>
      _mm512_maskz_reduce_round_pd(f(k), f(a), f(imm8), f(rounding))
    case MM_MASK_PACKS_EPI32 (src, k, a, b) =>
      _mm_mask_packs_epi32(f(src), f(k), f(a), f(b))
    case MM_GETEXP_PD (a) =>
      _mm_getexp_pd(f(a))
    case MM512_MASK_CVT_ROUNDEPI64_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi64_ps(f(src), f(k), f(a), f(rounding))
    case MM_MASKZ_RSQRT14_SD (k, a, b) =>
      _mm_maskz_rsqrt14_sd(f(k), f(a), f(b))
    case MM256_MASKZ_MOV_EPI8 (k, a) =>
      _mm256_maskz_mov_epi8(f(k), f(a))
    case MM512_MASKZ_AND_EPI64 (k, a, b) =>
      _mm512_maskz_and_epi64(f(k), f(a), f(b))
    case MM256_MASKZ_MAX_PS (k, a, b) =>
      _mm256_maskz_max_ps(f(k), f(a), f(b))
    case MM512_BROADCAST_I32X8 (a) =>
      _mm512_broadcast_i32x8(f(a))
    case MM512_SET_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi64(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_MASK_CMPGT_EPU64_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epu64_mask(f(k1), f(a), f(b))
    case MM_MASK_MAX_PD (src, k, a, b) =>
      _mm_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_SRLI_EPI64 (src, k, a, imm8) =>
      _mm512_mask_srli_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_BSLLI_EPI128 (a, imm8) =>
      _mm512_bslli_epi128(f(a), f(imm8))
    case MM_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_ANDNOT_EPI32 (k, a, b) =>
      _mm256_maskz_andnot_epi32(f(k), f(a), f(b))
    case MM256_MASKZ_CVTEPU8_EPI16 (k, a) =>
      _mm256_maskz_cvtepu8_epi16(f(k), f(a))
    case MM_MASK_DIV_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_div_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASK_CVT_ROUNDPS_PD (src, k, a, sae) =>
      _mm512_mask_cvt_roundps_pd(f(src), f(k), f(a), f(sae))
    case MM256_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm256_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi64(f(k), f(a), f(idx), f(b))
    case MM512_CVTT_ROUNDPS_EPI32 (a, sae) =>
      _mm512_cvtt_roundps_epi32(f(a), f(sae))
    case MM_MASK_CVT_ROUNDSS_SD (src, k, a, b, rounding) =>
      _mm_mask_cvt_roundss_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm256_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM512_MASK_CVTUSEPI64_EPI16 (src, k, a) =>
      _mm512_mask_cvtusepi64_epi16(f(src), f(k), f(a))
    case MM_FIXUPIMM_SS (a, b, c, imm8) =>
      _mm_fixupimm_ss(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_XOR_EPI64 (src, k, a, b) =>
      _mm256_mask_xor_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPI32_EPI64 (k, a) =>
      _mm512_maskz_cvtepi32_epi64(f(k), f(a))
    case MM512_MASK_CMPGE_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epu64_mask(f(k1), f(a), f(b))
    case MM_CVT_ROUNDSD_U64 (a, rounding) =>
      _mm_cvt_roundsd_u64(f(a), f(rounding))
    case MM512_MASK_SET1_EPI64 (src, k, a) =>
      _mm512_mask_set1_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_ROUNDSCALE_ROUND_PD (k, a, imm8, rounding) =>
      _mm512_maskz_roundscale_round_pd(f(k), f(a), f(imm8), f(rounding))
    case MM256_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm256_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case iDef@MM256_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTPS_EPU32 (src, k, a) =>
      _mm512_mask_cvtps_epu32(f(src), f(k), f(a))
    case MM_CMPLE_EPU32_MASK (a, b) =>
      _mm_cmple_epu32_mask(f(a), f(b))
    case MM512_MASKZ_FMADD_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmadd_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASK_SQRT_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_sqrt_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_BROADCAST_F32X2 (k, a) =>
      _mm512_maskz_broadcast_f32x2(f(k), f(a))
    case MM256_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm256_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM_MASK3_FNMSUB_SD (a, b, c, k) =>
      _mm_mask3_fnmsub_sd(f(a), f(b), f(c), f(k))
    case MM_CMP_ROUND_SS_MASK (a, b, imm8, sae) =>
      _mm_cmp_round_ss_mask(f(a), f(b), f(imm8), f(sae))
    case MM512_SETZERO () =>
      _mm512_setzero()
    case MM_MOVEPI64_MASK (a) =>
      _mm_movepi64_mask(f(a))
    case MM256_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm256_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM256_MASKZ_CVTSEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtsepi64_epi8(f(k), f(a))
    case MM512_UNPACKHI_PD (a, b) =>
      _mm512_unpackhi_pd(f(a), f(b))
    case MM256_CMP_EPU32_MASK (a, b, imm8) =>
      _mm256_cmp_epu32_mask(f(a), f(b), f(imm8))
    case MM_REDUCE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_reduce_round_ss(f(a), f(b), f(imm8), f(rounding))
    case MM256_MASK3_FMSUB_PS (a, b, c, k) =>
      _mm256_mask3_fmsub_ps(f(a), f(b), f(c), f(k))
    case MM_MASKZ_SUB_SS (k, a, b) =>
      _mm_maskz_sub_ss(f(k), f(a), f(b))
    case MM512_MASKZ_PERMUTEVAR_PD (k, a, b) =>
      _mm512_maskz_permutevar_pd(f(k), f(a), f(b))
    case MM_MASKZ_RSQRT28_SS (k, a, b) =>
      _mm_maskz_rsqrt28_ss(f(k), f(a), f(b))
    case MM_MASK_MAX_PS (src, k, a, b) =>
      _mm_mask_max_ps(f(src), f(k), f(a), f(b))
    case MM256_MASK_CVTEPI32_PD (src, k, a) =>
      _mm256_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM512_MAX_EPU16 (a, b) =>
      _mm512_max_epu16(f(a), f(b))
    case MM_MASK_CMPLE_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmple_epu16_mask(f(k1), f(a), f(b))
    case MM_SCALEF_SD (a, b) =>
      _mm_scalef_sd(f(a), f(b))
    case MM512_CVT_ROUNDPS_PD (a, sae) =>
      _mm512_cvt_roundps_pd(f(a), f(sae))
    case MM256_MASK_RORV_EPI64 (src, k, a, b) =>
      _mm256_mask_rorv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm_maskz_min_epu16(f(k), f(a), f(b))
    case MM512_MASKZ_FMSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM512_INSERTI64X2 (a, b, imm8) =>
      _mm512_inserti64x2(f(a), f(b), f(imm8))
    case MM256_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm256_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_OR_EPI64 (src, k, a, b) =>
      _mm_mask_or_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM512_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm512_mask_min_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASK_COMPRESS_PD (src, k, a) =>
      _mm256_mask_compress_pd(f(src), f(k), f(a))
    case MM_CVTSEPI16_EPI8 (a) =>
      _mm_cvtsepi16_epi8(f(a))
    case iDef@MM256_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_SRL_EPI64 (k, a, count) =>
      _mm256_maskz_srl_epi64(f(k), f(a), f(count))
    case MM256_CMPLE_EPU16_MASK (a, b) =>
      _mm256_cmple_epu16_mask(f(a), f(b))
    case MM_MASKZ_CVTSEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtsepi32_epi16(f(k), f(a))
    case MM256_TESTN_EPI64_MASK (a, b) =>
      _mm256_testn_epi64_mask(f(a), f(b))
    case MM512_MASK_CMPGE_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi64_mask(f(k1), f(a), f(b))
    case MM_SCALEF_SS (a, b) =>
      _mm_scalef_ss(f(a), f(b))
    case MM_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm256_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPS_EPI32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epi32(f(k), f(a), f(rounding))
    case MM512_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm512_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM256_MOVEPI32_MASK (a) =>
      _mm256_movepi32_mask(f(a))
    case MM_MASK_SLL_EPI32 (src, k, a, count) =>
      _mm_mask_sll_epi32(f(src), f(k), f(a), f(count))
    case MM_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM512_CVTEPU16_EPI32 (a) =>
      _mm512_cvtepu16_epi32(f(a))
    case MM_MASK_CMPLT_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi32_mask(f(k1), f(a), f(b))
    case MM_MASK_FIXUPIMM_SS (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_ss(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM512_CVT_ROUNDPS_EPI64 (a, rounding) =>
      _mm512_cvt_roundps_epi64(f(a), f(rounding))
    case MM_MASKZ_ROUNDSCALE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_roundscale_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm512_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM_MASKZ_REDUCE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_reduce_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_FMADD_SS (k, a, b, c) =>
      _mm_maskz_fmadd_ss(f(k), f(a), f(b), f(c))
    case MM_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi32(f(a), f(idx), f(k), f(b))
    case MM256_MASK_CVTEPI32_PS (src, k, a) =>
      _mm256_mask_cvtepi32_ps(f(src), f(k), f(a))
    case MM256_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm256_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPU64 (k, a, b) =>
      _mm512_maskz_min_epu64(f(k), f(a), f(b))
    case MM256_CMPNEQ_EPI64_MASK (a, b) =>
      _mm256_cmpneq_epi64_mask(f(a), f(b))
    case iDef@MM512_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm256_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPU64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epu64(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case MM512_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm512_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM256_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm256_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM512_MASKZ_SQRT_PS (k, a) =>
      _mm512_maskz_sqrt_ps(f(k), f(a))
    case MM_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm_multishift_epi64_epi8(f(a), f(b))
    case MM_MIN_ROUND_SS (a, b, sae) =>
      _mm_min_round_ss(f(a), f(b), f(sae))
    case MM256_MASK_FNMADD_PD (a, k, b, c) =>
      _mm256_mask_fnmadd_pd(f(a), f(k), f(b), f(c))
    case MM_MASK_CMPLT_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmplt_epu64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_SET1_EPI8 (k, a) =>
      _mm_maskz_set1_epi8(f(k), f(a))
    case MM512_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm512_maskz_avg_epu16(f(k), f(a), f(b))
    case MM256_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm256_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPU32_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepu32_ps(f(k), f(a), f(rounding))
    case MM_MASK_CVTEPI32_EPI16 (src, k, a) =>
      _mm_mask_cvtepi32_epi16(f(src), f(k), f(a))
    case MM_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM256_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_loadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SQRT_ROUND_PS (a, rounding) =>
      _mm512_sqrt_round_ps(f(a), f(rounding))
    case MM512_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm512_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM512_RSQRT14_PS (a) =>
      _mm512_rsqrt14_ps(f(a))
    case MM_FMADD_ROUND_SD (a, b, c, rounding) =>
      _mm_fmadd_round_sd(f(a), f(b), f(c), f(rounding))
    case MM512_CVTEPU32_EPI64 (a) =>
      _mm512_cvtepu32_epi64(f(a))
    case MM_MASKZ_ROUNDSCALE_ROUND_SS (k, a, b, imm8, rounding) =>
      _mm_maskz_roundscale_round_ss(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_OR_EPI32 (k, a, b) =>
      _mm_maskz_or_epi32(f(k), f(a), f(b))
    case MM256_ROLV_EPI64 (a, b) =>
      _mm256_rolv_epi64(f(a), f(b))
    case MM512_TESTN_EPI64_MASK (a, b) =>
      _mm512_testn_epi64_mask(f(a), f(b))
    case MM256_SRAV_EPI16 (a, count) =>
      _mm256_srav_epi16(f(a), f(count))
    case MM512_KNOT (a) =>
      _mm512_knot(f(a))
    case MM512_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM512_MASK_SCALEF_PS (src, k, a, b) =>
      _mm512_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM256_CVTSEPI16_EPI8 (a) =>
      _mm256_cvtsepi16_epi8(f(a))
    case MM_MASK_CVTEPI32_EPI64 (src, k, a) =>
      _mm_mask_cvtepi32_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm256_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM256_MASKZ_SET1_EPI16 (k, a) =>
      _mm256_maskz_set1_epi16(f(k), f(a))
    case MM512_MASK_SRA_EPI64 (src, k, a, count) =>
      _mm512_mask_sra_epi64(f(src), f(k), f(a), f(count))
    case MM_CVTEPI64_EPI32 (a) =>
      _mm_cvtepi64_epi32(f(a))
    case MM256_MASK_MAX_EPU64 (src, k, a, b) =>
      _mm256_mask_max_epu64(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CVTEPI64_EPI8 (a) =>
      _mm256_cvtepi64_epi8(f(a))
    case MM_MASK_SLL_EPI64 (src, k, a, count) =>
      _mm_mask_sll_epi64(f(src), f(k), f(a), f(count))
    case MM512_CMPGE_EPI8_MASK (a, b) =>
      _mm512_cmpge_epi8_mask(f(a), f(b))
    case MM512_MASK_CVTPD_EPI64 (src, k, a) =>
      _mm512_mask_cvtpd_epi64(f(src), f(k), f(a))
    case MM512_CMPLE_EPU8_MASK (a, b) =>
      _mm512_cmple_epu8_mask(f(a), f(b))
    case MM512_MASK_RCP28_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_rcp28_round_ps(f(src), f(k), f(a), f(rounding))
    case MM_CVTEPI64_PD (a) =>
      _mm_cvtepi64_pd(f(a))
    case MM_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm_maskz_cvtpd_epi64(f(k), f(a))
    case MM_MOVEPI16_MASK (a) =>
      _mm_movepi16_mask(f(a))
    case MM256_CMP_PS_MASK (a, b, imm8) =>
      _mm256_cmp_ps_mask(f(a), f(b), f(imm8))
    case MM512_MASKZ_SQRT_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_sqrt_round_pd(f(k), f(a), f(rounding))
    case MM_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK_CMPLE_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmple_epu16_mask(f(k1), f(a), f(b))
    case MM512_CMPLT_EPI64_MASK (a, b) =>
      _mm512_cmplt_epi64_mask(f(a), f(b))
    case MM256_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm256_maskz_sll_epi16(f(k), f(a), f(count))
    case MM256_MASKZ_CVTSEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtsepi64_epi16(f(k), f(a))
    case MM_MASKZ_FMSUB_SD (k, a, b, c) =>
      _mm_maskz_fmsub_sd(f(k), f(a), f(b), f(c))
    case MM256_MASK_SRA_EPI64 (src, k, a, count) =>
      _mm256_mask_sra_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_FMSUBADD_PS (k, a, b, c) =>
      _mm256_maskz_fmsubadd_ps(f(k), f(a), f(b), f(c))
    case MM_FIXUPIMM_ROUND_SS (a, b, c, imm8, rounding) =>
      _mm_fixupimm_round_ss(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_MASK_MOVE_SS (src, k, a, b) =>
      _mm_mask_move_ss(f(src), f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm512_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case MM256_EXTRACTF32X4_PS (a, imm8) =>
      _mm256_extractf32x4_ps(f(a), f(imm8))
    case MM512_FMSUBADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmsubadd_round_ps(f(a), f(b), f(c), f(rounding))
    case MM256_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm256_fixupimm_pd(f(a), f(b), f(c), f(imm8))

    case Reflect(MM512_MASK_XOR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_XOR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_ROUND_PD (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_ROUND_PD (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PACKS_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PACKS_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI64_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI64_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI64 (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI64 (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BSLLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_BSLLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_PD (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_PD (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI64 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPI32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPI32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDSS_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDSS_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_SS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_SS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PD (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PD (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_ROUND_SS_MASK (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_CMP_ROUND_SS_MASK (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPU32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPU32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEVAR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEVAR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_PD (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_PD (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RORV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RORV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_SS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_SS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPU64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPU64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_ROUND_SS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MIN_ROUND_SS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPU32_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPU32_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_ROUND_SS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROLV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ROLV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KNOT (a), u, es) =>
      reflectMirrored(Reflect(MM512_KNOT (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRA_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRA_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUBADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUBADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_ROUND_SS (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_ROUND_SS (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVE_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVE_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF32X4_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF32X4_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512017 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_XOR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_xor_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i32scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_MIN_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FNMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_RSQRT28_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt28_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtusepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_CVTSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_REDUCE_ROUND_PD(k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_reduce_round_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_PACKS_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_packs_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_GETEXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getexp_pd(${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDEPI64_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_RSQRT14_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt14_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MOV_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_AND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_and_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MAX_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCAST_I32X8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_i32x8(${quote(a)})")
    case iDef@MM512_SET_EPI64(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_epi64(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASK_CMPGT_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SRLI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_BSLLI_EPI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_bslli_epi128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SLLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_ANDNOT_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_andnot_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTEPU8_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_DIV_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_PD(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASK_REDUCE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutex2var_epi64(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_CVTT_ROUNDPS_EPI32(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundps_epi32(${quote(a)}, ${quote(sae)})")
    case iDef@MM_MASK_CVT_ROUNDSS_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvt_roundss_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_BROADCASTSS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTUSEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_FIXUPIMM_SS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASK_XOR_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_xor_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPGE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSD_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_SET1_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_set1_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_ROUNDSCALE_ROUND_PD(k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_roundscale_round_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_CVTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPLE_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMADD_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_SQRT_ROUND_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sqrt_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_BROADCAST_F32X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x2(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMSUB_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_CMP_ROUND_SS_MASK(a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_round_ss_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_SETZERO() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setzero()")
    case iDef@MM_MOVEPI64_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movepi64_mask(${quote(a)})")
    case iDef@MM256_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_CVTSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_UNPACKHI_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMP_EPU32_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epu32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_REDUCE_ROUND_SS(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_reduce_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK3_FMSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASKZ_SUB_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTEVAR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutevar_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RSQRT28_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt28_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MAX_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPLE_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_SCALEF_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_scalef_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVT_ROUNDPS_PD(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundps_pd(${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASK_RORV_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rorv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MIN_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMSUB_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_INSERTI64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_inserti64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_ADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_OR_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_or_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_MIN_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_COMPRESS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi16_epi8(${quote(a)})")
    case iDef@MM256_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MASKZ_SRL_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srl_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_CMPLE_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTSEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_TESTN_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPGE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_SCALEF_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_scalef_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_UNPACKHI_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPS_EPI32(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epi32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMSUBADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MOVEPI32_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movepi32_mask(${quote(a)})")
    case iDef@MM_MASK_SLL_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sll_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CVTEPU16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu16_epi32(${quote(a)})")
    case iDef@MM_MASK_CMPLT_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FIXUPIMM_SS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTPS_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVT_ROUNDPS_EPI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundps_epi64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_ROUNDSCALE_ROUND_SD(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_roundscale_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_REDUCE_ROUND_SD(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_reduce_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMADD_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI32_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MIN_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPNEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_compressstoreu_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_CVTTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTT_ROUNDPD_EPU64(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_CVTEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK3_FMSUBADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASKZ_SRLI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SQRT_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MULTISHIFT_EPI64_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_ROUND_SS(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_round_ss(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASK_FNMADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fnmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_CMPLT_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SET1_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_AVG_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTPS_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPU32_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepu32_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM256_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_loadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_SQRT_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sqrt_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FNMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_RSQRT14_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt14_ps(${quote(a)})")
    case iDef@MM_FMADD_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_CVTEPU32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32_epi64(${quote(a)})")
    case iDef@MM_MASKZ_ROUNDSCALE_ROUND_SS(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_roundscale_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_OR_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_or_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_ROLV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rolv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_TESTN_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRAV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srav_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_KNOT(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_knot(${quote(a)})")
    case iDef@MM512_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_MASK_SCALEF_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsepi16_epi8(${quote(a)})")
    case iDef@MM_MASK_CVTEPI32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_REDUCE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SET1_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SRA_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sra_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_CVTEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi64_epi32(${quote(a)})")
    case iDef@MM256_MASK_MAX_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi64_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_CVTEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi64_epi8(${quote(a)})")
    case iDef@MM_MASK_SLL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sll_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_CMPGE_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpge_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTPD_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPLE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RCP28_ROUND_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp28_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTEPI64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi64_pd(${quote(a)})")
    case iDef@MM_MASKZ_CVTPD_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MOVEPI16_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movepi16_mask(${quote(a)})")
    case iDef@MM256_CMP_PS_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SQRT_ROUND_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sqrt_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FNMSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_CMPLE_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SLL_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_CVTSEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_FMSUB_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_SRA_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sra_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_FMSUBADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmsubadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FIXUPIMM_ROUND_SS(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_MOVE_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_move_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_EXTRACTF32X4_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extractf32x4_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_FMSUBADD_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_FIXUPIMM_PD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
