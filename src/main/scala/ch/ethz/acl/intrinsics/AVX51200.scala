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

    
trait AVX51200 extends IntrinsicsBase {
  /**
   * Shuffle 64-bit integers in "a" across lanes lanes using the control in "imm8",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, imm8: const int
   */
  case class MM256_MASK_PERMUTEX_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * 	[round_note]
   * a: __m512, b: __m512, imm8: int, rounding: int
   */
  case class MM512_RANGE_ROUND_PS(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m128i, base_addrOffset: int
   */
  case class MM_MASK_CVTSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m256 to type __m512; the upper 256 bits of the result
   * are undefined. 
   * 	This intrinsic is only used for compilation and does not
   * generate any instructions, thus it has zero latency.
   * a: __m256
   */
  case class MM512_CASTPS256_PS512(a: Exp[__m256]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Bitwise ternary logic that provides the capability to implement any
   * three-operand binary function; the specific binary function is specified by
   * value in "imm8". For each bit in each packed 64-bit integer, the corresponding
   * bit from "a", "b", and "c" are used to form a 3 bit index into "imm8", and the
   * value at that bit in "imm8" is written to the corresponding bit in "dst".
   * a: __m256i, b: __m256i, c: __m256i, imm8: int
   */
  case class MM256_TERNARYLOGIC_EPI64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using writemask "k" (elements are copied from "a" when the
   * corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMADD_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MASKZ_MADD52LO_EPU64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
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
   * 	[getmant_note][round_note]
   * k: __mmask16, a: __m512, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM512_MASKZ_GETMANT_ROUND_PS(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256, k: __mmask8, b: __m256, c: __m256
   */
  case class MM256_MASK_FMADDSUB_PS(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each bit of mask register "k" based on the most significant bit of the
   * corresponding packed 64-bit integer in "a".
   * a: __m512i
   */
  case class MM512_MOVEPI64_MASK(a: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
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
  case class MM_MASKZ_CVTPS_PH(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed unsigned 16-bit integers in "a" and "b" using saturation, and store
   * the results in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_ADDS_EPU16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set packed single-precision (32-bit) floating-point elements in "dst" with the
   * supplied values in reverse order.
   * e15: float, e14: float, e13: float, e12: float, e11: float, e10: float, e9: float, e8: float, e7: float, e6: float, e5: float, e4: float, e3: float, e2: float, e1: float, e0: float
   */
  case class MM512_SETR_PS(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FNMADD_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * k: __mmask8, a: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_PD(k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for less-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPI16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 2 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPI8_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASKZ_GETEXP_ROUND_PD(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 8 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF32X8_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed 64-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI64X2_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave single-precision (32-bit) floating-point elements from
   * the low half of each 128-bit lane in "a" and "b", and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_UNPACKLO_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, idx: __m256i, a: __m256i
   */
  case class MM256_MASKZ_PERMUTEXVAR_EPI16(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 64-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STORE_EPI64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLT_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
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
   * k: __mmask8, a: __m256, b: __m256, c: __m256
   */
  case class MM256_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for not-equal, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPNEQ_EPI32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_CVTPD_EPI32(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "mem_addr" must be aligned on a 32-byte
   * boundary or a general-protection exception may be generated.
   * src: __m256, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256] {
    val category = List(IntrinsicsCategory.Load)
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
  case class MM_CVT_ROUNDSI64_SD(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed 16-bit integers with
   * unsigned saturation, and store the active results (those with their respective
   * bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTUSEPI32_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256
   */
  case class MM512_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx".
   * idx: __m256i, a: __m256
   */
  case class MM256_PERMUTEXVAR_PS(idx: Exp[__m256i], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower double-precision (64-bit) floating-point
   * element in "a", store the result in the lower element of "dst" using zeromask
   * "k" (the element is zeroed out when mask bit 0 is not set), and copy the upper
   * element from "b" to the upper element of "dst". This intrinsic essentially
   * calculates "±(2^k)*|x.significand|", where "k" depends on the interval range
   * defined by "interv" and the sign depends on "sc" and the source
   * sign.
   * 	[getmant_note][round_note]
   * k: __mmask8, a: __m128d, b: __m128d, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM, rounding: int
   */
  case class MM_MASKZ_GETMANT_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SRLV_EPI64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FNMADD_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPI32_EPI64(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_EXTRACTF32X4_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed 64-bit integers in "a" and then AND with
   * "b", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_ANDNOT_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask16, a: __m512, imm8: int
   */
  case class MM512_MASKZ_ROUNDSCALE_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using writemask "k" (elements
   * are copied from "a" when the corresponding mask bit is not set).
   * a: __m128i, k: __mmask8, idx: __m128i, b: __m128i
   */
  case class MM_MASK_PERMUTEX2VAR_EPI16(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const _MM_CMPINT_ENUM
   */
  case class MM256_CMP_EPI32_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). [round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FNMADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_XOR_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k1" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPGT_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
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
   * src: __m512i, k: __mmask8, a: __m512i
   */
  case class MM512_MASK_CONFLICT_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_COMPRESS_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 128-bits (composed of 2 64-bit integers) selected by "imm8" from "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_SHUFFLE_I64X2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m256, imm8: int
   */
  case class MM256_MASK_EXTRACTF32X4_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_BROADCASTQ_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI64(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 64-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CONFLICT_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low double-precision (64-bit) floating-point element from "a" to
   * all elements of "dst".
   * a: __m128d
   */
  case class MM512_BROADCASTSD_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise XOR of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_XOR_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask32, a: __m128i
   */
  case class MM256_MASK_BROADCASTB_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_LZCNT_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Cast vector of type __m512 to type __m128. 
   * 	This intrinsic is only used for
   * compilation and does not generate any instructions, thus it has zero latency.
   * a: __m512
   */
  case class MM512_CASTPS512_PS128(a: Exp[__m512]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Cast)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i
   */
  case class MM512_MASKZ_CVTEPI16_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs bitwise OR between "k1" and "k2", storing the result in "dst". ZF
   * flag is set if "dst" is 0.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KORTESTZ(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTPS_EPU32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_SCALEF_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * src: __m256d, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTEPU64_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTUSEPI32_EPI16(a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
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
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMSUB_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_SUBS_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * src: __m512i, k: __mmask8, vindex: __m256i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in zeromask "k") to
   * "dst", and set the remaining elements to zero.
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_COMPRESS_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Concatenate "a" and "b" into a 32-byte immediate result, shift the result
   * right by "count" 32-bit elements, and store the low 16 bytes (4 elements) in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, count: const int
   */
  case class MM_MASK_ALIGNR_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MUL_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_PACKUS_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
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
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMSUB_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate 32-bit
   * integers. Horizontally add adjacent pairs of intermediate 32-bit integers, and
   * pack the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MADD_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, idx: __m512i, a: __m512i
   */
  case class MM512_MASK_PERMUTEXVAR_EPI64(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed double-precision (64-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_ADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPI32_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask32, a: char
   */
  case class MM256_MASK_SET1_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[Byte]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst".
   * a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_PERMUTEX2VAR_EPI8(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed single-precision (32-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF32X4_PS(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
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
  case class MM512_MASKZ_CVT_ROUNDPS_PH(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 8-bit integers in "a" within 128-bit lanes using the control in the
   * corresponding 8-bit element of "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SHUFFLE_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MAX_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for the lower double-precision (64-bit) floating-point element in "a"
   * and "b", store the result in the lower element of "dst" using writemask "k"
   * (the element is copied from "src" when mask bit 0 is not set), and copy the
   * upper element from "a" to the upper element of "dst".
   * 	imm8[1:0] specifies the
   * operation control: 00 = min, 01 = max, 10 = absolute max, 11 = absolute
   * min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 = sign from
   * compare result, 10 = clear sign bit, 11 = set sign bit.
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int, rounding: int
   */
  case class MM_MASK_RANGE_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * src: __m128i, k: __mmask8, a: __m128i, b: __m128i, imm8: int
   */
  case class MM_MASK_TERNARYLOGIC_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed double-precision (64-bit)
   * floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI64_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set each packed 64-bit integer in "dst" to all ones or all zeros based on the
   * value of the corresponding bit in "k".
   * k: __mmask8
   */
  case class MM256_MOVM_EPI64(k: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed single-precision (32-bit) floating-point elements in "a" and "b",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_ADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
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
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FNMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision (32-bit) floating-point number
   * representing the integer exponent, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). This intrinsic essentially calculates "floor(log2(x))" for each
   * element.
   * 	[round_note]
   * k: __mmask16, a: __m512, rounding: int
   */
  case class MM512_MASKZ_GETEXP_ROUND_PS(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_CMP_PD_MASK(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask32, a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_MASK_CMP_EPU8_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTSEPI32_EPI16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * 	[round_note]
   * a: __m512, b: __m512, rounding: int
   */
  case class MM512_DIV_ROUND_PS(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUB_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_OR_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed double-precision (64-bit) floating-point elements in "b" from
   * packed double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASKZ_SUB_PD(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLT_EPU64_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 		[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MUL_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_REDUCE_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask16, a: __m512, b: __m512, sae: int
   */
  case class MM512_MASKZ_MAX_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter single-precision (32-bit) floating-point elements from "a" into memory
   * using 32-bit indices. 32-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale") subject to mask "k" (elements are not stored
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_PS[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" left by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, count: __m128i
   */
  case class MM512_MASK_SLL_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
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
   * src: __m128i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CVTUSEPI64_EPI8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for greater-than, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPGT_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Gather single-precision (32-bit) floating-point elements from memory using
   * 32-bit indices. 32-bit elements are loaded from addresses starting at
   * "base_addr" and offset by each 32-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). Gathered elements are merged into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * src: __m128, k: __mmask8, vindex: __m128i, base_addr: void const*, scale: const int, base_addrOffset: int
   */
  case class MM_MMASK_I32GATHER_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements using the control in
   * "imm8", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_MASKZ_SHUFFLE_PD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 64-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTTPD_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_SUBS_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FNMADD_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i, imm8: int
   */
  case class MM512_MASK_TERNARYLOGIC_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 2 packed 64-bit integers from "a" to all elements of "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m128i
   */
  case class MM512_MASK_BROADCAST_I64X2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
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
   * [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: const int
   */
  case class MM512_MASK3_FMADDSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTUSEPI64_EPI16(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed single-precision (32-bit) floating-point elements from "a" into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_MOV_PS(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculate the max, min, absolute max, or absolute min (depending on control in
   * "imm8") for packed double-precision (64-bit) floating-point elements in "a"
   * and "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	imm8[1:0]
   * specifies the operation control: 00 = min, 01 = max, 10 = absolute max, 11 =
   * absolute min.
   * 	imm8[3:2] specifies the sign control: 00 = sign from a, 01 =
   * sign from compare result, 10 = clear sign bit, 11 = set sign bit.
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, imm8: int
   */
  case class MM_MASK_RANGE_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASK_SRLI_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active 32-bit integers from unaligned memory at "mem_addr"
   * (those with their respective bit set in mask "k"), and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_EXPANDLOADU_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MULLO_EPI32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed single-precision (32-bit)
   * floating-point elements, and store the results in "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPI64_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 16-bit masks "a" and "b", and store the result in
   * "k".
   * a: __mmask16, b: __mmask16
   */
  case class MM512_KAND(a: Exp[Int], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i
   */
  case class MM512_MASKZ_ABS_EPI16(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx".
   * idx: __m512i, a: __m512
   */
  case class MM512_PERMUTEXVAR_PS(idx: Exp[__m512i], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, imm8: unsigned int
   */
  case class MM512_MASK_SRLI_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPU32_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set). Each element's
   * comparison forms a zero extended bit vector in "dst".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_CONFLICT_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i
   */
  case class MM_MASKZ_CVTEPU32_EPI64(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "b" to a
   * double-precision (64-bit) floating-point element, store the result in the
   * lower element of "dst", and copy the upper element from "a" to the upper
   * element of "dst". 
   * 	[round_note]
   * a: __m128d, b: __m128, rounding: int
   */
  case class MM_CVT_ROUNDSS_SD(a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * [round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASK_FMSUBADD_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed 64-bit integers in "a" and "b", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_OR_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_EXP2A23_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Normalize the mantissas of the lower single-precision (32-bit) floating-point
   * element in "a", store the result in the lower element of "dst", and copy the
   * upper 3 packed elements from "b" to the upper elements of "dst". This
   * intrinsic essentially calculates "±(2^k)*|x.significand|", where "k" depends
   * on the interval range defined by "interv" and the sign depends on "sc" and the
   * source sign.
   * 	[getmant_note]
   * a: __m128, b: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_GETMANT_SS(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, count: __m128i
   */
  case class MM512_MASKZ_SRL_EPI32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" using the corresponding index in "idx", and
   * store the results in "dst".
   * idx: __m128i, a: __m128i
   */
  case class MM_PERMUTEXVAR_EPI16(idx: Exp[__m128i], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in writemask "k") to "dst", and pass through the remaining
   * elements from "src".
   * src: __m256i, k: __mmask8, a: __m256i
   */
  case class MM256_MASK_COMPRESS_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128i, imm8: int, rounding: int
   */
  case class MM_FIXUPIMM_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed single-precision (32-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128, imm8: int
   */
  case class MM_MASK_REDUCE_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper element
   * from "a" to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_MUL_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTSEPI64_STOREU_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_ROR_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FMSUB_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m256d
   */
  case class MM256_MASKZ_RCP14_PD(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRLV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers with truncation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_CVTTPD_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 8-bit integers in "a" and "b", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AVG_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b"
   * across lanes using the corresponding selector and index in "idx", and store
   * the results in "dst" using writemask "k" (elements are copied from "a" when
   * the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, idx: __m256i, b: __m256d
   */
  case class MM256_MASK_PERMUTEX2VAR_PD(a: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FNMADD_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask16, a: __m512, b: __m512, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_FIXUPIMM_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKHI_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_AND_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-28.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_RCP28_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM256_LZCNT_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTEPU32_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 16-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTEPI16_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Average packed unsigned 16-bit integers in "a" and "b", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_AVG_EPU16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 16-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASK_SRLI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed 32-bit integers from "a" into memory using writemask
   * "k".
   * 	"mem_addr" must be aligned on a 32-byte boundary or a general-protection
   * exception may be generated.
   * mem_addr: void*, k: __mmask8, a: __m256i, mem_addrOffset: int
   */
  case class MM256_MASK_STORE_EPI32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
  case class MM256_MASKZ_CVTTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_AND_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_SQRT_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_UNPACKHI_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "idx" when the corresponding
   * mask bit is not set)
   * a: __m128d, idx: __m128i, k: __mmask8, b: __m128d
   */
  case class MM_MASK2_PERMUTEX2VAR_PD(a: Exp[__m128d], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI64_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" across lanes using the corresponding index in
   * "idx", and store the results in "dst".
   * idx: __m512i, a: __m512i
   */
  case class MM512_PERMUTEXVAR_EPI32(idx: Exp[__m512i], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 64-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst".
   * a: __m512i, count: __m128i
   */
  case class MM512_SRL_EPI64(a: Exp[__m512i], count: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed single-precision (32-bit) floating-point elements from
   * "a" to all elements of "dst".
   * a: __m128
   */
  case class MM256_BROADCAST_F32X4(a: Exp[__m128]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256i, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CVTPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_MAX_EPU8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for not-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPNEQ_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_mask_permutex_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX_EPI64(src, k, a, imm8)
  }
            
  def _mm512_range_round_ps(a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_RANGE_ROUND_PS(a, b, imm8, rounding)
  }
            
  def _mm_mask_cvtsepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m128i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_castps256_ps512(a: Exp[__m256]): Exp[__m512] = {
    MM512_CASTPS256_PS512(a)
  }
            
  def _mm256_ternarylogic_epi64(a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_TERNARYLOGIC_EPI64(a, b, c, imm8)
  }
            
  def _mm256_mask_fmadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMADD_PD(a, k, b, c)
  }
            
  def _mm512_maskz_madd52lo_epu64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MADD52LO_EPU64(k, a, b, c)
  }
            
  def _mm512_maskz_getmant_round_ps(k: Exp[Int], a: Exp[__m512], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETMANT_ROUND_PS(k, a, interv, sc, rounding)
  }
            
  def _mm256_mask_fmaddsub_ps(a: Exp[__m256], k: Exp[Int], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm512_movepi64_mask(a: Exp[__m512i]): Exp[Int] = {
    MM512_MOVEPI64_MASK(a)
  }
            
  def _mm_maskz_cvtps_ph(k: Exp[Int], a: Exp[__m128], rounding: Exp[Int]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_PH(k, a, rounding)
  }
            
  def _mm_mask_adds_epu16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_ADDS_EPU16(src, k, a, b)
  }
            
  def _mm512_setr_ps(e15: Exp[Float], e14: Exp[Float], e13: Exp[Float], e12: Exp[Float], e11: Exp[Float], e10: Exp[Float], e9: Exp[Float], e8: Exp[Float], e7: Exp[Float], e6: Exp[Float], e5: Exp[Float], e4: Exp[Float], e3: Exp[Float], e2: Exp[Float], e1: Exp[Float], e0: Exp[Float]): Exp[__m512] = {
    MM512_SETR_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0)
  }
            
  def _mm256_maskz_fnmadd_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FNMADD_PS(k, a, b, c)
  }
            
  def _mm_maskz_getmant_pd(k: Exp[Int], a: Exp[__m128d], interv: Exp[Int], sc: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_PD(k, a, interv, sc)
  }
            
  def _mm256_mask_cmplt_epi16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPI16_MASK(k1, a, b)
  }
            
  def _mm_maskz_cvtepi8_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPI8_EPI64(k, a)
  }
            
  def _mm512_maskz_getexp_round_pd(k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_GETEXP_ROUND_PD(k, a, rounding)
  }
            
  def _mm512_maskz_extractf32x8_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m256] = {
    MM512_MASKZ_EXTRACTF32X8_PS(k, a, imm8)
  }
            
  def _mm512_extracti64x2_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_EXTRACTI64X2_EPI64(a, imm8)
  }
            
  def _mm512_mask_unpacklo_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_UNPACKLO_PS(src, k, a, b)
  }
            
  def _mm256_maskz_permutexvar_epi16(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PERMUTEXVAR_EPI16(k, idx, a)
  }
            
  def _mm256_mask_store_epi64[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_min_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPI8(src, k, a, b)
  }
            
  def _mm256_mask_cmplt_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLT_EPU32_MASK(k1, a, b)
  }
            
  def _mm256_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm256_mask_cmpneq_epi32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPNEQ_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvtpd_epi32(k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASKZ_CVTPD_EPI32(k, a)
  }
            
  def _mm256_mask_load_ps[A[_], T:Typ, U:Integral](src: Exp[__m256], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.read(mem_addr)(MM256_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_cvt_roundsi64_sd(a: Exp[__m128d], b: Exp[Long], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDSI64_SD(a, b, rounding)
  }
            
  def _mm512_mask_cvtusepi32_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm256_permutexvar_ps(idx: Exp[__m256i], a: Exp[__m256]): Exp[__m256] = {
    MM256_PERMUTEXVAR_PS(idx, a)
  }
            
  def _mm_maskz_getmant_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], interv: Exp[Int], sc: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_GETMANT_ROUND_SD(k, a, b, interv, sc, rounding)
  }
            
  def _mm256_maskz_srlv_epi64(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SRLV_EPI64(k, a, count)
  }
            
  def _mm_mask_fnmadd_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FNMADD_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm512_cvtepi32_epi64(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPI32_EPI64(a)
  }
            
  def _mm512_extractf32x4_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_EXTRACTF32X4_PS(a, imm8)
  }
            
  def _mm512_maskz_andnot_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ANDNOT_EPI64(k, a, b)
  }
            
  def _mm512_maskz_roundscale_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_ROUNDSCALE_PS(k, a, imm8)
  }
            
  def _mm_mask_permutex2var_epi16(a: Exp[__m128i], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b)
  }
            
  def _mm256_cmp_epi32_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI32_MASK(a, b, imm8)
  }
            
  def _mm512_maskz_fnmadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FNMADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm_mask_xor_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_XOR_PD(src, k, a, b)
  }
            
  def _mm512_mask_cmpgt_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPGT_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_mask_conflict_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_CONFLICT_EPI64(src, k, a)
  }
            
  def _mm_maskz_compress_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_COMPRESS_EPI64(k, a)
  }
            
  def _mm256_mask_shuffle_i64x2(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_MASK_SHUFFLE_I64X2(src, k, a, b, imm8)
  }
            
  def _mm256_mask_extractf32x4_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m256], imm8: Exp[Int]): Exp[__m128] = {
    MM256_MASK_EXTRACTF32X4_PS(src, k, a, imm8)
  }
            
  def _mm256_mask_broadcastq_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTQ_EPI64(src, k, a)
  }
            
  def _mm512_permutexvar_epi64(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI64(idx, a)
  }
            
  def _mm_mask_conflict_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CONFLICT_EPI64(src, k, a)
  }
            
  def _mm512_broadcastsd_pd(a: Exp[__m128d]): Exp[__m512d] = {
    MM512_BROADCASTSD_PD(a)
  }
            
  def _mm512_maskz_xor_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_XOR_EPI64(k, a, b)
  }
            
  def _mm256_mask_broadcastb_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_BROADCASTB_EPI8(src, k, a)
  }
            
  def _mm_mask_cmpge_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPI32_MASK(k1, a, b)
  }
            
  def _mm512_mask_lzcnt_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_LZCNT_EPI32(src, k, a)
  }
            
  def _mm512_castps512_ps128(a: Exp[__m512]): Exp[__m128] = {
    MM512_CASTPS512_PS128(a)
  }
            
  def _mm512_maskz_cvtepi16_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m512i] = {
    MM512_MASKZ_CVTEPI16_EPI32(k, a)
  }
            
  def _mm512_kortestz(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTZ(k1, k2)
  }
            
  def _mm512_maskz_cvtps_epu32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTPS_EPU32(k, a)
  }
            
  def _mm512_scalef_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SCALEF_ROUND_PS(a, b, rounding)
  }
            
  def _mm256_mask_cvtepu64_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_CVTEPU64_PD(src, k, a)
  }
            
  def _mm512_cvtusepi32_epi16(a: Exp[__m512i]): Exp[__m256i] = {
    MM512_CVTUSEPI32_EPI16(a)
  }
            
  def _mm_mask3_fmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_SD(a, b, c, k)
  }
            
  def _mm_mask_subs_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_SUBS_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_i32gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m256i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(base_addr)(MM512_MASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_compress_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_COMPRESS_PS(k, a)
  }
            
  def _mm_mask_alignr_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_MASK_ALIGNR_EPI32(src, k, a, b, count)
  }
            
  def _mm_maskz_mul_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MUL_EPI32(k, a, b)
  }
            
  def _mm256_maskz_packus_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_PACKUS_EPI32(k, a, b)
  }
            
  def _mm_mask_fnmsub_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMSUB_SS(a, k, b, c)
  }
            
  def _mm512_madd_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD_EPI16(a, b)
  }
            
  def _mm512_mask_permutexvar_epi64(src: Exp[__m512i], k: Exp[Int], idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_PERMUTEXVAR_EPI64(src, k, idx, a)
  }
            
  def _mm512_maskz_unpackhi_epi16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI16(k, a, b)
  }
            
  def _mm512_maskz_add_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_ADD_PD(k, a, b)
  }
            
  def _mm_mask_cvtepi32_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128i]): Exp[__m128] = {
    MM_MASK_CVTEPI32_PS(src, k, a)
  }
            
  def _mm256_mask_cvtepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_set1_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[Byte]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI8(src, k, a)
  }
            
  def _mm_permutex2var_epi8(a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEX2VAR_EPI8(a, idx, b)
  }
            
  def _mm512_maskz_extractf32x4_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_MASKZ_EXTRACTF32X4_PS(k, a, imm8)
  }
            
  def _mm512_maskz_cvt_roundps_ph(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_CVT_ROUNDPS_PH(k, a, rounding)
  }
            
  def _mm512_mask_shuffle_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SHUFFLE_EPI8(src, k, a, b)
  }
            
  def _mm_cmpeq_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPEQ_EPU64_MASK(a, b)
  }
            
  def _mm256_mask_max_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MAX_EPI64(src, k, a, b)
  }
            
  def _mm_mask_range_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RANGE_ROUND_SD(src, k, a, b, imm8, rounding)
  }
            
  def _mm_mask_ternarylogic_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8)
  }
            
  def _mm256_cvtepi64_pd(a: Exp[__m256i]): Exp[__m256d] = {
    MM256_CVTEPI64_PD(a)
  }
            
  def _mm256_movm_epi64(k: Exp[Int]): Exp[__m256i] = {
    MM256_MOVM_EPI64(k)
  }
            
  def _mm512_maskz_add_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_ADD_PS(k, a, b)
  }
            
  def _mm_test_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI16_MASK(a, b)
  }
            
  def _mm_mask3_fnmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FNMADD_SS(a, b, c, k)
  }
            
  def _mm512_maskz_getexp_round_ps(k: Exp[Int], a: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_GETEXP_ROUND_PS(k, a, rounding)
  }
            
  def _mm256_mask_cvtusepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI16(src, k, a)
  }
            
  def _mm_cmp_pd_mask(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[Int] = {
    MM_CMP_PD_MASK(a, b, imm8)
  }
            
  def _mm256_mask_cmp_epu8_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_EPU8_MASK(k1, a, b, imm8)
  }
            
  def _mm512_mask_cvtsepi32_epi16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASK_CVTSEPI32_EPI16(src, k, a)
  }
            
  def _mm512_div_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_DIV_ROUND_PS(a, b, rounding)
  }
            
  def _mm_maskz_sub_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm512_mask_or_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_OR_PS(src, k, a, b)
  }
            
  def _mm256_maskz_sub_pd(k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_SUB_PD(k, a, b)
  }
            
  def _mm512_cmplt_epu64_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPLT_EPU64_MASK(a, b)
  }
            
  def _mm_mul_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MUL_ROUND_SD(a, b, rounding)
  }
            
  def _mm512_reduce_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_REDUCE_PD(a, imm8)
  }
            
  def _mm512_maskz_max_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], sae: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_MAX_ROUND_PS(k, a, b, sae)
  }
            
  def _mm_mask_i32scatter_ps[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_sll_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_SLL_EPI16(src, k, a, count)
  }
            
  def _mm256_mask_cvtusepi64_epi8(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASK_CVTUSEPI64_EPI8(src, k, a)
  }
            
  def _mm256_cmpgt_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPGT_EPI64_MASK(a, b)
  }
            
  def _mm_mmask_i32gather_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], vindex: Exp[__m128i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(base_addr)(MM_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_shuffle_pd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_SHUFFLE_PD(k, a, b, imm8)
  }
            
  def _mm_mask_cvttpd_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASK_CVTTPD_EPI64(src, k, a)
  }
            
  def _mm512_subs_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_SUBS_EPI16(a, b)
  }
            
  def _mm_maskz_fnmadd_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FNMADD_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm512_mask_ternarylogic_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8)
  }
            
  def _mm512_mask_broadcast_i64x2(src: Exp[__m512i], k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASK_BROADCAST_I64X2(src, k, a)
  }
            
  def _mm512_mask3_fmaddsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADDSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm256_maskz_cvtusepi64_epi16(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTUSEPI64_EPI16(k, a)
  }
            
  def _mm_maskz_mov_ps(k: Exp[Int], a: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MOV_PS(k, a)
  }
            
  def _mm_mask_range_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_RANGE_PD(src, k, a, b, imm8)
  }
            
  def _mm_mask_srli_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI32(src, k, a, imm8)
  }
            
  def _mm256_mask_expandloadu_epi32[A[_], T:Typ, U:Integral](src: Exp[__m256i], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.read(mem_addr)(MM256_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_mullo_epi32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MULLO_EPI32(k, a, b)
  }
            
  def _mm512_cvt_roundepi64_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m256] = {
    MM512_CVT_ROUNDEPI64_PS(a, rounding)
  }
            
  def _mm512_kand(a: Exp[Int], b: Exp[Int]): Exp[Int] = {
    MM512_KAND(a, b)
  }
            
  def _mm512_maskz_abs_epi16(k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_ABS_EPI16(k, a)
  }
            
  def _mm512_permutexvar_ps(idx: Exp[__m512i], a: Exp[__m512]): Exp[__m512] = {
    MM512_PERMUTEXVAR_PS(idx, a)
  }
            
  def _mm512_mask_srli_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[UInt]): Exp[__m512i] = {
    MM512_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_mask_cmple_epu32_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPU32_MASK(k1, a, b)
  }
            
  def _mm256_maskz_div_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm256_mask_conflict_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_CONFLICT_EPI32(src, k, a)
  }
            
  def _mm_maskz_cvtepu32_epi64(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_CVTEPU32_EPI64(k, a)
  }
            
  def _mm_cvt_roundss_sd(a: Exp[__m128d], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDSS_SD(a, b, rounding)
  }
            
  def _mm512_mask_fmsubadd_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMSUBADD_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_or_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_OR_EPI64(k, a, b)
  }
            
  def _mm512_maskz_exp2a23_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_EXP2A23_PS(k, a)
  }
            
  def _mm_getmant_ss(a: Exp[__m128], b: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_GETMANT_SS(a, b, interv, sc)
  }
            
  def _mm512_maskz_srl_epi32(k: Exp[Int], a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_SRL_EPI32(k, a, count)
  }
            
  def _mm_permutexvar_epi16(idx: Exp[__m128i], a: Exp[__m128i]): Exp[__m128i] = {
    MM_PERMUTEXVAR_EPI16(idx, a)
  }
            
  def _mm256_mask_compress_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_COMPRESS_EPI32(src, k, a)
  }
            
  def _mm_fixupimm_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_ROUND_SD(a, b, c, imm8, rounding)
  }
            
  def _mm_mask_reduce_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_REDUCE_PS(src, k, a, imm8)
  }
            
  def _mm_maskz_mul_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_MUL_SD(k, a, b)
  }
            
  def _mm256_maskz_max_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPI64(k, a, b)
  }
            
  def _mm512_mask_cvtsepi64_storeu_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_ror_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_ROR_EPI32(a, imm8)
  }
            
  def _mm_mask_fmsub_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FMSUB_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm256_maskz_rcp14_pd(k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_RCP14_PD(k, a)
  }
            
  def _mm256_mask_srlv_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRLV_EPI32(src, k, a, count)
  }
            
  def _mm256_mask_cvttpd_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m256d]): Exp[__m128i] = {
    MM256_MASK_CVTTPD_EPI32(src, k, a)
  }
            
  def _mm256_maskz_avg_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AVG_EPU8(k, a, b)
  }
            
  def _mm256_mask_permutex2var_pd(a: Exp[__m256d], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_PERMUTEX2VAR_PD(a, k, idx, b)
  }
            
  def _mm_mask_fnmadd_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FNMADD_SS(a, k, b, c)
  }
            
  def _mm512_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm512_mask_unpackhi_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKHI_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_and_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_AND_EPI64(k, a, b)
  }
            
  def _mm512_mask_rcp28_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_RCP28_PD(src, k, a)
  }
            
  def _mm256_lzcnt_epi32(a: Exp[__m256i]): Exp[__m256i] = {
    MM256_LZCNT_EPI32(a)
  }
            
  def _mm256_mask_cvtepu32_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m128i]): Exp[__m256d] = {
    MM256_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm256_mask_cvtepi16_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_avg_epu16(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_AVG_EPU16(src, k, a, b)
  }
            
  def _mm_mask_srli_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SRLI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_mask_store_epi32[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_maskz_cvttps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m256i] = {
    MM256_MASKZ_CVTTPS_EPU64(k, a)
  }
            
  def _mm512_and_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_AND_PD(a, b)
  }
            
  def _mm256_mask_sqrt_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_SQRT_PD(src, k, a)
  }
            
  def _mm256_mask_unpackhi_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_UNPACKHI_EPI64(src, k, a, b)
  }
            
  def _mm_mask2_permutex2var_pd(a: Exp[__m128d], idx: Exp[__m128i], k: Exp[Int], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK2_PERMUTEX2VAR_PD(a, idx, k, b)
  }
            
  def _mm256_cmpeq_epi64_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI64_MASK(a, b)
  }
            
  def _mm512_permutexvar_epi32(idx: Exp[__m512i], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_PERMUTEXVAR_EPI32(idx, a)
  }
            
  def _mm512_srl_epi64(a: Exp[__m512i], count: Exp[__m128i]): Exp[__m512i] = {
    MM512_SRL_EPI64(a, count)
  }
            
  def _mm256_broadcast_f32x4(a: Exp[__m128]): Exp[__m256] = {
    MM256_BROADCAST_F32X4(a)
  }
            
  def _mm512_mask_cvtpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d]): Exp[__m256i] = {
    MM512_MASK_CVTPD_EPU32(src, k, a)
  }
            
  def _mm_maskz_max_epu8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm_cmpneq_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPNEQ_EPU64_MASK(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASK_PERMUTEX_EPI64 (src, k, a, imm8) =>
      _mm256_mask_permutex_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_RANGE_ROUND_PS (a, b, imm8, rounding) =>
      _mm512_range_round_ps(f(a), f(b), f(imm8), f(rounding))
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm_mask_cvtsepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CASTPS256_PS512 (a) =>
      _mm512_castps256_ps512(f(a))
    case MM256_TERNARYLOGIC_EPI64 (a, b, c, imm8) =>
      _mm256_ternarylogic_epi64(f(a), f(b), f(c), f(imm8))
    case MM256_MASK_FMADD_PD (a, k, b, c) =>
      _mm256_mask_fmadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_MADD52LO_EPU64 (k, a, b, c) =>
      _mm512_maskz_madd52lo_epu64(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_GETMANT_ROUND_PS (k, a, interv, sc, rounding) =>
      _mm512_maskz_getmant_round_ps(f(k), f(a), f(interv), f(sc), f(rounding))
    case MM256_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm256_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case MM512_MOVEPI64_MASK (a) =>
      _mm512_movepi64_mask(f(a))
    case MM_MASKZ_CVTPS_PH (k, a, rounding) =>
      _mm_maskz_cvtps_ph(f(k), f(a), f(rounding))
    case MM_MASK_ADDS_EPU16 (src, k, a, b) =>
      _mm_mask_adds_epu16(f(src), f(k), f(a), f(b))
    case MM512_SETR_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      _mm512_setr_ps(f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0))
    case MM256_MASKZ_FNMADD_PS (k, a, b, c) =>
      _mm256_maskz_fnmadd_ps(f(k), f(a), f(b), f(c))
    case MM_MASKZ_GETMANT_PD (k, a, interv, sc) =>
      _mm_maskz_getmant_pd(f(k), f(a), f(interv), f(sc))
    case MM256_MASK_CMPLT_EPI16_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epi16_mask(f(k1), f(a), f(b))
    case MM_MASKZ_CVTEPI8_EPI64 (k, a) =>
      _mm_maskz_cvtepi8_epi64(f(k), f(a))
    case MM512_MASKZ_GETEXP_ROUND_PD (k, a, rounding) =>
      _mm512_maskz_getexp_round_pd(f(k), f(a), f(rounding))
    case MM512_MASKZ_EXTRACTF32X8_PS (k, a, imm8) =>
      _mm512_maskz_extractf32x8_ps(f(k), f(a), f(imm8))
    case MM512_EXTRACTI64X2_EPI64 (a, imm8) =>
      _mm512_extracti64x2_epi64(f(a), f(imm8))
    case MM512_MASK_UNPACKLO_PS (src, k, a, b) =>
      _mm512_mask_unpacklo_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a) =>
      _mm256_maskz_permutexvar_epi16(f(k), f(idx), f(a))
    case iDef@MM256_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_epi64(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MIN_EPI8 (src, k, a, b) =>
      _mm256_mask_min_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASK_CMPLT_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmplt_epu32_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm256_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM256_MASK_CMPNEQ_EPI32_MASK (k1, a, b) =>
      _mm256_mask_cmpneq_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVTPD_EPI32 (k, a) =>
      _mm512_maskz_cvtpd_epi32(f(k), f(a))
    case iDef@MM256_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_load_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_CVT_ROUNDSI64_SD (a, b, rounding) =>
      _mm_cvt_roundsi64_sd(f(a), f(b), f(rounding))
    case iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi32_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm512_maskz_cvttps_epu64(f(k), f(a))
    case MM256_PERMUTEXVAR_PS (idx, a) =>
      _mm256_permutexvar_ps(f(idx), f(a))
    case MM_MASKZ_GETMANT_ROUND_SD (k, a, b, interv, sc, rounding) =>
      _mm_maskz_getmant_round_sd(f(k), f(a), f(b), f(interv), f(sc), f(rounding))
    case MM256_MASKZ_SRLV_EPI64 (k, a, count) =>
      _mm256_maskz_srlv_epi64(f(k), f(a), f(count))
    case MM_MASK_FNMADD_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fnmadd_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_CVTEPI32_EPI64 (a) =>
      _mm512_cvtepi32_epi64(f(a))
    case MM512_EXTRACTF32X4_PS (a, imm8) =>
      _mm512_extractf32x4_ps(f(a), f(imm8))
    case MM512_MASKZ_ANDNOT_EPI64 (k, a, b) =>
      _mm512_maskz_andnot_epi64(f(k), f(a), f(b))
    case MM512_MASKZ_ROUNDSCALE_PS (k, a, imm8) =>
      _mm512_maskz_roundscale_ps(f(k), f(a), f(imm8))
    case MM_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b) =>
      _mm_mask_permutex2var_epi16(f(a), f(k), f(idx), f(b))
    case MM256_CMP_EPI32_MASK (a, b, imm8) =>
      _mm256_cmp_epi32_mask(f(a), f(b), f(imm8))
    case MM512_MASKZ_FNMADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fnmadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASK_XOR_PD (src, k, a, b) =>
      _mm_mask_xor_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_CMPGT_EPI64_MASK (k1, a, b) =>
      _mm512_mask_cmpgt_epi64_mask(f(k1), f(a), f(b))
    case MM512_MASK_CONFLICT_EPI64 (src, k, a) =>
      _mm512_mask_conflict_epi64(f(src), f(k), f(a))
    case MM_MASKZ_COMPRESS_EPI64 (k, a) =>
      _mm_maskz_compress_epi64(f(k), f(a))
    case MM256_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8) =>
      _mm256_mask_shuffle_i64x2(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_MASK_EXTRACTF32X4_PS (src, k, a, imm8) =>
      _mm256_mask_extractf32x4_ps(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_BROADCASTQ_EPI64 (src, k, a) =>
      _mm256_mask_broadcastq_epi64(f(src), f(k), f(a))
    case MM512_PERMUTEXVAR_EPI64 (idx, a) =>
      _mm512_permutexvar_epi64(f(idx), f(a))
    case MM_MASK_CONFLICT_EPI64 (src, k, a) =>
      _mm_mask_conflict_epi64(f(src), f(k), f(a))
    case MM512_BROADCASTSD_PD (a) =>
      _mm512_broadcastsd_pd(f(a))
    case MM512_MASKZ_XOR_EPI64 (k, a, b) =>
      _mm512_maskz_xor_epi64(f(k), f(a), f(b))
    case MM256_MASK_BROADCASTB_EPI8 (src, k, a) =>
      _mm256_mask_broadcastb_epi8(f(src), f(k), f(a))
    case MM_MASK_CMPGE_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmpge_epi32_mask(f(k1), f(a), f(b))
    case MM512_MASK_LZCNT_EPI32 (src, k, a) =>
      _mm512_mask_lzcnt_epi32(f(src), f(k), f(a))
    case MM512_CASTPS512_PS128 (a) =>
      _mm512_castps512_ps128(f(a))
    case MM512_MASKZ_CVTEPI16_EPI32 (k, a) =>
      _mm512_maskz_cvtepi16_epi32(f(k), f(a))
    case MM512_KORTESTZ (k1, k2) =>
      _mm512_kortestz(f(k1), f(k2))
    case MM512_MASKZ_CVTPS_EPU32 (k, a) =>
      _mm512_maskz_cvtps_epu32(f(k), f(a))
    case MM512_SCALEF_ROUND_PS (a, b, rounding) =>
      _mm512_scalef_round_ps(f(a), f(b), f(rounding))
    case MM256_MASK_CVTEPU64_PD (src, k, a) =>
      _mm256_mask_cvtepu64_pd(f(src), f(k), f(a))
    case MM512_CVTUSEPI32_EPI16 (a) =>
      _mm512_cvtusepi32_epi16(f(a))
    case MM_MASK3_FMSUB_SD (a, b, c, k) =>
      _mm_mask3_fmsub_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_SUBS_EPI16 (src, k, a, b) =>
      _mm_mask_subs_epi16(f(src), f(k), f(a), f(b))
    case iDef@MM512_MASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i32gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_COMPRESS_PS (k, a) =>
      _mm_maskz_compress_ps(f(k), f(a))
    case MM_MASK_ALIGNR_EPI32 (src, k, a, b, count) =>
      _mm_mask_alignr_epi32(f(src), f(k), f(a), f(b), f(count))
    case MM_MASKZ_MUL_EPI32 (k, a, b) =>
      _mm_maskz_mul_epi32(f(k), f(a), f(b))
    case MM256_MASKZ_PACKUS_EPI32 (k, a, b) =>
      _mm256_maskz_packus_epi32(f(k), f(a), f(b))
    case MM_MASK_FNMSUB_SS (a, k, b, c) =>
      _mm_mask_fnmsub_ss(f(a), f(k), f(b), f(c))
    case MM512_MADD_EPI16 (a, b) =>
      _mm512_madd_epi16(f(a), f(b))
    case MM512_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a) =>
      _mm512_mask_permutexvar_epi64(f(src), f(k), f(idx), f(a))
    case MM512_MASKZ_UNPACKHI_EPI16 (k, a, b) =>
      _mm512_maskz_unpackhi_epi16(f(k), f(a), f(b))
    case MM512_MASKZ_ADD_PD (k, a, b) =>
      _mm512_maskz_add_pd(f(k), f(a), f(b))
    case MM_MASK_CVTEPI32_PS (src, k, a) =>
      _mm_mask_cvtepi32_ps(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SET1_EPI8 (src, k, a) =>
      _mm256_mask_set1_epi8(f(src), f(k), f(a))
    case MM_PERMUTEX2VAR_EPI8 (a, idx, b) =>
      _mm_permutex2var_epi8(f(a), f(idx), f(b))
    case MM512_MASKZ_EXTRACTF32X4_PS (k, a, imm8) =>
      _mm512_maskz_extractf32x4_ps(f(k), f(a), f(imm8))
    case MM512_MASKZ_CVT_ROUNDPS_PH (k, a, rounding) =>
      _mm512_maskz_cvt_roundps_ph(f(k), f(a), f(rounding))
    case MM512_MASK_SHUFFLE_EPI8 (src, k, a, b) =>
      _mm512_mask_shuffle_epi8(f(src), f(k), f(a), f(b))
    case MM_CMPEQ_EPU64_MASK (a, b) =>
      _mm_cmpeq_epu64_mask(f(a), f(b))
    case MM256_MASK_MAX_EPI64 (src, k, a, b) =>
      _mm256_mask_max_epi64(f(src), f(k), f(a), f(b))
    case MM_MASK_RANGE_ROUND_SD (src, k, a, b, imm8, rounding) =>
      _mm_mask_range_round_sd(f(src), f(k), f(a), f(b), f(imm8), f(rounding))
    case MM_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8) =>
      _mm_mask_ternarylogic_epi32(f(src), f(k), f(a), f(b), f(imm8))
    case MM256_CVTEPI64_PD (a) =>
      _mm256_cvtepi64_pd(f(a))
    case MM256_MOVM_EPI64 (k) =>
      _mm256_movm_epi64(f(k))
    case MM512_MASKZ_ADD_PS (k, a, b) =>
      _mm512_maskz_add_ps(f(k), f(a), f(b))
    case MM_TEST_EPI16_MASK (a, b) =>
      _mm_test_epi16_mask(f(a), f(b))
    case MM_MASK3_FNMADD_SS (a, b, c, k) =>
      _mm_mask3_fnmadd_ss(f(a), f(b), f(c), f(k))
    case MM512_MASKZ_GETEXP_ROUND_PS (k, a, rounding) =>
      _mm512_maskz_getexp_round_ps(f(k), f(a), f(rounding))
    case MM256_MASK_CVTUSEPI64_EPI16 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi16(f(src), f(k), f(a))
    case MM_CMP_PD_MASK (a, b, imm8) =>
      _mm_cmp_pd_mask(f(a), f(b), f(imm8))
    case MM256_MASK_CMP_EPU8_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_epu8_mask(f(k1), f(a), f(b), f(imm8))
    case MM512_MASK_CVTSEPI32_EPI16 (src, k, a) =>
      _mm512_mask_cvtsepi32_epi16(f(src), f(k), f(a))
    case MM512_DIV_ROUND_PS (a, b, rounding) =>
      _mm512_div_round_ps(f(a), f(b), f(rounding))
    case MM_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm_maskz_sub_epi8(f(k), f(a), f(b))
    case MM512_MASK_OR_PS (src, k, a, b) =>
      _mm512_mask_or_ps(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_SUB_PD (k, a, b) =>
      _mm256_maskz_sub_pd(f(k), f(a), f(b))
    case MM512_CMPLT_EPU64_MASK (a, b) =>
      _mm512_cmplt_epu64_mask(f(a), f(b))
    case MM_MUL_ROUND_SD (a, b, rounding) =>
      _mm_mul_round_sd(f(a), f(b), f(rounding))
    case MM512_REDUCE_PD (a, imm8) =>
      _mm512_reduce_pd(f(a), f(imm8))
    case MM512_MASKZ_MAX_ROUND_PS (k, a, b, sae) =>
      _mm512_maskz_max_round_ps(f(k), f(a), f(b), f(sae))
    case iDef@MM_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_ps(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SLL_EPI16 (src, k, a, count) =>
      _mm512_mask_sll_epi16(f(src), f(k), f(a), f(count))
    case MM256_MASK_CVTUSEPI64_EPI8 (src, k, a) =>
      _mm256_mask_cvtusepi64_epi8(f(src), f(k), f(a))
    case MM256_CMPGT_EPI64_MASK (a, b) =>
      _mm256_cmpgt_epi64_mask(f(a), f(b))
    case iDef@MM_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm_mmask_i32gather_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SHUFFLE_PD (k, a, b, imm8) =>
      _mm_maskz_shuffle_pd(f(k), f(a), f(b), f(imm8))
    case MM_MASK_CVTTPD_EPI64 (src, k, a) =>
      _mm_mask_cvttpd_epi64(f(src), f(k), f(a))
    case MM512_SUBS_EPI16 (a, b) =>
      _mm512_subs_epi16(f(a), f(b))
    case MM_MASKZ_FNMADD_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fnmadd_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8) =>
      _mm512_mask_ternarylogic_epi64(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_BROADCAST_I64X2 (src, k, a) =>
      _mm512_mask_broadcast_i64x2(f(src), f(k), f(a))
    case MM512_MASK3_FMADDSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmaddsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM256_MASKZ_CVTUSEPI64_EPI16 (k, a) =>
      _mm256_maskz_cvtusepi64_epi16(f(k), f(a))
    case MM_MASKZ_MOV_PS (k, a) =>
      _mm_maskz_mov_ps(f(k), f(a))
    case MM_MASK_RANGE_PD (src, k, a, b, imm8) =>
      _mm_mask_range_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM_MASK_SRLI_EPI32 (src, k, a, imm8) =>
      _mm_mask_srli_epi32(f(src), f(k), f(a), f(imm8))
    case iDef@MM256_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_expandloadu_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_MULLO_EPI32 (k, a, b) =>
      _mm256_maskz_mullo_epi32(f(k), f(a), f(b))
    case MM512_CVT_ROUNDEPI64_PS (a, rounding) =>
      _mm512_cvt_roundepi64_ps(f(a), f(rounding))
    case MM512_KAND (a, b) =>
      _mm512_kand(f(a), f(b))
    case MM512_MASKZ_ABS_EPI16 (k, a) =>
      _mm512_maskz_abs_epi16(f(k), f(a))
    case MM512_PERMUTEXVAR_PS (idx, a) =>
      _mm512_permutexvar_ps(f(idx), f(a))
    case MM512_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm512_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_CMPLE_EPU32_MASK (k1, a, b) =>
      _mm256_mask_cmple_epu32_mask(f(k1), f(a), f(b))
    case MM256_MASKZ_DIV_PS (k, a, b) =>
      _mm256_maskz_div_ps(f(k), f(a), f(b))
    case MM256_MASK_CONFLICT_EPI32 (src, k, a) =>
      _mm256_mask_conflict_epi32(f(src), f(k), f(a))
    case MM_MASKZ_CVTEPU32_EPI64 (k, a) =>
      _mm_maskz_cvtepu32_epi64(f(k), f(a))
    case MM_CVT_ROUNDSS_SD (a, b, rounding) =>
      _mm_cvt_roundss_sd(f(a), f(b), f(rounding))
    case MM512_MASK_FMSUBADD_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmsubadd_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_OR_EPI64 (k, a, b) =>
      _mm512_maskz_or_epi64(f(k), f(a), f(b))
    case MM512_MASKZ_EXP2A23_PS (k, a) =>
      _mm512_maskz_exp2a23_ps(f(k), f(a))
    case MM_GETMANT_SS (a, b, interv, sc) =>
      _mm_getmant_ss(f(a), f(b), f(interv), f(sc))
    case MM512_MASKZ_SRL_EPI32 (k, a, count) =>
      _mm512_maskz_srl_epi32(f(k), f(a), f(count))
    case MM_PERMUTEXVAR_EPI16 (idx, a) =>
      _mm_permutexvar_epi16(f(idx), f(a))
    case MM256_MASK_COMPRESS_EPI32 (src, k, a) =>
      _mm256_mask_compress_epi32(f(src), f(k), f(a))
    case MM_FIXUPIMM_ROUND_SD (a, b, c, imm8, rounding) =>
      _mm_fixupimm_round_sd(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_MASK_REDUCE_PS (src, k, a, imm8) =>
      _mm_mask_reduce_ps(f(src), f(k), f(a), f(imm8))
    case MM_MASKZ_MUL_SD (k, a, b) =>
      _mm_maskz_mul_sd(f(k), f(a), f(b))
    case MM256_MASKZ_MAX_EPI64 (k, a, b) =>
      _mm256_maskz_max_epi64(f(k), f(a), f(b))
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtsepi64_storeu_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_ROR_EPI32 (a, imm8) =>
      _mm_ror_epi32(f(a), f(imm8))
    case MM_MASK_FMSUB_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fmsub_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM256_MASKZ_RCP14_PD (k, a) =>
      _mm256_maskz_rcp14_pd(f(k), f(a))
    case MM256_MASK_SRLV_EPI32 (src, k, a, count) =>
      _mm256_mask_srlv_epi32(f(src), f(k), f(a), f(count))
    case MM256_MASK_CVTTPD_EPI32 (src, k, a) =>
      _mm256_mask_cvttpd_epi32(f(src), f(k), f(a))
    case MM256_MASKZ_AVG_EPU8 (k, a, b) =>
      _mm256_maskz_avg_epu8(f(k), f(a), f(b))
    case MM256_MASK_PERMUTEX2VAR_PD (a, k, idx, b) =>
      _mm256_mask_permutex2var_pd(f(a), f(k), f(idx), f(b))
    case MM_MASK_FNMADD_SS (a, k, b, c) =>
      _mm_mask_fnmadd_ss(f(a), f(k), f(b), f(c))
    case MM512_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm512_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASK_UNPACKHI_EPI8 (src, k, a, b) =>
      _mm512_mask_unpackhi_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_AND_EPI64 (k, a, b) =>
      _mm256_maskz_and_epi64(f(k), f(a), f(b))
    case MM512_MASK_RCP28_PD (src, k, a) =>
      _mm512_mask_rcp28_pd(f(src), f(k), f(a))
    case MM256_LZCNT_EPI32 (a) =>
      _mm256_lzcnt_epi32(f(a))
    case MM256_MASK_CVTEPU32_PD (src, k, a) =>
      _mm256_mask_cvtepu32_pd(f(src), f(k), f(a))
    case iDef@MM256_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtepi16_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_AVG_EPU16 (src, k, a, b) =>
      _mm256_mask_avg_epu16(f(src), f(k), f(a), f(b))
    case MM_MASK_SRLI_EPI16 (src, k, a, imm8) =>
      _mm_mask_srli_epi16(f(src), f(k), f(a), f(imm8))
    case iDef@MM256_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_store_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASKZ_CVTTPS_EPU64 (k, a) =>
      _mm256_maskz_cvttps_epu64(f(k), f(a))
    case MM512_AND_PD (a, b) =>
      _mm512_and_pd(f(a), f(b))
    case MM256_MASK_SQRT_PD (src, k, a) =>
      _mm256_mask_sqrt_pd(f(src), f(k), f(a))
    case MM256_MASK_UNPACKHI_EPI64 (src, k, a, b) =>
      _mm256_mask_unpackhi_epi64(f(src), f(k), f(a), f(b))
    case MM_MASK2_PERMUTEX2VAR_PD (a, idx, k, b) =>
      _mm_mask2_permutex2var_pd(f(a), f(idx), f(k), f(b))
    case MM256_CMPEQ_EPI64_MASK (a, b) =>
      _mm256_cmpeq_epi64_mask(f(a), f(b))
    case MM512_PERMUTEXVAR_EPI32 (idx, a) =>
      _mm512_permutexvar_epi32(f(idx), f(a))
    case MM512_SRL_EPI64 (a, count) =>
      _mm512_srl_epi64(f(a), f(count))
    case MM256_BROADCAST_F32X4 (a) =>
      _mm256_broadcast_f32x4(f(a))
    case MM512_MASK_CVTPD_EPU32 (src, k, a) =>
      _mm512_mask_cvtpd_epu32(f(src), f(k), f(a))
    case MM_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm_maskz_max_epu8(f(k), f(a), f(b))
    case MM_CMPNEQ_EPU64_MASK (a, b) =>
      _mm_cmpneq_epu64_mask(f(a), f(b))

    case Reflect(MM256_MASK_PERMUTEX_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RANGE_ROUND_PS (a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_RANGE_ROUND_PS (f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_CVTSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS256_PS512 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS256_PS512 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TERNARYLOGIC_EPI64 (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_TERNARYLOGIC_EPI64 (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MADD52LO_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MADD52LO_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETMANT_ROUND_PS (k, a, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETMANT_ROUND_PS (f(k), f(a), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MOVEPI64_MASK (a), u, es) =>
      reflectMirrored(Reflect(MM512_MOVEPI64_MASK (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ADDS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ADDS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SETR_PS (e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0), u, es) =>
      reflectMirrored(Reflect(MM512_SETR_PS (f(e15), f(e14), f(e13), f(e12), f(e11), f(e10), f(e9), f(e8), f(e7), f(e6), f(e5), f(e4), f(e3), f(e2), f(e1), f(e0)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FNMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FNMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_PD (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_PD (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPI8_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPI8_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_ROUND_PD (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_ROUND_PD (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF32X8_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF32X8_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI64X2_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI64X2_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_EPI16 (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_EPI16 (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_EPI64 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_EPI64 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MIN_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLT_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLT_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPNEQ_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPNEQ_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPD_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPD_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOAD_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSI64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSI64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI32_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEXVAR_PS (idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEXVAR_PS (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_ROUND_SD (k, a, b, interv, sc, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_ROUND_SD (f(k), f(a), f(b), f(interv), f(sc), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRLV_EPI64 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRLV_EPI64 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPI32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPI32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF32X4_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF32X4_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ANDNOT_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ANDNOT_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ROUNDSCALE_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ROUNDSCALE_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_EPI16 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI32_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI32_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FNMADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FNMADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_XOR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_XOR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPGT_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPGT_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CONFLICT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CONFLICT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SHUFFLE_I64X2 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SHUFFLE_I64X2 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTF32X4_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTF32X4_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTQ_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTQ_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI64 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI64 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CONFLICT_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CONFLICT_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_BROADCASTSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_BROADCASTSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_XOR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_XOR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BROADCASTB_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BROADCASTB_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LZCNT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LZCNT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CASTPS512_PS128 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CASTPS512_PS128 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPI16_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPI16_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTZ (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTZ (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALEF_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALEF_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU64_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU64_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTUSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTUSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SUBS_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SUBS_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_COMPRESS_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_COMPRESS_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_ALIGNR_EPI32 (src, k, a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_MASK_ALIGNR_EPI32 (f(src), f(k), f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PACKUS_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PACKUS_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMSUB_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMSUB_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEXVAR_EPI64 (src, k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEXVAR_EPI64 (f(src), f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPI32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPI32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEX2VAR_EPI8 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEX2VAR_EPI8 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF32X4_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF32X4_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDPS_PH (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDPS_PH (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MAX_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MAX_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_ROUND_SD (src, k, a, b, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_ROUND_SD (f(src), f(k), f(a), f(b), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TERNARYLOGIC_EPI32 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TERNARYLOGIC_EPI32 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MOVM_EPI64 (k), u, es) =>
      reflectMirrored(Reflect(MM256_MOVM_EPI64 (f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ADD_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ADD_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMADD_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMADD_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_GETEXP_ROUND_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_GETEXP_ROUND_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMP_PD_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_CMP_PD_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_EPU8_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_EPU8_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_OR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_OR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SUB_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SUB_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLT_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLT_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MUL_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_ROUND_PS (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_ROUND_PS (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_PS (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_PS (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SLL_EPI16 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SLL_EPI16 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTUSEPI64_EPI8 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTUSEPI64_EPI8 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPGT_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPGT_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MMASK_I32GATHER_PS (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MMASK_I32GATHER_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SHUFFLE_PD (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SHUFFLE_PD (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTTPD_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTTPD_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TERNARYLOGIC_EPI64 (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TERNARYLOGIC_EPI64 (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_BROADCAST_I64X2 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_BROADCAST_I64X2 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTUSEPI64_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTUSEPI64_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MOV_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MOV_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_RANGE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_RANGE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_EXPANDLOADU_EPI32 (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPANDLOADU_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MULLO_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MULLO_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPI64_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPI64_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KAND (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KAND (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_ABS_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_ABS_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_PS (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_PS (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CONFLICT_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CONFLICT_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTEPU32_EPI64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTEPU32_EPI64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDSS_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDSS_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_OR_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_OR_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXP2A23_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXP2A23_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_GETMANT_SS (a, b, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_GETMANT_SS (f(a), f(b), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SRL_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SRL_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PERMUTEXVAR_EPI16 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM_PERMUTEXVAR_EPI16 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_COMPRESS_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESS_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_ROUND_SD (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_ROUND_SD (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_REDUCE_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_REDUCE_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTSEPI64_STOREU_EPI32 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTSEPI64_STOREU_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROR_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROR_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_RCP14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_RCP14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRLV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRLV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTTPD_EPI32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTTPD_EPI32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AVG_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AVG_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_PD (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_PD (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKHI_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKHI_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_AND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_AND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP28_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP28_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LZCNT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_LZCNT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTEPI16_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTEPI16_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AVG_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AVG_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SRLI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SRLI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STORE_EPI32 (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STORE_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_UNPACKHI_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_UNPACKHI_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK2_PERMUTEX2VAR_PD (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK2_PERMUTEX2VAR_PD (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTEXVAR_EPI32 (idx, a), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTEXVAR_EPI32 (f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SRL_EPI64 (a, count), u, es) =>
      reflectMirrored(Reflect(MM512_SRL_EPI64 (f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_BROADCAST_F32X4 (a), u, es) =>
      reflectMirrored(Reflect(MM256_BROADCAST_F32X4 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPD_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPD_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPNEQ_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPNEQ_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51200 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_MASK_PERMUTEX_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_RANGE_ROUND_PS(a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_range_round_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_CVTSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_cvtsepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_CASTPS256_PS512(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps256_ps512(${quote(a)})")
    case iDef@MM256_TERNARYLOGIC_EPI64(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_ternarylogic_epi64(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM256_MASK_FMADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_MADD52LO_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_madd52lo_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_GETMANT_ROUND_PS(k, a, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getmant_round_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM256_MASK_FMADDSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MOVEPI64_MASK(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_movepi64_mask(${quote(a)})")
    case iDef@MM_MASKZ_CVTPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_ADDS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_adds_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SETR_PS(e15, e14, e13, e12, e11, e10, e9, e8, e7, e6, e5, e4, e3, e2, e1, e0) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_setr_ps(${quote(e15)}, ${quote(e14)}, ${quote(e13)}, ${quote(e12)}, ${quote(e11)}, ${quote(e10)}, ${quote(e9)}, ${quote(e8)}, ${quote(e7)}, ${quote(e6)}, ${quote(e5)}, ${quote(e4)}, ${quote(e3)}, ${quote(e2)}, ${quote(e1)}, ${quote(e0)})")
    case iDef@MM256_MASKZ_FNMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fnmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_GETMANT_PD(k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getmant_pd(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM256_MASK_CMPLT_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_CVTEPI8_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepi8_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_GETEXP_ROUND_PD(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getexp_round_pd(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_EXTRACTF32X8_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf32x8_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_EXTRACTI64X2_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti64x2_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_UNPACKLO_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_PERMUTEXVAR_EPI16(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutexvar_epi16(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM256_MASK_STORE_EPI64(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_store_epi64((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_MIN_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPLT_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmplt_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_FMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CMPNEQ_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpneq_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTPD_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtpd_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_LOAD_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_load_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVT_ROUNDSI64_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundsi64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtusepi32_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MASKZ_CVTTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_PERMUTEXVAR_PS(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutexvar_ps(${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_GETMANT_ROUND_SD(k, a, b, interv, sc, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getmant_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_SRLV_EPI64(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srlv_epi64(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_MASK_FNMADD_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmadd_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_CVTEPI32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepi32_epi64(${quote(a)})")
    case iDef@MM512_EXTRACTF32X4_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extractf32x4_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_ANDNOT_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_andnot_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ROUNDSCALE_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_roundscale_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutex2var_epi16(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_CMP_EPI32_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epi32_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FNMADD_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fnmadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_XOR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_xor_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CMPGT_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmpgt_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CONFLICT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_conflict_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_COMPRESS_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_compress_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SHUFFLE_I64X2(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_shuffle_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_EXTRACTF32X4_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_extractf32x4_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_BROADCASTQ_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastq_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_PERMUTEXVAR_EPI64(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_epi64(${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASK_CONFLICT_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_conflict_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_BROADCASTSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_broadcastsd_pd(${quote(a)})")
    case iDef@MM512_MASKZ_XOR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_xor_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_BROADCASTB_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_broadcastb_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPGE_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_LZCNT_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_lzcnt_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CASTPS512_PS128(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_castps512_ps128(${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPI16_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepi16_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_KORTESTZ(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kortestz(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_MASKZ_CVTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM512_SCALEF_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scalef_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTEPU64_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu64_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVTUSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtusepi32_epi16(${quote(a)})")
    case iDef@MM_MASK3_FMSUB_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_SUBS_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_subs_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_I32GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i32gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASKZ_COMPRESS_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_compress_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_ALIGNR_EPI32(src, k, a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_alignr_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_MASKZ_MUL_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_PACKUS_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_packus_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FNMSUB_SS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmsub_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_madd_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEXVAR_EPI64(src, k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutexvar_epi64(${quote(src)}, ${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASKZ_UNPACKHI_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ADD_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPI32_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepi32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_SET1_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_set1_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_PERMUTEX2VAR_EPI8(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutex2var_epi8(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASKZ_EXTRACTF32X4_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf32x4_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_CVT_ROUNDPS_PH(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundps_ph(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_SHUFFLE_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MAX_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_max_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_RANGE_ROUND_SD(src, k, a, b, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_range_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_TERNARYLOGIC_EPI32(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_ternarylogic_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_CVTEPI64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi64_pd(${quote(a)})")
    case iDef@MM256_MOVM_EPI64(k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_movm_epi64(${quote(k)})")
    case iDef@MM512_MASKZ_ADD_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_add_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_TEST_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK3_FNMADD_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASKZ_GETEXP_ROUND_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_getexp_round_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CVTUSEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CMP_PD_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmp_pd_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMP_EPU8_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_CVTSEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtsepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_DIV_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_SUB_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_OR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_or_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SUB_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sub_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLT_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmplt_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MUL_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_REDUCE_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_MAX_ROUND_PS(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case iDef@MM_MASK_I32SCATTER_PS(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i32scatter_ps((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASK_SLL_EPI16(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sll_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_CVTUSEPI64_EPI8(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtusepi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_CMPGT_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpgt_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_MMASK_I32GATHER_PS(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mmask_i32gather_ps(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM_MASKZ_SHUFFLE_PD(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_shuffle_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_CVTTPD_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvttpd_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_FNMADD_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK_TERNARYLOGIC_EPI64(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_ternarylogic_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_BROADCAST_I64X2(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_broadcast_i64x2(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK3_FMADDSUB_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_CVTUSEPI64_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtusepi64_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MOV_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mov_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_RANGE_PD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_range_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASK_SRLI_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srli_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_EXPANDLOADU_EPI32(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expandloadu_epi32(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASKZ_MULLO_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mullo_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVT_ROUNDEPI64_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepi64_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_KAND(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kand(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_ABS_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_abs_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM512_PERMUTEXVAR_PS(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_ps(${quote(idx)}, ${quote(a)})")
    case iDef@MM512_MASK_SRLI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_CMPLE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_DIV_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CONFLICT_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_conflict_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTEPU32_EPI64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtepu32_epi64(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVT_ROUNDSS_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundss_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMSUBADD_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_OR_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_or_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_EXP2A23_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_exp2a23_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_GETMANT_SS(a, b, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_getmant_ss(${quote(a)}, ${quote(b)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM512_MASKZ_SRL_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_srl_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM_PERMUTEXVAR_EPI16(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_permutexvar_epi16(${quote(idx)}, ${quote(a)})")
    case iDef@MM256_MASK_COMPRESS_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_compress_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_FIXUPIMM_ROUND_SD(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_REDUCE_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_reduce_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MUL_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MAX_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTSEPI64_STOREU_EPI32(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtsepi64_storeu_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_ROR_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ror_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FMSUB_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_RCP14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_rcp14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_SRLV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srlv_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM256_MASK_CVTTPD_EPI32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvttpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_AVG_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_avg_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_PERMUTEX2VAR_PD(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex2var_pd(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_FNMADD_SS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmadd_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_UNPACKHI_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpackhi_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_AND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_and_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RCP28_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp28_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_LZCNT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_lzcnt_epi32(${quote(a)})")
    case iDef@MM256_MASK_CVTEPU32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CVTEPI16_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtepi16_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_AVG_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_avg_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_SRLI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_srli_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_STORE_EPI32(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_store_epi32((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASKZ_CVTTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvttps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_AND_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_and_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SQRT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_UNPACKHI_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_unpackhi_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK2_PERMUTEX2VAR_PD(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask2_permutex2var_pd(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM256_CMPEQ_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTEXVAR_EPI32(idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permutexvar_epi32(${quote(idx)}, ${quote(a)})")
    case iDef@MM512_SRL_EPI64(a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_srl_epi64(${quote(a)}, ${quote(count)})")
    case iDef@MM256_BROADCAST_F32X4(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_broadcast_f32x4(${quote(a)})")
    case iDef@MM512_MASK_CVTPD_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_MAX_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPNEQ_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpneq_epu64_mask(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
