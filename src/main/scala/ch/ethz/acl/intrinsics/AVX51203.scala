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

    
trait AVX51203 extends IntrinsicsBase {
  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
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
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_ANDNOT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRLV_EPI64(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 16-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask32, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_UNPACKLO_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPU8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPU32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the repeated 4 element sequence.
   * d: __int64, c: __int64, b: __int64, a: __int64
   */
  case class MM512_SET4_EPI64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASK_FIXUPIMM_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASKZ_ROUNDSCALE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_UNPACKLO_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FMSUB_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_RSQRT28_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_RCP14_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m512i
   */
  case class MM512_CONFLICT_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_TERNARYLOGIC_EPI32(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
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
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k" using zeromask "k1" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RCP28_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_MASK_CMP_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMADD_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MAX_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_LZCNT_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SLLV_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m128i
   */
  case class MM512_MASK_CVTEPI16_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMADDSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SLLI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed unsigned 64-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI8(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_SQRT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 64-bit integers in "dst" with the repeated 4 element sequence in
   * reverse order.
   * d: __int64, c: __int64, b: __int64, a: __int64
   */
  case class MM512_SETR4_EPI64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
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
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI64_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
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
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst".
   * a: __m512, idx: __m512i, b: __m512
   */
  case class MM512_PERMUTEX2VAR_PS(a: Exp[__m512], idx: Exp[__m512i], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRLV_EPI16(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 32-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI32_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Load a double-precision (64-bit) floating-point element from memory into the
   * lower element of "dst" using writemask "k" (the element is copied from "src"
   * when mask bit 0 is not set), and set the upper element of "dst" to zero.
   * "mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128d, k: __mmask8, mem_addr: const double*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_SD[A[_], U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_COMPRESS_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADDS_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128
   */
  case class MM_RCP14_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "b" to the upper element of
   * "dst".
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASKZ_ROUNDSCALE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_TERNARYLOGIC_EPI32(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-28. [round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_RSQRT28_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m128i
   */
  case class MM512_MASK_CVTEPI8_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * [round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASK_FMADDSUB_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_MIN_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m256
   */
  case class MM256_RCP14_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m256i
   */
  case class MM256_MOVEPI8_MASK(a: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPU8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
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
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_ANDNOT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPU64(a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_F64X2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 32-bit granularity (32-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_TERNARYLOGIC_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI32_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst".
   * a: __m512d, idx: __m512i, b: __m512d
   */
  case class MM512_PERMUTEX2VAR_PD(a: Exp[__m512d], idx: Exp[__m512i], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PACKUS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STORE_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_SUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPU8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using control mask "k", and store
   * the results in "dst".
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * a: __m128, b: __m128
   */
  case class MM_RCP28_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SUB_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SLLV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULTISHIFT_EPI64_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MADD52HI_EPU64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROL_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m512d, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADDSUB_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_REDUCE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPI64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SQRT_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROL_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRLI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRA_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst".
   * a: __m512i, b: __m512i, count: const int
   */
  case class MM512_ALIGNR_EPI8(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SHUFFLELO_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SLLI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SLL_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SLL_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 16-bit integers from "a" into "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_MOV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
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
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SRAI_EPI64(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Zero extend packed unsigned 16-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPU16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_SHUFFLE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_SCALEF_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * 	Four SADs are performed on four 8-bit quadruplets for
   * each 64-bit lane. The first two SADs use the lower 8-bit quadruplet of the
   * lane from "a", and the last two SADs use the uppper 8-bit quadruplet of the
   * lane from "a". Quadruplets from "b" are selected according to the control in
   * "imm8", and each SAD in each 64-bit lane uses the selected quadruplet at 8-bit
   * offsets.
   * k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI32_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROL_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_MOVELDUP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ROLV_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: short
   */
  case class MM_MASKZ_SET1_EPI16(k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI32(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_I32X4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM256_CVTEPU32_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
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
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRAV_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_OR_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Broadcast 16-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: short
   */
  case class MM512_MASK_SET1_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, idx: __m512i, b: __m512d
   */
  case class MM512_MASK_PERMUTEX2VAR_PD(a: Exp[__m512d], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * k: __mmask8, a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_DIV_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_cmpneq_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPNEQ_EPU8_MASK(a, b)
  }
            
  def _mm512_cmpgt_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_andnot_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_ANDNOT_PS(src, k, a, b)
  }
            
  def _mm_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm_maskz_add_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm512_srlv_epi64(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRLV_EPI64(a, count)
  }
            
  def _mm_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_min_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI16(a, b)
  }
            
  def _mm512_mask_storeu_epi16[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cmpge_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPU64_MASK(k1, a, b)
  }
            
  def _mm_maskz_fixupimm_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_SS(k, a, b, c, imm8)
  }
            
  def _mm256_maskz_unpacklo_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_UNPACKLO_PD(k, a, b)
  }
            
  def _mm512_cvtepu8_epi32(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPU8_EPI32(a)
  }
            
  def _mm256_cvttpd_epu32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTTPD_EPU32(a)
  }
            
  def _mm_mask_fmadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADD_PD(a, k, b, c)
  }
            
  def _mm_mask_mulhi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cvtsepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI64_EPI16(a)
  }
            
  def _mm_maskz_sub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SUB_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_set4_epi64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]): Exp[__m512i] = {
    MM512_SET4_EPI64(d, c, b, a)
  }
            
  def _mm_mask_cvttpd_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPU64(src, k, a)
  }
            
  def _mm_mask_fixupimm_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_ROUND_SS(a, k, b, c, imm8, rounding)
  }
            
  def _mm_maskz_roundscale_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_ROUNDSCALE_SS(k, a, b, imm8)
  }
            
  def _mm_maskz_fnmadd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMADD_SS(k, a, b, c)
  }
            
  def _mm256_maskz_cvtepi8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI64(k, a)
  }
            
  def _mm256_maskz_unpacklo_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_UNPACKLO_PS(k, a, b)
  }
            
  def _mm_mask_fmsub_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FMSUB_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm512_rsqrt28_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RSQRT28_ROUND_PS(a, rounding)
  }
            
  def _mm_maskz_rcp14_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RCP14_PS(k, a)
  }
            
  def _mm512_conflict_epi64(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_CONFLICT_EPI64(a)
  }
            
  def _mm256_ternarylogic_epi32(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm256_mask_cvtsepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI64_EPI8(src, k, a)
  }
            
  def _mm_cmpneq_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI32_MASK(a, b)
  }
            
  def _mm256_mask_mullo_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI64(src, k, a, b)
  }
            
  def _mm_mask_cmple_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_maskz_rcp28_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RCP28_PD(k, a)
  }
            
  def _mm512_mask_cmp_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPI64_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_compress_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm_maskz_fnmadd_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_SD(k, a, b, c)
  }
            
  def _mm256_maskz_broadcast_i32x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCAST_I32X2(k, a)
  }
            
  def _mm512_mask_max_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm_comi_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_COMI_ROUND_SD(a, b, imm8, sae)
  }
            
  def _mm512_cvt_roundps_epu64(a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPS_EPU64(a, rounding)
  }
            
  def _mm512_mask_cvt_roundps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPU64(src, k, a, rounding)
  }
            
  def _mm_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_lzcnt_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_LZCNT_EPI32(src, k, a)
  }
            
  def _mm256_maskz_add_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm512_maskz_sllv_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SLLV_EPI32(k, a, count)
  }
            
  def _mm512_mask_cvtepi16_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI16_EPI64(src, k, a)
  }
            
  def _mm512_mask3_fmaddsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm512_mask_slli_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SLLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm256_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm_cmpgt_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPU64_MASK(a, b)
  }
            
  def _mm_cvtepu32_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPU32_PD(a)
  }
            
  def _mm256_maskz_max_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI32(k, a, b)
  }
            
  def _mm512_permutexvar_epi8(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm512_mask_sqrt_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_SQRT_PS(src, k, a)
  }
            
  def _mm512_setr4_epi64(d: Exp[Long], c: Exp[Long], b: Exp[Long], a: Exp[Long]): Exp[__m512i] = {
    MM512_SETR4_EPI64(d, c, b, a)
  }
            
  def _mm_maskz_loadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtusepi64_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTUSEPI64_EPI32(src, k, a)
  }
            
  def _mm256_mask_cvtusepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_permutex2var_ps(a: Exp[__m512], idx: Exp[__m512i], b: Exp[__m512]): Exp[__m512] = {
    MM512_PERMUTEX2VAR_PS(a, idx, b)
  }
            
  def _mm256_srlv_epi16(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRLV_EPI16(a, count)
  }
            
  def _mm512_movepi32_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI32_MASK(a)
  }
            
  def _mm_mask_cvtsepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI32(src, k, a)
  }
            
  def _mm_mask_load_sd[A[_], U:Integral](src: Exp[__m128d], k: Exp[Int], mem_addr: Exp[A[Double]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASK_LOAD_SD(src, k, mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_test_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_maskz_compress_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_COMPRESS_EPI64(k, a)
  }
            
  def _mm512_mask_adds_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm_rcp14_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_RCP14_PS(a)
  }
            
  def _mm_maskz_roundscale_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ROUNDSCALE_SD(k, a, b, imm8)
  }
            
  def _mm256_maskz_srai_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI64(k, a, imm8)
  }
            
  def _mm256_mask_cmplt_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI32_MASK(k1, a, b)
  }
            
  def _mm_cvtps_epi64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPI64(a)
  }
            
  def _mm512_maskz_xor_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm_ternarylogic_epi32(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm512_maskz_unpacklo_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm512_mask_rsqrt28_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RSQRT28_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepi8_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI8_EPI64(src, k, a)
  }
            
  def _mm512_mask_fmaddsub_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADDSUB_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm512_maskz_min_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MIN_PD(k, a, b)
  }
            
  def _mm256_rcp14_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_RCP14_PS(a)
  }
            
  def _mm_cvti64_sd(a: Exp[__m128d], b: Exp[Long]): Exp[__m128d] = {
    MM_CVTI64_SD(a, b)
  }
            
  def _mm256_movepi8_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI8_MASK(a)
  }
            
  def _mm512_adds_epu8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPU8(a, b)
  }
            
  def _mm512_mask_test_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TEST_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_andnot_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_ANDNOT_PD(src, k, a, b)
  }
            
  def _mm512_cvttpd_epu64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTTPD_EPU64(a)
  }
            
  def _mm512_mask_cvtepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTEPI64_EPI16(src, k, a)
  }
            
  def _mm512_maskz_shuffle_f64x2(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SHUFFLE_F64X2(k, a, b, imm8)
  }
            
  def _mm256_maskz_ternarylogic_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8)
  }
            
  def _mm_maskz_cvtusepi32_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI32_EPI8(k, a)
  }
            
  def _mm256_mask_srl_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI64(src, k, a, count)
  }
            
  def _mm512_permutex2var_pd(a: Exp[__m512d], idx: Exp[__m512i], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_PERMUTEX2VAR_PD(a, idx, b)
  }
            
  def _mm512_mask_cvtps_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm256_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm_fmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FMSUB_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm256_maskz_packus_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PACKUS_EPI16(k, a, b)
  }
            
  def _mm_mask_store_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvttpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTTPD_EPU32(src, k, a)
  }
            
  def _mm_maskz_permutevar_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_PERMUTEVAR_PD(k, a, b)
  }
            
  def _mm_maskz_sub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SUB_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm512_mask_min_epu8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm_mask_blend_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI8(k, a, b)
  }
            
  def _mm_rcp28_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RCP28_SS(a, b)
  }
            
  def _mm_maskz_max_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPI8(k, a, b)
  }
            
  def _mm_mask_cmpeq_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPU32_MASK(k1, a, b)
  }
            
  def _mm_mask_sub_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SUB_PS(src, k, a, b)
  }
            
  def _mm_mask_sub_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_sllv_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm512_multishift_epi64_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULTISHIFT_EPI64_EPI8(a, b)
  }
            
  def _mm_madd52hi_epu64(a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MADD52HI_EPU64(a, b, c)
  }
            
  def _mm256_mask_cmpneq_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_mask_loadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpge_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPU16_MASK(a, b)
  }
            
  def _mm256_maskz_subs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  def _mm256_maskz_rol_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROL_EPI64(k, a, imm8)
  }
            
  def _mm512_mask_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_fmaddsub_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm512_mask_reduce_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_REDUCE_ROUND_PS(src, k, a, imm8, rounding)
  }
            
  def _mm512_maskz_cvtt_roundps_epi64(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPI64(k, a, sae)
  }
            
  def _mm512_mask_broadcastsd_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASK_BROADCASTSD_PD(src, k, a)
  }
            
  def _mm_mask_sqrt_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SQRT_SD(src, k, a, b)
  }
            
  def _mm256_rol_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROL_EPI64(a, imm8)
  }
            
  def _mm_mask_srli_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI64(src, k, a, imm8)
  }
            
  def _mm512_mask_sra_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRA_EPI16(src, k, a, count)
  }
            
  def _mm512_alignr_epi8(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI8(a, b, count)
  }
            
  def _mm512_mask_cvtepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTEPI64_EPI8(src, k, a)
  }
            
  def _mm512_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm256_maskz_slli_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SLLI_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_sll_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SLL_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_sll_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI32(k, a, count)
  }
            
  def _mm_mask_mov_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MOV_EPI16(src, k, a)
  }
            
  def _mm_mask_fixupimm_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm512_maskz_andnot_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm512_srai_epi64(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SRAI_EPI64(a, imm8)
  }
            
  def _mm256_movepi16_mask(a: Exp[__m256i]): Exp[Int] = {
    MM256_MOVEPI16_MASK(a)
  }
            
  def _mm512_cvtepu16_epi64(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPU16_EPI64(a)
  }
            
  def _mm256_mask_mullo_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI32(src, k, a, b)
  }
            
  def _mm_mask_shuffle_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_SHUFFLE_PS(src, k, a, b, imm8)
  }
            
  def _mm_mask_scalef_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SCALEF_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm_cmpeq_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPU16_MASK(a, b)
  }
            
  def _mm512_maskz_cvtepi32_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTEPI32_EPI16(k, a)
  }
            
  def _mm256_maskz_expand_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_EXPAND_EPI32(k, a)
  }
            
  def _mm_rol_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROL_EPI64(a, imm8)
  }
            
  def _mm512_moveldup_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_MOVELDUP_PS(a)
  }
            
  def _mm512_maskz_rolv_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ROLV_EPI64(k, a, b)
  }
            
  def _mm_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m128i] = {
    MM_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm512_permutex2var_epi32(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI32(a, idx, b)
  }
            
  def _mm256_maskz_shuffle_i32x4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_I32X4(k, a, b, imm8)
  }
            
  def _mm256_cvtepu32_pd(a: Exp[__m128i]): Exp[__m256d] = {
    MM256_CVTEPU32_PD(a)
  }
            
  def _mm_maskz_cvtpd_epu32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPU32(k, a)
  }
            
  def _mm_mask_add_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADD_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm512_maskz_srav_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRAV_EPI16(k, a, count)
  }
            
  def _mm256_mask_or_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_OR_PD(src, k, a, b)
  }
            
  def _mm_maskz_cvtepi16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI16_EPI32(k, a)
  }
            
  def _mm512_cvtps_epu64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTPS_EPU64(a)
  }
            
  def _mm256_mask_adds_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm512_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_set1_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[Short]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm512_cvtps_epi64(a: Exp[__m256]): Exp[__m512i] = {
    MM512_CVTPS_EPI64(a)
  }
            
  def _mm512_mask_permutex2var_pd(a: Exp[__m512d], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_PERMUTEX2VAR_PD(a, k, idx, b)
  }
            
  def _mm512_maskz_range_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm_mask_loadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtpd_epi64(a: Exp[__m512d]): Exp[__m512i] = {
    MM512_CVTPD_EPI64(a)
  }
            
  def _mm256_mask_cvtepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI32_EPI16(src, k, a)
  }
            
  def _mm256_mask_div_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_DIV_PS(src, k, a, b)
  }
            
  def _mm512_maskz_subs_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  def _mm256_maskz_cvtepu8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI64(k, a)
  }
            
  def _mm256_mask_ror_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROR_EPI32(src, k, a, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_CMPNEQ_EPU8_MASK (a, b) =>
      _mm512_cmpneq_epu8_mask(f(a), f(b))
    case MM512_CMPGT_EPI16_MASK (a, b) =>
      _mm512_cmpgt_epi16_mask(f(a), f(b))
    case MM256_MASK_ANDNOT_PS (src, k, a, b) =>
      _mm256_mask_andnot_ps(f(src), f(k), f(a), f(b))
    case MM_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASKZ_ADD_PD (k, a, b) =>
      _mm_maskz_add_pd(f(k), f(a), f(b))
    case MM512_SRLV_EPI64 (a, count) =>
      _mm512_srlv_epi64(f(a), f(count))
    case iDef@MM_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MIN_EPI16 (a, b) =>
      _mm512_min_epi16(f(a), f(b))
    case iDef@MM512_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi16(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CMPGE_EPU64_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epu64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_FIXUPIMM_SS (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_ss(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASKZ_UNPACKLO_PD (k, a, b) =>
      _mm256_maskz_unpacklo_pd(f(k), f(a), f(b))
    case MM512_CVTEPU8_EPI32 (a) =>
      _mm512_cvtepu8_epi32(f(a))
    case MM256_CVTTPD_EPU32 (a) =>
      _mm256_cvttpd_epu32(f(a))
    case MM_MASK_FMADD_PD (a, k, b, c) =>
      _mm_mask_fmadd_pd(f(a), f(k), f(b), f(c))
    case MM_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CVTSEPI64_EPI16 (a) =>
      _mm256_cvtsepi64_epi16(f(a))
    case MM_MASKZ_SUB_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_sub_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_SET4_EPI64 (d, c, b, a) =>
      _mm512_set4_epi64(f(d), f(c), f(b), f(a))
    case MM_MASK_CVTTPD_EPU64 (src, k, a) =>
      _mm_mask_cvttpd_epu64(f(src), f(k), f(a))
    case MM_MASK_FIXUPIMM_ROUND_SS (a, k, b, c, imm8, rounding) =>
      _mm_mask_fixupimm_round_ss(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM_MASKZ_ROUNDSCALE_SS (k, a, b, imm8) =>
      _mm_maskz_roundscale_ss(f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_FNMADD_SS (k, a, b, c) =>
      _mm_maskz_fnmadd_ss(f(k), f(a), f(b), f(c))
    case MM256_MASKZ_CVTEPI8_EPI64 (k, a) =>
      _mm256_maskz_cvtepi8_epi64(f(k), f(a))
    case MM256_MASKZ_UNPACKLO_PS (k, a, b) =>
      _mm256_maskz_unpacklo_ps(f(k), f(a), f(b))
    case MM_MASK_FMSUB_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fmsub_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_RSQRT28_ROUND_PS (a, rounding) =>
      _mm512_rsqrt28_round_ps(f(a), f(rounding))
    case MM_MASKZ_RCP14_PS (k, a) =>
      _mm_maskz_rcp14_ps(f(k), f(a))
    case MM512_CONFLICT_EPI64 (a) =>
      _mm512_conflict_epi64(f(a))
    case MM256_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm256_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_CVTSEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi64_epi8(f(src), f(k), f(a))
    case MM_CMPNEQ_EPI32_MASK (a, b) =>
      _mm_cmpneq_epi32_mask(f(a), f(b))
    case MM256_MASK_MULLO_EPI64 (src, k, a, b) =>
      _mm256_mask_mullo_epi64(f(src), f(k), f(a), f(b))
    case MM_MASK_CMPLE_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmple_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_RCP28_PD (k, a) =>
      _mm512_maskz_rcp28_pd(f(k), f(a))
    case MM512_MASK_CMP_EPI64_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epi64_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK_COMPRESS_PD (src, k, a) =>
      _mm_mask_compress_pd(f(src), f(k), f(a))
    case MM_MASKZ_FNMADD_SD (k, a, b, c) =>
      _mm_maskz_fnmadd_sd(f(k), f(a), f(b), f(c))
    case MM256_MASKZ_BROADCAST_I32X2 (k, a) =>
      _mm256_maskz_broadcast_i32x2(f(k), f(a))
    case MM512_MASK_MAX_PS (src, k, a, b) =>
      _mm512_mask_max_ps(f(src), f(k), f(a), f(b))
    case MM_COMI_ROUND_SD (a, b, imm8, sae) =>
      _mm_comi_round_sd(f(a), f(b), f(imm8), f(sae))
    case MM512_CVT_ROUNDPS_EPU64 (a, rounding) =>
      _mm512_cvt_roundps_epu64(f(a), f(rounding))
    case MM512_MASK_CVT_ROUNDPS_EPU64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epu64(f(src), f(k), f(a), f(rounding))
    case MM_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_LZCNT_EPI32 (src, k, a) =>
      _mm256_mask_lzcnt_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm256_maskz_add_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_SLLV_EPI32 (k, a, count) =>
      _mm512_maskz_sllv_epi32(f(k), f(a), f(count))
    case MM512_MASK_CVTEPI16_EPI64 (src, k, a) =>
      _mm512_mask_cvtepi16_epi64(f(src), f(k), f(a))
    case MM512_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm512_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK_SLLI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_slli_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm256_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM256_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm256_maskz_cvtps_epu64(f(k), f(a))
    case MM_CMPGT_EPU64_MASK (a, b) =>
      _mm_cmpgt_epu64_mask(f(a), f(b))
    case MM_CVTEPU32_PD (a) =>
      _mm_cvtepu32_pd(f(a))
    case MM256_MASKZ_MAX_EPI32 (k, a, b) =>
      _mm256_maskz_max_epi32(f(k), f(a), f(b))
    case MM512_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm512_permutexvar_epi8(f(idx), f(a))
    case MM512_MASK_SQRT_PS (src, k, a) =>
      _mm512_mask_sqrt_ps(f(src), f(k), f(a))
    case MM512_SETR4_EPI64 (d, c, b, a) =>
      _mm512_setr4_epi64(f(d), f(c), f(b), f(a))
    case iDef@MM_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTUSEPI64_EPI32 (src, k, a) =>
      _mm512_mask_cvtusepi64_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_PERMUTEX2VAR_PS (a, idx, b) =>
      _mm512_permutex2var_ps(f(a), f(idx), f(b))
    case MM256_SRLV_EPI16 (a, count) =>
      _mm256_srlv_epi16(f(a), f(count))
    case MM512_MOVEPI32_MASK (a) =>
      _mm512_movepi32_mask(f(a))
    case MM_MASK_CVTSEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtsepi64_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_LOAD_SD (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_sd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_COMPRESS_EPI64 (k, a) =>
      _mm512_maskz_compress_epi64(f(k), f(a))
    case MM512_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm512_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM_RCP14_PS (a) =>
      _mm_rcp14_ps(f(a))
    case MM_MASKZ_ROUNDSCALE_SD (k, a, b, imm8) =>
      _mm_maskz_roundscale_sd(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SRAI_EPI64 (k, a, imm8) =>
      _mm256_maskz_srai_epi64(f(k), f(a), f(imm8))
    case MM256_MASK_CMPLT_EPI32_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi32_mask(f(k1), f(a), f(b))
    case MM_CVTPS_EPI64 (a) =>
      _mm_cvtps_epi64(f(a))
    case MM512_MASKZ_XOR_PS (k, a, b) =>
      _mm512_maskz_xor_ps(f(k), f(a), f(b))
    case MM_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm512_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM512_MASK_RSQRT28_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_rsqrt28_round_pd(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPI8_EPI64 (src, k, a) =>
      _mm512_mask_cvtepi8_epi64(f(src), f(k), f(a))
    case MM512_MASK_FMADDSUB_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmaddsub_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM512_MASKZ_MIN_PD (k, a, b) =>
      _mm512_maskz_min_pd(f(k), f(a), f(b))
    case MM256_RCP14_PS (a) =>
      _mm256_rcp14_ps(f(a))
    case MM_CVTI64_SD (a, b) =>
      _mm_cvti64_sd(f(a), f(b))
    case MM256_MOVEPI8_MASK (a) =>
      _mm256_movepi8_mask(f(a))
    case MM512_ADDS_EPU8 (a, b) =>
      _mm512_adds_epu8(f(a), f(b))
    case MM512_MASK_TEST_EPI16_MASK (k1, a, b) =>
      _mm512_mask_test_epi16_mask(f(k1), f(a), f(b))
    case MM256_MASK_ANDNOT_PD (src, k, a, b) =>
      _mm256_mask_andnot_pd(f(src), f(k), f(a), f(b))
    case MM512_CVTTPD_EPU64 (a) =>
      _mm512_cvttpd_epu64(f(a))
    case MM512_MASK_CVTEPI64_EPI16 (src, k, a) =>
      _mm512_mask_cvtepi64_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_f64x2(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8) =>
      _mm256_maskz_ternarylogic_epi32(f(k), f(a), f(b), f(c), f(imm8))
    case MM_MASKZ_CVTUSEPI32_EPI8 (k, a) =>
      _mm_maskz_cvtusepi32_epi8(f(k), f(a))
    case MM256_MASK_SRL_EPI64 (src, k, a, count) =>
      _mm256_mask_srl_epi64(f(src), f(k), f(a), f(count))
    case MM512_PERMUTEX2VAR_PD (a, idx, b) =>
      _mm512_permutex2var_pd(f(a), f(idx), f(b))
    case MM512_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm512_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm256_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM_FMSUB_ROUND_SS (a, b, c, rounding) =>
      _mm_fmsub_round_ss(f(a), f(b), f(c), f(rounding))
    case MM256_MASKZ_PACKUS_EPI16 (k, a, b) =>
      _mm256_maskz_packus_epi16(f(k), f(a), f(b))
    case iDef@MM_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTTPD_EPU32 (src, k, a) =>
      _mm256_mask_cvttpd_epu32(f(src), f(k), f(a))
    case MM_MASKZ_PERMUTEVAR_PD (k, a, b) =>
      _mm_maskz_permutevar_pd(f(k), f(a), f(b))
    case MM_MASKZ_SUB_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_sub_round_sd(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm512_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI8 (k, a, b) =>
      _mm_mask_blend_epi8(f(k), f(a), f(b))
    case MM_RCP28_SS (a, b) =>
      _mm_rcp28_ss(f(a), f(b))
    case MM_MASKZ_MAX_EPI8 (k, a, b) =>
      _mm_maskz_max_epi8(f(k), f(a), f(b))
    case MM_MASK_CMPEQ_EPU32_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epu32_mask(f(k1), f(a), f(b))
    case MM_MASK_SUB_PS (src, k, a, b) =>
      _mm_mask_sub_ps(f(src), f(k), f(a), f(b))
    case MM_MASK_SUB_EPI64 (src, k, a, b) =>
      _mm_mask_sub_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm512_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_CVTEPI64_PD (k, a) =>
      _mm256_maskz_cvtepi64_pd(f(k), f(a))
    case MM512_MULTISHIFT_EPI64_EPI8 (a, b) =>
      _mm512_multishift_epi64_epi8(f(a), f(b))
    case MM_MADD52HI_EPU64 (a, b, c) =>
      _mm_madd52hi_epu64(f(a), f(b), f(c))
    case MM256_MASK_CMPNEQ_EPU64_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epu64_mask(f(k1), f(a), f(b))
    case iDef@MM512_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPGE_EPU16_MASK (a, b) =>
      _mm256_cmpge_epu16_mask(f(a), f(b))
    case MM256_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm256_maskz_subs_epi16(f(k), f(a), f(b))
    case MM256_MASKZ_ROL_EPI64 (k, a, imm8) =>
      _mm256_maskz_rol_epi64(f(k), f(a), f(imm8))
    case iDef@MM512_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_REDUCE_ROUND_PS (src, k, a, imm8, rounding) =>
      _mm512_mask_reduce_round_ps(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM512_MASKZ_CVTT_ROUNDPS_EPI64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epi64(f(k), f(a), f(sae))
    case MM512_MASK_BROADCASTSD_PD (src, k, a) =>
      _mm512_mask_broadcastsd_pd(f(src), f(k), f(a))
    case MM_MASK_SQRT_SD (src, k, a, b) =>
      _mm_mask_sqrt_sd(f(src), f(k), f(a), f(b))
    case MM256_ROL_EPI64 (a, imm8) =>
      _mm256_rol_epi64(f(a), f(imm8))
    case MM_MASK_SRLI_EPI64 (src, k, a, imm8) =>
      _mm_mask_srli_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_SRA_EPI16 (src, k, a, count) =>
      _mm512_mask_sra_epi16(f(src), f(k), f(a), f(count))
    case MM512_ALIGNR_EPI8 (a, b, count) =>
      _mm512_alignr_epi8(f(a), f(b), f(count))
    case MM512_MASK_CVTEPI64_EPI8 (src, k, a) =>
      _mm512_mask_cvtepi64_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm512_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM256_MASKZ_SLLI_EPI32 (k, a, imm8) =>
      _mm256_maskz_slli_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_SLL_EPI64 (src, k, a, count) =>
      _mm512_mask_sll_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_SLL_EPI32 (k, a, count) =>
      _mm256_maskz_sll_epi32(f(k), f(a), f(count))
    case MM_MASK_MOV_EPI16 (src, k, a) =>
      _mm_mask_mov_epi16(f(src), f(k), f(a))
    case MM_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case MM512_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm512_maskz_andnot_pd(f(k), f(a), f(b))
    case MM512_SRAI_EPI64 (a, imm8) =>
      _mm512_srai_epi64(f(a), f(imm8))
    case MM256_MOVEPI16_MASK (a) =>
      _mm256_movepi16_mask(f(a))
    case MM512_CVTEPU16_EPI64 (a) =>
      _mm512_cvtepu16_epi64(f(a))
    case MM256_MASK_MULLO_EPI32 (src, k, a, b) =>
      _mm256_mask_mullo_epi32(f(src), f(k), f(a), f(b))
    case MM_MASK_SHUFFLE_PS (src, k, a, b, imm8) =>
      _mm_mask_shuffle_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_SCALEF_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_scalef_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case MM_CMPEQ_EPU16_MASK (a, b) =>
      _mm_cmpeq_epu16_mask(f(a), f(b))
    case MM512_MASKZ_CVTEPI32_EPI16 (k, a) =>
      _mm512_maskz_cvtepi32_epi16(f(k), f(a))
    case MM256_MASKZ_EXPAND_EPI32 (k, a) =>
      _mm256_maskz_expand_epi32(f(k), f(a))
    case MM_ROL_EPI64 (a, imm8) =>
      _mm_rol_epi64(f(a), f(imm8))
    case MM512_MOVELDUP_PS (a) =>
      _mm512_moveldup_ps(f(a))
    case MM512_MASKZ_ROLV_EPI64 (k, a, b) =>
      _mm512_maskz_rolv_epi64(f(k), f(a), f(b))
    case MM_MASKZ_SET1_EPI16 (k, a) =>
      _mm_maskz_set1_epi16(f(k), f(a))
    case MM512_PERMUTEX2VAR_EPI32 (a, idx, b) =>
      _mm512_permutex2var_epi32(f(a), f(idx), f(b))
    case MM256_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_i32x4(f(k), f(a), f(b), f(imm8))
    case MM256_CVTEPU32_PD (a) =>
      _mm256_cvtepu32_pd(f(a))
    case MM_MASKZ_CVTPD_EPU32 (k, a) =>
      _mm_maskz_cvtpd_epu32(f(k), f(a))
    case MM_MASK_ADD_EPI32 (src, k, a, b) =>
      _mm_mask_add_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm_maskz_broadcastss_ps(f(k), f(a))
    case MM512_MASKZ_SRAV_EPI16 (k, a, count) =>
      _mm512_maskz_srav_epi16(f(k), f(a), f(count))
    case MM256_MASK_OR_PD (src, k, a, b) =>
      _mm256_mask_or_pd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_CVTEPI16_EPI32 (k, a) =>
      _mm_maskz_cvtepi16_epi32(f(k), f(a))
    case MM512_CVTPS_EPU64 (a) =>
      _mm512_cvtps_epu64(f(a))
    case MM256_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm256_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SET1_EPI16 (src, k, a) =>
      _mm512_mask_set1_epi16(f(src), f(k), f(a))
    case MM512_CVTPS_EPI64 (a) =>
      _mm512_cvtps_epi64(f(a))
    case MM512_MASK_PERMUTEX2VAR_PD (a, k, idx, b) =>
      _mm512_mask_permutex2var_pd(f(a), f(k), f(idx), f(b))
    case MM512_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm512_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case iDef@MM_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTPD_EPI64 (a) =>
      _mm512_cvtpd_epi64(f(a))
    case MM256_MASK_CVTEPI32_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi32_epi16(f(src), f(k), f(a))
    case MM256_MASK_DIV_PS (src, k, a, b) =>
      _mm256_mask_div_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm512_maskz_subs_epi16(f(k), f(a), f(b))
    case MM256_MASKZ_CVTEPU8_EPI64 (k, a) =>
      _mm256_maskz_cvtepu8_epi64(f(k), f(a))
    case MM256_MASK_ROR_EPI32 (src, k, a, imm8) =>
      _mm256_mask_ror_epi32(f(src), f(k), f(a), f(imm8))

    case Reflect(MM512_CMPNEQ_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI16 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI16 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_SS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_SS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_EPI64 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_EPI64 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_ROUND_SS (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_ROUND_SS (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CONFLICT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CONFLICT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPI64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPI64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_I32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_I32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMI_ROUND_SD (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_COMI_ROUND_SD (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_EPU64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_EPU64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPU64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPU64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_LZCNT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LZCNT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_EPI64 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_EPI64 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_PS (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_PS (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI32_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI32_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_SD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_SD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_COMPRESS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_COMPRESS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROUNDSCALE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROUNDSCALE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT28_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT28_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI64_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI64_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_F64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_F64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_TERNARYLOGIC_EPI32 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_PD (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_PD (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PACKUS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PACKUS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEVAR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEVAR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULTISHIFT_EPI64_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULTISHIFT_EPI64_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROL_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROL_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_ROUND_PS (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_ROUND_PS (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTSD_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTSD_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROL_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROL_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRA_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRA_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI8 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI8 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SRAI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVEPI16_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM256_MOVEPI16_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROL_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROL_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVELDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVELDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROLV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROLV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI32 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_I32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_I32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_OR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_OR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_PD (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_PD (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DIV_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DIV_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROR_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROR_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51203 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_CMPNEQ_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPGT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ANDNOT_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_andnot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ADD_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SRLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srlv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MIN_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_STOREU_EPI16(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_storeu_epi16((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_CMPGE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FIXUPIMM_SS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_UNPACKLO_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPU8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu8_epi32(${quote(a)})")
    case iDef@MM256_CVTTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttpd_epu32(${quote(a)})")
    case iDef@MM_MASK_FMADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_MULHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM256_CVTSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsepi64_epi16(${quote(a)})")
    case iDef@MM_MASKZ_SUB_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_SET4_EPI64(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set4_epi64(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM_MASK_CVTTPD_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FIXUPIMM_ROUND_SS(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_ROUNDSCALE_SS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_roundscale_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_FNMADD_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_CVTEPI8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKLO_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FMSUB_ROUND_SS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_RSQRT28_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt28_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_RCP14_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp14_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CONFLICT_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_conflict_epi64(${quote(a)})")
    case iDef@MM256_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtsepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPNEQ_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MULLO_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mullo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPLE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RCP28_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rcp28_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMP_EPI64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_COMPRESS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_FNMADD_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_BROADCAST_I32X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcast_i32x2(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_MAX_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_COMI_ROUND_SD(a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comi_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_CVT_ROUNDPS_EPU64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundps_epu64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_EPU64(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_LZCNT_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_lzcnt_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADD_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SLLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sllv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_CVTEPI16_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK3_FMADDSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_SLLI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_slli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_UNPACKHI_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPGT_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTEPU32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu32_pd(${quote(a)})")
    case iDef@MM256_MASKZ_MAX_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTEXVAR_EPI8(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_SQRT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SETR4_EPI64(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr4_epi64(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_CVTUSEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTUSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtusepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_PERMUTEX2VAR_PS(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_SRLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srlv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MOVEPI32_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movepi32_mask(${quote(a)})")
    case iDef@MM_MASK_CVTSEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_LOAD_SD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_sd(${quote(src)}, ${quote(k)}, (const double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_TEST_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_COMPRESS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_compress_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_ADDS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RCP14_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp14_ps(${quote(a)})")
    case iDef@MM_MASKZ_ROUNDSCALE_SD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_roundscale_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SRAI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srai_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPLT_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_epi64(${quote(a)})")
    case iDef@MM512_MASKZ_XOR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RSQRT28_ROUND_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt28_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPI8_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_FMADDSUB_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_MIN_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_RCP14_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rcp14_ps(${quote(a)})")
    case iDef@MM_CVTI64_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvti64_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MOVEPI8_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movepi8_mask(${quote(a)})")
    case iDef@MM512_ADDS_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_adds_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_TEST_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_test_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ANDNOT_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_andnot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttpd_epu64(${quote(a)})")
    case iDef@MM512_MASK_CVTEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SHUFFLE_F64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_f64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_ternarylogic_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTUSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SRL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srl_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_PERMUTEX2VAR_PD(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MULLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_FMSUB_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_PACKUS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_packus_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_CVTTPD_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_PERMUTEVAR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutevar_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SUB_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MIN_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BLEND_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_blend_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RCP28_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp28_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MAX_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPEQ_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SUB_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SUB_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SLLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_CVTEPI64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MULTISHIFT_EPI64_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_multishift_epi64_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MADD52HI_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CMPNEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CMPGE_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SUBS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ROL_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rol_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_storeu_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_FMADDSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_REDUCE_ROUND_PS(src, k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPS_EPI64(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epi64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_BROADCASTSD_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastsd_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SQRT_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sqrt_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_ROL_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rol_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SRLI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SRA_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sra_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_ALIGNR_EPI8(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_alignr_epi8(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_MASK_CVTEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SLLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_slli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SLL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sll_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_SLL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sll_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_MOV_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_ANDNOT_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SRAI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srai_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MOVEPI16_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movepi16_mask(${quote(a)})")
    case iDef@MM512_CVTEPU16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu16_epi64(${quote(a)})")
    case iDef@MM256_MASK_MULLO_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mullo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SHUFFLE_PS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shuffle_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_SCALEF_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_scalef_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_EXPAND_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expand_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_ROL_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rol_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MOVELDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_moveldup_ps(${quote(a)})")
    case iDef@MM512_MASKZ_ROLV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rolv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SET1_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_PERMUTEX2VAR_EPI32(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SHUFFLE_I32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_i32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CVTEPU32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu32_pd(${quote(a)})")
    case iDef@MM_MASKZ_CVTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ADD_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_BROADCASTSS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SRAV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srav_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_OR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_or_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI16_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi16_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtps_epu64(${quote(a)})")
    case iDef@MM256_MASK_ADDS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_SET1_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTPS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtps_epi64(${quote(a)})")
    case iDef@MM512_MASK_PERMUTEX2VAR_PD(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex2var_pd(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RANGE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_CVTPD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpd_epi64(${quote(a)})")
    case iDef@MM256_MASK_CVTEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_DIV_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_div_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SUBS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTEPU8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_ROR_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_ror_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
