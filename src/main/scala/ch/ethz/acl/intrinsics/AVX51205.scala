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

    
trait AVX51205 extends IntrinsicsBase {
  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16 bits from masks "a" and "b", and store the 32-bit
   * result in "k".
   * a: __mmask32, b: __mmask32
   */
  case class MM512_KUNPACKW(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k" using zeromask "k1" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_RCP28_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_RORV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPU64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPU32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * k: __mmask16, a: __m512, b: __m512, imm8: int
   */
  case class MM512_MASKZ_RANGE_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPU32(a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower single-precision (32-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k" using zeromask "k1" (the element is zeroed out when mask bit 0 is not
   * set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_FPCLASS_SS_MASK(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_MOVELDUP_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m256i
   */
  case class MM256_CONFLICT_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_RORV_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU16_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * a: __m256i, k: __mmask8, b: __m256i, c: __m256i
   */
  case class MM256_MASK_MADD52LO_EPU64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_DIV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SLLI_EPI16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCASTQ_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASKZ_INSERTI32X8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128, rounding: int
   */
  case class MM_MASKZ_CVT_ROUNDSS_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_MUL_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AND_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_MAX_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m128d, k: __mmask8, a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRAI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 16-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * k: __mmask32, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_EPI16[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 8 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_INSERTI32X8(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SUB_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI32(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMSUBADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i
   */
  case class MM256_MASKZ_ABS_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MAX_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_INSERTI32X4(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m512
   */
  case class MM512_RCP14_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
  case class MM_CVT_ROUNDSS_I64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI64_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 8 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m256
   */
  case class MM512_BROADCAST_F32X8(a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TESTN_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI16_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m512i, a: __m512i, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 8-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m512i, k: __mmask64, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_EPI8[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Long], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m512i
   */
  case class MM512_ABS_EPI64(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m128, imm8: int
   */
  case class MM_ROUNDSCALE_PS(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_ABS_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
   * a: __m256, b: __m256, imm8: int
   */
  case class MM256_RANGE_PS(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASKZ_REDUCE_PS(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_COMPRESS_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI64_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_SHUFFLELO_EPI16(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_CMP_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM256_MASKZ_BROADCASTSD_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 64-bit integers in "b" from packed 64-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m512d, imm8: const int
   */
  case class MM512_PERMUTE_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SLLV_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 64-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_BROADCAST_I64X4(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low 8-bits from input mask "k" to all 64-bit elements of "dst".
   * k: __mmask8
   */
  case class MM256_BROADCASTMB_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", subtract the lower element in "c" from the negated intermediate
   * result, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FNMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASK_ROUNDSCALE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPI64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_EXP2A23_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_PACKUS_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_F32X4(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI16(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_MUL_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_COMPRESS_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, idx: __m256i, a: __m256i
   */
  case class MM256_MASK_PERMUTEXVAR_EPI16(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "dst" at the location specified by "imm8".
   * a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_INSERTI64X2(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256d to type __m512d; the upper 256 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256d
   */
  case class MM512_CASTPD256_PD512(a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPI8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASK_MAX_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the low 64 bits of 128-bit lanes of
   * "dst", with the high 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASK_SHUFFLELO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI64_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements from memory into
   * cache level specified by "hint" using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale").
   * Prefetched elements are merged in cache using writemask "k" (elements are
   * copied from memory when the corresponding mask bit is set). "scale" should be
   * 1, 2, 4 or 8. The "hint" parameter may be 1 (_MM_HINT_T0) for prefetching to
   * L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * vindex: __m512i, mask: __mmask8, base_addr: void const*, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPI64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m256i, imm8: int
   */
  case class MM512_MASK_INSERTI64X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m256d
   */
  case class MM256_GETEXP_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_SI64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * a: __m512d, k: __mmask8, src: __m512d, rounding: int
   */
  case class MM512_MASK_EXP2A23_ROUND_PD(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MUL_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_SI64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_CVTEPU32_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask32, idx: __m512i, a: __m512i
   */
  case class MM512_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m512d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_LOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_EXPAND_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRLI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 8 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU16_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SLLI_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "b" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, imm8: int, rounding: int
   */
  case class MM_MASKZ_REDUCE_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and return the
   * boolean result (0 or 1).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * a: __m128, b: __m128, imm8: const int, sae: const int
   */
  case class MM_COMI_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23. [round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_EXP2A23_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_BROADCASTD_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AND_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI64(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_I64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLLV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" to
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_MOV_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASKZ_ROUNDSCALE_PS(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256i to type __m512i; the upper 256 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m256i
   */
  case class MM512_ZEXTSI256_SI512(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m256i
   */
  case class MM256_ABS_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SLLI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m256i, b: __m256i
   */
  case class MM256_TEST_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * 
   * 	[round_note]
   * a: __m128d, b: unsigned __int64, rounding: int
   */
  case class MM_CVT_ROUNDU64_SD(a: Exp[__m128d], b: Exp[ULong], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_SUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: int
   */
  case class MM512_MASK_SET1_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCAST_I64X2(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRL_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512, b: __m256, imm8: int
   */
  case class MM512_INSERTF32X8(a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast single-precision (32-bit) floating-point value "a" to all elements
   * of "dst".
   * a: float
   */
  case class MM512_SET1_PS(a: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_SUB_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASK_ALIGNR_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MUL_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256d, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI8_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, a: __m512i, scale: int, base_addrOffset: int
   */
  case class MM512_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512d, b: __m128d, imm8: int
   */
  case class MM512_INSERTF64X2(a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_GETEXP_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 		[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_MUL_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask32
   */
  case class MM512_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_BROADCASTSS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	 [round_note]
   * src: __m512i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPS_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASK_INSERTI64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_SHUFFLE_I64X2(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_mask_loadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kunpackw(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KUNPACKW(a, b)
  }
            
  def _mm256_mask_cmpgt_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_maskz_rcp28_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RCP28_ROUND_PD(k, a, rounding)
  }
            
  def _mm256_rorv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_RORV_EPI32(a, b)
  }
            
  def _mm256_cvtpd_epu64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTPD_EPU64(a)
  }
            
  def _mm512_maskz_cvtt_roundpd_epu32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPU32(k, a, sae)
  }
            
  def _mm512_maskz_range_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RANGE_PS(k, a, b, imm8)
  }
            
  def _mm_cmpge_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPI32_MASK(a, b)
  }
            
  def _mm256_cvtpd_epu32(a: Exp[__m256d]): Exp[__m128i] = {
    MM256_CVTPD_EPU32(a)
  }
            
  def _mm_mask_fpclass_ss_mask(k1: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_SS_MASK(k1, a, imm8)
  }
            
  def _mm_movm_epi64(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI64(k)
  }
            
  def _mm_mask_moveldup_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MOVELDUP_PS(src, k, a)
  }
            
  def _mm512_mask_unpackhi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm256_conflict_epi64(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_CONFLICT_EPI64(a)
  }
            
  def _mm512_maskz_rorv_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_RORV_EPI64(k, a, b)
  }
            
  def _mm_maskz_cvtepu16_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU16_EPI32(k, a)
  }
            
  def _mm256_mask_madd52lo_epu64(a: Exp[__m256i], k: Exp[Int], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD52LO_EPU64(a, k, b, c)
  }
            
  def _mm512_mask_div_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_DIV_PS(src, k, a, b)
  }
            
  def _mm512_maskz_slli_epi16(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SLLI_EPI16(k, a, imm8)
  }
            
  def _mm512_maskz_sub_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI64(k, a, b)
  }
            
  def _mm512_broadcastq_epi64(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTQ_EPI64(a)
  }
            
  def _mm512_maskz_inserti32x8(k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI32X8(k, a, b, imm8)
  }
            
  def _mm256_mask_loadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvt_roundss_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_CVT_ROUNDSS_SD(k, a, b, rounding)
  }
            
  def _mm256_mask_sub_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm_mask_unpacklo_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_mul_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MUL_PS(k, a, b)
  }
            
  def _mm_maskz_and_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AND_EPI64(k, a, b)
  }
            
  def _mm_mask_cvtusepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm256_mask_max_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MAX_PD(src, k, a, b)
  }
            
  def _mm_mask_getmant_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETMANT_PD(src, k, a, interv, sc)
  }
            
  def _mm_maskz_srai_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRAI_EPI32(k, a, imm8)
  }
            
  def _mm512_maskz_loadu_epi16[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_EPI16(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_inserti32x8(a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_INSERTI32X8(a, b, imm8)
  }
            
  def _mm_mask_cvtepi64_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm512_adds_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPI8(a, b)
  }
            
  def _mm_maskz_sub_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SUB_PD(k, a, b)
  }
            
  def _mm256_maskz_permutex2var_epi32(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b)
  }
            
  def _mm_maskz_srav_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI16(k, a, count)
  }
            
  def _mm256_mask_cvtusepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI16_EPI8(src, k, a)
  }
            
  def _mm512_mask3_fmsubadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm_mask_cmpneq_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPU32_MASK(k1, a, b)
  }
            
  def _mm256_maskz_abs_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ABS_EPI8(k, a)
  }
            
  def _mm_maskz_max_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MAX_PS(k, a, b)
  }
            
  def _mm256_inserti32x4(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTI32X4(a, b, imm8)
  }
            
  def _mm512_rcp14_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP14_PS(a)
  }
            
  def _mm_cvt_roundss_i64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSS_I64(a, rounding)
  }
            
  def _mm256_maskz_cvtepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI64_EPI16(k, a)
  }
            
  def _mm512_broadcast_f32x8(a: Exp[__m256]): Exp[__m512] = {
    MM512_BROADCAST_F32X8(a)
  }
            
  def _mm256_testn_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TESTN_EPI32_MASK(a, b)
  }
            
  def _mm256_cvtusepi16_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI16_EPI8(a)
  }
            
  def _mm256_cmpneq_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPI32_MASK(a, b)
  }
            
  def _mm_mask_cvtsepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_multishift_epi64_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm512_mask_loadu_epi8[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Long], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_abs_epi64(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_ABS_EPI64(a)
  }
            
  def _mm_roundscale_ps(a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm256_maskz_abs_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ABS_EPI16(k, a)
  }
            
  def _mm512_cmpgt_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPGT_EPU8_MASK(a, b)
  }
            
  def _mm256_range_ps(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_RANGE_PS(a, b, imm8)
  }
            
  def _mm_maskz_reduce_ps(k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_PS(k, a, imm8)
  }
            
  def _mm_maskz_compress_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_COMPRESS_PD(k, a)
  }
            
  def _mm512_cvtusepi64_epi16(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTUSEPI64_EPI16(a)
  }
            
  def _mm512_shufflelo_epi16(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLELO_EPI16(a, imm8)
  }
            
  def _mm_cmp_epu32_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPU32_MASK(a, b, imm8)
  }
            
  def _mm_mask_cmpge_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_broadcastsd_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m256d] = {
    MM256_MASKZ_BROADCASTSD_PD(k, a)
  }
            
  def _mm256_mask_sub_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI64(src, k, a, b)
  }
            
  def _mm512_permute_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_PERMUTE_PD(a, imm8)
  }
            
  def _mm512_unpacklo_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI16(a, b)
  }
            
  def _mm512_maskz_sllv_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SLLV_EPI64(k, a, count)
  }
            
  def _mm256_mask_cvtepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI32_EPI8(src, k, a)
  }
            
  def _mm_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_broadcast_i64x4(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCAST_I64X4(k, a)
  }
            
  def _mm256_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm512_mask_cvtepi64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm256_broadcastmb_epi64(k: Exp[Int]): Exp[__m256i] = {
    MM256_BROADCASTMB_EPI64(k)
  }
            
  def _mm_maskz_sub_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm256_cmpge_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm_fnmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FNMSUB_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm512_mask_roundscale_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDSCALE_PS(src, k, a, imm8)
  }
            
  def _mm512_maskz_cvtt_roundpd_epi64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPI64(k, a, sae)
  }
            
  def _mm512_maskz_exp2a23_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_EXP2A23_ROUND_PS(k, a, rounding)
  }
            
  def _mm_maskz_packus_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PACKUS_EPI32(k, a, b)
  }
            
  def _mm512_adds_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPU16(a, b)
  }
            
  def _mm512_maskz_min_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm256_maskz_shuffle_f32x4(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_SHUFFLE_F32X4(k, a, b, imm8)
  }
            
  def _mm512_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_permutexvar_epi16(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm512_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm512_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm512_maskz_mul_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MUL_PD(k, a, b)
  }
            
  def _mm512_test_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TEST_EPI64_MASK(a, b)
  }
            
  def _mm256_mask_compress_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_COMPRESS_EPI64(src, k, a)
  }
            
  def _mm256_mask_permutexvar_epi16(src: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm256_inserti64x2(a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_INSERTI64X2(a, b, imm8)
  }
            
  def _mm512_castpd256_pd512(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_CASTPD256_PD512(a)
  }
            
  def _mm512_cvtepi8_epi64(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPI8_EPI64(a)
  }
            
  def _mm512_mask_max_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MAX_ROUND_PS(src, k, a, b, sae)
  }
            
  def _mm256_mask_shufflelo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLELO_EPI16(src, k, a, imm8)
  }
            
  def _mm256_maskz_max_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm256_mask_cmpneq_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPU32_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvtsepi64_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTSEPI64_EPI8(k, a)
  }
            
  def _mm512_mask_prefetch_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], mask: Exp[Int], base_addr: Exp[A[T]], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.read(base_addr)(MM512_MASK_PREFETCH_I64GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_min_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm512_maskz_cvttpd_epi64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPD_EPI64(k, a)
  }
            
  def _mm512_mask_cmplt_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvtepi64_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTEPI64_EPI32(k, a)
  }
            
  def _mm512_mask_inserti64x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_INSERTI64X4(src, k, a, b, imm8)
  }
            
  def _mm256_getexp_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_GETEXP_PD(a)
  }
            
  def _mm_cvtt_roundsd_si64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSD_SI64(a, rounding)
  }
            
  def _mm512_mask_exp2a23_round_pd(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_EXP2A23_ROUND_PD(a, k, src, rounding)
  }
            
  def _mm_mask_mul_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MUL_SD(src, k, a, b)
  }
            
  def _mm256_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm_cvtt_roundss_si64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSS_SI64(a, rounding)
  }
            
  def _mm512_mask_cvtepu32_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm512_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm512_mask_loadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_expand_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_EXPAND_EPI64(src, k, a)
  }
            
  def _mm256_maskz_srli_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRLI_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_cvtepu16_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU16_EPI64(src, k, a)
  }
            
  def _mm512_maskz_slli_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SLLI_EPI32(k, a, imm8)
  }
            
  def _mm_maskz_reduce_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_ROUND_SS(k, a, b, imm8, rounding)
  }
            
  def _mm256_cmpge_epi32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI32_MASK(a, b)
  }
            
  def _mm512_maskz_cvtepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTEPI16_EPI8(k, a)
  }
            
  def _mm_comi_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], sae: Exp[Int]): Exp[Int] = {
    MM_COMI_ROUND_SS(a, b, imm8, sae)
  }
            
  def _mm512_maskz_exp2a23_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_EXP2A23_ROUND_PD(k, a, rounding)
  }
            
  def _mm_maskz_broadcastd_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTD_EPI32(k, a)
  }
            
  def _mm256_cmpgt_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_and_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AND_EPI64(src, k, a, b)
  }
            
  def _mm512_maskz_mov_epi64(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI64(k, a)
  }
            
  def _mm_cvtt_roundss_i64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSS_I64(a, rounding)
  }
            
  def _mm_mask_sllv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_mov_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MOV_PD(src, k, a)
  }
            
  def _mm256_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm512_zextsi256_si512(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_ZEXTSI256_SI512(a)
  }
            
  def _mm256_abs_epi64(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_ABS_EPI64(a)
  }
            
  def _mm512_slli_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SLLI_EPI16(a, imm8)
  }
            
  def _mm256_test_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_TEST_EPI8_MASK(a, b)
  }
            
  def _mm_cvt_roundu64_sd(a: Exp[__m128d], b: Exp[ULong], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDU64_SD(a, b, rounding)
  }
            
  def _mm512_maskz_sub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SUB_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm512_mask_set1_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI32(src, k, a)
  }
            
  def _mm512_broadcast_i64x2(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I64X2(a)
  }
            
  def _mm512_cmplt_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLT_EPU8_MASK(a, b)
  }
            
  def _mm256_mask_adds_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_srl_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRL_EPI16(k, a, count)
  }
            
  def _mm_cmplt_epu8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPU8_MASK(a, b)
  }
            
  def _mm256_cmpeq_epu8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPU8_MASK(a, b)
  }
            
  def _mm512_insertf32x8(a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_INSERTF32X8(a, b, imm8)
  }
            
  def _mm512_set1_ps(a: Exp[Float]): Exp[__m512] = {
    MM512_SET1_PS(a)
  }
            
  def _mm_mask_cmple_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPU32_MASK(k1, a, b)
  }
            
  def _mm256_maskz_cvtusepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI32_EPI8(k, a)
  }
            
  def _mm_mask_sub_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_SUB_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm256_mask_alignr_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm_mask_mul_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MUL_EPU32(src, k, a, b)
  }
            
  def _mm256_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvtepi8_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI8_EPI64(src, k, a)
  }
            
  def _mm512_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_insertf64x2(a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_INSERTF64X2(a, b, imm8)
  }
            
  def _mm256_maskz_getexp_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_GETEXP_PD(k, a)
  }
            
  def _mm_mask_mul_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_MUL_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm512_movm_epi16(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI16(k)
  }
            
  def _mm_mask_cmpgt_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_maskz_broadcastss_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCASTSS_PS(k, a)
  }
            
  def _mm_mask_cmpgt_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvt_roundps_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVT_ROUNDPS_EPI64(src, k, a, rounding)
  }
            
  def _mm256_mask_inserti64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_INSERTI64X2(src, k, a, b, imm8)
  }
            
  def _mm_mask_cmpeq_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_maskz_min_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm_mask_adds_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPI8(src, k, a, b)
  }
            
  def _mm512_shuffle_i64x2(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLE_I64X2(a, b, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KUNPACKW (a, b) =>
      _mm512_kunpackw(f(a), f(b))
    case MM256_MASK_CMPGT_EPU8_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_RCP28_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_rcp28_round_pd(f(k), f(a), f(rounding))
    case MM256_RORV_EPI32 (a, b) =>
      _mm256_rorv_epi32(f(a), f(b))
    case MM256_CVTPD_EPU64 (a) =>
      _mm256_cvtpd_epu64(f(a))
    case MM512_MASKZ_CVTT_ROUNDPD_EPU32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epu32(f(k), f(a), f(sae))
    case MM512_MASKZ_RANGE_PS (k, a, b, imm8) =>
      _mm512_maskz_range_ps(f(k), f(a), f(b), f(imm8))
    case MM_CMPGE_EPI32_MASK (a, b) =>
      _mm_cmpge_epi32_mask(f(a), f(b))
    case MM256_CVTPD_EPU32 (a) =>
      _mm256_cvtpd_epu32(f(a))
    case MM_MASK_FPCLASS_SS_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_ss_mask(f(k1), f(a), f(imm8))
    case MM_MOVM_EPI64 (k) =>
      _mm_movm_epi64(f(k))
    case MM_MASK_MOVELDUP_PS (src, k, a) =>
      _mm_mask_moveldup_ps(f(src), f(k), f(a))
    case MM512_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM256_CONFLICT_EPI64 (a) =>
      _mm256_conflict_epi64(f(a))
    case MM512_MASKZ_RORV_EPI64 (k, a, b) =>
      _mm512_maskz_rorv_epi64(f(k), f(a), f(b))
    case MM_MASKZ_CVTEPU16_EPI32 (k, a) =>
      _mm_maskz_cvtepu16_epi32(f(k), f(a))
    case MM256_MASK_MADD52LO_EPU64 (a, k, b, c) =>
      _mm256_mask_madd52lo_epu64(f(a), f(k), f(b), f(c))
    case MM512_MASK_DIV_PS (src, k, a, b) =>
      _mm512_mask_div_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SLLI_EPI16 (k, a, imm8) =>
      _mm512_maskz_slli_epi16(f(k), f(a), f(imm8))
    case MM512_MASKZ_SUB_EPI64 (k, a, b) =>
      _mm512_maskz_sub_epi64(f(k), f(a), f(b))
    case MM512_BROADCASTQ_EPI64 (a) =>
      _mm512_broadcastq_epi64(f(a))
    case MM512_MASKZ_INSERTI32X8 (k, a, b, imm8) =>
      _mm512_maskz_inserti32x8(f(k), f(a), f(b), f(imm8))
    case iDef@MM256_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVT_ROUNDSS_SD (k, a, b, rounding) =>
      _mm_maskz_cvt_roundss_sd(f(k), f(a), f(b), f(rounding))
    case MM256_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm256_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM_MASK_UNPACKLO_EPI32 (src, k, a, b) =>
      _mm_mask_unpacklo_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MUL_PS (k, a, b) =>
      _mm256_maskz_mul_ps(f(k), f(a), f(b))
    case MM_MASKZ_AND_EPI64 (k, a, b) =>
      _mm_maskz_and_epi64(f(k), f(a), f(b))
    case MM_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case MM256_MASK_MAX_PD (src, k, a, b) =>
      _mm256_mask_max_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_GETMANT_PD (src, k, a, interv, sc) =>
      _mm_mask_getmant_pd(f(src), f(k), f(a), f(interv), f(sc))
    case MM_MASKZ_SRAI_EPI32 (k, a, imm8) =>
      _mm_maskz_srai_epi32(f(k), f(a), f(imm8))
    case iDef@MM512_MASKZ_LOADU_EPI16 (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_epi16(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_INSERTI32X8 (a, b, imm8) =>
      _mm512_inserti32x8(f(a), f(b), f(imm8))
    case MM_MASK_CVTEPI64_PD (src, k, a) =>
      _mm_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM512_ADDS_EPI8 (a, b) =>
      _mm512_adds_epi8(f(a), f(b))
    case MM_MASKZ_SUB_PD (k, a, b) =>
      _mm_maskz_sub_pd(f(k), f(a), f(b))
    case MM256_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi32(f(k), f(a), f(idx), f(b))
    case MM_MASKZ_SRAV_EPI16 (k, a, count) =>
      _mm_maskz_srav_epi16(f(k), f(a), f(count))
    case MM256_MASK_CVTUSEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi16_epi8(f(src), f(k), f(a))
    case MM512_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm512_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case MM_MASK_CMPNEQ_EPU32_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epu32_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_ABS_EPI8 (k, a) =>
      _mm256_maskz_abs_epi8(f(k), f(a))
    case MM_MASKZ_MAX_PS (k, a, b) =>
      _mm_maskz_max_ps(f(k), f(a), f(b))
    case MM256_INSERTI32X4 (a, b, imm8) =>
      _mm256_inserti32x4(f(a), f(b), f(imm8))
    case MM512_RCP14_PS (a) =>
      _mm512_rcp14_ps(f(a))
    case MM_CVT_ROUNDSS_I64 (a, rounding) =>
      _mm_cvt_roundss_i64(f(a), f(rounding))
    case MM256_MASKZ_CVTEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtepi64_epi16(f(k), f(a))
    case MM512_BROADCAST_F32X8 (a) =>
      _mm512_broadcast_f32x8(f(a))
    case MM256_TESTN_EPI32_MASK (a, b) =>
      _mm256_testn_epi32_mask(f(a), f(b))
    case MM256_CVTUSEPI16_EPI8 (a) =>
      _mm256_cvtusepi16_epi8(f(a))
    case MM256_CMPNEQ_EPI32_MASK (a, b) =>
      _mm256_cmpneq_epi32_mask(f(a), f(b))
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm512_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm512_maskz_cvttps_epu32(f(k), f(a))
    case iDef@MM512_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_epi8(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ABS_EPI64 (a) =>
      _mm512_abs_epi64(f(a))
    case MM_ROUNDSCALE_PS (a, imm8) =>
      _mm_roundscale_ps(f(a), f(imm8))
    case MM256_MASKZ_ABS_EPI16 (k, a) =>
      _mm256_maskz_abs_epi16(f(k), f(a))
    case MM512_CMPGT_EPU8_MASK (a, b) =>
      _mm512_cmpgt_epu8_mask(f(a), f(b))
    case MM256_RANGE_PS (a, b, imm8) =>
      _mm256_range_ps(f(a), f(b), f(imm8))
    case MM_MASKZ_REDUCE_PS (k, a, imm8) =>
      _mm_maskz_reduce_ps(f(k), f(a), f(imm8))
    case MM_MASKZ_COMPRESS_PD (k, a) =>
      _mm_maskz_compress_pd(f(k), f(a))
    case MM512_CVTUSEPI64_EPI16 (a) =>
      _mm512_cvtusepi64_epi16(f(a))
    case MM512_SHUFFLELO_EPI16 (a, imm8) =>
      _mm512_shufflelo_epi16(f(a), f(imm8))
    case MM_CMP_EPU32_MASK (a, b, imm8) =>
      _mm_cmp_epu32_mask(f(a), f(b), f(imm8))
    case MM_MASK_CMPGE_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_BROADCASTSD_PD (k, a) =>
      _mm256_maskz_broadcastsd_pd(f(k), f(a))
    case MM256_MASK_SUB_EPI64 (src, k, a, b) =>
      _mm256_mask_sub_epi64(f(src), f(k), f(a), f(b))
    case MM512_PERMUTE_PD (a, imm8) =>
      _mm512_permute_pd(f(a), f(imm8))
    case MM512_UNPACKLO_EPI16 (a, b) =>
      _mm512_unpacklo_epi16(f(a), f(b))
    case MM512_MASKZ_SLLV_EPI64 (k, a, count) =>
      _mm512_maskz_sllv_epi64(f(k), f(a), f(count))
    case MM256_MASK_CVTEPI32_EPI8 (src, k, a) =>
      _mm256_mask_cvtepi32_epi8(f(src), f(k), f(a))
    case iDef@MM_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_BROADCAST_I64X4 (k, a) =>
      _mm512_maskz_broadcast_i64x4(f(k), f(a))
    case MM256_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm256_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM512_MASK_CVTEPI64_PS (src, k, a) =>
      _mm512_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM256_BROADCASTMB_EPI64 (k) =>
      _mm256_broadcastmb_epi64(f(k))
    case MM_MASKZ_SUB_PS (k, a, b) =>
      _mm_maskz_sub_ps(f(k), f(a), f(b))
    case MM256_CMPGE_EPI16_MASK (a, b) =>
      _mm256_cmpge_epi16_mask(f(a), f(b))
    case MM_FNMSUB_ROUND_SS (a, b, c, rounding) =>
      _mm_fnmsub_round_ss(f(a), f(b), f(c), f(rounding))
    case MM512_MASK_ROUNDSCALE_PS (src, k, a, imm8) =>
      _mm512_mask_roundscale_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_CVTT_ROUNDPD_EPI64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epi64(f(k), f(a), f(sae))
    case MM512_MASKZ_EXP2A23_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_exp2a23_round_ps(f(k), f(a), f(rounding))
    case MM_MASKZ_PACKUS_EPI32 (k, a, b) =>
      _mm_maskz_packus_epi32(f(k), f(a), f(b))
    case MM512_ADDS_EPU16 (a, b) =>
      _mm512_adds_epu16(f(a), f(b))
    case MM512_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm512_maskz_min_epi8(f(k), f(a), f(b))
    case MM256_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_f32x4(f(k), f(a), f(b), f(imm8))
    case MM512_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm512_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case MM512_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm_maskz_cvttps_epu32(f(k), f(a))
    case MM512_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm512_maskz_cvttps_epi64(f(k), f(a))
    case MM512_MASKZ_MUL_PD (k, a, b) =>
      _mm512_maskz_mul_pd(f(k), f(a), f(b))
    case MM512_TEST_EPI64_MASK (a, b) =>
      _mm512_test_epi64_mask(f(a), f(b))
    case MM256_MASK_COMPRESS_EPI64 (src, k, a) =>
      _mm256_mask_compress_epi64(f(src), f(k), f(a))
    case MM256_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm256_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case MM256_INSERTI64X2 (a, b, imm8) =>
      _mm256_inserti64x2(f(a), f(b), f(imm8))
    case MM512_CASTPD256_PD512 (a) =>
      _mm512_castpd256_pd512(f(a))
    case MM512_CVTEPI8_EPI64 (a) =>
      _mm512_cvtepi8_epi64(f(a))
    case MM512_MASK_MAX_ROUND_PS (src, k, a, b, sae) =>
      _mm512_mask_max_round_ps(f(src), f(k), f(a), f(b), f(sae))
    case MM256_MASK_SHUFFLELO_EPI16 (src, k, a, imm8) =>
      _mm256_mask_shufflelo_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASKZ_MAX_PD (k, a, b) =>
      _mm256_maskz_max_pd(f(k), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epu32_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVTSEPI64_EPI8 (k, a) =>
      _mm512_maskz_cvtsepi64_epi8(f(k), f(a))
    case iDef@MM512_MASK_PREFETCH_I64GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm256_maskz_min_epu16(f(k), f(a), f(b))
    case MM512_MASKZ_CVTTPD_EPI64 (k, a) =>
      _mm512_maskz_cvttpd_epi64(f(k), f(a))
    case MM512_MASK_CMPLT_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epu64_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVTEPI64_EPI32 (k, a) =>
      _mm512_maskz_cvtepi64_epi32(f(k), f(a))
    case MM512_MASK_INSERTI64X4 (src, k, a, b, imm8) =>
      _mm512_mask_inserti64x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_GETEXP_PD (a) =>
      _mm256_getexp_pd(f(a))
    case MM_CVTT_ROUNDSD_SI64 (a, rounding) =>
      _mm_cvtt_roundsd_si64(f(a), f(rounding))
    case MM512_MASK_EXP2A23_ROUND_PD (a, k, src, rounding) =>
      _mm512_mask_exp2a23_round_pd(f(a), f(k), f(src), f(rounding))
    case MM_MASK_MUL_SD (src, k, a, b) =>
      _mm_mask_mul_sd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm256_maskz_cvttps_epi64(f(k), f(a))
    case MM_CVTT_ROUNDSS_SI64 (a, rounding) =>
      _mm_cvtt_roundss_si64(f(a), f(rounding))
    case MM512_MASK_CVTEPU32_PD (src, k, a) =>
      _mm512_mask_cvtepu32_pd(f(src), f(k), f(a))
    case MM512_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm512_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case iDef@MM512_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_loadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_EXPAND_EPI64 (src, k, a) =>
      _mm512_mask_expand_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_SRLI_EPI32 (k, a, imm8) =>
      _mm256_maskz_srli_epi32(f(k), f(a), f(imm8))
    case MM256_MASK_CVTEPU16_EPI64 (src, k, a) =>
      _mm256_mask_cvtepu16_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_SLLI_EPI32 (k, a, imm8) =>
      _mm512_maskz_slli_epi32(f(k), f(a), f(imm8))
    case MM_MASKZ_REDUCE_ROUND_SS (k, a, b, imm8, rounding) =>
      _mm_maskz_reduce_round_ss(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM256_CMPGE_EPI32_MASK (a, b) =>
      _mm256_cmpge_epi32_mask(f(a), f(b))
    case MM512_MASKZ_CVTEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtepi16_epi8(f(k), f(a))
    case MM_COMI_ROUND_SS (a, b, imm8, sae) =>
      _mm_comi_round_ss(f(a), f(b), f(imm8), f(sae))
    case MM512_MASKZ_EXP2A23_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_exp2a23_round_pd(f(k), f(a), f(rounding))
    case MM_MASKZ_BROADCASTD_EPI32 (k, a) =>
      _mm_maskz_broadcastd_epi32(f(k), f(a))
    case MM256_CMPGT_EPI16_MASK (a, b) =>
      _mm256_cmpgt_epi16_mask(f(a), f(b))
    case MM256_MASK_AND_EPI64 (src, k, a, b) =>
      _mm256_mask_and_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MOV_EPI64 (k, a) =>
      _mm512_maskz_mov_epi64(f(k), f(a))
    case MM_CVTT_ROUNDSS_I64 (a, rounding) =>
      _mm_cvtt_roundss_i64(f(a), f(rounding))
    case MM_MASK_SLLV_EPI32 (src, k, a, count) =>
      _mm_mask_sllv_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_MOV_PD (src, k, a) =>
      _mm256_mask_mov_pd(f(src), f(k), f(a))
    case MM256_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm256_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM512_ZEXTSI256_SI512 (a) =>
      _mm512_zextsi256_si512(f(a))
    case MM256_ABS_EPI64 (a) =>
      _mm256_abs_epi64(f(a))
    case MM512_SLLI_EPI16 (a, imm8) =>
      _mm512_slli_epi16(f(a), f(imm8))
    case MM256_TEST_EPI8_MASK (a, b) =>
      _mm256_test_epi8_mask(f(a), f(b))
    case MM_CVT_ROUNDU64_SD (a, b, rounding) =>
      _mm_cvt_roundu64_sd(f(a), f(b), f(rounding))
    case MM512_MASKZ_SUB_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_sub_round_ps(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_SET1_EPI32 (src, k, a) =>
      _mm512_mask_set1_epi32(f(src), f(k), f(a))
    case MM512_BROADCAST_I64X2 (a) =>
      _mm512_broadcast_i64x2(f(a))
    case MM512_CMPLT_EPU8_MASK (a, b) =>
      _mm512_cmplt_epu8_mask(f(a), f(b))
    case MM256_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm256_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SRL_EPI16 (k, a, count) =>
      _mm_maskz_srl_epi16(f(k), f(a), f(count))
    case MM_CMPLT_EPU8_MASK (a, b) =>
      _mm_cmplt_epu8_mask(f(a), f(b))
    case MM256_CMPEQ_EPU8_MASK (a, b) =>
      _mm256_cmpeq_epu8_mask(f(a), f(b))
    case MM512_INSERTF32X8 (a, b, imm8) =>
      _mm512_insertf32x8(f(a), f(b), f(imm8))
    case MM512_SET1_PS (a) =>
      _mm512_set1_ps(f(a))
    case MM_MASK_CMPLE_EPU32_MASK (k1, a, b) =>
      _mm_mask_cmple_epu32_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_CVTUSEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi32_epi8(f(k), f(a))
    case MM_MASK_SUB_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_sub_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm256_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM_MASK_MUL_EPU32 (src, k, a, b) =>
      _mm_mask_mul_epu32(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTEPI8_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi8_epi64(f(src), f(k), f(a))
    case iDef@MM512_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm512_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_INSERTF64X2 (a, b, imm8) =>
      _mm512_insertf64x2(f(a), f(b), f(imm8))
    case MM256_MASKZ_GETEXP_PD (k, a) =>
      _mm256_maskz_getexp_pd(f(k), f(a))
    case MM_MASK_MUL_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_mul_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MOVM_EPI16 (k) =>
      _mm512_movm_epi16(f(k))
    case MM_MASK_CMPGT_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_BROADCASTSS_PS (k, a) =>
      _mm256_maskz_broadcastss_ps(f(k), f(a))
    case MM_MASK_CMPGT_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epu64_mask(f(k1), f(a), f(b))
    case MM512_MASK_CVT_ROUNDPS_EPI64 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundps_epi64(f(src), f(k), f(a), f(rounding))
    case MM256_MASK_INSERTI64X2 (src, k, a, b, imm8) =>
      _mm256_mask_inserti64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM_MASKZ_MIN_PS (k, a, b) =>
      _mm_maskz_min_ps(f(k), f(a), f(b))
    case MM_MASK_ADDS_EPI8 (src, k, a, b) =>
      _mm_mask_adds_epi8(f(src), f(k), f(a), f(b))
    case MM512_SHUFFLE_I64X2 (a, b, imm8) =>
      _mm512_shuffle_i64x2(f(a), f(b), f(imm8))

    case Reflect(iDef@MM_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKW (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKW (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RORV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_RORV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_SS_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_SS_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVELDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVELDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CONFLICT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CONFLICT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RORV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RORV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD52LO_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD52LO_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTQ_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTQ_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI32X8 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI32X8 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVT_ROUNDSS_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVT_ROUNDSS_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_PD (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_PD (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_EPI16 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_EPI16 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTI32X8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTI32X8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI32 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ABS_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ABS_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTI32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTI32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP14_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP14_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F32X8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F32X8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TESTN_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TESTN_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_EPI8 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ABS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ABS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ABS_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ABS_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RANGE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_RANGE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLELO_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLELO_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPU32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPU32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTSD_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTSD_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_I64X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_I64X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCASTMB_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCASTMB_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PACKUS_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PACKUS_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_F32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MUL_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MUL_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INSERTI64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_INSERTI64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD256_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD256_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_ROUND_PS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_ROUND_PS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLELO_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLELO_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I64GATHER_PD (vindex, mask, base_addr, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTI64X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTI64X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETEXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_GETEXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_ROUND_PD (a, k, src, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_ROUND_PD (f(a), f(k), f(src), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_ROUND_SS (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_ROUND_SS (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COMI_ROUND_SS (a, b, imm8, sae), u, es) =>
      reflectMirrored(Reflect(MM_COMI_ROUND_SS (f(a), f(b), f(imm8), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTSI256_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTSI256_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ABS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_ABS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SLLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF32X8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF32X8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SET1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETEXP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETEXP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTSS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTSS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPS_EPI64 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPS_EPI64 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTI64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTI64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_I64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_I64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51205 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_KUNPACKW(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kunpackw(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPGT_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RCP28_ROUND_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rcp28_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_RORV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rorv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtpd_epu64(${quote(a)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPD_EPU32(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epu32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_RANGE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_range_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPGE_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtpd_epu32(${quote(a)})")
    case iDef@MM_MASK_FPCLASS_SS_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fpclass_ss_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MOVM_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movm_epi64(${quote(k)})")
    case iDef@MM_MASK_MOVELDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_moveldup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CONFLICT_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_conflict_epi64(${quote(a)})")
    case iDef@MM512_MASKZ_RORV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rorv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPU16_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu16_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_MADD52LO_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_madd52lo_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_DIV_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SLLI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_slli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SUB_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_BROADCASTQ_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastq_epi64(${quote(a)})")
    case iDef@MM512_MASKZ_INSERTI32X8(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_inserti32x8(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_LOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_CVT_ROUNDSS_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvt_roundss_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_SUB_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_UNPACKLO_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MUL_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mul_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_AND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_and_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_MAX_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_GETMANT_PD(src, k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_MASKZ_SRAI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srai_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_LOADU_EPI16(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_epi16(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_INSERTI32X8(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_inserti32x8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTEPI64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ADDS_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_adds_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SUB_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi32(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRAV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srav_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_CVTUSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK3_FMSUBADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_CMPNEQ_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ABS_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_abs_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MAX_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_INSERTI32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_inserti32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_RCP14_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp14_ps(${quote(a)})")
    case iDef@MM_CVT_ROUNDSS_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_CVTEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_BROADCAST_F32X8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_f32x8(${quote(a)})")
    case iDef@MM256_TESTN_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_testn_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTUSEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi16_epi8(${quote(a)})")
    case iDef@MM256_CMPNEQ_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtsepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadu_epi8(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_ABS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_abs_epi64(${quote(a)})")
    case iDef@MM_ROUNDSCALE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_ABS_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_abs_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPGT_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_RANGE_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_range_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_REDUCE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_reduce_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_COMPRESS_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_compress_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTUSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi64_epi16(${quote(a)})")
    case iDef@MM512_SHUFFLELO_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shufflelo_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMP_EPU32_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epu32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPGE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_BROADCASTSD_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastsd_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SUB_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_UNPACKLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SLLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sllv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_CVTEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASKZ_BROADCAST_I64X4(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_i64x4(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_BROADCASTMB_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcastmb_epi64(${quote(k)})")
    case iDef@MM_MASKZ_SUB_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_FNMSUB_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_ROUNDSCALE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundscale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPD_EPI64(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epi64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_EXP2A23_ROUND_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_exp2a23_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_PACKUS_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_packus_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ADDS_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_adds_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MIN_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SHUFFLE_F32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_f32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_MUL_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mul_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_TEST_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_COMPRESS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_compress_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM256_INSERTI64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_inserti64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CASTPD256_PD512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castpd256_pd512(${quote(a)})")
    case iDef@MM512_CVTEPI8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi8_epi64(${quote(a)})")
    case iDef@MM512_MASK_MAX_ROUND_PS(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM256_MASK_SHUFFLELO_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shufflelo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MAX_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPNEQ_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtsepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_PREFETCH_I64GATHER_PD(vindex, mask, base_addr, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i64gather_pd(${quote(vindex)}, ${quote(mask)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)}, ${quote(hint)});")
    case iDef@MM256_MASKZ_MIN_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTTPD_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttpd_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPLT_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_INSERTI64X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_inserti64x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_GETEXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_getexp_pd(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSD_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_EXP2A23_ROUND_PD(a, k, src, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2a23_round_pd(${quote(a)}, ${quote(k)}, ${quote(src)}, ${quote(rounding)})")
    case iDef@MM_MASK_MUL_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPU32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_EXPAND_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_SRLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTEPU16_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SLLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_slli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_REDUCE_ROUND_SS(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_reduce_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_CMPGE_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_COMI_ROUND_SS(a, b, imm8, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_comi_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_EXP2A23_ROUND_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_exp2a23_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_BROADCASTD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_broadcastd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPGT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_AND_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_and_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOV_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_SLLV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sllv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_MOV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mov_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_ZEXTSI256_SI512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_zextsi256_si512(${quote(a)})")
    case iDef@MM256_ABS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_abs_epi64(${quote(a)})")
    case iDef@MM512_SLLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_slli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_TEST_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDU64_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_SUB_ROUND_PS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_SET1_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_set1_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_BROADCAST_I64X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_i64x2(${quote(a)})")
    case iDef@MM512_CMPLT_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ADDS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRL_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srl_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_CMPLT_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPEQ_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_INSERTF32X8(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_insertf32x8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_SET1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set1_ps(${quote(a)})")
    case iDef@MM_MASK_CMPLE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTUSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SUB_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK_MUL_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_compressstoreu_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_CVTEPI8_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_INSERTF64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_insertf64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_GETEXP_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_getexp_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MUL_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MOVM_EPI16(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movm_epi16(${quote(k)})")
    case iDef@MM_MASK_CMPGT_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_BROADCASTSS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastss_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPGT_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVT_ROUNDPS_EPI64(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_INSERTI64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_inserti64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MIN_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ADDS_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_adds_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SHUFFLE_I64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_i64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
