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

    
trait AVX512013 extends IntrinsicsBase {
  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_PS(a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_CMP_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ANDNOT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRAV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_FIXUPIMM_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute differences of packed unsigned 8-bit integers in "a" and
   * "b", then horizontally sum each consecutive 8 differences to produce eight
   * unsigned 16-bit integers, and pack these unsigned 16-bit integers in the low
   * 16 bits of 64-bit elements in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SAD_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MUL_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
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
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 64-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI64_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRLI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32 bits from masks "a" and "b", and store the 64-bit
   * result in "k".
   * a: __mmask64, b: __mmask64
   */
  case class MM512_KUNPACKD(a: Exp[Long], b: Exp[Long]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASKZ_RANGE_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_GETEXP_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASK_REDUCE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).  RM.
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_MUL_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_UNPACKLO_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUB_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper element from "b" to the upper
   * element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_ROUNDSCALE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMADDSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SLLV_EPI16(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_ABS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
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
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_ABS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_MASK_RANGE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_MIN_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m512, imm8: int
   */
  case class MM512_FPCLASS_PS_MASK(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence in reverse order.
   * d: float, c: float, b: float, a: float
   */
  case class MM512_SETR4_PS(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI32X4_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ROLV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SQRT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m512i
   */
  case class MM512_ABS_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI64(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMADDSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RSQRT28_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASKZ_MIN_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_MOVEHDUP_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Cast vector of type __m512i to type __m128i.
   * 	 This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512i
   */
  case class MM512_CASTSI512_SI128(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m256, imm8: int
   */
  case class MM512_MASKZ_INSERTF32X8(k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SHUFFLE_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask32, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MAX_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask8, b: __m512i, c: __m512i
   */
  case class MM512_MASK_MADD52HI_EPU64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASKZ_INSERTI64X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_RORV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Return vector of type __m512d with all elements set to zero.

   */
  case class MM512_SETZERO_PD() extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Test the lower single-precision (32-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k.
   * 	[fpclass_note]
   * a: __m128, imm8: int
   */
  case class MM_FPCLASS_SS_MASK(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RSQRT28_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 64-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from memory into "dst". 
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOADU_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_GETEXP_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SCALEF_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRL_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "b" to the upper element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASK_REDUCE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	"mem_addr" does not need to be aligned on any particular
   * boundary.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_ABS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RCP28_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULTISHIFT_EPI64_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ADD_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MADDUBS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_SQRT_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_I32(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MADD52HI_EPU64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_MAX_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_OR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI32_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m128i
   */
  case class MM_ABS_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI32_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I32GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUB_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper element from "a" to the upper element of "dst".
   * This intrinsic essentially calculates "floor(log2(x))" for the lower element.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_GETEXP_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "b" to the upper element of "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADD_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_SCALEF_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_RANGE_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 32-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_RCP28_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_LZCNT_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RCP14_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRAV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory. 
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: void*, a: __m512, mem_addrOffset: int
   */
  case class MM512_STOREU_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FNMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 16 packed single-precision (32-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint. 
   * 	"mem_addr"
   * must be aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void*, a: __m512, mem_addrOffset: int
   */
  case class MM512_STREAM_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_RSQRT28_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI32_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Converts integer "mask" into bitmask, storing the result in "dst".
   * mask: int
   */
  case class MM512_INT2MASK(mask: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 16-bit integers in "dst" with the supplied values in reverse order.
   * e31: short, e30: short, e29: short, e28: short, e27: short, e26: short, e25: short, e24: short, e23: short, e22: short, e21: short, e20: short, e19: short, e18: short, e17: short, e16: short, e15: short, e14: short, e13: short, e12: short, e11: short, e10: short, e9: short, e8: short, e7: short, e6: short, e5: short, e4: short, e3: short, e2: short, e1: short, e0: short
   */
  case class MM512_SET_EPI16(e31: Exp[Short], e30: Exp[Short], e29: Exp[Short], e28: Exp[Short], e27: Exp[Short], e26: Exp[Short], e25: Exp[Short], e24: Exp[Short], e23: Exp[Short], e22: Exp[Short], e21: Exp[Short], e20: Exp[Short], e19: Exp[Short], e18: Exp[Short], e17: Exp[Short], e16: Exp[Short], e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory. 
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * mem_addr: void*, a: __m512d, mem_addrOffset: int
   */
  case class MM512_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_EXPAND_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
      

  def _mm_getmant_ps(a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_GETMANT_PS(a, interv, sc)
  }
            
  def _mm_mask_add_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm512_cmp_epu64_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPU64_MASK(a, b, imm8)
  }
            
  def _mm_mask_andnot_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm_mask_srav_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI32(src, k, a, count)
  }
            
  def _mm512_fixupimm_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FIXUPIMM_ROUND_PD(a, b, c, imm8, rounding)
  }
            
  def _mm512_sad_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SAD_EPU8(a, b)
  }
            
  def _mm512_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm_cmp_epi16_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI16_MASK(a, b, imm8)
  }
            
  def _mm_maskz_mul_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MUL_PD(k, a, b)
  }
            
  def _mm_cmpneq_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_extracti32x8_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_EXTRACTI32X8_EPI32(a, imm8)
  }
            
  def _mm_mask_min_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU64(src, k, a, b)
  }
            
  def _mm512_maskz_adds_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm256_movepi64_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI64_MASK(a)
  }
            
  def _mm_cvtusepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI32(a)
  }
            
  def _mm512_subs_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPU16(a, b)
  }
            
  def _mm256_mask_srli_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI32(src, k, a, imm8)
  }
            
  def _mm512_kunpackd(a: Exp[Long], b: Exp[Long]): Exp[Long] = {
    MM512_KUNPACKD(a, b)
  }
            
  def _mm_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm_maskz_range_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_ROUND_SD(k, a, b, imm8, rounding)
  }
            
  def _mm512_mask_cvt_roundepi64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDEPI64_PD(src, k, a, rounding)
  }
            
  def _mm256_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm256_mask_cmple_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  def _mm_maskz_cvtepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI32(k, a)
  }
            
  def _mm_mask_ror_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROR_EPI64(src, k, a, imm8)
  }
            
  def _mm256_mask_getexp_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm512_mask_reduce_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm_maskz_sll_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm256_mask_mul_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MUL_PS(src, k, a, b)
  }
            
  def _mm256_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm256_mask_cmpeq_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_broadcastw_epi16(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTW_EPI16(a)
  }
            
  def _mm512_mask_unpacklo_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm256_mask_cmp_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPI16_MASK(k1, a, b, imm8)
  }
            
  def _mm512_sub_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUB_EPI8(a, b)
  }
            
  def _mm_mask_roundscale_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_SD(src, k, a, b, imm8)
  }
            
  def _mm512_fmaddsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMADDSUB_PS(a, b, c)
  }
            
  def _mm256_maskz_permutex_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEX_PD(k, a, imm8)
  }
            
  def _mm256_sllv_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SLLV_EPI16(a, count)
  }
            
  def _mm_cvti64_ss(a: Exp[__m128], b: Exp[Long]): Exp[__m128] = {
    MM_CVTI64_SS(a, b)
  }
            
  def _mm_mask_abs_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ABS_EPI64(src, k, a)
  }
            
  def _mm256_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm_mask_min_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm256_mmask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cmplt_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI64_MASK(a, b)
  }
            
  def _mm_mask_abs_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ABS_EPI32(src, k, a)
  }
            
  def _mm512_cvtepu64_pd(a: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPU64_PD(a)
  }
            
  def _mm_maskz_getmant_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETMANT_SS(k, a, b, interv, sc)
  }
            
  def _mm512_cvttps_epu64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTTPS_EPU64(a)
  }
            
  def _mm512_mask_range_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RANGE_PD(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_min_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MIN_PS(src, k, a, b)
  }
            
  def _mm512_maskz_cvt_roundps_epi64(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPS_EPI64(k, a, rounding)
  }
            
  def _mm_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_fpclass_ps_mask(a: Exp[__m512], imm8: Exp[Int]): Exp[Int] = {
    MM512_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm512_setr4_ps(d: Exp[Float], c: Exp[Float], b: Exp[Float], a: Exp[Float]): Exp[__m512] = {
    MM512_SETR4_PS(d, c, b, a)
  }
            
  def _mm512_maskz_extracti32x4_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8)
  }
            
  def _mm_rolv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ROLV_EPI32(a, b)
  }
            
  def _mm512_mask_sqrt_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm512_mask_max_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPU16(src, k, a, b)
  }
            
  def _mm512_abs_epi16(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_ABS_EPI16(a)
  }
            
  def _mm_cvt_roundsi32_ss(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDSI32_SS(a, b, rounding)
  }
            
  def _mm256_mask_cvtusepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI32_EPI8(src, k, a)
  }
            
  def _mm512_maskz_permutex2var_epi64(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b)
  }
            
  def _mm_maskz_slli_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_fixupimm_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm_fixupimm_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_SD(a, b, c, imm8)
  }
            
  def _mm512_maskz_fmaddsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMADDSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm_cmplt_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_cmplt_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_mask_cvtpd_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTPD_EPI64(src, k, a)
  }
            
  def _mm512_mask_cmple_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_maskz_rsqrt28_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT28_PD(k, a)
  }
            
  def _mm256_mask_broadcastw_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm512_maskz_load_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_min_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_MIN_ROUND_SS(k, a, b, sae)
  }
            
  def _mm512_maskz_broadcast_i64x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I64X2(k, a)
  }
            
  def _mm_mask_movehdup_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOVEHDUP_PS(src, k, a)
  }
            
  def _mm_cvtsepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI16(a)
  }
            
  def _mm256_test_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI64_MASK(a, b)
  }
            
  def _mm_maskz_set1_epi64(k: Exp[Int], a: Exp[Long]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI64(k, a)
  }
            
  def _mm256_cvttps_epu32(a: Exp[__m256]): Exp[__m256i] = {
    MM256_CVTTPS_EPU32(a)
  }
            
  def _mm512_castsi512_si128(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CASTSI512_SI128(a)
  }
            
  def _mm512_maskz_insertf32x8(k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_INSERTF32X8(k, a, b, imm8)
  }
            
  def _mm_mask_shuffle_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SHUFFLE_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_broadcast_f32x8(k: Exp[Int], a: Exp[__m256]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X8(k, a)
  }
            
  def _mm256_mask_permutex2var_epi8(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm512_max_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MAX_PS(a, b)
  }
            
  def _mm512_maskz_loadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_madd52hi_epu64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm512_maskz_inserti64x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI64X4(k, a, b, imm8)
  }
            
  def _mm256_mask_cvtepi64_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm256_mask_rorv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_RORV_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_avg_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm512_setzero_pd(): Exp[__m512d] = {
    MM512_SETZERO_PD()
  }
            
  def _mm_mmask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_min_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm_mask_cvtusepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_fpclass_ss_mask(a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_SS_MASK(a, imm8)
  }
            
  def _mm512_mask_rsqrt28_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RSQRT28_PD(src, k, a)
  }
            
  def _mm512_maskz_load_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_loadu_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_LOADU_PS(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_getexp_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_GETEXP_PS(src, k, a)
  }
            
  def _mm_maskz_scalef_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SCALEF_SS(k, a, b)
  }
            
  def _mm512_cvtpd_epu64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTPD_EPU64(a)
  }
            
  def _mm512_broadcast_f64x4(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_BROADCAST_F64X4(a)
  }
            
  def _mm_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_srl_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRL_EPI32(k, a, count)
  }
            
  def _mm_mask_reduce_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm256_cvtepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI16(a)
  }
            
  def _mm512_maskz_loadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mmask_i32gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_min_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_mov_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI32(k, a)
  }
            
  def _mm_mask_abs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ABS_EPI16(src, k, a)
  }
            
  def _mm_mask_rcp28_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP28_SS(src, k, a, b)
  }
            
  def _mm256_multishift_epi64_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm_mask_add_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ADD_PD(src, k, a, b)
  }
            
  def _mm512_mask_cvtepi8_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm_cvtepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI8(a)
  }
            
  def _mm512_maskz_maddubs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADDUBS_EPI16(k, a, b)
  }
            
  def _mm512_maskz_extracti64x2_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8)
  }
            
  def _mm512_mask_sqrt_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SQRT_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm_cvttss_i32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTTSS_I32(a)
  }
            
  def _mm512_madd52hi_epu64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD52HI_EPU64(a, b, c)
  }
            
  def _mm_broadcastmb_epi64(k: Exp[Int]): Exp[__m128i] = {
    MM_BROADCASTMB_EPI64(k)
  }
            
  def _mm512_mask_min_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_max_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm_mask_max_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI8(src, k, a, b)
  }
            
  def _mm256_mask_or_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_OR_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_cvtusepi32_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTUSEPI32_EPI8(k, a)
  }
            
  def _mm_abs_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_ABS_EPI64(a)
  }
            
  def _mm_cvttpd_epi64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPI64(a)
  }
            
  def _mm512_cvtepi32_epi16(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTEPI32_EPI16(a)
  }
            
  def _mm256_extractf64x2_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_EXTRACTF64X2_PD(a, imm8)
  }
            
  def _mm256_mask_adds_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm256_mmask_i32gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI32_EPI16(k, a)
  }
            
  def _mm_mask_fmsub_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUB_SD(a, k, b, c)
  }
            
  def _mm_mask_getexp_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_GETEXP_SD(src, k, a, b)
  }
            
  def _mm_mask_broadcastw_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm_mask_srl_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_getmant_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_SD(k, a, b, interv, sc)
  }
            
  def _mm_maskz_andnot_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm512_maskz_srai_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm256_mask_add_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADD_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_i64gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_min_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU32(k, a, b)
  }
            
  def _mm_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_scalef_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_SCALEF_PD(a, b)
  }
            
  def _mm512_cmpge_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGE_EPI64_MASK(a, b)
  }
            
  def _mm512_maskz_range_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RANGE_ROUND_PS(k, a, b, imm8, rounding)
  }
            
  def _mm_mmask_i32gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_rcp28_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RCP28_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm256_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm_lzcnt_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_LZCNT_EPI64(a)
  }
            
  def _mm512_mask_rcp14_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RCP14_PD(src, k, a)
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_srav_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRAV_EPI16(a, count)
  }
            
  def _mm512_storeu_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STOREU_PS(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtepi64_epi32(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTEPI64_EPI32(a)
  }
            
  def _mm_fnmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FNMADD_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm256_mask_cmpeq_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_stream_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STREAM_PS(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_rsqrt28_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RSQRT28_ROUND_PD(a, rounding)
  }
            
  def _mm512_mask_max_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_cvtepi32_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTEPI32_EPI8(k, a)
  }
            
  def _mm512_mask_cvtpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm512_int2mask(mask: Exp[Int]): Exp[Int] = {
    MM512_INT2MASK(mask)
  }
            
  def _mm512_set_epi16(e31: Exp[Short], e30: Exp[Short], e29: Exp[Short], e28: Exp[Short], e27: Exp[Short], e26: Exp[Short], e25: Exp[Short], e24: Exp[Short], e23: Exp[Short], e22: Exp[Short], e21: Exp[Short], e20: Exp[Short], e19: Exp[Short], e18: Exp[Short], e17: Exp[Short], e16: Exp[Short], e15: Exp[Short], e14: Exp[Short], e13: Exp[Short], e12: Exp[Short], e11: Exp[Short], e10: Exp[Short], e9: Exp[Short], e8: Exp[Short], e7: Exp[Short], e6: Exp[Short], e5: Exp[Short], e4: Exp[Short], e3: Exp[Short], e2: Exp[Short], e1: Exp[Short], e0: Exp[Short]): Exp[__m512i] = {
    MM512_SET_EPI16(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm512_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STOREU_PD(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_expand_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_EXPAND_EPI32(k, a)
  }
            
  def _mm256_mask_cvttps_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm512_mask_cmple_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_GETMANT_PS (a, interv, sc) =>
      _mm_getmant_ps(f(a), f(interv), f(sc))
    case MM_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM512_CMP_EPU64_MASK (a, b, imm8) =>
      _mm512_cmp_epu64_mask(f(a), f(b), f(imm8))
    case MM_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_SRAV_EPI32 (src, k, a, count) =>
      _mm_mask_srav_epi32(f(src), f(k), f(a), f(count))
    case MM512_FIXUPIMM_ROUND_PD (a, b, c, imm8, rounding) =>
      _mm512_fixupimm_round_pd(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_SAD_EPU8 (a, b) =>
      _mm512_sad_epu8(f(a), f(b))
    case MM512_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm512_maskz_cvtpd_epu64(f(k), f(a))
    case MM_CMP_EPI16_MASK (a, b, imm8) =>
      _mm_cmp_epi16_mask(f(a), f(b), f(imm8))
    case MM_MASKZ_MUL_PD (k, a, b) =>
      _mm_maskz_mul_pd(f(k), f(a), f(b))
    case MM_CMPNEQ_EPI8_MASK (a, b) =>
      _mm_cmpneq_epi8_mask(f(a), f(b))
    case MM512_EXTRACTI32X8_EPI32 (a, imm8) =>
      _mm512_extracti32x8_epi32(f(a), f(imm8))
    case MM_MASK_MIN_EPU64 (src, k, a, b) =>
      _mm_mask_min_epu64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm512_maskz_adds_epu8(f(k), f(a), f(b))
    case MM256_MOVEPI64_MASK (a) =>
      _mm256_movepi64_mask(f(a))
    case MM_CVTUSEPI64_EPI32 (a) =>
      _mm_cvtusepi64_epi32(f(a))
    case MM512_SUBS_EPU16 (a, b) =>
      _mm512_subs_epu16(f(a), f(b))
    case MM256_MASK_SRLI_EPI32 (src, k, a, imm8) =>
      _mm256_mask_srli_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_KUNPACKD (a, b) =>
      _mm512_kunpackd(f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM_MASKZ_RANGE_ROUND_SD (k, a, b, imm8, rounding) =>
      _mm_maskz_range_round_sd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_MASK_CVT_ROUNDEPI64_PD (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi64_pd(f(src), f(k), f(a), f(rounding))
    case MM256_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm256_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi8_mask(f(k1), f(a), f(b))
    case MM_MASKZ_CVTEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtepi64_epi32(f(k), f(a))
    case MM_MASK_ROR_EPI64 (src, k, a, imm8) =>
      _mm_mask_ror_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_GETEXP_PS (src, k, a) =>
      _mm256_mask_getexp_ps(f(src), f(k), f(a))
    case MM512_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm512_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm_maskz_sll_epi16(f(k), f(a), f(count))
    case MM256_MASK_MUL_PS (src, k, a, b) =>
      _mm256_mask_mul_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm256_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK_CMPEQ_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi64_mask(f(k1), f(a), f(b))
    case MM512_BROADCASTW_EPI16 (a) =>
      _mm512_broadcastw_epi16(f(a))
    case MM512_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm512_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM256_MASK_CMP_EPI16_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epi16_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_SUB_EPI8 (a, b) =>
      _mm512_sub_epi8(f(a), f(b))
    case MM_MASK_ROUNDSCALE_SD (src, k, a, b, imm8) =>
      _mm_mask_roundscale_sd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_FMADDSUB_PS (a, b, c) =>
      _mm512_fmaddsub_ps(f(a), f(b), f(c))
    case MM256_MASKZ_PERMUTEX_PD (k, a, imm8) =>
      _mm256_maskz_permutex_pd(f(k), f(a), f(imm8))
    case MM256_SLLV_EPI16 (a, count) =>
      _mm256_sllv_epi16(f(a), f(count))
    case MM_CVTI64_SS (a, b) =>
      _mm_cvti64_ss(f(a), f(b))
    case MM_MASK_ABS_EPI64 (src, k, a) =>
      _mm_mask_abs_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm256_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case MM_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm_mask_min_epu16(f(src), f(k), f(a), f(b))
    case iDef@MM256_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CMPLT_EPI64_MASK (a, b) =>
      _mm_cmplt_epi64_mask(f(a), f(b))
    case MM_MASK_ABS_EPI32 (src, k, a) =>
      _mm_mask_abs_epi32(f(src), f(k), f(a))
    case MM512_CVTEPU64_PD (a) =>
      _mm512_cvtepu64_pd(f(a))
    case MM_MASKZ_GETMANT_SS (k, a, b, interv, sc) =>
      _mm_maskz_getmant_ss(f(k), f(a), f(b), f(interv), f(sc))
    case MM512_CVTTPS_EPU64 (a) =>
      _mm512_cvttps_epu64(f(a))
    case MM512_MASK_RANGE_PD (src, k, a, b, imm8) =>
      _mm512_mask_range_pd(f(src), f(k), f(a), f(b), f(imm8))
    case iDef@MM512_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MIN_PS (src, k, a, b) =>
      _mm256_mask_min_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPS_EPI64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_epi64(f(k), f(a), f(rounding))
    case iDef@MM_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_FPCLASS_PS_MASK (a, imm8) =>
      _mm512_fpclass_ps_mask(f(a), f(imm8))
    case MM512_SETR4_PS (d, c, b, a) =>
      _mm512_setr4_ps(f(d), f(c), f(b), f(a))
    case MM512_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8) =>
      _mm512_maskz_extracti32x4_epi32(f(k), f(a), f(imm8))
    case MM_ROLV_EPI32 (a, b) =>
      _mm_rolv_epi32(f(a), f(b))
    case MM512_MASK_SQRT_PD (src, k, a) =>
      _mm512_mask_sqrt_pd(f(src), f(k), f(a))
    case MM512_MASK_MAX_EPU16 (src, k, a, b) =>
      _mm512_mask_max_epu16(f(src), f(k), f(a), f(b))
    case MM512_ABS_EPI16 (a) =>
      _mm512_abs_epi16(f(a))
    case MM_CVT_ROUNDSI32_SS (a, b, rounding) =>
      _mm_cvt_roundsi32_ss(f(a), f(b), f(rounding))
    case MM256_MASK_CVTUSEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi32_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi64(f(k), f(a), f(idx), f(b))
    case MM_MASKZ_SLLI_EPI64 (k, a, imm8) =>
      _mm_maskz_slli_epi64(f(k), f(a), f(imm8))
    case MM_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM_FIXUPIMM_SD (a, b, c, imm8) =>
      _mm_fixupimm_sd(f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_FMADDSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmaddsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM_CMPLT_EPI16_MASK (a, b) =>
      _mm_cmplt_epi16_mask(f(a), f(b))
    case MM512_MASK_CMPLT_EPI32_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi32_mask(f(k1), f(a), f(b))
    case MM256_MASK_CVTPD_EPI64 (src, k, a) =>
      _mm256_mask_cvtpd_epi64(f(src), f(k), f(a))
    case MM512_MASK_CMPLE_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi64_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_RSQRT28_PD (k, a) =>
      _mm512_maskz_rsqrt28_pd(f(k), f(a))
    case MM256_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm256_mask_broadcastw_epi16(f(src), f(k), f(a))
    case iDef@MM512_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MIN_ROUND_SS (k, a, b, sae) =>
      _mm_maskz_min_round_ss(f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_BROADCAST_I64X2 (k, a) =>
      _mm512_maskz_broadcast_i64x2(f(k), f(a))
    case MM_MASK_MOVEHDUP_PS (src, k, a) =>
      _mm_mask_movehdup_ps(f(src), f(k), f(a))
    case MM_CVTSEPI64_EPI16 (a) =>
      _mm_cvtsepi64_epi16(f(a))
    case MM256_TEST_EPI64_MASK (a, b) =>
      _mm256_test_epi64_mask(f(a), f(b))
    case MM_MASKZ_SET1_EPI64 (k, a) =>
      _mm_maskz_set1_epi64(f(k), f(a))
    case MM256_CVTTPS_EPU32 (a) =>
      _mm256_cvttps_epu32(f(a))
    case MM512_CASTSI512_SI128 (a) =>
      _mm512_castsi512_si128(f(a))
    case MM512_MASKZ_INSERTF32X8 (k, a, b, imm8) =>
      _mm512_maskz_insertf32x8(f(k), f(a), f(b), f(imm8))
    case MM_MASK_SHUFFLE_EPI8 (src, k, a, b) =>
      _mm_mask_shuffle_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_BROADCAST_F32X8 (k, a) =>
      _mm512_maskz_broadcast_f32x8(f(k), f(a))
    case MM256_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM512_MAX_PS (a, b) =>
      _mm512_max_ps(f(a), f(b))
    case iDef@MM512_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm512_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_INSERTI64X4 (k, a, b, imm8) =>
      _mm512_maskz_inserti64x4(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_CVTEPI64_PD (src, k, a) =>
      _mm256_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM256_MASK_RORV_EPI32 (src, k, a, b) =>
      _mm256_mask_rorv_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm256_maskz_avg_epu16(f(k), f(a), f(b))
    case MM512_SETZERO_PD () =>
      _mm512_setzero_pd()
    case iDef@MM_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm512_maskz_min_epi16(f(k), f(a), f(b))
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_FPCLASS_SS_MASK (a, imm8) =>
      _mm_fpclass_ss_mask(f(a), f(imm8))
    case MM512_MASK_RSQRT28_PD (src, k, a) =>
      _mm512_mask_rsqrt28_pd(f(src), f(k), f(a))
    case iDef@MM512_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_LOADU_PS (mem_addr, mem_addrOffset) =>
      _mm512_loadu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_GETEXP_PS (src, k, a) =>
      _mm_mask_getexp_ps(f(src), f(k), f(a))
    case MM_MASKZ_SCALEF_SS (k, a, b) =>
      _mm_maskz_scalef_ss(f(k), f(a), f(b))
    case MM512_CVTPD_EPU64 (a) =>
      _mm512_cvtpd_epu64(f(a))
    case MM512_BROADCAST_F64X4 (a) =>
      _mm512_broadcast_f64x4(f(a))
    case MM_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_SRL_EPI32 (k, a, count) =>
      _mm256_maskz_srl_epi32(f(k), f(a), f(count))
    case MM_MASK_REDUCE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_reduce_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM256_CVTEPI64_EPI16 (a) =>
      _mm256_cvtepi64_epi16(f(a))
    case iDef@MM512_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_MIN_EPI64 (src, k, a, b) =>
      _mm_mask_min_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MOV_EPI32 (k, a) =>
      _mm512_maskz_mov_epi32(f(k), f(a))
    case MM_MASK_ABS_EPI16 (src, k, a) =>
      _mm_mask_abs_epi16(f(src), f(k), f(a))
    case MM_MASK_RCP28_SS (src, k, a, b) =>
      _mm_mask_rcp28_ss(f(src), f(k), f(a), f(b))
    case MM256_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm256_multishift_epi64_epi8(f(a), f(b))
    case MM_MASK_ADD_PD (src, k, a, b) =>
      _mm_mask_add_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm512_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM_CVTEPI64_EPI8 (a) =>
      _mm_cvtepi64_epi8(f(a))
    case MM512_MASKZ_MADDUBS_EPI16 (k, a, b) =>
      _mm512_maskz_maddubs_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8) =>
      _mm512_maskz_extracti64x2_epi64(f(k), f(a), f(imm8))
    case MM512_MASK_SQRT_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_sqrt_round_ps(f(src), f(k), f(a), f(rounding))
    case MM_CVTTSS_I32 (a) =>
      _mm_cvttss_i32(f(a))
    case MM512_MADD52HI_EPU64 (a, b, c) =>
      _mm512_madd52hi_epu64(f(a), f(b), f(c))
    case MM_BROADCASTMB_EPI64 (k) =>
      _mm_broadcastmb_epi64(f(k))
    case MM512_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm512_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASK_MAX_PD (src, k, a, b) =>
      _mm512_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_MAX_EPI8 (src, k, a, b) =>
      _mm_mask_max_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASK_OR_EPI32 (src, k, a, b) =>
      _mm256_mask_or_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTUSEPI32_EPI8 (k, a) =>
      _mm512_maskz_cvtusepi32_epi8(f(k), f(a))
    case MM_ABS_EPI64 (a) =>
      _mm_abs_epi64(f(a))
    case MM_CVTTPD_EPI64 (a) =>
      _mm_cvttpd_epi64(f(a))
    case MM512_CVTEPI32_EPI16 (a) =>
      _mm512_cvtepi32_epi16(f(a))
    case MM256_EXTRACTF64X2_PD (a, imm8) =>
      _mm256_extractf64x2_pd(f(a), f(imm8))
    case MM256_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm256_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case iDef@MM256_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtepi32_epi16(f(k), f(a))
    case MM_MASK_FMSUB_SD (a, k, b, c) =>
      _mm_mask_fmsub_sd(f(a), f(k), f(b), f(c))
    case MM_MASK_GETEXP_SD (src, k, a, b) =>
      _mm_mask_getexp_sd(f(src), f(k), f(a), f(b))
    case MM_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm_mask_broadcastw_epi16(f(src), f(k), f(a))
    case MM_MASK_SRL_EPI16 (src, k, a, count) =>
      _mm_mask_srl_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_GETMANT_SD (k, a, b, interv, sc) =>
      _mm_maskz_getmant_sd(f(k), f(a), f(b), f(interv), f(sc))
    case MM_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm_maskz_andnot_pd(f(k), f(a), f(b))
    case MM512_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm512_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM256_MASK_ADD_EPI64 (src, k, a, b) =>
      _mm256_mask_add_epi64(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MIN_EPU32 (k, a, b) =>
      _mm_maskz_min_epu32(f(k), f(a), f(b))
    case MM_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM512_SCALEF_PD (a, b) =>
      _mm512_scalef_pd(f(a), f(b))
    case MM512_CMPGE_EPI64_MASK (a, b) =>
      _mm512_cmpge_epi64_mask(f(a), f(b))
    case MM512_MASKZ_RANGE_ROUND_PS (k, a, b, imm8, rounding) =>
      _mm512_maskz_range_round_ps(f(k), f(a), f(b), f(imm8), f(rounding))
    case iDef@MM_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_RCP28_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_rcp28_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm256_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case MM_LZCNT_EPI64 (a) =>
      _mm_lzcnt_epi64(f(a))
    case MM512_MASK_RCP14_PD (src, k, a) =>
      _mm512_mask_rcp14_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SRAV_EPI16 (a, count) =>
      _mm_srav_epi16(f(a), f(count))
    case iDef@MM512_STOREU_PS (mem_addr, a, mem_addrOffset) =>
      _mm512_storeu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTEPI64_EPI32 (a) =>
      _mm512_cvtepi64_epi32(f(a))
    case MM_FNMADD_ROUND_SS (a, b, c, rounding) =>
      _mm_fnmadd_round_ss(f(a), f(b), f(c), f(rounding))
    case MM256_MASK_CMPEQ_EPU64_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epu64_mask(f(k1), f(a), f(b))
    case iDef@MM512_STREAM_PS (mem_addr, a, mem_addrOffset) =>
      _mm512_stream_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_RSQRT28_ROUND_PD (a, rounding) =>
      _mm512_rsqrt28_round_pd(f(a), f(rounding))
    case MM512_MASK_MAX_EPI8 (src, k, a, b) =>
      _mm512_mask_max_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPI32_EPI8 (k, a) =>
      _mm512_maskz_cvtepi32_epi8(f(k), f(a))
    case MM512_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm512_mask_cvtpd_epi32(f(src), f(k), f(a))
    case MM512_INT2MASK (mask) =>
      _mm512_int2mask(f(mask))
    case MM512_SET_EPI16 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi16(f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case iDef@MM512_STOREU_PD (mem_addr, a, mem_addrOffset) =>
      _mm512_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_EXPAND_EPI32 (k, a) =>
      _mm512_maskz_expand_epi32(f(k), f(a))
    case MM256_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm256_mask_cvttps_epi32(f(src), f(k), f(a))
    case MM512_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmple_epi8_mask(f(k1), f(a), f(b))

    case Reflect(MM_GETMANT_PS (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_PS (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPU64_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPU64_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_ROUND_PD (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_ROUND_PD (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SAD_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SAD_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI32X8_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI32X8_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_ROUND_SD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_ROUND_SD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI64_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI64_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROR_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROR_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MUL_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MUL_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTW_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTW_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPI16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPI16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_SD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_SD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI64_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI64_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ABS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ABS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ABS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ABS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_SS (k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_SS (f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_EPI64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_PS (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_PS (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI32X4_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROLV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ROLV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ABS_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ABS_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI64 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_SD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_SD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_ROUND_SS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_ROUND_SS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVEHDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVEHDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI512_SI128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI512_SI128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF32X8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF32X8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI64X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI64X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RORV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RORV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_PD (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_SS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_SS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADU_PS (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F64X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F64X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ABS_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ABS_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADDUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADDUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI64X2_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTMB_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTMB_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_OR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_OR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTF64X2_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTF64X2_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_SD (k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_SD (f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_ROUND_PS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_ROUND_PS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LZCNT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_LZCNT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRAV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRAV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STOREU_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STOREU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INT2MASK (mask), u, es) =>
      reflectMirrored(Reflect(MM512_INT2MASK (f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI16 (e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI16 (f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STOREU_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512013 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_GETMANT_PS(a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getmant_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_MASK_ADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMP_EPU64_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epu64_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_ANDNOT_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRAV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srav_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_FIXUPIMM_ROUND_PD(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_SAD_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sad_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_EPI16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MUL_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_EXTRACTI32X8_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti32x8_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MIN_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ADDS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MOVEPI64_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movepi64_mask(${quote(a)})")
    case iDef@MM_CVTUSEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi64_epi32(${quote(a)})")
    case iDef@MM512_SUBS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subs_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SRLI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_KUNPACKD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kunpackd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RANGE_ROUND_SD(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_range_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVT_ROUNDEPI64_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ROR_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_ror_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_GETEXP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_REDUCE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SLL_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_MUL_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mul_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_FNMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CMPEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCASTW_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastw_epi16(${quote(a)})")
    case iDef@MM512_MASK_UNPACKLO_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMP_EPI16_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_SUB_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sub_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ROUNDSCALE_SD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_roundscale_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_FMADDSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_PERMUTEX_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_SLLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sllv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM_CVTI64_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvti64_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ABS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_abs_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_MIN_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_CMPLT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ABS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_abs_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTEPU64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu64_pd(${quote(a)})")
    case iDef@MM_MASKZ_GETMANT_SS(k, a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getmant_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_CVTTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttps_epu64(${quote(a)})")
    case iDef@MM512_MASK_RANGE_PD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_range_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_load_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_MIN_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPS_EPI64(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_epi64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_FPCLASS_PS_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_SETR4_PS(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr4_ps(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM512_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti32x4_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_ROLV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rolv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SQRT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_MAX_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ABS_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_abs_epi16(${quote(a)})")
    case iDef@MM_CVT_ROUNDSI32_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsi32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTUSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi64(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASKZ_SLLI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_slli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_FIXUPIMM_SD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FMADDSUB_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_CMPLT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPLT_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTPD_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPLE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RSQRT28_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rsqrt28_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_BROADCASTW_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_load_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_MIN_ROUND_SS(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_BROADCAST_I64X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_i64x2(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MOVEHDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_movehdup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi64_epi16(${quote(a)})")
    case iDef@MM256_TEST_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SET1_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_set1_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CVTTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttps_epu32(${quote(a)})")
    case iDef@MM512_CASTSI512_SI128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castsi512_si128(${quote(a)})")
    case iDef@MM512_MASKZ_INSERTF32X8(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_insertf32x8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_SHUFFLE_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shuffle_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_BROADCAST_F32X8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MAX_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_MADD52HI_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_INSERTI64X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_inserti64x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTEPI64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_RORV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rorv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_AVG_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SETZERO_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setzero_pd()")
    case iDef@MM_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM512_MASKZ_MIN_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtusepi64_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_FPCLASS_SS_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fpclass_ss_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_RSQRT28_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt28_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_load_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_LOADU_PS(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadu_ps((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_GETEXP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_SCALEF_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpd_epu64(${quote(a)})")
    case iDef@MM512_BROADCAST_F64X4(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_f64x4(${quote(a)})")
    case iDef@MM_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SRL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srl_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_REDUCE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_reduce_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_CVTEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi64_epi16(${quote(a)})")
    case iDef@MM512_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i32gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_MIN_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOV_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ABS_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_abs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_RCP28_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp28_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MULTISHIFT_EPI64_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ADD_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi64_epi8(${quote(a)})")
    case iDef@MM512_MASKZ_MADDUBS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_maddubs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti64x2_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SQRT_ROUND_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sqrt_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTTSS_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_i32(${quote(a)})")
    case iDef@MM512_MADD52HI_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_BROADCASTMB_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastmb_epi64(${quote(k)})")
    case iDef@MM512_MASK_MIN_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MAX_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_OR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_or_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTUSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtusepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_ABS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_epi64(${quote(a)})")
    case iDef@MM_CVTTPD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttpd_epi64(${quote(a)})")
    case iDef@MM512_CVTEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32_epi16(${quote(a)})")
    case iDef@MM256_EXTRACTF64X2_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extractf64x2_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_ADDS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i32gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MASKZ_CVTEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FMSUB_SD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_GETEXP_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BROADCASTW_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SRL_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srl_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_GETMANT_SD(k, a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getmant_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_MASKZ_ANDNOT_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRAI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_ADD_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASKZ_MIN_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_TEST_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SCALEF_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scalef_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPGE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpge_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RANGE_ROUND_PS(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_range_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MMASK_I32GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i32gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_RCP28_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp28_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_LZCNT_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_lzcnt_epi64(${quote(a)})")
    case iDef@MM512_MASK_RCP14_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_SRAV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srav_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_STOREU_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storeu_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_CVTEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi64_epi32(${quote(a)})")
    case iDef@MM_FNMADD_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CMPEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_STREAM_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_stream_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_RSQRT28_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt28_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MAX_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_INT2MASK(mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_int2mask(${quote(mask)})")
    case iDef@MM512_SET_EPI16(e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_epi16(${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM512_STOREU_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_storeu_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM512_MASKZ_EXPAND_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
