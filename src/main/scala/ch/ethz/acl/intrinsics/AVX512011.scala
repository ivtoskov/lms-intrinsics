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

    
trait AVX512011 extends IntrinsicsBase {
  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst".
   * a: __m128i, b: __m128i, count: const int
   */
  case class MM_ALIGNR_EPI64(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_RSQRT28_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst".
   * a: __m256i, b: __m256i, count: const int
   */
  case class MM256_ALIGNR_EPI32(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPU32_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Broadcast 64-bit integer "a" to all elements of "dst".
   * a: __int64
   */
  case class MM512_SET1_EPI64(a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_PACKUS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RSQRT28_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_EXP2A23_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MAX_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASKZ_MIN_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRA_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_MUL_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_UNPACKHI_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_SHUFFLE_F64X2(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_U32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
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
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI8(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m512i
   */
  case class MM512_ABS_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Convert packed unsigned 64-bit integers in "a" to packed 8-bit integers with
   * unsigned saturation, and store the active results (those with their respective
   * bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTUSEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
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
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_UNPACKHI_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values.
   * e7: double, e6: double, e5: double, e4: double, e3: double, e2: double, e1: double, e0: double
   */
  case class MM512_SET_PD(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASK_MIN_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI32_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_FPCLASS_PS_MASK(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_OR_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FNMSUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CONFLICT_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Compare)
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
   * Prefetch double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged in cache using
   * writemask "k" (elements are brought into cache only when their corresponding
   * mask bits are set). "scale" should be 1, 2, 4 or 8. The "hint" parameter may
   * be 1 (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for
   * prefetching to L2 cache.
   * vindex: __m256i, mask: __mmask8, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_PD(a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMADDSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 16-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask16, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_EPI16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. The "hint" parameter may be 1
   * (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching
   * to L2 cache. 64-bit elements are brought into cache from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not brought
   * into cache when the corresponding mask bit is not set). "scale" should be 1,
   * 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512d to type __m128d. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512d
   */
  case class MM512_CASTPD512_PD128(a: Exp[__m512d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m128, b: __m128, imm8: int
   */
  case class MM_RANGE_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI64(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_COMPRESS_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTSEPI32_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM512_MASKZ_CVTEPU8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_RANGE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTEPU32_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_MUL_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM_MASKZ_ABS_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_PS[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ROLV_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_I32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MADDUBS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MADD52LO_EPU64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 16-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask32, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI16[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e7: double, e6: double, e5: double, e4: double, e3: double, e2: double, e1: double, e0: double
   */
  case class MM512_SETR_PD(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
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
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_COMPRESSSTOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 16-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_EPI16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_EXPAND_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SQRT_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_UNPACKHI_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * 	[round_note]
   * a: __m512d, imm8: int, rounding: int
   */
  case class MM512_REDUCE_ROUND_PD(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. The "hint" parameter may be 1
   * (_MM_HINT_T0) for prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching
   * to L2 cache. 32-bit elements are stored at addresses starting at "base_addr"
   * and offset by each 64-bit element in "vindex" (each index is scaled by the
   * factor in "scale") subject to mask "k" (elements are not brought into cache
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_RSQRT28_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
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
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SQRT_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU32_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_RSQRT28_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI32X4_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m512i, imm8: const int
   */
  case class MM512_ROL_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_UNPACKLO_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_MOV_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask32
   */
  case class MM256_MOVM_EPI8(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_RSQRT28_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI32(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_SHUFFLE_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RCP14_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MIN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_AND_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
      

  def _mm512_cmple_epu16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPU16_MASK(a, b)
  }
            
  def _mm_alignr_epi64(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm_maskz_rsqrt28_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RSQRT28_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_cvtepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTEPI16_EPI8(a)
  }
            
  def _mm256_alignr_epi32(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm_mask3_fmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_SS(a, b, c, k)
  }
            
  def _mm512_cvt_roundepu32_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDEPU32_PS(a, rounding)
  }
            
  def _mm256_mask_cvtps_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm512_set1_epi64(a: Exp[Long]): Exp[__m512i] = {
    MM512_SET1_EPI64(a)
  }
            
  def _mm512_maskz_cvt_roundpd_epu64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPU64(k, a, rounding)
  }
            
  def _mm_mask_packus_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PACKUS_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm_mask_rsqrt28_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT28_SD(src, k, a, b)
  }
            
  def _mm512_exp2a23_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_EXP2A23_ROUND_PS(a, rounding)
  }
            
  def _mm_maskz_max_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MAX_SS(k, a, b)
  }
            
  def _mm512_maskz_min_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_MIN_ROUND_PD(k, a, b, sae)
  }
            
  def _mm_mask_avg_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm512_maskz_sra_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm512_maskz_mul_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_MUL_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm_mask_unpacklo_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm256_mask_unpackhi_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm256_shuffle_f64x2(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_SHUFFLE_F64X2(a, b, imm8)
  }
            
  def _mm_cvtt_roundsd_u32(a: Exp[__m128d], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVTT_ROUNDSD_U32(a, rounding)
  }
            
  def _mm512_cvt_roundepu64_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_CVT_ROUNDEPU64_PS(a, rounding)
  }
            
  def _mm256_mask_permutexvar_epi8(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  def _mm512_abs_epi32(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_ABS_EPI32(a)
  }
            
  def _mm_maskz_unpackhi_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm_mask_cvtepu32_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU32_EPI64(src, k, a)
  }
            
  def _mm512_mask_cvtusepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_compressstoreu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvtepu8_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm_cvtsd_u64(a: Exp[__m128d]): Exp[ULong] = {
    MM_CVTSD_U64(a)
  }
            
  def _mm256_mask_unpackhi_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_UNPACKHI_PS(src, k, a, b)
  }
            
  def _mm512_mask_adds_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm512_mask_adds_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm512_set_pd(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m512d] = {
    MM512_SET_PD(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_mask_cvtepi8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI32(src, k, a)
  }
            
  def _mm512_mask_cvtusepi16_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm_mask_min_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASK_MIN_ROUND_SS(src, k, a, b, sae)
  }
            
  def _mm256_maskz_compress_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm_maskz_mov_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MOV_PD(k, a)
  }
            
  def _mm512_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm512_mask_adds_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_unpackhi_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm256_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm512_maskz_cvtusepi32_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTUSEPI32_EPI16(k, a)
  }
            
  def _mm_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm_maskz_cvtepi32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI64(k, a)
  }
            
  def _mm512_cvttps_epi32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTTPS_EPI32(a)
  }
            
  def _mm512_movepi16_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI16_MASK(a)
  }
            
  def _mm_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm_maskz_or_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_OR_PD(k, a, b)
  }
            
  def _mm512_mask_subs_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm256_permutex_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_PERMUTEX_EPI64(a, imm8)
  }
            
  def _mm512_mask_extracti64x2_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8)
  }
            
  def _mm_cvtsd_i32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTSD_I32(a)
  }
            
  def _mm_maskz_fnmsub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_conflict_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_CONFLICT_EPI32(k, a)
  }
            
  def _mm_mask_andnot_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ANDNOT_EPI32(src, k, a, b)
  }
            
  def _mm_mask_cvtpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm_cvtpd_epi64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPI64(a)
  }
            
  def _mm512_mask_prefetch_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I32GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_getmant_pd(a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_PD(a, interv, sc)
  }
            
  def _mm256_maskz_permutex2var_ps(k: Exp[Int], a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b)
  }
            
  def _mm256_maskz_expand_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_EXPAND_PS(k, a)
  }
            
  def _mm512_mask3_fmaddsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm512_mask_cmpeq_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_mask_storeu_epi16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpgt_epu8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPU8_MASK(a, b)
  }
            
  def _mm512_mask_prefetch_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I64SCATTER_PD(base_addr, mask, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtsepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_castpd512_pd128(a: Exp[__m512d]): Exp[__m128d] = {
    MM512_CASTPD512_PD128(a)
  }
            
  def _mm_range_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_RANGE_PS(a, b, imm8)
  }
            
  def _mm512_mask_mullo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLO_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm256_mask_set1_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[Short]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm_rorv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_RORV_EPI32(a, b)
  }
            
  def _mm256_mask_cmpneq_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_expandloadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_permutex2var_epi64(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI64(a, idx, b)
  }
            
  def _mm512_maskz_cvt_roundepi64_pd(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_CVT_ROUNDEPI64_PD(k, a, rounding)
  }
            
  def _mm_mask_srl_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI64(src, k, a, count)
  }
            
  def _mm512_maskz_compress_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_COMPRESS_EPI32(k, a)
  }
            
  def _mm512_cvtsepi32_epi16(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTSEPI32_EPI16(a)
  }
            
  def _mm512_maskz_cvtepu8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU8_EPI32(k, a)
  }
            
  def _mm512_mask_range_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RANGE_ROUND_PD(src, k, a, b, imm8, rounding)
  }
            
  def _mm256_mask_cvttpd_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTTPD_EPU64(src, k, a)
  }
            
  def _mm512_maskz_cvtepu32_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASKZ_CVTEPU32_PS(k, a)
  }
            
  def _mm256_maskz_mul_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MUL_PD(k, a, b)
  }
            
  def _mm256_maskz_cvtpd_epi64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTPD_EPI64(k, a)
  }
            
  def _mm_maskz_abs_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ABS_EPI8(k, a)
  }
            
  def _mm512_i64gather_ps[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM512_I64GATHER_PS(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm_mask_andnot_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ANDNOT_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_rolv_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ROLV_EPI32(src, k, a, b)
  }
            
  def _mm_mask_cvtpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm256_mask_subs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm256_cvtsepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI32_EPI8(a)
  }
            
  def _mm_cvttsd_i32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTTSD_I32(a)
  }
            
  def _mm512_cvtepi64_epi16(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTEPI64_EPI16(a)
  }
            
  def _mm256_maskz_permute_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTE_PD(k, a, imm8)
  }
            
  def _mm_maskz_maddubs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADDUBS_EPI16(k, a, b)
  }
            
  def _mm_madd52lo_epu64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm512_mask_loadu_epi16[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_setr_pd(e7: Exp[Double], e6: Exp[Double], e5: Exp[Double], e4: Exp[Double], e3: Exp[Double], e2: Exp[Double], e1: Exp[Double], e0: Exp[Double]): Exp[__m512d] = {
    MM512_SETR_PD(e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_maskz_permute_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_PERMUTE_PS(k, a, imm8)
  }
            
  def _mm256_mask_cvtps_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_compressstoreu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_storeu_epi16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtss_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128]): Exp[__m128d] = {
    MM_MASK_CVTSS_SD(src, k, a, b)
  }
            
  def _mm512_maskz_expand_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_EXPAND_PS(k, a)
  }
            
  def _mm_sqrt_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SQRT_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm_cvt_roundsi64_ss(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSI64_SS(a, b, rounding)
  }
            
  def _mm512_reduce_round_pd(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_REDUCE_ROUND_PD(a, imm8, rounding)
  }
            
  def _mm512_mask_prefetch_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I64SCATTER_PS(base_addr, mask, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_avg_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AVG_EPU8(a, b)
  }
            
  def _mm512_mask_rsqrt28_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RSQRT28_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm512_maskz_broadcastb_epi8(k: Exp[Long], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm512_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm_maskz_multishift_epi64_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm512_broadcastb_epi8(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTB_EPI8(a)
  }
            
  def _mm_maskz_sqrt_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SQRT_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm256_mask_cmpge_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_srlv_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm256_cmp_epu8_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPU8_MASK(a, b, imm8)
  }
            
  def _mm_fmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FMADD_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm256_cmpeq_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI32_MASK(a, b)
  }
            
  def _mm512_cvtepu32_pd(a: Exp[__m256i]): Exp[__m512d] = {
    MM512_CVTEPU32_PD(a)
  }
            
  def _mm_mask_rsqrt28_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RSQRT28_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm256_maskz_cvtps_epi32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPI32(k, a)
  }
            
  def _mm512_mask_cvttpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm256_mask_cvtsepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI32_EPI16(src, k, a)
  }
            
  def _mm512_extracti32x4_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_EXTRACTI32X4_EPI32(a, imm8)
  }
            
  def _mm512_rol_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_ROL_EPI32(a, imm8)
  }
            
  def _mm512_maskz_unpacklo_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_UNPACKLO_PD(k, a, b)
  }
            
  def _mm512_maskz_sub_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI16(k, a, b)
  }
            
  def _mm_maskz_ror_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROR_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_cvtt_roundps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPU64(src, k, a, sae)
  }
            
  def _mm256_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm512_mask_mulhrs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm_rorv_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_RORV_EPI64(a, b)
  }
            
  def _mm_maskz_srai_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm_cmpge_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPU32_MASK(a, b)
  }
            
  def _mm512_cvtt_roundps_epu64(a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPU64(a, sae)
  }
            
  def _mm_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm512_maskz_subs_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm_maskz_range_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm512_max_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPI8(a, b)
  }
            
  def _mm_maskz_shuffle_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLE_EPI8(k, a, b)
  }
            
  def _mm512_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm_mask_mov_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MOV_PD(src, k, a)
  }
            
  def _mm256_movm_epi8(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI8(k)
  }
            
  def _mm256_maskz_min_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU64(k, a, b)
  }
            
  def _mm_rsqrt28_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_RSQRT28_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_maskz_permutex2var_epi32(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b)
  }
            
  def _mm256_maskz_ror_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROR_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_blend_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_BLEND_EPI16(k, a, b)
  }
            
  def _mm_mask_cvtepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_shuffle_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_SHUFFLE_PD(a, b, imm8)
  }
            
  def _mm_maskz_compress_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_COMPRESS_EPI32(k, a)
  }
            
  def _mm_mask_cmpeq_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_mask_rcp14_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm_maskz_rorv_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_RORV_EPI64(k, a, b)
  }
            
  def _mm_mask_shufflelo_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm_permutex2var_ps(a: Exp[__m128], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_PERMUTEX2VAR_PS(a, idx, b)
  }
            
  def _mm_mask_cvtsepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_min_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm_mask_div_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_DIV_PD(src, k, a, b)
  }
            
  def _mm_mask_and_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm512_mask_shufflehi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLEHI_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_permutex2var_pd(k: Exp[Int], a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b)
  }
            
  def _mm256_mask_testn_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_cvt_roundepu64_pd(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_CVT_ROUNDEPU64_PD(a, rounding)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_CMPLE_EPU16_MASK (a, b) =>
      _mm512_cmple_epu16_mask(f(a), f(b))
    case MM_ALIGNR_EPI64 (a, b, count) =>
      _mm_alignr_epi64(f(a), f(b), f(count))
    case MM_MASKZ_RSQRT28_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_rsqrt28_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_CVTEPI16_EPI8 (a) =>
      _mm512_cvtepi16_epi8(f(a))
    case MM256_ALIGNR_EPI32 (a, b, count) =>
      _mm256_alignr_epi32(f(a), f(b), f(count))
    case MM_MASK3_FMSUB_SS (a, b, c, k) =>
      _mm_mask3_fmsub_ss(f(a), f(b), f(c), f(k))
    case MM512_CVT_ROUNDEPU32_PS (a, rounding) =>
      _mm512_cvt_roundepu32_ps(f(a), f(rounding))
    case MM256_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm256_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM512_SET1_EPI64 (a) =>
      _mm512_set1_epi64(f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPU64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epu64(f(k), f(a), f(rounding))
    case MM_MASK_PACKUS_EPI32 (src, k, a, b) =>
      _mm_mask_packus_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm256_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case MM_MASK_RSQRT28_SD (src, k, a, b) =>
      _mm_mask_rsqrt28_sd(f(src), f(k), f(a), f(b))
    case MM512_EXP2A23_ROUND_PS (a, rounding) =>
      _mm512_exp2a23_round_ps(f(a), f(rounding))
    case MM_MASKZ_MAX_SS (k, a, b) =>
      _mm_maskz_max_ss(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_ROUND_PD (k, a, b, sae) =>
      _mm512_maskz_min_round_pd(f(k), f(a), f(b), f(sae))
    case MM_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm512_maskz_sra_epi16(f(k), f(a), f(count))
    case MM512_MASKZ_MUL_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_mul_round_pd(f(k), f(a), f(b), f(rounding))
    case MM_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm256_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case MM256_SHUFFLE_F64X2 (a, b, imm8) =>
      _mm256_shuffle_f64x2(f(a), f(b), f(imm8))
    case MM_CVTT_ROUNDSD_U32 (a, rounding) =>
      _mm_cvtt_roundsd_u32(f(a), f(rounding))
    case MM512_CVT_ROUNDEPU64_PS (a, rounding) =>
      _mm512_cvt_roundepu64_ps(f(a), f(rounding))
    case MM256_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))
    case MM512_ABS_EPI32 (a) =>
      _mm512_abs_epi32(f(a))
    case MM_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM_MASK_CVTEPU32_EPI64 (src, k, a) =>
      _mm_mask_cvtepu32_epi64(f(src), f(k), f(a))
    case iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm256_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM_CVTSD_U64 (a) =>
      _mm_cvtsd_u64(f(a))
    case MM256_MASK_UNPACKHI_PS (src, k, a, b) =>
      _mm256_mask_unpackhi_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm512_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm512_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM512_SET_PD (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_pd(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_MASK_CVTEPI8_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi8_epi32(f(src), f(k), f(a))
    case MM512_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm512_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case MM_MASK_MIN_ROUND_SS (src, k, a, b, sae) =>
      _mm_mask_min_round_ss(f(src), f(k), f(a), f(b), f(sae))
    case MM256_MASKZ_COMPRESS_PS (k, a) =>
      _mm256_maskz_compress_ps(f(k), f(a))
    case MM_MASKZ_MOV_PD (k, a) =>
      _mm_maskz_mov_pd(f(k), f(a))
    case MM512_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm512_maskz_cvtpd_epi64(f(k), f(a))
    case MM512_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm512_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm512_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM256_MASKZ_RSQRT14_PD (k, a) =>
      _mm256_maskz_rsqrt14_pd(f(k), f(a))
    case MM512_MASKZ_CVTUSEPI32_EPI16 (k, a) =>
      _mm512_maskz_cvtusepi32_epi16(f(k), f(a))
    case MM_MASKZ_CVTEPU32_PD (k, a) =>
      _mm_maskz_cvtepu32_pd(f(k), f(a))
    case MM_MASKZ_CVTEPI32_EPI64 (k, a) =>
      _mm_maskz_cvtepi32_epi64(f(k), f(a))
    case MM512_CVTTPS_EPI32 (a) =>
      _mm512_cvttps_epi32(f(a))
    case MM512_MOVEPI16_MASK (a) =>
      _mm512_movepi16_mask(f(a))
    case MM_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM_MASKZ_OR_PD (k, a, b) =>
      _mm_maskz_or_pd(f(k), f(a), f(b))
    case MM512_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm512_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM256_PERMUTEX_EPI64 (a, imm8) =>
      _mm256_permutex_epi64(f(a), f(imm8))
    case MM512_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8) =>
      _mm512_mask_extracti64x2_epi64(f(src), f(k), f(a), f(imm8))
    case MM_CVTSD_I32 (a) =>
      _mm_cvtsd_i32(f(a))
    case MM_MASKZ_FNMSUB_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fnmsub_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_CONFLICT_EPI32 (k, a) =>
      _mm512_maskz_conflict_epi32(f(k), f(a))
    case MM_MASK_ANDNOT_EPI32 (src, k, a, b) =>
      _mm_mask_andnot_epi32(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm_mask_cvtpd_epi32(f(src), f(k), f(a))
    case MM_CVTPD_EPI64 (a) =>
      _mm_cvtpd_epi64(f(a))
    case iDef@MM512_MASK_PREFETCH_I32GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_GETMANT_PD (a, interv, sc) =>
      _mm_getmant_pd(f(a), f(interv), f(sc))
    case MM256_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b) =>
      _mm256_maskz_permutex2var_ps(f(k), f(a), f(idx), f(b))
    case MM256_MASKZ_EXPAND_PS (k, a) =>
      _mm256_maskz_expand_ps(f(k), f(a))
    case MM512_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm512_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK_CMPEQ_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi64_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_epi16(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPGT_EPU8_MASK (a, b) =>
      _mm256_cmpgt_epu8_mask(f(a), f(b))
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PD (base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CASTPD512_PD128 (a) =>
      _mm512_castpd512_pd128(f(a))
    case MM_RANGE_PS (a, b, imm8) =>
      _mm_range_ps(f(a), f(b), f(imm8))
    case MM512_MASK_MULLO_EPI16 (src, k, a, b) =>
      _mm512_mask_mullo_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK_SET1_EPI16 (src, k, a) =>
      _mm256_mask_set1_epi16(f(src), f(k), f(a))
    case MM_RORV_EPI32 (a, b) =>
      _mm_rorv_epi32(f(a), f(b))
    case MM256_MASK_CMPNEQ_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epi64_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_PERMUTEX2VAR_EPI64 (a, idx, b) =>
      _mm512_permutex2var_epi64(f(a), f(idx), f(b))
    case MM512_MASKZ_CVT_ROUNDEPI64_PD (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi64_pd(f(k), f(a), f(rounding))
    case MM_MASK_SRL_EPI64 (src, k, a, count) =>
      _mm_mask_srl_epi64(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_COMPRESS_EPI32 (k, a) =>
      _mm512_maskz_compress_epi32(f(k), f(a))
    case MM512_CVTSEPI32_EPI16 (a) =>
      _mm512_cvtsepi32_epi16(f(a))
    case MM512_MASKZ_CVTEPU8_EPI32 (k, a) =>
      _mm512_maskz_cvtepu8_epi32(f(k), f(a))
    case MM512_MASK_RANGE_ROUND_PD (src, k, a, b, imm8, rounding) =>
      _mm512_mask_range_round_pd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM256_MASK_CVTTPD_EPU64 (src, k, a) =>
      _mm256_mask_cvttpd_epu64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPU32_PS (k, a) =>
      _mm512_maskz_cvtepu32_ps(f(k), f(a))
    case MM256_MASKZ_MUL_PD (k, a, b) =>
      _mm256_maskz_mul_pd(f(k), f(a), f(b))
    case MM256_MASKZ_CVTPD_EPI64 (k, a) =>
      _mm256_maskz_cvtpd_epi64(f(k), f(a))
    case MM_MASKZ_ABS_EPI8 (k, a) =>
      _mm_maskz_abs_epi8(f(k), f(a))
    case iDef@MM512_I64GATHER_PS (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_ps(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm256_maskz_cvtpd_epu64(f(k), f(a))
    case MM_MASK_ANDNOT_EPI64 (src, k, a, b) =>
      _mm_mask_andnot_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_ROLV_EPI32 (src, k, a, b) =>
      _mm512_mask_rolv_epi32(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM256_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm256_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case MM256_CVTSEPI32_EPI8 (a) =>
      _mm256_cvtsepi32_epi8(f(a))
    case MM_CVTTSD_I32 (a) =>
      _mm_cvttsd_i32(f(a))
    case MM512_CVTEPI64_EPI16 (a) =>
      _mm512_cvtepi64_epi16(f(a))
    case MM256_MASKZ_PERMUTE_PD (k, a, imm8) =>
      _mm256_maskz_permute_pd(f(k), f(a), f(imm8))
    case MM_MASKZ_MADDUBS_EPI16 (k, a, b) =>
      _mm_maskz_maddubs_epi16(f(k), f(a), f(b))
    case MM_MADD52LO_EPU64 (a, b, c) =>
      _mm_madd52lo_epu64(f(a), f(b), f(c))
    case iDef@MM512_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi16(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SETR_PD (e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_pd(f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_MASKZ_PERMUTE_PS (k, a, imm8) =>
      _mm256_maskz_permute_ps(f(k), f(a), f(imm8))
    case MM256_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm256_mask_cvtps_epi64(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_epi16(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CVTSS_SD (src, k, a, b) =>
      _mm_mask_cvtss_sd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_EXPAND_PS (k, a) =>
      _mm512_maskz_expand_ps(f(k), f(a))
    case MM_SQRT_ROUND_SS (a, b, rounding) =>
      _mm_sqrt_round_ss(f(a), f(b), f(rounding))
    case MM512_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm512_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM_CVT_ROUNDSI64_SS (a, b, rounding) =>
      _mm_cvt_roundsi64_ss(f(a), f(b), f(rounding))
    case MM512_REDUCE_ROUND_PD (a, imm8, rounding) =>
      _mm512_reduce_round_pd(f(a), f(imm8), f(rounding))
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PS (base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_AVG_EPU8 (a, b) =>
      _mm512_avg_epu8(f(a), f(b))
    case MM512_MASK_RSQRT28_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_rsqrt28_round_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm512_maskz_broadcastb_epi8(f(k), f(a))
    case MM512_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm512_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case MM512_BROADCASTB_EPI8 (a) =>
      _mm512_broadcastb_epi8(f(a))
    case MM_MASKZ_SQRT_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_sqrt_round_ss(f(k), f(a), f(b), f(rounding))
    case MM256_MASK_CMPGE_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm256_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case MM256_CMP_EPU8_MASK (a, b, imm8) =>
      _mm256_cmp_epu8_mask(f(a), f(b), f(imm8))
    case MM_FMADD_ROUND_SS (a, b, c, rounding) =>
      _mm_fmadd_round_ss(f(a), f(b), f(c), f(rounding))
    case MM256_CMPEQ_EPI32_MASK (a, b) =>
      _mm256_cmpeq_epi32_mask(f(a), f(b))
    case MM512_CVTEPU32_PD (a) =>
      _mm512_cvtepu32_pd(f(a))
    case MM_MASK_RSQRT28_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_rsqrt28_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASKZ_CVTPS_EPI32 (k, a) =>
      _mm256_maskz_cvtps_epi32(f(k), f(a))
    case MM512_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm512_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM256_MASK_CVTSEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtsepi32_epi16(f(src), f(k), f(a))
    case MM512_EXTRACTI32X4_EPI32 (a, imm8) =>
      _mm512_extracti32x4_epi32(f(a), f(imm8))
    case MM512_ROL_EPI32 (a, imm8) =>
      _mm512_rol_epi32(f(a), f(imm8))
    case MM512_MASKZ_UNPACKLO_PD (k, a, b) =>
      _mm512_maskz_unpacklo_pd(f(k), f(a), f(b))
    case MM512_MASKZ_SUB_EPI16 (k, a, b) =>
      _mm512_maskz_sub_epi16(f(k), f(a), f(b))
    case MM_MASKZ_ROR_EPI32 (k, a, imm8) =>
      _mm_maskz_ror_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_CVTT_ROUNDPS_EPU64 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epu64(f(src), f(k), f(a), f(sae))
    case MM256_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm256_maskz_cvttpd_epu64(f(k), f(a))
    case MM512_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm512_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case MM_RORV_EPI64 (a, b) =>
      _mm_rorv_epi64(f(a), f(b))
    case MM_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM_CMPGE_EPU32_MASK (a, b) =>
      _mm_cmpge_epu32_mask(f(a), f(b))
    case MM512_CVTT_ROUNDPS_EPU64 (a, sae) =>
      _mm512_cvtt_roundps_epu64(f(a), f(sae))
    case MM_MASKZ_CVTPH_PS (k, a) =>
      _mm_maskz_cvtph_ps(f(k), f(a))
    case MM512_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm512_maskz_subs_epi8(f(k), f(a), f(b))
    case MM_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case MM512_MAX_EPI8 (a, b) =>
      _mm512_max_epi8(f(a), f(b))
    case MM_MASKZ_SHUFFLE_EPI8 (k, a, b) =>
      _mm_maskz_shuffle_epi8(f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm512_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM_MASK_MOV_PD (src, k, a) =>
      _mm_mask_mov_pd(f(src), f(k), f(a))
    case MM256_MOVM_EPI8 (k) =>
      _mm256_movm_epi8(f(k))
    case MM256_MASKZ_MIN_EPU64 (k, a, b) =>
      _mm256_maskz_min_epu64(f(k), f(a), f(b))
    case MM_RSQRT28_ROUND_SS (a, b, rounding) =>
      _mm_rsqrt28_round_ss(f(a), f(b), f(rounding))
    case MM512_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi32(f(k), f(a), f(idx), f(b))
    case MM256_MASKZ_ROR_EPI32 (k, a, imm8) =>
      _mm256_maskz_ror_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_BLEND_EPI16 (k, a, b) =>
      _mm512_mask_blend_epi16(f(k), f(a), f(b))
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SHUFFLE_PD (a, b, imm8) =>
      _mm512_shuffle_pd(f(a), f(b), f(imm8))
    case MM_MASKZ_COMPRESS_EPI32 (k, a) =>
      _mm_maskz_compress_epi32(f(k), f(a))
    case MM_MASK_CMPEQ_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASK_RCP14_PS (src, k, a) =>
      _mm512_mask_rcp14_ps(f(src), f(k), f(a))
    case MM_MASKZ_RORV_EPI64 (k, a, b) =>
      _mm_maskz_rorv_epi64(f(k), f(a), f(b))
    case MM_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM_PERMUTEX2VAR_PS (a, idx, b) =>
      _mm_permutex2var_ps(f(a), f(idx), f(b))
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MIN_PS (src, k, a, b) =>
      _mm512_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM_MASK_DIV_PD (src, k, a, b) =>
      _mm_mask_div_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_AND_PD (src, k, a, b) =>
      _mm_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_shufflehi_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b) =>
      _mm_maskz_permutex2var_pd(f(k), f(a), f(idx), f(b))
    case MM256_MASK_TESTN_EPI8_MASK (k1, a, b) =>
      _mm256_mask_testn_epi8_mask(f(k1), f(a), f(b))
    case MM512_CVT_ROUNDEPU64_PD (a, rounding) =>
      _mm512_cvt_roundepu64_pd(f(a), f(rounding))

    case Reflect(MM512_CMPLE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU32_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU32_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PACKUS_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PACKUS_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_ROUND_PD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_ROUND_PD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MUL_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MUL_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_F64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_F64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU64_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU64_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ABS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ABS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_PD (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_PD (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_ROUND_SS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_ROUND_SS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI64X2_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CONFLICT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CONFLICT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_PD (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_PD (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_PS (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_PS (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_EPI16 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64SCATTER_PD (base_addr, mask, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD512_PD128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD512_PD128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RORV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RORV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI64 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_ROUND_PD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_ROUND_PD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ABS_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ABS_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PS (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PS (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROLV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROLV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADDUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADDUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI16 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_PD (e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_PD (f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_EPI16 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSS_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSS_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SQRT_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SQRT_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ROUND_PD (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ROUND_PD (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64SCATTER_PS (base_addr, mask, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AVG_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AVG_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTB_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTB_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPU8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPU8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT28_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT28_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI32X4_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI32X4_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROL_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROL_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROR_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROR_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPU64 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPU64 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RORV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RORV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPU64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPU64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI32 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROR_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROR_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BLEND_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BLEND_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RORV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RORV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_PS (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_PS (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLEHI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_PD (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU64_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU64_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512011 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_CMPLE_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_ALIGNR_EPI64(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASKZ_RSQRT28_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt28_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_CVTEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi16_epi8(${quote(a)})")
    case iDef@MM256_ALIGNR_EPI32(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK3_FMSUB_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_CVT_ROUNDEPU32_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepu32_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SET1_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_epi64(${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPD_EPU64(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epu64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_PACKUS_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_packus_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_FMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_RSQRT28_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt28_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_EXP2A23_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2a23_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MAX_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MIN_ROUND_PD(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASK_AVG_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRA_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_MUL_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mul_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_UNPACKHI_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLE_F64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_f64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTT_ROUNDSD_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_CVT_ROUNDEPU64_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepu64_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_ABS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_abs_epi32(${quote(a)})")
    case iDef@MM_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtusepi64_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_compressstoreu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_CVTEPU8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSD_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_u64(${quote(a)})")
    case iDef@MM256_MASK_UNPACKHI_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ADDS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ADDS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SET_PD(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_pd(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASK_CVTEPI8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_ROUND_SS(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASKZ_COMPRESS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MOV_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTPD_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_ADDS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_RSQRT14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTUSEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtusepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPU32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPI32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttps_epi32(${quote(a)})")
    case iDef@MM512_MOVEPI16_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movepi16_mask(${quote(a)})")
    case iDef@MM_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_OR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_or_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUBS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTEX_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti64x2_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTSD_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_i32(${quote(a)})")
    case iDef@MM_MASKZ_FNMSUB_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CONFLICT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_conflict_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ANDNOT_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_andnot_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTPD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_epi64(${quote(a)})")
    case iDef@MM512_MASK_PREFETCH_I32GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i32gather_pd(${quote(vindex)}, ${quote(mask)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)}, ${quote(hint)});")
    case iDef@MM_GETMANT_PD(a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getmant_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASKZ_PERMUTEX2VAR_PS(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex2var_ps(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_EXPAND_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expand_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK3_FMADDSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_CMPEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_epi16((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_CMPGT_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PD(base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(mask)}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_CASTPD512_PD128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castpd512_pd128(${quote(a)})")
    case iDef@MM_RANGE_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_range_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_MULLO_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mullo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_SET1_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_RORV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rorv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPNEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expandloadu_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_PERMUTEX2VAR_EPI64(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPI64_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi64_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_SRL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srl_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_COMPRESS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_compress_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsepi32_epi16(${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu8_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_RANGE_ROUND_PD(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_range_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTTPD_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU32_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu32_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MUL_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mul_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTPD_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtpd_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_ABS_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_abs_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_I64GATHER_PS(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_ps(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MASKZ_CVTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ANDNOT_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_andnot_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ROLV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rolv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTPD_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsepi32_epi8(${quote(a)})")
    case iDef@MM_CVTTSD_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_i32(${quote(a)})")
    case iDef@MM512_CVTEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi64_epi16(${quote(a)})")
    case iDef@MM256_MASKZ_PERMUTE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permute_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MADDUBS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_maddubs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MADD52LO_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadu_epi16(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_SETR_PD(e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr_pd(${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASKZ_PERMUTE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permute_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_compressstoreu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_epi16((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_CVTSS_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtss_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_EXPAND_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_SQRT_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sqrt_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_UNPACKHI_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSI64_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsi64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_REDUCE_ROUND_PD(a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_round_pd(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_PREFETCH_I64SCATTER_PS(base_addr, mask, vindex, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(mask)}, ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_AVG_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_avg_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RSQRT28_ROUND_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt28_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_BROADCASTB_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_MULHI_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCASTB_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastb_epi8(${quote(a)})")
    case iDef@MM_MASKZ_SQRT_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sqrt_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CMPGE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SRLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_CMP_EPU8_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epu8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_FMADD_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_CMPEQ_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPU32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32_pd(${quote(a)})")
    case iDef@MM_MASK_RSQRT28_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt28_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_CVTPS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtps_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTTPD_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTSEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtsepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXTRACTI32X4_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti32x4_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_ROL_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rol_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_UNPACKLO_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SUB_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ROR_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_ror_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTT_ROUNDPS_EPU64(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASKZ_CVTTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_MULHRS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RORV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rorv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRAI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMPGE_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTT_ROUNDPS_EPU64(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundps_epu64(${quote(a)}, ${quote(sae)})")
    case iDef@MM_MASKZ_CVTPH_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SUBS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RANGE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MAX_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SHUFFLE_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shuffle_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKHI_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MOV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MOVM_EPI8(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movm_epi8(${quote(k)})")
    case iDef@MM256_MASKZ_MIN_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RSQRT28_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt28_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi32(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ROR_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_ror_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_BLEND_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_blend_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_SHUFFLE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_COMPRESS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_compress_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPEQ_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RCP14_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_RORV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rorv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_PERMUTEX2VAR_PS(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtsepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_MIN_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_DIV_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_AND_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SHUFFLEHI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shufflehi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutex2var_pd(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASK_TESTN_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_testn_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVT_ROUNDEPU64_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepu64_pd(${quote(a)}, ${quote(rounding)})")
    case _ => super.emitNode(sym, rhs)
  }
}
