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

    
trait AVX51204 extends IntrinsicsBase {
  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_CVTTPS_EPU64(a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m512, imm8: int
   */
  case class MM512_MASK_EXTRACTF32X4_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a single-precision (32-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * 
   * 	[round_note]
   * a: __m128, b: unsigned __int64, rounding: int
   */
  case class MM_CVT_ROUNDU64_SS(a: Exp[__m128], b: Exp[ULong], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKLO_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m256d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_GETMANT_PD(a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKLO_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_MAX_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128d to type __m512d; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128d
   */
  case class MM512_CASTPD128_PD512(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store 512-bits (composed of 8 packed double-precision (64-bit) floating-point
   * elements) from "a" into memory using a non-temporal memory hint. 
   * 	"mem_addr"
   * must be aligned on a 64-byte boundary or a general-protection exception may be
   * generated.
   * mem_addr: void*, a: __m512d, mem_addrOffset: int
   */
  case class MM512_STREAM_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 8-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI32X8_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_COMPRESSSTOREU_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPI32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 2 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MIN_EPU32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 32-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ANDNOT_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed minimum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASKZ_MIN_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_AVG_EPU8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPNEQ_EPU16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, idx: __m128i, a: __m128i
   */
  case class MM_MASK_PERMUTEXVAR_EPI8(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPU64_PS(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
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
   * 	[round_note]
   * src: __m256, k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU64_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k1" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM_MASK_CMP_EPI64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128d
   */
  case class MM512_BROADCAST_F64X2(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, b: __m128i, c: __m128i
   */
  case class MM_MASK_MADD52HI_EPU64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 256 bits (composed of 8 packed single-precision
   * (32-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m256, imm8: int
   */
  case class MM512_MASK_INSERTF32X8(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_SQRT_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_MOVEDUP_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PERMUTEX2VAR_EPI16(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "c" when mask bit 0 is not set), and copy the
   * upper 3 packed elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FNMSUB_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_SCALEF_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * 	[round_note]
   * k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASKZ_ROUNDSCALE_ROUND_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPI16_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask16
   */
  case class MM512_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_MAX_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate odd-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_MOVEHDUP_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPU16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPLT_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed double-precision (64-bit) floating-point elements, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * k: __mmask8, a: __m256, sae: int
   */
  case class MM512_MASKZ_CVT_ROUNDPS_PD(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_SUBS_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI32_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMADDSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRAV_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst".
   * idx: __m128i, a: __m128i
   */
  case class MM_PERMUTEXVAR_EPI8(idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed single-precision (32-bit) floating-point elements in "b" from
   * packed single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_SUB_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_REDUCE_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512i with all elements set to zero.

   */
  case class MM512_SETZERO_EPI32() extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_DIV_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed 32-bit integers from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCAST_I32X2(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CVTTPD_EPI32(a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Return vector of type __m512d with undefined elements.

   */
  case class MM512_UNDEFINED_PD() extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.GeneralSupport)
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
   * sign from compare result, 10 = clear sign bit, 11 = set sign
   * bit.
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_RANGE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m128i
   */
  case class MM512_MASK_BROADCASTW_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_MAX_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMSUBADD_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m128 to type __m512; the upper 384 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m128
   */
  case class MM512_CASTPS128_PS512(a: Exp[__m128]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM512_CVTEPI8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM512_MASKZ_CVTEPI8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTTPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in the low 4 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI16_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_EXPANDLOADU_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
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
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_TERNARYLOGIC_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed double-precision (64-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" must be aligned on a 16-byte boundary
   * or a general-protection exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m128d, mem_addrOffset: int
   */
  case class MM_MASK_STORE_PD[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract the lower double-precision (64-bit) floating-point element in "b"
   * from the lower double-precision (64-bit) floating-point element in "a", store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPI64_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m128i] {
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
   * maximum relative error for this approximation is less than 2^-14.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_RCP14_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512i, k: __mmask8, idx: __m512i, b: __m512i
   */
  case class MM512_MASK_PERMUTEX2VAR_EPI64(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note]
   * a: __m256, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM256_GETMANT_PS(a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_XOR_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI32_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a" using
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 64-bit integers in "a" and "b", producing intermediate
   * 128-bit integers, and store the low 64 bits of the intermediate integers in
   * "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_MULLO_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
  case class MM256_MASK_CVT_ROUNDPS_PH(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, idx: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PERMUTEX2VAR_EPI8(k: Exp[Long], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
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
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_GETEXP_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * unsigned saturation, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_PACKUS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers from "a" and "b" to packed 8-bit integers using
   * signed saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_PACKS_EPI16(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPD_EPU64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 32-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_I32X4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed double-precision (64-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * zeromask "k" (the element is zeroed out when mask bit 0 is not set), and copy
   * the upper element from "b" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_SCALEF_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FMADD_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_MASK_TERNARYLOGIC_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * src: __m128i, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I64GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 32-bit integers in "a" and "b", and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_XOR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 32-bit integers in "b" from packed 32-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_SUB_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 bytes of "a" to packed
   * 64-bit integers, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM512_MASKZ_CVTEPU8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ADDS_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI32_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * 	[getmant_note][round_note]
   * k: __mmask8, a: __m512d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASKZ_GETMANT_ROUND_PD(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 32-bit integers in "a" and "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_OR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_CVTTPD_EPU32(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTSEPI64_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPU64_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI16_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a single-precision (32-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: unsigned __int64
   */
  case class MM_CVTU64_SS(a: Exp[__m128], b: Exp[ULong]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the lower 2 packed single-precision (32-bit) floating-point elements
   * from "a" to all elements of "dst".
   * a: __m128
   */
  case class MM256_BROADCAST_F32X2(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MADD_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * base_addr: void*, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_I64SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 128-byte immediate result, shift the result
   * right by "count" 32-bit elements, and stores the low 64 bytes (16 elements) in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i, count: const int
   */
  case class MM512_MASKZ_ALIGNR_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_I64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, imm8: unsigned int
   */
  case class MM512_SRLI_EPI16(a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the left by the number
   * of bits specified in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask16, a: __m512i, imm8: const int
   */
  case class MM512_MASK_ROL_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 4 single-precision (32-bit) floating-point
   * elements) selected by "imm8" from "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASKZ_SHUFFLE_F32X4(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASK_OR_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FNMSUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI32X8_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_RORV_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI32_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each element.
   * k: __mmask8, a: __m256
   */
  case class MM256_MASKZ_GETEXP_PS(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for not-equal, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPNEQ_EPU8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 8-bit integers from "a" into "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i
   */
  case class MM_MASKZ_MOV_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ROLV_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_XOR_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed 32-bit integers from memory into "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASKZ_LOAD_EPI32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 64-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_U64(a: Exp[__m128]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs bitwise OR between "k1" and "k2", storing the result in "dst". CF
   * flag is set if "dst" consists of all 1's.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KORTESTC(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRLV_EPI16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * 	[getmant_note]
   * a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_SD(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 64-bit integers from "a" (those with their respective
   * bit set in mask "k"), and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_EXPAND_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_RORV_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 64-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_U64(a: Exp[__m128d]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SLLV_EPI16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed double-precision (64-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m256d, imm8: int
   */
  case class MM256_ROUNDSCALE_PD(a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using zeromask "k" (the element is zeroed out when mask bit 0 is not
   * set), and copy the upper element from "a" to the upper element of "dst". This
   * intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_GETEXP_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst".
   * a: __m512, b: __m512, imm8: const int
   */
  case class MM512_SHUFFLE_PS(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "c" when the
   * corresponding mask bit is not set).
   * a: __m256, b: __m256, c: __m256, k: __mmask8
   */
  case class MM256_MASK3_FMADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FNMSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADD_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_ADD_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 64-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_LZCNT_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower double-precision (64-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "src" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 		[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_ADD_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper element from "a" to
   * the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMADD_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m256i, imm8: int
   */
  case class MM256_EXTRACTI32X4_EPI32(a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "a"
   * when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FNMSUB_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI32_PS(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
  case class MM256_MASKZ_LOADU_EPI64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_DIV_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8 bits from masks "a" and "b", and store the 16-bit
   * result in "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KUNPACKB(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_MOVEDUP_PD(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_PS(a: Exp[__m256i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" within 256-bit lanes using the control in
   * "imm8", and store the results in "dst".
   * a: __m512i, imm8: const int
   */
  case class MM512_PERMUTEX_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point elements in "a" and
   * "b", store the maximum value in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_MAX_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 8-bit integers from "a" into "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i
   */
  case class MM512_MASK_MOV_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare the lower double-precision (64-bit) floating-point element in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the result
   * in mask vector "k".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_SD_MASK(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of 16-bit masks "a" and then AND with "b", and store
   * the result in "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KANDN(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 32-bit integer "b" to a single-precision (32-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: unsigned int
   */
  case class MM_CVTU32_SS(a: Exp[__m128], b: Exp[UInt]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 32-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM256_MOVM_EPI32(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k" using zeromask
   * "k1" (elements are zeroed out when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGE_EPU8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for greater-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPGT_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add the lower single-precision (32-bit) floating-point element in "a" and "b",
   * store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_ADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPU64_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRAV_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 32-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM256_MASKZ_CVTEPI8_EPI32(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_mask_min_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm_mask_cvtps_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPI32(src, k, a)
  }
            
  def _mm_cvttps_epu64(a: Exp[__m128]): Exp[__m128i] = {
    MM_CVTTPS_EPU64(a)
  }
            
  def _mm512_mask_extractf32x4_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_MASK_EXTRACTF32X4_PS(src, k, a, imm8)
  }
            
  def _mm_cvt_roundu64_ss(a: Exp[__m128], b: Exp[ULong], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDU64_SS(a, b, rounding)
  }
            
  def _mm_mask_max_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI64(src, k, a, b)
  }
            
  def _mm256_mask_unpacklo_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKLO_EPI8(src, k, a, b)
  }
            
  def _mm256_getmant_pd(a: Exp[__m256d], interv: Exp[Int], sc: Exp[Int]): Exp[__m256d] = {
    MM256_GETMANT_PD(a, interv, sc)
  }
            
  def _mm512_unpacklo_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKLO_EPI32(a, b)
  }
            
  def _mm512_max_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MAX_PD(a, b)
  }
            
  def _mm512_castpd128_pd512(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_CASTPD128_PD512(a)
  }
            
  def _mm512_stream_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], a: Exp[__m512d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM512_STREAM_PD(mem_addr, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtusepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI8(src, k, a)
  }
            
  def _mm512_mask_extracti32x8_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_EXTRACTI32X8_EPI32(src, k, a, imm8)
  }
            
  def _mm_mask_compressstoreu_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvttpd_epi32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTTPD_EPI32(k, a)
  }
            
  def _mm_mask_min_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_cvtepu8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU8_EPI64(k, a)
  }
            
  def _mm_maskz_cvtepi32_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI32_EPI16(k, a)
  }
            
  def _mm256_cmp_epi8_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI8_MASK(a, b, imm8)
  }
            
  def _mm_mask_min_epu32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MIN_EPU32(src, k, a, b)
  }
            
  def _mm_maskz_andnot_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ANDNOT_EPI32(k, a, b)
  }
            
  def _mm512_maskz_min_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_MIN_ROUND_PS(k, a, b, sae)
  }
            
  def _mm512_maskz_avg_epu8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm_mask_cmpneq_epu16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPNEQ_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_permutexvar_epi8(src: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEXVAR_EPI8(src, k, idx, a)
  }
            
  def _mm256_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m256i]): Exp[__m128] = {
    MM256_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm512_mask_cvt_roundepu64_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASK_CVT_ROUNDEPU64_PS(src, k, a, rounding)
  }
            
  def _mm_mask_cmp_epi64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_MASK_CMP_EPI64_MASK(k1, a, b, imm8)
  }
            
  def _mm512_broadcast_f64x2(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_BROADCAST_F64X2(a)
  }
            
  def _mm_mask_madd52hi_epu64(a: Exp[__m128i], k: Exp[Int], b: Exp[__m128i], c: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MADD52HI_EPU64(a, k, b, c)
  }
            
  def _mm512_mask_insertf32x8(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m256], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_INSERTF32X8(src, k, a, b, imm8)
  }
            
  def _mm512_maskz_sqrt_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_SQRT_PD(k, a)
  }
            
  def _mm_fmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FMSUB_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm_mask_cvtepi32_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128i]): Exp[__m128d] = {
    MM_MASK_CVTEPI32_PD(src, k, a)
  }
            
  def _mm512_mask_unpacklo_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_movedup_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MOVEDUP_PD(k, a)
  }
            
  def _mm256_maskz_permutex2var_epi16(k: Exp[Int], a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b)
  }
            
  def _mm_mask_fnmsub_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FNMSUB_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm512_scalef_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_SCALEF_PS(a, b)
  }
            
  def _mm512_maskz_roundscale_round_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ROUNDSCALE_ROUND_PS(k, a, imm8, rounding)
  }
            
  def _mm256_mask_cvtepi16_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_CVTEPI16_EPI64(src, k, a)
  }
            
  def _mm512_movm_epi32(k: Exp[Int]): Exp[__m512i] = {
    MM512_MOVM_EPI32(k)
  }
            
  def _mm_mask_max_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_MAX_EPI16(src, k, a, b)
  }
            
  def _mm_maskz_movehdup_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOVEHDUP_PS(k, a)
  }
            
  def _mm512_cmpeq_epu16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPU16_MASK(a, b)
  }
            
  def _mm256_cmplt_epi16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPLT_EPI16_MASK(a, b)
  }
            
  def _mm512_maskz_cvt_roundps_pd(k: Exp[Int], a: Exp[__m256], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_CVT_ROUNDPS_PD(k, a, sae)
  }
            
  def _mm256_maskz_subs_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SUBS_EPU16(k, a, b)
  }
            
  def _mm256_mask_cmpneq_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPU8_MASK(k1, a, b)
  }
            
  def _mm_test_epi32_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI32_MASK(a, b)
  }
            
  def _mm_mask3_fmaddsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm256_maskz_srav_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRAV_EPI32(k, a, count)
  }
            
  def _mm_permutexvar_epi8(idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEXVAR_EPI8(idx, a)
  }
            
  def _mm256_maskz_max_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU32(k, a, b)
  }
            
  def _mm256_mask_sub_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SUB_PS(src, k, a, b)
  }
            
  def _mm512_reduce_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_REDUCE_PS(a, imm8)
  }
            
  def _mm512_setzero_epi32(): Exp[__m512i] = {
    MM512_SETZERO_EPI32()
  }
            
  def _mm512_div_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_DIV_PS(a, b)
  }
            
  def _mm_mask_broadcast_i32x2(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCAST_I32X2(src, k, a)
  }
            
  def _mm512_cvttpd_epi32(a: Exp[__m512d]): Exp[__m256i] = {
    MM512_CVTTPD_EPI32(a)
  }
            
  def _mm512_undefined_pd(): Exp[__m512d] = {
    MM512_UNDEFINED_PD()
  }
            
  def _mm512_mask_range_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_RANGE_ROUND_PS(src, k, a, b, imm8, rounding)
  }
            
  def _mm512_mask_broadcastw_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCASTW_EPI16(src, k, a)
  }
            
  def _mm512_maskz_max_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_MAX_PD(k, a, b)
  }
            
  def _mm256_mask_fmsubadd_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm512_castps128_ps512(a: Exp[__m128]): Exp[__m512] = {
    MM512_CASTPS128_PS512(a)
  }
            
  def _mm512_cvtepi8_epi32(a: Exp[__m128i]): Exp[__m512i] = {
    MM512_CVTEPI8_EPI32(a)
  }
            
  def _mm512_maskz_cvtepi8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI8_EPI32(k, a)
  }
            
  def _mm512_mask_cvttpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTTPD_EPU32(src, k, a)
  }
            
  def _mm256_maskz_cvtusepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI32_EPI16(k, a)
  }
            
  def _mm_mask_cvtepi16_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPI16_EPI64(src, k, a)
  }
            
  def _mm_mask_expandloadu_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_ternarylogic_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8)
  }
            
  def _mm256_mask_blend_epi16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI16(k, a, b)
  }
            
  def _mm_mask_store_pd[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cmpeq_epi64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPI64_MASK(a, b)
  }
            
  def _mm_maskz_sub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SUB_SD(k, a, b)
  }
            
  def _mm512_maskz_cvtepi64_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m128i] = {
    MM512_MASKZ_CVTEPI64_EPI16(k, a)
  }
            
  def _mm_mask_rcp14_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_RCP14_SD(src, k, a, b)
  }
            
  def _mm512_mask_permutex2var_epi64(a: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b)
  }
            
  def _mm256_getmant_ps(a: Exp[__m256], interv: Exp[Int], sc: Exp[Int]): Exp[__m256] = {
    MM256_GETMANT_PS(a, interv, sc)
  }
            
  def _mm256_maskz_xor_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_XOR_EPI32(k, a, b)
  }
            
  def _mm256_cvtepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI32_EPI16(a)
  }
            
  def _mm_mask_cmplt_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPU32_MASK(k1, a, b)
  }
            
  def _mm_maskz_subs_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPI8(k, a, b)
  }
            
  def _mm256_mullo_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MULLO_EPI64(a, b)
  }
            
  def _mm256_mask_cvt_roundps_ph(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256], rounding: Exp[Int]): Exp[__m128i] = {
    MM256_MASK_CVT_ROUNDPS_PH(src, k, a, rounding)
  }
            
  def _mm512_maskz_permutex2var_epi8(k: Exp[Long], a: Exp[__m512i], idx: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b)
  }
            
  def _mm_maskz_getexp_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_GETEXP_SS(k, a, b)
  }
            
  def _mm_mask_packus_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PACKUS_EPI16(src, k, a, b)
  }
            
  def _mm512_maskz_packs_epi16(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_PACKS_EPI16(k, a, b)
  }
            
  def _mm512_maskz_cvtt_roundpd_epu64(k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPD_EPU64(k, a, sae)
  }
            
  def _mm512_mask_shuffle_i32x4(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_I32X4(src, k, a, b, imm8)
  }
            
  def _mm_maskz_scalef_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_SCALEF_SD(k, a, b)
  }
            
  def _mm_maskz_fmadd_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FMADD_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm256_mask_ternarylogic_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm_mmask_i64gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m128i], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(base_addr)(MM_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_xor_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_XOR_EPI32(src, k, a, b)
  }
            
  def _mm256_mask_sub_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SUB_EPI32(src, k, a, b)
  }
            
  def _mm512_maskz_cvtepu8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPU8_EPI64(k, a)
  }
            
  def _mm512_maskz_adds_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm256_cvtusepi32_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI32_EPI16(a)
  }
            
  def _mm512_maskz_getmant_round_pd(k: Exp[Int], a: Exp[__m512d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_GETMANT_ROUND_PD(k, a, interv, sc, rounding)
  }
            
  def _mm_mask_or_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_OR_EPI32(src, k, a, b)
  }
            
  def _mm256_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm_maskz_cvtsepi64_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTSEPI64_EPI32(k, a)
  }
            
  def _mm512_maskz_cvt_roundepu64_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_CVT_ROUNDEPU64_PS(k, a, rounding)
  }
            
  def _mm_cvtepi16_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI16_EPI8(a)
  }
            
  def _mm_cvtu64_ss(a: Exp[__m128], b: Exp[ULong]): Exp[__m128] = {
    MM_CVTU64_SS(a, b)
  }
            
  def _mm256_broadcast_f32x2(a: Exp[__m128]): Exp[__m256] = {
    MM256_BROADCAST_F32X2(a)
  }
            
  def _mm_maskz_madd_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MADD_EPI16(k, a, b)
  }
            
  def _mm_i64scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_alignr_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], count: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_ALIGNR_EPI32(k, a, b, count)
  }
            
  def _mm_cvttsd_i64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_I64(a)
  }
            
  def _mm_mask_cmpge_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPU64_MASK(k1, a, b)
  }
            
  def _mm_mask3_fnmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMADD_SD(a, b, c, k)
  }
            
  def _mm512_srli_epi16(a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_SRLI_EPI16(a, imm8)
  }
            
  def _mm512_mask_rol_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ROL_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_shuffle_f32x4(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_SHUFFLE_F32X4(k, a, b, imm8)
  }
            
  def _mm256_mask_or_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_OR_PS(src, k, a, b)
  }
            
  def _mm_maskz_fnmsub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FNMSUB_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_extracti32x8_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_EXTRACTI32X8_EPI32(k, a, imm8)
  }
            
  def _mm256_maskz_rorv_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_RORV_EPI64(k, a, b)
  }
            
  def _mm256_maskz_cvtsepi32_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI32_EPI16(k, a)
  }
            
  def _mm256_maskz_getexp_ps(k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_GETEXP_PS(k, a)
  }
            
  def _mm256_cmpneq_epu8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPNEQ_EPU8_MASK(a, b)
  }
            
  def _mm_maskz_mov_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MOV_EPI8(k, a)
  }
            
  def _mm512_mask_cmpgt_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPU16_MASK(k1, a, b)
  }
            
  def _mm_mask_rolv_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ROLV_EPI64(src, k, a, b)
  }
            
  def _mm_maskz_xor_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_XOR_PS(k, a, b)
  }
            
  def _mm256_maskz_load_epi32[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvttss_u64(a: Exp[__m128]): Exp[ULong] = {
    MM_CVTTSS_U64(a)
  }
            
  def _mm_maskz_sub_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI16(k, a, b)
  }
            
  def _mm512_kortestc(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTC(k1, k2)
  }
            
  def _mm256_maskz_srlv_epi16(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI16(k, a, count)
  }
            
  def _mm_getmant_sd(a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_GETMANT_SD(a, b, interv, sc)
  }
            
  def _mm_max_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPI64(a, b)
  }
            
  def _mm256_mask_expand_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_EXPAND_EPI64(src, k, a)
  }
            
  def _mm256_maskz_rorv_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_RORV_EPI32(k, a, b)
  }
            
  def _mm_cvttsd_u64(a: Exp[__m128d]): Exp[ULong] = {
    MM_CVTTSD_U64(a)
  }
            
  def _mm_maskz_sllv_epi16(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SLLV_EPI16(k, a, count)
  }
            
  def _mm256_roundscale_pd(a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_ROUNDSCALE_PD(a, imm8)
  }
            
  def _mm512_maskz_max_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPI64(k, a, b)
  }
            
  def _mm_maskz_getexp_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETEXP_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm512_shuffle_ps(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_SHUFFLE_PS(a, b, imm8)
  }
            
  def _mm256_mask3_fmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256], k: Exp[Int]): Exp[__m256] = {
    MM256_MASK3_FMADD_PS(a, b, c, k)
  }
            
  def _mm512_maskz_fnmsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FNMSUB_PS(k, a, b, c)
  }
            
  def _mm_mask_cvtepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm_mask_add_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_ADD_SS(src, k, a, b)
  }
            
  def _mm_mask_lzcnt_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_LZCNT_EPI64(src, k, a)
  }
            
  def _mm_mask_add_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_ADD_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_maskz_fmadd_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADD_SD(k, a, b, c)
  }
            
  def _mm256_extracti32x4_epi32(a: Exp[__m256i], imm8: Exp[Int]): Exp[__m128i] = {
    MM256_EXTRACTI32X4_EPI32(a, imm8)
  }
            
  def _mm256_mask_fnmsub_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FNMSUB_PD(a, k, b, c)
  }
            
  def _mm_maskz_cvtepi32_ps(k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASKZ_CVTEPI32_PS(k, a)
  }
            
  def _mm256_maskz_loadu_epi64[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_div_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_DIV_PD(src, k, a, b)
  }
            
  def _mm512_kunpackb(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KUNPACKB(a, b)
  }
            
  def _mm_maskz_movedup_pd(k: Exp[Int], a: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MOVEDUP_PD(k, a)
  }
            
  def _mm256_cvtepi64_ps(a: Exp[__m256i]): Exp[__m128] = {
    MM256_CVTEPI64_PS(a)
  }
            
  def _mm512_permutex_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_PERMUTEX_EPI64(a, imm8)
  }
            
  def _mm_mask_max_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_MAX_SD(src, k, a, b)
  }
            
  def _mm512_mask_mov_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI8(src, k, a)
  }
            
  def _mm_cmp_sd_mask(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_SD_MASK(a, b, imm8)
  }
            
  def _mm512_kandn(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KANDN(a, b)
  }
            
  def _mm_cvtu32_ss(a: Exp[__m128], b: Exp[UInt]): Exp[__m128] = {
    MM_CVTU32_SS(a, b)
  }
            
  def _mm256_movm_epi32(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI32(k)
  }
            
  def _mm512_mask_cmpge_epu8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPGE_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_cmpgt_epu64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPGT_EPU64_MASK(a, b)
  }
            
  def _mm_maskz_add_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_ADD_SS(k, a, b)
  }
            
  def _mm512_cvtepu64_ps(a: Exp[__m512i]): Exp[__m256] = {
    MM512_CVTEPU64_PS(a)
  }
            
  def _mm256_mask_srav_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRAV_EPI16(src, k, a, count)
  }
            
  def _mm256_maskz_cvtepi8_epi32(k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASKZ_CVTEPI8_EPI32(k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm256_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM_MASK_CVTPS_EPI32 (src, k, a) =>
      _mm_mask_cvtps_epi32(f(src), f(k), f(a))
    case MM_CVTTPS_EPU64 (a) =>
      _mm_cvttps_epu64(f(a))
    case MM512_MASK_EXTRACTF32X4_PS (src, k, a, imm8) =>
      _mm512_mask_extractf32x4_ps(f(src), f(k), f(a), f(imm8))
    case MM_CVT_ROUNDU64_SS (a, b, rounding) =>
      _mm_cvt_roundu64_ss(f(a), f(b), f(rounding))
    case MM_MASK_MAX_EPI64 (src, k, a, b) =>
      _mm_mask_max_epi64(f(src), f(k), f(a), f(b))
    case MM256_MASK_UNPACKLO_EPI8 (src, k, a, b) =>
      _mm256_mask_unpacklo_epi8(f(src), f(k), f(a), f(b))
    case MM256_GETMANT_PD (a, interv, sc) =>
      _mm256_getmant_pd(f(a), f(interv), f(sc))
    case MM512_UNPACKLO_EPI32 (a, b) =>
      _mm512_unpacklo_epi32(f(a), f(b))
    case MM512_MAX_PD (a, b) =>
      _mm512_max_pd(f(a), f(b))
    case MM512_CASTPD128_PD512 (a) =>
      _mm512_castpd128_pd512(f(a))
    case iDef@MM512_STREAM_PD (mem_addr, a, mem_addrOffset) =>
      _mm512_stream_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CVTUSEPI64_EPI8 (src, k, a) =>
      _mm_mask_cvtusepi64_epi8(f(src), f(k), f(a))
    case MM512_MASK_EXTRACTI32X8_EPI32 (src, k, a, imm8) =>
      _mm512_mask_extracti32x8_epi32(f(src), f(k), f(a), f(imm8))
    case iDef@MM_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_compressstoreu_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTTPD_EPI32 (k, a) =>
      _mm256_maskz_cvttpd_epi32(f(k), f(a))
    case MM_MASK_MIN_EPI16 (src, k, a, b) =>
      _mm_mask_min_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_CVTEPU8_EPI64 (k, a) =>
      _mm_maskz_cvtepu8_epi64(f(k), f(a))
    case MM_MASKZ_CVTEPI32_EPI16 (k, a) =>
      _mm_maskz_cvtepi32_epi16(f(k), f(a))
    case MM256_CMP_EPI8_MASK (a, b, imm8) =>
      _mm256_cmp_epi8_mask(f(a), f(b), f(imm8))
    case MM_MASK_MIN_EPU32 (src, k, a, b) =>
      _mm_mask_min_epu32(f(src), f(k), f(a), f(b))
    case MM_MASKZ_ANDNOT_EPI32 (k, a, b) =>
      _mm_maskz_andnot_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_MIN_ROUND_PS (k, a, b, sae) =>
      _mm512_maskz_min_round_ps(f(k), f(a), f(b), f(sae))
    case MM512_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm512_maskz_avg_epu8(f(k), f(a), f(b))
    case MM_MASK_CMPNEQ_EPU16_MASK (k1, a, b) =>
      _mm_mask_cmpneq_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a) =>
      _mm_mask_permutexvar_epi8(f(src), f(k), f(idx), f(a))
    case MM256_MASKZ_CVTEPU64_PS (k, a) =>
      _mm256_maskz_cvtepu64_ps(f(k), f(a))
    case MM512_MASK_CVT_ROUNDEPU64_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu64_ps(f(src), f(k), f(a), f(rounding))
    case MM_MASK_CMP_EPI64_MASK (k1, a, b, imm8) =>
      _mm_mask_cmp_epi64_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_BROADCAST_F64X2 (a) =>
      _mm512_broadcast_f64x2(f(a))
    case MM_MASK_MADD52HI_EPU64 (a, k, b, c) =>
      _mm_mask_madd52hi_epu64(f(a), f(k), f(b), f(c))
    case MM512_MASK_INSERTF32X8 (src, k, a, b, imm8) =>
      _mm512_mask_insertf32x8(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_SQRT_PD (k, a) =>
      _mm512_maskz_sqrt_pd(f(k), f(a))
    case MM_FMSUB_ROUND_SD (a, b, c, rounding) =>
      _mm_fmsub_round_sd(f(a), f(b), f(c), f(rounding))
    case MM_MASK_CVTEPI32_PD (src, k, a) =>
      _mm_mask_cvtepi32_pd(f(src), f(k), f(a))
    case MM512_MASK_UNPACKLO_EPI32 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_MOVEDUP_PD (k, a) =>
      _mm512_maskz_movedup_pd(f(k), f(a))
    case MM256_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b) =>
      _mm256_maskz_permutex2var_epi16(f(k), f(a), f(idx), f(b))
    case MM_MASK_FNMSUB_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fnmsub_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_SCALEF_PS (a, b) =>
      _mm512_scalef_ps(f(a), f(b))
    case MM512_MASKZ_ROUNDSCALE_ROUND_PS (k, a, imm8, rounding) =>
      _mm512_maskz_roundscale_round_ps(f(k), f(a), f(imm8), f(rounding))
    case MM256_MASK_CVTEPI16_EPI64 (src, k, a) =>
      _mm256_mask_cvtepi16_epi64(f(src), f(k), f(a))
    case MM512_MOVM_EPI32 (k) =>
      _mm512_movm_epi32(f(k))
    case MM_MASK_MAX_EPI16 (src, k, a, b) =>
      _mm_mask_max_epi16(f(src), f(k), f(a), f(b))
    case MM_MASKZ_MOVEHDUP_PS (k, a) =>
      _mm_maskz_movehdup_ps(f(k), f(a))
    case MM512_CMPEQ_EPU16_MASK (a, b) =>
      _mm512_cmpeq_epu16_mask(f(a), f(b))
    case MM256_CMPLT_EPI16_MASK (a, b) =>
      _mm256_cmplt_epi16_mask(f(a), f(b))
    case MM512_MASKZ_CVT_ROUNDPS_PD (k, a, sae) =>
      _mm512_maskz_cvt_roundps_pd(f(k), f(a), f(sae))
    case MM256_MASKZ_SUBS_EPU16 (k, a, b) =>
      _mm256_maskz_subs_epu16(f(k), f(a), f(b))
    case MM256_MASK_CMPNEQ_EPU8_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epu8_mask(f(k1), f(a), f(b))
    case MM_TEST_EPI32_MASK (a, b) =>
      _mm_test_epi32_mask(f(a), f(b))
    case MM_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM256_MASKZ_SRAV_EPI32 (k, a, count) =>
      _mm256_maskz_srav_epi32(f(k), f(a), f(count))
    case MM_PERMUTEXVAR_EPI8 (idx, a) =>
      _mm_permutexvar_epi8(f(idx), f(a))
    case MM256_MASKZ_MAX_EPU32 (k, a, b) =>
      _mm256_maskz_max_epu32(f(k), f(a), f(b))
    case MM256_MASK_SUB_PS (src, k, a, b) =>
      _mm256_mask_sub_ps(f(src), f(k), f(a), f(b))
    case MM512_REDUCE_PS (a, imm8) =>
      _mm512_reduce_ps(f(a), f(imm8))
    case MM512_SETZERO_EPI32 () =>
      _mm512_setzero_epi32()
    case MM512_DIV_PS (a, b) =>
      _mm512_div_ps(f(a), f(b))
    case MM_MASK_BROADCAST_I32X2 (src, k, a) =>
      _mm_mask_broadcast_i32x2(f(src), f(k), f(a))
    case MM512_CVTTPD_EPI32 (a) =>
      _mm512_cvttpd_epi32(f(a))
    case MM512_UNDEFINED_PD () =>
      _mm512_undefined_pd()
    case MM512_MASK_RANGE_ROUND_PS (src, k, a, b, imm8, rounding) =>
      _mm512_mask_range_round_ps(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM512_MASK_BROADCASTW_EPI16 (src, k, a) =>
      _mm512_mask_broadcastw_epi16(f(src), f(k), f(a))
    case MM512_MASKZ_MAX_PD (k, a, b) =>
      _mm512_maskz_max_pd(f(k), f(a), f(b))
    case MM256_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm256_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case MM512_CASTPS128_PS512 (a) =>
      _mm512_castps128_ps512(f(a))
    case MM512_CVTEPI8_EPI32 (a) =>
      _mm512_cvtepi8_epi32(f(a))
    case MM512_MASKZ_CVTEPI8_EPI32 (k, a) =>
      _mm512_maskz_cvtepi8_epi32(f(k), f(a))
    case MM512_MASK_CVTTPD_EPU32 (src, k, a) =>
      _mm512_mask_cvttpd_epu32(f(src), f(k), f(a))
    case MM256_MASKZ_CVTUSEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtusepi32_epi16(f(k), f(a))
    case MM_MASK_CVTEPI16_EPI64 (src, k, a) =>
      _mm_mask_cvtepi16_epi64(f(src), f(k), f(a))
    case iDef@MM_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_expandloadu_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8) =>
      _mm256_mask_ternarylogic_epi32(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASK_BLEND_EPI16 (k, a, b) =>
      _mm256_mask_blend_epi16(f(k), f(a), f(b))
    case iDef@MM_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset) =>
      _mm_mask_store_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CMPEQ_EPI64_MASK (a, b) =>
      _mm512_cmpeq_epi64_mask(f(a), f(b))
    case MM_MASKZ_SUB_SD (k, a, b) =>
      _mm_maskz_sub_sd(f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPI64_EPI16 (k, a) =>
      _mm512_maskz_cvtepi64_epi16(f(k), f(a))
    case MM_MASK_RCP14_SD (src, k, a, b) =>
      _mm_mask_rcp14_sd(f(src), f(k), f(a), f(b))
    case MM512_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b) =>
      _mm512_mask_permutex2var_epi64(f(a), f(k), f(idx), f(b))
    case MM256_GETMANT_PS (a, interv, sc) =>
      _mm256_getmant_ps(f(a), f(interv), f(sc))
    case MM256_MASKZ_XOR_EPI32 (k, a, b) =>
      _mm256_maskz_xor_epi32(f(k), f(a), f(b))
    case MM256_CVTEPI32_EPI16 (a) =>
      _mm256_cvtepi32_epi16(f(a))
    case MM_MASK_CMPLT_EPU32_MASK (k1, a, b) =>
      _mm_mask_cmplt_epu32_mask(f(k1), f(a), f(b))
    case MM_MASKZ_SUBS_EPI8 (k, a, b) =>
      _mm_maskz_subs_epi8(f(k), f(a), f(b))
    case MM256_MULLO_EPI64 (a, b) =>
      _mm256_mullo_epi64(f(a), f(b))
    case MM256_MASK_CVT_ROUNDPS_PH (src, k, a, rounding) =>
      _mm256_mask_cvt_roundps_ph(f(src), f(k), f(a), f(rounding))
    case MM512_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b) =>
      _mm512_maskz_permutex2var_epi8(f(k), f(a), f(idx), f(b))
    case MM_MASKZ_GETEXP_SS (k, a, b) =>
      _mm_maskz_getexp_ss(f(k), f(a), f(b))
    case MM_MASK_PACKUS_EPI16 (src, k, a, b) =>
      _mm_mask_packus_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_PACKS_EPI16 (k, a, b) =>
      _mm512_maskz_packs_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_CVTT_ROUNDPD_EPU64 (k, a, sae) =>
      _mm512_maskz_cvtt_roundpd_epu64(f(k), f(a), f(sae))
    case MM512_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_i32x4(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASKZ_SCALEF_SD (k, a, b) =>
      _mm_maskz_scalef_sd(f(k), f(a), f(b))
    case MM_MASKZ_FMADD_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fmadd_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm256_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case iDef@MM_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_XOR_EPI32 (src, k, a, b) =>
      _mm_mask_xor_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASK_SUB_EPI32 (src, k, a, b) =>
      _mm256_mask_sub_epi32(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_CVTEPU8_EPI64 (k, a) =>
      _mm512_maskz_cvtepu8_epi64(f(k), f(a))
    case MM512_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm512_maskz_adds_epi16(f(k), f(a), f(b))
    case MM256_CVTUSEPI32_EPI16 (a) =>
      _mm256_cvtusepi32_epi16(f(a))
    case MM512_MASKZ_GETMANT_ROUND_PD (k, a, interv, sc, rounding) =>
      _mm512_maskz_getmant_round_pd(f(k), f(a), f(interv), f(sc), f(rounding))
    case MM_MASK_OR_EPI32 (src, k, a, b) =>
      _mm_mask_or_epi32(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm256_maskz_cvttpd_epu32(f(k), f(a))
    case MM_MASKZ_CVTSEPI64_EPI32 (k, a) =>
      _mm_maskz_cvtsepi64_epi32(f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPU64_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepu64_ps(f(k), f(a), f(rounding))
    case MM_CVTEPI16_EPI8 (a) =>
      _mm_cvtepi16_epi8(f(a))
    case MM_CVTU64_SS (a, b) =>
      _mm_cvtu64_ss(f(a), f(b))
    case MM256_BROADCAST_F32X2 (a) =>
      _mm256_broadcast_f32x2(f(a))
    case MM_MASKZ_MADD_EPI16 (k, a, b) =>
      _mm_maskz_madd_epi16(f(k), f(a), f(b))
    case iDef@MM_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm_i64scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_ALIGNR_EPI32 (k, a, b, count) =>
      _mm512_maskz_alignr_epi32(f(k), f(a), f(b), f(count))
    case MM_CVTTSD_I64 (a) =>
      _mm_cvttsd_i64(f(a))
    case MM_MASK_CMPGE_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmpge_epu64_mask(f(k1), f(a), f(b))
    case MM_MASK3_FNMADD_SD (a, b, c, k) =>
      _mm_mask3_fnmadd_sd(f(a), f(b), f(c), f(k))
    case MM512_SRLI_EPI16 (a, imm8) =>
      _mm512_srli_epi16(f(a), f(imm8))
    case MM512_MASK_ROL_EPI32 (src, k, a, imm8) =>
      _mm512_mask_rol_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8) =>
      _mm512_maskz_shuffle_f32x4(f(k), f(a), f(b), f(imm8))
    case MM256_MASK_OR_PS (src, k, a, b) =>
      _mm256_mask_or_ps(f(src), f(k), f(a), f(b))
    case MM_MASKZ_FNMSUB_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fnmsub_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_EXTRACTI32X8_EPI32 (k, a, imm8) =>
      _mm512_maskz_extracti32x8_epi32(f(k), f(a), f(imm8))
    case MM256_MASKZ_RORV_EPI64 (k, a, b) =>
      _mm256_maskz_rorv_epi64(f(k), f(a), f(b))
    case MM256_MASKZ_CVTSEPI32_EPI16 (k, a) =>
      _mm256_maskz_cvtsepi32_epi16(f(k), f(a))
    case MM256_MASKZ_GETEXP_PS (k, a) =>
      _mm256_maskz_getexp_ps(f(k), f(a))
    case MM256_CMPNEQ_EPU8_MASK (a, b) =>
      _mm256_cmpneq_epu8_mask(f(a), f(b))
    case MM_MASKZ_MOV_EPI8 (k, a) =>
      _mm_maskz_mov_epi8(f(k), f(a))
    case MM512_MASK_CMPGT_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epu16_mask(f(k1), f(a), f(b))
    case MM_MASK_ROLV_EPI64 (src, k, a, b) =>
      _mm_mask_rolv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASKZ_XOR_PS (k, a, b) =>
      _mm_maskz_xor_ps(f(k), f(a), f(b))
    case iDef@MM256_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_load_epi32(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVTTSS_U64 (a) =>
      _mm_cvttss_u64(f(a))
    case MM_MASKZ_SUB_EPI16 (k, a, b) =>
      _mm_maskz_sub_epi16(f(k), f(a), f(b))
    case MM512_KORTESTC (k1, k2) =>
      _mm512_kortestc(f(k1), f(k2))
    case MM256_MASKZ_SRLV_EPI16 (k, a, count) =>
      _mm256_maskz_srlv_epi16(f(k), f(a), f(count))
    case MM_GETMANT_SD (a, b, interv, sc) =>
      _mm_getmant_sd(f(a), f(b), f(interv), f(sc))
    case MM_MAX_EPI64 (a, b) =>
      _mm_max_epi64(f(a), f(b))
    case MM256_MASK_EXPAND_EPI64 (src, k, a) =>
      _mm256_mask_expand_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_RORV_EPI32 (k, a, b) =>
      _mm256_maskz_rorv_epi32(f(k), f(a), f(b))
    case MM_CVTTSD_U64 (a) =>
      _mm_cvttsd_u64(f(a))
    case MM_MASKZ_SLLV_EPI16 (k, a, count) =>
      _mm_maskz_sllv_epi16(f(k), f(a), f(count))
    case MM256_ROUNDSCALE_PD (a, imm8) =>
      _mm256_roundscale_pd(f(a), f(imm8))
    case MM512_MASKZ_MAX_EPI64 (k, a, b) =>
      _mm512_maskz_max_epi64(f(k), f(a), f(b))
    case MM_MASKZ_GETEXP_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_getexp_round_sd(f(k), f(a), f(b), f(rounding))
    case MM512_SHUFFLE_PS (a, b, imm8) =>
      _mm512_shuffle_ps(f(a), f(b), f(imm8))
    case MM256_MASK3_FMADD_PS (a, b, c, k) =>
      _mm256_mask3_fmadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MASKZ_FNMSUB_PS (k, a, b, c) =>
      _mm512_maskz_fnmsub_ps(f(k), f(a), f(b), f(c))
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASK_ADD_SS (src, k, a, b) =>
      _mm_mask_add_ss(f(src), f(k), f(a), f(b))
    case MM_MASK_LZCNT_EPI64 (src, k, a) =>
      _mm_mask_lzcnt_epi64(f(src), f(k), f(a))
    case MM_MASK_ADD_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_add_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_FMADD_SD (k, a, b, c) =>
      _mm_maskz_fmadd_sd(f(k), f(a), f(b), f(c))
    case MM256_EXTRACTI32X4_EPI32 (a, imm8) =>
      _mm256_extracti32x4_epi32(f(a), f(imm8))
    case MM256_MASK_FNMSUB_PD (a, k, b, c) =>
      _mm256_mask_fnmsub_pd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_CVTEPI32_PS (k, a) =>
      _mm_maskz_cvtepi32_ps(f(k), f(a))
    case iDef@MM256_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset) =>
      _mm256_maskz_loadu_epi64(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_DIV_PD (src, k, a, b) =>
      _mm256_mask_div_pd(f(src), f(k), f(a), f(b))
    case MM512_KUNPACKB (a, b) =>
      _mm512_kunpackb(f(a), f(b))
    case MM_MASKZ_MOVEDUP_PD (k, a) =>
      _mm_maskz_movedup_pd(f(k), f(a))
    case MM256_CVTEPI64_PS (a) =>
      _mm256_cvtepi64_ps(f(a))
    case MM512_PERMUTEX_EPI64 (a, imm8) =>
      _mm512_permutex_epi64(f(a), f(imm8))
    case MM_MASK_MAX_SD (src, k, a, b) =>
      _mm_mask_max_sd(f(src), f(k), f(a), f(b))
    case MM512_MASK_MOV_EPI8 (src, k, a) =>
      _mm512_mask_mov_epi8(f(src), f(k), f(a))
    case MM_CMP_SD_MASK (a, b, imm8) =>
      _mm_cmp_sd_mask(f(a), f(b), f(imm8))
    case MM512_KANDN (a, b) =>
      _mm512_kandn(f(a), f(b))
    case MM_CVTU32_SS (a, b) =>
      _mm_cvtu32_ss(f(a), f(b))
    case MM256_MOVM_EPI32 (k) =>
      _mm256_movm_epi32(f(k))
    case MM512_MASK_CMPGE_EPU8_MASK (k1, a, b) =>
      _mm512_mask_cmpge_epu8_mask(f(k1), f(a), f(b))
    case MM512_CMPGT_EPU64_MASK (a, b) =>
      _mm512_cmpgt_epu64_mask(f(a), f(b))
    case MM_MASKZ_ADD_SS (k, a, b) =>
      _mm_maskz_add_ss(f(k), f(a), f(b))
    case MM512_CVTEPU64_PS (a) =>
      _mm512_cvtepu64_ps(f(a))
    case MM256_MASK_SRAV_EPI16 (src, k, a, count) =>
      _mm256_mask_srav_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASKZ_CVTEPI8_EPI32 (k, a) =>
      _mm256_maskz_cvtepi8_epi32(f(k), f(a))

    case Reflect(MM256_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPS_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPS_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF32X4_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF32X4_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKLO_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKLO_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETMANT_PD (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_GETMANT_PD (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPD128_PD512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPD128_PD512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_STREAM_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_STREAM_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI32X8_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI32X8_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_COMPRESSSTOREU_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI8_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI8_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MIN_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MIN_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ANDNOT_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ANDNOT_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_ROUND_PS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_ROUND_PS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPNEQ_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPNEQ_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEXVAR_EPI8 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEXVAR_EPI8 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU64_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU64_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMP_EPI64_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMP_EPI64_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCAST_F64X2 (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCAST_F64X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MADD52HI_EPU64 (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MADD52HI_EPU64 (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INSERTF32X8 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INSERTF32X8 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SQRT_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SQRT_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MOVEDUP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MOVEDUP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI16 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEX2VAR_EPI16 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PS (k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_ROUND_PS (f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPI16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM512_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVEHDUP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVEHDUP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPLT_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPLT_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_PD (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_PD (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUBS_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUBS_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI32_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI32_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEXVAR_EPI8 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEXVAR_EPI8 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETZERO_EPI32 (), u, es) =>
      reflectMirrored(Reflect(MM512_SETZERO_EPI32 (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCAST_I32X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCAST_I32X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPD_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPD_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNDEFINED_PD (), u, es) =>
      reflectMirrored(Reflect(MM512_UNDEFINED_PD (), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RANGE_ROUND_PS (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RANGE_ROUND_PS (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCASTW_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCASTW_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS128_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS128_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_EXPANDLOADU_EPI64 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_EXPANDLOADU_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TERNARYLOGIC_EPI32 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_STORE_PD (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_STORE_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RCP14_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RCP14_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEX2VAR_EPI64 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEX2VAR_EPI64 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_GETMANT_PS (a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM256_GETMANT_PS (f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_XOR_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_XOR_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MULLO_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MULLO_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVT_ROUNDPS_PH (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVT_ROUNDPS_PH (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI8 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTEX2VAR_EPI8 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PACKUS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PACKUS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PACKS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PACKS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU64 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPD_EPU64 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_I32X4 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_I32X4 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SCALEF_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SCALEF_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SUB_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SUB_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_ROUND_PD (k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_ROUND_PD (f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_OR_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_OR_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPU64_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI16_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI16_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU64_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU64_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F32X2 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F32X2 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MADD_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MADD_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_I64SCATTER_PS (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_I64SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ALIGNR_EPI32 (k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ALIGNR_EPI32 (f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRLI_EPI16 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SRLI_EPI16 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROL_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROL_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SHUFFLE_F32X4 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SHUFFLE_F32X4 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_OR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_OR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMSUB_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMSUB_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI32X8_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI32X8_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RORV_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RORV_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI32_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI32_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_GETEXP_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_GETEXP_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPNEQ_EPU8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPNEQ_EPU8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ROLV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ROLV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_XOR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_XOR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOAD_EPI32 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOAD_EPI32 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTC (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTC (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_SD (a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_SD (f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RORV_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RORV_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SLLV_EPI16 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SLLV_EPI16 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ROUNDSCALE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_ROUNDSCALE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETEXP_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETEXP_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SHUFFLE_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_SHUFFLE_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK3_FMADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM256_MASK3_FMADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_LZCNT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LZCNT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADD_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADD_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXTRACTI32X4_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_EXTRACTI32X4_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FNMSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FNMSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASKZ_LOADU_EPI64 (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LOADU_EPI64 (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_DIV_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_DIV_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KUNPACKB (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KUNPACKB (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOVEDUP_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOVEDUP_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEX_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEX_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_MAX_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_MAX_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_SD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_SD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KANDN (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KANDN (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU32_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU32_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI32 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI32 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGE_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGE_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPGT_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPGT_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU64_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU64_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAV_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAV_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPI8_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPI8_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51204 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_MASK_MIN_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTPS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtps_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTTPS_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttps_epu64(${quote(a)})")
    case iDef@MM512_MASK_EXTRACTF32X4_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extractf32x4_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVT_ROUNDU64_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_MAX_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_UNPACKLO_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpacklo_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_GETMANT_PD(a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_getmant_pd(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_UNPACKLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpacklo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MAX_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CASTPD128_PD512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castpd128_pd512(${quote(a)})")
    case iDef@MM512_STREAM_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_stream_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)});")
    case iDef@MM_MASK_CVTUSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXTRACTI32X8_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti32x8_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_compressstoreu_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_CVTTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_MIN_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPU8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu8_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMP_EPI8_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epi8_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_MIN_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_min_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ANDNOT_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_andnot_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MIN_ROUND_PS(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_AVG_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPNEQ_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpneq_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_PERMUTEXVAR_EPI8(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutexvar_epi8(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTEPU64_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDEPU64_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepu64_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_CMP_EPI64_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmp_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_BROADCAST_F64X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcast_f64x2(${quote(a)})")
    case iDef@MM_MASK_MADD52HI_EPU64(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_madd52hi_epu64(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_INSERTF32X8(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_insertf32x8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SQRT_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sqrt_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_FMSUB_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTEPI32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_UNPACKLO_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_MOVEDUP_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_movedup_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_PERMUTEX2VAR_EPI16(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutex2var_epi16(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_FNMSUB_ROUND_SS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmsub_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_SCALEF_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scalef_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ROUNDSCALE_ROUND_PS(k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_roundscale_round_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTEPI16_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepi16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MOVM_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movm_epi32(${quote(k)})")
    case iDef@MM_MASK_MAX_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MOVEHDUP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_movehdup_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CMPEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPLT_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmplt_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPS_PD(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_pd(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM256_MASKZ_SUBS_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_subs_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPNEQ_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TEST_EPI32_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_epi32_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FMADDSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM256_MASKZ_SRAV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srav_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_PERMUTEXVAR_EPI8(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutexvar_epi8(${quote(idx)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MAX_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SUB_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_REDUCE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_SETZERO_EPI32() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setzero_epi32()")
    case iDef@MM512_DIV_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BROADCAST_I32X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcast_i32x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTTPD_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttpd_epi32(${quote(a)})")
    case iDef@MM512_UNDEFINED_PD() =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_undefined_pd()")
    case iDef@MM512_MASK_RANGE_ROUND_PS(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_range_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_BROADCASTW_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcastw_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_MAX_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_FMSUBADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_CASTPS128_PS512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps128_ps512(${quote(a)})")
    case iDef@MM512_CVTEPI8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi8_epi32(${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPI8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi8_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTTPD_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_CVTUSEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CVTEPI16_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_EXPANDLOADU_EPI64(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_expandloadu_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_ternarylogic_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_BLEND_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_blend_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_STORE_PD(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_store_pd((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_CMPEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SUB_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_RCP14_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rcp14_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEX2VAR_EPI64(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutex2var_epi64(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_GETMANT_PS(a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_getmant_ps(${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASKZ_XOR_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_xor_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi32_epi16(${quote(a)})")
    case iDef@MM_MASK_CMPLT_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SUBS_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_subs_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MULLO_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mullo_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CVT_ROUNDPS_PH(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvt_roundps_ph(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_PERMUTEX2VAR_EPI8(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permutex2var_epi8(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASKZ_GETEXP_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getexp_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_PACKUS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_packus_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PACKS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_packs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPD_EPU64(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundpd_epu64(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_SHUFFLE_I32X4(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_i32x4(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_SCALEF_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_scalef_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FMADD_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MMASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i64gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASK_XOR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_xor_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SUB_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sub_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPU8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu8_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_ADDS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTUSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi32_epi16(${quote(a)})")
    case iDef@MM512_MASKZ_GETMANT_ROUND_PD(k, a, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getmant_round_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM_MASK_OR_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_or_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtsepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPU64_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepu64_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTEPI16_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi16_epi8(${quote(a)})")
    case iDef@MM_CVTU64_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu64_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM256_BROADCAST_F32X2(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_f32x2(${quote(a)})")
    case iDef@MM_MASKZ_MADD_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_madd_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_I64SCATTER_PS(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_i64scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_ALIGNR_EPI32(k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_alignr_epi32(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_CVTTSD_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_i64(${quote(a)})")
    case iDef@MM_MASK_CMPGE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMADD_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_SRLI_EPI16(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srli_epi16(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_ROL_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rol_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SHUFFLE_F32X4(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_shuffle_f32x4(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_OR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_or_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FNMSUB_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmsub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_EXTRACTI32X8_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti32x8_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_RORV_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rorv_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTSEPI32_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtsepi32_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_GETEXP_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_getexp_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPNEQ_EPU8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpneq_epu8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MOV_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPGT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpgt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_ROLV_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_rolv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_XOR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_xor_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_LOAD_EPI32(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_load_epi32(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTTSS_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_u64(${quote(a)})")
    case iDef@MM_MASKZ_SUB_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_KORTESTC(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kortestc(${quote(k1)}, ${quote(k2)})")
    case iDef@MM256_MASKZ_SRLV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srlv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_GETMANT_SD(a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getmant_sd(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_MAX_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_EXPAND_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expand_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_RORV_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rorv_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTSD_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_u64(${quote(a)})")
    case iDef@MM_MASKZ_SLLV_EPI16(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sllv_epi16(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_ROUNDSCALE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_roundscale_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MAX_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_GETEXP_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getexp_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_SHUFFLE_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_shuffle_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK3_FMADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask3_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASKZ_FNMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_CVTEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASKZ_FMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK_ADD_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_LZCNT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_lzcnt_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ADD_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_add_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMADD_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_EXTRACTI32X4_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_extracti32x4_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_FNMSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fnmsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_CVTEPI32_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi32_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_LOADU_EPI64(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_loadu_epi64(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_DIV_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_div_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_KUNPACKB(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kunpackb(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_MOVEDUP_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_movedup_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_CVTEPI64_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi64_ps(${quote(a)})")
    case iDef@MM512_PERMUTEX_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutex_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_MAX_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_max_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MOV_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_SD_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_sd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_KANDN(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kandn(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTU32_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu32_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MOVM_EPI32(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movm_epi32(${quote(k)})")
    case iDef@MM512_MASK_CMPGE_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpge_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPGT_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpgt_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ADD_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPU64_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu64_ps(${quote(a)})")
    case iDef@MM256_MASK_SRAV_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srav_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASKZ_CVTEPI8_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepi8_epi32(${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
