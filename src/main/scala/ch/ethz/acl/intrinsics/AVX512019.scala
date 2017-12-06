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

    
trait AVX512019 extends IntrinsicsBase {
  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_BROADCAST_I64X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_CMP_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 64-bit elements, and store the low 16 bytes (2 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASK_ALIGNR_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k" using zeromask "k1" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_FPCLASS_PD_MASK(k1: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_BLEND_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 32-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_MASK_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPU64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * src: __m128, k: __mmask8, a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU64_PD(a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM256_MASKZ_CVTPS_EPI64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).  RM.
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MUL_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_AND_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTPS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SLL_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRAI_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI64_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
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
   * src: __m512i, k: __mmask32, a: __m512i, count: __m512i
   */
  case class MM512_MASK_SRLV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 16-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTUSEPI16_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
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
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPU32_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_REDUCE_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CVTEPI64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_LZCNT_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_PS(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "a" when the corresponding mask
   * bit is not set).
   * a: __m128d, k: __mmask8, idx: __m128i, b: __m128d
   */
  case class MM_MASK_PERMUTEX2VAR_PD(a: Exp[__m128d], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TESTN_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
  case class MM256_MASKZ_LOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI32(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 2 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_CMP_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADD_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed 32-bit integers in "dst" with the repeated 4 element sequence.
   * d: int, c: int, b: int, a: int
   */
  case class MM512_SET4_EPI32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRA_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF64X2_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k" using zeromask "k1" (the element is zeroed out when mask
   * bit 0 is not set).
   * k1: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_CMP_SD_MASK(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTUSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set). This intrinsic
   * essentially calculates "±(2^k)*|x.significand|", where "k" depends on the
   * interval range defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * k: __mmask8, a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_MASKZ_GETMANT_PD(k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_EXTRACTI32X4_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CVTTPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, idx: __m512i, b: __m512d
   */
  case class MM512_MASKZ_PERMUTEX2VAR_PD(k: Exp[Int], a: Exp[__m512d], idx: Exp[__m512i], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active double-precision (64-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_COMPRESS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m256i, a: __m256i
   */
  case class MM256_PERMUTEXVAR_EPI32(idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_BROADCAST_I32X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMADDSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst.
   * a: __m128i
   */
  case class MM512_BROADCAST_I32X2(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRA_EPI64(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m512i, idx: __m512i, k: __mmask32, b: __m512i
   */
  case class MM512_MASK2_PERMUTEX2VAR_EPI16(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMSUBADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKLO_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m256i
   */
  case class MM512_MASK_CVTPH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ROLV_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch single-precision (32-bit) floating-point elements with intent to
   * write into memory using 64-bit indices. Elements are prefetched into cache
   * level "hint", where "hint" is 0 or 1. 32-bit elements are stored at addresses
   * starting at "base_addr" and offset by each 64-bit element in "vindex" (each
   * index is scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m512i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_PREFETCH_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "idx" when
   * the corresponding mask bit is not set).
   * a: __m256d, idx: __m256i, k: __mmask8, b: __m256d
   */
  case class MM256_MASK2_PERMUTEX2VAR_PD(a: Exp[__m256d], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU64_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SLLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_DIV_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst". Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512d, sae: int
   */
  case class MM512_CVTT_ROUNDPD_EPU64(a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using writemask
   * "k" (the element is copied from "src" when mask bit 0 is not set), and copy
   * the upper 3 packed elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SQRT_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper element
   * from "a" to the upper element of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_MUL_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTSEPI64_EPI8(a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst".
   * a: __m256i, imm8: const int
   */
  case class MM256_ROL_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_MASK_CMP_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_CMP_EPI16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m512i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_COMPRESS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Casts vector of type __m256d to type __m512d; the upper 256 bits of the result
   * are zeroed. This intrinsic is only used for compilation and does not generate
   * any instructions, thus it has zero latency.
   * a: __m256d
   */
  case class MM512_ZEXTPD256_PD512(a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_MOV_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst".
   * a: __m256
   */
  case class MM512_CVTPS_PD(a: Exp[__m256]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RCP14_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_U32(a: Exp[__m128]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MIN_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_OR_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPI32_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower single-precision
   * (32-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper 3 packed elements from "a" to the upper elements
   * of "dst". The maximum relative error for this approximation is less than
   * 2^-28.
   * a: __m128, b: __m128
   */
  case class MM_RSQRT28_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_EXPAND_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * a: __m512
   */
  case class MM512_RCP28_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather 64-bit integers from memory using 64-bit indices. 64-bit elements are
   * loaded from addresses starting at "base_addr" and offset by each 64-bit
   * element in "vindex" (each index is scaled by the factor in "scale"). Gathered
   * elements are merged into "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). "scale" should be 1, 2, 4
   * or 8.
   * src: __m256i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM256_MMASK_I64GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", subtract the lower element in "c" from the negated intermediate
   * result, store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst" using writemask "k" (elements
   * are copied from "c" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPU8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPI32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 16-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_MOV_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_SUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" using the
   * control in "imm8", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, imm8: const int
   */
  case class MM_MASK_PERMUTE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SRAI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI32_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
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
   * 	[getmant_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASK_GETMANT_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADD_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FNMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using zeromask "k"
   * (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MIN_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 32-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: int
   */
  case class MM512_MASKZ_SET1_EPI32(k: Exp[Int], a: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTPD_PS(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m128, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, idx: __m256i, a: __m256
   */
  case class MM256_MASKZ_PERMUTEXVAR_PS(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" within 256-bit lanes using the control in
   * "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, imm8: const int
   */
  case class MM512_MASK_PERMUTEX_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADD_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMSUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst".
   * idx: __m512i, a: __m512d
   */
  case class MM512_PERMUTEXVAR_PD(idx: Exp[__m512i], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m128i, a: __m128d, scale: const int, base_addrOffset: int
   */
  case class MM_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m128i
   */
  case class MM512_MASK_CVTEPI8_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPU32_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m512i, b: __m512i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM512_MASK_CMP_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store the lower single-precision (32-bit) floating-point element from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: float*, k: __mmask8, a: __m128, mem_addrOffset: int
   */
  case class MM_MASK_STORE_SS[A[_], U:Integral](mem_addr: Exp[A[Float]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI8_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_SCALEF_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI64_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst".
   * a: __m256i, imm8: unsigned int
   */
  case class MM256_SRAI_EPI64(a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTPD_EPI32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower double-precision (64-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128d, imm8: int
   */
  case class MM_FPCLASS_SD_MASK(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRL_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_RCP28_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI64(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_OR_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 64-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 32 bytes (8 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, count: const int
   */
  case class MM256_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_PD(a: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_EXPAND_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "b" to a
   * single-precision (32-bit) floating-point element, store the result in the
   * lower element of "dst" using zeromask "k" (the element is zeroed out when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst".
   * k: __mmask8, a: __m128, b: __m128d
   */
  case class MM_MASKZ_CVTSD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUBADD_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI64_PS(a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASK_CMP_PD_MASK(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_MASKZ_FNMSUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m128, imm8: int
   */
  case class MM512_MASK_INSERTF32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_LZCNT_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MADDUBS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CONFLICT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m512i, a: __m512d, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst".
   * a: __m512, b: __m512
   */
  case class MM512_UNPACKLO_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 32-bit integers from "a" into memory using 32-bit indices. 32-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 32-bit element in "vindex" (each index is scaled by the factor in "scale").
   * "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256i, scale: const int, base_addrOffset: int
   */
  case class MM256_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of the lower double-precision (64-bit) floating-point
   * element in "b", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SQRT_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASK_SRAV_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ANDNOT_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_PACKUS_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask64, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_CMP_EPU8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASK_FIXUPIMM_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave double-precision (64-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_UNPACKLO_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the 32-bit integer "b" to a single-precision (32-bit) floating-point
   * element, store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: int
   */
  case class MM_CVTI32_SS(a: Exp[__m128], b: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
  case class MM_MASKZ_LOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SLLV_EPI64(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256i, imm8: int
   */
  case class MM256_MASK_FIXUPIMM_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_U32(a: Exp[__m128d]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_DIV_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 32-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_MOV_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGE_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MADD_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_mask_cvtepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_unpacklo_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI8(a, b)
  }
            
  def _mm512_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_broadcast_i64x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I64X4(src, k, a)
  }
            
  def _mm256_maskz_min_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPU8(k, a, b)
  }
            
  def _mm_maskz_mullo_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI16(k, a, b)
  }
            
  def _mm_cmp_epu64_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPU64_MASK(a, b, imm8)
  }
            
  def _mm512_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm_mask_alignr_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI64(src, k, a, b, count)
  }
            
  def _mm_mask_cmpneq_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_mask_fpclass_pd_mask(k1: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_FPCLASS_PD_MASK(k1, a, imm8)
  }
            
  def _mm_mask_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_blend_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm256_mask_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_max_epu64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPU64(a, b)
  }
            
  def _mm_mask_getmant_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_PS(src, k, a, interv, sc)
  }
            
  def _mm_cvtepu64_pd(a: Exp[__m128i]): Exp[__m128d] = {
    MM_CVTEPU64_PD(a)
  }
            
  def _mm256_maskz_cvtps_epi64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTPS_EPI64(k, a)
  }
            
  def _mm_mask_mul_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MUL_PS(src, k, a, b)
  }
            
  def _mm_maskz_and_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_AND_PD(k, a, b)
  }
            
  def _mm512_mask_cvtps_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256]): Exp[__m512d] = {
    MM512_MASK_CVTPS_PD(src, k, a)
  }
            
  def _mm512_maskz_sll_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SLL_EPI32(k, a, count)
  }
            
  def _mm512_mask_expandloadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_srai_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRAI_EPI64(src, k, a, imm8)
  }
            
  def _mm_mask_cmpge_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI16_MASK(k1, a, b)
  }
            
  def _mm256_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtusepi64_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI64_EPI8(k, a)
  }
            
  def _mm512_mask_srlv_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SRLV_EPI16(src, k, a, count)
  }
            
  def _mm_maskz_cvtusepi16_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTUSEPI16_EPI8(k, a)
  }
            
  def _mm512_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm256_reduce_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_REDUCE_PD(a, imm8)
  }
            
  def _mm512_mask_cvtepi64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i]): Exp[__m512d] = {
    MM512_MASK_CVTEPI64_PD(src, k, a)
  }
            
  def _mm_lzcnt_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_LZCNT_EPI32(a)
  }
            
  def _mm512_maskz_cvt_roundpd_ps(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDPD_PS(k, a, rounding)
  }
            
  def _mm_mask_permutex2var_pd(a: Exp[__m128d], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_PERMUTEX2VAR_PD(a, k, idx, b)
  }
            
  def _mm512_testn_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_TESTN_EPI8_MASK(a, b)
  }
            
  def _mm256_maskz_loadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_permutex2var_epi32(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI32(a, idx, b)
  }
            
  def _mm_mask_cvtepu8_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI64(src, k, a)
  }
            
  def _mm512_cmp_epi64_mask(a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_CMP_EPI64_MASK(a, b, imm8)
  }
            
  def _mm_maskz_add_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADD_EPI16(k, a, b)
  }
            
  def _mm512_set4_epi32(d: Exp[Int], c: Exp[Int], b: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_SET4_EPI32(d, c, b, a)
  }
            
  def _mm256_mask_sra_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRA_EPI16(src, k, a, count)
  }
            
  def _mm512_maskz_extractf64x2_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m128d] = {
    MM512_MASKZ_EXTRACTF64X2_PD(k, a, imm8)
  }
            
  def _mm_mask_cmp_sd_mask(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_SD_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_cvtusepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_getmant_pd(k: Exp[Int], a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_GETMANT_PD(k, a, interv, sc)
  }
            
  def _mm256_maskz_extracti32x4_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_cvttps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm256_maskz_min_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI32(k, a, b)
  }
            
  def _mm512_maskz_permutex2var_pd(k: Exp[Int], a: Exp[__m512d], idx: Exp[__m512i], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b)
  }
            
  def _mm_mask_expandloadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask3_fmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_compress_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COMPRESS_PD(src, k, a)
  }
            
  def _mm256_permutexvar_epi32(idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEXVAR_EPI32(idx, a)
  }
            
  def _mm512_mask_broadcast_i32x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm_mask3_fmaddsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm512_broadcast_i32x2(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_BROADCAST_I32X2(a)
  }
            
  def _mm512_sra_epi64(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRA_EPI64(a, count)
  }
            
  def _mm512_mask2_permutex2var_epi16(a: Exp[__m512i], idx: Exp[__m512i], k: Exp[Int], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b)
  }
            
  def _mm512_fmsubadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMSUBADD_PS(a, b, c)
  }
            
  def _mm_mask_unpacklo_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_cvtph_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m256i]): Exp[__m512] = {
    MM512_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm256_maskz_rolv_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ROLV_EPI64(k, a, b)
  }
            
  def _mm512_prefetch_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m512i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_PREFETCH_I64SCATTER_PS(base_addr, vindex, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask2_permutex2var_pd(a: Exp[__m256d], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK2_PERMUTEX2VAR_PD(a, idx, k, b)
  }
            
  def _mm512_mask_cvt_roundepu64_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_CVT_ROUNDEPU64_PD(src, k, a, rounding)
  }
            
  def _mm_mask_sllv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SLLV_EPI64(src, k, a, count)
  }
            
  def _mm512_maskz_expandloadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_div_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_DIV_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm512_cvtt_roundpd_epu64(a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPD_EPU64(a, sae)
  }
            
  def _mm256_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm_mask_sqrt_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SQRT_SS(src, k, a, b)
  }
            
  def _mm_maskz_mul_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_MUL_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm256_maskz_cvtepu32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU32_EPI64(k, a)
  }
            
  def _mm512_cvtsepi64_epi8(a: Exp[__m512i]): Exp[__m128i] = {
    MM512_CVTSEPI64_EPI8(a)
  }
            
  def _mm256_rol_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_ROL_EPI32(a, imm8)
  }
            
  def _mm_mask_cmp_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPU64_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cmp_epi16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPI16_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_compress_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_COMPRESS_EPI32(src, k, a)
  }
            
  def _mm512_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_zextpd256_pd512(a: Exp[__m256d]): Exp[__m512d] = {
    MM512_ZEXTPD256_PD512(a)
  }
            
  def _mm256_maskz_mov_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MOV_EPI32(k, a)
  }
            
  def _mm512_cvtps_pd(a: Exp[__m256]): Exp[__m512d] = {
    MM512_CVTPS_PD(a)
  }
            
  def _mm512_maskz_min_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPI32(k, a, b)
  }
            
  def _mm256_mask_cvtepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTEPI64_EPI16(src, k, a)
  }
            
  def _mm512_maskz_rcp14_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RCP14_PS(k, a)
  }
            
  def _mm_cvttss_u32(a: Exp[__m128]): Exp[UInt] = {
    MM_CVTTSS_U32(a)
  }
            
  def _mm_maskz_min_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MIN_EPI64(k, a, b)
  }
            
  def _mm_mask_or_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_OR_PS(src, k, a, b)
  }
            
  def _mm512_cvtepi32_pd(a: Exp[__m256i]): Exp[__m512d] = {
    MM512_CVTEPI32_PD(a)
  }
            
  def _mm_rsqrt28_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RSQRT28_SS(a, b)
  }
            
  def _mm512_maskz_expand_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_EXPAND_PD(k, a)
  }
            
  def _mm512_rcp28_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP28_PS(a)
  }
            
  def _mm512_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm256_mmask_i64gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(base_addr)(MM256_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask3_fnmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm256_mask_max_epu8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPU8(src, k, a, b)
  }
            
  def _mm512_maskz_cvt_roundpd_epi32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPI32(k, a, rounding)
  }
            
  def _mm_maskz_mov_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MOV_EPI16(k, a)
  }
            
  def _mm512_maskz_sub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_SUB_PS(k, a, b)
  }
            
  def _mm_mask_permute_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_PERMUTE_PD(src, k, a, imm8)
  }
            
  def _mm512_srai_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SRAI_EPI16(a, imm8)
  }
            
  def _mm512_cvtepi32_ps(a: Exp[__m512i]): Exp[__m512] = {
    MM512_CVTEPI32_PS(a)
  }
            
  def _mm_mask_getmant_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASK_GETMANT_SS(src, k, a, b, interv, sc)
  }
            
  def _mm_mask_add_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADD_EPI8(src, k, a, b)
  }
            
  def _mm_mask3_fnmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_maskz_min_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MIN_SD(k, a, b)
  }
            
  def _mm512_maskz_set1_epi32(k: Exp[Int], a: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI32(k, a)
  }
            
  def _mm256_maskz_cvtpd_ps(k: Exp[Int], a: Exp[__m256d]): Exp[__m128] = {
    MM256_MASKZ_CVTPD_PS(k, a)
  }
            
  def _mm_cmp_epu16_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPU16_MASK(a, b, imm8)
  }
            
  def _mm_mask_storeu_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_permutexvar_ps(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_PERMUTEXVAR_PS(k, idx, a)
  }
            
  def _mm512_mask_permutex_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX_EPI64(src, k, a, imm8)
  }
            
  def _mm512_maskz_add_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADD_EPI32(k, a, b)
  }
            
  def _mm_maskz_fmsub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMSUB_SS(k, a, b, c)
  }
            
  def _mm512_permutexvar_pd(idx: Exp[__m512i], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_PERMUTEXVAR_PD(idx, a)
  }
            
  def _mm256_mask_cvtpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTPD_EPI32(src, k, a)
  }
            
  def _mm_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvtepi8_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_CVTEPI8_EPI32(src, k, a)
  }
            
  def _mm256_cmpgt_epu32_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPU32_MASK(a, b)
  }
            
  def _mm512_mask_cmp_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Int] = {
    MM512_MASK_CMP_EPU64_MASK(k1, a, b, imm8)
  }
            
  def _mm_mask_store_ss[A[_], U:Integral](mem_addr: Exp[A[Float]], k: Exp[Int], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_SS(mem_addr, k, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtepi8_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI8_EPI16(src, k, a)
  }
            
  def _mm256_maskz_scalef_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SCALEF_PD(k, a, b)
  }
            
  def _mm_mask_cvtepi64_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPI64_PS(src, k, a)
  }
            
  def _mm256_srai_epi64(a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_SRAI_EPI64(a, imm8)
  }
            
  def _mm_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm_fpclass_sd_mask(a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_SD_MASK(a, imm8)
  }
            
  def _mm_maskz_srl_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRL_EPI32(k, a, count)
  }
            
  def _mm512_mask_rcp28_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_RCP28_ROUND_PD(src, k, a, rounding)
  }
            
  def _mm_permutex2var_epi64(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI64(a, idx, b)
  }
            
  def _mm512_maskz_or_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_OR_EPI32(k, a, b)
  }
            
  def _mm256_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], count: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm_maskz_sll_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI32(k, a, count)
  }
            
  def _mm512_cvtepi64_pd(a: Exp[__m512i]): Exp[__m512d] = {
    MM512_CVTEPI64_PD(a)
  }
            
  def _mm256_mask_expand_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm_maskz_cvtsd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128d]): Exp[__m128] = {
    MM_MASKZ_CVTSD_SS(k, a, b)
  }
            
  def _mm_mask_fmsubadd_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm_cvtepi64_ps(a: Exp[__m128i]): Exp[__m128] = {
    MM_CVTEPI64_PS(a)
  }
            
  def _mm_mask_cmp_pd_mask(k1: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_PD_MASK(k1, a, b, imm8)
  }
            
  def _mm256_maskz_min_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI8(k, a, b)
  }
            
  def _mm512_mask_test_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_TEST_EPI8_MASK(k1, a, b)
  }
            
  def _mm256_maskz_fnmsub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_FNMSUB_PD(k, a, b, c)
  }
            
  def _mm512_mask_insertf32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m128], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_INSERTF32X4(src, k, a, b, imm8)
  }
            
  def _mm_maskz_lzcnt_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_LZCNT_EPI32(k, a)
  }
            
  def _mm256_cmplt_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPI64_MASK(a, b)
  }
            
  def _mm512_maskz_max_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm256_mask_maddubs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MADDUBS_EPI16(src, k, a, b)
  }
            
  def _mm_mask_cmplt_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPI64_MASK(k1, a, b)
  }
            
  def _mm256_mask_conflict_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_CONFLICT_EPI64(src, k, a)
  }
            
  def _mm512_mask_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m512i], a: Exp[__m512d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_unpacklo_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_UNPACKLO_PS(a, b)
  }
            
  def _mm256_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_sqrt_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SQRT_SD(k, a, b)
  }
            
  def _mm_mask_srav_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm256_mask_andnot_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ANDNOT_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_packus_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PACKUS_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_cmp_epu8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[Long] = {
    MM512_MASK_CMP_EPU8_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_fixupimm_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FIXUPIMM_ROUND_PS(a, k, b, c, imm8, rounding)
  }
            
  def _mm256_mask_unpacklo_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_UNPACKLO_PD(src, k, a, b)
  }
            
  def _mm_min_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPI64(a, b)
  }
            
  def _mm_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm_cvti32_ss(a: Exp[__m128], b: Exp[Int]): Exp[__m128] = {
    MM_CVTI32_SS(a, b)
  }
            
  def _mm_maskz_xor_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm_maskz_loadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_storeu_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_sllv_epi64(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SLLV_EPI64(a, count)
  }
            
  def _mm256_mask_fixupimm_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm_cvtsd_u32(a: Exp[__m128d]): Exp[UInt] = {
    MM_CVTSD_U32(a)
  }
            
  def _mm256_maskz_div_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_DIV_PD(k, a, b)
  }
            
  def _mm_maskz_mov_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MOV_EPI32(k, a)
  }
            
  def _mm256_cmpge_epu8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGE_EPU8_MASK(a, b)
  }
            
  def _mm512_mask_madd_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MADD_EPI16(src, k, a, b)
  }
            
  def _mm256_mask_expandloadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case iDef@MM512_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_UNPACKLO_EPI8 (a, b) =>
      _mm512_unpacklo_epi8(f(a), f(b))
    case MM512_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_BROADCAST_I64X4 (src, k, a) =>
      _mm512_mask_broadcast_i64x4(f(src), f(k), f(a))
    case MM256_MASKZ_MIN_EPU8 (k, a, b) =>
      _mm256_maskz_min_epu8(f(k), f(a), f(b))
    case MM_MASKZ_MULLO_EPI16 (k, a, b) =>
      _mm_maskz_mullo_epi16(f(k), f(a), f(b))
    case MM_CMP_EPU64_MASK (a, b, imm8) =>
      _mm_cmp_epu64_mask(f(a), f(b), f(imm8))
    case MM512_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm512_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM_MASK_ALIGNR_EPI64 (src, k, a, b, count) =>
      _mm_mask_alignr_epi64(f(src), f(k), f(a), f(b), f(count))
    case MM_MASK_CMPNEQ_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epi32_mask(f(k1), f(a), f(b))
    case MM256_MASK_FPCLASS_PD_MASK (k1, a, imm8) =>
      _mm256_mask_fpclass_pd_mask(f(k1), f(a), f(imm8))
    case iDef@MM_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_BLEND_PS (k, a, b) =>
      _mm256_mask_blend_ps(f(k), f(a), f(b))
    case iDef@MM256_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm256_mask_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MAX_EPU64 (a, b) =>
      _mm512_max_epu64(f(a), f(b))
    case MM_MASK_GETMANT_PS (src, k, a, interv, sc) =>
      _mm_mask_getmant_ps(f(src), f(k), f(a), f(interv), f(sc))
    case MM_CVTEPU64_PD (a) =>
      _mm_cvtepu64_pd(f(a))
    case MM256_MASKZ_CVTPS_EPI64 (k, a) =>
      _mm256_maskz_cvtps_epi64(f(k), f(a))
    case MM_MASK_MUL_PS (src, k, a, b) =>
      _mm_mask_mul_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_AND_PD (k, a, b) =>
      _mm_maskz_and_pd(f(k), f(a), f(b))
    case MM512_MASK_CVTPS_PD (src, k, a) =>
      _mm512_mask_cvtps_pd(f(src), f(k), f(a))
    case MM512_MASKZ_SLL_EPI32 (k, a, count) =>
      _mm512_maskz_sll_epi32(f(k), f(a), f(count))
    case iDef@MM512_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SRAI_EPI64 (src, k, a, imm8) =>
      _mm512_mask_srai_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASK_CMPGE_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi16_mask(f(k1), f(a), f(b))
    case iDef@MM256_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTUSEPI64_EPI8 (k, a) =>
      _mm_maskz_cvtusepi64_epi8(f(k), f(a))
    case MM512_MASK_SRLV_EPI16 (src, k, a, count) =>
      _mm512_mask_srlv_epi16(f(src), f(k), f(a), f(count))
    case MM_MASKZ_CVTUSEPI16_EPI8 (k, a) =>
      _mm_maskz_cvtusepi16_epi8(f(k), f(a))
    case MM512_MASKZ_CVTEPU32_PD (k, a) =>
      _mm512_maskz_cvtepu32_pd(f(k), f(a))
    case MM256_REDUCE_PD (a, imm8) =>
      _mm256_reduce_pd(f(a), f(imm8))
    case MM512_MASK_CVTEPI64_PD (src, k, a) =>
      _mm512_mask_cvtepi64_pd(f(src), f(k), f(a))
    case MM_LZCNT_EPI32 (a) =>
      _mm_lzcnt_epi32(f(a))
    case MM512_MASKZ_CVT_ROUNDPD_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_ps(f(k), f(a), f(rounding))
    case MM_MASK_PERMUTEX2VAR_PD (a, k, idx, b) =>
      _mm_mask_permutex2var_pd(f(a), f(k), f(idx), f(b))
    case MM512_TESTN_EPI8_MASK (a, b) =>
      _mm512_testn_epi8_mask(f(a), f(b))
    case iDef@MM256_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_loadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_PERMUTEX2VAR_EPI32 (a, idx, b) =>
      _mm_permutex2var_epi32(f(a), f(idx), f(b))
    case MM_MASK_CVTEPU8_EPI64 (src, k, a) =>
      _mm_mask_cvtepu8_epi64(f(src), f(k), f(a))
    case MM512_CMP_EPI64_MASK (a, b, imm8) =>
      _mm512_cmp_epi64_mask(f(a), f(b), f(imm8))
    case MM_MASKZ_ADD_EPI16 (k, a, b) =>
      _mm_maskz_add_epi16(f(k), f(a), f(b))
    case MM512_SET4_EPI32 (d, c, b, a) =>
      _mm512_set4_epi32(f(d), f(c), f(b), f(a))
    case MM256_MASK_SRA_EPI16 (src, k, a, count) =>
      _mm256_mask_sra_epi16(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_EXTRACTF64X2_PD (k, a, imm8) =>
      _mm512_maskz_extractf64x2_pd(f(k), f(a), f(imm8))
    case MM_MASK_CMP_SD_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_sd_mask(f(k1), f(a), f(b), f(imm8))
    case iDef@MM_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtusepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_GETMANT_PD (k, a, interv, sc) =>
      _mm256_maskz_getmant_pd(f(k), f(a), f(interv), f(sc))
    case MM256_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8) =>
      _mm256_maskz_extracti32x4_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm512_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_MIN_EPI32 (k, a, b) =>
      _mm256_maskz_min_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b) =>
      _mm512_maskz_permutex2var_pd(f(k), f(a), f(idx), f(b))
    case iDef@MM_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK3_FMSUB_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fmsub_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_COMPRESS_PD (src, k, a) =>
      _mm512_mask_compress_pd(f(src), f(k), f(a))
    case MM256_PERMUTEXVAR_EPI32 (idx, a) =>
      _mm256_permutexvar_epi32(f(idx), f(a))
    case MM512_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm512_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM512_BROADCAST_I32X2 (a) =>
      _mm512_broadcast_i32x2(f(a))
    case MM512_SRA_EPI64 (a, count) =>
      _mm512_sra_epi64(f(a), f(count))
    case MM512_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b) =>
      _mm512_mask2_permutex2var_epi16(f(a), f(idx), f(k), f(b))
    case MM512_FMSUBADD_PS (a, b, c) =>
      _mm512_fmsubadd_ps(f(a), f(b), f(c))
    case MM_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASK_CVTPH_PS (src, k, a) =>
      _mm512_mask_cvtph_ps(f(src), f(k), f(a))
    case MM256_MASKZ_ROLV_EPI64 (k, a, b) =>
      _mm256_maskz_rolv_epi64(f(k), f(a), f(b))
    case iDef@MM512_PREFETCH_I64SCATTER_PS (base_addr, vindex, scale, hint, base_addrOffset) =>
      _mm512_prefetch_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK2_PERMUTEX2VAR_PD (a, idx, k, b) =>
      _mm256_mask2_permutex2var_pd(f(a), f(idx), f(k), f(b))
    case MM512_MASK_CVT_ROUNDEPU64_PD (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu64_pd(f(src), f(k), f(a), f(rounding))
    case MM_MASK_SLLV_EPI64 (src, k, a, count) =>
      _mm_mask_sllv_epi64(f(src), f(k), f(a), f(count))
    case iDef@MM512_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_expandloadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_DIV_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_div_round_sd(f(k), f(a), f(b), f(rounding))
    case MM512_CVTT_ROUNDPD_EPU64 (a, sae) =>
      _mm512_cvtt_roundpd_epu64(f(a), f(sae))
    case MM256_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm256_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM_MASK_SQRT_SS (src, k, a, b) =>
      _mm_mask_sqrt_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MUL_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_mul_round_sd(f(k), f(a), f(b), f(rounding))
    case MM256_MASKZ_CVTEPU32_EPI64 (k, a) =>
      _mm256_maskz_cvtepu32_epi64(f(k), f(a))
    case MM512_CVTSEPI64_EPI8 (a) =>
      _mm512_cvtsepi64_epi8(f(a))
    case MM256_ROL_EPI32 (a, imm8) =>
      _mm256_rol_epi32(f(a), f(imm8))
    case MM_MASK_CMP_EPU64_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epu64_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CMP_EPI16_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epi16_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_COMPRESS_EPI32 (src, k, a) =>
      _mm512_mask_compress_epi32(f(src), f(k), f(a))
    case iDef@MM512_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ZEXTPD256_PD512 (a) =>
      _mm512_zextpd256_pd512(f(a))
    case MM256_MASKZ_MOV_EPI32 (k, a) =>
      _mm256_maskz_mov_epi32(f(k), f(a))
    case MM512_CVTPS_PD (a) =>
      _mm512_cvtps_pd(f(a))
    case MM512_MASKZ_MIN_EPI32 (k, a, b) =>
      _mm512_maskz_min_epi32(f(k), f(a), f(b))
    case MM256_MASK_CVTEPI64_EPI16 (src, k, a) =>
      _mm256_mask_cvtepi64_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_RCP14_PS (k, a) =>
      _mm512_maskz_rcp14_ps(f(k), f(a))
    case MM_CVTTSS_U32 (a) =>
      _mm_cvttss_u32(f(a))
    case MM_MASKZ_MIN_EPI64 (k, a, b) =>
      _mm_maskz_min_epi64(f(k), f(a), f(b))
    case MM_MASK_OR_PS (src, k, a, b) =>
      _mm_mask_or_ps(f(src), f(k), f(a), f(b))
    case MM512_CVTEPI32_PD (a) =>
      _mm512_cvtepi32_pd(f(a))
    case MM_RSQRT28_SS (a, b) =>
      _mm_rsqrt28_ss(f(a), f(b))
    case MM512_MASKZ_EXPAND_PD (k, a) =>
      _mm512_maskz_expand_pd(f(k), f(a))
    case MM512_RCP28_PS (a) =>
      _mm512_rcp28_ps(f(a))
    case MM512_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm512_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case iDef@MM256_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm256_mmask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK3_FNMSUB_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fnmsub_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM256_MASK_MAX_EPU8 (src, k, a, b) =>
      _mm256_mask_max_epu8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPD_EPI32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epi32(f(k), f(a), f(rounding))
    case MM_MASKZ_MOV_EPI16 (k, a) =>
      _mm_maskz_mov_epi16(f(k), f(a))
    case MM512_MASKZ_SUB_PS (k, a, b) =>
      _mm512_maskz_sub_ps(f(k), f(a), f(b))
    case MM_MASK_PERMUTE_PD (src, k, a, imm8) =>
      _mm_mask_permute_pd(f(src), f(k), f(a), f(imm8))
    case MM512_SRAI_EPI16 (a, imm8) =>
      _mm512_srai_epi16(f(a), f(imm8))
    case MM512_CVTEPI32_PS (a) =>
      _mm512_cvtepi32_ps(f(a))
    case MM_MASK_GETMANT_SS (src, k, a, b, interv, sc) =>
      _mm_mask_getmant_ss(f(src), f(k), f(a), f(b), f(interv), f(sc))
    case MM_MASK_ADD_EPI8 (src, k, a, b) =>
      _mm_mask_add_epi8(f(src), f(k), f(a), f(b))
    case MM_MASK3_FNMSUB_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fnmsub_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASKZ_MIN_SD (k, a, b) =>
      _mm_maskz_min_sd(f(k), f(a), f(b))
    case MM512_MASKZ_SET1_EPI32 (k, a) =>
      _mm512_maskz_set1_epi32(f(k), f(a))
    case MM256_MASKZ_CVTPD_PS (k, a) =>
      _mm256_maskz_cvtpd_ps(f(k), f(a))
    case MM_CMP_EPU16_MASK (a, b, imm8) =>
      _mm_cmp_epu16_mask(f(a), f(b), f(imm8))
    case iDef@MM_MASK_STOREU_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_PERMUTEXVAR_PS (k, idx, a) =>
      _mm256_maskz_permutexvar_ps(f(k), f(idx), f(a))
    case MM512_MASK_PERMUTEX_EPI64 (src, k, a, imm8) =>
      _mm512_mask_permutex_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_ADD_EPI32 (k, a, b) =>
      _mm512_maskz_add_epi32(f(k), f(a), f(b))
    case MM_MASKZ_FMSUB_SS (k, a, b, c) =>
      _mm_maskz_fmsub_ss(f(k), f(a), f(b), f(c))
    case MM512_PERMUTEXVAR_PD (idx, a) =>
      _mm512_permutexvar_pd(f(idx), f(a))
    case MM256_MASK_CVTPD_EPI32 (src, k, a) =>
      _mm256_mask_cvtpd_epi32(f(src), f(k), f(a))
    case iDef@MM_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVTEPI8_EPI32 (src, k, a) =>
      _mm512_mask_cvtepi8_epi32(f(src), f(k), f(a))
    case MM256_CMPGT_EPU32_MASK (a, b) =>
      _mm256_cmpgt_epu32_mask(f(a), f(b))
    case MM512_MASK_CMP_EPU64_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epu64_mask(f(k1), f(a), f(b), f(imm8))
    case iDef@MM_MASK_STORE_SS (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_ss(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_MASK_CVTEPI8_EPI16 (src, k, a) =>
      _mm_mask_cvtepi8_epi16(f(src), f(k), f(a))
    case MM256_MASKZ_SCALEF_PD (k, a, b) =>
      _mm256_maskz_scalef_pd(f(k), f(a), f(b))
    case MM_MASK_CVTEPI64_PS (src, k, a) =>
      _mm_mask_cvtepi64_ps(f(src), f(k), f(a))
    case MM256_SRAI_EPI64 (a, imm8) =>
      _mm256_srai_epi64(f(a), f(imm8))
    case MM_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm_maskz_cvtpd_epi32(f(k), f(a))
    case MM_FPCLASS_SD_MASK (a, imm8) =>
      _mm_fpclass_sd_mask(f(a), f(imm8))
    case MM_MASKZ_SRL_EPI32 (k, a, count) =>
      _mm_maskz_srl_epi32(f(k), f(a), f(count))
    case MM512_MASK_RCP28_ROUND_PD (src, k, a, rounding) =>
      _mm512_mask_rcp28_round_pd(f(src), f(k), f(a), f(rounding))
    case MM_PERMUTEX2VAR_EPI64 (a, idx, b) =>
      _mm_permutex2var_epi64(f(a), f(idx), f(b))
    case MM512_MASKZ_OR_EPI32 (k, a, b) =>
      _mm512_maskz_or_epi32(f(k), f(a), f(b))
    case MM256_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm256_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case MM_MASKZ_SLL_EPI32 (k, a, count) =>
      _mm_maskz_sll_epi32(f(k), f(a), f(count))
    case MM512_CVTEPI64_PD (a) =>
      _mm512_cvtepi64_pd(f(a))
    case MM256_MASK_EXPAND_PS (src, k, a) =>
      _mm256_mask_expand_ps(f(src), f(k), f(a))
    case MM_MASKZ_CVTSD_SS (k, a, b) =>
      _mm_maskz_cvtsd_ss(f(k), f(a), f(b))
    case MM_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case MM_CVTEPI64_PS (a) =>
      _mm_cvtepi64_ps(f(a))
    case MM_MASK_CMP_PD_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_pd_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASKZ_MIN_EPI8 (k, a, b) =>
      _mm256_maskz_min_epi8(f(k), f(a), f(b))
    case MM512_MASK_TEST_EPI8_MASK (k1, a, b) =>
      _mm512_mask_test_epi8_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_FNMSUB_PD (k, a, b, c) =>
      _mm256_maskz_fnmsub_pd(f(k), f(a), f(b), f(c))
    case MM512_MASK_INSERTF32X4 (src, k, a, b, imm8) =>
      _mm512_mask_insertf32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_LZCNT_EPI32 (k, a) =>
      _mm_maskz_lzcnt_epi32(f(k), f(a))
    case MM256_CMPLT_EPI64_MASK (a, b) =>
      _mm256_cmplt_epi64_mask(f(a), f(b))
    case MM512_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm512_maskz_max_epu8(f(k), f(a), f(b))
    case MM256_MASK_MADDUBS_EPI16 (src, k, a, b) =>
      _mm256_mask_maddubs_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_CMPLT_EPI64_MASK (k1, a, b) =>
      _mm_mask_cmplt_epi64_mask(f(k1), f(a), f(b))
    case MM256_MASK_CONFLICT_EPI64 (src, k, a) =>
      _mm256_mask_conflict_epi64(f(src), f(k), f(a))
    case iDef@MM512_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_UNPACKLO_PS (a, b) =>
      _mm512_unpacklo_ps(f(a), f(b))
    case iDef@MM256_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SQRT_SD (k, a, b) =>
      _mm_maskz_sqrt_sd(f(k), f(a), f(b))
    case MM_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASK_ANDNOT_EPI64 (src, k, a, b) =>
      _mm256_mask_andnot_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_PACKUS_EPI32 (src, k, a, b) =>
      _mm512_mask_packus_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_CMP_EPU8_MASK (k1, a, b, imm8) =>
      _mm512_mask_cmp_epu8_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_FIXUPIMM_ROUND_PS (a, k, b, c, imm8, rounding) =>
      _mm512_mask_fixupimm_round_ps(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM256_MASK_UNPACKLO_PD (src, k, a, b) =>
      _mm256_mask_unpacklo_pd(f(src), f(k), f(a), f(b))
    case MM_MIN_EPI64 (a, b) =>
      _mm_min_epi64(f(a), f(b))
    case MM_MASKZ_RSQRT14_PD (k, a) =>
      _mm_maskz_rsqrt14_pd(f(k), f(a))
    case MM_CVTI32_SS (a, b) =>
      _mm_cvti32_ss(f(a), f(b))
    case MM_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm_maskz_xor_epi32(f(k), f(a), f(b))
    case iDef@MM_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_loadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SLLV_EPI64 (a, count) =>
      _mm512_sllv_epi64(f(a), f(count))
    case MM256_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm256_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM_CVTSD_U32 (a) =>
      _mm_cvtsd_u32(f(a))
    case MM256_MASKZ_DIV_PD (k, a, b) =>
      _mm256_maskz_div_pd(f(k), f(a), f(b))
    case MM_MASKZ_MOV_EPI32 (k, a) =>
      _mm_maskz_mov_epi32(f(k), f(a))
    case MM256_CMPGE_EPU8_MASK (a, b) =>
      _mm256_cmpge_epu8_mask(f(a), f(b))
    case MM512_MASK_MADD_EPI16 (src, k, a, b) =>
      _mm512_mask_madd_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)

    case Reflect(iDef@MM512_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I64X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I64X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPU64_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPU64_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI64 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI64 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FPCLASS_PD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FPCLASS_PD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_PS (src, k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_PS (f(src), f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MUL_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MUL_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AND_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AND_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRAI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRAI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI64_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI64_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTUSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTUSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LZCNT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_LZCNT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_PD (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_PD (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TESTN_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TESTN_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI32 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMP_EPI64_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_CMP_EPI64_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SET4_EPI32 (d, c, b, a), u, es) =>
      reflectMirrored(Reflect(MM512_SET4_EPI32 (f(d), f(c), f(b), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRA_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRA_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF64X2_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF64X2_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_SD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_SD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETMANT_PD (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETMANT_PD (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXTRACTI32X4_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_PD (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_PD (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_EPI32 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_EPI32 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_I32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_I32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRA_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRA_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2_PERMUTEX2VAR_EPI16 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2_PERMUTEX2VAR_EPI16 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROLV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROLV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PREFETCH_I64SCATTER_PS (base_addr, vindex, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PREFETCH_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_PD (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_PD (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU64_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU64_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SLLV_EPI64 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SLLV_EPI64 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPANDLOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTT_ROUNDPD_EPU64 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPD_EPU64 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SQRT_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SQRT_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTSEPI64_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTSEPI64_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROL_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROL_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPU64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPU64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPI16_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPI16_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ZEXTPD256_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_ZEXTPD256_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTPS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTPS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP14_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP14_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP28_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP28_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MMASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPI32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTE_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTE_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SRAI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETMANT_SS (src, k, a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETMANT_SS (f(src), f(k), f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MIN_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MIN_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTPD_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTPD_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPU16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPU16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_PS (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_PS (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_PD (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_PD (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I32SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPI8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPU64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPU64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_SS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_SS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SCALEF_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SCALEF_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI64_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SRAI_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SRAI_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_SD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_SD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_ROUND_PD (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_ROUND_PD (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI64 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_OR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_OR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSD_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSD_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_PD_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_PD_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_LZCNT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LZCNT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MADDUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MADDUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CONFLICT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CONFLICT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_PD (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I32SCATTER_EPI32 (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ANDNOT_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ANDNOT_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PACKUS_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKUS_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMP_EPU8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMP_EPU8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_ROUND_PS (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_ROUND_PS (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTI32_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTI32_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SLLV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SLLV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DIV_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DIV_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGE_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGE_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MADD_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MADD_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512019 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_UNPACKLO_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_BROADCAST_I64X4(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_i64x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MIN_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MULLO_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mullo_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_EPU64_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epu64_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MULLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ALIGNR_EPI64(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_alignr_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK_CMPNEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_FPCLASS_PD_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fpclass_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_I32SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM256_MASK_BLEND_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_i32scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MAX_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_GETMANT_PS(src, k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_CVTEPU64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu64_pd(${quote(a)})")
    case iDef@MM256_MASKZ_CVTPS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtps_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MUL_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mul_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_AND_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_and_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTPS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtps_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SLL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sll_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_SRAI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srai_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPGE_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_compressstoreu_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_CVTUSEPI64_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi64_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SRLV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srlv_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_CVTUSEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtusepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_REDUCE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTEPI64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_LZCNT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_lzcnt_epi32(${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPD_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_PERMUTEX2VAR_PD(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutex2var_pd(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_TESTN_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_testn_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_LOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_loadu_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_PERMUTEX2VAR_EPI32(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU8_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu8_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMP_EPI64_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmp_epi64_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_ADD_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SET4_EPI32(d, c, b, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_set4_epi32(${quote(d)}, ${quote(c)}, ${quote(b)}, ${quote(a)})")
    case iDef@MM256_MASK_SRA_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sra_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_EXTRACTF64X2_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf64x2_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMP_SD_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_sd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtusepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_GETMANT_PD(k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_getmant_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_extracti32x4_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MIN_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_PD(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_pd(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expandloadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK3_FMSUB_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_COMPRESS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_compress_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_PERMUTEXVAR_EPI32(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutexvar_epi32(${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_BROADCAST_I32X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK3_FMADDSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_BROADCAST_I32X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_i32x2(${quote(a)})")
    case iDef@MM512_SRA_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sra_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK2_PERMUTEX2VAR_EPI16(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2_permutex2var_epi16(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_FMSUBADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTPH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ROLV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rolv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PREFETCH_I64SCATTER_PS(base_addr, vindex, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_prefetch_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM256_MASK2_PERMUTEX2VAR_PD(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask2_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASK_CVT_ROUNDEPU64_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_SLLV_EPI64(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sllv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expandloadu_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASKZ_DIV_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_CVTT_ROUNDPD_EPU64(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundpd_epu64(${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SQRT_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sqrt_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MUL_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_CVTEPU32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTSEPI64_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtsepi64_epi8(${quote(a)})")
    case iDef@MM256_ROL_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rol_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMP_EPU64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CMP_EPI16_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_COMPRESS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_compress_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expandloadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_ZEXTPD256_PD512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_zextpd256_pd512(${quote(a)})")
    case iDef@MM256_MASKZ_MOV_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTPS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtps_pd(${quote(a)})")
    case iDef@MM512_MASKZ_MIN_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_RCP14_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rcp14_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTTSS_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_u32(${quote(a)})")
    case iDef@MM_MASKZ_MIN_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_OR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_or_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPI32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32_pd(${quote(a)})")
    case iDef@MM_RSQRT28_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt28_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_EXPAND_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_RCP28_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp28_ps(${quote(a)})")
    case iDef@MM512_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mmask_i64gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK3_FNMSUB_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM256_MASK_MAX_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPD_EPI32(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epi32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MOV_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SUB_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_PERMUTE_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permute_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_SRAI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srai_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_CVTEPI32_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32_ps(${quote(a)})")
    case iDef@MM_MASK_GETMANT_SS(src, k, a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getmant_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_MASK_ADD_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMSUB_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_MIN_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_min_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_SET1_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_set1_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTPD_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtpd_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_EPU16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epu16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_STOREU_PS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_PERMUTEXVAR_PS(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutexvar_ps(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_PERMUTEX_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_ADD_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMSUB_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_PERMUTEXVAR_PD(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_pd(${quote(idx)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_I32SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_CVTEPI8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepi8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPGT_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMP_EPU64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_STORE_SS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_ss((float*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_CVTEPI8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_SCALEF_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_scalef_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPI64_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi64_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_SRAI_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_srai_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_FPCLASS_SD_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fpclass_sd_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SRL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srl_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_RCP28_ROUND_PD(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp28_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_PERMUTEX2VAR_EPI64(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASKZ_OR_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_or_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASKZ_SLL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sll_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_CVTEPI64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi64_pd(${quote(a)})")
    case iDef@MM256_MASK_EXPAND_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTSD_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsd_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FMSUBADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_CVTEPI64_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi64_ps(${quote(a)})")
    case iDef@MM_MASK_CMP_PD_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_pd_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MIN_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_TEST_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_test_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_FNMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fnmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_INSERTF32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_insertf32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_LZCNT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_lzcnt_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPLT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MAX_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MADDUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_maddubs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPLT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CONFLICT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_conflict_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_I64SCATTER_PD(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_UNPACKLO_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_I32SCATTER_EPI32(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i32scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASKZ_SQRT_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sqrt_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRAV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_ANDNOT_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_andnot_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PACKUS_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_packus_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMP_EPU8_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmp_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FIXUPIMM_ROUND_PS(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_UNPACKLO_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpacklo_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RSQRT14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTI32_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvti32_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_XOR_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_LOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_loadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_STOREU_PD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_SLLV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sllv_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_CVTSD_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_u32(${quote(a)})")
    case iDef@MM256_MASKZ_DIV_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_div_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MOV_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPGE_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpge_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MADD_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_madd_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expandloadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case _ => super.emitNode(sym, rhs)
  }
}
