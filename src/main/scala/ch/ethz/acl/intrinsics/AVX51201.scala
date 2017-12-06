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

    
trait AVX51201 extends IntrinsicsBase {
  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI32X4_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and set the upper element of "dst" to zero. "mem_addr" must
   * be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * k: __mmask8, mem_addr: const double*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_SD[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SLLI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_ANDNOT_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_ROUNDSCALE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_GETEXP_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI64(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADD_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Load a single-precision (32-bit) floating-point element from memory into the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and set the upper elements of "dst" to zero. "mem_addr"
   * must be aligned on a 16-byte boundary or a general-protection exception may be
   * generated.
   * k: __mmask8, mem_addr: const float*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_SS[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "idx" when
   * the corresponding mask bit is not set)
   * a: __m512d, idx: __m512i, k: __mmask8, b: __m512d
   */
  case class MM512_MASK2_PERMUTEX2VAR_PD(a: Exp[__m512d], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI64_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k" using
   * zeromask "k1" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MASK_CMP_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m128d, b: __m128d
   */
  case class MM_RCP28_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_INSERTI32X4(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASK_SRLI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_PACKS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AND_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADDSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_ADD_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASK_MIN_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 8-bit integers from "a" into "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i
   */
  case class MM256_MASK_MOV_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_MOVEHDUP_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASK_SHUFFLELO_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_SCALEF_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_EXPAND_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst".
   * a: __m512, b: __m512i
   */
  case class MM512_PERMUTEVAR_PS(a: Exp[__m512], b: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMADDSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_ANDNOT_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SLL_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_MOVELDUP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m128d, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTW_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RSQRT28_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Broadcast 64-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __int64
   */
  case class MM256_MASKZ_SET1_EPI64(k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CONFLICT_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst".
   * a: char
   */
  case class MM512_SET1_EPI8(a: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SLLI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Move packed 32-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_MOV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_CMP_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULLO_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 32-bit integers from memory using 64-bit indices. 32-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_EPI32[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROR_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_GETEXP_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, b: __m128i, c: __m128i
   */
  case class MM_MASK_MADD52LO_EPU64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMSUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 32-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 32-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst". "scale" should be 1, 2, 4 or 8.
   * vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I32GATHER_EPI64[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMADDSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MUL_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FNMSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI64_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_ROUNDSCALE_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROL_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 32-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m256, mem_addrOffset: int
   */
  case class MM256_MASK_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_RCP14_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23.
   * a: __m512d
   */
  case class MM512_EXP2A23_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_AND_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEVAR_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI8(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI64_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMADDSUB_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 32-bit integer "b" to a single-precision (32-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * 
   * 	[round_note]
   * a: __m128, b: unsigned int, rounding: int
   */
  case class MM_CVT_ROUNDU32_SS(a: Exp[__m128], b: Exp[UInt], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_MASK_CMP_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k" using zeromask "k1" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FNMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m256, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_U32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, idx: __m512i, k: __mmask64, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI8(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Long], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * 	[round_note]
   * a: __m512, imm8: int, rounding: int
   */
  case class MM512_REDUCE_ROUND_PS(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_ABS_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SLL_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_MIN_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128d, b: __m128d, sae: int
   */
  case class MM_MAX_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM512_MASKZ_CVTEPU16_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTSEPI64_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROL_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_GETEXP_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_F64X2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_RSQRT28_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
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
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMADDSUB_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_AND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTEPI32_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPU32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RCP28_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_DBSAD_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASK_RANGE_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM256_LZCNT_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
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
   * src: __m128, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
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
   * 	[getmant_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 8-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI8(k: Exp[Long], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst", and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * a: __m128, b: __m128
   */
  case class MM_GETEXP_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_extracti32x4_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm_maskz_load_sd[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_SD(k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_permutexvar_pd(src: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_PERMUTEXVAR_PD(src, k, idx, a)
  }
            
  def _mm512_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm_mask_slli_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SLLI_EPI64(src, k, a, imm8)
  }
            
  def _mm512_andnot_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_ANDNOT_PS(a, b)
  }
            
  def _mm_mask_roundscale_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_ROUNDSCALE_PS(src, k, a, imm8)
  }
            
  def _mm512_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm_getexp_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_GETEXP_ROUND_SD(a, b, rounding)
  }
            
  def _mm512_maskz_permutexvar_epi64(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI64(k, idx, a)
  }
            
  def _mm_mask_compress_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_COMPRESS_EPI64(src, k, a)
  }
            
  def _mm_cvttps_epu32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPU32(a)
  }
            
  def _mm256_maskz_add_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADD_EPI32(k, a, b)
  }
            
  def _mm512_maskz_cvt_roundepi64_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDEPI64_PS(k, a, rounding)
  }
            
  def _mm512_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_min_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm_mask_cvtepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI8(src, k, a)
  }
            
  def _mm_maskz_load_ss[A[_], U:Integral](k: Exp[Int], mem_addr: Exp[A[Float]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_SS(k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cmpeq_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_maskz_subs_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm_mask_srlv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI32(src, k, a, count)
  }
            
  def _mm512_mask2_permutex2var_pd(a: Exp[__m512d], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK2_PERMUTEX2VAR_PD(a, idx, k, b)
  }
            
  def _mm512_maskz_cvtusepi64_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTUSEPI64_EPI8(k, a)
  }
            
  def _mm_mask_cmp_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPU8_MASK(k1, a, b, imm8)
  }
            
  def _mm_rcp28_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP28_SD(a, b)
  }
            
  def _mm512_cmpneq_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPNEQ_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_mulhi_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPU16(src, k, a, b)
  }
            
  def _mm512_inserti32x4(a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI32X4(a, b, imm8)
  }
            
  def _mm256_mask_srli_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_mask_packs_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PACKS_EPI32(src, k, a, b)
  }
            
  def _mm512_broadcast_i32x4(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X4(a)
  }
            
  def _mm_maskz_and_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AND_EPI32(k, a, b)
  }
            
  def _mm_maskz_fmaddsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADDSUB_PS(k, a, b, c)
  }
            
  def _mm256_mask_cvttps_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm_cvtps_epu32(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPU32(a)
  }
            
  def _mm256_mask_add_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_ADD_PS(src, k, a, b)
  }
            
  def _mm512_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_min_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MIN_ROUND_PD(src, k, a, b, sae)
  }
            
  def _mm_maskz_subs_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm_cmplt_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_mov_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MOV_EPI8(src, k, a)
  }
            
  def _mm256_maskz_movehdup_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MOVEHDUP_PS(k, a)
  }
            
  def _mm_mask_subs_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm512_mask_shufflelo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm256_scalef_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_SCALEF_PD(a, b)
  }
            
  def _mm256_mask_cmplt_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_mask_testn_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm512_cvtsepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTSEPI16_EPI8(a)
  }
            
  def _mm512_maskz_expand_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_EXPAND_EPI64(k, a)
  }
            
  def _mm256_cvtusepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI8(a)
  }
            
  def _mm512_permutevar_ps(a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_PERMUTEVAR_PS(a, b)
  }
            
  def _mm512_maskz_fmaddsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMADDSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm256_maskz_alignr_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI8(k, a, b, count)
  }
            
  def _mm512_andnot_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_ANDNOT_PD(a, b)
  }
            
  def _mm512_sll_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SLL_EPI16(a, count)
  }
            
  def _mm512_mask_moveldup_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MOVELDUP_PS(src, k, a)
  }
            
  def _mm_mmask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m128d], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm_maskz_rsqrt28_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT28_SD(k, a, b)
  }
            
  def _mm256_mask_permutex2var_ps(a: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_PERMUTEX2VAR_PS(a, k, idx, b)
  }
            
  def _mm256_maskz_set1_epi64(k: Exp[Int], a: Exp[Long]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI64(k, a)
  }
            
  def _mm512_maskz_conflict_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_CONFLICT_EPI64(k, a)
  }
            
  def _mm512_set1_epi8(a: Exp[Byte]): Exp[__m512i] = {
    MM512_SET1_EPI8(a)
  }
            
  def _mm_mask_unpackhi_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm256_mask_slli_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SLLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_mov_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MOV_EPI32(src, k, a)
  }
            
  def _mm512_maskz_compress_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_COMPRESS_PD(k, a)
  }
            
  def _mm512_mask_broadcast_i32x8(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X8(src, k, a)
  }
            
  def _mm256_mask_unpackhi_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_multishift_epi64_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm256_permutex2var_epi16(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm256_permutex2var_pd(a: Exp[__m256d], idx: Exp[__m256i], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_PERMUTEX2VAR_PD(a, idx, b)
  }
            
  def _mm_mask_cmpneq_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPU8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cvttps_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASK_CVTTPS_EPU64(src, k, a)
  }
            
  def _mm_cmp_epi32_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI32_MASK(a, b, imm8)
  }
            
  def _mm_mask_mullo_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULLO_EPI32(src, k, a, b)
  }
            
  def _mm512_i64gather_epi32[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM512_I64GATHER_EPI32(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_permutexvar_epi64(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI64(idx, a)
  }
            
  def _mm_maskz_ror_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROR_EPI64(k, a, imm8)
  }
            
  def _mm_cvttpd_epu32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPU32(a)
  }
            
  def _mm256_mask_getexp_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm_maskz_cvtsepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI32_EPI8(k, a)
  }
            
  def _mm_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm_mask_madd52lo_epu64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm256_mask_cvtepi8_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm_maskz_fnmsub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMSUB_SD(k, a, b, c)
  }
            
  def _mm256_cmpneq_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_i32gather_epi64[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(base_addr)(MM512_I32GATHER_EPI64(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_min_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI8(a, b)
  }
            
  def _mm512_fmaddsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMADDSUB_PD(a, b, c)
  }
            
  def _mm256_mask_mul_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MUL_EPU32(src, k, a, b)
  }
            
  def _mm512_cvtt_roundps_epi64(a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPI64(a, sae)
  }
            
  def _mm512_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm_cmpneq_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPU16_MASK(a, b)
  }
            
  def _mm512_maskz_cvtsepi64_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTSEPI64_EPI32(k, a)
  }
            
  def _mm_mask_cvttps_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm512_cmple_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPI64_MASK(a, b)
  }
            
  def _mm256_maskz_roundscale_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_ROUNDSCALE_PD(k, a, imm8)
  }
            
  def _mm256_maskz_rol_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROL_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm_mask_rcp14_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP14_PS(src, k, a)
  }
            
  def _mm512_exp2a23_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXP2A23_PD(a)
  }
            
  def _mm_mmask_i64gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_max_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPU64(a, b)
  }
            
  def _mm256_maskz_min_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU32(k, a, b)
  }
            
  def _mm_cvtss_u32(a: Exp[__m128]): Exp[UInt] = {
    MM_CVTSS_U32(a)
  }
            
  def _mm256_maskz_and_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_AND_PD(k, a, b)
  }
            
  def _mm512_maskz_permutevar_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_MASKZ_PERMUTEVAR_PS(k, a, b)
  }
            
  def _mm256_permutex2var_epi8(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm512_cvtusepi64_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTUSEPI64_EPI8(a)
  }
            
  def _mm256_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm512_mask_fmaddsub_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm512_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvt_roundu32_ss(a: Exp[__m128], b: Exp[UInt], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDU32_SS(a, b, rounding)
  }
            
  def _mm512_mask_cmpneq_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm_cvt_roundi32_ss(a: Exp[__m128], b: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDI32_SS(a, b, rounding)
  }
            
  def _mm256_mask_cmp_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPU64_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_alignr_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm512_kxor(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KXOR(a, b)
  }
            
  def _mm256_mask_cmple_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPU8_MASK(k1, a, b)
  }
            
  def _mm_fnmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FNMADD_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm256_mask_loadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtt_roundss_u32(a: Exp[__m128], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVTT_ROUNDSS_U32(a, rounding)
  }
            
  def _mm512_mask2_permutex2var_epi8(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Long], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm512_reduce_round_ps(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_REDUCE_ROUND_PS(a, imm8, rounding)
  }
            
  def _mm_maskz_loadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_abs_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ABS_EPI64(k, a)
  }
            
  def _mm512_mask_sll_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SLL_EPI32(src, k, a, count)
  }
            
  def _mm512_mask_broadcast_f32x8(src: Exp[__m512], k: Exp[Int], a: Exp[__m256]): Exp[__m512] = {
    MM512_MASK_BROADCAST_F32X8(src, k, a)
  }
            
  def _mm256_cmple_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI64_MASK(a, b)
  }
            
  def _mm512_min_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MIN_PD(a, b)
  }
            
  def _mm512_mask_cvtepu64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm256_mask_cvtsepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm_max_round_sd(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MAX_ROUND_SD(a, b, sae)
  }
            
  def _mm_maskz_expand_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_EXPAND_PD(k, a)
  }
            
  def _mm512_maskz_cvtepu16_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU16_EPI32(k, a)
  }
            
  def _mm_mask2_permutex2var_ps(a: Exp[__m128], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK2_PERMUTEX2VAR_PS(a, idx, k, b)
  }
            
  def _mm512_mask_cvtsepi64_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTSEPI64_EPI32(src, k, a)
  }
            
  def _mm_mask_rol_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROL_EPI64(src, k, a, imm8)
  }
            
  def _mm512_mask_cvt_roundpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPD_EPU64(src, k, a, rounding)
  }
            
  def _mm512_maskz_getexp_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_GETEXP_PS(k, a)
  }
            
  def _mm256_maskz_shuffle_f64x2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_SHUFFLE_F64X2(k, a, b, imm8)
  }
            
  def _mm_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm512_maskz_rsqrt28_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT28_ROUND_PD(k, a, rounding)
  }
            
  def _mm256_extracti64x2_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTI64X2_EPI64(a, imm8)
  }
            
  def _mm256_mask_cvtepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI8(src, k, a)
  }
            
  def _mm512_maskz_cvtps_pd(k: Exp[Int], a: Exp[__m256]): Exp[__m512d] = {
    MM512_MASKZ_CVTPS_PD(k, a)
  }
            
  def _mm256_mask_cmpge_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_mask_fmaddsub_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm_mask_blend_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI32(k, a, b)
  }
            
  def _mm_mask_fnmadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMADD_PD(a, k, b, c)
  }
            
  def _mm512_mask_and_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_AND_PS(src, k, a, b)
  }
            
  def _mm_maskz_range_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm512_maskz_min_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm512_mask_cvtepi32_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTEPI32_EPI16(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundps_epu32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPU32(k, a, sae)
  }
            
  def _mm_maskz_max_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU64(k, a, b)
  }
            
  def _mm_maskz_max_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm512_mask_rcp28_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP28_PS(src, k, a)
  }
            
  def _mm256_mask_dbsad_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm_mask_range_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_ROUND_SS(src, k, a, b, imm8, rounding)
  }
            
  def _mm256_lzcnt_epi64(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_LZCNT_EPI64(a)
  }
            
  def _mm_mmask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_getmant_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_SD(src, k, a, b, interv, sc)
  }
            
  def _mm512_maskz_mov_epi8(k: Exp[Long], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI8(k, a)
  }
            
  def _mm256_test_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI16_MASK(a, b)
  }
            
  def _mm_getexp_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_GETEXP_SS(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8) =>
      _mm512_mask_extracti32x4_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case iDef@MM_MASKZ_LOAD_SD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_sd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MASK_PERMUTEXVAR_PD (src, k, idx, a) =>
      _mm256_mask_permutexvar_pd(f(src), f(k), f(idx), f(a))
    case MM512_MASKZ_RCP14_PD (k, a) =>
      _mm512_maskz_rcp14_pd(f(k), f(a))
    case MM_MASK_SLLI_EPI64 (src, k, a, imm8) =>
      _mm_mask_slli_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_ANDNOT_PS (a, b) =>
      _mm512_andnot_ps(f(a), f(b))
    case MM_MASK_ROUNDSCALE_PS (src, k, a, imm8) =>
      _mm_mask_roundscale_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_CVTEPI32_PS (k, a) =>
      _mm512_maskz_cvtepi32_ps(f(k), f(a))
    case MM_GETEXP_ROUND_SD (a, b, rounding) =>
      _mm_getexp_round_sd(f(a), f(b), f(rounding))
    case MM512_MASKZ_PERMUTEXVAR_EPI64 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi64(f(k), f(idx), f(a))
    case MM_MASK_COMPRESS_EPI64 (src, k, a) =>
      _mm_mask_compress_epi64(f(src), f(k), f(a))
    case MM_CVTTPS_EPU32 (a) =>
      _mm_cvttps_epu32(f(a))
    case MM256_MASKZ_ADD_EPI32 (k, a, b) =>
      _mm256_maskz_add_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDEPI64_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepi64_ps(f(k), f(a), f(rounding))
    case iDef@MM512_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm512_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtepi64_epi8(f(src), f(k), f(a))
    case iDef@MM_MASKZ_LOAD_SS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_ss(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_MASK_CMPEQ_EPI32_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epi32_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm256_maskz_subs_epi8(f(k), f(a), f(b))
    case MM_MASK_SRLV_EPI32 (src, k, a, count) =>
      _mm_mask_srlv_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASK2_PERMUTEX2VAR_PD (a, idx, k, b) =>
      _mm512_mask2_permutex2var_pd(f(a), f(idx), f(k), f(b))
    case MM512_MASKZ_CVTUSEPI64_EPI8 (k, a) =>
      _mm512_maskz_cvtusepi64_epi8(f(k), f(a))
    case MM_MASK_CMP_EPU8_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epu8_mask(f(k1), f(a), f(b), f(imm8))
    case MM_RCP28_SD (a, b) =>
      _mm_rcp28_sd(f(a), f(b))
    case MM512_CMPNEQ_EPI64_MASK (a, b) =>
      _mm512_cmpneq_epi64_mask(f(a), f(b))
    case MM512_MASK_MULHI_EPU16 (src, k, a, b) =>
      _mm512_mask_mulhi_epu16(f(src), f(k), f(a), f(b))
    case MM512_INSERTI32X4 (a, b, imm8) =>
      _mm512_inserti32x4(f(a), f(b), f(imm8))
    case MM256_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PACKS_EPI32 (src, k, a, b) =>
      _mm256_mask_packs_epi32(f(src), f(k), f(a), f(b))
    case MM512_BROADCAST_I32X4 (a) =>
      _mm512_broadcast_i32x4(f(a))
    case MM_MASKZ_AND_EPI32 (k, a, b) =>
      _mm_maskz_and_epi32(f(k), f(a), f(b))
    case MM_MASKZ_FMADDSUB_PS (k, a, b, c) =>
      _mm_maskz_fmaddsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm256_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM_CVTPS_EPU32 (a) =>
      _mm_cvtps_epu32(f(a))
    case MM256_MASK_ADD_PS (src, k, a, b) =>
      _mm256_mask_add_ps(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MIN_ROUND_PD (src, k, a, b, sae) =>
      _mm512_mask_min_round_pd(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm_maskz_subs_epu16(f(k), f(a), f(b))
    case MM_CMPLT_EPI8_MASK (a, b) =>
      _mm_cmplt_epi8_mask(f(a), f(b))
    case MM256_MASK_MOV_EPI8 (src, k, a) =>
      _mm256_mask_mov_epi8(f(src), f(k), f(a))
    case MM256_MASKZ_MOVEHDUP_PS (k, a) =>
      _mm256_maskz_movehdup_ps(f(k), f(a))
    case MM_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM512_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm512_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM256_SCALEF_PD (a, b) =>
      _mm256_scalef_pd(f(a), f(b))
    case MM256_MASK_CMPLT_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi64_mask(f(k1), f(a), f(b))
    case MM512_MASK_TESTN_EPI16_MASK (k1, a, b) =>
      _mm512_mask_testn_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm512_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM512_CVTSEPI16_EPI8 (a) =>
      _mm512_cvtsepi16_epi8(f(a))
    case MM512_MASKZ_EXPAND_EPI64 (k, a) =>
      _mm512_maskz_expand_epi64(f(k), f(a))
    case MM256_CVTUSEPI64_EPI8 (a) =>
      _mm256_cvtusepi64_epi8(f(a))
    case MM512_PERMUTEVAR_PS (a, b) =>
      _mm512_permutevar_ps(f(a), f(b))
    case MM512_MASKZ_FMADDSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmaddsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_MASKZ_ALIGNR_EPI8 (k, a, b, count) =>
      _mm256_maskz_alignr_epi8(f(k), f(a), f(b), f(count))
    case MM512_ANDNOT_PD (a, b) =>
      _mm512_andnot_pd(f(a), f(b))
    case MM512_SLL_EPI16 (a, count) =>
      _mm512_sll_epi16(f(a), f(count))
    case MM512_MASK_MOVELDUP_PS (src, k, a) =>
      _mm512_mask_moveldup_ps(f(src), f(k), f(a))
    case iDef@MM_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm256_maskz_broadcastw_epi16(f(k), f(a))
    case MM_MASKZ_RSQRT28_SD (k, a, b) =>
      _mm_maskz_rsqrt28_sd(f(k), f(a), f(b))
    case MM256_MASK_PERMUTEX2VAR_PS (a, k, idx, b) =>
      _mm256_mask_permutex2var_ps(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_SET1_EPI64 (k, a) =>
      _mm256_maskz_set1_epi64(f(k), f(a))
    case MM512_MASKZ_CONFLICT_EPI64 (k, a) =>
      _mm512_maskz_conflict_epi64(f(k), f(a))
    case MM512_SET1_EPI8 (a) =>
      _mm512_set1_epi8(f(a))
    case MM_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASK_SLLI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_slli_epi16(f(src), f(k), f(a), f(imm8))
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_MOV_EPI32 (src, k, a) =>
      _mm_mask_mov_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_COMPRESS_PD (k, a) =>
      _mm512_maskz_compress_pd(f(k), f(a))
    case MM512_MASK_BROADCAST_I32X8 (src, k, a) =>
      _mm512_mask_broadcast_i32x8(f(src), f(k), f(a))
    case MM256_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm256_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case MM_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm_maskz_cvtepi8_epi16(f(k), f(a))
    case MM256_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm256_permutex2var_epi16(f(a), f(idx), f(b))
    case MM256_PERMUTEX2VAR_PD (a, idx, b) =>
      _mm256_permutex2var_pd(f(a), f(idx), f(b))
    case MM_MASK_CMPNEQ_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epu8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CVTTPS_EPU64 (src, k, a) =>
      _mm256_mask_cvttps_epu64(f(src), f(k), f(a))
    case MM_CMP_EPI32_MASK (a, b, imm8) =>
      _mm_cmp_epi32_mask(f(a), f(b), f(imm8))
    case MM_MASK_MULLO_EPI32 (src, k, a, b) =>
      _mm_mask_mullo_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM512_I64GATHER_EPI32 (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_epi32(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_PERMUTEXVAR_EPI64 (idx, a) =>
      _mm256_permutexvar_epi64(f(idx), f(a))
    case MM_MASKZ_ROR_EPI64 (k, a, imm8) =>
      _mm_maskz_ror_epi64(f(k), f(a), f(imm8))
    case MM_CVTTPD_EPU32 (a) =>
      _mm_cvttpd_epu32(f(a))
    case MM256_MASK_GETEXP_PD (src, k, a) =>
      _mm256_mask_getexp_pd(f(src), f(k), f(a))
    case MM_MASKZ_CVTSEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtsepi32_epi8(f(k), f(a))
    case MM_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM256_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM_MASKZ_FNMSUB_SD (k, a, b, c) =>
      _mm_maskz_fnmsub_sd(f(k), f(a), f(b), f(c))
    case MM256_CMPNEQ_EPI8_MASK (a, b) =>
      _mm256_cmpneq_epi8_mask(f(a), f(b))
    case iDef@MM512_I32GATHER_EPI64 (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i32gather_epi64(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MIN_EPI8 (a, b) =>
      _mm512_min_epi8(f(a), f(b))
    case MM512_FMADDSUB_PD (a, b, c) =>
      _mm512_fmaddsub_pd(f(a), f(b), f(c))
    case MM256_MASK_MUL_EPU32 (src, k, a, b) =>
      _mm256_mask_mul_epu32(f(src), f(k), f(a), f(b))
    case MM512_CVTT_ROUNDPS_EPI64 (a, sae) =>
      _mm512_cvtt_roundps_epi64(f(a), f(sae))
    case MM512_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm512_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM_CMPNEQ_EPU16_MASK (a, b) =>
      _mm_cmpneq_epu16_mask(f(a), f(b))
    case MM512_MASKZ_CVTSEPI64_EPI32 (k, a) =>
      _mm512_maskz_cvtsepi64_epi32(f(k), f(a))
    case MM_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM512_CMPLE_EPI64_MASK (a, b) =>
      _mm512_cmple_epi64_mask(f(a), f(b))
    case MM256_MASKZ_ROUNDSCALE_PD (k, a, imm8) =>
      _mm256_maskz_roundscale_pd(f(k), f(a), f(imm8))
    case MM256_MASKZ_ROL_EPI32 (k, a, imm8) =>
      _mm256_maskz_rol_epi32(f(k), f(a), f(imm8))
    case iDef@MM256_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm512_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM_MASK_RCP14_PS (src, k, a) =>
      _mm_mask_rcp14_ps(f(src), f(k), f(a))
    case MM512_EXP2A23_PD (a) =>
      _mm512_exp2a23_pd(f(a))
    case iDef@MM_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MAX_EPU64 (a, b) =>
      _mm256_max_epu64(f(a), f(b))
    case MM256_MASKZ_MIN_EPU32 (k, a, b) =>
      _mm256_maskz_min_epu32(f(k), f(a), f(b))
    case MM_CVTSS_U32 (a) =>
      _mm_cvtss_u32(f(a))
    case MM256_MASKZ_AND_PD (k, a, b) =>
      _mm256_maskz_and_pd(f(k), f(a), f(b))
    case MM512_MASKZ_PERMUTEVAR_PS (k, a, b) =>
      _mm512_maskz_permutevar_ps(f(k), f(a), f(b))
    case MM256_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm256_permutex2var_epi8(f(a), f(idx), f(b))
    case MM512_CVTUSEPI64_EPI8 (a) =>
      _mm512_cvtusepi64_epi8(f(a))
    case MM256_MASKZ_SQRT_PD (k, a) =>
      _mm256_maskz_sqrt_pd(f(k), f(a))
    case MM512_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm512_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case iDef@MM512_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVT_ROUNDU32_SS (a, b, rounding) =>
      _mm_cvt_roundu32_ss(f(a), f(b), f(rounding))
    case MM512_MASK_CMPNEQ_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epu64_mask(f(k1), f(a), f(b))
    case MM_CVT_ROUNDI32_SS (a, b, rounding) =>
      _mm_cvt_roundi32_ss(f(a), f(b), f(rounding))
    case MM256_MASK_CMP_EPU64_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epu64_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm512_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM512_KXOR (a, b) =>
      _mm512_kxor(f(a), f(b))
    case MM256_MASK_CMPLE_EPU8_MASK (k1, a, b) =>
      _mm256_mask_cmple_epu8_mask(f(k1), f(a), f(b))
    case MM_FNMADD_ROUND_SD (a, b, c, rounding) =>
      _mm_fnmadd_round_sd(f(a), f(b), f(c), f(rounding))
    case iDef@MM256_MASK_LOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVTT_ROUNDSS_U32 (a, rounding) =>
      _mm_cvtt_roundss_u32(f(a), f(rounding))
    case MM512_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM512_REDUCE_ROUND_PS (a, imm8, rounding) =>
      _mm512_reduce_round_ps(f(a), f(imm8), f(rounding))
    case iDef@MM_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_ABS_EPI64 (k, a) =>
      _mm512_maskz_abs_epi64(f(k), f(a))
    case MM512_MASK_SLL_EPI32 (src, k, a, count) =>
      _mm512_mask_sll_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASK_BROADCAST_F32X8 (src, k, a) =>
      _mm512_mask_broadcast_f32x8(f(src), f(k), f(a))
    case MM256_CMPLE_EPI64_MASK (a, b) =>
      _mm256_cmple_epi64_mask(f(a), f(b))
    case MM512_MIN_PD (a, b) =>
      _mm512_min_pd(f(a), f(b))
    case MM512_MASK_CVTEPU64_PD (src, k, a) =>
      _mm512_mask_cvtepu64_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm512_maskz_cvttpd_epi32(f(k), f(a))
    case MM_MAX_ROUND_SD (a, b, sae) =>
      _mm_max_round_sd(f(a), f(b), f(sae))
    case MM_MASKZ_EXPAND_PD (k, a) =>
      _mm_maskz_expand_pd(f(k), f(a))
    case MM512_MASKZ_CVTEPU16_EPI32 (k, a) =>
      _mm512_maskz_cvtepu16_epi32(f(k), f(a))
    case MM_MASK2_PERMUTEX2VAR_PS (a, idx, k, b) =>
      _mm_mask2_permutex2var_ps(f(a), f(idx), f(k), f(b))
    case MM512_MASK_CVTSEPI64_EPI32 (src, k, a) =>
      _mm512_mask_cvtsepi64_epi32(f(src), f(k), f(a))
    case MM_MASK_ROL_EPI64 (src, k, a, imm8) =>
      _mm_mask_rol_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_CVT_ROUNDPD_EPU64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epu64(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_GETEXP_PS (k, a) =>
      _mm512_maskz_getexp_ps(f(k), f(a))
    case MM256_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_f64x2(f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_RSQRT28_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_rsqrt28_round_pd(f(k), f(a), f(rounding))
    case MM256_EXTRACTI64X2_EPI64 (a, imm8) =>
      _mm256_extracti64x2_epi64(f(a), f(imm8))
    case MM256_MASK_CVTEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi64_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_CVTPS_PD (k, a) =>
      _mm512_maskz_cvtps_pd(f(k), f(a))
    case MM256_MASK_CMPGE_EPU8_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm512_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM_MASK_BLEND_EPI32 (k, a, b) =>
      _mm_mask_blend_epi32(f(k), f(a), f(b))
    case MM_MASK_FNMADD_PD (a, k, b, c) =>
      _mm_mask_fnmadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_AND_PS (src, k, a, b) =>
      _mm512_mask_and_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm512_maskz_min_epu8(f(k), f(a), f(b))
    case MM512_MASK_CVTEPI32_EPI16 (src, k, a) =>
      _mm512_mask_cvtepi32_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPS_EPU32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epu32(f(k), f(a), f(sae))
    case MM_MASKZ_MAX_EPU64 (k, a, b) =>
      _mm_maskz_max_epu64(f(k), f(a), f(b))
    case MM_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm_maskz_max_epu16(f(k), f(a), f(b))
    case MM512_MASK_RCP28_PS (src, k, a) =>
      _mm512_mask_rcp28_ps(f(src), f(k), f(a))
    case MM256_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm256_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_RANGE_ROUND_SS (src, k, a, b, imm8, rounding) =>
      _mm_mask_range_round_ss(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM256_LZCNT_EPI64 (a) =>
      _mm256_lzcnt_epi64(f(a))
    case iDef@MM_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_GETMANT_SD (src, k, a, b, interv, sc) =>
      _mm_mask_getmant_sd(f(src), f(k), f(a), f(b), f(interv), f(sc))
    case MM512_MASKZ_MOV_EPI8 (k, a) =>
      _mm512_maskz_mov_epi8(f(k), f(a))
    case MM256_TEST_EPI16_MASK (a, b) =>
      _mm256_test_epi16_mask(f(a), f(b))
    case MM_GETEXP_SS (a, b) =>
      _mm_getexp_ss(f(a), f(b))

    case Reflect(MM512_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI32X4_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_SD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_SD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_PD (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_PD (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI64 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI64 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPI64_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_SS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_SS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_PD (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_PD (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPU8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPU8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PACKS_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PACKS_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADDSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADDSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_ROUND_PD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_ROUND_PD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOVEHDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOVEHDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEVAR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEVAR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI8 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI8 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ANDNOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ANDNOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVELDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVELDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_PS (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_PS (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CONFLICT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CONFLICT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_PD (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_PD (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_EPI32 (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_EPI32 (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI64 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI64 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROR_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROR_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32GATHER_EPI64 (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32GATHER_EPI64 (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MUL_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MUL_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPS_EPI64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPI64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROUNDSCALE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROUNDSCALE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROL_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROL_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEVAR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEVAR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPU64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPU64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KXOR (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KXOR (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_ROUND_PS (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_ROUND_PS (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ABS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ABS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F32X8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F32X8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_ROUND_SD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MAX_ROUND_SD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_PS (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_PS (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROL_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROL_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPU64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPU64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_F64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTI64X2_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTI64X2_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AND_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AND_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_ROUND_SS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_ROUND_SS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LZCNT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_LZCNT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_SD (src, k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_SD (f(src), f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51201 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti32x4_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LOAD_SD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_sd(${quote(k)}, (const double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_PERMUTEXVAR_PD(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_pd(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASKZ_RCP14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SLLI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_slli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_ANDNOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_andnot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ROUNDSCALE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_roundscale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTEPI32_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_GETEXP_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getexp_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_PERMUTEXVAR_EPI64(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi64(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_COMPRESS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_compress_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttps_epu32(${quote(a)})")
    case iDef@MM256_MASKZ_ADD_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPI64_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepi64_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtusepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_MIN_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_LOAD_SS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_ss(${quote(k)}, (const float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_CMPEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SUBS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRLV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srlv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK2_PERMUTEX2VAR_PD(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTUSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtusepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMP_EPU8_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_RCP28_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp28_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPNEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MULHI_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_INSERTI32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_inserti32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SRLI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_PACKS_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_packs_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCAST_I32X4(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_i32x4(${quote(a)})")
    case iDef@MM_MASKZ_AND_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_and_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMADDSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmaddsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CVTTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_epu32(${quote(a)})")
    case iDef@MM256_MASK_ADD_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_MIN_ROUND_PD(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASKZ_SUBS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLT_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MOV_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mov_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MOVEHDUP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_movehdup_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SUBS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_FMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_SCALEF_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_scalef_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_TESTN_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_testn_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_CVTSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsepi16_epi8(${quote(a)})")
    case iDef@MM512_MASKZ_EXPAND_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CVTUSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi64_epi8(${quote(a)})")
    case iDef@MM512_PERMUTEVAR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutevar_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMADDSUB_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_ALIGNR_EPI8(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_alignr_epi8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_ANDNOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_andnot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_SLL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sll_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_MOVELDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_moveldup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MMASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MASKZ_BROADCASTW_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_RSQRT28_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt28_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_PERMUTEX2VAR_PS(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex2var_ps(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SET1_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_set1_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CONFLICT_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_conflict_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SET1_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_epi8(${quote(a)})")
    case iDef@MM_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SLLI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_slli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_MOV_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_COMPRESS_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_compress_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_BROADCAST_I32X8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_i32x8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI8_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_PERMUTEX2VAR_EPI16(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_PERMUTEX2VAR_PD(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_CMPNEQ_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTTPS_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_EPI32_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epi32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_MULLO_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mullo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64GATHER_EPI32(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_epi32(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_PERMUTEXVAR_EPI64(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutexvar_epi64(${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_ROR_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_ror_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttpd_epu32(${quote(a)})")
    case iDef@MM256_MASK_GETEXP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_MADD52LO_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CVTEPI8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_FNMSUB_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_CMPNEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_I32GATHER_EPI64(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i32gather_epi64(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM512_MIN_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_FMADDSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_MUL_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mul_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTT_ROUNDPS_EPI64(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundps_epi64(${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_FNMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_CMPNEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtsepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPLE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ROUNDSCALE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_roundscale_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_ROL_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rol_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_store_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK_RCP14_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP2A23_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2a23_pd(${quote(a)})")
    case iDef@MM_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i64gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MAX_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MIN_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTSS_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_u32(${quote(a)})")
    case iDef@MM256_MASKZ_AND_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_and_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTEVAR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutevar_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_PERMUTEX2VAR_EPI8(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_CVTUSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi64_epi8(${quote(a)})")
    case iDef@MM256_MASKZ_SQRT_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_FMADDSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_I64SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_CVT_ROUNDU32_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CMPNEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDI32_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundi32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CMP_EPU64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_KXOR(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kxor(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_FNMADD_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASK_LOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTT_ROUNDSS_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_REDUCE_ROUND_PS(a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_round_ps(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_LOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASKZ_ABS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_abs_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SLL_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sll_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_BROADCAST_F32X8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_f32x8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MIN_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPU64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASKZ_CVTTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MAX_ROUND_SD(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_round_sd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASKZ_EXPAND_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_expand_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU16_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu16_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK2_PERMUTEX2VAR_PS(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ROL_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rol_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVT_ROUNDPD_EPU64(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_GETEXP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getexp_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_SHUFFLE_F64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_f64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_RSQRT28_ROUND_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rsqrt28_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_EXTRACTI64X2_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extracti64x2_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTPS_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtps_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMPGE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_FMADDSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_BLEND_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_blend_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FNMADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_AND_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_and_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RANGE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MIN_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPS_EPU32(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epu32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM_MASKZ_MAX_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MAX_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RCP28_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp28_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_RANGE_ROUND_SS(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_range_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_LZCNT_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_lzcnt_epi64(${quote(a)})")
    case iDef@MM_MMASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_GETMANT_SD(src, k, a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_MASKZ_MOV_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_TEST_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_GETEXP_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getexp_ss(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
