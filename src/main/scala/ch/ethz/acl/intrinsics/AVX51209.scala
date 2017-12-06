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

    
trait AVX51209 extends IntrinsicsBase {
  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 64-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m256, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: short
   */
  case class MM_MASK_SET1_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a double-precision (64-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: int
   */
  case class MM_CVTI32_SD(a: Exp[__m128d], b: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 4 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m256d, imm8: int
   */
  case class MM512_MASKZ_INSERTF64X4(k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128
   */
  case class MM256_MASK_BROADCAST_F32X2(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM512_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_I64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
  case class MM256_MASKZ_CVTPH_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 64-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_ABS_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTTPS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_ROUNDSCALE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_PACKS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_BROADCAST_I64X2(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_CMP_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_LZCNT_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASKZ_SRAI_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * src: __m512d, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst.
   * a: __m128i
   */
  case class MM_BROADCAST_I32X2(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI64_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i
   */
  case class MM256_MASK_ABS_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_PERMUTEX_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 8-bit integers from memory into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * 	"mem_addr" does
   * not need to be aligned on any particular boundary.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOADU_EPI8[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m256d, b: __m256d, c: __m256d, k: __mmask8
   */
  case class MM256_MASK3_FMSUBADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m512i, imm8: const int
   */
  case class MM512_ROL_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MUL_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASK_FMSUBADD_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m128, imm8: int
   */
  case class MM256_MASK_INSERTF32X4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRAI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m256d
   */
  case class MM512_MASK_BROADCAST_F64X4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 256-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: const int
   */
  case class MM512_MASK_PERMUTEX_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m512, b: __m512, c: __m512i, imm8: int
   */
  case class MM512_FIXUPIMM_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_MIN_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPI32_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FMSUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather double-precision (64-bit) floating-point elements from memory using
   * 64-bit indices. 64-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst".
   * "scale" should be 1, 2, 4 or 8.
   * vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_I64GATHER_PD[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ADDS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_MASK_CMP_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_RANGE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPI32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_EXPAND_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_LZCNT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m512i
   */
  case class MM512_ABS_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed double-precision (64-bit) floating-point elements in "dst" with the
   * repeated 4 element sequence in reverse order.
   * d: double, c: double, b: double, a: double
   */
  case class MM512_SETR4_PD(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_COMPRESS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SQRT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_RANGE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512 with undefined elements.

   */
  case class MM512_UNDEFINED_PS() extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_AVG_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask16, idx: __m512i, b: __m512i
   */
  case class MM512_MASK_PERMUTEX2VAR_EPI32(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUB_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM512_MASKZ_CVTPH_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_REDUCE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_SQRT_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXP2A23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM_MOVM_EPI8(k: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASK_INSERTI32X4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_RORV_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 8-bit integer in "a".
   * a: __m128i
   */
  case class MM_MOVEPI8_MASK(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_I32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst".
   * The maximum relative error for this approximation is less than 2^-28, and copy
   * the upper 3 packed elements from "a" to the upper elements of "dst".
   * [round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_RCP28_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 16-byte
   * boundary or a general-protection exception may be generated.
   * src: __m128, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k" using zeromask "k1" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPU8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m256, imm8: int
   */
  case class MM256_ROUNDSCALE_PS(a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI16(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256i
   */
  case class MM256_MASK_PERMUTEVAR_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
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
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: _MM_PERM_ENUM
   */
  case class MM256_MASK_SHUFFLE_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_CMP_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PACKS_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRLV_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRLV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_SQRT_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * a: __m128d, b: __m128d
   */
  case class MM_RSQRT28_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_ADD_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask16, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
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
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_RSQRT14_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF64X4_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256, k: __mmask8, idx: __m256i, a: __m256
   */
  case class MM256_MASK_PERMUTEXVAR_PS(src: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "dst", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "dst" at the location
   * specified by "imm8".
   * a: __m512, b: __m128, imm8: int
   */
  case class MM512_INSERTF32X4(a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 32-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 32-bit granularity (32-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASK_TERNARYLOGIC_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLT_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
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
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTTPD_EPU64(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI32_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLE_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRA_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
  case class MM_MASKZ_CVTTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCASTD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_XOR_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_ROR_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI64X4_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_SCALEF_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SCALEF_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_ROUNDSCALE_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_UNPACKLO_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AVG_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d
   */
  case class MM_MASK_MOVEDUP_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPU32(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUBADD_PD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTTPS_EPI32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 double-precision (64-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_SHUFFLE_F64X2(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI64_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASK_CMP_PD_MASK(k1: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" within 128-bit lanes using the control in
   * "imm8", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: _MM_PERM_ENUM
   */
  case class MM256_MASKZ_SHUFFLE_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGT_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRAI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __int64
   */
  case class MM512_MASKZ_SET1_EPI64(k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI64_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTPD_EPI64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m512i, idx: __m512i, k: __mmask8, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI64(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst".
   * a: __m256, idx: __m256i, b: __m256
   */
  case class MM256_PERMUTEX2VAR_PS(a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m128d, imm8: int
   */
  case class MM_REDUCE_PD(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASKZ_SLL_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_SQRT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_MUL_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM512_MASKZ_CVTEPI8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_i64gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_set1_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[Short]): Exp[__m128i] = {
    MM_MASK_SET1_EPI16(src, k, a)
  }
            
  def _mm_cmplt_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPU32_MASK(a, b)
  }
            
  def _mm_maskz_sllv_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI32(k, a, count)
  }
            
  def _mm_maskz_unpacklo_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm512_maskz_min_epu32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU32(k, a, b)
  }
            
  def _mm512_mask_unpacklo_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI64(src, k, a, b)
  }
            
  def _mm_cvti32_sd(a: Exp[__m128d], b: Exp[Int]): Exp[__m128d] = {
    MM_CVTI32_SD(a, b)
  }
            
  def _mm512_maskz_insertf64x4(k: Exp[Int], a: Exp[__m512d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_INSERTF64X4(k, a, b, imm8)
  }
            
  def _mm256_mask_broadcast_f32x2(src: Exp[__m256], k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASK_BROADCAST_F32X2(src, k, a)
  }
            
  def _mm512_maskz_getmant_ps(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm256_maskz_xor_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm_cvt_roundsd_i64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVT_ROUNDSD_I64(a, rounding)
  }
            
  def _mm256_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m256] = {
    MM256_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm_mask_unpackhi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_abs_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ABS_EPI64(k, a)
  }
            
  def _mm_maskz_sra_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI16(k, a, count)
  }
            
  def _mm_mask_cvttps_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTTPS_EPI32(src, k, a)
  }
            
  def _mm256_mask_loadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_subs_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm_fixupimm_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  def _mm_mask_roundscale_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm_mask_cmple_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI64_MASK(k1, a, b)
  }
            
  def _mm_maskz_packs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PACKS_EPI16(k, a, b)
  }
            
  def _mm256_maskz_broadcast_i64x2(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCAST_I64X2(k, a)
  }
            
  def _mm256_mask_cmp_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPU16_MASK(k1, a, b, imm8)
  }
            
  def _mm_maskz_lzcnt_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_LZCNT_EPI64(k, a)
  }
            
  def _mm512_maskz_srai_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASKZ_SRAI_EPI64(k, a, imm8)
  }
            
  def _mm512_mask_i64gather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_min_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU32(src, k, a, b)
  }
            
  def _mm256_mask_min_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU16(src, k, a, b)
  }
            
  def _mm_broadcast_i32x2(a: Exp[__m128i]): Exp[__m128i] = {
    MM_BROADCAST_I32X2(a)
  }
            
  def _mm_maskz_cvtusepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI32(k, a)
  }
            
  def _mm256_maskz_unpacklo_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI16(k, a, b)
  }
            
  def _mm256_mask_abs_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ABS_EPI8(src, k, a)
  }
            
  def _mm256_mask_cvtpd_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256d]): Exp[__m128] = {
    MM256_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm512_mask_expandloadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_permutex_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_PERMUTEX_PD(src, k, a, imm8)
  }
            
  def _mm_maskz_loadu_epi8[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask3_fmsubadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d], k: Exp[Int]): Exp[__m256d] = {
    MM256_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm512_rol_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_ROL_EPI64(a, imm8)
  }
            
  def _mm_mask_mul_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MUL_PD(src, k, a, b)
  }
            
  def _mm256_mask_cvtepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmsubadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMSUBADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm256_maskz_getmant_ps(k: Exp[Int], a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm256_mask_insertf32x4(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m128], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASK_INSERTF32X4(src, k, a, b, imm8)
  }
            
  def _mm256_mask_srai_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRAI_EPI64(src, k, a, imm8)
  }
            
  def _mm512_mask_broadcast_f64x4(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256d]): Exp[__m512d] = {
    MM512_MASK_BROADCAST_F64X4(src, k, a)
  }
            
  def _mm512_mask_permutex_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_PERMUTEX_PD(src, k, a, imm8)
  }
            
  def _mm512_mask_unpackhi_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm512_fixupimm_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm256_maskz_min_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MIN_PD(k, a, b)
  }
            
  def _mm512_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm_test_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI64_MASK(a, b)
  }
            
  def _mm_maskz_fmsub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FMSUB_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm512_i64gather_pd[A[_], T:Typ, U:Integral](vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(base_addr)(MM512_I64GATHER_PD(vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_storeu_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_adds_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ADDS_EPI16(a, b)
  }
            
  def _mm256_mask_cmp_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPU32_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask3_fmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_maskz_range_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RANGE_SD(k, a, b, imm8)
  }
            
  def _mm512_testn_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TESTN_EPI16_MASK(a, b)
  }
            
  def _mm_cmple_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm_cmpgt_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPI64_MASK(a, b)
  }
            
  def _mm512_maskz_cvtt_roundpd_epi32(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPI32(k, a, sae)
  }
            
  def _mm512_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_expand_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_EXPAND_EPI64(k, a)
  }
            
  def _mm256_mask_lzcnt_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_LZCNT_EPI64(src, k, a)
  }
            
  def _mm512_abs_epi8(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_ABS_EPI8(a)
  }
            
  def _mm256_maskz_load_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_adds_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm512_setr4_pd(d: Exp[Double], c: Exp[Double], b: Exp[Double], a: Exp[Double]): Exp[__m512d] = {
    MM512_SETR4_PD(d, c, b, a)
  }
            
  def _mm512_mask_storeu_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_unpackhi_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI64(a, b)
  }
            
  def _mm_mask_compress_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_COMPRESS_EPI32(src, k, a)
  }
            
  def _mm512_sqrt_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SQRT_PD(a)
  }
            
  def _mm_mask_range_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_PS(src, k, a, b, imm8)
  }
            
  def _mm512_undefined_ps(): Exp[__m512] = {
    MM512_UNDEFINED_PS()
  }
            
  def _mm_mask_avg_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AVG_EPU8(src, k, a, b)
  }
            
  def _mm256_mask_fmadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm_mask_max_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU16(src, k, a, b)
  }
            
  def _mm512_cmpneq_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPNEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_permutex2var_epi32(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b)
  }
            
  def _mm256_maskz_sub_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm512_maskz_cvtph_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m512] = {
    MM512_MASKZ_CVTPH_PS(k, a)
  }
            
  def _mm256_mask_reduce_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_REDUCE_PD(src, k, a, imm8)
  }
            
  def _mm_mask_sqrt_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm512_mask_exp2a23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXP2A23_PS(src, k, a)
  }
            
  def _mm_movm_epi8(k: Exp[Int]): Exp[__m128i] = {
    MM_MOVM_EPI8(k)
  }
            
  def _mm_maskz_srlv_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI16(k, a, count)
  }
            
  def _mm256_mask_srlv_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI64(src, k, a, count)
  }
            
  def _mm256_mask_inserti32x4(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_INSERTI32X4(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_rorv_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_RORV_EPI32(k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm_movepi8_mask(a: Exp[__m128i]): Exp[Int] = {
    MM_MOVEPI8_MASK(a)
  }
            
  def _mm_cvtt_roundss_i32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSS_I32(a, rounding)
  }
            
  def _mm512_mask_cvtepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_rcp28_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_RCP28_ROUND_SS(a, b, rounding)
  }
            
  def _mm256_mask_testn_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_max_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU64(k, a, b)
  }
            
  def _mm_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_srl_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRL_EPI32(src, k, a, count)
  }
            
  def _mm512_mask_cmple_epu8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLE_EPU8_MASK(k1, a, b)
  }
            
  def _mm256_mask_sllv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI32(src, k, a, count)
  }
            
  def _mm256_roundscale_ps(a: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm512_permutex2var_epi16(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm256_mask_permutevar_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256i]): Exp[__m256] = {
    MM256_MASK_PERMUTEVAR_PS(src, k, a, b)
  }
            
  def _mm512_cvtepi64_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTEPI64_EPI8(a)
  }
            
  def _mm_mask_cvtps_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPU32(src, k, a)
  }
            
  def _mm256_mask_shuffle_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_EPI32(src, k, a, imm8)
  }
            
  def _mm256_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cmp_epi8_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Long] = {
    MM512_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm256_maskz_packs_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PACKS_EPI16(k, a, b)
  }
            
  def _mm512_maskz_srlv_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRLV_EPI32(k, a, count)
  }
            
  def _mm512_mask_cvtusepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTUSEPI64_EPI8(src, k, a)
  }
            
  def _mm_mask_srlv_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm_mmask_i32gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_sqrt_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SQRT_PS(k, a)
  }
            
  def _mm_rsqrt28_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RSQRT28_SD(a, b)
  }
            
  def _mm_maskz_add_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_ADD_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm512_mask_storeu_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_rsqrt14_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_RSQRT14_PS(src, k, a)
  }
            
  def _mm512_maskz_extractf64x4_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_MASKZ_EXTRACTF64X4_PD(k, a, imm8)
  }
            
  def _mm256_mask_permutexvar_ps(src: Exp[__m256], k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_PERMUTEXVAR_PS(src, k, idx, a)
  }
            
  def _mm512_insertf32x4(a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_INSERTF32X4(a, b, imm8)
  }
            
  def _mm512_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm512_mask_ternarylogic_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8)
  }
            
  def _mm_cmplt_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLT_EPU64_MASK(a, b)
  }
            
  def _mm512_maskz_cvttpd_epu64(k: Exp[Int], a: Exp[__m512d]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPD_EPU64(k, a)
  }
            
  def _mm256_maskz_cvtepi32_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPI32_PD(k, a)
  }
            
  def _mm512_test_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_TEST_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_cvtsepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTSEPI32_EPI8(src, k, a)
  }
            
  def _mm256_cmple_epu8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLE_EPU8_MASK(a, b)
  }
            
  def _mm_mask_sra_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRA_EPI64(src, k, a, count)
  }
            
  def _mm_maskz_cvttps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTTPS_EPI64(k, a)
  }
            
  def _mm_mask_broadcastd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTD_EPI32(src, k, a)
  }
            
  def _mm256_mask_xor_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_XOR_PS(src, k, a, b)
  }
            
  def _mm512_maskz_ror_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ROR_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_extracti64x4_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_EXTRACTI64X4_EPI64(src, k, a, imm8)
  }
            
  def _mm512_mask_scalef_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SCALEF_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm_cmpge_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPU64_MASK(a, b)
  }
            
  def _mm_mask3_fnmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_maskz_scalef_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_PD(k, a, b)
  }
            
  def _mm256_cmpgt_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPU16_MASK(a, b)
  }
            
  def _mm256_mask_roundscale_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_ROUNDSCALE_PD(src, k, a, imm8)
  }
            
  def _mm256_mask_unpacklo_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm_maskz_avg_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm_mask_movedup_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MOVEDUP_PD(src, k, a)
  }
            
  def _mm512_cvt_roundpd_epu32(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_CVT_ROUNDPD_EPU32(a, rounding)
  }
            
  def _mm_mask_fmsubadd_pd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm512_maskz_cvttps_epi32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPI32(k, a)
  }
            
  def _mm512_shuffle_f64x2(a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_SHUFFLE_F64X2(a, b, imm8)
  }
            
  def _mm_cvtusepi64_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI64_EPI8(a)
  }
            
  def _mm256_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_sub_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI32(src, k, a, b)
  }
            
  def _mm_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm256_maskz_shuffle_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_EPI32(k, a, imm8)
  }
            
  def _mm512_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm256_mask_min_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm256_mask_cmpgt_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGT_EPI32_MASK(k1, a, b)
  }
            
  def _mm_mask_srai_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRAI_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_set1_epi64(k: Exp[Int], a: Exp[Long]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI64(k, a)
  }
            
  def _mm256_maskz_cvtusepi64_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI8(k, a)
  }
            
  def _mm256_cvtpd_epi64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTPD_EPI64(a)
  }
            
  def _mm512_mask2_permutex2var_epi64(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b)
  }
            
  def _mm256_permutex2var_ps(a: Exp[__m256], idx: Exp[__m256i], b: Exp[__m256]): Exp[__m256] = {
    MM256_PERMUTEX2VAR_PS(a, idx, b)
  }
            
  def _mm_reduce_pd(a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_REDUCE_PD(a, imm8)
  }
            
  def _mm256_mask_cvtpd_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256d]): Exp[__m256i] = {
    MM256_MASK_CVTPD_EPU64(src, k, a)
  }
            
  def _mm256_maskz_sub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm256_maskz_sll_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_SLL_EPI64(k, a, count)
  }
            
  def _mm512_maskz_unpacklo_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI32(k, a, b)
  }
            
  def _mm512_sqrt_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SQRT_PS(a)
  }
            
  def _mm512_mask_mulhi_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_mul_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_MUL_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_maskz_cvtepi8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI8_EPI64(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM512_MASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_SET1_EPI16 (src, k, a) =>
      _mm_mask_set1_epi16(f(src), f(k), f(a))
    case MM_CMPLT_EPU32_MASK (a, b) =>
      _mm_cmplt_epu32_mask(f(a), f(b))
    case MM_MASKZ_SLLV_EPI32 (k, a, count) =>
      _mm_maskz_sllv_epi32(f(k), f(a), f(count))
    case MM_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_EPU32 (k, a, b) =>
      _mm512_maskz_min_epu32(f(k), f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI64 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi64(f(src), f(k), f(a), f(b))
    case MM_CVTI32_SD (a, b) =>
      _mm_cvti32_sd(f(a), f(b))
    case MM512_MASKZ_INSERTF64X4 (k, a, b, imm8) =>
      _mm512_maskz_insertf64x4(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_BROADCAST_F32X2 (src, k, a) =>
      _mm256_mask_broadcast_f32x2(f(src), f(k), f(a))
    case MM512_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm512_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM256_MASKZ_XOR_PS (k, a, b) =>
      _mm256_maskz_xor_ps(f(k), f(a), f(b))
    case MM_CVT_ROUNDSD_I64 (a, rounding) =>
      _mm_cvt_roundsd_i64(f(a), f(rounding))
    case MM256_MASKZ_CVTPH_PS (k, a) =>
      _mm256_maskz_cvtph_ps(f(k), f(a))
    case MM_MASK_UNPACKHI_EPI16 (src, k, a, b) =>
      _mm_mask_unpackhi_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ABS_EPI64 (k, a) =>
      _mm_maskz_abs_epi64(f(k), f(a))
    case MM_MASKZ_SRA_EPI16 (k, a, count) =>
      _mm_maskz_sra_epi16(f(k), f(a), f(count))
    case MM_MASK_CVTTPS_EPI32 (src, k, a) =>
      _mm_mask_cvttps_epi32(f(src), f(k), f(a))
    case iDef@MM256_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm_maskz_subs_epu8(f(k), f(a), f(b))
    case MM_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm_fixupimm_pd(f(a), f(b), f(c), f(imm8))
    case MM_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASK_CMPLE_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmple_epi64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_PACKS_EPI16 (k, a, b) =>
      _mm_maskz_packs_epi16(f(k), f(a), f(b))
    case MM256_MASKZ_BROADCAST_I64X2 (k, a) =>
      _mm256_maskz_broadcast_i64x2(f(k), f(a))
    case MM256_MASK_CMP_EPU16_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epu16_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASKZ_LZCNT_EPI64 (k, a) =>
      _mm_maskz_lzcnt_epi64(f(k), f(a))
    case MM512_MASKZ_SRAI_EPI64 (k, a, imm8) =>
      _mm512_maskz_srai_epi64(f(k), f(a), f(imm8))
    case iDef@MM512_MASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MIN_EPU32 (src, k, a, b) =>
      _mm256_mask_min_epu32(f(src), f(k), f(a), f(b))
    case MM256_MASK_MIN_EPU16 (src, k, a, b) =>
      _mm256_mask_min_epu16(f(src), f(k), f(a), f(b))
    case MM_BROADCAST_I32X2 (a) =>
      _mm_broadcast_i32x2(f(a))
    case MM_MASKZ_CVTUSEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtusepi64_epi32(f(k), f(a))
    case MM256_MASKZ_UNPACKLO_EPI16 (k, a, b) =>
      _mm256_maskz_unpacklo_epi16(f(k), f(a), f(b))
    case MM256_MASK_ABS_EPI8 (src, k, a) =>
      _mm256_mask_abs_epi8(f(src), f(k), f(a))
    case MM256_MASK_CVTPD_PS (src, k, a) =>
      _mm256_mask_cvtpd_ps(f(src), f(k), f(a))
    case iDef@MM512_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_PERMUTEX_PD (src, k, a, imm8) =>
      _mm256_mask_permutex_pd(f(src), f(k), f(a), f(imm8))
    case iDef@MM_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_epi8(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm256_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM512_ROL_EPI64 (a, imm8) =>
      _mm512_rol_epi64(f(a), f(imm8))
    case MM_MASK_MUL_PD (src, k, a, b) =>
      _mm_mask_mul_pd(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMSUBADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmsubadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM256_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm256_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM256_MASK_INSERTF32X4 (src, k, a, b, imm8) =>
      _mm256_mask_insertf32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASK_SRAI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_srai_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_BROADCAST_F64X4 (src, k, a) =>
      _mm512_mask_broadcast_f64x4(f(src), f(k), f(a))
    case MM512_MASK_PERMUTEX_PD (src, k, a, imm8) =>
      _mm512_mask_permutex_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM512_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm512_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case MM256_MASKZ_MIN_PD (k, a, b) =>
      _mm256_maskz_min_pd(f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPI32_PD (k, a) =>
      _mm512_maskz_cvtepi32_pd(f(k), f(a))
    case MM_TEST_EPI64_MASK (a, b) =>
      _mm_test_epi64_mask(f(a), f(b))
    case MM_MASKZ_FMSUB_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fmsub_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case iDef@MM512_I64GATHER_PD (vindex, base_addr, scale, base_addrOffset) =>
      _mm512_i64gather_pd(iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ADDS_EPI16 (a, b) =>
      _mm512_adds_epi16(f(a), f(b))
    case MM256_MASK_CMP_EPU32_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epu32_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK3_FMSUB_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fmsub_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASKZ_RANGE_SD (k, a, b, imm8) =>
      _mm_maskz_range_sd(f(k), f(a), f(b), f(imm8))
    case MM512_TESTN_EPI16_MASK (a, b) =>
      _mm512_testn_epi16_mask(f(a), f(b))
    case MM_CMPLE_EPI8_MASK (a, b) =>
      _mm_cmple_epi8_mask(f(a), f(b))
    case MM_CMPGT_EPI64_MASK (a, b) =>
      _mm_cmpgt_epi64_mask(f(a), f(b))
    case MM512_MASKZ_CVTT_ROUNDPD_EPI32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epi32(f(k), f(a), f(sae))
    case MM512_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm512_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_EXPAND_EPI64 (k, a) =>
      _mm256_maskz_expand_epi64(f(k), f(a))
    case MM256_MASK_LZCNT_EPI64 (src, k, a) =>
      _mm256_mask_lzcnt_epi64(f(src), f(k), f(a))
    case MM512_ABS_EPI8 (a) =>
      _mm512_abs_epi8(f(a))
    case iDef@MM256_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm_maskz_adds_epu8(f(k), f(a), f(b))
    case MM512_SETR4_PD (d, c, b, a) =>
      _mm512_setr4_pd(f(d), f(c), f(b), f(a))
    case iDef@MM512_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_UNPACKHI_EPI64 (a, b) =>
      _mm512_unpackhi_epi64(f(a), f(b))
    case MM_MASK_COMPRESS_EPI32 (src, k, a) =>
      _mm_mask_compress_epi32(f(src), f(k), f(a))
    case MM512_SQRT_PD (a) =>
      _mm512_sqrt_pd(f(a))
    case MM_MASK_RANGE_PS (src, k, a, b, imm8) =>
      _mm_mask_range_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_UNDEFINED_PS () =>
      _mm512_undefined_ps()
    case MM_MASK_AVG_EPU8 (src, k, a, b) =>
      _mm_mask_avg_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASK_FMADD_PS (a, k, b, c) =>
      _mm256_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM_MASK_MAX_EPU16 (src, k, a, b) =>
      _mm_mask_max_epu16(f(src), f(k), f(a), f(b))
    case MM512_CMPNEQ_EPI8_MASK (a, b) =>
      _mm512_cmpneq_epi8_mask(f(a), f(b))
    case MM512_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b) =>
      _mm512_mask_permutex2var_epi32(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm256_maskz_sub_epi8(f(k), f(a), f(b))
    case MM512_MASKZ_CVTPH_PS (k, a) =>
      _mm512_maskz_cvtph_ps(f(k), f(a))
    case MM256_MASK_REDUCE_PD (src, k, a, imm8) =>
      _mm256_mask_reduce_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASK_SQRT_PD (src, k, a) =>
      _mm_mask_sqrt_pd(f(src), f(k), f(a))
    case MM512_MASK_EXP2A23_PS (src, k, a) =>
      _mm512_mask_exp2a23_ps(f(src), f(k), f(a))
    case MM_MOVM_EPI8 (k) =>
      _mm_movm_epi8(f(k))
    case MM_MASKZ_SRLV_EPI16 (k, a, count) =>
      _mm_maskz_srlv_epi16(f(k), f(a), f(count))
    case MM256_MASK_SRLV_EPI64 (src, k, a, count) =>
      _mm256_mask_srlv_epi64(f(src), f(k), f(a), f(count))
    case MM256_MASK_INSERTI32X4 (src, k, a, b, imm8) =>
      _mm256_mask_inserti32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_RORV_EPI32 (k, a, b) =>
      _mm512_maskz_rorv_epi32(f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM_MOVEPI8_MASK (a) =>
      _mm_movepi8_mask(f(a))
    case MM_CVTT_ROUNDSS_I32 (a, rounding) =>
      _mm_cvtt_roundss_i32(f(a), f(rounding))
    case iDef@MM512_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_RCP28_ROUND_SS (a, b, rounding) =>
      _mm_rcp28_round_ss(f(a), f(b), f(rounding))
    case MM256_MASK_TESTN_EPI16_MASK (k1, a, b) =>
      _mm256_mask_testn_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_MAX_EPU64 (k, a, b) =>
      _mm512_maskz_max_epu64(f(k), f(a), f(b))
    case iDef@MM_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_SRL_EPI32 (src, k, a, count) =>
      _mm_mask_srl_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASK_CMPLE_EPU8_MASK (k1, a, b) =>
      _mm512_mask_cmple_epu8_mask(f(k1), f(a), f(b))
    case MM256_MASK_SLLV_EPI32 (src, k, a, count) =>
      _mm256_mask_sllv_epi32(f(src), f(k), f(a), f(count))
    case MM256_ROUNDSCALE_PS (a, imm8) =>
      _mm256_roundscale_ps(f(a), f(imm8))
    case MM512_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm512_permutex2var_epi16(f(a), f(idx), f(b))
    case MM256_MASK_PERMUTEVAR_PS (src, k, a, b) =>
      _mm256_mask_permutevar_ps(f(src), f(k), f(a), f(b))
    case MM512_CVTEPI64_EPI8 (a) =>
      _mm512_cvtepi64_epi8(f(a))
    case MM_MASK_CVTPS_EPU32 (src, k, a) =>
      _mm_mask_cvtps_epu32(f(src), f(k), f(a))
    case MM256_MASK_SHUFFLE_EPI32 (src, k, a, imm8) =>
      _mm256_mask_shuffle_epi32(f(src), f(k), f(a), f(imm8))
    case iDef@MM256_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CMP_EPI8_MASK (a, b, imm8) =>
      _mm512_cmp_epi8_mask(f(a), f(b), f(imm8))
    case MM256_MASKZ_PACKS_EPI16 (k, a, b) =>
      _mm256_maskz_packs_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_SRLV_EPI32 (k, a, count) =>
      _mm512_maskz_srlv_epi32(f(k), f(a), f(count))
    case MM512_MASK_CVTUSEPI64_EPI8 (src, k, a) =>
      _mm512_mask_cvtusepi64_epi8(f(src), f(k), f(a))
    case MM_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case iDef@MM_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SQRT_PS (k, a) =>
      _mm_maskz_sqrt_ps(f(k), f(a))
    case MM_RSQRT28_SD (a, b) =>
      _mm_rsqrt28_sd(f(a), f(b))
    case MM_MASKZ_ADD_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_add_round_sd(f(k), f(a), f(b), f(rounding))
    case iDef@MM512_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_RSQRT14_PS (src, k, a) =>
      _mm_mask_rsqrt14_ps(f(src), f(k), f(a))
    case MM512_MASKZ_EXTRACTF64X4_PD (k, a, imm8) =>
      _mm512_maskz_extractf64x4_pd(f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEXVAR_PS (src, k, idx, a) =>
      _mm256_mask_permutexvar_ps(f(src), f(k), f(idx), f(a))
    case MM512_INSERTF32X4 (a, b, imm8) =>
      _mm512_insertf32x4(f(a), f(b), f(imm8))
    case MM512_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm512_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM512_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8) =>
      _mm512_mask_ternarylogic_epi32(f(src), f(k), f(a), f(b), f(imm8))
    case MM_CMPLT_EPU64_MASK (a, b) =>
      _mm_cmplt_epu64_mask(f(a), f(b))
    case MM512_MASKZ_CVTTPD_EPU64 (k, a) =>
      _mm512_maskz_cvttpd_epu64(f(k), f(a))
    case MM256_MASKZ_CVTEPI32_PD (k, a) =>
      _mm256_maskz_cvtepi32_pd(f(k), f(a))
    case MM512_TEST_EPI16_MASK (a, b) =>
      _mm512_test_epi16_mask(f(a), f(b))
    case MM512_MASK_CVTSEPI32_EPI8 (src, k, a) =>
      _mm512_mask_cvtsepi32_epi8(f(src), f(k), f(a))
    case MM256_CMPLE_EPU8_MASK (a, b) =>
      _mm256_cmple_epu8_mask(f(a), f(b))
    case MM_MASK_SRA_EPI64 (src, k, a, count) =>
      _mm_mask_sra_epi64(f(src), f(k), f(a), f(count))
    case MM_MASKZ_CVTTPS_EPI64 (k, a) =>
      _mm_maskz_cvttps_epi64(f(k), f(a))
    case MM_MASK_BROADCASTD_EPI32 (src, k, a) =>
      _mm_mask_broadcastd_epi32(f(src), f(k), f(a))
    case MM256_MASK_XOR_PS (src, k, a, b) =>
      _mm256_mask_xor_ps(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ROR_EPI32 (k, a, imm8) =>
      _mm512_maskz_ror_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_EXTRACTI64X4_EPI64 (src, k, a, imm8) =>
      _mm512_mask_extracti64x4_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_SCALEF_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_scalef_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM_CMPGE_EPU64_MASK (a, b) =>
      _mm_cmpge_epu64_mask(f(a), f(b))
    case MM_MASK3_FNMADD_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fnmadd_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASKZ_SCALEF_PD (k, a, b) =>
      _mm_maskz_scalef_pd(f(k), f(a), f(b))
    case MM256_CMPGT_EPU16_MASK (a, b) =>
      _mm256_cmpgt_epu16_mask(f(a), f(b))
    case MM256_MASK_ROUNDSCALE_PD (src, k, a, imm8) =>
      _mm256_mask_roundscale_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm256_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm_maskz_avg_epu8(f(k), f(a), f(b))
    case MM_MASK_MOVEDUP_PD (src, k, a) =>
      _mm_mask_movedup_pd(f(src), f(k), f(a))
    case MM512_CVT_ROUNDPD_EPU32 (a, rounding) =>
      _mm512_cvt_roundpd_epu32(f(a), f(rounding))
    case MM_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_CVTTPS_EPI32 (k, a) =>
      _mm512_maskz_cvttps_epi32(f(k), f(a))
    case MM512_SHUFFLE_F64X2 (a, b, imm8) =>
      _mm512_shuffle_f64x2(f(a), f(b), f(imm8))
    case MM_CVTUSEPI64_EPI8 (a) =>
      _mm_cvtusepi64_epi8(f(a))
    case MM256_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM_MASK_SUB_EPI32 (src, k, a, b) =>
      _mm_mask_sub_epi32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM256_MASKZ_SHUFFLE_EPI32 (k, a, imm8) =>
      _mm256_maskz_shuffle_epi32(f(k), f(a), f(imm8))
    case MM512_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm512_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm256_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASK_CMPGT_EPI32_MASK (k1, a, b) =>
      _mm256_mask_cmpgt_epi32_mask(f(k1), f(a), f(b))
    case MM_MASK_SRAI_EPI32 (src, k, a, imm8) =>
      _mm_mask_srai_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SET1_EPI64 (k, a) =>
      _mm512_maskz_set1_epi64(f(k), f(a))
    case MM256_MASKZ_CVTUSEPI64_EPI8 (k, a) =>
      _mm256_maskz_cvtusepi64_epi8(f(k), f(a))
    case MM256_CVTPD_EPI64 (a) =>
      _mm256_cvtpd_epi64(f(a))
    case MM512_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi64(f(a), f(idx), f(k), f(b))
    case MM256_PERMUTEX2VAR_PS (a, idx, b) =>
      _mm256_permutex2var_ps(f(a), f(idx), f(b))
    case MM_REDUCE_PD (a, imm8) =>
      _mm_reduce_pd(f(a), f(imm8))
    case MM256_MASK_CVTPD_EPU64 (src, k, a) =>
      _mm256_mask_cvtpd_epu64(f(src), f(k), f(a))
    case MM256_MASKZ_SUB_PS (k, a, b) =>
      _mm256_maskz_sub_ps(f(k), f(a), f(b))
    case MM256_MASKZ_SLL_EPI64 (k, a, count) =>
      _mm256_maskz_sll_epi64(f(k), f(a), f(count))
    case MM512_MASKZ_UNPACKLO_EPI32 (k, a, b) =>
      _mm512_maskz_unpacklo_epi32(f(k), f(a), f(b))
    case MM512_SQRT_PS (a) =>
      _mm512_sqrt_ps(f(a))
    case MM512_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm512_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MUL_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_mul_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_CVTEPI8_EPI64 (k, a) =>
      _mm512_maskz_cvtepi8_epi64(f(k), f(a))

    case Reflect(iDef@MM512_MASK_I64GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI32_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI32_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF64X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF64X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_F32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_F32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ABS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ABS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PACKS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PACKS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_I64X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_I64X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPU16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPU16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_LZCNT_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LZCNT_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAI_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAI_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_PD (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BROADCAST_I32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM_BROADCAST_I32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ABS_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ABS_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_EPI8 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_EPI8 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROL_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROL_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTF32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTF32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F64X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F64X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PD (vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PD (iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPU32_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPU32_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RANGE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RANGE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPI32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXPAND_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPAND_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_LZCNT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LZCNT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ABS_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ABS_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR4_PD (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SETR4_PD (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_COMPRESS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_PS (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_PS (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AVG_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AVG_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_EPI32 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPH_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPH_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_REDUCE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_REDUCE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_INSERTI32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_INSERTI32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RORV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RORV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MOVEPI8_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM_MOVEPI8_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP28_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RCP28_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEVAR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEVAR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PACKS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PACKS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RSQRT14_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RSQRT14_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF64X4_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF64X4_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEXVAR_PS (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEXVAR_PS (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INSERTF32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_INSERTF32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TERNARYLOGIC_EPI32 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLT_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLT_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPD_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPD_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRA_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRA_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_XOR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_XOR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROR_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROR_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI64X4_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI64X4_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROUNDSCALE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROUNDSCALE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MOVEDUP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MOVEDUP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPU32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPU32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_F64X2 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_F64X2 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGT_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGT_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_PS (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_PS (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51209 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_I64GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_SET1_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_set1_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPLT_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SLLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sllv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MIN_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_UNPACKLO_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTI32_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvti32_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_INSERTF64X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_insertf64x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_BROADCAST_F32X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcast_f32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASKZ_XOR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSD_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_CVTPH_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_UNPACKHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ABS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_abs_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_SRA_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sra_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_CVTTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_LOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_SUBS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_FIXUPIMM_PD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPLE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_PACKS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_packs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_BROADCAST_I64X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcast_i64x2(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMP_EPU16_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LZCNT_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_lzcnt_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SRAI_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srai_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_I64GATHER_PD(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_pd(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_MASK_MIN_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MIN_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_BROADCAST_I32X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_broadcast_i32x2(${quote(a)})")
    case iDef@MM_MASKZ_CVTUSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_UNPACKLO_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ABS_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_abs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTPD_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_PERMUTEX_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LOADU_EPI8(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_epi8(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK3_FMSUBADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_ROL_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rol_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MUL_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_FMSUBADD_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASK_INSERTF32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_insertf32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SRAI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srai_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_BROADCAST_F64X4(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_f64x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_PERMUTEX_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FIXUPIMM_PS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MIN_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_TEST_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMSUB_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_I64GATHER_PD(vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_pd(${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_ADDS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_adds_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMP_EPU32_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK3_FMSUB_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_RANGE_SD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_range_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_TESTN_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_testn_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPD_EPI32(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epi32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_EXPAND_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expand_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_LZCNT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_lzcnt_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ABS_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_abs_epi8(${quote(a)})")
    case iDef@MM256_MASKZ_LOAD_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_load_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_ADDS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SETR4_PD(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr4_pd(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM512_MASK_STOREU_EPI64(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_storeu_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_UNPACKHI_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_COMPRESS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_compress_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sqrt_pd(${quote(a)})")
    case iDef@MM_MASK_RANGE_PS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_range_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_UNDEFINED_PS() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_undefined_ps()")
    case iDef@MM_MASK_AVG_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_avg_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_FMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_MAX_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPNEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex2var_epi32(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SUB_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTPH_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtph_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_REDUCE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_reduce_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SQRT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXP2A23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2a23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MOVM_EPI8(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movm_epi8(${quote(k)})")
    case iDef@MM_MASKZ_SRLV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srlv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_SRLV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srlv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_INSERTI32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_inserti32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_RORV_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rorv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MOVEPI8_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_movepi8_mask(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_I32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_i32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_RCP28_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp28_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_TESTN_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_testn_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MAX_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_load_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_SRL_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srl_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_CMPLE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SLLV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sllv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_ROUNDSCALE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_PERMUTEX2VAR_EPI16(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASK_PERMUTEVAR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutevar_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi64_epi8(${quote(a)})")
    case iDef@MM_MASK_CVTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SHUFFLE_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_CMP_EPI8_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_PACKS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_packs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srlv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_CVTUSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SRLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MMASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i32gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASKZ_SQRT_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sqrt_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_RSQRT28_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt28_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ADD_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_storeu_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_RSQRT14_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rsqrt14_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_EXTRACTF64X4_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf64x4_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_PERMUTEXVAR_PS(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutexvar_ps(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_INSERTF32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_insertf32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_ternarylogic_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CMPLT_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmplt_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTTPD_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttpd_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTEPI32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_TEST_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmple_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRA_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sra_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_CVTTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_BROADCASTD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcastd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_XOR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_xor_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ROR_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_ror_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTI64X4_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti64x4_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SCALEF_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scalef_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CMPGE_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMADD_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_SCALEF_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_ROUNDSCALE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_roundscale_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_UNPACKLO_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_AVG_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MOVEDUP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_movedup_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVT_ROUNDPD_EPU32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundpd_epu32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMSUBADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_CVTTPS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttps_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SHUFFLE_F64X2(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_f64x2(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTUSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi64_epi8(${quote(a)})")
    case iDef@MM256_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_SUB_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SHUFFLE_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_MIN_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPGT_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpgt_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRAI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srai_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SET1_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_set1_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTUSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CVTPD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtpd_epi64(${quote(a)})")
    case iDef@MM512_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_PERMUTEX2VAR_PS(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex2var_ps(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_REDUCE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CVTPD_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtpd_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_SUB_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SLL_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sll_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_UNPACKLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sqrt_ps(${quote(a)})")
    case iDef@MM512_MASK_MULHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MUL_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CVTEPI8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi8_epi64(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
