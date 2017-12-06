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

    
trait AVX51206 extends IntrinsicsBase {
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
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MAX_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_RSQRT14_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 16-bits from input mask "k" to all 32-bit elements of "dst".
   * k: __mmask16
   */
  case class MM_BROADCASTMW_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, idx: __m256i, k: __mmask32, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI8(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MUL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 64-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m512i, a: __m256i, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_XOR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" using the control in "imm8", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: _MM_PERM_ENUM
   */
  case class MM_MASK_SHUFFLE_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
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
   * k: __mmask8, a: __m256, b: __m256, imm8: int
   */
  case class MM256_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASK_MAX_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast double-precision (64-bit) floating-point value "a" to all elements
   * of "dst".
   * a: double
   */
  case class MM512_SET1_PD(a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * src: __m256d, k: __mmask8, a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASK_GETMANT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASKZ_FIXUPIMM_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_SCALEF_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_PS(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
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
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM512_MASKZ_BROADCAST_F64X2(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
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
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_RSQRT14_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the lower double-precision (64-bit) floating-point element from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: double*, k: __mmask8, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASK_STORE_SD[A[_], U:Integral](mem_addr: Exp[A[Double]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m256i
   */
  case class MM256_CONFLICT_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 16-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOADU_EPI16[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_EXTRACTI64X2_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_ABS_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI16_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPI16_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_RCP28_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m128i
   */
  case class MM512_MASKZ_BROADCAST_I32X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * 	[round_note]
   * a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_RANGE_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_SHUFFLE_I32X4(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * k: __mmask8, a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_MASKZ_RANGE_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_RCP28_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FMADD_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
  case class MM_CVT_ROUNDSS_SI64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SUB_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCASTQ_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_OR_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADD_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ROLV_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, idx: __m128i, a: __m128i
   */
  case class MM_MASKZ_PERMUTEXVAR_EPI8(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI16_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPU32_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values.
   * e15: float, e14: float, e13: float, e12: float, e11: float, e10: float, e9: float, e8: float, e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM512_SET_PS(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_AND_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 64-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_BLEND_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASKZ_FIXUPIMM_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask8, b: __m512i, c: __m512i
   */
  case class MM512_MASK_MADD52LO_EPU64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AND_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_SHUFFLE_I64X2(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-14.
   * a: __m512d
   */
  case class MM512_RSQRT14_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m256, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULHI_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed unsigned 16-bit integers in "a" and "b", producing
   * intermediate 32-bit integers, and store the high 16 bits of the intermediate
   * integers in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULHI_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRA_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMSUBADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with all elements set to zero.

   */
  case class MM512_SETZERO_PS() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ANDNOT_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * lane from "a". Quadruplets from "b" are selected from within 128-bit lanes
   * according to the control in "imm8", and each SAD in each 64-bit lane uses the
   * selected quadruplet at 8-bit offsets.
   * k: __mmask32, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
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
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, c: __m128i
   */
  case class MM_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper 3 packed elements from "b" to the
   * upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: const int
   */
  case class MM_MASK_ROUNDSCALE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRLV_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASKZ_REDUCE_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_FIXUPIMM_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SLL_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: const int
   */
  case class MM512_MASK3_FMSUBADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AVG_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPU64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_PACKUS_EPI16(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_RSQRT14_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", store the results in "dst". The
   * maximum relative error for this approximation is less than 2^-28.
   * a: __m512d
   */
  case class MM512_RSQRT28_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512d, imm8: int, rounding: int
   */
  case class MM512_ROUNDSCALE_ROUND_PD(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI64_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 4 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU8_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using writemask "k" (the element is copied from "src" when mask bit 0 is not
   * set), and copy the upper 3 packed elements from "a" to the upper elements of
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_RCP14_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using writemask "k" (the element is copied from "src" when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". The maximum relative error for this approximation is less than 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RSQRT14_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SCALEF_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask64, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI8(k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 4 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU16_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * a: __m512d, b: __m512d, imm8: int
   */
  case class MM512_RANGE_PD(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * lane from "a". Quadruplets from "b" are selected from within 128-bit lanes
   * according to the control in "imm8", and each SAD in each 64-bit lane uses the
   * selected quadruplet at 8-bit offsets.
   * k: __mmask16, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASKZ_DBSAD_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load 512-bits of integer data from memory into "dst".
   * 	"mem_addr" does not
   * need to be aligned on any particular boundary.
   * mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_LOADU_SI512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Cast vector of type __m512i to type __m256i.
   * 	 This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512i
   */
  case class MM512_CASTSI512_SI256(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STORE_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask32, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPU64(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MIN_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 8-bit integers in "dst" with the supplied values in reverse order.
   * e63: char, e62: char, e61: char, e60: char, e59: char, e58: char, e57: char, e56: char, e55: char, e54: char, e53: char, e52: char, e51: char, e50: char, e49: char, e48: char, e47: char, e46: char, e45: char, e44: char, e43: char, e42: char, e41: char, e40: char, e39: char, e38: char, e37: char, e36: char, e35: char, e34: char, e33: char, e32: char, e31: char, e30: char, e29: char, e28: char, e27: char, e26: char, e25: char, e24: char, e23: char, e22: char, e21: char, e20: char, e19: char, e18: char, e17: char, e16: char, e15: char, e14: char, e13: char, e12: char, e11: char, e10: char, e9: char, e8: char, e7: char, e6: char, e5: char, e4: char, e3: char, e2: char, e1: char, e0: char
   */
  case class MM512_SET_EPI8(e63: Exp[Byte], e62: Exp[Byte], e61: Exp[Byte], e60: Exp[Byte], e59: Exp[Byte], e58: Exp[Byte], e57: Exp[Byte], e56: Exp[Byte], e55: Exp[Byte], e54: Exp[Byte], e53: Exp[Byte], e52: Exp[Byte], e51: Exp[Byte], e50: Exp[Byte], e49: Exp[Byte], e48: Exp[Byte], e47: Exp[Byte], e46: Exp[Byte], e45: Exp[Byte], e44: Exp[Byte], e43: Exp[Byte], e42: Exp[Byte], e41: Exp[Byte], e40: Exp[Byte], e39: Exp[Byte], e38: Exp[Byte], e37: Exp[Byte], e36: Exp[Byte], e35: Exp[Byte], e34: Exp[Byte], e33: Exp[Byte], e32: Exp[Byte], e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SLLI_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "idx" when
   * the corresponding mask bit is not set).
   * a: __m256, idx: __m256i, k: __mmask8, b: __m256
   */
  case class MM256_MASK2_PERMUTEX2VAR_PS(a: Exp[__m256], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
  case class MM_CVT_ROUNDI64_SD(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADD_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI32(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst", and copy the upper element from "b"
   * to the upper element of "dst".
   * a: __m128d, b: __m128d, imm8: int
   */
  case class MM_REDUCE_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower single-precision (32-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	imm8[1:0] specifies
   * the operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_RANGE_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_RCP28_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, imm8: const int
   */
  case class MM_MASKZ_PERMUTE_PD(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MUL_EPU32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * Shift packed 64-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SLLI_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). The maximum relative error for this approximation is less than
   * 2^-14.
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_RSQRT14_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRA_EPI64(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i
   */
  case class MM_MASK_BROADCASTB_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI64_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_CMP_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m256i, count: __m256i
   */
  case class MM256_SRAV_EPI64(a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m256d, imm8: int
   */
  case class MM256_FPCLASS_PD_MASK(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiplies elements in packed 64-bit integer vectors "a" and "b" together,
   * storing the lower 64 bits of the result in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLOX_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI8_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_MOV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m128
   */
  case class MM_GETEXP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FMADD_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst".
   * a: __m128d, idx: __m128i, b: __m128d
   */
  case class MM_PERMUTEX2VAR_PD(a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_cvtpd_epi32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTPD_EPI32(a)
  }
            
  def _mm256_max_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MAX_EPI64(a, b)
  }
            
  def _mm_maskz_rsqrt14_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT14_PS(k, a)
  }
            
  def _mm_broadcastmw_epi32(k: Exp[Int]): Exp[__m128i] = {
    MM_BROADCASTMW_EPI32(k)
  }
            
  def _mm256_mask2_permutex2var_epi8(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b)
  }
            
  def _mm256_mask_mul_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MUL_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_xor_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_XOR_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_cvtepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI8(k, a)
  }
            
  def _mm512_maskz_adds_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm_mask_shuffle_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLE_EPI32(src, k, a, imm8)
  }
            
  def _mm256_mask_cmple_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI16_MASK(k1, a, b)
  }
            
  def _mm_testn_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI8_MASK(a, b)
  }
            
  def _mm_mask_cmpgt_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPU16_MASK(k1, a, b)
  }
            
  def _mm256_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_range_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm512_mask_max_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_MAX_ROUND_PD(src, k, a, b, sae)
  }
            
  def _mm512_set1_pd(a: Exp[Double]): Exp[__m512d] = {
    MM512_SET1_PD(a)
  }
            
  def _mm_cvtss_i32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTSS_I32(a)
  }
            
  def _mm256_maskz_unpackhi_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI8(k, a, b)
  }
            
  def _mm256_mask_getmant_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_GETMANT_PD(src, k, a, interv, sc)
  }
            
  def _mm512_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fixupimm_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FIXUPIMM_ROUND_PD(k, a, b, c, imm8, rounding)
  }
            
  def _mm_scalef_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_SCALEF_PS(a, b)
  }
            
  def _mm_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m128d]): Exp[__m128] = {
    MM_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm512_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm512_maskz_broadcast_f64x2(k: Exp[Int], a: Exp[__m128d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCAST_F64X2(k, a)
  }
            
  def _mm256_mask_rsqrt14_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_RSQRT14_PD(src, k, a)
  }
            
  def _mm512_maskz_cvtepi64_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASKZ_CVTEPI64_PS(k, a)
  }
            
  def _mm_mask_store_sd[A[_], U:Integral](mem_addr: Exp[A[Double]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_SD(mem_addr, k, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cmpgt_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_conflict_epi32(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_CONFLICT_EPI32(a)
  }
            
  def _mm_maskz_loadu_epi16[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_EPI16(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_max_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU32(src, k, a, b)
  }
            
  def _mm256_maskz_extracti64x2_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8)
  }
            
  def _mm_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm_maskz_abs_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ABS_EPI16(k, a)
  }
            
  def _mm512_cvtusepi16_epi8(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTUSEPI16_EPI8(a)
  }
            
  def _mm512_cvtepi16_epi32(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPI16_EPI32(a)
  }
            
  def _mm_mask_rcp28_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RCP28_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_broadcast_i32x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I32X2(k, a)
  }
            
  def _mm512_mask_cvtsepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTSEPI64_EPI16(src, k, a)
  }
            
  def _mm512_cvt_roundepi32_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDEPI32_PS(a, rounding)
  }
            
  def _mm_movm_epi16(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI16(k)
  }
            
  def _mm512_range_round_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_RANGE_ROUND_PD(a, b, imm8, rounding)
  }
            
  def _mm512_shuffle_i32x4(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLE_I32X4(a, b, imm8)
  }
            
  def _mm256_maskz_range_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_RANGE_PD(k, a, b, imm8)
  }
            
  def _mm_rcp28_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RCP28_ROUND_SD(a, b, rounding)
  }
            
  def _mm_mask_fmadd_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FMADD_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_cvt_roundss_si64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSS_SI64(a, rounding)
  }
            
  def _mm_mask_sub_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SUB_SS(src, k, a, b)
  }
            
  def _mm_maskz_broadcastq_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTQ_EPI64(k, a)
  }
            
  def _mm512_mask_or_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_OR_PD(src, k, a, b)
  }
            
  def _mm_mask_fmadd_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADD_SD(a, k, b, c)
  }
            
  def _mm512_rolv_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ROLV_EPI32(a, b)
  }
            
  def _mm_maskz_permutexvar_epi8(k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEXVAR_EPI8(k, idx, a)
  }
            
  def _mm_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm256_maskz_cvtepi16_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI16_EPI8(k, a)
  }
            
  def _mm512_maskz_cvtepu32_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU32_EPI64(k, a)
  }
            
  def _mm256_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvtepi32_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm256_mask_srl_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI16(src, k, a, count)
  }
            
  def _mm_mask_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_unpackhi_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm512_unpacklo_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI64(a, b)
  }
            
  def _mm512_set_ps(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m512] = {
    MM512_SET_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm_mask_and_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AND_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_loadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvt_roundsd_si64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSD_SI64(a, rounding)
  }
            
  def _mm256_maskz_xor_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm_mask_blend_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm_maskz_fixupimm_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_ROUND_SS(k, a, b, c, imm8, rounding)
  }
            
  def _mm512_mask_madd52lo_epu64(a: Exp[__m512i], k: Exp[Int], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm256_maskz_and_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AND_EPI32(k, a, b)
  }
            
  def _mm256_shuffle_i64x2(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_SHUFFLE_I64X2(a, b, imm8)
  }
            
  def _mm512_rsqrt14_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RSQRT14_PD(a)
  }
            
  def _mm256_maskz_cvtepi64_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASKZ_CVTEPI64_PS(k, a)
  }
            
  def _mm256_mask_storeu_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m256], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_mulhi_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULHI_EPI16(k, a, b)
  }
            
  def _mm256_maskz_mulhi_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULHI_EPU16(k, a, b)
  }
            
  def _mm256_cmpneq_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI16_MASK(a, b)
  }
            
  def _mm512_maskz_sra_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRA_EPI32(k, a, count)
  }
            
  def _mm512_maskz_fmsubadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMSUBADD_PD(k, a, b, c)
  }
            
  def _mm512_setzero_ps(): Exp[__m512] = {
    MM512_SETZERO_PS()
  }
            
  def _mm512_maskz_andnot_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ANDNOT_EPI32(k, a, b)
  }
            
  def _mm_cmple_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI32_MASK(a, b)
  }
            
  def _mm512_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtss_i64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTSS_I64(a)
  }
            
  def _mm256_mask_cvtusepi64_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI32(src, k, a)
  }
            
  def _mm_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm_mask_cvtpd_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm_mask_roundscale_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_ROUNDSCALE_SS(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_srlv_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRLV_EPI64(k, a, count)
  }
            
  def _mm512_maskz_reduce_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm512_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm256_mask_sll_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm512_mask3_fmsubadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUBADD_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm256_mask_avg_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AVG_EPU8(src, k, a, b)
  }
            
  def _mm256_cmplt_epu64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPU64_MASK(a, b)
  }
            
  def _mm_mask_cvtsepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_packus_epi16(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PACKUS_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt14_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_RSQRT14_SS(k, a, b)
  }
            
  def _mm512_rsqrt28_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_RSQRT28_PD(a)
  }
            
  def _mm512_roundscale_round_pd(a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ROUNDSCALE_ROUND_PD(a, imm8, rounding)
  }
            
  def _mm256_maskz_srai_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI16(k, a, imm8)
  }
            
  def _mm_cvtsepi64_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI64_EPI32(a)
  }
            
  def _mm256_mask_cvtepu8_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI64(src, k, a)
  }
            
  def _mm512_mask_cmpneq_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPNEQ_EPI64_MASK(k1, a, b)
  }
            
  def _mm_mask_cmpneq_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_rcp14_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RCP14_SS(src, k, a, b)
  }
            
  def _mm_mask_rsqrt14_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RSQRT14_SD(src, k, a, b)
  }
            
  def _mm_mask_scalef_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SCALEF_PS(src, k, a, b)
  }
            
  def _mm512_maskz_permutexvar_epi8(k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI8(k, idx, a)
  }
            
  def _mm_maskz_cvtepu16_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU16_EPI64(k, a)
  }
            
  def _mm_cmple_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI64_MASK(a, b)
  }
            
  def _mm512_broadcast_f32x4(a: Exp[__m128]): Exp[__m512] = {
    MM512_BROADCAST_F32X4(a)
  }
            
  def _mm_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm512_range_pd(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_RANGE_PD(a, b, imm8)
  }
            
  def _mm256_maskz_dbsad_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_DBSAD_EPU8(k, a, b, imm8)
  }
            
  def _mm512_loadu_si512[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_LOADU_SI512(mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cmpneq_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm_cvt_roundi64_ss(a: Exp[__m128], b: Exp[Long], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDI64_SS(a, b, rounding)
  }
            
  def _mm512_castsi512_si256(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CASTSI512_SI256(a)
  }
            
  def _mm_mask_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_sllv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI64(src, k, a, count)
  }
            
  def _mm512_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm_maskz_cvtpd_epu64(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPU64(k, a)
  }
            
  def _mm512_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm512_min_round_pd(a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MIN_ROUND_PD(a, b, sae)
  }
            
  def _mm256_mask_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_set_epi8(e63: Exp[Byte], e62: Exp[Byte], e61: Exp[Byte], e60: Exp[Byte], e59: Exp[Byte], e58: Exp[Byte], e57: Exp[Byte], e56: Exp[Byte], e55: Exp[Byte], e54: Exp[Byte], e53: Exp[Byte], e52: Exp[Byte], e51: Exp[Byte], e50: Exp[Byte], e49: Exp[Byte], e48: Exp[Byte], e47: Exp[Byte], e46: Exp[Byte], e45: Exp[Byte], e44: Exp[Byte], e43: Exp[Byte], e42: Exp[Byte], e41: Exp[Byte], e40: Exp[Byte], e39: Exp[Byte], e38: Exp[Byte], e37: Exp[Byte], e36: Exp[Byte], e35: Exp[Byte], e34: Exp[Byte], e33: Exp[Byte], e32: Exp[Byte], e31: Exp[Byte], e30: Exp[Byte], e29: Exp[Byte], e28: Exp[Byte], e27: Exp[Byte], e26: Exp[Byte], e25: Exp[Byte], e24: Exp[Byte], e23: Exp[Byte], e22: Exp[Byte], e21: Exp[Byte], e20: Exp[Byte], e19: Exp[Byte], e18: Exp[Byte], e17: Exp[Byte], e16: Exp[Byte], e15: Exp[Byte], e14: Exp[Byte], e13: Exp[Byte], e12: Exp[Byte], e11: Exp[Byte], e10: Exp[Byte], e9: Exp[Byte], e8: Exp[Byte], e7: Exp[Byte], e6: Exp[Byte], e5: Exp[Byte], e4: Exp[Byte], e3: Exp[Byte], e2: Exp[Byte], e1: Exp[Byte], e0: Exp[Byte]): Exp[__m512i] = {
    MM512_SET_EPI8(e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_maskz_slli_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SLLI_EPI64(k, a, imm8)
  }
            
  def _mm_mask_cmplt_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm256_mask2_permutex2var_ps(a: Exp[__m256], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK2_PERMUTEX2VAR_PS(a, idx, k, b)
  }
            
  def _mm_cvt_roundi64_sd(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDI64_SD(a, b, rounding)
  }
            
  def _mm512_mask_add_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI64(src, k, a, b)
  }
            
  def _mm256_maskz_permutexvar_epi32(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI32(k, idx, a)
  }
            
  def _mm_reduce_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_SD(a, b, imm8)
  }
            
  def _mm_range_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_RANGE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm_maskz_rcp28_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RCP28_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm256_maskz_load_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm_maskz_permute_pd(k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_PERMUTE_PD(k, a, imm8)
  }
            
  def _mm256_mask_srai_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI32(src, k, a, imm8)
  }
            
  def _mm_maskz_mul_epu32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MUL_EPU32(k, a, b)
  }
            
  def _mm256_mask_cmpneq_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m512d]): Exp[__m256] = {
    MM512_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm512_maskz_slli_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SLLI_EPI64(k, a, imm8)
  }
            
  def _mm512_cmpeq_epu64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPU64_MASK(a, b)
  }
            
  def _mm512_mask_max_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPU64(src, k, a, b)
  }
            
  def _mm256_mask_rsqrt14_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_RSQRT14_PS(src, k, a)
  }
            
  def _mm_sra_epi64(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRA_EPI64(a, count)
  }
            
  def _mm_mask_broadcastb_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm_maskz_cvtepi64_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPI64_PD(k, a)
  }
            
  def _mm512_cmp_epu16_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPU16_MASK(a, b, imm8)
  }
            
  def _mm512_max_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPI16(a, b)
  }
            
  def _mm256_srav_epi64(a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_SRAV_EPI64(a, count)
  }
            
  def _mm256_fpclass_pd_mask(a: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_FPCLASS_PD_MASK(a, imm8)
  }
            
  def _mm_maskz_sllv_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI64(k, a, count)
  }
            
  def _mm512_mask_mullox_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLOX_EPI64(src, k, a, b)
  }
            
  def _mm_mask_srlv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI64(src, k, a, count)
  }
            
  def _mm256_maskz_cvtepi8_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI16(k, a)
  }
            
  def _mm256_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm256_mask_mov_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MOV_EPI32(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_add_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_ADD_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_getexp_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_GETEXP_PS(a)
  }
            
  def _mm512_mask_cmplt_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPI64_MASK(k1, a, b)
  }
            
  def _mm_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_fmadd_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FMADD_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm512_mask_unpacklo_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm_permutex2var_pd(a: Exp[__m128d], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_PERMUTEX2VAR_PD(a, idx, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_CVTPD_EPI32 (a) =>
      _mm512_cvtpd_epi32(f(a))
    case MM256_MAX_EPI64 (a, b) =>
      _mm256_max_epi64(f(a), f(b))
    case MM_MASKZ_RSQRT14_PS (k, a) =>
      _mm_maskz_rsqrt14_ps(f(k), f(a))
    case MM_BROADCASTMW_EPI32 (k) =>
      _mm_broadcastmw_epi32(f(k))
    case MM256_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi8(f(a), f(idx), f(k), f(b))
    case MM256_MASK_MUL_EPI32 (src, k, a, b) =>
      _mm256_mask_mul_epi32(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_XOR_EPI64 (src, k, a, b) =>
      _mm_mask_xor_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_CVTEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtepi64_epi8(f(k), f(a))
    case MM512_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm512_maskz_adds_epu16(f(k), f(a), f(b))
    case MM_MASK_SHUFFLE_EPI32 (src, k, a, imm8) =>
      _mm_mask_shuffle_epi32(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_CMPLE_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi16_mask(f(k1), f(a), f(b))
    case MM_TESTN_EPI8_MASK (a, b) =>
      _mm_testn_epi8_mask(f(a), f(b))
    case MM_MASK_CMPGT_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epu16_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm256_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM512_MASK_MAX_ROUND_PD (src, k, a, b, sae) =>
      _mm512_mask_max_round_pd(f(src), f(k), f(a), f(b), f(sae))
    case MM512_SET1_PD (a) =>
      _mm512_set1_pd(f(a))
    case MM_CVTSS_I32 (a) =>
      _mm_cvtss_i32(f(a))
    case MM256_MASKZ_UNPACKHI_EPI8 (k, a, b) =>
      _mm256_maskz_unpackhi_epi8(f(k), f(a), f(b))
    case MM256_MASK_GETMANT_PD (src, k, a, interv, sc) =>
      _mm256_mask_getmant_pd(f(src), f(k), f(a), f(interv), f(sc))
    case MM512_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm512_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FIXUPIMM_ROUND_PD (k, a, b, c, imm8, rounding) =>
      _mm512_maskz_fixupimm_round_pd(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_SCALEF_PS (a, b) =>
      _mm_scalef_ps(f(a), f(b))
    case MM_MASKZ_CVTPD_PS (k, a) =>
      _mm_maskz_cvtpd_ps(f(k), f(a))
    case MM512_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm512_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM512_MASKZ_BROADCAST_F64X2 (k, a) =>
      _mm512_maskz_broadcast_f64x2(f(k), f(a))
    case MM256_MASK_RSQRT14_PD (src, k, a) =>
      _mm256_mask_rsqrt14_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPI64_PS (k, a) =>
      _mm512_maskz_cvtepi64_ps(f(k), f(a))
    case iDef@MM_MASK_STORE_SD (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_sd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASK_CMPGT_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi64_mask(f(k1), f(a), f(b))
    case MM256_CONFLICT_EPI32 (a) =>
      _mm256_conflict_epi32(f(a))
    case iDef@MM_MASKZ_LOADU_EPI16 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_epi16(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MAX_EPU32 (src, k, a, b) =>
      _mm256_mask_max_epu32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8) =>
      _mm256_maskz_extracti64x2_epi64(f(k), f(a), f(imm8))
    case MM_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM_MASKZ_ABS_EPI16 (k, a) =>
      _mm_maskz_abs_epi16(f(k), f(a))
    case MM512_CVTUSEPI16_EPI8 (a) =>
      _mm512_cvtusepi16_epi8(f(a))
    case MM512_CVTEPI16_EPI32 (a) =>
      _mm512_cvtepi16_epi32(f(a))
    case MM_MASK_RCP28_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_rcp28_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_BROADCAST_I32X2 (k, a) =>
      _mm512_maskz_broadcast_i32x2(f(k), f(a))
    case MM512_MASK_CVTSEPI64_EPI16 (src, k, a) =>
      _mm512_mask_cvtsepi64_epi16(f(src), f(k), f(a))
    case MM512_CVT_ROUNDEPI32_PS (a, rounding) =>
      _mm512_cvt_roundepi32_ps(f(a), f(rounding))
    case MM_MOVM_EPI16 (k) =>
      _mm_movm_epi16(f(k))
    case MM512_RANGE_ROUND_PD (a, b, imm8, rounding) =>
      _mm512_range_round_pd(f(a), f(b), f(imm8), f(rounding))
    case MM512_SHUFFLE_I32X4 (a, b, imm8) =>
      _mm512_shuffle_i32x4(f(a), f(b), f(imm8))
    case MM256_MASKZ_RANGE_PD (k, a, b, imm8) =>
      _mm256_maskz_range_pd(f(k), f(a), f(b), f(imm8))
    case MM_RCP28_ROUND_SD (a, b, rounding) =>
      _mm_rcp28_round_sd(f(a), f(b), f(rounding))
    case MM_MASK_FMADD_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fmadd_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_CVT_ROUNDSS_SI64 (a, rounding) =>
      _mm_cvt_roundss_si64(f(a), f(rounding))
    case MM_MASK_SUB_SS (src, k, a, b) =>
      _mm_mask_sub_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_BROADCASTQ_EPI64 (k, a) =>
      _mm_maskz_broadcastq_epi64(f(k), f(a))
    case MM512_MASK_OR_PD (src, k, a, b) =>
      _mm512_mask_or_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_FMADD_SD (a, k, b, c) =>
      _mm_mask_fmadd_sd(f(a), f(k), f(b), f(c))
    case MM512_ROLV_EPI32 (a, b) =>
      _mm512_rolv_epi32(f(a), f(b))
    case MM_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a) =>
      _mm_maskz_permutexvar_epi8(f(k), f(idx), f(a))
    case MM_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASKZ_CVTEPI16_EPI8 (k, a) =>
      _mm256_maskz_cvtepi16_epi8(f(k), f(a))
    case MM512_MASKZ_CVTEPU32_EPI64 (k, a) =>
      _mm512_maskz_cvtepu32_epi64(f(k), f(a))
    case MM256_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_CVTEPI32_PD (src, k, a) =>
      _mm512_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM256_MASK_SRL_EPI16 (src, k, a, count) =>
      _mm256_mask_srl_epi16(f(src), f(k), f(a), f(count))
    case iDef@MM_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM512_UNPACKLO_EPI64 (a, b) =>
      _mm512_unpacklo_epi64(f(a), f(b))
    case MM512_SET_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_ps(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM_MASK_AND_EPI64 (src, k, a, b) =>
      _mm_mask_and_epi64(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVT_ROUNDSD_SI64 (a, rounding) =>
      _mm_cvt_roundsd_si64(f(a), f(rounding))
    case MM256_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm256_maskz_xor_epi64(f(k), f(a), f(b))
    case MM_MASK_BLEND_EPI64 (k, a, b) =>
      _mm_mask_blend_epi64(f(k), f(a), f(b))
    case MM_MASKZ_FIXUPIMM_ROUND_SS (k, a, b, c, imm8, rounding) =>
      _mm_maskz_fixupimm_round_ss(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm512_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_AND_EPI32 (k, a, b) =>
      _mm256_maskz_and_epi32(f(k), f(a), f(b))
    case MM256_SHUFFLE_I64X2 (a, b, imm8) =>
      _mm256_shuffle_i64x2(f(a), f(b), f(imm8))
    case MM512_RSQRT14_PD (a) =>
      _mm512_rsqrt14_pd(f(a))
    case MM256_MASKZ_CVTEPI64_PS (k, a) =>
      _mm256_maskz_cvtepi64_ps(f(k), f(a))
    case iDef@MM256_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MULHI_EPI16 (k, a, b) =>
      _mm512_maskz_mulhi_epi16(f(k), f(a), f(b))
    case MM256_MASKZ_MULHI_EPU16 (k, a, b) =>
      _mm256_maskz_mulhi_epu16(f(k), f(a), f(b))
    case MM256_CMPNEQ_EPI16_MASK (a, b) =>
      _mm256_cmpneq_epi16_mask(f(a), f(b))
    case MM512_MASKZ_SRA_EPI32 (k, a, count) =>
      _mm512_maskz_sra_epi32(f(k), f(a), f(count))
    case MM512_MASKZ_FMSUBADD_PD (k, a, b, c) =>
      _mm512_maskz_fmsubadd_pd(f(k), f(a), f(b), f(c))
    case MM512_SETZERO_PS () =>
      _mm512_setzero_ps()
    case MM512_MASKZ_ANDNOT_EPI32 (k, a, b) =>
      _mm512_maskz_andnot_epi32(f(k), f(a), f(b))
    case MM_CMPLE_EPI32_MASK (a, b) =>
      _mm_cmple_epi32_mask(f(a), f(b))
    case MM512_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm512_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case iDef@MM_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVTSS_I64 (a) =>
      _mm_cvtss_i64(f(a))
    case MM256_MASK_CVTUSEPI64_EPI32 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi32(f(src), f(k), f(a))
    case MM_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM_MASK_ROUNDSCALE_SS (src, k, a, b, imm8) =>
      _mm_mask_roundscale_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SRLV_EPI64 (k, a, count) =>
      _mm512_maskz_srlv_epi64(f(k), f(a), f(count))
    case MM512_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm512_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM512_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm512_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm256_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASK3_FMSUBADD_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmsubadd_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM256_MASK_AVG_EPU8 (src, k, a, b) =>
      _mm256_mask_avg_epu8(f(src), f(k), f(a), f(b))
    case MM256_CMPLT_EPU64_MASK (a, b) =>
      _mm256_cmplt_epu64_mask(f(a), f(b))
    case iDef@MM_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_PACKUS_EPI16 (src, k, a, b) =>
      _mm512_mask_packus_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT14_SS (k, a, b) =>
      _mm_maskz_rsqrt14_ss(f(k), f(a), f(b))
    case MM512_RSQRT28_PD (a) =>
      _mm512_rsqrt28_pd(f(a))
    case MM512_ROUNDSCALE_ROUND_PD (a, imm8, rounding) =>
      _mm512_roundscale_round_pd(f(a), f(imm8), f(rounding))
    case MM256_MASKZ_SRAI_EPI16 (k, a, imm8) =>
      _mm256_maskz_srai_epi16(f(k), f(a), f(imm8))
    case MM_CVTSEPI64_EPI32 (a) =>
      _mm_cvtsepi64_epi32(f(a))
    case MM256_MASK_CVTEPU8_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu8_epi64(f(src), f(k), f(a))
    case MM512_MASK_CMPNEQ_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epi64_mask(f(k1), f(a), f(b))
    case MM_MASK_CMPNEQ_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_RCP14_SS (src, k, a, b) =>
      _mm_mask_rcp14_ss(f(src), f(k), f(a), f(b))
    case MM_MASK_RSQRT14_SD (src, k, a, b) =>
      _mm_mask_rsqrt14_sd(f(src), f(k), f(a), f(b))
    case MM_MASK_SCALEF_PS (src, k, a, b) =>
      _mm_mask_scalef_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi8(f(k), f(idx), f(a))
    case MM_MASKZ_CVTEPU16_EPI64 (k, a) =>
      _mm_maskz_cvtepu16_epi64(f(k), f(a))
    case MM_CMPLE_EPI64_MASK (a, b) =>
      _mm_cmple_epi64_mask(f(a), f(b))
    case MM512_BROADCAST_F32X4 (a) =>
      _mm512_broadcast_f32x4(f(a))
    case MM_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM512_RANGE_PD (a, b, imm8) =>
      _mm512_range_pd(f(a), f(b), f(imm8))
    case MM256_MASKZ_DBSAD_EPU8 (k, a, b, imm8) =>
      _mm256_maskz_dbsad_epu8(f(k), f(a), f(b), f(imm8))
    case iDef@MM512_LOADU_SI512 (mem_addr, mem_addrOffset) =>
      _mm512_loadu_si512(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CMPNEQ_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi16_mask(f(k1), f(a), f(b))
    case MM_CVT_ROUNDI64_SS (a, b, rounding) =>
      _mm_cvt_roundi64_ss(f(a), f(b), f(rounding))
    case MM512_CASTSI512_SI256 (a) =>
      _mm512_castsi512_si256(f(a))
    case iDef@MM_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SLLV_EPI64 (src, k, a, count) =>
      _mm256_mask_sllv_epi64(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm512_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM_MASKZ_CVTPD_EPU64 (k, a) =>
      _mm_maskz_cvtpd_epu64(f(k), f(a))
    case MM512_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm512_maskz_broadcastss_ps(f(k), f(a))
    case MM512_MIN_ROUND_PD (a, b, sae) =>
      _mm512_min_round_pd(f(a), f(b), f(sae))
    case iDef@MM256_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SET_EPI8 (e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_set_epi8(f(e63), f(e62), f(e61), f(e60), f(e59), f(e58), f(e57), f(e56), f(e55), f(e54), f(e53), f(e52), f(e51), f(e50), f(e49), f(e48), f(e47), f(e46), f(e45), f(e44), f(e43), f(e42), f(e41), f(e40), f(e39), f(e38), f(e37), f(e36), f(e35), f(e34), f(e33), f(e32), f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_MASKZ_SLLI_EPI64 (k, a, imm8) =>
      _mm256_maskz_slli_epi64(f(k), f(a), f(imm8))
    case MM_MASK_CMPLT_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmplt_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm512_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM256_MASK2_PERMUTEX2VAR_PS (a, idx, k, b) =>
      _mm256_mask2_permutex2var_ps(f(a), f(idx), f(k), f(b))
    case MM_CVT_ROUNDI64_SD (a, b, rounding) =>
      _mm_cvt_roundi64_sd(f(a), f(b), f(rounding))
    case MM512_MASK_ADD_EPI64 (src, k, a, b) =>
      _mm512_mask_add_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi32(f(k), f(idx), f(a))
    case MM_REDUCE_SD (a, b, imm8) =>
      _mm_reduce_sd(f(a), f(b), f(imm8))
    case MM_RANGE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_range_round_ss(f(a), f(b), f(imm8), f(rounding))
    case MM_MASKZ_RCP28_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_rcp28_round_sd(f(k), f(a), f(b), f(rounding))
    case iDef@MM256_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM_MASKZ_PERMUTE_PD (k, a, imm8) =>
      _mm_maskz_permute_pd(f(k), f(a), f(imm8))
    case MM256_MASK_SRAI_EPI32 (src, k, a, imm8) =>
      _mm256_mask_srai_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_MUL_EPU32 (k, a, b) =>
      _mm_maskz_mul_epu32(f(k), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVTPD_PS (k, a) =>
      _mm512_maskz_cvtpd_ps(f(k), f(a))
    case MM512_MASKZ_SLLI_EPI64 (k, a, imm8) =>
      _mm512_maskz_slli_epi64(f(k), f(a), f(imm8))
    case MM512_CMPEQ_EPU64_MASK (a, b) =>
      _mm512_cmpeq_epu64_mask(f(a), f(b))
    case MM512_MASK_MAX_EPU64 (src, k, a, b) =>
      _mm512_mask_max_epu64(f(src), f(k), f(a), f(b))
    case MM256_MASK_RSQRT14_PS (src, k, a) =>
      _mm256_mask_rsqrt14_ps(f(src), f(k), f(a))
    case MM_SRA_EPI64 (a, count) =>
      _mm_sra_epi64(f(a), f(count))
    case MM_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPI64_PD (k, a) =>
      _mm_maskz_cvtepi64_pd(f(k), f(a))
    case MM512_CMP_EPU16_MASK (a, b, imm8) =>
      _mm512_cmp_epu16_mask(f(a), f(b), f(imm8))
    case MM512_MAX_EPI16 (a, b) =>
      _mm512_max_epi16(f(a), f(b))
    case MM256_SRAV_EPI64 (a, count) =>
      _mm256_srav_epi64(f(a), f(count))
    case MM256_FPCLASS_PD_MASK (a, imm8) =>
      _mm256_fpclass_pd_mask(f(a), f(imm8))
    case MM_MASKZ_SLLV_EPI64 (k, a, count) =>
      _mm_maskz_sllv_epi64(f(k), f(a), f(count))
    case MM512_MASK_MULLOX_EPI64 (src, k, a, b) =>
      _mm512_mask_mullox_epi64(f(src), f(k), f(a), f(b))
    case MM_MASK_SRLV_EPI64 (src, k, a, count) =>
      _mm_mask_srlv_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_CVTEPI8_EPI16 (k, a) =>
      _mm256_maskz_cvtepi8_epi16(f(k), f(a))
    case MM256_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm256_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM256_MASK_MOV_EPI32 (src, k, a) =>
      _mm256_mask_mov_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_ADD_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_add_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_GETEXP_PS (a) =>
      _mm_getexp_ps(f(a))
    case MM512_MASK_CMPLT_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epi64_mask(f(k1), f(a), f(b))
    case iDef@MM_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_FMADD_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fmadd_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM_PERMUTEX2VAR_PD (a, idx, b) =>
      _mm_permutex2var_pd(f(a), f(idx), f(b))

    case Reflect(MM512_CVTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MAX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MAX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCASTMW_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM_BROADCASTMW_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI8 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MUL_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MUL_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLE_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLE_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_ROUND_PD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_ROUND_PD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_GETMANT_PD (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_GETMANT_PD (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PD (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PD (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RSQRT14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RSQRT14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_SD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_SD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CONFLICT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CONFLICT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_EPI16 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_EPI16 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTI64X2_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTI64X2_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ABS_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ABS_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP28_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP28_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPI32_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPI32_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_ROUND_PD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_ROUND_PD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_I32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_I32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RANGE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RANGE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTQ_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTQ_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_OR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_OR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROLV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ROLV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEXVAR_EPI8 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_PS (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_ROUND_SS (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_ROUND_SS (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_I64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_I64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT14_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT14_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULHI_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULHI_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRA_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRA_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_PS (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ANDNOT_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ANDNOT_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSS_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSS_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AVG_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AVG_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PACKUS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKUS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT28_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT28_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_ROUND_PD (a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_ROUND_PD (f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI8 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI8 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU16_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU16_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DBSAD_EPU8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DBSAD_EPU8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_LOADU_SI512 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_LOADU_SI512 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI512_SI256 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI512_SI256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_ROUND_PD (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_ROUND_PD (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET_EPI8 (e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SET_EPI8 (f(e63), f(e62), f(e61), f(e60), f(e59), f(e58), f(e57), f(e56), f(e55), f(e54), f(e53), f(e52), f(e51), f(e50), f(e49), f(e48), f(e47), f(e46), f(e45), f(e44), f(e43), f(e42), f(e41), f(e40), f(e39), f(e38), f(e37), f(e36), f(e35), f(e34), f(e33), f(e32), f(e31), f(e30), f(e29), f(e28), f(e27), f(e26), f(e25), f(e24), f(e23), f(e22), f(e21), f(e20), f(e19), f(e18), f(e17), f(e16), f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_PS (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_PS (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDI64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDI64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI32 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI32 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_SD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_SD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RANGE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RANGE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RSQRT14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RSQRT14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRA_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRA_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPU16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPU16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM256_SRAV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FPCLASS_PD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_FPCLASS_PD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLOX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLOX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_PD (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_PD (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51206 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_CVTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpd_epi32(${quote(a)})")
    case iDef@MM256_MAX_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_max_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RSQRT14_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt14_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_BROADCASTMW_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcastmw_epi32(${quote(k)})")
    case iDef@MM256_MASK2_PERMUTEX2VAR_EPI8(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_MASK_MUL_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mul_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASK_XOR_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_xor_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_ADDS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SHUFFLE_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shuffle_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPLE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TESTN_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testn_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPGT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_RANGE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_MAX_ROUND_PD(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_SET1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_pd(${quote(a)})")
    case iDef@MM_CVTSS_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_i32(${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKHI_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_GETMANT_PD(src, k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_getmant_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_MASKZ_FMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FIXUPIMM_ROUND_PD(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_SCALEF_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_scalef_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTPD_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_BROADCAST_F64X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_f64x2(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_RSQRT14_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rsqrt14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPI64_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi64_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_STORE_SD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_sd((double*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_CMPGT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CONFLICT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_conflict_epi32(${quote(a)})")
    case iDef@MM_MASKZ_LOADU_EPI16(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_epi16(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_MAX_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_EXTRACTI64X2_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_extracti64x2_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ABS_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_abs_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTUSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi16_epi8(${quote(a)})")
    case iDef@MM512_CVTEPI16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi16_epi32(${quote(a)})")
    case iDef@MM_MASK_RCP28_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp28_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_BROADCAST_I32X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_i32x2(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTSEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVT_ROUNDEPI32_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepi32_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MOVM_EPI16(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movm_epi16(${quote(k)})")
    case iDef@MM512_RANGE_ROUND_PD(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_range_round_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_SHUFFLE_I32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_i32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_RANGE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_range_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_RCP28_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp28_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMADD_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_CVT_ROUNDSS_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_SUB_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_BROADCASTQ_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_broadcastq_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_OR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_or_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FMADD_SD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_ROLV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rolv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_PERMUTEXVAR_EPI8(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutexvar_epi8(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_FNMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_CVTEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SRL_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srl_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i32scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_UNPACKLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_SET_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_ps(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM_MASK_AND_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_and_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVT_ROUNDSD_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_XOR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BLEND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FIXUPIMM_ROUND_SS(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MADD52LO_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_AND_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_and_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLE_I64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_i64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_RSQRT14_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt14_pd(${quote(a)})")
    case iDef@MM256_MASKZ_CVTEPI64_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi64_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_MULHI_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mulhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MULHI_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mulhi_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPNEQ_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRA_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sra_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_FMSUBADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_SETZERO_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setzero_ps()")
    case iDef@MM512_MASKZ_ANDNOT_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_andnot_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTSS_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtss_i64(${quote(a)})")
    case iDef@MM256_MASK_CVTUSEPI64_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_CVTPD_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ROUNDSCALE_SS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_roundscale_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SRLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srlv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_REDUCE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SLL_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK3_FMSUBADD_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM256_MASK_AVG_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_avg_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPLT_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTSEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtsepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_PACKUS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_packus_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RSQRT14_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt14_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_RSQRT28_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt28_pd(${quote(a)})")
    case iDef@MM512_ROUNDSCALE_ROUND_PD(a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundscale_round_pd(${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_SRAI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srai_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTSEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi64_epi32(${quote(a)})")
    case iDef@MM256_MASK_CVTEPU8_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPNEQ_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPNEQ_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RCP14_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp14_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RSQRT14_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt14_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SCALEF_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_scalef_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTEXVAR_EPI8(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi8(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPU16_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu16_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPLE_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCAST_F32X4(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_f32x4(${quote(a)})")
    case iDef@MM_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_RANGE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_DBSAD_EPU8(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_dbsad_epu8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_LOADU_SI512(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_loadu_si512((void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_CMPNEQ_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDI64_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundi64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_CASTSI512_SI256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castsi512_si256(${quote(a)})")
    case iDef@MM_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_SLLV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sllv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_BROADCASTSS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MIN_ROUND_PD(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_round_pd(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i32scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_SET_EPI8(e63, e62, e61, e60, e59, e58, e57, e56, e55, e54, e53, e52, e51, e50, e49, e48, e47, e46, e45, e44, e43, e42, e41, e40, e39, e38, e37, e36, e35, e34, e33, e32, e31, e30, e29, e28, e27, e26, e25, e24, e23, e22, e21, e20, e19, e18, e17, e16, e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set_epi8(${quote(e63)}, ${quote(e62)}, ${quote(e61)}, ${quote(e60)}, ${quote(e59)}, ${quote(e58)}, ${quote(e57)}, ${quote(e56)}, ${quote(e55)}, ${quote(e54)}, ${quote(e53)}, ${quote(e52)}, ${quote(e51)}, ${quote(e50)}, ${quote(e49)}, ${quote(e48)}, ${quote(e47)}, ${quote(e46)}, ${quote(e45)}, ${quote(e44)}, ${quote(e43)}, ${quote(e42)}, ${quote(e41)}, ${quote(e40)}, ${quote(e39)}, ${quote(e38)}, ${quote(e37)}, ${quote(e36)}, ${quote(e35)}, ${quote(e34)}, ${quote(e33)}, ${quote(e32)}, ${quote(e31)}, ${quote(e30)}, ${quote(e29)}, ${quote(e28)}, ${quote(e27)}, ${quote(e26)}, ${quote(e25)}, ${quote(e24)}, ${quote(e23)}, ${quote(e22)}, ${quote(e21)}, ${quote(e20)}, ${quote(e19)}, ${quote(e18)}, ${quote(e17)}, ${quote(e16)}, ${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASKZ_SLLI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_slli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPLT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK2_PERMUTEX2VAR_PS(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask2_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDI64_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundi64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ADD_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_PERMUTEXVAR_EPI32(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi32(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_REDUCE_SD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_reduce_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_RANGE_ROUND_SS(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_range_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_RCP28_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp28_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_LOAD_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_load_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_PERMUTE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permute_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SRAI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srai_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MUL_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPNEQ_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTPD_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SLLI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_slli_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CMPEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MAX_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_RSQRT14_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rsqrt14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_SRA_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sra_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_BROADCASTB_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPI64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMP_EPU16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epu16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MAX_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SRAV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srav_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_FPCLASS_PD_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fpclass_pd_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SLLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sllv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_MULLOX_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mullox_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRLV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srlv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_CVTEPI8_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_FMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_MOV_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mov_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_compressstoreu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_ADD_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_GETEXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getexp_ps(${quote(a)})")
    case iDef@MM512_MASK_CMPLT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_compressstoreu_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_FMADD_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_PERMUTEX2VAR_PD(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
