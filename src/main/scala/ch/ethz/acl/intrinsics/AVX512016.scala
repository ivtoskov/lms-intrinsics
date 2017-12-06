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

    
trait AVX512016 extends IntrinsicsBase {
  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
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
   * src: __m512d, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_REDUCE_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FNMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" , and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * a: __m128d, b: __m128d, sae: int
   */
  case class MM_MIN_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEVAR_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
  case class MM_MASKZ_LOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst".
   * a: __m256i, b: __m256i, count: const int
   */
  case class MM256_ALIGNR_EPI64(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ROLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_PACKS_EPI16(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_SCALEF_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ROLV_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 64-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_U64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI32_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 16-bits from input mask "k" to all 32-bit elements of "dst".
   * k: __mmask16
   */
  case class MM256_BROADCASTMW_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed single-precision (32-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: int
   */
  case class MM512_MASK_RANGE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * k: __mmask16, a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_TERNARYLOGIC_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CONFLICT_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_OR_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_CVTTPS_EPU32(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_MOV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128, imm8: int
   */
  case class MM_FPCLASS_PS_MASK(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI16(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_XOR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_AND_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_UNPACKHI_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "c" when
   * the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_UNPACKHI_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_MOVEHDUP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 8-bit integers from memory into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	"mem_addr" does
   * not need to be aligned on any particular boundary.
   * k: __mmask64, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI8[A[_], T:Typ, U:Integral](k: Exp[Long], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ROLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
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
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASK_EXP2A23_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_LZCNT_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU32_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compare packed unsigned 8-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k" using zeromask "k1" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SRLI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_XOR_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_BROADCASTD_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, idx: __m128i, a: __m128i
   */
  case class MM_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MASK_CMP_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SLLI_EPI64(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUB_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SCALEF_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM512_MASKZ_CVTEPU16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SLLV_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASKZ_INSERTI64X2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI64X4_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed double-precision (64-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_ANDNOT_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMSUBADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_COMPRESSSTOREU_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper element from "b"
   * to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_REDUCE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128d
   */
  case class MM_RCP14_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FMADD_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
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
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI32_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_REDUCE_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MIN_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRA_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_OR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_I32X4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROR_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_PACKUS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRAI_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SUB_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SLLV_EPI16(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed single-precision (32-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_FPCLASS_PS_MASK(k1: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMSUBADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADD_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 		[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_MUL_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_EXPAND_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_PACKS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate pairs of 16-byte blocks in "a" and "b" into a 32-byte temporary
   * result, shift the result right by "count" bytes, and store the low 16 bytes in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m128, imm8: int
   */
  case class MM256_MASKZ_INSERTF32X4(k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the control in "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_PERMUTEX_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTEPU32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, imm8: const int
   */
  case class MM_MASKZ_PERMUTE_PS(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_ABS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_F64X2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 32-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I32GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m512i
   */
  case class MM512_CONFLICT_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set). Each element's comparison
   * forms a zero extended bit vector in "dst".
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CONFLICT_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * 	[round_note].
   * a: __m512d, rounding: int
   */
  case class MM512_SQRT_ROUND_PD(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, imm8: _MM_PERM_ENUM
   */
  case class MM512_MASKZ_SHUFFLE_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_FMADDSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEVAR_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m512, imm8: const int
   */
  case class MM512_PERMUTE_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRL_EPI32(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * 3 packed elements from "b" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SQRT_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRA_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_F32X4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". The maximum relative error for this approximation is less
   * than 2^-14.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RSQRT14_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 16-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_EPI16[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Return vector of type __m512 with undefined elements.

   */
  case class MM512_UNDEFINED() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the high half of "a" and "b", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_UNPACKHI_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst".
   * 	imm8[1:0] specifies the operation
   * control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute min.
   * 	imm8[3:2]
   * specifies the sign control: 00 = sign from a, 01 = sign from compare result,
   * 10 = clear sign bit, 11 = set sign bit.
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_RANGE_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_maskz_expandloadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i32gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_MASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_reduce_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_REDUCE_PS(a, imm8)
  }
            
  def _mm512_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm256_mask3_fnmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FNMSUB_PD(a, b, c, k)
  }
            
  def _mm_min_round_sd(a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MIN_ROUND_SD(a, b, sae)
  }
            
  def _mm256_mask_cvtsepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI32_EPI8(src, k, a)
  }
            
  def _mm256_maskz_permutevar_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEVAR_PD(k, a, b)
  }
            
  def _mm_maskz_loadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpneq_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPU16_MASK(a, b)
  }
            
  def _mm512_maskz_multishift_epi64_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b)
  }
            
  def _mm_maskz_expandloadu_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvt_roundps_ph(a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPS_PH(a, rounding)
  }
            
  def _mm256_alignr_epi64(a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm_cvt_roundss_u64(a: Exp[__m128], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVT_ROUNDSS_U64(a, rounding)
  }
            
  def _mm_mask_cmpeq_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvttpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundpd_epi64(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPI64(k, a, rounding)
  }
            
  def _mm256_cvtps_epu64(a: Exp[__m128]): Exp[__m256i] = {
    MM256_CVTPS_EPU64(a)
  }
            
  def _mm256_mask_rolv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ROLV_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_packs_epi16(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PACKS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm512_mask_scalef_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SCALEF_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm_maskz_rolv_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ROLV_EPI32(k, a, b)
  }
            
  def _mm_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm_mask_adds_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm_mask3_fmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_cvtt_roundsd_u64(a: Exp[__m128d], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVTT_ROUNDSD_U64(a, rounding)
  }
            
  def _mm256_cvtusepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI32_EPI8(a)
  }
            
  def _mm512_maskz_max_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPI16(k, a, b)
  }
            
  def _mm_mask_adds_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPU8(src, k, a, b)
  }
            
  def _mm256_broadcastmw_epi32(k: Exp[Int]): Exp[__m256i] = {
    MM256_BROADCASTMW_EPI32(k)
  }
            
  def _mm512_mask_range_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RANGE_PS(src, k, a, b, imm8)
  }
            
  def _mm512_cvtpd_epu32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTPD_EPU32(a)
  }
            
  def _mm_mask_cvtepu64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm512_maskz_ternarylogic_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8)
  }
            
  def _mm_maskz_conflict_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CONFLICT_EPI32(k, a)
  }
            
  def _mm512_or_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_OR_PD(a, b)
  }
            
  def _mm512_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvttps_epu32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTTPS_EPU32(a)
  }
            
  def _mm_maskz_min_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm_mask_mov_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MOV_EPI64(src, k, a)
  }
            
  def _mm512_mask_cmplt_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLT_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm_cmpge_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPI64_MASK(a, b)
  }
            
  def _mm256_mask3_fmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMSUB_PD(a, b, c, k)
  }
            
  def _mm512_cmplt_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm_cvtps_epu64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTPS_EPU64(a)
  }
            
  def _mm_fpclass_ps_mask(a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_PS_MASK(a, imm8)
  }
            
  def _mm_mask_subs_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_srav_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI64(k, a, count)
  }
            
  def _mm512_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm256_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm256_mask_xor_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_XOR_EPI32(src, k, a, b)
  }
            
  def _mm256_mask_max_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_add_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm_maskz_and_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_AND_PS(k, a, b)
  }
            
  def _mm_maskz_unpackhi_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_UNPACKHI_PD(k, a, b)
  }
            
  def _mm512_cvtps_epi32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTPS_EPI32(a)
  }
            
  def _mm_mask3_fmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_PS(a, b, c, k)
  }
            
  def _mm_mask_unpackhi_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm512_movehdup_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_MOVEHDUP_PS(a)
  }
            
  def _mm512_maskz_loadu_epi8[A[_], T:Typ, U:Integral](k: Exp[Long], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_rolv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ROLV_EPI32(src, k, a, b)
  }
            
  def _mm512_alignr_epi64(a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_ALIGNR_EPI64(a, b, count)
  }
            
  def _mm512_mask_exp2a23_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_EXP2A23_ROUND_PS(src, k, a, rounding)
  }
            
  def _mm_mask_lzcnt_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_LZCNT_EPI32(src, k, a)
  }
            
  def _mm_mask_cvtepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvtepu32_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU32_EPI64(src, k, a)
  }
            
  def _mm512_mask_cvtepi32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm512_cvt_roundpd_epi32(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPD_EPI32(a, rounding)
  }
            
  def _mm_mask_cmpgt_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPU8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cmpge_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_maskz_add_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ADD_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_maskz_srli_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm_maskz_adds_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPI8(k, a, b)
  }
            
  def _mm512_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm512_mask_xor_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm512_mask_broadcastd_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTD_EPI32(src, k, a)
  }
            
  def _mm_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm_mask_cmp_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPI8_MASK(k1, a, b, imm8)
  }
            
  def _mm512_slli_epi64(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SLLI_EPI64(a, imm8)
  }
            
  def _mm_mask_fmsub_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUB_SS(a, k, b, c)
  }
            
  def _mm512_cmpgt_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPI64_MASK(a, b)
  }
            
  def _mm512_mask_cmpneq_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPNEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_mask_cvtepi64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm_mask_scalef_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm512_maskz_cvtepu16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU16_EPI64(k, a)
  }
            
  def _mm512_mask_sllv_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SLLV_EPI64(src, k, a, count)
  }
            
  def _mm512_maskz_inserti64x2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI64X2(k, a, b, imm8)
  }
            
  def _mm_maskz_alignr_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI8(k, a, b, count)
  }
            
  def _mm_maskz_fixupimm_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_SD(k, a, b, c, imm8)
  }
            
  def _mm512_maskz_extracti64x4_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_EXTRACTI64X4_EPI64(k, a, imm8)
  }
            
  def _mm256_mask_cmpgt_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPU16_MASK(k1, a, b)
  }
            
  def _mm256_maskz_andnot_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_ANDNOT_PD(k, a, b)
  }
            
  def _mm256_mask3_fmsubadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm512_mask_compressstoreu_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_reduce_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm_rcp14_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP14_PD(a)
  }
            
  def _mm_mask_fmadd_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FMADD_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_xor_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm256_broadcast_f64x2(a: Exp[__m128d]): Exp[__m256d] = {
    MM256_BROADCAST_F64X2(a)
  }
            
  def _mm256_mask_cvtusepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvt_roundsd_u32(a: Exp[__m128d], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVT_ROUNDSD_U32(a, rounding)
  }
            
  def _mm512_mask_cvtusepi32_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTUSEPI32_EPI16(src, k, a)
  }
            
  def _mm512_maskz_reduce_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_REDUCE_PD(k, a, imm8)
  }
            
  def _mm256_mask_alignr_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm256_min_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MIN_EPU64(a, b)
  }
            
  def _mm_maskz_cvtps_epi32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPI32(k, a)
  }
            
  def _mm512_maskz_sra_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRA_EPI64(k, a, count)
  }
            
  def _mm512_broadcastss_ps(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCASTSS_PS(a)
  }
            
  def _mm_cvtepi64_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI64_EPI16(a)
  }
            
  def _mm256_mask_cmpgt_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPU32_MASK(k1, a, b)
  }
            
  def _mm_mask_cvtps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASK_CVTPS_PH(src, k, a, rounding)
  }
            
  def _mm256_maskz_min_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI16(k, a, b)
  }
            
  def _mm_max_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPU64(a, b)
  }
            
  def _mm_cmpgt_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI32_MASK(a, b)
  }
            
  def _mm256_mask_compress_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm256_maskz_or_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_OR_EPI64(k, a, b)
  }
            
  def _mm256_mask_shuffle_i32x4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_I32X4(src, k, a, b, imm8)
  }
            
  def _mm256_ror_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROR_EPI32(a, imm8)
  }
            
  def _mm512_maskz_cvtsepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTSEPI16_EPI8(k, a)
  }
            
  def _mm256_mask_packus_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PACKUS_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_srai_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRAI_EPI32(k, a, imm8)
  }
            
  def _mm_mask_sub_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SUB_SD(src, k, a, b)
  }
            
  def _mm512_sllv_epi16(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SLLV_EPI16(a, count)
  }
            
  def _mm256_mask_fpclass_ps_mask(k1: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_FPCLASS_PS_MASK(k1, a, imm8)
  }
            
  def _mm512_fmsubadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMSUBADD_PD(a, b, c)
  }
            
  def _mm_maskz_add_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADD_EPI64(k, a, b)
  }
            
  def _mm_mul_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MUL_ROUND_SS(a, b, rounding)
  }
            
  def _mm_maskz_expand_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_EXPAND_EPI32(k, a)
  }
            
  def _mm512_packs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PACKS_EPI16(a, b)
  }
            
  def _mm256_mask_alignr_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI8(src, k, a, b, count)
  }
            
  def _mm256_maskz_insertf32x4(k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_INSERTF32X4(k, a, b, imm8)
  }
            
  def _mm256_maskz_permutex_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX_EPI64(k, a, imm8)
  }
            
  def _mm512_mask_cvtepu32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_CVTEPU32_PS(src, k, a)
  }
            
  def _mm_mask3_fmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADD_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_maskz_permute_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_PERMUTE_PS(k, a, imm8)
  }
            
  def _mm256_mask_cmpeq_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_mask_abs_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ABS_EPI64(src, k, a)
  }
            
  def _mm_mask_load_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cmpge_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPU16_MASK(k1, a, b)
  }
            
  def _mm256_mask_shuffle_f64x2(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_SHUFFLE_F64X2(src, k, a, b, imm8)
  }
            
  def _mm512_i32gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_I32GATHER_PD(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpeq_epu32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPU32_MASK(a, b)
  }
            
  def _mm512_conflict_epi32(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_CONFLICT_EPI32(a)
  }
            
  def _mm256_maskz_conflict_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_CONFLICT_EPI32(k, a)
  }
            
  def _mm512_sqrt_round_pd(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_SQRT_ROUND_PD(a, rounding)
  }
            
  def _mm_cmpeq_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm512_maskz_shuffle_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_EPI32(k, a, imm8)
  }
            
  def _mm512_fmaddsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMADDSUB_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm256_maskz_permutevar_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEVAR_PS(k, a, b)
  }
            
  def _mm512_permute_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_PERMUTE_PS(a, imm8)
  }
            
  def _mm512_srl_epi32(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRL_EPI32(a, count)
  }
            
  def _mm256_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm_maskz_sqrt_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SQRT_SS(k, a, b)
  }
            
  def _mm512_maskz_broadcast_f32x4(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCAST_F32X4(k, a)
  }
            
  def _mm256_mask_sra_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_shuffle_f32x4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_SHUFFLE_F32X4(src, k, a, b, imm8)
  }
            
  def _mm_mask_rsqrt14_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT14_SS(src, k, a, b)
  }
            
  def _mm512_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm_mask_cvtepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI64_EPI16(src, k, a)
  }
            
  def _mm256_cmple_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPI16_MASK(a, b)
  }
            
  def _mm_mask_loadu_epi16[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_broadcast_i32x8(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I32X8(k, a)
  }
            
  def _mm512_undefined(): Exp[__m512] = {
    MM512_UNDEFINED()
  }
            
  def _mm_maskz_unpackhi_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_UNPACKHI_PS(k, a, b)
  }
            
  def _mm_maskz_xor_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm_cmpgt_epu8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPU8_MASK(a, b)
  }
            
  def _mm256_mask_shuffle_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm_mask_cvtepu8_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI32(src, k, a)
  }
            
  def _mm_cvtss_u64(a: Exp[__m128]): Exp[ULong] = {
    MM_CVTSS_U64(a)
  }
            
  def _mm_range_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_RANGE_PD(a, b, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i32gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_REDUCE_PS (a, imm8) =>
      _mm256_reduce_ps(f(a), f(imm8))
    case MM512_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm512_maskz_cvtps_epi64(f(k), f(a))
    case MM256_MASK3_FNMSUB_PD (a, b, c, k) =>
      _mm256_mask3_fnmsub_pd(f(a), f(b), f(c), f(k))
    case MM_MIN_ROUND_SD (a, b, sae) =>
      _mm_min_round_sd(f(a), f(b), f(sae))
    case MM256_MASK_CVTSEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi32_epi8(f(src), f(k), f(a))
    case MM256_MASKZ_PERMUTEVAR_PD (k, a, b) =>
      _mm256_maskz_permutevar_pd(f(k), f(a), f(b))
    case iDef@MM_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPNEQ_EPU16_MASK (a, b) =>
      _mm256_cmpneq_epu16_mask(f(a), f(b))
    case MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b) =>
      _mm512_maskz_multishift_epi64_epi8(f(k), f(a), f(b))
    case iDef@MM_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVT_ROUNDPS_PH (a, rounding) =>
      _mm512_cvt_roundps_ph(f(a), f(rounding))
    case MM256_ALIGNR_EPI64 (a, b, count) =>
      _mm256_alignr_epi64(f(a), f(b), f(count))
    case MM_CVT_ROUNDSS_U64 (a, rounding) =>
      _mm_cvt_roundss_u64(f(a), f(rounding))
    case MM_MASK_CMPEQ_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm512_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDPD_EPI64 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epi64(f(k), f(a), f(rounding))
    case MM256_CVTPS_EPU64 (a) =>
      _mm256_cvtps_epu64(f(a))
    case MM256_MASK_ROLV_EPI64 (src, k, a, b) =>
      _mm256_mask_rolv_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_PACKS_EPI16 (src, k, a, b) =>
      _mm512_mask_packs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm_maskz_cvtps_epi64(f(k), f(a))
    case MM512_MASK_SCALEF_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_scalef_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_ROLV_EPI32 (k, a, b) =>
      _mm_maskz_rolv_epi32(f(k), f(a), f(b))
    case MM_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK3_FMADD_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fmadd_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_CVTT_ROUNDSD_U64 (a, rounding) =>
      _mm_cvtt_roundsd_u64(f(a), f(rounding))
    case MM256_CVTUSEPI32_EPI8 (a) =>
      _mm256_cvtusepi32_epi8(f(a))
    case MM512_MASKZ_MAX_EPI16 (k, a, b) =>
      _mm512_maskz_max_epi16(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPU8 (src, k, a, b) =>
      _mm_mask_adds_epu8(f(src), f(k), f(a), f(b))
    case MM256_BROADCASTMW_EPI32 (k) =>
      _mm256_broadcastmw_epi32(f(k))
    case MM512_MASK_RANGE_PS (src, k, a, b, imm8) =>
      _mm512_mask_range_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_CVTPD_EPU32 (a) =>
      _mm512_cvtpd_epu32(f(a))
    case MM_MASK_CVTEPU64_PS (src, k, a) =>
      _mm_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM512_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8) =>
      _mm512_maskz_ternarylogic_epi32(f(k), f(a), f(b), f(c), f(imm8))
    case MM_MASKZ_CONFLICT_EPI32 (k, a) =>
      _mm_maskz_conflict_epi32(f(k), f(a))
    case MM512_OR_PD (a, b) =>
      _mm512_or_pd(f(a), f(b))
    case iDef@MM512_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTTPS_EPU32 (a) =>
      _mm512_cvttps_epu32(f(a))
    case MM_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm_maskz_min_epu8(f(k), f(a), f(b))
    case MM_MASK_MOV_EPI64 (src, k, a) =>
      _mm_mask_mov_epi64(f(src), f(k), f(a))
    case MM512_MASK_CMPLT_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM_CMPGE_EPI64_MASK (a, b) =>
      _mm_cmpge_epi64_mask(f(a), f(b))
    case MM256_MASK3_FMSUB_PD (a, b, c, k) =>
      _mm256_mask3_fmsub_pd(f(a), f(b), f(c), f(k))
    case MM512_CMPLT_EPI16_MASK (a, b) =>
      _mm512_cmplt_epi16_mask(f(a), f(b))
    case MM_CVTPS_EPU64 (a) =>
      _mm_cvtps_epu64(f(a))
    case MM_FPCLASS_PS_MASK (a, imm8) =>
      _mm_fpclass_ps_mask(f(a), f(imm8))
    case MM_MASK_SUBS_EPI8 (src, k, a, b) =>
      _mm_mask_subs_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SRAV_EPI64 (k, a, count) =>
      _mm_maskz_srav_epi64(f(k), f(a), f(count))
    case MM512_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM256_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm256_maskz_cvtps_epu32(f(k), f(a))
    case MM256_MASK_XOR_EPI32 (src, k, a, b) =>
      _mm256_mask_xor_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASK_MAX_EPI32 (src, k, a, b) =>
      _mm256_mask_max_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm512_maskz_add_epi16(f(k), f(a), f(b))
    case MM_MASKZ_AND_PS (k, a, b) =>
      _mm_maskz_and_ps(f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_PD (k, a, b) =>
      _mm_maskz_unpackhi_pd(f(k), f(a), f(b))
    case MM512_CVTPS_EPI32 (a) =>
      _mm512_cvtps_epi32(f(a))
    case MM_MASK3_FMSUB_PS (a, b, c, k) =>
      _mm_mask3_fmsub_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case MM512_MOVEHDUP_PS (a) =>
      _mm512_movehdup_ps(f(a))
    case iDef@MM512_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi8(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_ROLV_EPI32 (src, k, a, b) =>
      _mm256_mask_rolv_epi32(f(src), f(k), f(a), f(b))
    case MM512_ALIGNR_EPI64 (a, b, count) =>
      _mm512_alignr_epi64(f(a), f(b), f(count))
    case MM512_MASK_EXP2A23_ROUND_PS (src, k, a, rounding) =>
      _mm512_mask_exp2a23_round_ps(f(src), f(k), f(a), f(rounding))
    case MM_MASK_LZCNT_EPI32 (src, k, a) =>
      _mm_mask_lzcnt_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_RSQRT14_PS (k, a) =>
      _mm256_maskz_rsqrt14_ps(f(k), f(a))
    case iDef@MM_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTEPU32_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu32_epi64(f(src), f(k), f(a))
    case MM512_MASK_CVTEPI32_PS (src, k, a) =>
      _mm512_mask_cvtepi32_ps(f(src), f(k), f(a))
    case MM512_CVT_ROUNDPD_EPI32 (a, rounding) =>
      _mm512_cvt_roundpd_epi32(f(a), f(rounding))
    case MM_MASK_CMPGT_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epu8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CMPGE_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epi64_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_ADD_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_add_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm512_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM_MASKZ_ADDS_EPI8 (k, a, b) =>
      _mm_maskz_adds_epi8(f(k), f(a), f(b))
    case MM512_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm512_maskz_cvtps_epu64(f(k), f(a))
    case MM512_MASK_XOR_PD (src, k, a, b) =>
      _mm512_mask_xor_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_BROADCASTD_EPI32 (src, k, a) =>
      _mm512_mask_broadcastd_epi32(f(src), f(k), f(a))
    case MM_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case MM_MASK_CMP_EPI8_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epi8_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_SLLI_EPI64 (a, imm8) =>
      _mm512_slli_epi64(f(a), f(imm8))
    case MM_MASK_FMSUB_SS (a, k, b, c) =>
      _mm_mask_fmsub_ss(f(a), f(k), f(b), f(c))
    case MM512_CMPGT_EPI64_MASK (a, b) =>
      _mm512_cmpgt_epi64_mask(f(a), f(b))
    case MM512_MASK_CMPNEQ_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASK_CVTEPI64_PS (src, k, a) =>
      _mm256_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM_MASK_SCALEF_PD (src, k, a, b) =>
      _mm_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPU16_EPI64 (k, a) =>
      _mm512_maskz_cvtepu16_epi64(f(k), f(a))
    case MM512_MASK_SLLV_EPI64 (src, k, a, count) =>
      _mm512_mask_sllv_epi64(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_INSERTI64X2 (k, a, b, imm8) =>
      _mm512_maskz_inserti64x2(f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_ALIGNR_EPI8 (k, a, b, count) =>
      _mm_maskz_alignr_epi8(f(k), f(a), f(b), f(count))
    case MM_MASKZ_FIXUPIMM_SD (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_sd(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_EXTRACTI64X4_EPI64 (k, a, imm8) =>
      _mm512_maskz_extracti64x4_epi64(f(k), f(a), f(imm8))
    case MM256_MASK_CMPGT_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epu16_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_ANDNOT_PD (k, a, b) =>
      _mm256_maskz_andnot_pd(f(k), f(a), f(b))
    case MM256_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm256_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case iDef@MM512_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_REDUCE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_reduce_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM_RCP14_PD (a) =>
      _mm_rcp14_pd(f(a))
    case MM_MASK_FMADD_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fmadd_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_XOR_PD (k, a, b) =>
      _mm512_maskz_xor_pd(f(k), f(a), f(b))
    case MM256_BROADCAST_F64X2 (a) =>
      _mm256_broadcast_f64x2(f(a))
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVT_ROUNDSD_U32 (a, rounding) =>
      _mm_cvt_roundsd_u32(f(a), f(rounding))
    case MM512_MASK_CVTUSEPI32_EPI16 (src, k, a) =>
      _mm512_mask_cvtusepi32_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_REDUCE_PD (k, a, imm8) =>
      _mm512_maskz_reduce_pd(f(k), f(a), f(imm8))
    case MM256_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM256_MIN_EPU64 (a, b) =>
      _mm256_min_epu64(f(a), f(b))
    case MM_MASKZ_CVTPS_EPI32 (k, a) =>
      _mm_maskz_cvtps_epi32(f(k), f(a))
    case MM512_MASKZ_SRA_EPI64 (k, a, count) =>
      _mm512_maskz_sra_epi64(f(k), f(a), f(count))
    case MM512_BROADCASTSS_PS (a) =>
      _mm512_broadcastss_ps(f(a))
    case MM_CVTEPI64_EPI16 (a) =>
      _mm_cvtepi64_epi16(f(a))
    case MM256_MASK_CMPGT_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epu32_mask(f(k1), f(a), f(b))
    case MM_MASK_CVTPS_PH (src, k, a, rounding) =>
      _mm_mask_cvtps_ph(f(src), f(k), f(a), f(rounding))
    case MM256_MASKZ_MIN_EPI16 (k, a, b) =>
      _mm256_maskz_min_epi16(f(k), f(a), f(b))
    case MM_MAX_EPU64 (a, b) =>
      _mm_max_epu64(f(a), f(b))
    case MM_CMPGT_EPI32_MASK (a, b) =>
      _mm_cmpgt_epi32_mask(f(a), f(b))
    case MM256_MASK_COMPRESS_PS (src, k, a) =>
      _mm256_mask_compress_ps(f(src), f(k), f(a))
    case MM256_MASKZ_OR_EPI64 (k, a, b) =>
      _mm256_maskz_or_epi64(f(k), f(a), f(b))
    case MM256_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_i32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_ROR_EPI32 (a, imm8) =>
      _mm256_ror_epi32(f(a), f(imm8))
    case MM512_MASKZ_CVTSEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtsepi16_epi8(f(k), f(a))
    case MM256_MASK_PACKUS_EPI32 (src, k, a, b) =>
      _mm256_mask_packus_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SRAI_EPI32 (k, a, imm8) =>
      _mm512_maskz_srai_epi32(f(k), f(a), f(imm8))
    case MM_MASK_SUB_SD (src, k, a, b) =>
      _mm_mask_sub_sd(f(src), f(k), f(a), f(b))
    case MM512_SLLV_EPI16 (a, count) =>
      _mm512_sllv_epi16(f(a), f(count))
    case MM256_MASK_FPCLASS_PS_MASK (k1, a, imm8) =>
      _mm256_mask_fpclass_ps_mask(f(k1), f(a), f(imm8))
    case MM512_FMSUBADD_PD (a, b, c) =>
      _mm512_fmsubadd_pd(f(a), f(b), f(c))
    case MM_MASKZ_ADD_EPI64 (k, a, b) =>
      _mm_maskz_add_epi64(f(k), f(a), f(b))
    case MM_MUL_ROUND_SS (a, b, rounding) =>
      _mm_mul_round_ss(f(a), f(b), f(rounding))
    case MM_MASKZ_EXPAND_EPI32 (k, a) =>
      _mm_maskz_expand_epi32(f(k), f(a))
    case MM512_PACKS_EPI16 (a, b) =>
      _mm512_packs_epi16(f(a), f(b))
    case MM256_MASK_ALIGNR_EPI8 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi8(f(src), f(k), f(a), f(b), f(count))
    case MM256_MASKZ_INSERTF32X4 (k, a, b, imm8) =>
      _mm256_maskz_insertf32x4(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_PERMUTEX_EPI64 (k, a, imm8) =>
      _mm256_maskz_permutex_epi64(f(k), f(a), f(imm8))
    case MM512_MASK_CVTEPU32_PS (src, k, a) =>
      _mm512_mask_cvtepu32_ps(f(src), f(k), f(a))
    case MM_MASK3_FMADD_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fmadd_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASKZ_PERMUTE_PS (k, a, imm8) =>
      _mm_maskz_permute_ps(f(k), f(a), f(imm8))
    case MM256_MASK_CMPEQ_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmpeq_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASK_ABS_EPI64 (src, k, a) =>
      _mm512_mask_abs_epi64(f(src), f(k), f(a))
    case iDef@MM_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CMPGE_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epu16_mask(f(k1), f(a), f(b))
    case MM256_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_f64x2(f(src), f(k), f(a), f(b), f(imm8))
    case iDef@MM512_I32GATHER_PD (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i32gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPEQ_EPU32_MASK (a, b) =>
      _mm256_cmpeq_epu32_mask(f(a), f(b))
    case MM512_CONFLICT_EPI32 (a) =>
      _mm512_conflict_epi32(f(a))
    case MM256_MASKZ_CONFLICT_EPI32 (k, a) =>
      _mm256_maskz_conflict_epi32(f(k), f(a))
    case MM512_SQRT_ROUND_PD (a, rounding) =>
      _mm512_sqrt_round_pd(f(a), f(rounding))
    case MM_CMPEQ_EPI16_MASK (a, b) =>
      _mm_cmpeq_epi16_mask(f(a), f(b))
    case MM512_MASKZ_SHUFFLE_EPI32 (k, a, imm8) =>
      _mm512_maskz_shuffle_epi32(f(k), f(a), f(imm8))
    case MM512_FMADDSUB_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmaddsub_round_pd(f(a), f(b), f(c), f(rounding))
    case MM256_MASKZ_PERMUTEVAR_PS (k, a, b) =>
      _mm256_maskz_permutevar_ps(f(k), f(a), f(b))
    case MM512_PERMUTE_PS (a, imm8) =>
      _mm512_permute_ps(f(a), f(imm8))
    case MM512_SRL_EPI32 (a, count) =>
      _mm512_srl_epi32(f(a), f(count))
    case MM256_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm256_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM_MASKZ_SQRT_SS (k, a, b) =>
      _mm_maskz_sqrt_ss(f(k), f(a), f(b))
    case MM512_MASKZ_BROADCAST_F32X4 (k, a) =>
      _mm512_maskz_broadcast_f32x4(f(k), f(a))
    case MM256_MASK_SRA_EPI32 (src, k, a, count) =>
      _mm256_mask_sra_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_f32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_RSQRT14_SS (src, k, a, b) =>
      _mm_mask_rsqrt14_ss(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPI64_PD (k, a) =>
      _mm512_maskz_cvtepi64_pd(f(k), f(a))
    case MM_MASK_CVTEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtepi64_epi16(f(src), f(k), f(a))
    case MM256_CMPLE_EPI16_MASK (a, b) =>
      _mm256_cmple_epi16_mask(f(a), f(b))
    case iDef@MM_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_epi16(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_BROADCAST_I32X8 (k, a) =>
      _mm512_maskz_broadcast_i32x8(f(k), f(a))
    case MM512_UNDEFINED () =>
      _mm512_undefined()
    case MM_MASKZ_UNPACKHI_PS (k, a, b) =>
      _mm_maskz_unpackhi_ps(f(k), f(a), f(b))
    case MM_MASKZ_XOR_PD (k, a, b) =>
      _mm_maskz_xor_pd(f(k), f(a), f(b))
    case MM_CMPGT_EPU8_MASK (a, b) =>
      _mm_cmpgt_epu8_mask(f(a), f(b))
    case MM256_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_CVTEPU8_EPI32 (src, k, a) =>
      _mm_mask_cvtepu8_epi32(f(src), f(k), f(a))
    case MM_CVTSS_U64 (a) =>
      _mm_cvtss_u64(f(a))
    case MM_RANGE_PD (a, b, imm8) =>
      _mm_range_pd(f(a), f(b), f(imm8))

    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REDUCE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_REDUCE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_ROUND_SD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MIN_ROUND_SD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEVAR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEVAR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULTISHIFT_EPI64_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPS_PH (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPS_PH (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI64 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI64 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROLV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROLV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PACKS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROLV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROLV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTMW_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTMW_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_TERNARYLOGIC_EPI32 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_TERNARYLOGIC_EPI32 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CONFLICT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CONFLICT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_OR_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_OR_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOV_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOV_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_PS_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_PS_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEHDUP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEHDUP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI8 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROLV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROLV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ALIGNR_EPI64 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_ALIGNR_EPI64 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_ROUND_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_ROUND_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_LZCNT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LZCNT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU32_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU32_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPI8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPI8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SLLI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI8 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI8 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_SD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_SD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI64X4_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI64X4_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MIN_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MIN_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRA_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRA_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTSS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTSS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_OR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_OR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_I32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROR_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROR_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PACKUS_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PACKUS_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FPCLASS_PS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FPCLASS_PS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MUL_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_EXPAND_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPAND_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PACKS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_PACKS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI8 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI8 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTF32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTF32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ABS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ABS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_F64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_F64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I32GATHER_PD (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I32GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CONFLICT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CONFLICT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CONFLICT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CONFLICT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEVAR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEVAR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRL_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRL_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F32X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F32X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_F32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOADU_EPI16 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_EPI16 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I32X8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I32X8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512016 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expandloadu_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_I32GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_REDUCE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_reduce_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK3_FNMSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MIN_ROUND_SD(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_round_sd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASK_CVTSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtsepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_PERMUTEVAR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutevar_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_CMPNEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MULTISHIFT_EPI64_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_multishift_epi64_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_EXPANDLOADU_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_expandloadu_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_CVT_ROUNDPS_PH(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundps_ph(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_ALIGNR_EPI64(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_CVT_ROUNDSS_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CMPEQ_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPD_EPI64(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epi64(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_CVTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtps_epu64(${quote(a)})")
    case iDef@MM256_MASK_ROLV_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rolv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PACKS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_packs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SCALEF_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scalef_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_ROLV_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rolv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_ADDS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FMADD_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSD_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_CVTUSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi32_epi8(${quote(a)})")
    case iDef@MM512_MASKZ_MAX_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ADDS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_adds_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCASTMW_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastmw_epi32(${quote(k)})")
    case iDef@MM512_MASK_RANGE_PS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_range_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpd_epu32(${quote(a)})")
    case iDef@MM_MASK_CVTEPU64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_TERNARYLOGIC_EPI32(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_ternarylogic_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CONFLICT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_conflict_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_OR_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_or_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_CVTTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttps_epu32(${quote(a)})")
    case iDef@MM_MASKZ_MIN_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MOV_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mov_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPLT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK3_FMSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_CMPLT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtps_epu64(${quote(a)})")
    case iDef@MM_FPCLASS_PS_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fpclass_ps_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SUBS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_subs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRAV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srav_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_XOR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_xor_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MAX_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ADD_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_AND_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_and_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_UNPACKHI_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTPS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtps_epi32(${quote(a)})")
    case iDef@MM_MASK3_FMSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_UNPACKHI_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MOVEHDUP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movehdup_ps(${quote(a)})")
    case iDef@MM512_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_epi8(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_ROLV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rolv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ALIGNR_EPI64(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_alignr_epi64(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM512_MASK_EXP2A23_ROUND_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2a23_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_LZCNT_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_lzcnt_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_RSQRT14_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_I32SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i32scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM256_MASK_CVTEPU32_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu32_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTEPI32_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVT_ROUNDPD_EPI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundpd_epi32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CMPGT_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPGE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ADD_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_SRLI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ADDS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_adds_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_XOR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_BROADCASTD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_CMP_EPI8_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_SLLI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_slli_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FMSUB_SS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_CMPGT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPNEQ_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SCALEF_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPU16_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu16_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SLLV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sllv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_INSERTI64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_inserti64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ALIGNR_EPI8(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_alignr_epi8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASKZ_FIXUPIMM_SD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_EXTRACTI64X4_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti64x4_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPGT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ANDNOT_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_andnot_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK3_FMSUBADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_compressstoreu_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_REDUCE_ROUND_SD(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_reduce_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_RCP14_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp14_pd(${quote(a)})")
    case iDef@MM_MASK_FMADD_ROUND_SS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_XOR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCAST_F64X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_f64x2(${quote(a)})")
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtusepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_CVT_ROUNDSD_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTUSEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_REDUCE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_reduce_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM256_MIN_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_min_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTPS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtps_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SRA_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sra_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_BROADCASTSS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastss_ps(${quote(a)})")
    case iDef@MM_CVTEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi64_epi16(${quote(a)})")
    case iDef@MM256_MASK_CMPGT_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTPS_PH(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_MIN_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_COMPRESS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_OR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_or_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SHUFFLE_I32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_ROR_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ror_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTSEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtsepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PACKUS_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_packus_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRAI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srai_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SUB_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SLLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sllv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_FPCLASS_PS_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fpclass_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_FMSUBADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_ADD_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_EXPAND_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_expand_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_PACKS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_packs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ALIGNR_EPI8(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_alignr_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM256_MASKZ_INSERTF32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_insertf32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_PERMUTEX_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTEPU32_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK3_FMADD_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_PERMUTE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permute_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPEQ_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpeq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ABS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_abs_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_CMPGE_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SHUFFLE_F64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_f64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_I32GATHER_PD(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i32gather_pd(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_CMPEQ_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CONFLICT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_conflict_epi32(${quote(a)})")
    case iDef@MM256_MASKZ_CONFLICT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_conflict_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SQRT_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sqrt_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CMPEQ_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SHUFFLE_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_FMADDSUB_ROUND_PD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_PERMUTEVAR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutevar_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_SRL_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srl_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_SQRT_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sqrt_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_BROADCAST_F32X4(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_f32x4(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SRA_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sra_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_SHUFFLE_F32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_RSQRT14_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt14_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_LOADU_EPI16(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_epi16(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASKZ_BROADCAST_I32X8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_i32x8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_UNDEFINED() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_undefined()")
    case iDef@MM_MASKZ_UNPACKHI_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_XOR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTEPU8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSS_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_u64(${quote(a)})")
    case iDef@MM_RANGE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
