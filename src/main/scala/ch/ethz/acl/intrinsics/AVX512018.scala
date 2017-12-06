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

    
trait AVX512018 extends IntrinsicsBase {
  /**
   * Broadcast 32-bit integer "a" to all elements of "dst".
   * a: int
   */
  case class MM512_SET1_EPI32(a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper element from "a" to
   * the upper element of "dst".
   * 		[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_DIV_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI32_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_GETEXP_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Set packed 32-bit integers in "dst" with the supplied values in reverse order.
   * e15: int, e14: int, e13: int, e12: int, e11: int, e10: int, e9: int, e8: int, e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM512_SETR_EPI32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m256d, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPU64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory into
   * cache level specified by "hint" using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). "scale"
   * should be 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m512i, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
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
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_MOVEHDUP_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_I64X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_MASK_CMP_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_ABS_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, idx: __m512i, a: __m512d
   */
  case class MM512_MASK_PERMUTEXVAR_PD(src: Exp[__m512d], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512, imm8: const int
   */
  case class MM512_SHUFFLE_F32X4(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_PACKS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write using 32-bit indices. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * 64-bit elements are brought into cache from addresses starting at "base_addr"
   * and offset by each 32-bit element in "vindex" (each index is scaled by the
   * factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Move the lower double-precision (64-bit) floating-point element from "b" to
   * the lower element of "dst" using writemask "k" (the element is copied from
   * "src" when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MOVE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ROLV_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask16, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
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
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_RORV_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASK_MAX_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 256-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m512d, imm8: const int
   */
  case class MM512_PERMUTEX_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_PACKS_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask32, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_CMP_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_RCP14_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADD_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_LZCNT_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_SCALEF_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 16-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m256i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_EPI16[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_SUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m512, k: __mmask16, b: __m512, c: __m512i, imm8: int
   */
  case class MM512_MASK_FIXUPIMM_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI8_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MADD52LO_EPU64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_EPI64[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_MASK_CMP_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_COMPRESS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_FMADDSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_ANDNOT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Cast vector of type __m256i to type __m512i; the upper 256 bits of the result
   * are undefined.
   * 	 This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256i
   */
  case class MM512_CASTSI256_SI512(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the lower single-precision (32-bit) floating-point element from "b" to
   * the lower element of "dst" using zeromask "k" (the element is zeroed out when
   * mask bit 0 is not set), and copy the upper 3 packed elements from "a" to the
   * upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MOVE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_SQRT_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_ABS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASK_FIXUPIMM_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SLL_EPI32(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_SCALEF_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * Zero extend packed unsigned 8-bit integers in the low 8 byte sof "a" to packed
   * 64-bit integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPU8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_UNPACKHI_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m512d
   */
  case class MM512_RCP28_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRAV_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASK_FIXUPIMM_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
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
   * Compare packed 64-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_MASK_CMP_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m128d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_CMP_EPU64_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_XOR_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_MOVEHDUP_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRLI_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_RANGE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASK_GETMANT_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_ANDNOT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_ABS_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_RCP28_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_TERNARYLOGIC_EPI64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_ROUNDSCALE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
      

  def _mm512_set1_epi32(a: Exp[Int]): Exp[__m512i] = {
    MM512_SET1_EPI32(a)
  }
            
  def _mm_div_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_DIV_ROUND_SD(a, b, rounding)
  }
            
  def _mm512_mulhi_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPU16(a, b)
  }
            
  def _mm_movepi32_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI32_MASK(a)
  }
            
  def _mm_mask_getexp_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_GETEXP_SS(src, k, a, b)
  }
            
  def _mm_mask3_fnmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm_maskz_max_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI64(k, a, b)
  }
            
  def _mm256_cvtsepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI32_EPI16(a)
  }
            
  def _mm_cmpgt_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm512_setr_epi32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m512i] = {
    MM512_SETR_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_mask_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpge_epu64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPU64_MASK(a, b)
  }
            
  def _mm512_prefetch_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_PREFETCH_I64GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_fixupimm_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm_mask_min_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_srav_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_min_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU64(k, a, b)
  }
            
  def _mm256_cmpge_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI64_MASK(a, b)
  }
            
  def _mm256_maskz_mul_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MUL_EPI32(k, a, b)
  }
            
  def _mm256_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm256_mask_movehdup_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MOVEHDUP_PS(src, k, a)
  }
            
  def _mm512_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm512_mask_shuffle_i64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_I64X2(src, k, a, b, imm8)
  }
            
  def _mm256_mask_cvttpd_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm256_maskz_broadcastd_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTD_EPI32(k, a)
  }
            
  def _mm256_mask_cmp_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPI32_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cvt_roundps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPI32(src, k, a, rounding)
  }
            
  def _mm256_maskz_abs_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ABS_EPI32(k, a)
  }
            
  def _mm_maskz_max_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU32(k, a, b)
  }
            
  def _mm512_maskz_add_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ADD_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm512_mask_permutexvar_pd(src: Exp[__m512d], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_PERMUTEXVAR_PD(src, k, idx, a)
  }
            
  def _mm512_shuffle_f32x4(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_SHUFFLE_F32X4(a, b, imm8)
  }
            
  def _mm256_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_packs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PACKS_EPI16(src, k, a, b)
  }
            
  def _mm512_prefetch_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I32SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_srav_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRAV_EPI16(a, count)
  }
            
  def _mm_mask_move_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MOVE_SD(src, k, a, b)
  }
            
  def _mm_mask_srai_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI64(src, k, a, imm8)
  }
            
  def _mm_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm_movm_epi32(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI32(k)
  }
            
  def _mm512_maskz_rolv_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ROLV_EPI32(k, a, b)
  }
            
  def _mm256_mask_cmple_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI32_MASK(k1, a, b)
  }
            
  def _mm_mask_permutex2var_epi8(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm256_cmp_pd_mask(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_PD_MASK(a, b, imm8)
  }
            
  def _mm256_mask_expand_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_EXPAND_EPI32(src, k, a)
  }
            
  def _mm256_maskz_conflict_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_CONFLICT_EPI64(k, a)
  }
            
  def _mm_mask_sll_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm512_mask_rorv_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_RORV_EPI32(src, k, a, b)
  }
            
  def _mm_mask_mulhi_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm512_mask_broadcastss_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm256_cmplt_epu32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPU32_MASK(a, b)
  }
            
  def _mm256_maskz_scalef_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm512_maskz_shuffle_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_EPI8(k, a, b)
  }
            
  def _mm_mask_max_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASK_MAX_ROUND_SD(src, k, a, b, sae)
  }
            
  def _mm_cmpneq_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPU32_MASK(a, b)
  }
            
  def _mm512_permutex_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_PERMUTEX_PD(a, imm8)
  }
            
  def _mm_maskz_packs_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PACKS_EPI32(k, a, b)
  }
            
  def _mm_cmplt_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI32_MASK(a, b)
  }
            
  def _mm_maskz_andnot_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ANDNOT_EPI64(k, a, b)
  }
            
  def _mm_maskz_rolv_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ROLV_EPI64(k, a, b)
  }
            
  def _mm512_mask_cmp_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPU16_MASK(k1, a, b, imm8)
  }
            
  def _mm512_cvtps_ph(a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVTPS_PH(a, rounding)
  }
            
  def _mm512_mask_blend_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI8(k, a, b)
  }
            
  def _mm256_mask3_fnmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm256_mask_rcp14_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm_mask_ror_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROR_EPI32(src, k, a, imm8)
  }
            
  def _mm_srai_epi64(a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_SRAI_EPI64(a, imm8)
  }
            
  def _mm512_add_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADD_EPI8(a, b)
  }
            
  def _mm_mask_expandloadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_lzcnt_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_LZCNT_EPI64(k, a)
  }
            
  def _mm512_maskz_cvt_roundepi32_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDEPI32_PS(k, a, rounding)
  }
            
  def _mm512_scalef_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SCALEF_ROUND_PD(a, b, rounding)
  }
            
  def _mm256_mask_loadu_epi16[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cmpge_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm_cmpeq_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPI64_MASK(a, b)
  }
            
  def _mm512_maskz_sub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SUB_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm_mask_cvtsepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm512_maskz_loadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fixupimm_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm512_movepi8_mask(a: Exp[__m512i]): Exp[Long] = {
    MM512_MOVEPI8_MASK(a)
  }
            
  def _mm256_cvtps_epi64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTPS_EPI64(a)
  }
            
  def _mm512_mask_cvt_roundps_ph(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm_maskz_cvtepi16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI16_EPI64(k, a)
  }
            
  def _mm256_madd52lo_epu64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm256_mask_cmplt_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_i64gather_epi64[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(base_addr)(MM512_I64GATHER_EPI64(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_testn_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI16_MASK(a, b)
  }
            
  def _mm_cvtusepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI32_EPI8(a)
  }
            
  def _mm_mask_cmp_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPI32_MASK(k1, a, b, imm8)
  }
            
  def _mm_maskz_load_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_compress_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_COMPRESS_EPI64(src, k, a)
  }
            
  def _mm256_mask_cmple_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPU16_MASK(k1, a, b)
  }
            
  def _mm_cvtusepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI16(a)
  }
            
  def _mm256_maskz_subs_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm512_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_broadcast_f64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASK_BROADCAST_F64X2(src, k, a)
  }
            
  def _mm512_fmaddsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADDSUB_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask_andnot_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm512_mask_inserti64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI64X2(src, k, a, b, imm8)
  }
            
  def _mm512_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask3_fmsubadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm_mask_rolv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ROLV_EPI32(src, k, a, b)
  }
            
  def _mm512_castsi256_si512(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CASTSI256_SI512(a)
  }
            
  def _mm_maskz_move_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOVE_SS(k, a, b)
  }
            
  def _mm512_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm256_mask_cvtepi32_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI32_EPI64(src, k, a)
  }
            
  def _mm512_mask_cvt_roundps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPU32(src, k, a, rounding)
  }
            
  def _mm512_maskz_sqrt_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SQRT_ROUND_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepi64_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTEPI64_EPI8(k, a)
  }
            
  def _mm512_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm_mask_srai_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI16(src, k, a, imm8)
  }
            
  def _mm512_maskz_compress_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm512_mask_subs_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm512_mask_abs_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ABS_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtusepi64_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI16(k, a)
  }
            
  def _mm_mask_load_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtsepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_fixupimm_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FIXUPIMM_ROUND_SD(a, k, b, c, imm8, rounding)
  }
            
  def _mm512_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm512_sll_epi32(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SLL_EPI32(a, count)
  }
            
  def _mm256_mask3_fmaddsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm256_mask_scalef_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm_maskz_getexp_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_PD(k, a)
  }
            
  def _mm_mask_min_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm512_cvtepu8_epi64(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPU8_EPI64(a)
  }
            
  def _mm256_mask3_fmaddsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm_mask3_fnmadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_PS(a, b, c, k)
  }
            
  def _mm256_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm_mask_unpackhi_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_UNPACKHI_PS(src, k, a, b)
  }
            
  def _mm256_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm512_maskz_cvtepu8_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU8_EPI16(k, a)
  }
            
  def _mm_maskz_min_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI32(k, a, b)
  }
            
  def _mm_mask_expand_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_EXPAND_EPI32(src, k, a)
  }
            
  def _mm256_maskz_cvtepi16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI16_EPI64(k, a)
  }
            
  def _mm512_rcp28_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RCP28_PD(a)
  }
            
  def _mm512_maskz_srav_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRAV_EPI32(k, a, count)
  }
            
  def _mm256_maskz_sra_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm_maskz_cvtepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI8(k, a)
  }
            
  def _mm512_mask_fixupimm_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FIXUPIMM_ROUND_PD(a, k, b, c, imm8, rounding)
  }
            
  def _mm256_mask_cvtepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_max_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI16(k, a, b)
  }
            
  def _mm_mask_cvtepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtepu8_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm256_mask_cmp_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPI64_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_loadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm256_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_broadcastb_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm256_cmp_epu64_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPU64_MASK(a, b, imm8)
  }
            
  def _mm512_mask_cvtepu64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm512_unpackhi_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI8(a, b)
  }
            
  def _mm256_mask_subs_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm512_broadcast_i64x4(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_BROADCAST_I64X4(a)
  }
            
  def _mm512_xor_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_XOR_PD(a, b)
  }
            
  def _mm512_maskz_movehdup_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MOVEHDUP_PS(k, a)
  }
            
  def _mm256_fpclass_ps_mask(a: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm256_maskz_cvtepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI32(k, a)
  }
            
  def _mm512_maskz_srli_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_mul_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MUL_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_range_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RANGE_SS(k, a, b, imm8)
  }
            
  def _mm_mask_getmant_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_ROUND_SD(src, k, a, b, interv, sc, rounding)
  }
            
  def _mm512_mask_andnot_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ANDNOT_PS(src, k, a, b)
  }
            
  def _mm256_mask_cvtepi16_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI16_EPI32(src, k, a)
  }
            
  def _mm512_maskz_abs_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ABS_EPI32(k, a)
  }
            
  def _mm_maskz_rcp28_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RCP28_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_mask_cvtepi16_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI32(src, k, a)
  }
            
  def _mm_mask_cvtusepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI32(src, k, a)
  }
            
  def _mm512_maskz_broadcastsd_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCASTSD_PD(k, a)
  }
            
  def _mm512_mask_cmpneq_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm_ternarylogic_epi64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_TERNARYLOGIC_EPI64(a, b, c, imm8)
  }
            
  def _mm_cmpeq_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm_maskz_cvtepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI8(k, a)
  }
            
  def _mm512_mask_roundscale_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm512_mask_extractf64x2_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m128d] = {
    MM512_MASK_EXTRACTF64X2_PD(src, k, a, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_SET1_EPI32 (a) =>
      _mm512_set1_epi32(f(a))
    case MM_DIV_ROUND_SD (a, b, rounding) =>
      _mm_div_round_sd(f(a), f(b), f(rounding))
    case MM512_MULHI_EPU16 (a, b) =>
      _mm512_mulhi_epu16(f(a), f(b))
    case MM_MOVEPI32_MASK (a) =>
      _mm_movepi32_mask(f(a))
    case MM_MASK_GETEXP_SS (src, k, a, b) =>
      _mm_mask_getexp_ss(f(src), f(k), f(a), f(b))
    case MM_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM_MASKZ_MAX_EPI64 (k, a, b) =>
      _mm_maskz_max_epi64(f(k), f(a), f(b))
    case MM256_CVTSEPI32_EPI16 (a) =>
      _mm256_cvtsepi32_epi16(f(a))
    case MM_CMPGT_EPI8_MASK (a, b) =>
      _mm_cmpgt_epi8_mask(f(a), f(b))
    case MM512_SETR_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_epi32(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM256_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPGE_EPU64_MASK (a, b) =>
      _mm256_cmpge_epu64_mask(f(a), f(b))
    case iDef@MM512_PREFETCH_I64GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm256_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case MM_MASK_MIN_EPI32 (src, k, a, b) =>
      _mm_mask_min_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm512_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_MIN_EPU64 (k, a, b) =>
      _mm_maskz_min_epu64(f(k), f(a), f(b))
    case MM256_CMPGE_EPI64_MASK (a, b) =>
      _mm256_cmpge_epi64_mask(f(a), f(b))
    case MM256_MASKZ_MUL_EPI32 (k, a, b) =>
      _mm256_maskz_mul_epi32(f(k), f(a), f(b))
    case MM256_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm256_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case MM256_MASK_MOVEHDUP_PS (src, k, a) =>
      _mm256_mask_movehdup_ps(f(src), f(k), f(a))
    case MM512_MASKZ_RSQRT14_PS (k, a) =>
      _mm512_maskz_rsqrt14_ps(f(k), f(a))
    case MM512_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_i64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm256_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCASTD_EPI32 (k, a) =>
      _mm256_maskz_broadcastd_epi32(f(k), f(a))
    case MM256_MASK_CMP_EPI32_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epi32_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CVT_ROUNDPS_EPI32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epi32(f(src), f(k), f(a), f(rounding))
    case MM256_MASKZ_ABS_EPI32 (k, a) =>
      _mm256_maskz_abs_epi32(f(k), f(a))
    case MM_MASKZ_MAX_EPU32 (k, a, b) =>
      _mm_maskz_max_epu32(f(k), f(a), f(b))
    case MM512_MASKZ_ADD_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_add_round_ps(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_PERMUTEXVAR_PD (src, k, idx, a) =>
      _mm512_mask_permutexvar_pd(f(src), f(k), f(idx), f(a))
    case MM512_SHUFFLE_F32X4 (a, b, imm8) =>
      _mm512_shuffle_f32x4(f(a), f(b), f(imm8))
    case iDef@MM256_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_PACKS_EPI16 (src, k, a, b) =>
      _mm_mask_packs_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM512_PREFETCH_I32SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SRAV_EPI16 (a, count) =>
      _mm512_srav_epi16(f(a), f(count))
    case MM_MASK_MOVE_SD (src, k, a, b) =>
      _mm_mask_move_sd(f(src), f(k), f(a), f(b))
    case MM_MASK_SRAI_EPI64 (src, k, a, imm8) =>
      _mm_mask_srai_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm_maskz_cvtps_epu32(f(k), f(a))
    case MM_MOVM_EPI32 (k) =>
      _mm_movm_epi32(f(k))
    case MM512_MASKZ_ROLV_EPI32 (k, a, b) =>
      _mm512_maskz_rolv_epi32(f(k), f(a), f(b))
    case MM256_MASK_CMPLE_EPI32_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi32_mask(f(k1), f(a), f(b))
    case MM_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM256_CMP_PD_MASK (a, b, imm8) =>
      _mm256_cmp_pd_mask(f(a), f(b), f(imm8))
    case MM256_MASK_EXPAND_EPI32 (src, k, a) =>
      _mm256_mask_expand_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CONFLICT_EPI64 (k, a) =>
      _mm256_maskz_conflict_epi64(f(k), f(a))
    case MM_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASK_RORV_EPI32 (src, k, a, b) =>
      _mm512_mask_rorv_epi32(f(src), f(k), f(a), f(b))
    case MM_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm512_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM256_CMPLT_EPU32_MASK (a, b) =>
      _mm256_cmplt_epu32_mask(f(a), f(b))
    case MM256_MASKZ_SCALEF_PS (k, a, b) =>
      _mm256_maskz_scalef_ps(f(k), f(a), f(b))
    case MM512_MASKZ_SHUFFLE_EPI8 (k, a, b) =>
      _mm512_maskz_shuffle_epi8(f(k), f(a), f(b))
    case MM_MASK_MAX_ROUND_SD (src, k, a, b, sae) =>
      _mm_mask_max_round_sd(f(src), f(k), f(a), f(b), f(sae))
    case MM_CMPNEQ_EPU32_MASK (a, b) =>
      _mm_cmpneq_epu32_mask(f(a), f(b))
    case MM512_PERMUTEX_PD (a, imm8) =>
      _mm512_permutex_pd(f(a), f(imm8))
    case MM_MASKZ_PACKS_EPI32 (k, a, b) =>
      _mm_maskz_packs_epi32(f(k), f(a), f(b))
    case MM_CMPLT_EPI32_MASK (a, b) =>
      _mm_cmplt_epi32_mask(f(a), f(b))
    case MM_MASKZ_ANDNOT_EPI64 (k, a, b) =>
      _mm_maskz_andnot_epi64(f(k), f(a), f(b))
    case MM_MASKZ_ROLV_EPI64 (k, a, b) =>
      _mm_maskz_rolv_epi64(f(k), f(a), f(b))
    case MM512_MASK_CMP_EPU16_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epu16_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_CVTPS_PH (a, rounding) =>
      _mm512_cvtps_ph(f(a), f(rounding))
    case MM512_MASK_BLEND_EPI8 (k, a, b) =>
      _mm512_mask_blend_epi8(f(k), f(a), f(b))
    case MM256_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm256_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_RCP14_PS (src, k, a) =>
      _mm256_mask_rcp14_ps(f(src), f(k), f(a))
    case MM_MASK_ROR_EPI32 (src, k, a, imm8) =>
      _mm_mask_ror_epi32(f(src), f(k), f(a), f(imm8))
    case MM_SRAI_EPI64 (a, imm8) =>
      _mm_srai_epi64(f(a), f(imm8))
    case MM512_ADD_EPI8 (a, b) =>
      _mm512_add_epi8(f(a), f(b))
    case iDef@MM_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_LZCNT_EPI64 (k, a) =>
      _mm256_maskz_lzcnt_epi64(f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPI32_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi32_ps(f(k), f(a), f(rounding))
    case MM512_SCALEF_ROUND_PD (a, b, rounding) =>
      _mm512_scalef_round_pd(f(a), f(b), f(rounding))
    case iDef@MM256_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_epi16(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM_CMPEQ_EPI64_MASK (a, b) =>
      _mm_cmpeq_epi64_mask(f(a), f(b))
    case MM512_MASKZ_SUB_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_sub_round_pd(f(k), f(a), f(b), f(rounding))
    case MM_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case iDef@MM512_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm512_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case MM512_MOVEPI8_MASK (a) =>
      _mm512_movepi8_mask(f(a))
    case MM256_CVTPS_EPI64 (a) =>
      _mm256_cvtps_epi64(f(a))
    case MM512_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM_MASKZ_CVTEPI16_EPI64 (k, a) =>
      _mm_maskz_cvtepi16_epi64(f(k), f(a))
    case MM256_MADD52LO_EPU64 (a, b, c) =>
      _mm256_madd52lo_epu64(f(a), f(b), f(c))
    case MM256_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case iDef@MM512_I64GATHER_EPI64 (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_epi64(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_TESTN_EPI16_MASK (a, b) =>
      _mm_testn_epi16_mask(f(a), f(b))
    case MM_CVTUSEPI32_EPI8 (a) =>
      _mm_cvtusepi32_epi8(f(a))
    case MM_MASK_CMP_EPI32_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epi32_mask(f(k1), f(a), f(b), f(imm8))
    case iDef@MM_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_COMPRESS_EPI64 (src, k, a) =>
      _mm512_mask_compress_epi64(f(src), f(k), f(a))
    case MM256_MASK_CMPLE_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmple_epu16_mask(f(k1), f(a), f(b))
    case MM_CVTUSEPI64_EPI16 (a) =>
      _mm_cvtusepi64_epi16(f(a))
    case MM256_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm256_maskz_subs_epu8(f(k), f(a), f(b))
    case iDef@MM512_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_BROADCAST_F64X2 (src, k, a) =>
      _mm512_mask_broadcast_f64x2(f(src), f(k), f(a))
    case MM512_FMADDSUB_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmaddsub_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm512_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_INSERTI64X2 (src, k, a, b, imm8) =>
      _mm512_mask_inserti64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_ROLV_EPI32 (src, k, a, b) =>
      _mm_mask_rolv_epi32(f(src), f(k), f(a), f(b))
    case MM512_CASTSI256_SI512 (a) =>
      _mm512_castsi256_si512(f(a))
    case MM_MASKZ_MOVE_SS (k, a, b) =>
      _mm_maskz_move_ss(f(k), f(a), f(b))
    case MM512_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm512_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case MM256_MASK_CVTEPI32_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi32_epi64(f(src), f(k), f(a))
    case MM512_MASK_CVT_ROUNDPS_EPU32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epu32(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_SQRT_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_sqrt_round_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPI64_EPI8 (k, a) =>
      _mm512_maskz_cvtepi64_epi8(f(k), f(a))
    case MM512_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm512_maskz_cvtpd_epu32(f(k), f(a))
    case MM_MASK_SRAI_EPI16 (src, k, a, imm8) =>
      _mm_mask_srai_epi16(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_COMPRESS_PS (k, a) =>
      _mm512_maskz_compress_ps(f(k), f(a))
    case MM512_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm512_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASK_ABS_EPI32 (src, k, a) =>
      _mm512_mask_abs_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTUSEPI64_EPI16 (k, a) =>
      _mm_maskz_cvtusepi64_epi16(f(k), f(a))
    case iDef@MM_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CVTSEPI32_EPI8 (src, k, a) =>
      _mm_mask_cvtsepi32_epi8(f(src), f(k), f(a))
    case MM_MASK_FIXUPIMM_ROUND_SD (a, k, b, c, imm8, rounding) =>
      _mm_mask_fixupimm_round_sd(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm512_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case MM512_SLL_EPI32 (a, count) =>
      _mm512_sll_epi32(f(a), f(count))
    case MM256_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm256_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM256_MASK_SCALEF_PS (src, k, a, b) =>
      _mm256_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_GETEXP_PD (k, a) =>
      _mm_maskz_getexp_pd(f(k), f(a))
    case MM_MASK_MIN_PS (src, k, a, b) =>
      _mm_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM512_CVTEPU8_EPI64 (a) =>
      _mm512_cvtepu8_epi64(f(a))
    case MM256_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm256_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM_MASK3_FNMADD_PS (a, b, c, k) =>
      _mm_mask3_fnmadd_ps(f(a), f(b), f(c), f(k))
    case MM256_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm256_maskz_cvtpd_epi32(f(k), f(a))
    case MM_MASK_UNPACKHI_PS (src, k, a, b) =>
      _mm_mask_unpackhi_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SQRT_PS (k, a) =>
      _mm256_maskz_sqrt_ps(f(k), f(a))
    case MM512_MASKZ_CVTEPU8_EPI16 (k, a) =>
      _mm512_maskz_cvtepu8_epi16(f(k), f(a))
    case MM_MASKZ_MIN_EPI32 (k, a, b) =>
      _mm_maskz_min_epi32(f(k), f(a), f(b))
    case MM_MASK_EXPAND_EPI32 (src, k, a) =>
      _mm_mask_expand_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTEPI16_EPI64 (k, a) =>
      _mm256_maskz_cvtepi16_epi64(f(k), f(a))
    case MM512_RCP28_PD (a) =>
      _mm512_rcp28_pd(f(a))
    case MM512_MASKZ_SRAV_EPI32 (k, a, count) =>
      _mm512_maskz_srav_epi32(f(k), f(a), f(count))
    case MM256_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm256_maskz_sra_epi16(f(k), f(a), f(count))
    case MM_MASKZ_CVTEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtepi64_epi8(f(k), f(a))
    case MM512_MASK_FIXUPIMM_ROUND_PD (a, k, b, c, imm8, rounding) =>
      _mm512_mask_fixupimm_round_pd(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MAX_EPI16 (k, a, b) =>
      _mm256_maskz_max_epi16(f(k), f(a), f(b))
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm512_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM256_MASK_CMP_EPI64_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epi64_mask(f(k1), f(a), f(b), f(imm8))
    case iDef@MM_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPU64_PS (k, a) =>
      _mm_maskz_cvtepu64_ps(f(k), f(a))
    case iDef@MM256_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm512_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM256_CMP_EPU64_MASK (a, b, imm8) =>
      _mm256_cmp_epu64_mask(f(a), f(b), f(imm8))
    case MM512_MASK_CVTEPU64_PS (src, k, a) =>
      _mm512_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM512_UNPACKHI_EPI8 (a, b) =>
      _mm512_unpackhi_epi8(f(a), f(b))
    case MM256_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm256_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM512_BROADCAST_I64X4 (a) =>
      _mm512_broadcast_i64x4(f(a))
    case MM512_XOR_PD (a, b) =>
      _mm512_xor_pd(f(a), f(b))
    case MM512_MASKZ_MOVEHDUP_PS (k, a) =>
      _mm512_maskz_movehdup_ps(f(k), f(a))
    case MM256_FPCLASS_PS_MASK (a, imm8) =>
      _mm256_fpclass_ps_mask(f(a), f(imm8))
    case MM256_MASKZ_CVTEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtepi64_epi32(f(k), f(a))
    case MM512_MASKZ_SRLI_EPI64 (k, a, imm8) =>
      _mm512_maskz_srli_epi64(f(k), f(a), f(imm8))
    case MM_MASK_MUL_EPI32 (src, k, a, b) =>
      _mm_mask_mul_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RANGE_SS (k, a, b, imm8) =>
      _mm_maskz_range_ss(f(k), f(a), f(b), f(imm8))
    case MM_MASK_GETMANT_ROUND_SD (src, k, a, b, interv, sc, rounding) =>
      _mm_mask_getmant_round_sd(f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM512_MASK_ANDNOT_PS (src, k, a, b) =>
      _mm512_mask_andnot_ps(f(src), f(k), f(a), f(b))
    case MM256_MASK_CVTEPI16_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi16_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_ABS_EPI32 (k, a) =>
      _mm512_maskz_abs_epi32(f(k), f(a))
    case MM_MASKZ_RCP28_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_rcp28_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASK_CVTEPI16_EPI32 (src, k, a) =>
      _mm_mask_cvtepi16_epi32(f(src), f(k), f(a))
    case MM_MASK_CVTUSEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtusepi64_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_BROADCASTSD_PD (k, a) =>
      _mm512_maskz_broadcastsd_pd(f(k), f(a))
    case MM512_MASK_CMPNEQ_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epu16_mask(f(k1), f(a), f(b))
    case MM_TERNARYLOGIC_EPI64 (a, b, c, imm8) =>
      _mm_ternarylogic_epi64(f(a), f(b), f(c), f(imm8))
    case MM_CMPEQ_EPI8_MASK (a, b) =>
      _mm_cmpeq_epi8_mask(f(a), f(b))
    case MM_MASKZ_CVTEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtepi32_epi8(f(k), f(a))
    case MM512_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm512_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_EXTRACTF64X2_PD (src, k, a, imm8) =>
      _mm512_mask_extractf64x2_pd(f(src), f(k), f(a), f(imm8))

    case Reflect(MM512_SET1_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_DIV_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_EPI32 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOVEHDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOVEHDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_I64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPI32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPI32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPI32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPI32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ABS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ABS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_PD (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_PD (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_F32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_F32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PACKS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PACKS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I32SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVE_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVE_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROLV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROLV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_PD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_PD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CONFLICT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CONFLICT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RORV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RORV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_ROUND_SD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_ROUND_SD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PACKS_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PACKS_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROLV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROLV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPU16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPU16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROR_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROR_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_SRAI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_LZCNT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LZCNT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI32_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI32_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_EPI16 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_EPI64 (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_EPI64 (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPI32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPI32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROLV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROLV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI256_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI256_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVE_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVE_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPU32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPU32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ABS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ABS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_ROUND_SD (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_ROUND_SD (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_ROUND_PD (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_ROUND_PD (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPI64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPI64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPU64_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPU64_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I64X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I64X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_XOR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_XOR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOVEHDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOVEHDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_ROUND_SD (src, k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_ROUND_SD (f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ANDNOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ANDNOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ABS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ABS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTSD_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTSD_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TERNARYLOGIC_EPI64 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_TERNARYLOGIC_EPI64 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF64X2_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF64X2_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512018 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_SET1_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_epi32(${quote(a)})")
    case iDef@MM_DIV_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MULHI_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhi_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEPI32_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movepi32_mask(${quote(a)})")
    case iDef@MM_MASK_GETEXP_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASKZ_MAX_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsepi32_epi16(${quote(a)})")
    case iDef@MM_CMPGT_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_SETR_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr_epi32(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_CMPGE_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PREFETCH_I64GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i64gather_pd(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)}, ${quote(hint)});")
    case iDef@MM256_FIXUPIMM_PS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_MIN_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SRAV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_MIN_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MUL_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mul_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MOVEHDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_movehdup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_RSQRT14_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SHUFFLE_I64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTTPD_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_BROADCASTD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMP_EPI32_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_EPI32(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_ABS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_abs_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MAX_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ADD_ROUND_PS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_PERMUTEXVAR_PD(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_pd(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_SHUFFLE_F32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_f32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASK_PACKS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_packs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PREFETCH_I32SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_SRAV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srav_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_MOVE_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_move_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRAI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srai_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MOVM_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movm_epi32(${quote(k)})")
    case iDef@MM512_MASKZ_ROLV_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rolv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLE_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_CMP_PD_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_EXPAND_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expand_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CONFLICT_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_conflict_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SLL_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_RORV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rorv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MULHI_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_BROADCASTSS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLT_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SCALEF_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SHUFFLE_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_ROUND_SD(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_CMPNEQ_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTEX_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_PACKS_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_packs_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLT_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ANDNOT_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_andnot_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ROLV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rolv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMP_EPU16_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTPS_PH(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtps_ph(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_BLEND_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_blend_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK3_FNMADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASK_RCP14_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ROR_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_ror_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_SRAI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srai_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_ADD_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expandloadu_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_LZCNT_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_lzcnt_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPI32_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi32_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_SCALEF_ROUND_PD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scalef_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_epi16(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_store_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SUB_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MOVEPI8_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movepi8_mask(${quote(a)})")
    case iDef@MM256_CVTPS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_epi64(${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_CVTEPI16_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi16_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MADD52LO_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64GATHER_EPI64(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_epi64(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_TESTN_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testn_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTUSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi32_epi8(${quote(a)})")
    case iDef@MM_MASK_CMP_EPI32_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_COMPRESS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_compress_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMPLE_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTUSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi64_epi16(${quote(a)})")
    case iDef@MM256_MASKZ_SUBS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_BROADCAST_F64X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_FMADDSUB_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ANDNOT_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_INSERTI64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_inserti64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FMSUBADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_ROLV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rolv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTSI256_SI512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castsi256_si512(${quote(a)})")
    case iDef@MM_MASKZ_MOVE_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_move_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MULHRS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_EPU32(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_SQRT_ROUND_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sqrt_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CVTEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SRAI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srai_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_COMPRESS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SUBS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ABS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_abs_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTUSEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_CVTSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtsepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FIXUPIMM_ROUND_SD(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_SLL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sll_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK3_FMADDSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASK_SCALEF_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_GETEXP_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getexp_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPU8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu8_epi64(${quote(a)})")
    case iDef@MM256_MASK3_FMADDSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK3_FNMADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASKZ_CVTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_UNPACKHI_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SQRT_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU8_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu8_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MIN_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_EXPAND_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expand_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTEPI16_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi16_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_RCP28_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp28_pd(${quote(a)})")
    case iDef@MM512_MASKZ_SRAV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srav_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_SRA_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_CVTEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_FIXUPIMM_ROUND_PD(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_MAX_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_CVTEPU8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMP_EPI64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_CVTEPU64_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_I32SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i32scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_BROADCASTB_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMP_EPU64_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epu64_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTEPU64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_UNPACKHI_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SUBS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCAST_I64X4(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_i64x4(${quote(a)})")
    case iDef@MM512_XOR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_xor_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOVEHDUP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_movehdup_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_FPCLASS_PS_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_CVTEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SRLI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MUL_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RANGE_SS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_range_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_GETMANT_ROUND_SD(src, k, a, b, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ANDNOT_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_andnot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_ABS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_abs_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_RCP28_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp28_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTEPI16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTUSEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_BROADCASTSD_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcastsd_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPNEQ_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TERNARYLOGIC_EPI64(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ternarylogic_epi64(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_CMPEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTF64X2_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extractf64x2_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
