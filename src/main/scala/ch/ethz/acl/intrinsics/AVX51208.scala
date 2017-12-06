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

    
trait AVX51208 extends IntrinsicsBase {
  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_UNPACKHI_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of "a" using the control in
   * "imm8". Store the results in the high 64 bits of "dst", with the low 64 bits
   * being copied from from "a" to "dst", using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MUL_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASKZ_FIXUPIMM_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI16_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPU8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in
   * "dst".
   * a: __m256, b: __m256, imm8: const int
   */
  case class MM256_SHUFFLE_F32X4(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower double-precision (64-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "b" to
   * the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASKZ_REDUCE_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, idx: __m512i, a: __m512d
   */
  case class MM512_MASKZ_PERMUTEXVAR_PD(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 8-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * mem_addr: void*, k: __mmask16, a: __m128i, mem_addrOffset: int
   */
  case class MM_MASK_STOREU_EPI8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPI32_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test the lower double-precision (64-bit) floating-point element in "a" for
   * special categories specified by "imm8", and store the result in mask vector
   * "k" using zeromask "k1" (the element is zeroed out when mask bit 0 is not
   * set).
   * 	[fpclass_note]
   * k1: __mmask8, a: __m128d, imm8: int
   */
  case class MM_MASK_FPCLASS_SD_MASK(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_U32(a: Exp[__m128d]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_AND_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed half-precision (16-bit) floating-point elements, and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * src: __m128i, k: __mmask8, a: __m256, rounding: int
   */
  case class MM256_MASK_CVTPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_ROL_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower single-precision (32-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_MIN_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: char
   */
  case class MM_MASK_SET1_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 16-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASKZ_LOAD_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULLO_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_RORV_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULLO_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPI32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_AVG_EPU16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst".
   * a: __m512i, count: __m512i
   */
  case class MM512_SRAV_EPI64(a: Exp[__m512i], count: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASKZ_REDUCE_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m128
   */
  case class MM512_MASK_BROADCAST_F32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_XOR_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 16-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM256_MOVM_EPI16(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of the lower single-precision (32-bit)
   * floating-point element in "a" by the number of bits specified by "imm8", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128, imm8: int
   */
  case class MM_MASK_REDUCE_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m256i
   */
  case class MM512_MASK_CVTEPU16_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_RORV_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRL_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_SCALEF_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPU8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the low 16 bits of the intermediate integers in
   * "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULLO_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_RORV_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPU32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASK_SRLI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 8-bit integers in "b" from packed unsigned 8-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUBS_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst".
   * a: __m128i, b: __m128i, count: const int
   */
  case class MM_ALIGNR_EPI32(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" using the
   * control in "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, b: __m128i
   */
  case class MM_MASK_PERMUTEVAR_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_SI32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPNEQ_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst".
   * a: __m128i
   */
  case class MM256_BROADCAST_I64X2(a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADD_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMADDSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_SUB_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the low 64 bits of "a" using the control in "imm8".
   * Store the results in the low 64 bits of "dst", with the high 64 bits being
   * copied from from "a" to "dst", using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SHUFFLELO_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_SCALEF_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_CMP_PS_MASK(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst".
   * a: __m128i, count: __m128i
   */
  case class MM_SLLV_EPI16(a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_I64X2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128i to type __m512i; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128i
   */
  case class MM512_CASTSI128_SI512(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASKZ_SRLI_EPI16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_DIV_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASKZ_ROR_EPI64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 8-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask64
   */
  case class MM512_MOVM_EPI8(k: Exp[Long]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGT_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low single-precision (32-bit) floating-point element from "a" to
   * all elements of "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128
   */
  case class MM_MASK_BROADCASTSS_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 		[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_DIV_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASKZ_SHUFFLE_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 4 packed 32-bit integers)
   * from "b" into "tmp" at the location specified by "imm8".  Store "tmp" to "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512i, b: __m128i, imm8: int
   */
  case class MM512_MASKZ_INSERTI32X4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-28.
   * [round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_RSQRT28_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst". 
   * 	Pass __MM_FROUND_NO_EXC to
   * "sae" to suppress all exceptions.
   * a: __m512, b: __m512, sae: int
   */
  case class MM512_MIN_ROUND_PS(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512, base_addrOffset: int
   */
  case class MM512_MASK_COMPRESSSTOREU_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m128i
   */
  case class MM_CONFLICT_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU8_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGT_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_F32X4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MIN_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_CMP_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 8-bit integers from memory into "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" does not need to be aligned on any particular boundary.
   * src: __m128i, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_EPI8[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_SCALEF_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPI64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLE_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: const int
   */
  case class MM512_MASKZ_ROL_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPI32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUB_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUB_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 		[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_ADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMSUBADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __int64
   */
  case class MM_MASK_SET1_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_SCALEF_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 16-bit integers in "a" and "b", producing intermediate
   * 32-bit integers, and store the high 16 bits of the intermediate integers in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHI_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_MOVELDUP_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the minimum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	Pass __MM_FROUND_NO_EXC
   * to "sae" to suppress all exceptions.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, sae: int
   */
  case class MM_MASK_MIN_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRA_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m128d, imm8: int
   */
  case class MM512_MASK_INSERTF64X2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPI64_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m512i, b: __m512i
   */
  case class MM512_TEST_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROR_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in sign
   * bits, and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SRA_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper element from "b" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_SCALEF_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPU64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test packed double-precision (64-bit) floating-point elements in "a" for
   * special categories specified by "imm8", and store the results in mask vector
   * "k".
   * 	[fpclass_note]
   * a: __m128d, imm8: int
   */
  case class MM_FPCLASS_PD_MASK(a: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_MOVEDUP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, imm8: const int
   */
  case class MM512_MASKZ_ROL_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRL_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: const int
   */
  case class MM_MASKZ_ROL_EPI64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 bytes of "a" to packed
   * 32-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPU8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI64X4_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_I64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst".
   * a: __m512i
   */
  case class MM512_LZCNT_EPI32(a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-14.
   * a: __m128d, b: __m128d
   */
  case class MM_RCP14_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of 128-bit lanes of "a" using the
   * control in "imm8". Store the results in the high 64 bits of 128-bit lanes of
   * "dst", with the low 64 bits of 128-bit lanes being copied from from "a" to
   * "dst", using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m256i, imm8: int
   */
  case class MM256_MASKZ_SHUFFLEHI_EPI16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 8-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_ADDS_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_REDUCE_ROUND_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m256i
   */
  case class MM256_MASK_CVTSEPI16_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 16-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_MOV_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * quadruplet of the lane from "a". Quadruplets from "b" are selected according
   * to the control in "imm8", and each SAD in each 64-bit lane uses the selected
   * quadruplet at 8-bit offsets.
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_DBSAD_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLL_EPI64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
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
  case class MM256_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower single-precision (32-bit) floating-point element in "b"
   * from the lower single-precision (32-bit) floating-point element in "a", store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_SUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m128i
   */
  case class MM512_MASK_BROADCASTQ_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_OR_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst".
   * 
   * 	[round_note]
   * a: __m512d, rounding: int
   */
  case class MM512_CVT_ROUNDPD_EPU64(a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 64-bit integers from "a" to "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_MOV_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower single-precision (32-bit)
   * floating-point element in "b", store the result in the lower element of "dst",
   * and copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * The maximum relative error for this approximation is less than 2^-14.
   * a: __m128, b: __m128
   */
  case class MM_RCP14_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m256i, imm8: int
   */
  case class MM256_MASK_EXTRACTI64X2_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MULHRS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the active results (those with
   * their respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTUSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_ABS_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI32_EPI8(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_ADD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of the lower double-precision
   * (64-bit) floating-point element in "b", store the result in the lower element
   * of "dst", and copy the upper element from "a" to the upper element of "dst".
   * The maximum relative error for this approximation is less than 2^-14.
   * a: __m128d, b: __m128d
   */
  case class MM_RSQRT14_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULHRS_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SLL_EPI16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI8(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_U32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k" using zeromask "k1" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPEQ_EPI8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_RORV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
  case class MM256_MASKZ_CVT_ROUNDPS_PH(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDPD_EPU32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512i, imm8: int
   */
  case class MM512_MASK_FIXUPIMM_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MULLO_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU8_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_ADD_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst" using writemask "k" (elements
   * are copied from "c" when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_MIN_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPU8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTEPI64_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU64_PD(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FNMSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI16(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CVTTPD_EPI64(a: Exp[__m256d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MADD52HI_EPU64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_maskz_max_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU64(k, a, b)
  }
            
  def _mm_mask_unpackhi_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm512_maskz_mul_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MUL_EPI32(k, a, b)
  }
            
  def _mm_maskz_adds_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm256_mask_cmple_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPI64_MASK(k1, a, b)
  }
            
  def _mm_maskz_fixupimm_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_ROUND_SD(k, a, b, c, imm8, rounding)
  }
            
  def _mm_maskz_cvtsepi16_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI16_EPI8(k, a)
  }
            
  def _mm512_cmpeq_epu8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPEQ_EPU8_MASK(a, b)
  }
            
  def _mm256_shuffle_f32x4(a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_SHUFFLE_F32X4(a, b, imm8)
  }
            
  def _mm_mask_cvtsepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTSEPI64_EPI16(src, k, a)
  }
            
  def _mm_maskz_reduce_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_REDUCE_SD(k, a, b, imm8)
  }
            
  def _mm256_mask_load_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_permutexvar_pd(k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_PERMUTEXVAR_PD(k, idx, a)
  }
            
  def _mm_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm_mask_storeu_epi8[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m256] = {
    MM256_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm_mask_fpclass_sd_mask(k1: Exp[Int], a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_FPCLASS_SD_MASK(k1, a, imm8)
  }
            
  def _mm_cvttsd_u32(a: Exp[__m128d]): Exp[UInt] = {
    MM_CVTTSD_U32(a)
  }
            
  def _mm_mask_and_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_AND_EPI32(src, k, a, b)
  }
            
  def _mm512_mask_unpackhi_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI32(src, k, a, b)
  }
            
  def _mm256_mask_cvtps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_CVTPS_PH(src, k, a, rounding)
  }
            
  def _mm256_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm256_mask_rol_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_ROL_EPI64(src, k, a, imm8)
  }
            
  def _mm_mask_min_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_MIN_SS(src, k, a, b)
  }
            
  def _mm_mask_set1_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[Byte]): Exp[__m128i] = {
    MM_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm_maskz_load_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_mullo_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULLO_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_cvtsepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_rorv_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_RORV_EPI64(a, b)
  }
            
  def _mm512_mask_mullo_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULLO_EPI64(src, k, a, b)
  }
            
  def _mm512_mask_cvt_roundepi32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDEPI32_PS(src, k, a, rounding)
  }
            
  def _mm_maskz_avg_epu16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_AVG_EPU16(k, a, b)
  }
            
  def _mm512_srav_epi64(a: Exp[__m512i], count: Exp[__m512i]): Exp[__m512i] = {
    MM512_SRAV_EPI64(a, count)
  }
            
  def _mm_maskz_reduce_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_REDUCE_SS(k, a, b, imm8)
  }
            
  def _mm512_mask_broadcast_f32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m128]): Exp[__m512] = {
    MM512_MASK_BROADCAST_F32X4(src, k, a)
  }
            
  def _mm256_maskz_xor_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_XOR_PD(k, a, b)
  }
            
  def _mm256_movm_epi16(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI16(k)
  }
            
  def _mm_mask_reduce_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_REDUCE_SS(src, k, a, b, imm8)
  }
            
  def _mm512_mask_cvtepu16_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASK_CVTEPU16_EPI32(src, k, a)
  }
            
  def _mm256_rorv_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_RORV_EPI64(a, b)
  }
            
  def _mm512_mask_srl_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRL_EPI32(src, k, a, count)
  }
            
  def _mm512_mask_scalef_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm_cmpneq_epu8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPU8_MASK(a, b)
  }
            
  def _mm512_mullo_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULLO_EPI16(a, b)
  }
            
  def _mm_mask_rorv_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_RORV_EPI32(src, k, a, b)
  }
            
  def _mm_cmpeq_epu32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPU32_MASK(a, b)
  }
            
  def _mm256_mask_srli_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASK_SRLI_EPI64(src, k, a, imm8)
  }
            
  def _mm512_maskz_subs_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUBS_EPU8(k, a, b)
  }
            
  def _mm_alignr_epi32(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_ALIGNR_EPI32(a, b, count)
  }
            
  def _mm_mask_permutevar_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_PERMUTEVAR_PS(src, k, a, b)
  }
            
  def _mm_cvt_roundss_si32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVT_ROUNDSS_SI32(a, rounding)
  }
            
  def _mm512_cmpneq_epu16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPNEQ_EPU16_MASK(a, b)
  }
            
  def _mm256_broadcast_i64x2(a: Exp[__m128i]): Exp[__m256i] = {
    MM256_BROADCAST_I64X2(a)
  }
            
  def _mm256_mask_add_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADD_EPI8(src, k, a, b)
  }
            
  def _mm512_maskz_fmaddsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMADDSUB_PS(k, a, b, c)
  }
            
  def _mm_mask3_fmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_SD(a, b, c, k)
  }
            
  def _mm_mask_sub_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_SUB_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_maskz_shufflelo_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SHUFFLELO_EPI16(k, a, imm8)
  }
            
  def _mm_maskz_scalef_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_SCALEF_PS(k, a, b)
  }
            
  def _mm_cmp_ps_mask(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_PS_MASK(a, b, imm8)
  }
            
  def _mm_sllv_epi16(a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_SLLV_EPI16(a, count)
  }
            
  def _mm256_maskz_shuffle_i64x2(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLE_I64X2(k, a, b, imm8)
  }
            
  def _mm_mask_max_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI32(src, k, a, b)
  }
            
  def _mm512_castsi128_si512(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CASTSI128_SI512(a)
  }
            
  def _mm_maskz_srli_epi16(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI16(k, a, imm8)
  }
            
  def _mm512_mask_div_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_DIV_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm256_maskz_ror_epi64(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_ROR_EPI64(k, a, imm8)
  }
            
  def _mm_mask_cmple_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPU64_MASK(k1, a, b)
  }
            
  def _mm256_maskz_mov_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MOV_PS(k, a)
  }
            
  def _mm512_movm_epi8(k: Exp[Long]): Exp[__m512i] = {
    MM512_MOVM_EPI8(k)
  }
            
  def _mm_cmpgt_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGT_EPU16_MASK(a, b)
  }
            
  def _mm_mask_broadcastss_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASK_BROADCASTSS_PS(src, k, a)
  }
            
  def _mm_div_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_DIV_ROUND_SS(a, b, rounding)
  }
            
  def _mm256_maskz_shuffle_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[__m256] = {
    MM256_MASKZ_SHUFFLE_PS(k, a, b, imm8)
  }
            
  def _mm512_maskz_inserti32x4(k: Exp[Int], a: Exp[__m512i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_INSERTI32X4(k, a, b, imm8)
  }
            
  def _mm_rsqrt28_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_RSQRT28_ROUND_SD(a, b, rounding)
  }
            
  def _mm512_min_round_ps(a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MIN_ROUND_PS(a, b, sae)
  }
            
  def _mm512_mask_compressstoreu_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_conflict_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CONFLICT_EPI64(a)
  }
            
  def _mm256_mask_cvtepu8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPU8_EPI32(src, k, a)
  }
            
  def _mm256_maskz_adds_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPU16(k, a, b)
  }
            
  def _mm_mask_cmpgt_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGT_EPI16_MASK(k1, a, b)
  }
            
  def _mm512_mask_shuffle_f32x4(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SHUFFLE_F32X4(src, k, a, b, imm8)
  }
            
  def _mm512_min_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MIN_EPI64(a, b)
  }
            
  def _mm_cmp_epi8_mask(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm_mask_loadu_epi8[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_scalef_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SCALEF_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm_cvttps_epi64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPI64(a)
  }
            
  def _mm512_mask_cmple_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLE_EPU64_MASK(k1, a, b)
  }
            
  def _mm_mask_max_epu64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU64(src, k, a, b)
  }
            
  def _mm512_maskz_rol_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ROL_EPI64(k, a, imm8)
  }
            
  def _mm_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm_mask_fmsub_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUB_PS(a, k, b, c)
  }
            
  def _mm_mask_sub_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm_add_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_ADD_ROUND_SS(a, b, rounding)
  }
            
  def _mm_mask3_fmsubadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm_cvtepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI32_EPI8(a)
  }
            
  def _mm_mask_set1_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[Long]): Exp[__m128i] = {
    MM_MASK_SET1_EPI64(src, k, a)
  }
            
  def _mm256_mask_scalef_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SCALEF_PD(src, k, a, b)
  }
            
  def _mm256_mask_mulhi_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHI_EPI16(src, k, a, b)
  }
            
  def _mm256_maskz_moveldup_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MOVELDUP_PS(k, a)
  }
            
  def _mm_mask_min_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], sae: Exp[Int]): Exp[__m128d] = {
    MM_MASK_MIN_ROUND_SD(src, k, a, b, sae)
  }
            
  def _mm_maskz_sra_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRA_EPI32(k, a, count)
  }
            
  def _mm512_mask_insertf64x2(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_INSERTF64X2(src, k, a, b, imm8)
  }
            
  def _mm512_cvtepi64_ps(a: Exp[__m512i]): Exp[__m256] = {
    MM512_CVTEPI64_PS(a)
  }
            
  def _mm512_test_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_TEST_EPI8_MASK(a, b)
  }
            
  def _mm_ror_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROR_EPI64(a, imm8)
  }
            
  def _mm512_mask_sra_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SRA_EPI32(src, k, a, count)
  }
            
  def _mm_mask_scalef_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_SCALEF_SD(src, k, a, b)
  }
            
  def _mm_mask_cmple_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI8_MASK(k1, a, b)
  }
            
  def _mm512_mask_cmpgt_epu64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPU64_MASK(k1, a, b)
  }
            
  def _mm_fpclass_pd_mask(a: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_FPCLASS_PD_MASK(a, imm8)
  }
            
  def _mm256_mask_cmplt_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_mask_movedup_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_MOVEDUP_PD(src, k, a)
  }
            
  def _mm512_maskz_rol_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ROL_EPI32(k, a, imm8)
  }
            
  def _mm512_maskz_srl_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRL_EPI16(k, a, count)
  }
            
  def _mm_maskz_rol_epi64(k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_ROL_EPI64(k, a, imm8)
  }
            
  def _mm256_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm256_maskz_cvtepu8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPU8_EPI32(k, a)
  }
            
  def _mm512_extracti64x4_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_EXTRACTI64X4_EPI64(a, imm8)
  }
            
  def _mm_cvtt_roundsd_i64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSD_I64(a, rounding)
  }
            
  def _mm512_cmpgt_epu16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPU16_MASK(a, b)
  }
            
  def _mm512_lzcnt_epi32(a: Exp[__m512i]): Exp[__m512i] = {
    MM512_LZCNT_EPI32(a)
  }
            
  def _mm_rcp14_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RCP14_SD(a, b)
  }
            
  def _mm256_maskz_shufflehi_epi16(k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASKZ_SHUFFLEHI_EPI16(k, a, imm8)
  }
            
  def _mm256_maskz_adds_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_ADDS_EPU8(k, a, b)
  }
            
  def _mm512_maskz_reduce_round_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_REDUCE_ROUND_PS(k, a, imm8, rounding)
  }
            
  def _mm256_mask_cvtsepi16_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTSEPI16_EPI8(src, k, a)
  }
            
  def _mm_cmple_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPU16_MASK(a, b)
  }
            
  def _mm512_maskz_mov_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MOV_EPI16(k, a)
  }
            
  def _mm_mask_dbsad_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_DBSAD_EPU8(src, k, a, b, imm8)
  }
            
  def _mm_maskz_sll_epi64(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLL_EPI64(k, a, count)
  }
            
  def _mm256_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_sub_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_SUB_ROUND_SS(a, b, rounding)
  }
            
  def _mm512_mask_broadcastq_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTQ_EPI64(src, k, a)
  }
            
  def _mm256_maskz_or_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_OR_PS(k, a, b)
  }
            
  def _mm512_cvt_roundpd_epu64(a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVT_ROUNDPD_EPU64(a, rounding)
  }
            
  def _mm256_mask_mov_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MOV_EPI64(src, k, a)
  }
            
  def _mm512_maskz_sub_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI32(k, a, b)
  }
            
  def _mm_rcp14_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_RCP14_SS(a, b)
  }
            
  def _mm256_mask_extracti64x2_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8)
  }
            
  def _mm_mask_mulhrs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm256_mask_cvtusepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_abs_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ABS_EPI32(k, a)
  }
            
  def _mm256_maskz_cvtsepi32_epi8(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI32_EPI8(k, a)
  }
            
  def _mm256_mask_add_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_ADD_EPI32(src, k, a, b)
  }
            
  def _mm_rsqrt14_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_RSQRT14_SD(a, b)
  }
            
  def _mm256_mask_mulhrs_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULHRS_EPI16(src, k, a, b)
  }
            
  def _mm256_mask_cvtsepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_sll_epi16(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SLL_EPI16(k, a, count)
  }
            
  def _mm_min_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPU64(a, b)
  }
            
  def _mm512_maskz_div_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm256_cvtepi64_epi32(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI64_EPI32(a)
  }
            
  def _mm256_maskz_permutex2var_epi8(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b)
  }
            
  def _mm_cvt_roundss_u32(a: Exp[__m128], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVT_ROUNDSS_U32(a, rounding)
  }
            
  def _mm512_mask_cmpeq_epi8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPEQ_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_rorv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_RORV_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm256_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm512_maskz_cvt_roundpd_epu32(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPD_EPU32(k, a, rounding)
  }
            
  def _mm512_mask_fixupimm_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm_maskz_mullo_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MULLO_EPI64(k, a, b)
  }
            
  def _mm_mask_cvtepu8_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU8_EPI16(src, k, a)
  }
            
  def _mm256_mask_add_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_ADD_PD(src, k, a, b)
  }
            
  def _mm_mask3_fnmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMSUB_SS(a, b, c, k)
  }
            
  def _mm256_maskz_min_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_MIN_PS(k, a, b)
  }
            
  def _mm_mask_max_epu8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPU8(src, k, a, b)
  }
            
  def _mm512_mask_cvtepi64_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm256_mask3_fnmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FNMSUB_PS(a, b, c, k)
  }
            
  def _mm512_permutexvar_epi16(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm256_cvttpd_epi64(a: Exp[__m256d]): Exp[__m256i] = {
    MM256_CVTTPD_EPI64(a)
  }
            
  def _mm256_madd52hi_epu64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MADD52HI_EPU64(a, b, c)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASKZ_MAX_EPU64 (k, a, b) =>
      _mm256_maskz_max_epu64(f(k), f(a), f(b))
    case MM_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM512_MASKZ_MUL_EPI32 (k, a, b) =>
      _mm512_maskz_mul_epi32(f(k), f(a), f(b))
    case MM_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm_maskz_adds_epu16(f(k), f(a), f(b))
    case MM256_MASK_CMPLE_EPI64_MASK (k1, a, b) =>
      _mm256_mask_cmple_epi64_mask(f(k1), f(a), f(b))
    case MM_MASKZ_FIXUPIMM_ROUND_SD (k, a, b, c, imm8, rounding) =>
      _mm_maskz_fixupimm_round_sd(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_MASKZ_CVTSEPI16_EPI8 (k, a) =>
      _mm_maskz_cvtsepi16_epi8(f(k), f(a))
    case MM512_CMPEQ_EPU8_MASK (a, b) =>
      _mm512_cmpeq_epu8_mask(f(a), f(b))
    case MM256_SHUFFLE_F32X4 (a, b, imm8) =>
      _mm256_shuffle_f32x4(f(a), f(b), f(imm8))
    case MM_MASK_CVTSEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtsepi64_epi16(f(src), f(k), f(a))
    case MM_MASKZ_REDUCE_SD (k, a, b, imm8) =>
      _mm_maskz_reduce_sd(f(k), f(a), f(b), f(imm8))
    case iDef@MM256_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_PERMUTEXVAR_PD (k, idx, a) =>
      _mm512_maskz_permutexvar_pd(f(k), f(idx), f(a))
    case MM_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case iDef@MM_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_storeu_epi8(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTEPI32_PS (k, a) =>
      _mm256_maskz_cvtepi32_ps(f(k), f(a))
    case MM_MASK_FPCLASS_SD_MASK (k1, a, imm8) =>
      _mm_mask_fpclass_sd_mask(f(k1), f(a), f(imm8))
    case MM_CVTTSD_U32 (a) =>
      _mm_cvttsd_u32(f(a))
    case MM_MASK_AND_EPI32 (src, k, a, b) =>
      _mm_mask_and_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASK_UNPACKHI_EPI32 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASK_CVTPS_PH (src, k, a, rounding) =>
      _mm256_mask_cvtps_ph(f(src), f(k), f(a), f(rounding))
    case MM256_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm256_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK_ROL_EPI64 (src, k, a, imm8) =>
      _mm256_mask_rol_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASK_MIN_SS (src, k, a, b) =>
      _mm_mask_min_ss(f(src), f(k), f(a), f(b))
    case MM_MASK_SET1_EPI8 (src, k, a) =>
      _mm_mask_set1_epi8(f(src), f(k), f(a))
    case iDef@MM_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_load_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MULLO_EPI16 (src, k, a, b) =>
      _mm256_mask_mullo_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_RORV_EPI64 (a, b) =>
      _mm512_rorv_epi64(f(a), f(b))
    case MM512_MASK_MULLO_EPI64 (src, k, a, b) =>
      _mm512_mask_mullo_epi64(f(src), f(k), f(a), f(b))
    case MM512_MASK_CVT_ROUNDEPI32_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepi32_ps(f(src), f(k), f(a), f(rounding))
    case MM_MASKZ_AVG_EPU16 (k, a, b) =>
      _mm_maskz_avg_epu16(f(k), f(a), f(b))
    case MM512_SRAV_EPI64 (a, count) =>
      _mm512_srav_epi64(f(a), f(count))
    case MM_MASKZ_REDUCE_SS (k, a, b, imm8) =>
      _mm_maskz_reduce_ss(f(k), f(a), f(b), f(imm8))
    case MM512_MASK_BROADCAST_F32X4 (src, k, a) =>
      _mm512_mask_broadcast_f32x4(f(src), f(k), f(a))
    case MM256_MASKZ_XOR_PD (k, a, b) =>
      _mm256_maskz_xor_pd(f(k), f(a), f(b))
    case MM256_MOVM_EPI16 (k) =>
      _mm256_movm_epi16(f(k))
    case MM_MASK_REDUCE_SS (src, k, a, b, imm8) =>
      _mm_mask_reduce_ss(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_CVTEPU16_EPI32 (src, k, a) =>
      _mm512_mask_cvtepu16_epi32(f(src), f(k), f(a))
    case MM256_RORV_EPI64 (a, b) =>
      _mm256_rorv_epi64(f(a), f(b))
    case MM512_MASK_SRL_EPI32 (src, k, a, count) =>
      _mm512_mask_srl_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASK_SCALEF_PD (src, k, a, b) =>
      _mm512_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM_CMPNEQ_EPU8_MASK (a, b) =>
      _mm_cmpneq_epu8_mask(f(a), f(b))
    case MM512_MULLO_EPI16 (a, b) =>
      _mm512_mullo_epi16(f(a), f(b))
    case MM_MASK_RORV_EPI32 (src, k, a, b) =>
      _mm_mask_rorv_epi32(f(src), f(k), f(a), f(b))
    case MM_CMPEQ_EPU32_MASK (a, b) =>
      _mm_cmpeq_epu32_mask(f(a), f(b))
    case MM256_MASK_SRLI_EPI64 (src, k, a, imm8) =>
      _mm256_mask_srli_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SUBS_EPU8 (k, a, b) =>
      _mm512_maskz_subs_epu8(f(k), f(a), f(b))
    case MM_ALIGNR_EPI32 (a, b, count) =>
      _mm_alignr_epi32(f(a), f(b), f(count))
    case MM_MASK_PERMUTEVAR_PS (src, k, a, b) =>
      _mm_mask_permutevar_ps(f(src), f(k), f(a), f(b))
    case MM_CVT_ROUNDSS_SI32 (a, rounding) =>
      _mm_cvt_roundss_si32(f(a), f(rounding))
    case MM512_CMPNEQ_EPU16_MASK (a, b) =>
      _mm512_cmpneq_epu16_mask(f(a), f(b))
    case MM256_BROADCAST_I64X2 (a) =>
      _mm256_broadcast_i64x2(f(a))
    case MM256_MASK_ADD_EPI8 (src, k, a, b) =>
      _mm256_mask_add_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_FMADDSUB_PS (k, a, b, c) =>
      _mm512_maskz_fmaddsub_ps(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADD_SD (a, b, c, k) =>
      _mm_mask3_fmadd_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_SUB_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_sub_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_SHUFFLELO_EPI16 (k, a, imm8) =>
      _mm_maskz_shufflelo_epi16(f(k), f(a), f(imm8))
    case MM_MASKZ_SCALEF_PS (k, a, b) =>
      _mm_maskz_scalef_ps(f(k), f(a), f(b))
    case MM_CMP_PS_MASK (a, b, imm8) =>
      _mm_cmp_ps_mask(f(a), f(b), f(imm8))
    case MM_SLLV_EPI16 (a, count) =>
      _mm_sllv_epi16(f(a), f(count))
    case MM256_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8) =>
      _mm256_maskz_shuffle_i64x2(f(k), f(a), f(b), f(imm8))
    case MM_MASK_MAX_EPI32 (src, k, a, b) =>
      _mm_mask_max_epi32(f(src), f(k), f(a), f(b))
    case MM512_CASTSI128_SI512 (a) =>
      _mm512_castsi128_si512(f(a))
    case MM_MASKZ_SRLI_EPI16 (k, a, imm8) =>
      _mm_maskz_srli_epi16(f(k), f(a), f(imm8))
    case MM512_MASK_DIV_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_div_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASKZ_ROR_EPI64 (k, a, imm8) =>
      _mm256_maskz_ror_epi64(f(k), f(a), f(imm8))
    case MM_MASK_CMPLE_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmple_epu64_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_MOV_PS (k, a) =>
      _mm256_maskz_mov_ps(f(k), f(a))
    case MM512_MOVM_EPI8 (k) =>
      _mm512_movm_epi8(f(k))
    case MM_CMPGT_EPU16_MASK (a, b) =>
      _mm_cmpgt_epu16_mask(f(a), f(b))
    case MM_MASK_BROADCASTSS_PS (src, k, a) =>
      _mm_mask_broadcastss_ps(f(src), f(k), f(a))
    case MM_DIV_ROUND_SS (a, b, rounding) =>
      _mm_div_round_ss(f(a), f(b), f(rounding))
    case MM256_MASKZ_SHUFFLE_PS (k, a, b, imm8) =>
      _mm256_maskz_shuffle_ps(f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_INSERTI32X4 (k, a, b, imm8) =>
      _mm512_maskz_inserti32x4(f(k), f(a), f(b), f(imm8))
    case MM_RSQRT28_ROUND_SD (a, b, rounding) =>
      _mm_rsqrt28_round_sd(f(a), f(b), f(rounding))
    case MM512_MIN_ROUND_PS (a, b, sae) =>
      _mm512_min_round_ps(f(a), f(b), f(sae))
    case iDef@MM512_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_compressstoreu_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CONFLICT_EPI64 (a) =>
      _mm_conflict_epi64(f(a))
    case MM256_MASK_CVTEPU8_EPI32 (src, k, a) =>
      _mm256_mask_cvtepu8_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_ADDS_EPU16 (k, a, b) =>
      _mm256_maskz_adds_epu16(f(k), f(a), f(b))
    case MM_MASK_CMPGT_EPI16_MASK (k1, a, b) =>
      _mm_mask_cmpgt_epi16_mask(f(k1), f(a), f(b))
    case MM512_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_f32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MIN_EPI64 (a, b) =>
      _mm512_min_epi64(f(a), f(b))
    case MM_CMP_EPI8_MASK (a, b, imm8) =>
      _mm_cmp_epi8_mask(f(a), f(b), f(imm8))
    case iDef@MM_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_epi8(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_SCALEF_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_scalef_round_ps(f(k), f(a), f(b), f(rounding))
    case MM_CVTTPS_EPI64 (a) =>
      _mm_cvttps_epi64(f(a))
    case MM512_MASK_CMPLE_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmple_epu64_mask(f(k1), f(a), f(b))
    case MM_MASK_MAX_EPU64 (src, k, a, b) =>
      _mm_mask_max_epu64(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_ROL_EPI64 (k, a, imm8) =>
      _mm512_maskz_rol_epi64(f(k), f(a), f(imm8))
    case MM_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm_maskz_cvttpd_epi32(f(k), f(a))
    case MM_MASK_FMSUB_PS (a, k, b, c) =>
      _mm_mask_fmsub_ps(f(a), f(k), f(b), f(c))
    case MM_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM_ADD_ROUND_SS (a, b, rounding) =>
      _mm_add_round_ss(f(a), f(b), f(rounding))
    case MM_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM_CVTEPI32_EPI8 (a) =>
      _mm_cvtepi32_epi8(f(a))
    case MM_MASK_SET1_EPI64 (src, k, a) =>
      _mm_mask_set1_epi64(f(src), f(k), f(a))
    case MM256_MASK_SCALEF_PD (src, k, a, b) =>
      _mm256_mask_scalef_pd(f(src), f(k), f(a), f(b))
    case MM256_MASK_MULHI_EPI16 (src, k, a, b) =>
      _mm256_mask_mulhi_epi16(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MOVELDUP_PS (k, a) =>
      _mm256_maskz_moveldup_ps(f(k), f(a))
    case MM_MASK_MIN_ROUND_SD (src, k, a, b, sae) =>
      _mm_mask_min_round_sd(f(src), f(k), f(a), f(b), f(sae))
    case MM_MASKZ_SRA_EPI32 (k, a, count) =>
      _mm_maskz_sra_epi32(f(k), f(a), f(count))
    case MM512_MASK_INSERTF64X2 (src, k, a, b, imm8) =>
      _mm512_mask_insertf64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_CVTEPI64_PS (a) =>
      _mm512_cvtepi64_ps(f(a))
    case MM512_TEST_EPI8_MASK (a, b) =>
      _mm512_test_epi8_mask(f(a), f(b))
    case MM_ROR_EPI64 (a, imm8) =>
      _mm_ror_epi64(f(a), f(imm8))
    case MM512_MASK_SRA_EPI32 (src, k, a, count) =>
      _mm512_mask_sra_epi32(f(src), f(k), f(a), f(count))
    case MM_MASK_SCALEF_SD (src, k, a, b) =>
      _mm_mask_scalef_sd(f(src), f(k), f(a), f(b))
    case MM_MASK_CMPLE_EPI8_MASK (k1, a, b) =>
      _mm_mask_cmple_epi8_mask(f(k1), f(a), f(b))
    case MM512_MASK_CMPGT_EPU64_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epu64_mask(f(k1), f(a), f(b))
    case MM_FPCLASS_PD_MASK (a, imm8) =>
      _mm_fpclass_pd_mask(f(a), f(imm8))
    case MM256_MASK_CMPLT_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASK_MOVEDUP_PD (src, k, a) =>
      _mm512_mask_movedup_pd(f(src), f(k), f(a))
    case MM512_MASKZ_ROL_EPI32 (k, a, imm8) =>
      _mm512_maskz_rol_epi32(f(k), f(a), f(imm8))
    case MM512_MASKZ_SRL_EPI16 (k, a, count) =>
      _mm512_maskz_srl_epi16(f(k), f(a), f(count))
    case MM_MASKZ_ROL_EPI64 (k, a, imm8) =>
      _mm_maskz_rol_epi64(f(k), f(a), f(imm8))
    case MM256_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm256_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASKZ_CVTEPU8_EPI32 (k, a) =>
      _mm256_maskz_cvtepu8_epi32(f(k), f(a))
    case MM512_EXTRACTI64X4_EPI64 (a, imm8) =>
      _mm512_extracti64x4_epi64(f(a), f(imm8))
    case MM_CVTT_ROUNDSD_I64 (a, rounding) =>
      _mm_cvtt_roundsd_i64(f(a), f(rounding))
    case MM512_CMPGT_EPU16_MASK (a, b) =>
      _mm512_cmpgt_epu16_mask(f(a), f(b))
    case MM512_LZCNT_EPI32 (a) =>
      _mm512_lzcnt_epi32(f(a))
    case MM_RCP14_SD (a, b) =>
      _mm_rcp14_sd(f(a), f(b))
    case MM256_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8) =>
      _mm256_maskz_shufflehi_epi16(f(k), f(a), f(imm8))
    case MM256_MASKZ_ADDS_EPU8 (k, a, b) =>
      _mm256_maskz_adds_epu8(f(k), f(a), f(b))
    case MM512_MASKZ_REDUCE_ROUND_PS (k, a, imm8, rounding) =>
      _mm512_maskz_reduce_round_ps(f(k), f(a), f(imm8), f(rounding))
    case MM256_MASK_CVTSEPI16_EPI8 (src, k, a) =>
      _mm256_mask_cvtsepi16_epi8(f(src), f(k), f(a))
    case MM_CMPLE_EPU16_MASK (a, b) =>
      _mm_cmple_epu16_mask(f(a), f(b))
    case MM512_MASKZ_MOV_EPI16 (k, a) =>
      _mm512_maskz_mov_epi16(f(k), f(a))
    case MM_MASK_DBSAD_EPU8 (src, k, a, b, imm8) =>
      _mm_mask_dbsad_epu8(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_SLL_EPI64 (k, a, count) =>
      _mm_maskz_sll_epi64(f(k), f(a), f(count))
    case iDef@MM256_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SUB_ROUND_SS (a, b, rounding) =>
      _mm_sub_round_ss(f(a), f(b), f(rounding))
    case MM512_MASK_BROADCASTQ_EPI64 (src, k, a) =>
      _mm512_mask_broadcastq_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_OR_PS (k, a, b) =>
      _mm256_maskz_or_ps(f(k), f(a), f(b))
    case MM512_CVT_ROUNDPD_EPU64 (a, rounding) =>
      _mm512_cvt_roundpd_epu64(f(a), f(rounding))
    case MM256_MASK_MOV_EPI64 (src, k, a) =>
      _mm256_mask_mov_epi64(f(src), f(k), f(a))
    case MM512_MASKZ_SUB_EPI32 (k, a, b) =>
      _mm512_maskz_sub_epi32(f(k), f(a), f(b))
    case MM_RCP14_SS (a, b) =>
      _mm_rcp14_ss(f(a), f(b))
    case MM256_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8) =>
      _mm256_mask_extracti64x2_epi64(f(src), f(k), f(a), f(imm8))
    case MM_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtusepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_ABS_EPI32 (k, a) =>
      _mm_maskz_abs_epi32(f(k), f(a))
    case MM256_MASKZ_CVTSEPI32_EPI8 (k, a) =>
      _mm256_maskz_cvtsepi32_epi8(f(k), f(a))
    case MM256_MASK_ADD_EPI32 (src, k, a, b) =>
      _mm256_mask_add_epi32(f(src), f(k), f(a), f(b))
    case MM_RSQRT14_SD (a, b) =>
      _mm_rsqrt14_sd(f(a), f(b))
    case MM256_MASK_MULHRS_EPI16 (src, k, a, b) =>
      _mm256_mask_mulhrs_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_SLL_EPI16 (k, a, count) =>
      _mm512_maskz_sll_epi16(f(k), f(a), f(count))
    case MM_MIN_EPU64 (a, b) =>
      _mm_min_epu64(f(a), f(b))
    case MM512_MASKZ_DIV_PS (k, a, b) =>
      _mm512_maskz_div_ps(f(k), f(a), f(b))
    case MM256_CVTEPI64_EPI32 (a) =>
      _mm256_cvtepi64_epi32(f(a))
    case MM256_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi8(f(k), f(a), f(idx), f(b))
    case MM_CVT_ROUNDSS_U32 (a, rounding) =>
      _mm_cvt_roundss_u32(f(a), f(rounding))
    case MM512_MASK_CMPEQ_EPI8_MASK (k1, a, b) =>
      _mm512_mask_cmpeq_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_RORV_EPI64 (src, k, a, b) =>
      _mm_mask_rorv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_SQRT_PD (k, a) =>
      _mm_maskz_sqrt_pd(f(k), f(a))
    case MM256_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm256_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVT_ROUNDPD_EPU32 (k, a, rounding) =>
      _mm512_maskz_cvt_roundpd_epu32(f(k), f(a), f(rounding))
    case MM512_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm512_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASKZ_MULLO_EPI64 (k, a, b) =>
      _mm_maskz_mullo_epi64(f(k), f(a), f(b))
    case MM_MASK_CVTEPU8_EPI16 (src, k, a) =>
      _mm_mask_cvtepu8_epi16(f(src), f(k), f(a))
    case MM256_MASK_ADD_PD (src, k, a, b) =>
      _mm256_mask_add_pd(f(src), f(k), f(a), f(b))
    case MM_MASK3_FNMSUB_SS (a, b, c, k) =>
      _mm_mask3_fnmsub_ss(f(a), f(b), f(c), f(k))
    case MM256_MASKZ_MIN_PS (k, a, b) =>
      _mm256_maskz_min_ps(f(k), f(a), f(b))
    case MM_MASK_MAX_EPU8 (src, k, a, b) =>
      _mm_mask_max_epu8(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtepi64_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_CVTEPU64_PD (k, a) =>
      _mm_maskz_cvtepu64_pd(f(k), f(a))
    case MM256_MASK3_FNMSUB_PS (a, b, c, k) =>
      _mm256_mask3_fnmsub_ps(f(a), f(b), f(c), f(k))
    case MM512_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm512_permutexvar_epi16(f(idx), f(a))
    case MM256_CVTTPD_EPI64 (a) =>
      _mm256_cvttpd_epi64(f(a))
    case MM256_MADD52HI_EPU64 (a, b, c) =>
      _mm256_madd52hi_epu64(f(a), f(b), f(c))

    case Reflect(MM256_MASKZ_MAX_EPU64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MUL_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MUL_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_ROUND_SD (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_ROUND_SD (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI16_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI16_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SHUFFLE_F32X4 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_SHUFFLE_F32X4 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_SD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_SD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEXVAR_PD (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEXVAR_PD (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STOREU_EPI8 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STOREU_EPI8 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FPCLASS_SD_MASK (k1, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FPCLASS_SD_MASK (f(k1), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_AND_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_AND_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ROL_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ROL_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_LOAD_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RORV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_RORV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULLO_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULLO_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPI32_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPI32_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_AVG_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_AVG_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRAV_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRAV_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_REDUCE_SS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_REDUCE_SS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_F32X4 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_F32X4 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI16 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI16 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_SS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_SS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU16_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU16_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_RORV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_RORV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULLO_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULLO_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RORV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RORV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPU32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPU32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLI_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLI_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUBS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUBS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_EPI32 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_EPI32 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEVAR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEVAR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPNEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPNEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_I64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_I64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLELO_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLELO_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PS_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PS_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SLLV_EPI16 (a, count), u, es) =>
      reflectMirrored(Reflect(MM_SLLV_EPI16 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_I64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_I64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTSI128_SI512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTSI128_SI512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ROR_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ROR_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI8 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI8 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTSS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTSS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_DIV_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLE_PS (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLE_PS (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_INSERTI32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_INSERTI32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT28_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT28_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_ROUND_PS (a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_ROUND_PS (f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_COMPRESSSTOREU_PS (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESSSTOREU_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CONFLICT_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CONFLICT_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU8_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU8_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_F32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_F32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MIN_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MIN_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOADU_EPI8 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_EPI8 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SCALEF_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SCALEF_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROL_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROL_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ADD_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ADD_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SET1_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SET1_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SCALEF_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SCALEF_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHI_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHI_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MOVELDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MOVELDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_ROUND_SD (src, k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_ROUND_SD (f(src), f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRA_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRA_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROR_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROR_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRA_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRA_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FPCLASS_PD_MASK (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FPCLASS_PD_MASK (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOVEDUP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOVEDUP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROL_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROL_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ROL_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ROL_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI64X4_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI64X4_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LZCNT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_LZCNT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SHUFFLEHI_EPI16 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SHUFFLEHI_EPI16 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ADDS_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ADDS_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_REDUCE_ROUND_PS (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_REDUCE_ROUND_PS (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTSEPI16_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI16_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOV_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOV_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DBSAD_EPU8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DBSAD_EPU8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLL_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLL_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SUB_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_SUB_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTQ_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTQ_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_OR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_OR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDPD_EPU64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDPD_EPU64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOV_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOV_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RCP14_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RCP14_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTI64X2_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTI64X2_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ABS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ABS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI32_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI32_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_RSQRT14_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_RSQRT14_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULHRS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULHRS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SLL_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SLL_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI8 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPEQ_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPEQ_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RORV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RORV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU32 (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPD_EPU32 (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MULLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MULLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU8_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU8_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_ADD_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_ADD_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPU8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPU8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTEPI64_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPI64_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FNMSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FNMSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTTPD_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTTPD_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MADD52HI_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MADD52HI_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51208 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_MASKZ_MAX_EPU64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epu64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MUL_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mul_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ADDS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLE_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FIXUPIMM_ROUND_SD(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_CVTSEPI16_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsepi16_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPEQ_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SHUFFLE_F32X4(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_shuffle_f32x4(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTSEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtsepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_REDUCE_SD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_reduce_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_LOAD_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_load_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASKZ_PERMUTEXVAR_PD(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutexvar_pd(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK_STOREU_EPI8(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_storeu_epi8((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_CVTEPI32_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FPCLASS_SD_MASK(k1, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fpclass_sd_mask(${quote(k1)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTTSD_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_u32(${quote(a)})")
    case iDef@MM_MASK_AND_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_and_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_UNPACKHI_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpackhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTPS_PH(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_FMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_ROL_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rol_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MIN_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SET1_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_load_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_MULLO_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mullo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_RORV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rorv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MULLO_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mullo_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVT_ROUNDEPI32_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_AVG_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_avg_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SRAV_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srav_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_REDUCE_SS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_reduce_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_BROADCAST_F32X4(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_XOR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_xor_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MOVM_EPI16(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movm_epi16(${quote(k)})")
    case iDef@MM_MASK_REDUCE_SS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_reduce_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTEPU16_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu16_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_RORV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rorv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SRL_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srl_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_SCALEF_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MULLO_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mullo_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RORV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rorv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_EPU32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epu32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SRLI_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srli_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SUBS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_subs_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ALIGNR_EPI32(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_alignr_epi32(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASK_PERMUTEVAR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutevar_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSS_SI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_si32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_CMPNEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpneq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCAST_I64X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_i64x2(${quote(a)})")
    case iDef@MM256_MASK_ADD_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMADDSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK3_FMADD_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_SUB_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_SHUFFLELO_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shufflelo_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SCALEF_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_PS_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_ps_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_SLLV_EPI16(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sllv_epi16(${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_SHUFFLE_I64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_i64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_MAX_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTSI128_SI512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castsi128_si512(${quote(a)})")
    case iDef@MM_MASKZ_SRLI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srli_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_DIV_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_ROR_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_ror_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_CMPLE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MOV_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MOVM_EPI8(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movm_epi8(${quote(k)})")
    case iDef@MM_CMPGT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpgt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BROADCASTSS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcastss_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_DIV_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_SHUFFLE_PS(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shuffle_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_INSERTI32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_inserti32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_RSQRT28_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt28_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MIN_ROUND_PS(a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_round_ps(${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASK_COMPRESSSTOREU_PS(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_compressstoreu_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_CONFLICT_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_conflict_epi64(${quote(a)})")
    case iDef@MM256_MASK_CVTEPU8_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ADDS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_adds_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPGT_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpgt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SHUFFLE_F32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_f32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MIN_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_min_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMP_EPI8_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_LOADU_EPI8(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_epi8(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASKZ_SCALEF_ROUND_PS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_scalef_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CVTTPS_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttps_epi64(${quote(a)})")
    case iDef@MM512_MASK_CMPLE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmple_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ROL_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rol_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_FMSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_SUB_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ADD_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_add_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMSUBADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_CVTEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi32_epi8(${quote(a)})")
    case iDef@MM_MASK_SET1_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_set1_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SCALEF_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_scalef_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MULHI_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mulhi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MOVELDUP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_moveldup_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_ROUND_SD(src, k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASKZ_SRA_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sra_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_INSERTF64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_insertf64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_CVTEPI64_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi64_ps(${quote(a)})")
    case iDef@MM512_TEST_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_ROR_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ror_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_SRA_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sra_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_SCALEF_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_scalef_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPLE_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPGT_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpgt_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_FPCLASS_PD_MASK(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fpclass_pd_mask(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPLT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MOVEDUP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_movedup_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_ROL_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rol_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SRL_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srl_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASKZ_ROL_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rol_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_FNMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_CVTEPU8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu8_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXTRACTI64X4_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti64x4_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTT_ROUNDSD_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_CMPGT_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_LZCNT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_lzcnt_epi32(${quote(a)})")
    case iDef@MM_RCP14_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp14_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SHUFFLEHI_EPI16(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_shufflehi_epi16(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_ADDS_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_adds_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_REDUCE_ROUND_PS(k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_reduce_round_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTSEPI16_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtsepi16_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMPLE_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOV_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mov_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_DBSAD_EPU8(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_dbsad_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SLL_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sll_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_expandloadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_SUB_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sub_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_BROADCASTQ_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastq_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_OR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_or_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVT_ROUNDPD_EPU64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundpd_epu64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_MOV_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mov_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_SUB_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RCP14_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rcp14_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_EXTRACTI64X2_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_extracti64x2_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MULHRS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTUSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtusepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_ABS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_abs_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTSEPI32_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtsepi32_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_ADD_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_RSQRT14_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rsqrt14_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MULHRS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_mulhrs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVTSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASKZ_SLL_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sll_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MIN_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_DIV_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi64_epi32(${quote(a)})")
    case iDef@MM256_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi8(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDSS_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CMPEQ_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpeq_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RORV_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rorv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SQRT_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPD_EPU32(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundpd_epu32(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MULLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mullo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU8_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu8_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_ADD_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_add_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMSUB_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASKZ_MIN_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_MAX_EPU8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epu8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTEPI64_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtepi64_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_CVTEPU64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK3_FNMSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_PERMUTEXVAR_EPI16(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case iDef@MM256_CVTTPD_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvttpd_epi64(${quote(a)})")
    case iDef@MM256_MADD52HI_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_madd52hi_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case _ => super.emitNode(sym, rhs)
  }
}
