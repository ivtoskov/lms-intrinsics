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

    
trait AVX51207 extends IntrinsicsBase {
  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MADDUBS_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AND_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 8-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask32, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_EPI8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_ABS_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_AND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_RANGE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with all elements set to zero.

   */
  case class MM512_SETZERO_SI512() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FNMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MAX_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_F64X2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM512_MASKZ_CVTEPI16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUB_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI32_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_MIN_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPU64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FNMSUB_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADD_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FNMADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_DIV_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m256i
   */
  case class MM512_MASK_CVTEPI16_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROR_EPI64(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTSEPI64_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTQ_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLO_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Load packed 8-bit integers from memory into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	"mem_addr" does
   * not need to be aligned on any particular boundary.
   * k: __mmask32, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOADU_EPI8[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
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
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst" using
   * zeromask "k" at 32-bit granularity (32-bit elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i, imm8: int
   */
  case class MM_MASKZ_TERNARYLOGIC_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_PACKS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
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
   * Broadcast the low 8-bits from input mask "k" to all 64-bit elements of "dst".
   * k: __mmask8
   */
  case class MM512_BROADCASTMB_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_EXPAND_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FNMADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRLI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).  
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512i, k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_DIV_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the supplied values.
   * e15: int, e14: int, e13: int, e12: int, e11: int, e10: int, e9: int, e8: int, e7: int, e6: int, e5: int, e4: int, e3: int, e2: int, e1: int, e0: int
   */
  case class MM512_SET_EPI32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_GETEXP_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_MASK_CMP_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI64_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m256, k: __mmask8, a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASK_GETMANT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 8-bit integers in "a" by packed signed 8-bit integers
   * in "b", producing intermediate signed 16-bit integers. Horizontally add
   * adjacent pairs of intermediate signed 16-bit integers, and pack the saturated
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MADDUBS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m128 to type __m512; the upper 384 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM512_ZEXTPS128_PS512(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using signed saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PACKS_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_CMP_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_OR_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_DIV_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMSUBADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m128d, imm8: int
   */
  case class MM_ROUNDSCALE_PD(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPU64_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SLLV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
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
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASK_REDUCE_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * src: __m256d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPU64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRLV_EPI16(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI16_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512, imm8: int, rounding: int
   */
  case class MM512_ROUNDSCALE_ROUND_PS(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower single-precision (32-bit) floating-point
   * element in "b" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_GETEXP_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-14.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RSQRT14_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_MOV_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
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
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_MAX_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m256d, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_MOV_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SLL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: unsigned __int64
   */
  case class MM_CVTU64_SD(a: Exp[__m128d], b: Exp[ULong]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note][round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASK_GETMANT_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_SUB_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTTPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI64_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MADD_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU16_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_MOVEDUP_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_EXPAND_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask64, idx: __m512i, b: __m512i
   */
  case class MM512_MASK_PERMUTEX2VAR_EPI8(a: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_PACKUS_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_PACKUS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
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
  case class MM256_MASKZ_CVTEPU32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_SHUFFLE_I32X4(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MUL_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_EXPAND_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_SCALEF_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MUL_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m128i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 32-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: unsigned int
   */
  case class MM_CVTU32_SD(a: Exp[__m128d], b: Exp[UInt]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_MUL_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 2^-14.
   * a: __m128, b: __m128
   */
  case class MM_RSQRT14_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASK_MAX_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUB_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGE_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
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
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MIN_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 32-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRA_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * k: __mmask8, a: __m128, b: __m128, sae: int
   */
  case class MM_MASKZ_MAX_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_SCALEF_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_XOR_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADD_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_ROLV_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FNMADD_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SRA_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPU64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADD_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_ABS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SLL_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_maddubs_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm256_mask_and_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AND_EPI32(src, k, a, b)
  }
            
  def _mm256_mask_storeu_epi8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_abs_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ABS_EPI64(k, a)
  }
            
  def _mm512_maskz_and_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_AND_PS(k, a, b)
  }
            
  def _mm_mask_cmpgt_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_mask_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvtt_roundps_epi32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPI32(k, a, sae)
  }
            
  def _mm_range_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RANGE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm512_setzero_si512(): Exp[__m512i] = {
    MM512_SETZERO_SI512()
  }
            
  def _mm_fnmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FNMSUB_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm512_max_round_pd(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MAX_ROUND_PD(a, b, sae)
  }
            
  def _mm512_mask_shuffle_f64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SHUFFLE_F64X2(src, k, a, b, imm8)
  }
            
  def _mm_mask_cvtepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI8(src, k, a)
  }
            
  def _mm512_maskz_cvtepi16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI16_EPI64(k, a)
  }
            
  def _mm512_sub_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUB_EPI64(a, b)
  }
            
  def _mm512_cvtusepi32_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTUSEPI32_EPI8(a)
  }
            
  def _mm256_mask_min_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MIN_PD(src, k, a, b)
  }
            
  def _mm_mask3_fmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADD_SS(a, b, c, k)
  }
            
  def _mm256_cvttpd_epu64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTTPD_EPU64(a)
  }
            
  def _mm512_cmplt_epu16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPU16_MASK(a, b)
  }
            
  def _mm_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm256_mask_fnmsub_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FNMSUB_PS(a, k, b, c)
  }
            
  def _mm512_add_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADD_EPI16(a, b)
  }
            
  def _mm512_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm_maskz_min_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm256_mask_fnmadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm_mask_permutevar_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_PERMUTEVAR_PD(src, k, a, b)
  }
            
  def _mm512_mask_div_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_DIV_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_mask_cvtepi16_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI16_EPI32(src, k, a)
  }
            
  def _mm512_cmplt_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLT_EPI8_MASK(a, b)
  }
            
  def _mm256_ror_epi64(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROR_EPI64(a, imm8)
  }
            
  def _mm256_cmple_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm_mask_cvt_roundsd_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_CVT_ROUNDSD_SS(src, k, a, b, rounding)
  }
            
  def _mm_cmpge_epu8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPU8_MASK(a, b)
  }
            
  def _mm256_cvtsepi64_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTSEPI64_EPI8(a)
  }
            
  def _mm256_maskz_broadcastq_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTQ_EPI64(k, a)
  }
            
  def _mm512_mullo_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLO_EPI64(a, b)
  }
            
  def _mm256_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cmplt_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvt_roundpd_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPD_EPI64(src, k, a, rounding)
  }
            
  def _mm256_maskz_loadu_epi8[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_permutex2var_epi64(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b)
  }
            
  def _mm_maskz_ternarylogic_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8)
  }
            
  def _mm512_mask_cvt_roundpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPD_EPU32(src, k, a, rounding)
  }
            
  def _mm256_mask_packs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PACKS_EPI16(src, k, a, b)
  }
            
  def _mm_mask_cvttps_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm_cvtpd_epu32(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPU32(a)
  }
            
  def _mm512_broadcastmb_epi64(k: Exp[Int]): Exp[__m512i] = {
    MM512_BROADCASTMB_EPI64(k)
  }
            
  def _mm512_cmple_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm_cmp_epu8_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPU8_MASK(a, b, imm8)
  }
            
  def _mm256_mask_srai_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI16(src, k, a, imm8)
  }
            
  def _mm_mask_expand_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm256_mask3_fnmadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FNMADD_PD(a, b, c, k)
  }
            
  def _mm_maskz_srli_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask3_fmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_PD(a, b, c, k)
  }
            
  def _mm512_mask_cvtt_roundps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPU32(src, k, a, sae)
  }
            
  def _mm512_maskz_div_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_DIV_PD(k, a, b)
  }
            
  def _mm512_mask_expandloadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_set_epi32(e15: Exp[Int], e14: Exp[Int], e13: Exp[Int], e12: Exp[Int], e11: Exp[Int], e10: Exp[Int], e9: Exp[Int], e8: Exp[Int], e7: Exp[Int], e6: Exp[Int], e5: Exp[Int], e4: Exp[Int], e3: Exp[Int], e2: Exp[Int], e1: Exp[Int], e0: Exp[Int]): Exp[__m512i] = {
    MM512_SET_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_mask_getexp_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_GETEXP_PD(src, k, a)
  }
            
  def _mm256_mask_cmpgt_epi8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvt_roundph_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDPH_PS(src, k, a, sae)
  }
            
  def _mm512_maskz_scalef_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm_mask_cmp_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPU32_MASK(k1, a, b, imm8)
  }
            
  def _mm256_mask_cvtepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI32(src, k, a)
  }
            
  def _mm512_cvtusepi64_epi32(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTUSEPI64_EPI32(a)
  }
            
  def _mm512_mask_cvtpd_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm256_mask_getmant_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm512_cmpneq_epu64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPNEQ_EPU64_MASK(a, b)
  }
            
  def _mm512_maskz_fmsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm256_mask_cvtpd_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm_cmplt_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPU16_MASK(a, b)
  }
            
  def _mm_cmpneq_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPI64_MASK(a, b)
  }
            
  def _mm_maskz_srai_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_maddubs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm512_zextps128_ps512(a: Exp[__m128]): Exp[__m512] = {
    MM512_ZEXTPS128_PS512(a)
  }
            
  def _mm256_maskz_packs_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PACKS_EPI32(k, a, b)
  }
            
  def _mm_cmp_epi64_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI64_MASK(a, b, imm8)
  }
            
  def _mm_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm256_mask_max_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm512_or_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_OR_PS(a, b)
  }
            
  def _mm512_maskz_div_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_DIV_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_maskz_fmsubadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMSUBADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_max_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm_roundscale_pd(a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_ROUNDSCALE_PD(a, imm8)
  }
            
  def _mm256_cvtepu64_ps(a: Exp[__m256i]): Exp[__m128] = {
    MM256_CVTEPU64_PS(a)
  }
            
  def _mm256_maskz_sllv_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI64(k, a, count)
  }
            
  def _mm_mask_reduce_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_REDUCE_SD(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_xor_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm256_mask_load_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpeq_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm512_srlv_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRLV_EPI16(a, count)
  }
            
  def _mm256_mask_permutexvar_epi32(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI32(src, k, idx, a)
  }
            
  def _mm_cvtusepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI16_EPI8(a)
  }
            
  def _mm512_roundscale_round_ps(a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDSCALE_ROUND_PS(a, imm8, rounding)
  }
            
  def _mm256_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_getexp_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETEXP_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_mask_rsqrt14_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm_mask_mov_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOV_PS(src, k, a)
  }
            
  def _mm256_maskz_broadcast_f64x2(k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASKZ_BROADCAST_F64X2(k, a)
  }
            
  def _mm256_mask_max_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MAX_PS(src, k, a, b)
  }
            
  def _mm256_mmask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_mov_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MOV_EPI64(k, a)
  }
            
  def _mm256_mask_sll_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SLL_EPI64(src, k, a, count)
  }
            
  def _mm_cvtu64_sd(a: Exp[__m128d], b: Exp[ULong]): Exp[__m128d] = {
    MM_CVTU64_SD(a, b)
  }
            
  def _mm_mask_getmant_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_ROUND_SS(src, k, a, b, interv, sc, rounding)
  }
            
  def _mm256_mask_sub_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SUB_PD(src, k, a, b)
  }
            
  def _mm512_mask_cvttps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPI64(src, k, a)
  }
            
  def _mm512_maskz_cvtsepi64_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTSEPI64_EPI16(k, a)
  }
            
  def _mm_mask_madd_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm_mask_cvtepu16_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU16_EPI32(src, k, a)
  }
            
  def _mm512_movedup_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MOVEDUP_PD(a)
  }
            
  def _mm_mask_expand_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm512_mask_permutex2var_epi8(a: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b)
  }
            
  def _mm512_packus_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PACKUS_EPI32(a, b)
  }
            
  def _mm512_packus_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PACKUS_EPI16(a, b)
  }
            
  def _mm256_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm256_shuffle_i32x4(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLE_I32X4(a, b, imm8)
  }
            
  def _mm_mask2_permutex2var_epi16(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm_maskz_mul_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MUL_PS(k, a, b)
  }
            
  def _mm512_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm_mask_cvtepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI32(src, k, a)
  }
            
  def _mm512_mask_expand_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_EXPAND_EPI32(src, k, a)
  }
            
  def _mm_mask3_fnmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_scalef_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_SCALEF_PD(a, b)
  }
            
  def _mm_mask_cvtusepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI32_EPI8(src, k, a)
  }
            
  def _mm256_maskz_adds_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm_mask_mul_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MUL_SS(src, k, a, b)
  }
            
  def _mm256_mmask_i64gather_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_min_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm256_maskz_compress_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_COMPRESS_EPI64(k, a)
  }
            
  def _mm512_broadcast_f32x2(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCAST_F32X2(a)
  }
            
  def _mm_mask_cmpneq_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm_maskz_slli_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI16(k, a, imm8)
  }
            
  def _mm_cvtu32_sd(a: Exp[__m128d], b: Exp[UInt]): Exp[__m128d] = {
    MM_CVTU32_SD(a, b)
  }
            
  def _mm512_maskz_mul_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_MUL_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm_rsqrt14_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT14_SS(a, b)
  }
            
  def _mm_mask_max_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASK_MAX_ROUND_SS(src, k, a, b, sae)
  }
            
  def _mm512_mask_sub_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUB_EPI16(src, k, a, b)
  }
            
  def _mm512_cmpge_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGE_EPU8_MASK(a, b)
  }
            
  def _mm512_prefetch_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I64SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_min_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MIN_EPI64(src, k, a, b)
  }
            
  def _mm256_mask_cmplt_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPU8_MASK(k1, a, b)
  }
            
  def _mm256_mask_unpacklo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm256_mask_blend_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI32(k, a, b)
  }
            
  def _mm_maskz_cvtepi64_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI64_EPI16(k, a)
  }
            
  def _mm512_mask_cvtps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm512_sra_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRA_EPI16(a, count)
  }
            
  def _mm512_cmpgt_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm512_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm512_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm_maskz_max_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_MAX_ROUND_SS(k, a, b, sae)
  }
            
  def _mm512_maskz_scalef_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SCALEF_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm256_mask_xor_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm256_mask_cvtepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmpeq_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm256_mask2_permutex2var_epi16(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm512_mask_add_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_max_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm_rolv_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_ROLV_EPI64(a, b)
  }
            
  def _mm256_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm_maskz_srlv_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI64(k, a, count)
  }
            
  def _mm_maskz_fnmadd_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_PD(k, a, b, c)
  }
            
  def _mm_mask_fnmadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMADD_PS(a, k, b, c)
  }
            
  def _mm256_maskz_sra_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SRA_EPI64(k, a, count)
  }
            
  def _mm256_cmpeq_epu64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPU64_MASK(a, b)
  }
            
  def _mm512_add_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADD_EPI64(a, b)
  }
            
  def _mm256_mask_cmpeq_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPU32_MASK(k1, a, b)
  }
            
  def _mm256_cmpgt_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_cmpgt_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_mask_abs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ABS_EPI16(src, k, a)
  }
            
  def _mm512_maskz_sll_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SLL_EPI64(k, a, count)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm512_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASK_AND_EPI32 (src, k, a, b) =>
      _mm256_mask_and_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_epi8(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_ABS_EPI64 (k, a) =>
      _mm256_maskz_abs_epi64(f(k), f(a))
    case MM512_MASKZ_AND_PS (k, a, b) =>
      _mm512_maskz_and_ps(f(k), f(a), f(b))
    case MM_MASK_CMPGT_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi32_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTT_ROUNDPS_EPI32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epi32(f(k), f(a), f(sae))
    case MM_RANGE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_range_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM512_SETZERO_SI512 () =>
      _mm512_setzero_si512()
    case MM_FNMSUB_ROUND_SD (a, b, c, rounding) =>
      _mm_fnmsub_round_sd(f(a), f(b), f(c), f(rounding))
    case MM512_MAX_ROUND_PD (a, b, sae) =>
      _mm512_max_round_pd(f(a), f(b), f(sae))
    case MM512_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_f64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_CVTEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtepi16_epi8(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPI16_EPI64 (k, a) =>
      _mm512_maskz_cvtepi16_epi64(f(k), f(a))
    case MM512_SUB_EPI64 (a, b) =>
      _mm512_sub_epi64(f(a), f(b))
    case MM512_CVTUSEPI32_EPI8 (a) =>
      _mm512_cvtusepi32_epi8(f(a))
    case MM256_MASK_MIN_PD (src, k, a, b) =>
      _mm256_mask_min_pd(f(src), f(k), f(a), f(b))
    case MM_MASK3_FMADD_SS (a, b, c, k) =>
      _mm_mask3_fmadd_ss(f(a), f(b), f(c), f(k))
    case MM256_CVTTPD_EPU64 (a) =>
      _mm256_cvttpd_epu64(f(a))
    case MM512_CMPLT_EPU16_MASK (a, b) =>
      _mm512_cmplt_epu16_mask(f(a), f(b))
    case MM_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm_maskz_cvttps_epu64(f(k), f(a))
    case MM256_MASK_FNMSUB_PS (a, k, b, c) =>
      _mm256_mask_fnmsub_ps(f(a), f(k), f(b), f(c))
    case MM512_ADD_EPI16 (a, b) =>
      _mm512_add_epi16(f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm512_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm_maskz_min_epi8(f(k), f(a), f(b))
    case MM256_MASK_FNMADD_PS (a, k, b, c) =>
      _mm256_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM_MASK_PERMUTEVAR_PD (src, k, a, b) =>
      _mm_mask_permutevar_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_DIV_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_div_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASK_CVTEPI16_EPI32 (src, k, a) =>
      _mm512_mask_cvtepi16_epi32(f(src), f(k), f(a))
    case MM512_CMPLT_EPI8_MASK (a, b) =>
      _mm512_cmplt_epi8_mask(f(a), f(b))
    case MM256_ROR_EPI64 (a, imm8) =>
      _mm256_ror_epi64(f(a), f(imm8))
    case MM256_CMPLE_EPI8_MASK (a, b) =>
      _mm256_cmple_epi8_mask(f(a), f(b))
    case MM_MASK_CVT_ROUNDSD_SS (src, k, a, b, rounding) =>
      _mm_mask_cvt_roundsd_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_CMPGE_EPU8_MASK (a, b) =>
      _mm_cmpge_epu8_mask(f(a), f(b))
    case MM256_CVTSEPI64_EPI8 (a) =>
      _mm256_cvtsepi64_epi8(f(a))
    case MM256_MASKZ_BROADCASTQ_EPI64 (k, a) =>
      _mm256_maskz_broadcastq_epi64(f(k), f(a))
    case MM512_MULLO_EPI64 (a, b) =>
      _mm512_mullo_epi64(f(a), f(b))
    case iDef@MM256_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CVT_ROUNDPD_EPI64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epi64(f(src), f(k), f(a), f(rounding))
    case iDef@MM256_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_loadu_epi8(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi64(f(k), f(a), f(idx), f(b))
    case MM_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8) =>
      _mm_maskz_ternarylogic_epi32(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASK_CVT_ROUNDPD_EPU32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epu32(f(src), f(k), f(a), f(rounding))
    case MM256_MASK_PACKS_EPI16 (src, k, a, b) =>
      _mm256_mask_packs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM_CVTPD_EPU32 (a) =>
      _mm_cvtpd_epu32(f(a))
    case MM512_BROADCASTMB_EPI64 (k) =>
      _mm512_broadcastmb_epi64(f(k))
    case MM512_CMPLE_EPI16_MASK (a, b) =>
      _mm512_cmple_epi16_mask(f(a), f(b))
    case MM_CMP_EPU8_MASK (a, b, imm8) =>
      _mm_cmp_epu8_mask(f(a), f(b), f(imm8))
    case MM256_MASK_SRAI_EPI16 (src, k, a, imm8) =>
      _mm256_mask_srai_epi16(f(src), f(k), f(a), f(imm8))
    case MM_MASK_EXPAND_PD (src, k, a) =>
      _mm_mask_expand_pd(f(src), f(k), f(a))
    case MM256_MASK3_FNMADD_PD (a, b, c, k) =>
      _mm256_mask3_fnmadd_pd(f(a), f(b), f(c), f(k))
    case MM_MASKZ_SRLI_EPI64 (k, a, imm8) =>
      _mm_maskz_srli_epi64(f(k), f(a), f(imm8))
    case MM_MASK3_FMSUB_PD (a, b, c, k) =>
      _mm_mask3_fmsub_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK_CVTT_ROUNDPS_EPU32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epu32(f(src), f(k), f(a), f(sae))
    case MM512_MASKZ_DIV_PD (k, a, b) =>
      _mm512_maskz_div_pd(f(k), f(a), f(b))
    case iDef@MM512_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SET_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi32(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_MASK_GETEXP_PD (src, k, a) =>
      _mm_mask_getexp_pd(f(src), f(k), f(a))
    case MM256_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CVT_ROUNDPH_PS (src, k, a, sae) =>
      _mm512_mask_cvt_roundph_ps(f(src), f(k), f(a), f(sae))
    case MM512_MASKZ_SCALEF_PS (k, a, b) =>
      _mm512_maskz_scalef_ps(f(k), f(a), f(b))
    case MM_MASK_CMP_EPU32_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epu32_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASK_CVTEPI64_EPI32 (src, k, a) =>
      _mm256_mask_cvtepi64_epi32(f(src), f(k), f(a))
    case MM512_CVTUSEPI64_EPI32 (a) =>
      _mm512_cvtusepi64_epi32(f(a))
    case MM512_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm512_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM256_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm256_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM512_CMPNEQ_EPU64_MASK (a, b) =>
      _mm512_cmpneq_epu64_mask(f(a), f(b))
    case MM512_MASKZ_FMSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm256_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM_CMPLT_EPU16_MASK (a, b) =>
      _mm_cmplt_epu16_mask(f(a), f(b))
    case MM_CMPNEQ_EPI64_MASK (a, b) =>
      _mm_cmpneq_epi64_mask(f(a), f(b))
    case MM_MASKZ_SRAI_EPI64 (k, a, imm8) =>
      _mm_maskz_srai_epi64(f(k), f(a), f(imm8))
    case MM_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM512_ZEXTPS128_PS512 (a) =>
      _mm512_zextps128_ps512(f(a))
    case MM256_MASKZ_PACKS_EPI32 (k, a, b) =>
      _mm256_maskz_packs_epi32(f(k), f(a), f(b))
    case MM_CMP_EPI64_MASK (a, b, imm8) =>
      _mm_cmp_epi64_mask(f(a), f(b), f(imm8))
    case MM_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM256_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm256_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM512_OR_PS (a, b) =>
      _mm512_or_ps(f(a), f(b))
    case MM512_MASKZ_DIV_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_div_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_FMSUBADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmsubadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm512_maskz_max_epu16(f(k), f(a), f(b))
    case MM_ROUNDSCALE_PD (a, imm8) =>
      _mm_roundscale_pd(f(a), f(imm8))
    case MM256_CVTEPU64_PS (a) =>
      _mm256_cvtepu64_ps(f(a))
    case MM256_MASKZ_SLLV_EPI64 (k, a, count) =>
      _mm256_maskz_sllv_epi64(f(k), f(a), f(count))
    case MM_MASK_REDUCE_SD (src, k, a, b, imm8) =>
      _mm_mask_reduce_sd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm512_maskz_xor_epi32(f(k), f(a), f(b))
    case iDef@MM256_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPEQ_EPI16_MASK (a, b) =>
      _mm256_cmpeq_epi16_mask(f(a), f(b))
    case MM_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm_maskz_cvttpd_epu64(f(k), f(a))
    case MM512_SRLV_EPI16 (a, count) =>
      _mm512_srlv_epi16(f(a), f(count))
    case MM256_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi32(f(src), f(k), f(idx), f(a))
    case MM_CVTUSEPI16_EPI8 (a) =>
      _mm_cvtusepi16_epi8(f(a))
    case MM512_ROUNDSCALE_ROUND_PS (a, imm8, rounding) =>
      _mm512_roundscale_round_ps(f(a), f(imm8), f(rounding))
    case iDef@MM256_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_GETEXP_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_getexp_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_RSQRT14_PD (src, k, a) =>
      _mm512_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM_MASK_MOV_PS (src, k, a) =>
      _mm_mask_mov_ps(f(src), f(k), f(a))
    case MM256_MASKZ_BROADCAST_F64X2 (k, a) =>
      _mm256_maskz_broadcast_f64x2(f(k), f(a))
    case MM256_MASK_MAX_PS (src, k, a, b) =>
      _mm256_mask_max_ps(f(src), f(k), f(a), f(b))
    case iDef@MM256_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_MOV_EPI64 (k, a) =>
      _mm_maskz_mov_epi64(f(k), f(a))
    case MM256_MASK_SLL_EPI64 (src, k, a, count) =>
      _mm256_mask_sll_epi64(f(src), f(k), f(a), f(count))
    case MM_CVTU64_SD (a, b) =>
      _mm_cvtu64_sd(f(a), f(b))
    case MM_MASK_GETMANT_ROUND_SS (src, k, a, b, interv, sc, rounding) =>
      _mm_mask_getmant_round_ss(f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM256_MASK_SUB_PD (src, k, a, b) =>
      _mm256_mask_sub_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_CVTTPS_EPI64 (src, k, a) =>
      _mm512_mask_cvttps_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_CVTSEPI64_EPI16 (k, a) =>
      _mm512_maskz_cvtsepi64_epi16(f(k), f(a))
    case MM_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTEPU16_EPI32 (src, k, a) =>
      _mm_mask_cvtepu16_epi32(f(src), f(k), f(a))
    case MM512_MOVEDUP_PD (a) =>
      _mm512_movedup_pd(f(a))
    case MM_MASK_EXPAND_PS (src, k, a) =>
      _mm_mask_expand_ps(f(src), f(k), f(a))
    case MM512_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b) =>
      _mm512_mask_permutex2var_epi8(f(a), f(k), f(idx), f(b))
    case MM512_PACKUS_EPI32 (a, b) =>
      _mm512_packus_epi32(f(a), f(b))
    case MM512_PACKUS_EPI16 (a, b) =>
      _mm512_packus_epi16(f(a), f(b))
    case MM256_MASKZ_CVTEPU32_PD (k, a) =>
      _mm256_maskz_cvtepu32_pd(f(k), f(a))
    case MM256_SHUFFLE_I32X4 (a, b, imm8) =>
      _mm256_shuffle_i32x4(f(a), f(b), f(imm8))
    case MM_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM_MASKZ_MUL_PS (k, a, b) =>
      _mm_maskz_mul_ps(f(k), f(a), f(b))
    case MM512_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm512_maskz_cvttpd_epu32(f(k), f(a))
    case MM_MASK_CVTEPI64_EPI32 (src, k, a) =>
      _mm_mask_cvtepi64_epi32(f(src), f(k), f(a))
    case MM512_MASK_EXPAND_EPI32 (src, k, a) =>
      _mm512_mask_expand_epi32(f(src), f(k), f(a))
    case MM_MASK3_FNMADD_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fnmadd_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_SCALEF_PD (a, b) =>
      _mm_scalef_pd(f(a), f(b))
    case MM_MASK_CVTUSEPI32_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi32_epi8(f(src), f(k), f(a))
    case MM256_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm256_maskz_adds_epi8(f(k), f(a), f(b))
    case MM_MASK_MUL_SS (src, k, a, b) =>
      _mm_mask_mul_ss(f(src), f(k), f(a), f(b))
    case iDef@MM256_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MIN_PS (k, a, b) =>
      _mm512_maskz_min_ps(f(k), f(a), f(b))
    case MM256_MASKZ_COMPRESS_EPI64 (k, a) =>
      _mm256_maskz_compress_epi64(f(k), f(a))
    case MM512_BROADCAST_F32X2 (a) =>
      _mm512_broadcast_f32x2(f(a))
    case MM_MASK_CMPNEQ_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_SLLI_EPI16 (k, a, imm8) =>
      _mm_maskz_slli_epi16(f(k), f(a), f(imm8))
    case MM_CVTU32_SD (a, b) =>
      _mm_cvtu32_sd(f(a), f(b))
    case MM512_MASKZ_MUL_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_mul_round_ps(f(k), f(a), f(b), f(rounding))
    case MM_RSQRT14_SS (a, b) =>
      _mm_rsqrt14_ss(f(a), f(b))
    case MM_MASK_MAX_ROUND_SS (src, k, a, b, sae) =>
      _mm_mask_max_round_ss(f(src), f(k), f(a), f(b), f(sae))
    case MM512_MASK_SUB_EPI16 (src, k, a, b) =>
      _mm512_mask_sub_epi16(f(src), f(k), f(a), f(b))
    case MM512_CMPGE_EPU8_MASK (a, b) =>
      _mm512_cmpge_epu8_mask(f(a), f(b))
    case iDef@MM512_PREFETCH_I64SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MIN_EPI64 (src, k, a, b) =>
      _mm512_mask_min_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASK_CMPLT_EPU8_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epu8_mask(f(k1), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASK_BLEND_EPI32 (k, a, b) =>
      _mm256_mask_blend_epi32(f(k), f(a), f(b))
    case MM_MASKZ_CVTEPI64_EPI16 (k, a) =>
      _mm_maskz_cvtepi64_epi16(f(k), f(a))
    case MM512_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm512_mask_cvtps_epi64(f(src), f(k), f(a))
    case MM512_SRA_EPI16 (a, count) =>
      _mm512_sra_epi16(f(a), f(count))
    case MM512_CMPGT_EPI8_MASK (a, b) =>
      _mm512_cmpgt_epi8_mask(f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm512_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM512_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm512_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASKZ_MAX_ROUND_SS (k, a, b, sae) =>
      _mm_maskz_max_round_ss(f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_SCALEF_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_scalef_round_pd(f(k), f(a), f(b), f(rounding))
    case MM256_MASK_XOR_PD (src, k, a, b) =>
      _mm256_mask_xor_pd(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMPEQ_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epu64_mask(f(k1), f(a), f(b))
    case MM256_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM512_MASK_ADD_EPI16 (src, k, a, b) =>
      _mm512_mask_add_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MAX_PD (k, a, b) =>
      _mm_maskz_max_pd(f(k), f(a), f(b))
    case MM_ROLV_EPI64 (a, b) =>
      _mm_rolv_epi64(f(a), f(b))
    case MM256_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm256_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_SRLV_EPI64 (k, a, count) =>
      _mm_maskz_srlv_epi64(f(k), f(a), f(count))
    case MM_MASKZ_FNMADD_PD (k, a, b, c) =>
      _mm_maskz_fnmadd_pd(f(k), f(a), f(b), f(c))
    case MM_MASK_FNMADD_PS (a, k, b, c) =>
      _mm_mask_fnmadd_ps(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_SRA_EPI64 (k, a, count) =>
      _mm256_maskz_sra_epi64(f(k), f(a), f(count))
    case MM256_CMPEQ_EPU64_MASK (a, b) =>
      _mm256_cmpeq_epu64_mask(f(a), f(b))
    case MM512_ADD_EPI64 (a, b) =>
      _mm512_add_epi64(f(a), f(b))
    case MM256_MASK_CMPEQ_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epu32_mask(f(k1), f(a), f(b))
    case MM256_CMPGT_EPI8_MASK (a, b) =>
      _mm256_cmpgt_epi8_mask(f(a), f(b))
    case MM256_MASK_CMPGT_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASK_ABS_EPI16 (src, k, a) =>
      _mm256_mask_abs_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_SLL_EPI64 (k, a, count) =>
      _mm512_maskz_sll_epi64(f(k), f(a), f(count))

    case Reflect(MM512_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_EPI8 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ABS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ABS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPI32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_SI512 (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_SI512 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_ROUND_PD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_ROUND_PD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_F64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUB_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUB_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEVAR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEVAR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROR_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROR_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVT_ROUNDSD_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVT_ROUNDSD_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTQ_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTQ_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPI64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPI64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOADU_EPI8 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI64 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI64 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_TERNARYLOGIC_EPI32 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPU32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPU32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PACKS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PACKS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTMB_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTMB_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPU8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPU8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPU32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPU32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI32 (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI32 (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPH_PS (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPH_PS (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPU32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPU32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPS128_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPS128_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PACKS_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PACKS_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI64_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI64_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_OR_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_OR_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_SD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_SD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI32 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_ROUND_PS (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_ROUND_PS (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLL_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLL_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU64_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU64_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_ROUND_SS (src, k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_ROUND_SS (f(src), f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEDUP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEDUP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_EPI8 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_EPI8 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PACKUS_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_PACKUS_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PACKUS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_PACKUS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_I32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_I32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_EPI32 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU32_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU32_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MUL_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MUL_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT14_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT14_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_ROUND_SS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_ROUND_SS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64SCATTER_PD (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRA_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRA_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_ROUND_SS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_ROUND_SS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROLV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ROLV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRA_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRA_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADD_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADD_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ABS_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ABS_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51207 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_MADDUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_AND_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_and_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_epi8((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_ABS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_abs_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_AND_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_and_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPGT_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_CVTT_ROUNDPS_EPI32(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epi32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM_RANGE_ROUND_SD(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_range_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_SETZERO_SI512() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setzero_si512()")
    case iDef@MM_FNMSUB_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MAX_ROUND_PD(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_round_pd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASK_SHUFFLE_F64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPI16_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi16_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SUB_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sub_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTUSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi32_epi8(${quote(a)})")
    case iDef@MM256_MASK_MIN_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FMADD_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_CVTTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttpd_epu64(${quote(a)})")
    case iDef@MM512_CMPLT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_FNMSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fnmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_ADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MIN_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_FNMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_PERMUTEVAR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutevar_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_DIV_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPI16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPLT_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ROR_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ror_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_CMPLE_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVT_ROUNDSD_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvt_roundsd_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CMPGE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtsepi64_epi8(${quote(a)})")
    case iDef@MM256_MASKZ_BROADCASTQ_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastq_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MULLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mullo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVT_ROUNDPD_EPI64(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_loadu_epi8(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_PERMUTEX2VAR_EPI64(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi64(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_ternarylogic_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVT_ROUNDPD_EPU32(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_PACKS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_packs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_epu32(${quote(a)})")
    case iDef@MM512_BROADCASTMB_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastmb_epi64(${quote(k)})")
    case iDef@MM512_CMPLE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_EPU8_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epu8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SRAI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srai_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_EXPAND_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK3_FNMADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASKZ_SRLI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK3_FMSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_CVTT_ROUNDPS_EPU32(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_DIV_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_SET_EPI32(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_epi32(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_MASK_GETEXP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVT_ROUNDPH_PS(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundph_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_SCALEF_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMP_EPU32_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTUSEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi64_epi32(${quote(a)})")
    case iDef@MM512_MASK_CVTPD_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_CMPNEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMSUB_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTPD_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPLT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRAI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srai_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MADDUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ZEXTPS128_PS512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_zextps128_ps512(${quote(a)})")
    case iDef@MM256_MASKZ_PACKS_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_packs_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_EPI64_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epi64_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM256_MASK_MAX_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_OR_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_or_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_DIV_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUBADD_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_MAX_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ROUNDSCALE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_roundscale_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_CVTEPU64_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu64_ps(${quote(a)})")
    case iDef@MM256_MASKZ_SLLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sllv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_REDUCE_SD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_reduce_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_XOR_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_LOAD_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_load_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CMPEQ_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SRLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srlv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_PERMUTEXVAR_EPI32(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_epi32(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_CVTUSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi16_epi8(${quote(a)})")
    case iDef@MM512_ROUNDSCALE_ROUND_PS(a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundscale_round_ps(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASKZ_GETEXP_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getexp_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_RSQRT14_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MOV_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_BROADCAST_F64X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcast_f64x2(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_MAX_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MMASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASKZ_MOV_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SLL_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sll_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_CVTU64_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu64_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_GETMANT_ROUND_SS(src, k, a, b, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM256_MASK_SUB_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTSEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtsepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MOVEDUP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movedup_pd(${quote(a)})")
    case iDef@MM_MASK_EXPAND_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_PERMUTEX2VAR_EPI8(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex2var_epi8(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_PACKUS_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_packus_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PACKUS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_packus_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTEPU32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_SHUFFLE_I32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_i32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM_MASKZ_MUL_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXPAND_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK3_FNMADD_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_SCALEF_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_scalef_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTUSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADDS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MUL_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MMASK_I64GATHER_EPI32(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i64gather_epi32(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM512_MASKZ_MIN_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_COMPRESS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_compress_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_BROADCAST_F32X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_f32x2(${quote(a)})")
    case iDef@MM_MASK_CMPNEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SLLI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_slli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTU32_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu32_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MUL_ROUND_PS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mul_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_RSQRT14_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt14_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_ROUND_SS(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASK_SUB_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sub_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPGE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpge_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PREFETCH_I64SCATTER_PD(base_addr, vindex, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_MIN_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLT_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_BLEND_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_blend_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SRA_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sra_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_CMPGT_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FNMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_MAX_ROUND_SS(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_SCALEF_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_scalef_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_XOR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_CMPEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASK_ADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MAX_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ROLV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rolv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_TEST_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srlv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_FNMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_FNMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_SRA_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sra_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_CMPEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_ADD_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_add_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPEQ_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGT_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPGT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ABS_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_abs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SLL_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sll_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case _ => super.emitNode(sym, rhs)
  }
}
