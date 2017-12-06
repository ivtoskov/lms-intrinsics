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

    
trait AVX512014 extends IntrinsicsBase {
  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMSUBADD_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	"mem_addr" does not need to be aligned on any particular
   * boundary.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 32-bit integer from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM512_BROADCASTD_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 32-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28. [round_note]
   * a: __m512, rounding: int
   */
  case class MM512_RCP28_ROUND_PS(a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: const int
   */
  case class MM512_MASK3_FMSUBADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASKZ_RANGE_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCAST_I64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_ABS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADDS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_OR_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_CVTTPS_EPI32(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" using the control in "imm8", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: _MM_PERM_ENUM
   */
  case class MM_MASKZ_SHUFFLE_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUBS_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 16-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM256_MASKZ_MOV_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTSEPI32_EPI8(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SHUFFLE_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m512i, b: __m512i, c: __m512i, imm8: int
   */
  case class MM512_TERNARYLOGIC_EPI32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_UNPACKLO_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, idx: __m512i, b: __m512
   */
  case class MM512_MASK_PERMUTEX2VAR_PS(a: Exp[__m512], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: int
   */
  case class MM256_MASKZ_SET1_EPI32(k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPU64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512, b: __m512, sae: int
   */
  case class MM512_MAX_ROUND_PS(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 8-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask64, a: __m512i, mem_addrOffset: int
   */
  case class MM512_MASK_STOREU_EPI8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Long], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SLLV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_ROUNDSCALE_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASK_ROL_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_MASKZ_TERNARYLOGIC_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_ADD_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SLL_EPI64(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPI16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRLV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_EXTRACTF64X4_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_AND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_AVG_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRL_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512 to type __m256. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS512_PS256(a: Exp[__m512]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper element from "b" to the upper element of "dst". This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_GETMANT_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set). [round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FNMSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).  
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * src: __m512, k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASK_MIN_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTPH_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: int
   */
  case class MM_MASK_SET1_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASKZ_INSERTI32X4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRAV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_SQRT_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FNMSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: const int
   */
  case class MM512_MASK3_FMADDSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPU32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMADDSUB_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_PACKUS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m128i
   */
  case class MM256_MASKZ_BROADCASTB_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed single-precision
   * (32-bit) floating-point elements in "a", store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_RSQRT28_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_MOV_EPI64(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SRLV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MADD_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRA_EPI32(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASKZ_CVTPS_PH(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RCP14_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower element.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_GETEXP_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "src" when
   * mask bit 0 is not set), and copy the upper element from "b" to the upper
   * element of "dst".
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_MASK_ROUNDSCALE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper element from "b" to the upper element of
   * "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, imm8: const int, rounding: const int
   */
  case class MM_ROUNDSCALE_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst". 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPU32(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADD_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHRS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MAX_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". The
   * maximum relative error for this approximation is less than 2^-28. [round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_RSQRT28_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI8(src: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i
   */
  case class MM_MASK_ABS_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128, mem_addrOffset: int
   */
  case class MM_MASK_STORE_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI32(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULHRS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m256i
   */
  case class MM512_CVTPH_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_SI32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, imm8: const int
   */
  case class MM512_MASK_PERMUTE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASK_EXTRACTI32X4_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "src", "a", and "b" are used to form a 3 bit index into "imm8", and
   * the value at that bit in "imm8" is written to the corresponding bit in "dst"
   * using writemask "k" at 64-bit granularity (64-bit elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_TERNARYLOGIC_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_BROADCAST_F32X2(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_PACKUS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SLLI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FNMSUB_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CVTPD_EPU64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst". Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPI64(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
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
   * a: __m256d, b: __m256d, imm8: int
   */
  case class MM256_RANGE_PD(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_ADD_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_LZCNT_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_ADD_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_EXTRACTF64X4_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_FPCLASS_PD_MASK(k1: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: char
   */
  case class MM512_MASK_SET1_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with undefined elements.

   */
  case class MM512_UNDEFINED_EPI32() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, imm8: const int, rounding: const int
   */
  case class MM_ROUNDSCALE_ROUND_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128d, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m512i, idx: __m512i, k: __mmask16, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI32(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TEST_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "idx" when the corresponding mask bit is not set).
   * a: __m128i, idx: __m128i, k: __mmask8, b: __m128i
   */
  case class MM_MASK2_PERMUTEX2VAR_EPI64(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, idx: __m512i, a: __m512
   */
  case class MM512_MASK_PERMUTEXVAR_PS(src: Exp[__m512], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, idx: __m128i, a: __m128i
   */
  case class MM_MASK_PERMUTEXVAR_EPI16(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_I64X2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, imm8: const int
   */
  case class MM_MASK_PERMUTE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRA_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the control in "imm8", and store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_PERMUTEX_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed 64-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m128i, imm8: int
   */
  case class MM256_MASKZ_INSERTI64X2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed double-precision (64-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_MOV_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 64-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADD_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m128, b: __m128, sae: int
   */
  case class MM_MAX_ROUND_SS(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_UNPACKLO_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MUL_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 32 bytes (4 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVT_ROUNDSD_SI32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
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
   * src: __m256i, k: __mmask32, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_EPI8[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU16_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of
   * "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_SCALEF_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPNEQ_EPU8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMSUBADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_EXTRACTF32X8_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROR_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * a: __m256
   */
  case class MM256_GETEXP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, count: __m512i
   */
  case class MM512_MASKZ_SRAV_EPI64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MADD_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_PERMUTEX2VAR_EPI8(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiplies elements in packed 64-bit integer vectors "a" and "b" together,
   * storing the lower 64 bits of the result in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLOX_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in th elow 4 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_RANGE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m512d
   */
  case class MM512_CVTPD_PS(a: Exp[__m512d]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i
   */
  case class MM512_MASKZ_ABS_EPI8(k: Exp[Long], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTUSEPI32_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of "a" and "b", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_UNPACKLO_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
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
   * k: __mmask16, a: __m512, b: __m128, imm8: int
   */
  case class MM512_MASKZ_INSERTF32X4(k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTSEPI64_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MAX_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: const int
   */
  case class MM512_MASK_PERMUTE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRL_EPI16(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI16(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_SHUFFLEHI_EPI16(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADD_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the high half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_UNPACKHI_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 64-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_CMP_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_fmsubadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm512_maskz_loadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_broadcastd_epi32(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCASTD_EPI32(a)
  }
            
  def _mm256_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_rcp28_round_ps(a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RCP28_ROUND_PS(a, rounding)
  }
            
  def _mm512_mask3_fmsubadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUBADD_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_maskz_range_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_RANGE_ROUND_PD(k, a, b, imm8, rounding)
  }
            
  def _mm256_mask_subs_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm256_mask_broadcast_i64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCAST_I64X2(src, k, a)
  }
            
  def _mm256_mask_cvtusepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_abs_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ABS_EPI32(src, k, a)
  }
            
  def _mm256_mask_adds_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADDS_EPI16(src, k, a, b)
  }
            
  def _mm_mask_or_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_OR_PD(src, k, a, b)
  }
            
  def _mm256_maskz_cvttps_epi32(k: Exp[Int], a: Exp[__m256]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPI32(k, a)
  }
            
  def _mm_mask_min_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm256_cmpge_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPI8_MASK(a, b)
  }
            
  def _mm_maskz_shuffle_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLE_EPI32(k, a, imm8)
  }
            
  def _mm256_mask_subs_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm256_maskz_mov_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MOV_EPI16(k, a)
  }
            
  def _mm256_maskz_add_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm512_maskz_cvtsepi32_epi8(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTSEPI32_EPI8(k, a)
  }
            
  def _mm512_shuffle_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SHUFFLE_EPI8(a, b)
  }
            
  def _mm512_ternarylogic_epi32(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_TERNARYLOGIC_EPI32(a, b, c, imm8)
  }
            
  def _mm512_maskz_unpacklo_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_UNPACKLO_PS(k, a, b)
  }
            
  def _mm512_mask_permutex2var_ps(a: Exp[__m512], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_PERMUTEX2VAR_PS(a, k, idx, b)
  }
            
  def _mm256_maskz_set1_epi32(k: Exp[Int], a: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SET1_EPI32(k, a)
  }
            
  def _mm256_mask_cvtepu64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASK_CVTEPU64_PS(src, k, a)
  }
            
  def _mm512_max_round_ps(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MAX_ROUND_PS(a, b, sae)
  }
            
  def _mm512_mask_storeu_epi8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Long], a: Exp[__m512i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_sllv_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SLLV_EPI16(src, k, a, count)
  }
            
  def _mm512_maskz_roundscale_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_ROUNDSCALE_PD(k, a, imm8)
  }
            
  def _mm256_mask_cmpge_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPU32_MASK(k1, a, b)
  }
            
  def _mm_mask_rol_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ROL_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm256_maskz_ternarylogic_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8)
  }
            
  def _mm512_mask_add_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_ADD_EPI8(src, k, a, b)
  }
            
  def _mm512_sll_epi64(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SLL_EPI64(a, count)
  }
            
  def _mm512_cvtepi16_epi64(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPI16_EPI64(a)
  }
            
  def _mm_maskz_srlv_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRLV_EPI32(k, a, count)
  }
            
  def _mm512_mask_extractf64x4_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_MASK_EXTRACTF64X4_PD(src, k, a, imm8)
  }
            
  def _mm512_mask_and_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm512_avg_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_AVG_EPU16(a, b)
  }
            
  def _mm512_maskz_srl_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRL_EPI64(k, a, count)
  }
            
  def _mm_maskz_sra_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI64(k, a, count)
  }
            
  def _mm512_castps512_ps256(a: Exp[__m512]): Exp[__m256] = {
    MM512_CASTPS512_PS256(a)
  }
            
  def _mm512_mask_cvtpd_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512d]): Exp[__m256] = {
    MM512_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm_getmant_round_sd(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_ROUND_SD(a, b, interv, sc, rounding)
  }
            
  def _mm_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm512_maskz_fnmsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FNMSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_mask_min_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASK_MIN_ROUND_PS(src, k, a, b, sae)
  }
            
  def _mm_mask_cvtph_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm_mask_set1_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SET1_EPI32(src, k, a)
  }
            
  def _mm_mask_min_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_inserti32x4(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_INSERTI32X4(k, a, b, imm8)
  }
            
  def _mm256_maskz_srav_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRAV_EPI64(k, a, count)
  }
            
  def _mm_mask_sqrt_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_SQRT_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_fnmsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FNMSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm512_mask3_fmaddsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADDSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_cvttpd_epu32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTTPD_EPU32(a)
  }
            
  def _mm256_mask_fmaddsub_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm256_mask_packus_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PACKUS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm256_maskz_broadcastb_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm512_maskz_rsqrt28_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_RSQRT28_ROUND_PS(k, a, rounding)
  }
            
  def _mm256_maskz_mov_epi64(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MOV_EPI64(k, a)
  }
            
  def _mm_srlv_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SRLV_EPI16(a, count)
  }
            
  def _mm512_mask_max_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI64(src, k, a, b)
  }
            
  def _mm256_mask_madd_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm512_sra_epi32(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRA_EPI32(a, count)
  }
            
  def _mm256_maskz_add_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm256_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm_maskz_rcp14_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP14_SD(k, a, b)
  }
            
  def _mm_maskz_getexp_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_SD(k, a, b)
  }
            
  def _mm_mask_roundscale_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ROUNDSCALE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm_roundscale_round_sd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_ROUNDSCALE_ROUND_SD(a, b, imm8, rounding)
  }
            
  def _mm512_cvtt_roundpd_epu32(a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_CVTT_ROUNDPD_EPU32(a, sae)
  }
            
  def _mm256_maskz_cvtepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTEPI32_EPI8(k, a)
  }
            
  def _mm256_mask_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_add_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADD_EPI64(k, a, b)
  }
            
  def _mm512_mulhrs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHRS_EPI16(a, b)
  }
            
  def _mm512_cmpeq_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm512_mask_max_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_rsqrt28_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_RSQRT28_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm512_mask_permutexvar_epi8(src: Exp[__m512i], k: Exp[Long], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  def _mm_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm_mask_abs_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ABS_EPI8(src, k, a)
  }
            
  def _mm_maskz_add_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm512_mask_cmpeq_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPEQ_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_store_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_permutexvar_epi32(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI32(src, k, idx, a)
  }
            
  def _mm_maskz_mulhrs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULHRS_EPI16(k, a, b)
  }
            
  def _mm512_cvtph_ps(a: Exp[__m256i]): Exp[__m512] = {
    MM512_CVTPH_PS(a)
  }
            
  def _mm_cvtt_roundss_si32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSS_SI32(a, rounding)
  }
            
  def _mm512_mask_permute_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_PERMUTE_PD(src, k, a, imm8)
  }
            
  def _mm256_mask_extracti32x4_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8)
  }
            
  def _mm_mask_ternarylogic_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm_mask_subs_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPU8(src, k, a, b)
  }
            
  def _mm256_maskz_broadcast_f32x2(k: Exp[Int], a: Exp[__m128]): Exp[__m256] = {
    MM256_MASKZ_BROADCAST_F32X2(k, a)
  }
            
  def _mm_maskz_packus_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PACKUS_EPI16(k, a, b)
  }
            
  def _mm_maskz_slli_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SLLI_EPI32(k, a, imm8)
  }
            
  def _mm_mask_fnmsub_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FNMSUB_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_mask_fmadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMADD_PS(a, k, b, c)
  }
            
  def _mm_cvtpd_epu64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTPD_EPU64(a)
  }
            
  def _mm512_cvtt_roundpd_epi64(a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPD_EPI64(a, sae)
  }
            
  def _mm256_range_pd(a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_RANGE_PD(a, b, imm8)
  }
            
  def _mm_maskz_add_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_ADD_SD(k, a, b)
  }
            
  def _mm512_maskz_lzcnt_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_LZCNT_EPI32(k, a)
  }
            
  def _mm512_min_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPU16(a, b)
  }
            
  def _mm_mask_add_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_ADD_SD(src, k, a, b)
  }
            
  def _mm512_maskz_mov_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_MOV_PS(k, a)
  }
            
  def _mm512_extractf64x4_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_EXTRACTF64X4_PD(a, imm8)
  }
            
  def _mm512_mask_fpclass_pd_mask(k1: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_FPCLASS_PD_MASK(k1, a, imm8)
  }
            
  def _mm512_mask_set1_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[Byte]): Exp[__m512i] = {
    MM512_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm512_undefined_epi32(): Exp[__m512i] = {
    MM512_UNDEFINED_EPI32()
  }
            
  def _mm_roundscale_round_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_ROUND_SS(a, b, imm8, rounding)
  }
            
  def _mm_mask_compressstoreu_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cmpge_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_mask2_permutex2var_epi32(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b)
  }
            
  def _mm256_mask_test_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TEST_EPI32_MASK(k1, a, b)
  }
            
  def _mm_mask2_permutex2var_epi64(a: Exp[__m128i], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b)
  }
            
  def _mm512_mask_permutexvar_ps(src: Exp[__m512], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_PERMUTEXVAR_PS(src, k, idx, a)
  }
            
  def _mm_mask_permutexvar_epi16(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEXVAR_EPI16(src, k, idx, a)
  }
            
  def _mm_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_shuffle_i64x2(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SHUFFLE_I64X2(k, a, b, imm8)
  }
            
  def _mm_mask_permute_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_PERMUTE_PS(src, k, a, imm8)
  }
            
  def _mm_mask_sra_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRA_EPI32(src, k, a, count)
  }
            
  def _mm512_maskz_mov_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MOV_PD(k, a)
  }
            
  def _mm256_permutex_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_PERMUTEX_PD(a, imm8)
  }
            
  def _mm_maskz_div_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm256_maskz_inserti64x2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_INSERTI64X2(k, a, b, imm8)
  }
            
  def _mm256_maskz_mov_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_MOV_PD(k, a)
  }
            
  def _mm256_maskz_add_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADD_EPI64(k, a, b)
  }
            
  def _mm_cmple_epu8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPU8_MASK(a, b)
  }
            
  def _mm_max_round_ss(a: Exp[__m128], b: Exp[__m128], sae: Exp[Int]): Exp[__m128] = {
    MM_MAX_ROUND_SS(a, b, sae)
  }
            
  def _mm_mask_unpacklo_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm512_mul_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MUL_EPI32(a, b)
  }
            
  def _mm256_maskz_alignr_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI64(k, a, b, count)
  }
            
  def _mm_cvt_roundsd_si32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSD_SI32(a, rounding)
  }
            
  def _mm256_mask_loadu_epi8[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvtepu16_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU16_EPI32(src, k, a)
  }
            
  def _mm_mask_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_scalef_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_SCALEF_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_mask_cmpneq_epu8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPNEQ_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_maskz_fmsubadd_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMSUBADD_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm512_extractf32x8_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m256] = {
    MM512_EXTRACTF32X8_PS(a, imm8)
  }
            
  def _mm256_mask_ror_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROR_EPI64(src, k, a, imm8)
  }
            
  def _mm256_getexp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_GETEXP_PS(a)
  }
            
  def _mm512_maskz_srav_epi64(k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SRAV_EPI64(k, a, count)
  }
            
  def _mm256_mask_min_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI64(src, k, a, b)
  }
            
  def _mm_mask_storeu_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_madd_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD_EPI16(k, a, b)
  }
            
  def _mm512_permutex2var_epi8(a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm256_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm512_mullox_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLOX_EPI64(a, b)
  }
            
  def _mm_maskz_cvtepu8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU8_EPI32(k, a)
  }
            
  def _mm_mask_range_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_RANGE_SS(src, k, a, b, imm8)
  }
            
  def _mm512_cvtpd_ps(a: Exp[__m512d]): Exp[__m256] = {
    MM512_CVTPD_PS(a)
  }
            
  def _mm512_maskz_abs_epi8(k: Exp[Long], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ABS_EPI8(k, a)
  }
            
  def _mm512_mask_cvtusepi32_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASK_CVTUSEPI32_EPI8(src, k, a)
  }
            
  def _mm_mask_unpacklo_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm256_maskz_expandloadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm512_maskz_insertf32x4(k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_INSERTF32X4(k, a, b, imm8)
  }
            
  def _mm512_cvtsepi64_epi16(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTSEPI64_EPI16(a)
  }
            
  def _mm_maskz_max_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MAX_SD(k, a, b)
  }
            
  def _mm_mask_cvtusepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_permute_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_PERMUTE_PS(src, k, a, imm8)
  }
            
  def _mm512_srl_epi16(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRL_EPI16(a, count)
  }
            
  def _mm256_maskz_mullo_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI16(k, a, b)
  }
            
  def _mm_permutex2var_epi16(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI16(a, idx, b)
  }
            
  def _mm512_shufflehi_epi16(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_SHUFFLEHI_EPI16(a, imm8)
  }
            
  def _mm256_maskz_add_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADD_EPI8(k, a, b)
  }
            
  def _mm512_mask_unpackhi_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_UNPACKHI_PD(src, k, a, b)
  }
            
  def _mm256_mask_load_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cmp_epi16_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPI16_MASK(a, b, imm8)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm512_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case iDef@MM512_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_loadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_BROADCASTD_EPI32 (a) =>
      _mm512_broadcastd_epi32(f(a))
    case iDef@MM256_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_RCP28_ROUND_PS (a, rounding) =>
      _mm512_rcp28_round_ps(f(a), f(rounding))
    case MM512_MASK3_FMSUBADD_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmsubadd_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASKZ_RANGE_ROUND_PD (k, a, b, imm8, rounding) =>
      _mm512_maskz_range_round_pd(f(k), f(a), f(b), f(imm8), f(rounding))
    case MM256_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm256_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASK_BROADCAST_I64X2 (src, k, a) =>
      _mm256_mask_broadcast_i64x2(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_ABS_EPI32 (src, k, a) =>
      _mm256_mask_abs_epi32(f(src), f(k), f(a))
    case MM256_MASK_ADDS_EPI16 (src, k, a, b) =>
      _mm256_mask_adds_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_OR_PD (src, k, a, b) =>
      _mm_mask_or_pd(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_CVTTPS_EPI32 (k, a) =>
      _mm256_maskz_cvttps_epi32(f(k), f(a))
    case MM_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM256_CMPGE_EPI8_MASK (a, b) =>
      _mm256_cmpge_epi8_mask(f(a), f(b))
    case MM_MASKZ_SHUFFLE_EPI32 (k, a, imm8) =>
      _mm_maskz_shuffle_epi32(f(k), f(a), f(imm8))
    case MM256_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm256_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MOV_EPI16 (k, a) =>
      _mm256_maskz_mov_epi16(f(k), f(a))
    case MM256_MASKZ_ADD_PD (k, a, b) =>
      _mm256_maskz_add_pd(f(k), f(a), f(b))
    case MM512_MASKZ_CVTSEPI32_EPI8 (k, a) =>
      _mm512_maskz_cvtsepi32_epi8(f(k), f(a))
    case MM512_SHUFFLE_EPI8 (a, b) =>
      _mm512_shuffle_epi8(f(a), f(b))
    case MM512_TERNARYLOGIC_EPI32 (a, b, c, imm8) =>
      _mm512_ternarylogic_epi32(f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_UNPACKLO_PS (k, a, b) =>
      _mm512_maskz_unpacklo_ps(f(k), f(a), f(b))
    case MM512_MASK_PERMUTEX2VAR_PS (a, k, idx, b) =>
      _mm512_mask_permutex2var_ps(f(a), f(k), f(idx), f(b))
    case MM256_MASKZ_SET1_EPI32 (k, a) =>
      _mm256_maskz_set1_epi32(f(k), f(a))
    case MM256_MASK_CVTEPU64_PS (src, k, a) =>
      _mm256_mask_cvtepu64_ps(f(src), f(k), f(a))
    case MM512_MAX_ROUND_PS (a, b, sae) =>
      _mm512_max_round_ps(f(a), f(b), f(sae))
    case iDef@MM512_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset) =>
      _mm512_mask_storeu_epi8(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SLLV_EPI16 (src, k, a, count) =>
      _mm256_mask_sllv_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_ROUNDSCALE_PD (k, a, imm8) =>
      _mm512_maskz_roundscale_pd(f(k), f(a), f(imm8))
    case MM256_MASK_CMPGE_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epu32_mask(f(k1), f(a), f(b))
    case MM_MASK_ROL_EPI32 (src, k, a, imm8) =>
      _mm_mask_rol_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm512_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM256_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8) =>
      _mm256_maskz_ternarylogic_epi64(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASK_ADD_EPI8 (src, k, a, b) =>
      _mm512_mask_add_epi8(f(src), f(k), f(a), f(b))
    case MM512_SLL_EPI64 (a, count) =>
      _mm512_sll_epi64(f(a), f(count))
    case MM512_CVTEPI16_EPI64 (a) =>
      _mm512_cvtepi16_epi64(f(a))
    case MM_MASKZ_SRLV_EPI32 (k, a, count) =>
      _mm_maskz_srlv_epi32(f(k), f(a), f(count))
    case MM512_MASK_EXTRACTF64X4_PD (src, k, a, imm8) =>
      _mm512_mask_extractf64x4_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASK_AND_PD (src, k, a, b) =>
      _mm512_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM512_AVG_EPU16 (a, b) =>
      _mm512_avg_epu16(f(a), f(b))
    case MM512_MASKZ_SRL_EPI64 (k, a, count) =>
      _mm512_maskz_srl_epi64(f(k), f(a), f(count))
    case MM_MASKZ_SRA_EPI64 (k, a, count) =>
      _mm_maskz_sra_epi64(f(k), f(a), f(count))
    case MM512_CASTPS512_PS256 (a) =>
      _mm512_castps512_ps256(f(a))
    case MM512_MASK_CVTPD_PS (src, k, a) =>
      _mm512_mask_cvtpd_ps(f(src), f(k), f(a))
    case MM_GETMANT_ROUND_SD (a, b, interv, sc, rounding) =>
      _mm_getmant_round_sd(f(a), f(b), f(interv), f(sc), f(rounding))
    case MM_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_FNMSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fnmsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASK_MIN_ROUND_PS (src, k, a, b, sae) =>
      _mm512_mask_min_round_ps(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASK_CVTPH_PS (src, k, a) =>
      _mm_mask_cvtph_ps(f(src), f(k), f(a))
    case MM_MASK_SET1_EPI32 (src, k, a) =>
      _mm_mask_set1_epi32(f(src), f(k), f(a))
    case MM_MASK_MIN_EPU8 (src, k, a, b) =>
      _mm_mask_min_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_INSERTI32X4 (k, a, b, imm8) =>
      _mm256_maskz_inserti32x4(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_SRAV_EPI64 (k, a, count) =>
      _mm256_maskz_srav_epi64(f(k), f(a), f(count))
    case MM_MASK_SQRT_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_sqrt_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_FNMSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fnmsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADDSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmaddsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_CVTTPD_EPU32 (a) =>
      _mm512_cvttpd_epu32(f(a))
    case MM256_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm256_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM256_MASK_PACKUS_EPI16 (src, k, a, b) =>
      _mm256_mask_packus_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm512_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm256_maskz_broadcastb_epi8(f(k), f(a))
    case MM512_MASKZ_RSQRT28_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_rsqrt28_round_ps(f(k), f(a), f(rounding))
    case MM256_MASKZ_MOV_EPI64 (k, a) =>
      _mm256_maskz_mov_epi64(f(k), f(a))
    case MM_SRLV_EPI16 (a, count) =>
      _mm_srlv_epi16(f(a), f(count))
    case MM512_MASK_MAX_EPI64 (src, k, a, b) =>
      _mm512_mask_max_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm256_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case MM512_SRA_EPI32 (a, count) =>
      _mm512_sra_epi32(f(a), f(count))
    case MM256_MASKZ_ADD_PS (k, a, b) =>
      _mm256_maskz_add_ps(f(k), f(a), f(b))
    case MM256_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm256_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM_MASKZ_RCP14_SD (k, a, b) =>
      _mm_maskz_rcp14_sd(f(k), f(a), f(b))
    case MM_MASKZ_GETEXP_SD (k, a, b) =>
      _mm_maskz_getexp_sd(f(k), f(a), f(b))
    case MM_MASK_ROUNDSCALE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_roundscale_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_ROUNDSCALE_ROUND_SD (a, b, imm8, rounding) =>
      _mm_roundscale_round_sd(f(a), f(b), f(imm8), f(rounding))
    case MM512_CVTT_ROUNDPD_EPU32 (a, sae) =>
      _mm512_cvtt_roundpd_epu32(f(a), f(sae))
    case MM256_MASKZ_CVTEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtepi32_epi8(f(k), f(a))
    case iDef@MM256_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_ADD_EPI64 (k, a, b) =>
      _mm512_maskz_add_epi64(f(k), f(a), f(b))
    case MM512_MULHRS_EPI16 (a, b) =>
      _mm512_mulhrs_epi16(f(a), f(b))
    case MM512_CMPEQ_EPI8_MASK (a, b) =>
      _mm512_cmpeq_epi8_mask(f(a), f(b))
    case MM512_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm512_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_RSQRT28_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_rsqrt28_round_sd(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))
    case MM_MASKZ_RCP14_PD (k, a) =>
      _mm_maskz_rcp14_pd(f(k), f(a))
    case MM_MASK_ABS_EPI8 (src, k, a) =>
      _mm_mask_abs_epi8(f(src), f(k), f(a))
    case MM_MASKZ_ADD_PS (k, a, b) =>
      _mm_maskz_add_ps(f(k), f(a), f(b))
    case MM512_MASK_CMPEQ_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi16_mask(f(k1), f(a), f(b))
    case iDef@MM_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi32(f(src), f(k), f(idx), f(a))
    case MM_MASKZ_MULHRS_EPI16 (k, a, b) =>
      _mm_maskz_mulhrs_epi16(f(k), f(a), f(b))
    case MM512_CVTPH_PS (a) =>
      _mm512_cvtph_ps(f(a))
    case MM_CVTT_ROUNDSS_SI32 (a, rounding) =>
      _mm_cvtt_roundss_si32(f(a), f(rounding))
    case MM512_MASK_PERMUTE_PD (src, k, a, imm8) =>
      _mm512_mask_permute_pd(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8) =>
      _mm256_mask_extracti32x4_epi32(f(src), f(k), f(a), f(imm8))
    case MM_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_SUBS_EPU8 (src, k, a, b) =>
      _mm_mask_subs_epu8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_BROADCAST_F32X2 (k, a) =>
      _mm256_maskz_broadcast_f32x2(f(k), f(a))
    case MM_MASKZ_PACKUS_EPI16 (k, a, b) =>
      _mm_maskz_packus_epi16(f(k), f(a), f(b))
    case MM_MASKZ_SLLI_EPI32 (k, a, imm8) =>
      _mm_maskz_slli_epi32(f(k), f(a), f(imm8))
    case MM_MASK_FNMSUB_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fnmsub_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FMADD_PS (a, k, b, c) =>
      _mm_mask_fmadd_ps(f(a), f(k), f(b), f(c))
    case MM_CVTPD_EPU64 (a) =>
      _mm_cvtpd_epu64(f(a))
    case MM512_CVTT_ROUNDPD_EPI64 (a, sae) =>
      _mm512_cvtt_roundpd_epi64(f(a), f(sae))
    case MM256_RANGE_PD (a, b, imm8) =>
      _mm256_range_pd(f(a), f(b), f(imm8))
    case MM_MASKZ_ADD_SD (k, a, b) =>
      _mm_maskz_add_sd(f(k), f(a), f(b))
    case MM512_MASKZ_LZCNT_EPI32 (k, a) =>
      _mm512_maskz_lzcnt_epi32(f(k), f(a))
    case MM512_MIN_EPU16 (a, b) =>
      _mm512_min_epu16(f(a), f(b))
    case MM_MASK_ADD_SD (src, k, a, b) =>
      _mm_mask_add_sd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MOV_PS (k, a) =>
      _mm512_maskz_mov_ps(f(k), f(a))
    case MM512_EXTRACTF64X4_PD (a, imm8) =>
      _mm512_extractf64x4_pd(f(a), f(imm8))
    case MM512_MASK_FPCLASS_PD_MASK (k1, a, imm8) =>
      _mm512_mask_fpclass_pd_mask(f(k1), f(a), f(imm8))
    case MM512_MASK_SET1_EPI8 (src, k, a) =>
      _mm512_mask_set1_epi8(f(src), f(k), f(a))
    case MM512_UNDEFINED_EPI32 () =>
      _mm512_undefined_epi32()
    case MM_ROUNDSCALE_ROUND_SS (a, b, imm8, rounding) =>
      _mm_roundscale_round_ss(f(a), f(b), f(imm8), f(rounding))
    case iDef@MM_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CMPGE_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmpge_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi32(f(a), f(idx), f(k), f(b))
    case MM256_MASK_TEST_EPI32_MASK (k1, a, b) =>
      _mm256_mask_test_epi32_mask(f(k1), f(a), f(b))
    case MM_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b) =>
      _mm_mask2_permutex2var_epi64(f(a), f(idx), f(k), f(b))
    case MM512_MASK_PERMUTEXVAR_PS (src, k, idx, a) =>
      _mm512_mask_permutexvar_ps(f(src), f(k), f(idx), f(a))
    case MM_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a) =>
      _mm_mask_permutexvar_epi16(f(src), f(k), f(idx), f(a))
    case iDef@MM_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_i64x2(f(k), f(a), f(b), f(imm8))
    case MM_MASK_PERMUTE_PS (src, k, a, imm8) =>
      _mm_mask_permute_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASK_SRA_EPI32 (src, k, a, count) =>
      _mm_mask_sra_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_MOV_PD (k, a) =>
      _mm512_maskz_mov_pd(f(k), f(a))
    case MM256_PERMUTEX_PD (a, imm8) =>
      _mm256_permutex_pd(f(a), f(imm8))
    case MM_MASKZ_DIV_PS (k, a, b) =>
      _mm_maskz_div_ps(f(k), f(a), f(b))
    case MM256_MASKZ_INSERTI64X2 (k, a, b, imm8) =>
      _mm256_maskz_inserti64x2(f(k), f(a), f(b), f(imm8))
    case MM256_MASKZ_MOV_PD (k, a) =>
      _mm256_maskz_mov_pd(f(k), f(a))
    case MM256_MASKZ_ADD_EPI64 (k, a, b) =>
      _mm256_maskz_add_epi64(f(k), f(a), f(b))
    case MM_CMPLE_EPU8_MASK (a, b) =>
      _mm_cmple_epu8_mask(f(a), f(b))
    case MM_MAX_ROUND_SS (a, b, sae) =>
      _mm_max_round_ss(f(a), f(b), f(sae))
    case MM_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM512_MUL_EPI32 (a, b) =>
      _mm512_mul_epi32(f(a), f(b))
    case MM256_MASKZ_ALIGNR_EPI64 (k, a, b, count) =>
      _mm256_maskz_alignr_epi64(f(k), f(a), f(b), f(count))
    case MM_CVT_ROUNDSD_SI32 (a, rounding) =>
      _mm_cvt_roundsd_si32(f(a), f(rounding))
    case iDef@MM256_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_epi8(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_CVTEPU16_EPI32 (src, k, a) =>
      _mm256_mask_cvtepu16_epi32(f(src), f(k), f(a))
    case iDef@MM_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SCALEF_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_scalef_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_MASK_CMPNEQ_EPU8_MASK (k1, a, b) =>
      _mm512_mask_cmpneq_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_FMSUBADD_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmsubadd_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_EXTRACTF32X8_PS (a, imm8) =>
      _mm512_extractf32x8_ps(f(a), f(imm8))
    case MM256_MASK_ROR_EPI64 (src, k, a, imm8) =>
      _mm256_mask_ror_epi64(f(src), f(k), f(a), f(imm8))
    case MM256_GETEXP_PS (a) =>
      _mm256_getexp_ps(f(a))
    case MM512_MASKZ_SRAV_EPI64 (k, a, count) =>
      _mm512_maskz_srav_epi64(f(k), f(a), f(count))
    case MM256_MASK_MIN_EPI64 (src, k, a, b) =>
      _mm256_mask_min_epi64(f(src), f(k), f(a), f(b))
    case iDef@MM_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MADD_EPI16 (k, a, b) =>
      _mm256_maskz_madd_epi16(f(k), f(a), f(b))
    case MM512_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm512_permutex2var_epi8(f(a), f(idx), f(b))
    case MM256_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm256_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM512_MULLOX_EPI64 (a, b) =>
      _mm512_mullox_epi64(f(a), f(b))
    case MM_MASKZ_CVTEPU8_EPI32 (k, a) =>
      _mm_maskz_cvtepu8_epi32(f(k), f(a))
    case MM_MASK_RANGE_SS (src, k, a, b, imm8) =>
      _mm_mask_range_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_CVTPD_PS (a) =>
      _mm512_cvtpd_ps(f(a))
    case MM512_MASKZ_ABS_EPI8 (k, a) =>
      _mm512_maskz_abs_epi8(f(k), f(a))
    case MM512_MASK_CVTUSEPI32_EPI8 (src, k, a) =>
      _mm512_mask_cvtusepi32_epi8(f(src), f(k), f(a))
    case MM_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm256_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_INSERTF32X4 (k, a, b, imm8) =>
      _mm512_maskz_insertf32x4(f(k), f(a), f(b), f(imm8))
    case MM512_CVTSEPI64_EPI16 (a) =>
      _mm512_cvtsepi64_epi16(f(a))
    case MM_MASKZ_MAX_SD (k, a, b) =>
      _mm_maskz_max_sd(f(k), f(a), f(b))
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_PERMUTE_PS (src, k, a, imm8) =>
      _mm512_mask_permute_ps(f(src), f(k), f(a), f(imm8))
    case MM512_SRL_EPI16 (a, count) =>
      _mm512_srl_epi16(f(a), f(count))
    case MM256_MASKZ_MULLO_EPI16 (k, a, b) =>
      _mm256_maskz_mullo_epi16(f(k), f(a), f(b))
    case MM_PERMUTEX2VAR_EPI16 (a, idx, b) =>
      _mm_permutex2var_epi16(f(a), f(idx), f(b))
    case MM512_SHUFFLEHI_EPI16 (a, imm8) =>
      _mm512_shufflehi_epi16(f(a), f(imm8))
    case MM256_MASKZ_ADD_EPI8 (k, a, b) =>
      _mm256_maskz_add_epi8(f(k), f(a), f(b))
    case MM512_MASK_UNPACKHI_PD (src, k, a, b) =>
      _mm512_mask_unpackhi_pd(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CMP_EPI16_MASK (a, b, imm8) =>
      _mm512_cmp_epi16_mask(f(a), f(b), f(imm8))

    case Reflect(MM512_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RANGE_ROUND_PD (k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RANGE_ROUND_PD (f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCAST_I64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCAST_I64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ABS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ABS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADDS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADDS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TERNARYLOGIC_EPI32 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_TERNARYLOGIC_EPI32 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_PS (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_PS (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SET1_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SET1_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_ROUND_PS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_ROUND_PS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_STOREU_EPI8 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SLLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SLLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROL_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROL_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_TERNARYLOGIC_EPI64 (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_TERNARYLOGIC_EPI64 (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ADD_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADD_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF64X4_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF64X4_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AVG_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AVG_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS512_PS256 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS512_PS256 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_ROUND_SD (a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_ROUND_SD (f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MIN_ROUND_PS (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MIN_ROUND_PS (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTI32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTI32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PACKUS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PACKUS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT28_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT28_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SRLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SRLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRA_EPI32 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRA_EPI32 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROUNDSCALE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROUNDSCALE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_ROUND_SD (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_ROUND_SD (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPU32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPU32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHRS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHRS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT28_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT28_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ABS_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ABS_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI32 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI32 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULHRS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULHRS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTI32X4_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_BROADCAST_F32X2 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_BROADCAST_F32X2 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PACKUS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PACKUS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPI64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPI64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RANGE_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_RANGE_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_LZCNT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LZCNT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF64X4_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF64X4_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FPCLASS_PD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FPCLASS_PD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_EPI32 (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_EPI32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_ROUND_SS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_ROUND_SS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_PD (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI32 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TEST_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TEST_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_PS (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_PS (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEXVAR_EPI16 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEXVAR_EPI16 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_EPI64 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_I64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRA_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRA_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTI64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTI64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_ROUND_SS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MAX_ROUND_SS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MUL_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MUL_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI64 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI64 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSD_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSD_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_EPI8 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPNEQ_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPNEQ_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF32X8_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF32X8_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROR_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROR_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_GETEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRAV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRAV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLOX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLOX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ABS_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ABS_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTUSEPI32_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI32_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTF32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTF32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRL_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRL_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI16 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLEHI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLEHI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADD_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADD_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512014 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_FMSUBADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_loadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_BROADCASTD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastd_epi32(${quote(a)})")
    case iDef@MM256_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_load_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_RCP28_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp28_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMSUBADD_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_RANGE_ROUND_PD(k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_range_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_SUBS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_BROADCAST_I64X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcast_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtusepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_ABS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_abs_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_ADDS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_adds_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_OR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_or_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTTPS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttps_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPGE_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SHUFFLE_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shuffle_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_SUBS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MOV_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADD_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtsepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SHUFFLE_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_TERNARYLOGIC_EPI32(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_ternarylogic_epi32(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_UNPACKLO_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEX2VAR_PS(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex2var_ps(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SET1_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_set1_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTEPU64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MAX_ROUND_PS(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_round_ps(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_storeu_epi8((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_SLLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sllv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_ROUNDSCALE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_roundscale_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPGE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ROL_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rol_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MULLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_TERNARYLOGIC_EPI64(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_ternarylogic_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_ADD_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_add_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SLL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sll_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM512_CVTEPI16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi16_epi64(${quote(a)})")
    case iDef@MM_MASKZ_SRLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srlv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_EXTRACTF64X4_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extractf64x4_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_AND_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_AVG_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_avg_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SRL_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srl_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_SRA_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sra_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_CASTPS512_PS256(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps512_ps256(${quote(a)})")
    case iDef@MM512_MASK_CVTPD_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_GETMANT_ROUND_SD(a, b, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getmant_round_sd(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MULLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FNMSUB_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_MIN_ROUND_PS(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_min_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASK_CVTPH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SET1_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_set1_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_INSERTI32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_inserti32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_SRAV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srav_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_SQRT_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sqrt_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FNMSUB_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMADDSUB_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_CVTTPD_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttpd_epu32(${quote(a)})")
    case iDef@MM256_MASK_FMADDSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_PACKUS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_packus_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_BROADCASTB_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_RSQRT28_ROUND_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rsqrt28_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_MOV_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_SRLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_srlv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_MAX_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SRA_EPI32(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sra_epi32(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_ADD_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_RCP14_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp14_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_GETEXP_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getexp_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ROUNDSCALE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_roundscale_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_ROUNDSCALE_ROUND_SD(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_roundscale_round_sd(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_CVTT_ROUNDPD_EPU32(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundpd_epu32(${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASKZ_CVTEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_ADD_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MULHRS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhrs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MAX_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RSQRT28_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt28_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_RCP14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ABS_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_abs_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_ADD_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPEQ_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_STORE_PS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_PERMUTEXVAR_EPI32(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_epi32(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_MULHRS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mulhrs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTPH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtph_ps(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_SI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_si32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_PERMUTE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_extracti32x4_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_SUBS_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_subs_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_BROADCAST_F32X2(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_broadcast_f32x2(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_PACKUS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_packus_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SLLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_slli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FNMSUB_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmsub_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_CVTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtpd_epu64(${quote(a)})")
    case iDef@MM512_CVTT_ROUNDPD_EPI64(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundpd_epi64(${quote(a)}, ${quote(sae)})")
    case iDef@MM256_RANGE_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_range_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ADD_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_LZCNT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_lzcnt_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MIN_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ADD_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOV_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXTRACTF64X4_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extractf64x4_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FPCLASS_PD_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fpclass_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SET1_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_UNDEFINED_EPI32() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_undefined_epi32()")
    case iDef@MM_ROUNDSCALE_ROUND_SS(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_roundscale_round_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_COMPRESSSTOREU_PD(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_compressstoreu_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_CMPGE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK2_PERMUTEX2VAR_EPI32(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_MASK_TEST_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_test_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEXVAR_PS(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_ps(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_PERMUTEXVAR_EPI16(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutexvar_epi16(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_I64SCATTER_EPI64(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i64scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_SHUFFLE_I64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_i64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_PERMUTE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permute_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_SRA_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sra_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_MOV_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_PERMUTEX_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_DIV_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_INSERTI64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_inserti64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MOV_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADD_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_ROUND_SS(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_round_ss(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASK_UNPACKLO_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MUL_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mul_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ALIGNR_EPI64(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_alignr_epi64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_CVT_ROUNDSD_SI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsd_si32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_epi8(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_CVTEPU16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_I64SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASKZ_SCALEF_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CMPNEQ_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpneq_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMSUBADD_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_EXTRACTF32X8_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extractf32x8_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_ROR_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_ror_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_GETEXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_getexp_ps(${quote(a)})")
    case iDef@MM512_MASKZ_SRAV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srav_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_MIN_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_STOREU_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_MADD_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_madd_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTEX2VAR_EPI8(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MULLOX_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mullox_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPU8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu8_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_RANGE_SS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_range_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTPD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtpd_ps(${quote(a)})")
    case iDef@MM512_MASKZ_ABS_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_abs_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTUSEPI32_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtusepi32_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_UNPACKLO_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_EXPANDLOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expandloadu_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_INSERTF32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_insertf32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsepi64_epi16(${quote(a)})")
    case iDef@MM_MASKZ_MAX_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtusepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASK_PERMUTE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_SRL_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srl_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_MULLO_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mullo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_PERMUTEX2VAR_EPI16(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_SHUFFLEHI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shufflehi_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_ADD_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_add_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_UNPACKHI_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpackhi_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_LOAD_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_load_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_CMP_EPI16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case _ => super.emitNode(sym, rhs)
  }
}
