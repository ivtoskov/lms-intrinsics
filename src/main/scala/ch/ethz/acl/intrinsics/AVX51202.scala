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

    
trait AVX51202 extends IntrinsicsBase {
  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 32-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
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
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * [round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASK_FMADDSUB_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_I32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_REDUCE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI8(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". The maximum relative error for this approximation is less
   * than 2^-28.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RSQRT28_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_EXPAND_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_ROUNDSCALE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m256, b: __m128, imm8: int
   */
  case class MM256_INSERTF32X4(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 16-bits from input mask "k" to all 32-bit elements of "dst".
   * k: __mmask16
   */
  case class MM512_BROADCASTMW_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_CVTEPU32_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst", and copy the
   * upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_SQRT_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MUL_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXPAND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPU64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i
   */
  case class MM512_MASK_ABS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * src: __m128d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASK_INSERTI32X8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
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
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_SCALEF_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper 3 packed elements from "a"
   * to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_DIV_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_BLEND_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the repeated 4 element sequence in
   * reverse order.
   * d: int, c: int, b: int, a: int
   */
  case class MM512_SETR4_EPI32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_SHUFFLE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * k: __mmask16, a: __m512, imm8: const int
   */
  case class MM512_MASKZ_PERMUTE_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_EXPAND_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_MOVELDUP_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_DIV_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FMSUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_EXP2A23_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512
   */
  case class MM512_UNPACKHI_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SRAV_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_ABS_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_RSQRT14_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_MOVEHDUP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMSUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SCALEF_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTSEPI32_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_LZCNT_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI32(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUB_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m512d
   */
  case class MM512_RCP14_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, b: __m256i, c: __m256i
   */
  case class MM256_MASK_MADD52HI_EPU64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Zero extend packed unsigned 8-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_CVTEPU8_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence.
   * d: double, c: double, b: double, a: double
   */
  case class MM512_SET4_PD(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_FIXUPIMM_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRLI_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASKZ_MIN_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * a: __m512
   */
  case class MM512_RSQRT28_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_REDUCE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MIN_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PACKUS_EPI16(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst". 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512, sae: int
   */
  case class MM512_CVTT_ROUNDPS_EPU32(a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_BLEND_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed unsigned 64-bit integers in "a" to packed 16-bit integers with
   * unsigned saturation, and store the active results (those with their respective
   * bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTUSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
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
   * Move packed 8-bit integers from "a" into "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i
   */
  case class MM_MASK_MOV_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_AND_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m256i, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRL_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PACKUS_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_I32X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI32_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512i
   */
  case class MM512_MASK_PERMUTEVAR_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_RCP28_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_GETEXP_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all all elements of
   * "dst".
   * a: short
   */
  case class MM512_SET1_EPI16(a: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM512_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 64-bit granularity (64-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
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
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, idx: __m512i, b: __m512
   */
  case class MM512_MASKZ_PERMUTEX2VAR_PS(k: Exp[Int], a: Exp[__m512], idx: Exp[__m512i], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m256d
   */
  case class MM256_RCP14_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache.
   * "scale" should be 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0)
   * for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m256i, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Load a single-precision (32-bit) floating-point element from memory into the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and set the upper elements of "dst" to zero.
   * "mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128, k: __mmask8, mem_addr: const float*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_SS[A[_], U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_mask_sub_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_permutex2var_ps(k: Exp[Int], a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b)
  }
            
  def _mm256_cmpneq_epu32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPU32_MASK(a, b)
  }
            
  def _mm_cmple_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm512_cmple_epu64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPU64_MASK(a, b)
  }
            
  def _mm512_maskz_cvt_roundph_ps(k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDPH_PS(k, a, sae)
  }
            
  def _mm_mask_multishift_epi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm_cvtsepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI32_EPI16(a)
  }
            
  def _mm256_maskz_set1_epi8(k: Exp[Int], a: Exp[Byte]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm512_mask_cmpge_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_fmaddsub_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMADDSUB_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm_mullo_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULLO_EPI64(a, b)
  }
            
  def _mm_cvtt_roundsd_i32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSD_I32(a, rounding)
  }
            
  def _mm_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm_cvtepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI32_EPI16(a)
  }
            
  def _mm512_mask_cvtepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_reduce_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  def _mm256_permutexvar_epi8(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm_mask_rsqrt28_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT28_SS(src, k, a, b)
  }
            
  def _mm256_mask_broadcastsd_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASK_BROADCASTSD_PD(src, k, a)
  }
            
  def _mm_mask_expand_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_EXPAND_EPI64(src, k, a)
  }
            
  def _mm256_maskz_adds_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm_maskz_mulhi_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHI_EPI16(k, a, b)
  }
            
  def _mm512_mask_roundscale_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDSCALE_ROUND_PD(src, k, a, imm8, rounding)
  }
            
  def _mm512_bsrli_epi128(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_BSRLI_EPI128(a, imm8)
  }
            
  def _mm256_insertf32x4(a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_INSERTF32X4(a, b, imm8)
  }
            
  def _mm512_broadcastmw_epi32(k: Exp[Int]): Exp[__m512i] = {
    MM512_BROADCASTMW_EPI32(k)
  }
            
  def _mm512_mask_cvtepu32_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPU32_EPI64(src, k, a)
  }
            
  def _mm_sqrt_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_SQRT_ROUND_SD(a, b, rounding)
  }
            
  def _mm512_mask_mul_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MUL_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_expand_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm_maskz_or_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_OR_EPI64(k, a, b)
  }
            
  def _mm512_subs_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPU8(a, b)
  }
            
  def _mm_maskz_cvtepi8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI32(k, a)
  }
            
  def _mm256_cmpneq_epu64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPU64_MASK(a, b)
  }
            
  def _mm512_mask_abs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ABS_EPI16(src, k, a)
  }
            
  def _mm_cvtsepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI8(a)
  }
            
  def _mm_mask_load_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtps_epu32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTPS_EPU32(a)
  }
            
  def _mm512_mask_inserti32x8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI32X8(src, k, a, b, imm8)
  }
            
  def _mm512_mask_cvttps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm256_mask_rol_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROL_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm_maskz_scalef_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_div_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_DIV_SS(k, a, b)
  }
            
  def _mm512_cvt_roundpd_epi64(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPD_EPI64(a, rounding)
  }
            
  def _mm256_mask_blend_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_BLEND_PD(k, a, b)
  }
            
  def _mm512_setr4_epi32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_SETR4_EPI32(d, c, b, a)
  }
            
  def _mm_mask_shuffle_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_permute_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_PERMUTE_PS(k, a, imm8)
  }
            
  def _mm_mask_srav_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI64(src, k, a, count)
  }
            
  def _mm_maskz_expand_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_EXPAND_EPI64(k, a)
  }
            
  def _mm256_maskz_cvtepi32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI32_EPI64(k, a)
  }
            
  def _mm256_sra_epi64(a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_SRA_EPI64(a, count)
  }
            
  def _mm256_cmplt_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPU16_MASK(a, b)
  }
            
  def _mm_cmpgt_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPU32_MASK(a, b)
  }
            
  def _mm_mask_cvtepu64_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm256_mask_cvtusepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI32_EPI16(src, k, a)
  }
            
  def _mm256_cmple_epu32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPU32_MASK(a, b)
  }
            
  def _mm256_rolv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_ROLV_EPI32(a, b)
  }
            
  def _mm256_mask_storeu_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_add_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ADD_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm256_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm256_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_moveldup_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOVELDUP_PS(k, a)
  }
            
  def _mm256_mask_cvtepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm_maskz_div_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_DIV_SD(k, a, b)
  }
            
  def _mm_testn_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI32_MASK(a, b)
  }
            
  def _mm_maskz_fmsub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm256_cvttps_epi64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTTPS_EPI64(a)
  }
            
  def _mm_mask3_fmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_PD(a, b, c, k)
  }
            
  def _mm512_exp2a23_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_EXP2A23_ROUND_PD(a, rounding)
  }
            
  def _mm512_maskz_adds_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm256_maskz_cvtusepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI32(k, a)
  }
            
  def _mm256_mask_permute_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_PERMUTE_PS(src, k, a, imm8)
  }
            
  def _mm256_mask_sub_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_unpackhi_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_UNPACKHI_PS(a, b)
  }
            
  def _mm512_mask_srav_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRAV_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_srlv_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI32(k, a, count)
  }
            
  def _mm_maskz_cvtusepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI32_EPI16(k, a)
  }
            
  def _mm_cmp_ss_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_SS_MASK(a, b, imm8)
  }
            
  def _mm_cmpgt_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_abs_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ABS_EPI64(src, k, a)
  }
            
  def _mm256_mask_broadcastd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTD_EPI32(src, k, a)
  }
            
  def _mm_mask_rsqrt14_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm512_mask_movehdup_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOVEHDUP_PS(src, k, a)
  }
            
  def _mm_maskz_fnmsub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_SS(k, a, b, c)
  }
            
  def _mm_scalef_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SCALEF_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_cvtsepi32_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTSEPI32_EPI8(a)
  }
            
  def _mm512_mask_lzcnt_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_LZCNT_EPI64(src, k, a)
  }
            
  def _mm512_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_permutexvar_epi32(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI32(k, idx, a)
  }
            
  def _mm_mask_cmpeq_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_broadcast_f32x4(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCAST_F32X4(k, a)
  }
            
  def _mm512_mask_cmpgt_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_slli_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SLLI_EPI64(src, k, a, imm8)
  }
            
  def _mm_mask_fmsub_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUB_PD(a, k, b, c)
  }
            
  def _mm512_rcp14_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RCP14_PD(a)
  }
            
  def _mm256_mask_madd52hi_epu64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm_maskz_set1_epi32(k: Exp[Int], a: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI32(k, a)
  }
            
  def _mm512_mask_broadcast_i32x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X4(src, k, a)
  }
            
  def _mm512_mask_cvtt_roundpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVTT_ROUNDPD_EPI32(src, k, a, sae)
  }
            
  def _mm256_mmask_i32gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_unpackhi_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_xor_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm_mask_cmp_round_ss_mask(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_ROUND_SS_MASK(k1, a, b, imm8, sae)
  }
            
  def _mm_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm512_mask_cvt_roundepu32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDEPU32_PS(src, k, a, rounding)
  }
            
  def _mm_maskz_min_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm_cvt_roundsd_ss(a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSD_SS(a, b, rounding)
  }
            
  def _mm512_mask_cvtepu8_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_CVTEPU8_EPI32(src, k, a)
  }
            
  def _mm_maskz_rol_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROL_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_cvtsepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm_mask_cmpneq_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvt_roundps_epu32(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPU32(k, a, rounding)
  }
            
  def _mm256_maskz_extractf64x2_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_MASKZ_EXTRACTF64X2_PD(k, a, imm8)
  }
            
  def _mm512_cvt_roundps_epu32(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPU32(a, rounding)
  }
            
  def _mm512_set4_pd(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]): Exp[__m512d] = {
    MM512_SET4_PD(d, c, b, a)
  }
            
  def _mm512_fixupimm_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FIXUPIMM_ROUND_PS(a, b, c, imm8, rounding)
  }
            
  def _mm512_maskz_srli_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRLI_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_permute_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_PERMUTE_PD(src, k, a, imm8)
  }
            
  def _mm_maskz_min_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_MIN_ROUND_SD(k, a, b, sae)
  }
            
  def _mm256_maskz_max_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI8(k, a, b)
  }
            
  def _mm512_rsqrt28_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT28_PS(a)
  }
            
  def _mm512_mask_reduce_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  def _mm512_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm512_min_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MIN_PS(a, b)
  }
            
  def _mm512_maskz_packus_epi16(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PACKUS_EPI16(k, a, b)
  }
            
  def _mm512_cvtt_roundps_epu32(a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPU32(a, sae)
  }
            
  def _mm_mask_blend_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_BLEND_PD(k, a, b)
  }
            
  def _mm512_maskz_cvtt_roundps_epu64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPU64(k, a, sae)
  }
            
  def _mm512_mask_cvtusepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_permutexvar_epi16(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm_mask_cvttpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm_mask_mov_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MOV_EPI8(src, k, a)
  }
            
  def _mm512_maskz_and_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AND_EPI32(k, a, b)
  }
            
  def _mm256_mask_cmpeq_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_cvtepu32_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm512_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_srl_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRL_EPI64(src, k, a, count)
  }
            
  def _mm512_maskz_packus_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PACKUS_EPI32(k, a, b)
  }
            
  def _mm512_maskz_shuffle_i32x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_I32X4(k, a, b, imm8)
  }
            
  def _mm512_cvtepi32_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTEPI32_EPI8(a)
  }
            
  def _mm_mask_cmpeq_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_mask_permutexvar_epi64(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI64(src, k, idx, a)
  }
            
  def _mm512_maskz_subs_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm512_mask_permutevar_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_PERMUTEVAR_PD(src, k, a, b)
  }
            
  def _mm256_mask_cmpeq_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_rcp28_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RCP28_ROUND_PD(a, rounding)
  }
            
  def _mm_mask_cvtepi8_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI32(src, k, a)
  }
            
  def _mm_mask_getexp_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETEXP_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm512_set1_epi16(a: Exp[Short]): Exp[__m512i] = {
    MM512_SET1_EPI16(a)
  }
            
  def _mm512_movm_epi64(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI64(k)
  }
            
  def _mm512_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm256_maskz_sllv_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI16(k, a, count)
  }
            
  def _mm512_maskz_permutex2var_ps(k: Exp[Int], a: Exp[__m512], idx: Exp[__m512i], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b)
  }
            
  def _mm256_cmplt_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPI32_MASK(a, b)
  }
            
  def _mm256_rcp14_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_RCP14_PD(a)
  }
            
  def _mm_mask_compress_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm_mask_test_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI32_MASK(k1, a, b)
  }
            
  def _mm_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm512_prefetch_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_PREFETCH_I32GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvttps_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPU64(src, k, a)
  }
            
  def _mm_maskz_cvtsepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI64_EPI8(k, a)
  }
            
  def _mm256_mask_broadcast_i32x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm256_mask_test_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm_rol_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROL_EPI32(a, imm8)
  }
            
  def _mm512_mask_avg_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm_cmpneq_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_andnot_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ANDNOT_EPI32(src, k, a, b)
  }
            
  def _mm_mask_load_ss[A[_], U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_LOAD_SS(src, k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b) =>
      _mm_maskz_permutex2var_ps(f(k), f(a), f(idx), f(b))
    case MM256_CMPNEQ_EPU32_MASK (a, b) =>
      _mm256_cmpneq_epu32_mask(f(a), f(b))
    case MM_CMPLE_EPI16_MASK (a, b) =>
      _mm_cmple_epi16_mask(f(a), f(b))
    case MM512_CMPLE_EPU64_MASK (a, b) =>
      _mm512_cmple_epu64_mask(f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPH_PS (k, a, sae) =>
      _mm512_maskz_cvt_roundph_ps(f(k), f(a), f(sae))
    case MM_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM_CVTSEPI32_EPI16 (a) =>
      _mm_cvtsepi32_epi16(f(a))
    case MM256_MASKZ_SET1_EPI8 (k, a) =>
      _mm256_maskz_set1_epi8(f(k), f(a))
    case MM512_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_FMADDSUB_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmaddsub_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MULLO_EPI64 (a, b) =>
      _mm_mullo_epi64(f(a), f(b))
    case MM_CVTT_ROUNDSD_I32 (a, rounding) =>
      _mm_cvtt_roundsd_i32(f(a), f(rounding))
    case MM_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm_maskz_broadcastw_epi16(f(k), f(a))
    case MM_CVTEPI32_EPI16 (a) =>
      _mm_cvtepi32_epi16(f(a))
    case MM512_MASK_CVTEPI32_EPI8 (src, k, a) =>
      _mm512_mask_cvtepi32_epi8(f(src), f(k), f(a))
    case MM_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm_mask_reduce_pd(f(src), f(k), f(a), f(imm8))
    case MM256_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm256_permutexvar_epi8(f(idx), f(a))
    case MM_MASK_RSQRT28_SS (src, k, a, b) =>
      _mm_mask_rsqrt28_ss(f(src), f(k), f(a), f(b))
    case MM256_MASK_BROADCASTSD_PD (src, k, a) =>
      _mm256_mask_broadcastsd_pd(f(src), f(k), f(a))
    case MM_MASK_EXPAND_EPI64 (src, k, a) =>
      _mm_mask_expand_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm256_maskz_adds_epi16(f(k), f(a), f(b))
    case MM_MASKZ_MULHI_EPI16 (k, a, b) =>
      _mm_maskz_mulhi_epi16(f(k), f(a), f(b))
    case MM512_MASK_ROUNDSCALE_ROUND_PD (src, k, a, imm8, rounding) =>
      _mm512_mask_roundscale_round_pd(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_BSRLI_EPI128 (a, imm8) =>
      _mm512_bsrli_epi128(f(a), f(imm8))
    case MM256_INSERTF32X4 (a, b, imm8) =>
      _mm256_insertf32x4(f(a), f(b), f(imm8))
    case MM512_BROADCASTMW_EPI32 (k) =>
      _mm512_broadcastmw_epi32(f(k))
    case MM512_MASK_CVTEPU32_EPI64 (src, k, a) =>
      _mm512_mask_cvtepu32_epi64(f(src), f(k), f(a))
    case MM_SQRT_ROUND_SD (a, b, rounding) =>
      _mm_sqrt_round_sd(f(a), f(b), f(rounding))
    case MM512_MASK_MUL_EPI32 (src, k, a, b) =>
      _mm512_mask_mul_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_EXPAND_PS (src, k, a) =>
      _mm512_mask_expand_ps(f(src), f(k), f(a))
    case MM_MASKZ_OR_EPI64 (k, a, b) =>
      _mm_maskz_or_epi64(f(k), f(a), f(b))
    case MM512_SUBS_EPU8 (a, b) =>
      _mm512_subs_epu8(f(a), f(b))
    case MM_MASKZ_CVTEPI8_EPI32 (k, a) =>
      _mm_maskz_cvtepi8_epi32(f(k), f(a))
    case MM256_CMPNEQ_EPU64_MASK (a, b) =>
      _mm256_cmpneq_epu64_mask(f(a), f(b))
    case MM512_MASK_ABS_EPI16 (src, k, a) =>
      _mm512_mask_abs_epi16(f(src), f(k), f(a))
    case MM_CVTSEPI64_EPI8 (a) =>
      _mm_cvtsepi64_epi8(f(a))
    case iDef@MM_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CVTPS_EPU32 (a) =>
      _mm256_cvtps_epu32(f(a))
    case MM512_MASK_INSERTI32X8 (src, k, a, b, imm8) =>
      _mm512_mask_inserti32x8(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm512_mask_cvttps_epi32(f(src), f(k), f(a))
    case MM256_MASK_ROL_EPI32 (src, k, a, imm8) =>
      _mm256_mask_rol_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_CVTEPU64_PD (k, a) =>
      _mm512_maskz_cvtepu64_pd(f(k), f(a))
    case MM_MASKZ_SCALEF_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_scalef_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_DIV_SS (k, a, b) =>
      _mm_maskz_div_ss(f(k), f(a), f(b))
    case MM512_CVT_ROUNDPD_EPI64 (a, rounding) =>
      _mm512_cvt_roundpd_epi64(f(a), f(rounding))
    case MM256_MASK_BLEND_PD (k, a, b) =>
      _mm256_mask_blend_pd(f(k), f(a), f(b))
    case MM512_SETR4_EPI32 (d, c, b, a) =>
      _mm512_setr4_epi32(f(d), f(c), f(b), f(a))
    case MM_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_PERMUTE_PS (k, a, imm8) =>
      _mm512_maskz_permute_ps(f(k), f(a), f(imm8))
    case MM_MASK_SRAV_EPI64 (src, k, a, count) =>
      _mm_mask_srav_epi64(f(src), f(k), f(a), f(count))
    case MM_MASKZ_EXPAND_EPI64 (k, a) =>
      _mm_maskz_expand_epi64(f(k), f(a))
    case MM256_MASKZ_CVTEPI32_EPI64 (k, a) =>
      _mm256_maskz_cvtepi32_epi64(f(k), f(a))
    case MM256_SRA_EPI64 (a, count) =>
      _mm256_sra_epi64(f(a), f(count))
    case MM256_CMPLT_EPU16_MASK (a, b) =>
      _mm256_cmplt_epu16_mask(f(a), f(b))
    case MM_CMPGT_EPU32_MASK (a, b) =>
      _mm_cmpgt_epu32_mask(f(a), f(b))
    case MM_MASK_CVTEPU64_PD (src, k, a) =>
      _mm_mask_cvtepu64_pd(f(src), f(k), f(a))
    case MM256_MASK_CVTUSEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtusepi32_epi16(f(src), f(k), f(a))
    case MM256_CMPLE_EPU32_MASK (a, b) =>
      _mm256_cmple_epu32_mask(f(a), f(b))
    case MM256_ROLV_EPI32 (a, b) =>
      _mm256_rolv_epi32(f(a), f(b))
    case iDef@MM256_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_ADD_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_add_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM256_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm256_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case iDef@MM256_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MOVELDUP_PS (k, a) =>
      _mm_maskz_moveldup_ps(f(k), f(a))
    case MM256_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case MM_MASKZ_DIV_SD (k, a, b) =>
      _mm_maskz_div_sd(f(k), f(a), f(b))
    case MM_TESTN_EPI32_MASK (a, b) =>
      _mm_testn_epi32_mask(f(a), f(b))
    case MM_MASKZ_FMSUB_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fmsub_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_CVTTPS_EPI64 (a) =>
      _mm256_cvttps_epi64(f(a))
    case MM_MASK3_FMADD_PD (a, b, c, k) =>
      _mm_mask3_fmadd_pd(f(a), f(b), f(c), f(k))
    case MM512_EXP2A23_ROUND_PD (a, rounding) =>
      _mm512_exp2a23_round_pd(f(a), f(rounding))
    case MM512_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm512_maskz_adds_epi8(f(k), f(a), f(b))
    case MM256_MASKZ_CVTUSEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtusepi64_epi32(f(k), f(a))
    case MM256_MASK_PERMUTE_PS (src, k, a, imm8) =>
      _mm256_mask_permute_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm256_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_UNPACKHI_PS (a, b) =>
      _mm512_unpackhi_ps(f(a), f(b))
    case MM512_MASK_SRAV_EPI64 (src, k, a, count) =>
      _mm512_mask_srav_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SRLV_EPI32 (k, a, count) =>
      _mm256_maskz_srlv_epi32(f(k), f(a), f(count))
    case MM_MASKZ_CVTUSEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtusepi32_epi16(f(k), f(a))
    case MM_CMP_SS_MASK (a, b, imm8) =>
      _mm_cmp_ss_mask(f(a), f(b), f(imm8))
    case MM_CMPGT_EPI16_MASK (a, b) =>
      _mm_cmpgt_epi16_mask(f(a), f(b))
    case MM256_MASK_ABS_EPI64 (src, k, a) =>
      _mm256_mask_abs_epi64(f(src), f(k), f(a))
    case MM256_MASK_BROADCASTD_EPI32 (src, k, a) =>
      _mm256_mask_broadcastd_epi32(f(src), f(k), f(a))
    case MM_MASK_RSQRT14_PD (src, k, a) =>
      _mm_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM512_MASK_MOVEHDUP_PS (src, k, a) =>
      _mm512_mask_movehdup_ps(f(src), f(k), f(a))
    case MM_MASKZ_FNMSUB_SS (k, a, b, c) =>
      _mm_maskz_fnmsub_ss(f(k), f(a), f(b), f(c))
    case MM_SCALEF_ROUND_SS (a, b, rounding) =>
      _mm_scalef_round_ss(f(a), f(b), f(rounding))
    case MM512_CVTSEPI32_EPI8 (a) =>
      _mm512_cvtsepi32_epi8(f(a))
    case MM512_MASK_LZCNT_EPI64 (src, k, a) =>
      _mm512_mask_lzcnt_epi64(f(src), f(k), f(a))
    case MM512_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi32(f(k), f(idx), f(a))
    case MM_MASK_CMPEQ_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_BROADCAST_F32X4 (k, a) =>
      _mm256_maskz_broadcast_f32x4(f(k), f(a))
    case MM512_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_SLLI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_slli_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASK_FMSUB_PD (a, k, b, c) =>
      _mm_mask_fmsub_pd(f(a), f(k), f(b), f(c))
    case MM512_RCP14_PD (a) =>
      _mm512_rcp14_pd(f(a))
    case MM256_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm256_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM_MASKZ_SET1_EPI32 (k, a) =>
      _mm_maskz_set1_epi32(f(k), f(a))
    case MM512_MASK_BROADCAST_I32X4 (src, k, a) =>
      _mm512_mask_broadcast_i32x4(f(src), f(k), f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPI32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epi32(f(src), f(k), f(a), f(sae))
    case iDef@MM256_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm_maskz_xor_epi64(f(k), f(a), f(b))
    case MM_MASK_CMP_ROUND_SS_MASK (k1, a, b, imm8, sae) =>
      _mm_mask_cmp_round_ss_mask(f(k1), f(a), f(b), f(imm8), f(sae))
    case MM_MASKZ_CVTEPI32_PD (k, a) =>
      _mm_maskz_cvtepi32_pd(f(k), f(a))
    case MM512_MASK_CVT_ROUNDEPU32_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu32_ps(f(src), f(k), f(a), f(rounding))
    case MM_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm_maskz_min_epi16(f(k), f(a), f(b))
    case MM_CVT_ROUNDSD_SS (a, b, rounding) =>
      _mm_cvt_roundsd_ss(f(a), f(b), f(rounding))
    case MM512_MASK_CVTEPU8_EPI32 (src, k, a) =>
      _mm512_mask_cvtepu8_epi32(f(src), f(k), f(a))
    case MM_MASKZ_ROL_EPI32 (k, a, imm8) =>
      _mm_maskz_rol_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case MM_MASK_CMPNEQ_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epu64_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPS_EPU32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epu32(f(k), f(a), f(rounding))
    case MM256_MASKZ_EXTRACTF64X2_PD (k, a, imm8) =>
      _mm256_maskz_extractf64x2_pd(f(k), f(a), f(imm8))
    case MM512_CVT_ROUNDPS_EPU32 (a, rounding) =>
      _mm512_cvt_roundps_epu32(f(a), f(rounding))
    case MM512_SET4_PD (d, c, b, a) =>
      _mm512_set4_pd(f(d), f(c), f(b), f(a))
    case MM512_FIXUPIMM_ROUND_PS (a, b, c, imm8, rounding) =>
      _mm512_fixupimm_round_ps(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASKZ_SRLI_EPI32 (k, a, imm8) =>
      _mm512_maskz_srli_epi32(f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTE_PD (src, k, a, imm8) =>
      _mm256_mask_permute_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_MIN_ROUND_SD (k, a, b, sae) =>
      _mm_maskz_min_round_sd(f(k), f(a), f(b), f(sae))
    case MM256_MASKZ_MAX_EPI8 (k, a, b) =>
      _mm256_maskz_max_epi8(f(k), f(a), f(b))
    case MM512_RSQRT28_PS (a) =>
      _mm512_rsqrt28_ps(f(a))
    case MM512_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm512_mask_reduce_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm512_maskz_cvtepi8_epi16(f(k), f(a))
    case MM512_MIN_PS (a, b) =>
      _mm512_min_ps(f(a), f(b))
    case MM512_MASKZ_PACKUS_EPI16 (k, a, b) =>
      _mm512_maskz_packus_epi16(f(k), f(a), f(b))
    case MM512_CVTT_ROUNDPS_EPU32 (a, sae) =>
      _mm512_cvtt_roundps_epu32(f(a), f(sae))
    case MM_MASK_BLEND_PD (k, a, b) =>
      _mm_mask_blend_pd(f(k), f(a), f(b))
    case MM512_MASKZ_CVTT_ROUNDPS_EPU64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epu64(f(k), f(a), f(sae))
    case iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm256_permutexvar_epi16(f(idx), f(a))
    case MM_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM_MASK_MOV_EPI8 (src, k, a) =>
      _mm_mask_mov_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_AND_EPI32 (k, a, b) =>
      _mm512_maskz_and_epi32(f(k), f(a), f(b))
    case MM256_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_CVTEPU32_PD (src, k, a) =>
      _mm_mask_cvtepu32_pd(f(src), f(k), f(a))
    case iDef@MM512_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SRL_EPI64 (src, k, a, count) =>
      _mm512_mask_srl_epi64(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_PACKUS_EPI32 (k, a, b) =>
      _mm512_maskz_packus_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_i32x4(f(k), f(a), f(b), f(imm8))
    case MM512_CVTEPI32_EPI8 (a) =>
      _mm512_cvtepi32_epi8(f(a))
    case MM_MASK_CMPEQ_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epi32_mask(f(k1), f(a), f(b))
    case MM256_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi64(f(src), f(k), f(idx), f(a))
    case MM512_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm512_maskz_subs_epu16(f(k), f(a), f(b))
    case MM512_MASK_PERMUTEVAR_PD (src, k, a, b) =>
      _mm512_mask_permutevar_pd(f(src), f(k), f(a), f(b))
    case MM256_MASK_CMPEQ_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi16_mask(f(k1), f(a), f(b))
    case MM512_RCP28_ROUND_PD (a, rounding) =>
      _mm512_rcp28_round_pd(f(a), f(rounding))
    case MM_MASK_CVTEPI8_EPI32 (src, k, a) =>
      _mm_mask_cvtepi8_epi32(f(src), f(k), f(a))
    case MM_MASK_GETEXP_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_getexp_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_SET1_EPI16 (a) =>
      _mm512_set1_epi16(f(a))
    case MM512_MOVM_EPI64 (k) =>
      _mm512_movm_epi64(f(k))
    case MM512_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm512_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASKZ_SLLV_EPI16 (k, a, count) =>
      _mm256_maskz_sllv_epi16(f(k), f(a), f(count))
    case MM512_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b) =>
      _mm512_maskz_permutex2var_ps(f(k), f(a), f(idx), f(b))
    case MM256_CMPLT_EPI32_MASK (a, b) =>
      _mm256_cmplt_epi32_mask(f(a), f(b))
    case MM256_RCP14_PD (a) =>
      _mm256_rcp14_pd(f(a))
    case MM_MASK_COMPRESS_PS (src, k, a) =>
      _mm_mask_compress_ps(f(src), f(k), f(a))
    case MM_MASK_TEST_EPI32_MASK (k1, a, b) =>
      _mm_mask_test_epi32_mask(f(k1), f(a), f(b))
    case MM_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case iDef@MM512_PREFETCH_I32GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CVTTPS_EPU64 (src, k, a) =>
      _mm_mask_cvttps_epu64(f(src), f(k), f(a))
    case MM_MASKZ_CVTSEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtsepi64_epi8(f(k), f(a))
    case MM256_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm256_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM256_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm256_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM_ROL_EPI32 (a, imm8) =>
      _mm_rol_epi32(f(a), f(imm8))
    case MM512_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm512_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM_CMPNEQ_EPI16_MASK (a, b) =>
      _mm_cmpneq_epi16_mask(f(a), f(b))
    case MM256_MASK_ANDNOT_EPI32 (src, k, a, b) =>
      _mm256_mask_andnot_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM_MASK_LOAD_SS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_ss(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)

    case Reflect(MM_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_PS (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPH_PS (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPH_PS (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTSD_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTSD_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_ROUND_PD (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_ROUND_PD (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BSRLI_EPI128 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_BSRLI_EPI128 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTF32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTF32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTMW_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTMW_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ABS_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ABS_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI32X8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI32X8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROL_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROL_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_EPI32 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_EPI32 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRA_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRA_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROLV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ROLV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVELDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVELDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRAV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRAV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ABS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ABS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVEHDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVEHDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LZCNT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LZCNT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI32 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPI32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPI32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_ROUND_SS_MASK (k1, a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_ROUND_SS_MASK (f(k1), f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU32_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU32_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROL_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROL_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPU32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTF64X2_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTF64X2_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPU32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPU32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_PD (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_PD (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_ROUND_PS (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_ROUND_PS (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_ROUND_SD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_ROUND_SD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PACKUS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PACKUS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPU32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPU32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PACKUS_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PACKUS_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_I32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI64 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEVAR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEVAR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_PS (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I32GATHER_PD (vindex, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROL_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROL_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_SS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_SS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51202 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_MASK_SUB_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutex2var_ps(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_CMPNEQ_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLE_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPH_PS(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundph_ps(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi32_epi16(${quote(a)})")
    case iDef@MM256_MASKZ_SET1_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_FMADDSUB_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MULLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mullo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTT_ROUNDSD_I32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_i32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_BROADCASTW_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi32_epi16(${quote(a)})")
    case iDef@MM512_MASK_CVTEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_REDUCE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_PERMUTEXVAR_EPI8(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_RSQRT28_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt28_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_BROADCASTSD_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastsd_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_EXPAND_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expand_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADDS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MULHI_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mulhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ROUNDSCALE_ROUND_PD(src, k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundscale_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_BSRLI_EPI128(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_bsrli_epi128(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_INSERTF32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_insertf32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_BROADCASTMW_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastmw_epi32(${quote(k)})")
    case iDef@MM512_MASK_CVTEPU32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_SQRT_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MUL_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mul_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_EXPAND_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_OR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_or_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SUBS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subs_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPNEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ABS_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_abs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi64_epi8(${quote(a)})")
    case iDef@MM_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CVTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_epu32(${quote(a)})")
    case iDef@MM512_MASK_INSERTI32X8(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_inserti32x8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_ROL_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rol_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTEPU64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_SCALEF_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_DIV_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVT_ROUNDPD_EPI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundpd_epi64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_BLEND_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_blend_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SETR4_EPI32(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr4_epi32(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_PERMUTE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permute_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SRAV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srav_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_EXPAND_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_expand_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTEPI32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_SRA_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sra_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_CMPLT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTUSEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLE_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ROLV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rolv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_ADD_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MULHI_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MULHRS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_MOVELDUP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_moveldup_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_DIV_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TESTN_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testn_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMSUB_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_CVTTPS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttps_epi64(${quote(a)})")
    case iDef@MM_MASK3_FMADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_EXP2A23_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2a23_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_ADDS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTUSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PERMUTE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permute_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SUB_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i32scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_UNPACKHI_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SRAV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srav_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_SRLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srlv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_CVTUSEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_SS_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_ss_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPGT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ABS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_abs_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_BROADCASTD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_RSQRT14_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_MOVEHDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_movehdup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_FNMSUB_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_SCALEF_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_scalef_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_CVTSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsepi32_epi8(${quote(a)})")
    case iDef@MM512_MASK_LZCNT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_lzcnt_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTEXVAR_EPI32(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi32(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_CMPEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_BROADCAST_F32X4(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcast_f32x4(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SLLI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_slli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FMSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_RCP14_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp14_pd(${quote(a)})")
    case iDef@MM256_MASK_MADD52HI_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_SET1_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_set1_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_BROADCAST_I32X4(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTT_ROUNDPD_EPI32(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i32gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i32scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM256_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_XOR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMP_ROUND_SS_MASK(k1, a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_round_ss_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM_MASKZ_CVTEPI32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDEPU32_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepu32_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MIN_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSD_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPU8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_ROL_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rol_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPNEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPS_EPU32(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epu32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_EXTRACTF64X2_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_extractf64x2_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CVT_ROUNDPS_EPU32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundps_epu32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_SET4_PD(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set4_pd(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM512_FIXUPIMM_ROUND_PS(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_SRLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_PERMUTE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permute_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MIN_ROUND_SD(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASKZ_MAX_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_RSQRT28_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt28_ps(${quote(a)})")
    case iDef@MM512_MASK_REDUCE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTEPI8_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MIN_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PACKUS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_packus_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTT_ROUNDPS_EPU32(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundps_epu32(${quote(a)}, ${quote(sae)})")
    case iDef@MM_MASK_BLEND_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_blend_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPS_EPU64(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epu64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtusepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_PERMUTEXVAR_EPI16(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_CVTTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MOV_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_AND_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_and_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_SRL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srl_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_PACKUS_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_packus_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SHUFFLE_I32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_i32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32_epi8(${quote(a)})")
    case iDef@MM_MASK_CMPEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_PERMUTEXVAR_EPI64(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_epi64(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SUBS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEVAR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutevar_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPEQ_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_RCP28_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp28_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTEPI8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_GETEXP_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_SET1_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_epi16(${quote(a)})")
    case iDef@MM512_MOVM_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movm_epi64(${quote(k)})")
    case iDef@MM512_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SLLV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sllv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_ps(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_CMPLT_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_RCP14_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rcp14_pd(${quote(a)})")
    case iDef@MM_MASK_COMPRESS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_TEST_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_test_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_PREFETCH_I32GATHER_PD(vindex, base_addr, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i32gather_pd(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)}, ${quote(hint)});")
    case iDef@MM_MASK_CVTTPS_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_BROADCAST_I32X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_TEST_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ROL_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rol_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_AVG_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ANDNOT_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_andnot_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_LOAD_SS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_ss(${quote(src)}, ${quote(k)}, (const float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case _ => super.emitNode(sym, rhs)
  }
}
