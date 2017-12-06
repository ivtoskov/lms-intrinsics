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

    
trait AVX512010 extends IntrinsicsBase {
  /**
   * Compare packed unsigned 64-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MIN_EPU64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active single-precision (32-bit) floating-point
   * elements in "a" (those with their respective bit set in writemask "k") to
   * "dst", and pass through the remaining elements from "src".
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_COMPRESS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_DIV_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MUL_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter double-precision (64-bit) floating-point elements from "a" into memory
   * using 64-bit indices. 64-bit elements are stored at addresses starting at
   * "base_addr" and offset by each 64-bit element in "vindex" (each index is
   * scaled by the factor in "scale"). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, vindex: __m256i, a: __m256d, scale: const int, base_addrOffset: int
   */
  case class MM256_I64SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal square root of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_RSQRT14_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst".
   * a: __m256i, idx: __m256i, b: __m256i
   */
  case class MM256_PERMUTEX2VAR_EPI32(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_TESTN_EPI64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_I64(a: Exp[__m128]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with signed
   * saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTSEPI32_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPU64_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 64-bit integer "a" to all elements of "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __int64
   */
  case class MM256_MASK_SET1_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[Long]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy 16-bit mask "a" to "k".
   * a: __mmask16
   */
  case class MM512_KMOV(a: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" based on the comparison
   * operand specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" across lanes
   * using the corresponding index in "idx", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, idx: __m256i, a: __m256d
   */
  case class MM256_MASKZ_PERMUTEXVAR_PD(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 16-bit integers in "a" and "b" using saturation, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADDS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 64-bit integer from "a" to all elements of "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_BROADCASTQ_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m256
   */
  case class MM512_MASK_CVTPS_EPU64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256i
   */
  case class MM256_MASK_PERMUTEVAR_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASK_DIV_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the low 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst".
   * a: __m512i, b: __m512i, c: __m512i
   */
  case class MM512_MADD52LO_EPU64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast 8-bit integer "a" to all elements of "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask64, a: char
   */
  case class MM512_MASKZ_SET1_EPI8(k: Exp[Long], a: Exp[Byte]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MUL_EPU32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the high half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKHI_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in the corresponding element of "b", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_RORV_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
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
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FNMADD_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b" for less-than-or-equal, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLE_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_OR_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of the lower double-precision (64-bit)
   * floating-point element in "b", store the result in the lower element of "dst"
   * using zeromask "k" (the element is zeroed out when mask bit 0 is not set), and
   * copy the upper element from "a" to the upper element of "dst". The maximum
   * relative error for this approximation is less than 2^-28.
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_RCP28_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask16, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPGE_EPU16_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUB_EPI8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASKZ_REDUCE_PD(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
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
   * k: __mmask8, a: __m128, interv: _MM_MANTISSA_NORM_ENUM, sc: _MM_MANTISSA_SIGN_ENUM
   */
  case class MM_MASKZ_GETMANT_PS(k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTUSEPI32_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 64-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "idx" when the corresponding mask bit is not
   * set).
   * a: __m256i, idx: __m256i, k: __mmask8, b: __m256i
   */
  case class MM256_MASK2_PERMUTEX2VAR_EPI64(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASK_TEST_EPI64_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed single-precision (32-bit) floating-point
   * elements in "a" and "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_AND_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPLE_EPU64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for greater-than-or-equal, and
   * store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPI16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_UNPACKLO_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst". The maximum relative error for this approximation is less
   * than 2^-23.
   * a: __m512
   */
  case class MM512_EXP2A23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 64-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_U64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 8-bit integer from "a" to all elements of "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i
   */
  case class MM_MASKZ_BROADCASTB_EPI8(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for less-than, and
   * store the results in mask vector "k1" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k1: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPU16_MASK(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTUSEPI64_EPI32(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
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
  case class MM_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_SCALEF_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKHI_EPI32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set). The
   * maximum relative error for this approximation is less than 2^-28.
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_RCP28_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k1" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPEQ_EPU64_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "a" to the
   * number of fraction bits specified by "imm8", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "b" to the upper
   * elements of "dst".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_ROUNDSCALE_SS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed unsigned 52-bit integers in each 64-bit element of "b" and "c"
   * to form a 104-bit intermediate result. Add the high 52-bit unsigned integer
   * from the intermediate result with the corresponding unsigned 64-bit integer in
   * "a", and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i, c: __m256i
   */
  case class MM256_MASKZ_MADD52HI_EPU64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed half-precision (16-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m128i
   */
  case class MM256_MASK_CVTPH_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 64-bit integers in "a" (those with their
   * respective bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_COMPRESSSTOREU_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m128, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM_MASK_LOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m128] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 16-bit integers with signed
   * saturation, and store the active results (those with their respective bit set
   * in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask8, a: __m256i, base_addrOffset: int
   */
  case class MM256_MASK_CVTSEPI64_STOREU_EPI16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed double-precision (64-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_MOVEDUP_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * For each 64-bit element in "b", select 8 unaligned bytes using a byte-granular
   * shift control within the corresponding 64-bit element of "a", and store the 8
   * assembled bytes to the corresponding 64-bit element of "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m256i, k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASK_MULTISHIFT_EPI64_EPI8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512i
   */
  case class MM512_MASK_PERMUTEVAR_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, imm8: int, rounding: int
   */
  case class MM512_MASK_ROUNDSCALE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed single-precision (32-bit) floating-point elements in "a" and
   * "b" based on the comparison operand specified by "imm8", and store the results
   * in mask vector "k" using zeromask "k1" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k1: __mmask8, a: __m256, b: __m256, imm8: const int
   */
  case class MM256_MASK_CMP_PS_MASK(k1: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTEPU64_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 64-bit integers in "a" and "b", producing
   * intermediate 64-bit values, and set the corresponding bit in result mask "k"
   * if the intermediate value is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTN_EPI64_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPGE_EPU16_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for less-than-or-equal, and store
   * the results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPLE_EPI8_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Test each 32-bit element of "a" for equality with all other elements in "a"
   * closer to the least significant bit. Each element's comparison forms a zero
   * extended bit vector in "dst".
   * a: __m128i
   */
  case class MM_CONFLICT_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move packed 16-bit integers from "a" into "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask32, a: __m512i
   */
  case class MM512_MASK_MOV_EPI16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 64-bit integers in "a" and "b" for less-than-or-equal,
   * and store the results in mask vector "k1" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k1: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_CMPLE_EPU64_MASK(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed 8-bit integers with
   * unsigned saturation, and store the active results (those with their respective
   * bit set in writemask "k") to unaligned memory at "base_addr".
   * base_addr: void*, k: __mmask16, a: __m512i, base_addrOffset: int
   */
  case class MM512_MASK_CVTUSEPI32_STOREU_EPI8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MAX_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 32-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper 3 packed elements from "a"
   * to the upper elements of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASKZ_DIV_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the 4 packed double-precision (64-bit) floating-point elements from
   * "a" to all elements of "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d
   */
  case class MM512_MASKZ_BROADCAST_F64X4(k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask16, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI16(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of the lower double-precision (64-bit) floating-point
   * element in "b" to a double-precision (64-bit) floating-point number
   * representing the integer exponent, store the result in the lower element of
   * "dst" using writemask "k" (the element is copied from "src" when mask bit 0 is
   * not set), and copy the upper element from "a" to the upper element of "dst".
   * This intrinsic essentially calculates "floor(log2(x))" for the lower
   * element.
   * 	[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_GETEXP_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert 128 bits (composed of 2 packed double-precision
   * (64-bit) floating-point elements) from "b" into "tmp" at the location
   * specified by "imm8".  Store "tmp" to "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256d, b: __m128d, imm8: int
   */
  case class MM256_MASKZ_INSERTF64X2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: __m128i
   */
  case class MM512_MASKZ_BROADCASTW_EPI16(k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 8-bit integers in "a" and "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADD_EPI8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" based on the comparison operand
   * specified by "imm8", and store the results in mask vector "k".
   * a: __m256i, b: __m256i, imm8: const int
   */
  case class MM256_CMP_EPI16_MASK(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point element in "a" and
   * "b", store the result in the lower element of "dst" using zeromask "k" (the
   * element is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_MUL_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Prefetch double-precision (64-bit) floating-point elements with intent to
   * write using 32-bit indices. The "hint" parameter may be 1 (_MM_HINT_T0) for
   * prefetching to L1 cache, or 2 (_MM_HINT_T1) for prefetching to L2 cache.
   * 64-bit elements are brought into cache from addresses starting at "base_addr"
   * and offset by each 32-bit element in "vindex" (each index is scaled by the
   * factor in "scale") subject to mask "k" (elements are not brought into cache
   * when the corresponding mask bit is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, mask: __mmask8, vinde: __m256i, scale: int, hint: int, base_addrOffset: int
   */
  case class MM512_MASK_PREFETCH_I32SCATTER_PD[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vinde: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_SQRT_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 16-bit integers from the high half of each 128-bit lane
   * in "a" and "b", and store the results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_UNPACKHI_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b" for equality, and store
   * the results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPU16_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers with truncation, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_CVTTPD_EPU64(a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" left by the amount specified by the
   * corresponding element in "count" while shifting in zeros, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASKZ_SLLV_EPI32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m512d, b: __m512d, c: __m512i, imm8: int
   */
  case class MM512_FIXUPIMM_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
   * base_addr: void*, k: __mmask8, vindex: __m256i, a: __m512i, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I32SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Store packed single-precision (32-bit) floating-point elements from "a" into
   * memory using writemask "k".
   * 	"mem_addr" does not need to be aligned on any
   * particular boundary.
   * mem_addr: void*, k: __mmask8, a: __m256, mem_addrOffset: int
   */
  case class MM256_MASK_STOREU_PS[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Four SADs are performed on four 8-bit quadruplets for each 64-bit
   * lane. The first two SADs use the lower 8-bit quadruplet of the lane from "a",
   * and the last two SADs use the uppper 8-bit quadruplet of the lane from "a".
   * Quadruplets from "b" are selected from within 128-bit lanes according to the
   * control in "imm8", and each SAD in each 64-bit lane uses the selected
   * quadruplet at 8-bit offsets.
   * a: __m256i, b: __m256i, imm8: int
   */
  case class MM256_DBSAD_EPU8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Converts bit mask "k1" into an integer value, storing the results in "dst".
   * k1: __mmask16
   */
  case class MM512_MASK2INT(k1: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 32-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_ROR_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round packed single-precision (32-bit) floating-point elements in "a" to the
   * number of fraction bits specified by "imm8", and store the results in "dst".
   * a: __m512, imm8: int
   */
  case class MM512_ROUNDSCALE_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask8, a: __m128d
   */
  case class MM_MASKZ_CVTTPD_EPU32(k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of packed single-precision (32-bit) floating-point
   * elements in "a" and then AND with "b", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256, b: __m256
   */
  case class MM256_MASKZ_ANDNOT_PS(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of each 128-bit lane
   * in "a" and "b", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed single-precision (32-bit) floating-point elements from memory into
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). "mem_addr" must be aligned on a 64-byte boundary or a
   * general-protection exception may be generated.
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_LOAD_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements within 128-bit lanes
   * using the control in "imm8", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, imm8: const int
   */
  case class MM512_MASK_SHUFFLE_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract the reduced argument of packed double-precision (64-bit)
   * floating-point elements in "a" by the number of bits specified by "imm8", and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, imm8: int, rounding: int
   */
  case class MM512_MASK_REDUCE_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 16-bit integers in "a" and "b", producing
   * intermediate 16-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is non-zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TEST_EPI16_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128
   */
  case class MM_MASK_CVTPS_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b", and store packed minimum values
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MIN_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in zeros,
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, imm8: unsigned int
   */
  case class MM_MASKZ_SRLI_EPI32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). The maximum relative error for this
   * approximation is less than 2^-23.
   * a: __m512d, k: __mmask8, src: __m512d
   */
  case class MM512_MASK_EXP2A23_PD(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise NAND of packed 32-bit integers in "a" and "b", producing
   * intermediate 32-bit values, and set the corresponding bit in result mask "k"
   * (subject to writemask "k") if the intermediate value is zero.
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_TESTN_EPI32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers in "a" to packed 8-bit integers with
   * truncation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTEPI32_EPI8(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASK_CMPLT_EPU8_MASK(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed unsigned 16-bit integers in "b" from packed unsigned 16-bit
   * integers in "a" using saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASK_SUBS_EPU16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle single-precision (32-bit) floating-point elements in "a" and "b" using
   * the corresponding selector and index in "idx", and store the results in "dst"
   * using writemask "k" (elements are copied from "a" when the corresponding mask
   * bit is not set).
   * a: __m128, k: __mmask8, idx: __m128i, b: __m128
   */
  case class MM_MASK_PERMUTEX2VAR_PS(a: Exp[__m128], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 16-bit integers in the high 64 bits of "a" using the control in
   * "imm8". Store the results in the high 64 bits of "dst", with the low 64 bits
   * being copied from from "a" to "dst", using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i, imm8: int
   */
  case class MM_MASK_SHUFFLEHI_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" across lanes using the corresponding
   * selector and index in "idx", and store the results in "dst" using writemask
   * "k" (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256i, k: __mmask8, idx: __m256i, b: __m256i
   */
  case class MM256_MASK_PERMUTEX2VAR_EPI32(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m512i
   */
  case class MM512_MASKZ_CVTEPU64_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed 64-bit integers from "a" and "b" using control mask "k", and
   * store the results in "dst".
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASK_BLEND_EPI64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise OR of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_OR_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst".
   * a: __m512i
   */
  case class MM512_CVTEPU32_PS(a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load packed double-precision (64-bit) floating-point elements from memoy into
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	"mem_addr" does not need to be aligned on
   * any particular boundary.
   * src: __m256d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM256_MASK_LOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m256d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the right by the
   * number of bits specified in "imm8", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_ROR_EPI64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Broadcast the low packed 16-bit integer from "a" to all elements of "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask32, a: short
   */
  case class MM512_MASKZ_SET1_EPI16(k: Exp[Int], a: Exp[Short]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.IntrinsicsSet)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed 8-bit integers in "a" and "b", producing
   * intermediate 8-bit values, and set the corresponding bit in result mask "k" if
   * the intermediate value is non-zero.
   * a: __m128i, b: __m128i
   */
  case class MM_TEST_EPI8_MASK(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "imm8" while shifting in sign
   * bits, and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, imm8: unsigned int
   */
  case class MM256_MASKZ_SRAI_EPI32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MAX_EPU8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I32SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, count: __m128i
   */
  case class MM_MASKZ_SRAV_EPI32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed 32-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * src: __m256i, k: __mmask8, a: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scatter 64-bit integers from "a" into memory using 64-bit indices. 64-bit
   * elements are stored at addresses starting at "base_addr" and offset by each
   * 64-bit element in "vindex" (each index is scaled by the factor in "scale")
   * subject to mask "k" (elements are not stored when the corresponding mask bit
   * is not set). "scale" should be 1, 2, 4 or 8.
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_EPI64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI64_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTSD_I64(a: Exp[__m128d]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst" using writemask "k" (elements are copied from "c"
   * when the corresponding mask bit is not set).
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FNMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed single-precision (32-bit) floating-point elements, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128, k: __mmask8, a: __m128d
   */
  case class MM_MASK_CVTPD_PS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128d]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 64-bit integers from the low half of "a" and "b", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_UNPACKLO_EPI64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI64_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the approximate reciprocal of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). The maximum relative error for this approximation is less than 2^-14.
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_RCP14_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rotate the bits in each packed 64-bit integer in "a" to the left by the number
   * of bits specified in the corresponding element of "b", and store the results
   * in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_ROLV_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed 64-bit integers in "a" to packed 32-bit integers with signed
   * saturation, and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_CVTSEPI64_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scale the packed single-precision (32-bit) floating-point elements in "a"
   * using values from "b", store the result in the lower element of "dst" using
   * writemask "k" (the element is copied from "src" when mask bit 0 is not set),
   * and copy the upper 3 packed elements from "b" to the upper elements of "dst".
   * src: __m128, k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_SCALEF_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the low unsigned 32-bit integers from each packed 64-bit element in
   * "a" and "b", and store the unsigned 64-bit results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_MUL_EPU32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "k", and store the results in "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASK_BLEND_PS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Contiguously store the active 32-bit integers in "a" (those with their
   * respective bit set in zeromask "k") to "dst", and set the remaining elements
   * to zero.
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_COMPRESS_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b" for
   * greater-than-or-equal, and store the results in mask vector "k1" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k1: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPGE_EPU32_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle double-precision (64-bit) floating-point elements in "a" within
   * 128-bit lanes using the control in "imm8", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m512d, imm8: const int
   */
  case class MM512_MASKZ_PERMUTE_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of leading zero bits in each packed 32-bit integer in "a",
   * and store the results in "dst" using zeromask "k" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k: __mmask8, a: __m256i
   */
  case class MM256_MASKZ_LZCNT_EPI32(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 8-bit integers in "a" and "b" for less-than, and store
   * the results in mask vector "k" using zeromask "k1" (elements are zeroed out
   * when the corresponding mask bit is not set).
   * k1: __mmask16, a: __m128i, b: __m128i
   */
  case class MM_MASK_CMPLT_EPU8_MASK(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the bitwise AND of packed double-precision (64-bit) floating-point
   * elements in "a" and "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d, b: __m256d
   */
  case class MM256_MASK_AND_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask32, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MIN_EPU16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in the low 4 bytes of "a" to
   * packed 64-bit integers, and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTEPU16_EPI64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m256d
   */
  case class MM256_MASK_EXPAND_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 2 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m128d, k: __mmask8, a: __m256d, imm8: int
   */
  case class MM256_MASK_EXTRACTF64X2_PD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
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
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMADDSUB_PS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 16-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m512i, b: __m512i
   */
  case class MM512_CMPEQ_EPI16_MASK(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by the amount specified by the
   * corresponding element in "count" while shifting in sign bits, and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m256i
   */
  case class MM256_MASK_SRAV_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
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
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_EXPAND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * src: __m512i, k: __mmask8, vindex: __m512i, base_addr: void const*, scale: int, base_addrOffset: int
   */
  case class MM512_MASK_I64GATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b" for equality, and store the
   * results in mask vector "k".
   * a: __m256i, b: __m256i
   */
  case class MM256_CMPEQ_EPI8_MASK(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer, IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Duplicate even-indexed single-precision (32-bit) floating-point elements from
   * "a", and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m256, k: __mmask8, a: __m256
   */
  case class MM256_MASK_MOVELDUP_PS(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Move)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (64-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).  
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m256i, k: __mmask8, a: __m512d, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPD_EPU32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU8_EPI16(a: Exp[__m256i]) extends IntrinsicsDef[__m512i] {
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
   * base_addr: void*, k: __mmask8, vindex: __m128i, a: __m128i, scale: const int, base_addrOffset: int
   */
  case class MM_MASK_I64SCATTER_EPI32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_MAX_EPU32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shuffle 32-bit integers in "a" and "b" using the corresponding selector and
   * index in "idx", and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, idx: __m128i, b: __m128i
   */
  case class MM_MASKZ_PERMUTEX2VAR_EPI32(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FNMADD_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 64-bit integers in "a" to packed unsigned 32-bit
   * integers with unsigned saturation, and store the results in "dst".
   * a: __m256i
   */
  case class MM256_CVTUSEPI64_EPI32(a: Exp[__m256i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 16-bit integers in "b" from packed 16-bit integers in "a"
   * using saturation, and store the results in "dst" using zeromask "k" (elements
   * are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_SUBS_EPI16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m256d, k: __mmask8, b: __m256d, c: __m256d
   */
  case class MM256_MASK_FMSUBADD_PD(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Unpack and interleave 8-bit integers from the low half of each 128-bit lane in
   * "a" and "b", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask32, a: __m256i, b: __m256i
   */
  case class MM256_MASKZ_UNPACKLO_EPI8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Add packed 32-bit integers in "a" and "b", and store the results in "dst"
   * using zeromask "k" (elements are zeroed out when the corresponding mask bit is
   * not set).
   * k: __mmask8, a: __m128i, b: __m128i
   */
  case class MM_MASKZ_ADD_EPI32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Shift packed 32-bit integers in "a" right by "count" while shifting in zeros,
   * and store the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m256i, count: __m128i
   */
  case class MM256_MASK_SRL_EPI32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Shift)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Subtract packed 8-bit integers in "b" from packed 8-bit integers in "a", and
   * store the results in "dst" using zeromask "k" (elements are zeroed out when
   * the corresponding mask bit is not set).
   * k: __mmask64, a: __m512i, b: __m512i
   */
  case class MM512_MASKZ_SUB_EPI8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed unsigned 16-bit
   * integers with unsigned saturation, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m128i, k: __mmask8, a: __m128i
   */
  case class MM_MASK_CVTUSEPI32_EPI16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 64-bit integers, and store the results in "dst" using zeromask
   * "k" (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m128
   */
  case class MM_MASKZ_CVTPS_EPU64(k: Exp[Int], a: Exp[__m128]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compare packed double-precision (64-bit) floating-point elements in "a" and
   * "b", and store packed maximum values in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set). 
   * 	Pass
   * __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * k: __mmask8, a: __m512d, b: __m512d, sae: int
   */
  case class MM512_MASKZ_MAX_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_mask_min_epu64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MIN_EPU64(src, k, a, b)
  }
            
  def _mm512_mask_compress_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COMPRESS_PS(src, k, a)
  }
            
  def _mm_mask_testn_epi8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI8_MASK(k1, a, b)
  }
            
  def _mm_mask_div_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_DIV_SS(src, k, a, b)
  }
            
  def _mm512_mask_mul_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MUL_EPU32(src, k, a, b)
  }
            
  def _mm256_i64scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], vindex: Exp[__m256i], a: Exp[__m256d], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_rsqrt14_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_RSQRT14_PD(k, a)
  }
            
  def _mm256_permutex2var_epi32(a: Exp[__m256i], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_PERMUTEX2VAR_EPI32(a, idx, b)
  }
            
  def _mm256_mask_testn_epi64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_TESTN_EPI64_MASK(k1, a, b)
  }
            
  def _mm_cvttss_i64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTTSS_I64(a)
  }
            
  def _mm_cvtsepi32_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTSEPI32_EPI8(a)
  }
            
  def _mm256_cvtepu64_pd(a: Exp[__m256i]): Exp[__m256d] = {
    MM256_CVTEPU64_PD(a)
  }
            
  def _mm256_mask_set1_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[Long]): Exp[__m256i] = {
    MM256_MASK_SET1_EPI64(src, k, a)
  }
            
  def _mm512_kmov(a: Exp[Int]): Exp[Int] = {
    MM512_KMOV(a)
  }
            
  def _mm256_cmp_epu16_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPU16_MASK(a, b, imm8)
  }
            
  def _mm256_maskz_permutexvar_pd(k: Exp[Int], idx: Exp[__m256i], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASKZ_PERMUTEXVAR_PD(k, idx, a)
  }
            
  def _mm_maskz_adds_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADDS_EPI16(k, a, b)
  }
            
  def _mm_mask_broadcastq_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_BROADCASTQ_EPI64(src, k, a)
  }
            
  def _mm512_mask_cvtps_epu64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m256]): Exp[__m512i] = {
    MM512_MASK_CVTPS_EPU64(src, k, a)
  }
            
  def _mm256_mask_permutevar_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASK_PERMUTEVAR_PD(src, k, a, b)
  }
            
  def _mm_mask_div_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_DIV_SD(src, k, a, b)
  }
            
  def _mm512_madd52lo_epu64(a: Exp[__m512i], b: Exp[__m512i], c: Exp[__m512i]): Exp[__m512i] = {
    MM512_MADD52LO_EPU64(a, b, c)
  }
            
  def _mm512_maskz_set1_epi8(k: Exp[Long], a: Exp[Byte]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI8(k, a)
  }
            
  def _mm512_maskz_mul_epu32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MUL_EPU32(k, a, b)
  }
            
  def _mm_maskz_unpackhi_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKHI_EPI64(k, a, b)
  }
            
  def _mm512_mask_rorv_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_RORV_EPI64(src, k, a, b)
  }
            
  def _mm_mask_fnmadd_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FNMADD_SD(a, k, b, c)
  }
            
  def _mm256_maskz_max_epu16(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU16(k, a, b)
  }
            
  def _mm_mask_cmple_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLE_EPI32_MASK(k1, a, b)
  }
            
  def _mm_maskz_or_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_OR_PS(k, a, b)
  }
            
  def _mm_maskz_rcp28_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_RCP28_SD(k, a, b)
  }
            
  def _mm256_mask_cmpge_epu16_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPGE_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_mask_sub_epi8(src: Exp[__m512i], k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUB_EPI8(src, k, a, b)
  }
            
  def _mm256_maskz_reduce_pd(k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_REDUCE_PD(k, a, imm8)
  }
            
  def _mm_maskz_getmant_ps(k: Exp[Int], a: Exp[__m128], interv: Exp[Int], sc: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_GETMANT_PS(k, a, interv, sc)
  }
            
  def _mm_cvtusepi32_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTUSEPI32_EPI16(a)
  }
            
  def _mm256_mask2_permutex2var_epi64(a: Exp[__m256i], idx: Exp[__m256i], k: Exp[Int], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b)
  }
            
  def _mm512_mask_test_epi64_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_TEST_EPI64_MASK(k1, a, b)
  }
            
  def _mm512_and_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_AND_PS(a, b)
  }
            
  def _mm_cmple_epu64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPLE_EPU64_MASK(a, b)
  }
            
  def _mm_cmpge_epi16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPI16_MASK(a, b)
  }
            
  def _mm512_mask_unpacklo_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_UNPACKLO_EPI16(src, k, a, b)
  }
            
  def _mm512_mask_shuffle_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SHUFFLE_PS(src, k, a, b, imm8)
  }
            
  def _mm512_exp2a23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXP2A23_PS(a)
  }
            
  def _mm_cvtt_roundss_u64(a: Exp[__m128], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVTT_ROUNDSS_U64(a, rounding)
  }
            
  def _mm_maskz_broadcastb_epi8(k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_BROADCASTB_EPI8(k, a)
  }
            
  def _mm512_mask_cmplt_epu16_mask(k1: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_MASK_CMPLT_EPU16_MASK(k1, a, b)
  }
            
  def _mm512_maskz_cvtusepi64_epi32(k: Exp[Int], a: Exp[__m512i]): Exp[__m256i] = {
    MM512_MASKZ_CVTUSEPI64_EPI32(k, a)
  }
            
  def _mm_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.read(mem_addr)(MM_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_scalef_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_SCALEF_PS(a, b)
  }
            
  def _mm512_maskz_unpackhi_epi32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKHI_EPI32(k, a, b)
  }
            
  def _mm512_maskz_rcp28_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_RCP28_PS(k, a)
  }
            
  def _mm_mask_cmpeq_epu64_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPEQ_EPU64_MASK(k1, a, b)
  }
            
  def _mm_roundscale_ss(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_ROUNDSCALE_SS(a, b, imm8)
  }
            
  def _mm256_maskz_madd52hi_epu64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i], c: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MADD52HI_EPU64(k, a, b, c)
  }
            
  def _mm256_mask_cvtph_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m128i]): Exp[__m256] = {
    MM256_MASK_CVTPH_PS(src, k, a)
  }
            
  def _mm256_mask_compressstoreu_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_loadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m128], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.read(mem_addr)(MM_MASK_LOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_cvtsepi64_storeu_epi16[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM256_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_movedup_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_MOVEDUP_PD(src, k, a)
  }
            
  def _mm256_mask_multishift_epi64_epi8(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b)
  }
            
  def _mm512_mask_permutevar_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_PERMUTEVAR_PS(src, k, a, b)
  }
            
  def _mm512_mask_roundscale_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDSCALE_ROUND_PS(src, k, a, imm8, rounding)
  }
            
  def _mm256_mask_cmp_ps_mask(k1: Exp[Int], a: Exp[__m256], b: Exp[__m256], imm8: Exp[Int]): Exp[Int] = {
    MM256_MASK_CMP_PS_MASK(k1, a, b, imm8)
  }
            
  def _mm256_maskz_cvtepu64_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m256d] = {
    MM256_MASKZ_CVTEPU64_PD(k, a)
  }
            
  def _mm_testn_epi64_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTN_EPI64_MASK(a, b)
  }
            
  def _mm_cmpge_epu16_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_CMPGE_EPU16_MASK(a, b)
  }
            
  def _mm512_cmple_epi8_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_CMPLE_EPI8_MASK(a, b)
  }
            
  def _mm_conflict_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CONFLICT_EPI32(a)
  }
            
  def _mm512_mask_mov_epi16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MOV_EPI16(src, k, a)
  }
            
  def _mm256_mask_cmple_epu64_mask(k1: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_MASK_CMPLE_EPU64_MASK(k1, a, b)
  }
            
  def _mm512_mask_cvtusepi32_storeu_epi8[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m512i], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_max_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MAX_EPI64(a, b)
  }
            
  def _mm512_unpackhi_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI32(a, b)
  }
            
  def _mm_maskz_div_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_DIV_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm512_maskz_broadcast_f64x4(k: Exp[Int], a: Exp[__m256d]): Exp[__m512d] = {
    MM512_MASKZ_BROADCAST_F64X4(k, a)
  }
            
  def _mm256_mask_permutex2var_epi16(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b)
  }
            
  def _mm_mask_getexp_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_GETEXP_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm256_maskz_insertf64x2(k: Exp[Int], a: Exp[__m256d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m256d] = {
    MM256_MASKZ_INSERTF64X2(k, a, b, imm8)
  }
            
  def _mm512_maskz_broadcastw_epi16(k: Exp[Int], a: Exp[__m128i]): Exp[__m512i] = {
    MM512_MASKZ_BROADCASTW_EPI16(k, a)
  }
            
  def _mm_maskz_add_epi8(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADD_EPI8(k, a, b)
  }
            
  def _mm256_cmp_epi16_mask(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[Int] = {
    MM256_CMP_EPI16_MASK(a, b, imm8)
  }
            
  def _mm_maskz_mul_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_MUL_SS(k, a, b)
  }
            
  def _mm512_mask_prefetch_i32scatter_pd[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], mask: Exp[Int], vinde: Exp[__m256i], scale: Exp[Int], hint: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_PREFETCH_I32SCATTER_PD(base_addr, mask, vinde, scale, hint, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_sqrt_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_SQRT_PS(src, k, a)
  }
            
  def _mm512_unpackhi_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_UNPACKHI_EPI16(a, b)
  }
            
  def _mm256_cmpeq_epu16_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPU16_MASK(a, b)
  }
            
  def _mm_cvttpd_epu64(a: Exp[__m128d]): Exp[__m128i] = {
    MM_CVTTPD_EPU64(a)
  }
            
  def _mm256_maskz_sllv_epi32(k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_SLLV_EPI32(k, a, count)
  }
            
  def _mm512_fixupimm_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  def _mm512_mask_i32scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m256i], a: Exp[__m512i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM512_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_mask_storeu_ps[A[_], T:Typ, U:Integral](mem_addr: Exp[A[T]], k: Exp[Int], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mem_addr)(MM256_MASK_STOREU_PS(mem_addr, k, a, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_dbsad_epu8(a: Exp[__m256i], b: Exp[__m256i], imm8: Exp[Int]): Exp[__m256i] = {
    MM256_DBSAD_EPU8(a, b, imm8)
  }
            
  def _mm512_mask2int(k1: Exp[Int]): Exp[Int] = {
    MM512_MASK2INT(k1)
  }
            
  def _mm512_ror_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_ROR_EPI32(a, imm8)
  }
            
  def _mm512_roundscale_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDSCALE_PS(a, imm8)
  }
            
  def _mm_maskz_cvttpd_epu32(k: Exp[Int], a: Exp[__m128d]): Exp[__m128i] = {
    MM_MASKZ_CVTTPD_EPU32(k, a)
  }
            
  def _mm256_maskz_andnot_ps(k: Exp[Int], a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_MASKZ_ANDNOT_PS(k, a, b)
  }
            
  def _mm512_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm512_maskz_load_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_shuffle_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SHUFFLE_PD(src, k, a, b, imm8)
  }
            
  def _mm512_mask_reduce_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_REDUCE_ROUND_PD(src, k, a, imm8, rounding)
  }
            
  def _mm_mask_test_epi16_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TEST_EPI16_MASK(k1, a, b)
  }
            
  def _mm_mask_cvtps_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASK_CVTPS_EPI64(src, k, a)
  }
            
  def _mm256_maskz_min_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MIN_EPI64(k, a, b)
  }
            
  def _mm_maskz_srli_epi32(k: Exp[Int], a: Exp[__m128i], imm8: Exp[UInt]): Exp[__m128i] = {
    MM_MASKZ_SRLI_EPI32(k, a, imm8)
  }
            
  def _mm512_mask_exp2a23_pd(a: Exp[__m512d], k: Exp[Int], src: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP2A23_PD(a, k, src)
  }
            
  def _mm_mask_testn_epi32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_TESTN_EPI32_MASK(k1, a, b)
  }
            
  def _mm256_cvtepi32_epi8(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTEPI32_EPI8(a)
  }
            
  def _mm512_mask_cmplt_epu8_mask(k1: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[Long] = {
    MM512_MASK_CMPLT_EPU8_MASK(k1, a, b)
  }
            
  def _mm512_mask_subs_epu16(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_SUBS_EPU16(src, k, a, b)
  }
            
  def _mm_mask_permutex2var_ps(a: Exp[__m128], k: Exp[Int], idx: Exp[__m128i], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_PERMUTEX2VAR_PS(a, k, idx, b)
  }
            
  def _mm_mask_shufflehi_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MASK_SHUFFLEHI_EPI16(src, k, a, imm8)
  }
            
  def _mm256_mask_permutex2var_epi32(a: Exp[__m256i], k: Exp[Int], idx: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b)
  }
            
  def _mm512_maskz_cvtepu64_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m256] = {
    MM512_MASKZ_CVTEPU64_PS(k, a)
  }
            
  def _mm256_mask_blend_epi64(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_BLEND_EPI64(k, a, b)
  }
            
  def _mm512_maskz_or_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_OR_PD(k, a, b)
  }
            
  def _mm512_cvtepu32_ps(a: Exp[__m512i]): Exp[__m512] = {
    MM512_CVTEPU32_PS(a)
  }
            
  def _mm256_mask_loadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m256d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.read(mem_addr)(MM256_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_ror_epi64(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_ROR_EPI64(src, k, a, imm8)
  }
            
  def _mm512_maskz_set1_epi16(k: Exp[Int], a: Exp[Short]): Exp[__m512i] = {
    MM512_MASKZ_SET1_EPI16(k, a)
  }
            
  def _mm_test_epi8_mask(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TEST_EPI8_MASK(a, b)
  }
            
  def _mm256_maskz_srai_epi32(k: Exp[Int], a: Exp[__m256i], imm8: Exp[UInt]): Exp[__m256i] = {
    MM256_MASKZ_SRAI_EPI32(k, a, imm8)
  }
            
  def _mm256_maskz_max_epu8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MAX_EPU8(k, a, b)
  }
            
  def _mm_fixupimm_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm_mask_i32scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_maskz_srav_epi32(k: Exp[Int], a: Exp[__m128i], count: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SRAV_EPI32(k, a, count)
  }
            
  def _mm512_mask_cvt_roundpd_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVT_ROUNDPD_EPI32(src, k, a, rounding)
  }
            
  def _mm_mask_i64scatter_epi64[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_mask_cvtusepi64_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI64_EPI16(src, k, a)
  }
            
  def _mm_cvtsd_i64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTSD_I64(a)
  }
            
  def _mm_mask3_fnmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FNMSUB_PD(a, b, c, k)
  }
            
  def _mm_mask_cvtpd_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m128d]): Exp[__m128] = {
    MM_MASK_CVTPD_PS(src, k, a)
  }
            
  def _mm_maskz_unpacklo_epi64(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_UNPACKLO_EPI64(k, a, b)
  }
            
  def _mm256_cvtusepi64_epi16(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI16(a)
  }
            
  def _mm256_mask_rcp14_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_RCP14_PD(src, k, a)
  }
            
  def _mm512_rolv_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_ROLV_EPI64(a, b)
  }
            
  def _mm256_maskz_cvtsepi64_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m128i] = {
    MM256_MASKZ_CVTSEPI64_EPI32(k, a)
  }
            
  def _mm_mask_scalef_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_SCALEF_SS(src, k, a, b)
  }
            
  def _mm256_maskz_mul_epu32(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_MUL_EPU32(k, a, b)
  }
            
  def _mm_mask_blend_ps(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_BLEND_PS(k, a, b)
  }
            
  def _mm256_maskz_compress_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_COMPRESS_EPI32(k, a)
  }
            
  def _mm_mask_cmpge_epu32_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPGE_EPU32_MASK(k1, a, b)
  }
            
  def _mm512_maskz_permute_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_PERMUTE_PD(k, a, imm8)
  }
            
  def _mm256_maskz_lzcnt_epi32(k: Exp[Int], a: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_LZCNT_EPI32(k, a)
  }
            
  def _mm_mask_cmplt_epu8_mask(k1: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_MASK_CMPLT_EPU8_MASK(k1, a, b)
  }
            
  def _mm256_mask_and_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_AND_PD(src, k, a, b)
  }
            
  def _mm512_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm512_maskz_min_epu16(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MIN_EPU16(k, a, b)
  }
            
  def _mm_mask_cvtepu16_epi64(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTEPU16_EPI64(src, k, a)
  }
            
  def _mm256_mask_expand_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm256_mask_extractf64x2_pd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m256d], imm8: Exp[Int]): Exp[__m128d] = {
    MM256_MASK_EXTRACTF64X2_PD(src, k, a, imm8)
  }
            
  def _mm_mask_fmaddsub_ps(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm512_cmpeq_epi16_mask(a: Exp[__m512i], b: Exp[__m512i]): Exp[Int] = {
    MM512_CMPEQ_EPI16_MASK(a, b)
  }
            
  def _mm256_mask_srav_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASK_SRAV_EPI32(src, k, a, count)
  }
            
  def _mm512_mask_expand_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm512_mask_i64gather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], vindex: Exp[__m512i], base_addr: Exp[A[T]], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(base_addr)(MM512_MASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm256_cmpeq_epi8_mask(a: Exp[__m256i], b: Exp[__m256i]): Exp[Int] = {
    MM256_CMPEQ_EPI8_MASK(a, b)
  }
            
  def _mm256_mask_moveldup_ps(src: Exp[__m256], k: Exp[Int], a: Exp[__m256]): Exp[__m256] = {
    MM256_MASK_MOVELDUP_PS(src, k, a)
  }
            
  def _mm512_mask_cvtt_roundpd_epu32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512d], sae: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_CVTT_ROUNDPD_EPU32(src, k, a, sae)
  }
            
  def _mm512_cvtepu8_epi16(a: Exp[__m256i]): Exp[__m512i] = {
    MM512_CVTEPU8_EPI16(a)
  }
            
  def _mm_mask_i64scatter_epi32[A[_], T:Typ, U:Integral](base_addr: Exp[A[T]], k: Exp[Int], vindex: Exp[__m128i], a: Exp[__m128i], scale: Exp[Int], base_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(base_addr)(MM_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_max_epu32(k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_MAX_EPU32(k, a, b)
  }
            
  def _mm_maskz_permutex2var_epi32(k: Exp[Int], a: Exp[__m128i], idx: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b)
  }
            
  def _mm_maskz_fnmadd_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FNMADD_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm256_cvtusepi64_epi32(a: Exp[__m256i]): Exp[__m128i] = {
    MM256_CVTUSEPI64_EPI32(a)
  }
            
  def _mm_maskz_subs_epi16(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_SUBS_EPI16(k, a, b)
  }
            
  def _mm256_mask_fmsubadd_pd(a: Exp[__m256d], k: Exp[Int], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm256_maskz_unpacklo_epi8(k: Exp[Int], a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_MASKZ_UNPACKLO_EPI8(k, a, b)
  }
            
  def _mm_maskz_add_epi32(k: Exp[Int], a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MASKZ_ADD_EPI32(k, a, b)
  }
            
  def _mm256_mask_srl_epi32(src: Exp[__m256i], k: Exp[Int], a: Exp[__m256i], count: Exp[__m128i]): Exp[__m256i] = {
    MM256_MASK_SRL_EPI32(src, k, a, count)
  }
            
  def _mm512_maskz_sub_epi8(k: Exp[Long], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASKZ_SUB_EPI8(k, a, b)
  }
            
  def _mm_mask_cvtusepi32_epi16(src: Exp[__m128i], k: Exp[Int], a: Exp[__m128i]): Exp[__m128i] = {
    MM_MASK_CVTUSEPI32_EPI16(src, k, a)
  }
            
  def _mm_maskz_cvtps_epu64(k: Exp[Int], a: Exp[__m128]): Exp[__m128i] = {
    MM_MASKZ_CVTPS_EPU64(k, a)
  }
            
  def _mm512_maskz_max_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], sae: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_MAX_ROUND_PD(k, a, b, sae)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_MASK_MIN_EPU64 (src, k, a, b) =>
      _mm256_mask_min_epu64(f(src), f(k), f(a), f(b))
    case MM512_MASK_COMPRESS_PS (src, k, a) =>
      _mm512_mask_compress_ps(f(src), f(k), f(a))
    case MM_MASK_TESTN_EPI8_MASK (k1, a, b) =>
      _mm_mask_testn_epi8_mask(f(k1), f(a), f(b))
    case MM_MASK_DIV_SS (src, k, a, b) =>
      _mm_mask_div_ss(f(src), f(k), f(a), f(b))
    case MM512_MASK_MUL_EPU32 (src, k, a, b) =>
      _mm512_mask_mul_epu32(f(src), f(k), f(a), f(b))
    case iDef@MM256_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset) =>
      _mm256_i64scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_RSQRT14_PD (k, a) =>
      _mm512_maskz_rsqrt14_pd(f(k), f(a))
    case MM256_PERMUTEX2VAR_EPI32 (a, idx, b) =>
      _mm256_permutex2var_epi32(f(a), f(idx), f(b))
    case MM256_MASK_TESTN_EPI64_MASK (k1, a, b) =>
      _mm256_mask_testn_epi64_mask(f(k1), f(a), f(b))
    case MM_CVTTSS_I64 (a) =>
      _mm_cvttss_i64(f(a))
    case MM_CVTSEPI32_EPI8 (a) =>
      _mm_cvtsepi32_epi8(f(a))
    case MM256_CVTEPU64_PD (a) =>
      _mm256_cvtepu64_pd(f(a))
    case MM256_MASK_SET1_EPI64 (src, k, a) =>
      _mm256_mask_set1_epi64(f(src), f(k), f(a))
    case MM512_KMOV (a) =>
      _mm512_kmov(f(a))
    case MM256_CMP_EPU16_MASK (a, b, imm8) =>
      _mm256_cmp_epu16_mask(f(a), f(b), f(imm8))
    case MM256_MASKZ_PERMUTEXVAR_PD (k, idx, a) =>
      _mm256_maskz_permutexvar_pd(f(k), f(idx), f(a))
    case MM_MASKZ_ADDS_EPI16 (k, a, b) =>
      _mm_maskz_adds_epi16(f(k), f(a), f(b))
    case MM_MASK_BROADCASTQ_EPI64 (src, k, a) =>
      _mm_mask_broadcastq_epi64(f(src), f(k), f(a))
    case MM512_MASK_CVTPS_EPU64 (src, k, a) =>
      _mm512_mask_cvtps_epu64(f(src), f(k), f(a))
    case MM256_MASK_PERMUTEVAR_PD (src, k, a, b) =>
      _mm256_mask_permutevar_pd(f(src), f(k), f(a), f(b))
    case MM_MASK_DIV_SD (src, k, a, b) =>
      _mm_mask_div_sd(f(src), f(k), f(a), f(b))
    case MM512_MADD52LO_EPU64 (a, b, c) =>
      _mm512_madd52lo_epu64(f(a), f(b), f(c))
    case MM512_MASKZ_SET1_EPI8 (k, a) =>
      _mm512_maskz_set1_epi8(f(k), f(a))
    case MM512_MASKZ_MUL_EPU32 (k, a, b) =>
      _mm512_maskz_mul_epu32(f(k), f(a), f(b))
    case MM_MASKZ_UNPACKHI_EPI64 (k, a, b) =>
      _mm_maskz_unpackhi_epi64(f(k), f(a), f(b))
    case MM512_MASK_RORV_EPI64 (src, k, a, b) =>
      _mm512_mask_rorv_epi64(f(src), f(k), f(a), f(b))
    case MM_MASK_FNMADD_SD (a, k, b, c) =>
      _mm_mask_fnmadd_sd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_MAX_EPU16 (k, a, b) =>
      _mm256_maskz_max_epu16(f(k), f(a), f(b))
    case MM_MASK_CMPLE_EPI32_MASK (k1, a, b) =>
      _mm_mask_cmple_epi32_mask(f(k1), f(a), f(b))
    case MM_MASKZ_OR_PS (k, a, b) =>
      _mm_maskz_or_ps(f(k), f(a), f(b))
    case MM_MASKZ_RCP28_SD (k, a, b) =>
      _mm_maskz_rcp28_sd(f(k), f(a), f(b))
    case MM256_MASK_CMPGE_EPU16_MASK (k1, a, b) =>
      _mm256_mask_cmpge_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASK_SUB_EPI8 (src, k, a, b) =>
      _mm512_mask_sub_epi8(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_REDUCE_PD (k, a, imm8) =>
      _mm256_maskz_reduce_pd(f(k), f(a), f(imm8))
    case MM_MASKZ_GETMANT_PS (k, a, interv, sc) =>
      _mm_maskz_getmant_ps(f(k), f(a), f(interv), f(sc))
    case MM_CVTUSEPI32_EPI16 (a) =>
      _mm_cvtusepi32_epi16(f(a))
    case MM256_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b) =>
      _mm256_mask2_permutex2var_epi64(f(a), f(idx), f(k), f(b))
    case MM512_MASK_TEST_EPI64_MASK (k1, a, b) =>
      _mm512_mask_test_epi64_mask(f(k1), f(a), f(b))
    case MM512_AND_PS (a, b) =>
      _mm512_and_ps(f(a), f(b))
    case MM_CMPLE_EPU64_MASK (a, b) =>
      _mm_cmple_epu64_mask(f(a), f(b))
    case MM_CMPGE_EPI16_MASK (a, b) =>
      _mm_cmpge_epi16_mask(f(a), f(b))
    case MM512_MASK_UNPACKLO_EPI16 (src, k, a, b) =>
      _mm512_mask_unpacklo_epi16(f(src), f(k), f(a), f(b))
    case MM512_MASK_SHUFFLE_PS (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_ps(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_EXP2A23_PS (a) =>
      _mm512_exp2a23_ps(f(a))
    case MM_CVTT_ROUNDSS_U64 (a, rounding) =>
      _mm_cvtt_roundss_u64(f(a), f(rounding))
    case MM_MASKZ_BROADCASTB_EPI8 (k, a) =>
      _mm_maskz_broadcastb_epi8(f(k), f(a))
    case MM512_MASK_CMPLT_EPU16_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epu16_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_CVTUSEPI64_EPI32 (k, a) =>
      _mm512_maskz_cvtusepi64_epi32(f(k), f(a))
    case iDef@MM_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_SCALEF_PS (a, b) =>
      _mm256_scalef_ps(f(a), f(b))
    case MM512_MASKZ_UNPACKHI_EPI32 (k, a, b) =>
      _mm512_maskz_unpackhi_epi32(f(k), f(a), f(b))
    case MM512_MASKZ_RCP28_PS (k, a) =>
      _mm512_maskz_rcp28_ps(f(k), f(a))
    case MM_MASK_CMPEQ_EPU64_MASK (k1, a, b) =>
      _mm_mask_cmpeq_epu64_mask(f(k1), f(a), f(b))
    case MM_ROUNDSCALE_SS (a, b, imm8) =>
      _mm_roundscale_ss(f(a), f(b), f(imm8))
    case MM256_MASKZ_MADD52HI_EPU64 (k, a, b, c) =>
      _mm256_maskz_madd52hi_epu64(f(k), f(a), f(b), f(c))
    case MM256_MASK_CVTPH_PS (src, k, a) =>
      _mm256_mask_cvtph_ps(f(src), f(k), f(a))
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_compressstoreu_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM_MASK_LOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm_mask_loadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset) =>
      _mm256_mask_cvtsepi64_storeu_epi16(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_MOVEDUP_PD (src, k, a) =>
      _mm256_mask_movedup_pd(f(src), f(k), f(a))
    case MM256_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b) =>
      _mm256_mask_multishift_epi64_epi8(f(src), f(k), f(a), f(b))
    case MM512_MASK_PERMUTEVAR_PS (src, k, a, b) =>
      _mm512_mask_permutevar_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_ROUNDSCALE_ROUND_PS (src, k, a, imm8, rounding) =>
      _mm512_mask_roundscale_round_ps(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM256_MASK_CMP_PS_MASK (k1, a, b, imm8) =>
      _mm256_mask_cmp_ps_mask(f(k1), f(a), f(b), f(imm8))
    case MM256_MASKZ_CVTEPU64_PD (k, a) =>
      _mm256_maskz_cvtepu64_pd(f(k), f(a))
    case MM_TESTN_EPI64_MASK (a, b) =>
      _mm_testn_epi64_mask(f(a), f(b))
    case MM_CMPGE_EPU16_MASK (a, b) =>
      _mm_cmpge_epu16_mask(f(a), f(b))
    case MM512_CMPLE_EPI8_MASK (a, b) =>
      _mm512_cmple_epi8_mask(f(a), f(b))
    case MM_CONFLICT_EPI32 (a) =>
      _mm_conflict_epi32(f(a))
    case MM512_MASK_MOV_EPI16 (src, k, a) =>
      _mm512_mask_mov_epi16(f(src), f(k), f(a))
    case MM256_MASK_CMPLE_EPU64_MASK (k1, a, b) =>
      _mm256_mask_cmple_epu64_mask(f(k1), f(a), f(b))
    case iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset) =>
      _mm512_mask_cvtusepi32_storeu_epi8(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MAX_EPI64 (a, b) =>
      _mm512_max_epi64(f(a), f(b))
    case MM512_UNPACKHI_EPI32 (a, b) =>
      _mm512_unpackhi_epi32(f(a), f(b))
    case MM_MASKZ_DIV_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_div_round_ss(f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_BROADCAST_F64X4 (k, a) =>
      _mm512_maskz_broadcast_f64x4(f(k), f(a))
    case MM256_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi16(f(a), f(k), f(idx), f(b))
    case MM_MASK_GETEXP_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_getexp_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM256_MASKZ_INSERTF64X2 (k, a, b, imm8) =>
      _mm256_maskz_insertf64x2(f(k), f(a), f(b), f(imm8))
    case MM512_MASKZ_BROADCASTW_EPI16 (k, a) =>
      _mm512_maskz_broadcastw_epi16(f(k), f(a))
    case MM_MASKZ_ADD_EPI8 (k, a, b) =>
      _mm_maskz_add_epi8(f(k), f(a), f(b))
    case MM256_CMP_EPI16_MASK (a, b, imm8) =>
      _mm256_cmp_epi16_mask(f(a), f(b), f(imm8))
    case MM_MASKZ_MUL_SS (k, a, b) =>
      _mm_maskz_mul_ss(f(k), f(a), f(b))
    case iDef@MM512_MASK_PREFETCH_I32SCATTER_PD (base_addr, mask, vinde, scale, hint, base_addrOffset) =>
      _mm512_mask_prefetch_i32scatter_pd(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vinde, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_MASK_SQRT_PS (src, k, a) =>
      _mm256_mask_sqrt_ps(f(src), f(k), f(a))
    case MM512_UNPACKHI_EPI16 (a, b) =>
      _mm512_unpackhi_epi16(f(a), f(b))
    case MM256_CMPEQ_EPU16_MASK (a, b) =>
      _mm256_cmpeq_epu16_mask(f(a), f(b))
    case MM_CVTTPD_EPU64 (a) =>
      _mm_cvttpd_epu64(f(a))
    case MM256_MASKZ_SLLV_EPI32 (k, a, count) =>
      _mm256_maskz_sllv_epi32(f(k), f(a), f(count))
    case MM512_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm512_fixupimm_pd(f(a), f(b), f(c), f(imm8))
    case iDef@MM512_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm512_mask_i32scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM256_MASK_STOREU_PS (mem_addr, k, a, mem_addrOffset) =>
      _mm256_mask_storeu_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_DBSAD_EPU8 (a, b, imm8) =>
      _mm256_dbsad_epu8(f(a), f(b), f(imm8))
    case MM512_MASK2INT (k1) =>
      _mm512_mask2int(f(k1))
    case MM512_ROR_EPI32 (a, imm8) =>
      _mm512_ror_epi32(f(a), f(imm8))
    case MM512_ROUNDSCALE_PS (a, imm8) =>
      _mm512_roundscale_ps(f(a), f(imm8))
    case MM_MASKZ_CVTTPD_EPU32 (k, a) =>
      _mm_maskz_cvttpd_epu32(f(k), f(a))
    case MM256_MASKZ_ANDNOT_PS (k, a, b) =>
      _mm256_maskz_andnot_ps(f(k), f(a), f(b))
    case MM512_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm512_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case iDef@MM512_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_load_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SHUFFLE_PD (src, k, a, b, imm8) =>
      _mm512_mask_shuffle_pd(f(src), f(k), f(a), f(b), f(imm8))
    case MM512_MASK_REDUCE_ROUND_PD (src, k, a, imm8, rounding) =>
      _mm512_mask_reduce_round_pd(f(src), f(k), f(a), f(imm8), f(rounding))
    case MM_MASK_TEST_EPI16_MASK (k1, a, b) =>
      _mm_mask_test_epi16_mask(f(k1), f(a), f(b))
    case MM_MASK_CVTPS_EPI64 (src, k, a) =>
      _mm_mask_cvtps_epi64(f(src), f(k), f(a))
    case MM256_MASKZ_MIN_EPI64 (k, a, b) =>
      _mm256_maskz_min_epi64(f(k), f(a), f(b))
    case MM_MASKZ_SRLI_EPI32 (k, a, imm8) =>
      _mm_maskz_srli_epi32(f(k), f(a), f(imm8))
    case MM512_MASK_EXP2A23_PD (a, k, src) =>
      _mm512_mask_exp2a23_pd(f(a), f(k), f(src))
    case MM_MASK_TESTN_EPI32_MASK (k1, a, b) =>
      _mm_mask_testn_epi32_mask(f(k1), f(a), f(b))
    case MM256_CVTEPI32_EPI8 (a) =>
      _mm256_cvtepi32_epi8(f(a))
    case MM512_MASK_CMPLT_EPU8_MASK (k1, a, b) =>
      _mm512_mask_cmplt_epu8_mask(f(k1), f(a), f(b))
    case MM512_MASK_SUBS_EPU16 (src, k, a, b) =>
      _mm512_mask_subs_epu16(f(src), f(k), f(a), f(b))
    case MM_MASK_PERMUTEX2VAR_PS (a, k, idx, b) =>
      _mm_mask_permutex2var_ps(f(a), f(k), f(idx), f(b))
    case MM_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8) =>
      _mm_mask_shufflehi_epi16(f(src), f(k), f(a), f(imm8))
    case MM256_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b) =>
      _mm256_mask_permutex2var_epi32(f(a), f(k), f(idx), f(b))
    case MM512_MASKZ_CVTEPU64_PS (k, a) =>
      _mm512_maskz_cvtepu64_ps(f(k), f(a))
    case MM256_MASK_BLEND_EPI64 (k, a, b) =>
      _mm256_mask_blend_epi64(f(k), f(a), f(b))
    case MM512_MASKZ_OR_PD (k, a, b) =>
      _mm512_maskz_or_pd(f(k), f(a), f(b))
    case MM512_CVTEPU32_PS (a) =>
      _mm512_cvtepu32_ps(f(a))
    case iDef@MM256_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm256_mask_loadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ROR_EPI64 (src, k, a, imm8) =>
      _mm512_mask_ror_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_SET1_EPI16 (k, a) =>
      _mm512_maskz_set1_epi16(f(k), f(a))
    case MM_TEST_EPI8_MASK (a, b) =>
      _mm_test_epi8_mask(f(a), f(b))
    case MM256_MASKZ_SRAI_EPI32 (k, a, imm8) =>
      _mm256_maskz_srai_epi32(f(k), f(a), f(imm8))
    case MM256_MASKZ_MAX_EPU8 (k, a, b) =>
      _mm256_maskz_max_epu8(f(k), f(a), f(b))
    case MM_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case iDef@MM_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i32scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASKZ_SRAV_EPI32 (k, a, count) =>
      _mm_maskz_srav_epi32(f(k), f(a), f(count))
    case MM512_MASK_CVT_ROUNDPD_EPI32 (src, k, a, rounding) =>
      _mm512_mask_cvt_roundpd_epi32(f(src), f(k), f(a), f(rounding))
    case iDef@MM_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_epi64(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_MASK_CVTUSEPI64_EPI16 (src, k, a) =>
      _mm_mask_cvtusepi64_epi16(f(src), f(k), f(a))
    case MM_CVTSD_I64 (a) =>
      _mm_cvtsd_i64(f(a))
    case MM_MASK3_FNMSUB_PD (a, b, c, k) =>
      _mm_mask3_fnmsub_pd(f(a), f(b), f(c), f(k))
    case MM_MASK_CVTPD_PS (src, k, a) =>
      _mm_mask_cvtpd_ps(f(src), f(k), f(a))
    case MM_MASKZ_UNPACKLO_EPI64 (k, a, b) =>
      _mm_maskz_unpacklo_epi64(f(k), f(a), f(b))
    case MM256_CVTUSEPI64_EPI16 (a) =>
      _mm256_cvtusepi64_epi16(f(a))
    case MM256_MASK_RCP14_PD (src, k, a) =>
      _mm256_mask_rcp14_pd(f(src), f(k), f(a))
    case MM512_ROLV_EPI64 (a, b) =>
      _mm512_rolv_epi64(f(a), f(b))
    case MM256_MASKZ_CVTSEPI64_EPI32 (k, a) =>
      _mm256_maskz_cvtsepi64_epi32(f(k), f(a))
    case MM_MASK_SCALEF_SS (src, k, a, b) =>
      _mm_mask_scalef_ss(f(src), f(k), f(a), f(b))
    case MM256_MASKZ_MUL_EPU32 (k, a, b) =>
      _mm256_maskz_mul_epu32(f(k), f(a), f(b))
    case MM_MASK_BLEND_PS (k, a, b) =>
      _mm_mask_blend_ps(f(k), f(a), f(b))
    case MM256_MASKZ_COMPRESS_EPI32 (k, a) =>
      _mm256_maskz_compress_epi32(f(k), f(a))
    case MM_MASK_CMPGE_EPU32_MASK (k1, a, b) =>
      _mm_mask_cmpge_epu32_mask(f(k1), f(a), f(b))
    case MM512_MASKZ_PERMUTE_PD (k, a, imm8) =>
      _mm512_maskz_permute_pd(f(k), f(a), f(imm8))
    case MM256_MASKZ_LZCNT_EPI32 (k, a) =>
      _mm256_maskz_lzcnt_epi32(f(k), f(a))
    case MM_MASK_CMPLT_EPU8_MASK (k1, a, b) =>
      _mm_mask_cmplt_epu8_mask(f(k1), f(a), f(b))
    case MM256_MASK_AND_PD (src, k, a, b) =>
      _mm256_mask_and_pd(f(src), f(k), f(a), f(b))
    case MM512_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm512_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_MIN_EPU16 (k, a, b) =>
      _mm512_maskz_min_epu16(f(k), f(a), f(b))
    case MM_MASK_CVTEPU16_EPI64 (src, k, a) =>
      _mm_mask_cvtepu16_epi64(f(src), f(k), f(a))
    case MM256_MASK_EXPAND_PD (src, k, a) =>
      _mm256_mask_expand_pd(f(src), f(k), f(a))
    case MM256_MASK_EXTRACTF64X2_PD (src, k, a, imm8) =>
      _mm256_mask_extractf64x2_pd(f(src), f(k), f(a), f(imm8))
    case MM_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case MM512_CMPEQ_EPI16_MASK (a, b) =>
      _mm512_cmpeq_epi16_mask(f(a), f(b))
    case MM256_MASK_SRAV_EPI32 (src, k, a, count) =>
      _mm256_mask_srav_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASK_EXPAND_PD (src, k, a) =>
      _mm512_mask_expand_pd(f(src), f(k), f(a))
    case iDef@MM512_MASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset) =>
      _mm512_mask_i64gather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM256_CMPEQ_EPI8_MASK (a, b) =>
      _mm256_cmpeq_epi8_mask(f(a), f(b))
    case MM256_MASK_MOVELDUP_PS (src, k, a) =>
      _mm256_mask_moveldup_ps(f(src), f(k), f(a))
    case MM512_MASK_CVTT_ROUNDPD_EPU32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundpd_epu32(f(src), f(k), f(a), f(sae))
    case MM512_CVTEPU8_EPI16 (a) =>
      _mm512_cvtepu8_epi16(f(a))
    case iDef@MM_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset) =>
      _mm_mask_i64scatter_epi32(iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_MAX_EPU32 (k, a, b) =>
      _mm512_maskz_max_epu32(f(k), f(a), f(b))
    case MM_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b) =>
      _mm_maskz_permutex2var_epi32(f(k), f(a), f(idx), f(b))
    case MM_MASKZ_FNMADD_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fnmadd_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM256_CVTUSEPI64_EPI32 (a) =>
      _mm256_cvtusepi64_epi32(f(a))
    case MM_MASKZ_SUBS_EPI16 (k, a, b) =>
      _mm_maskz_subs_epi16(f(k), f(a), f(b))
    case MM256_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm256_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM256_MASKZ_UNPACKLO_EPI8 (k, a, b) =>
      _mm256_maskz_unpacklo_epi8(f(k), f(a), f(b))
    case MM_MASKZ_ADD_EPI32 (k, a, b) =>
      _mm_maskz_add_epi32(f(k), f(a), f(b))
    case MM256_MASK_SRL_EPI32 (src, k, a, count) =>
      _mm256_mask_srl_epi32(f(src), f(k), f(a), f(count))
    case MM512_MASKZ_SUB_EPI8 (k, a, b) =>
      _mm512_maskz_sub_epi8(f(k), f(a), f(b))
    case MM_MASK_CVTUSEPI32_EPI16 (src, k, a) =>
      _mm_mask_cvtusepi32_epi16(f(src), f(k), f(a))
    case MM_MASKZ_CVTPS_EPU64 (k, a) =>
      _mm_maskz_cvtps_epu64(f(k), f(a))
    case MM512_MASKZ_MAX_ROUND_PD (k, a, b, sae) =>
      _mm512_maskz_max_round_pd(f(k), f(a), f(b), f(sae))

    case Reflect(MM256_MASK_MIN_EPU64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MIN_EPU64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COMPRESS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COMPRESS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MUL_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MUL_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_I64SCATTER_PD (base_addr, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_I64SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RSQRT14_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RSQRT14_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_PERMUTEX2VAR_EPI32 (a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_PERMUTEX2VAR_EPI32 (f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_TESTN_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_TESTN_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPU64_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPU64_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SET1_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SET1_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMOV (a), u, es) =>
      reflectMirrored(Reflect(MM512_KMOV (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPU16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPU16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_PERMUTEXVAR_PD (k, idx, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_PERMUTEXVAR_PD (f(k), f(idx), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADDS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADDS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BROADCASTQ_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BROADCASTQ_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTPS_EPU64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTPS_EPU64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEVAR_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEVAR_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MADD52LO_EPU64 (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MADD52LO_EPU64 (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MUL_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MUL_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKHI_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKHI_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RORV_EPI64 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RORV_EPI64 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FNMADD_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FNMADD_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLE_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLE_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_OR_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_OR_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_RCP28_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_RCP28_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPGE_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPGE_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUB_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUB_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_REDUCE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_REDUCE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_GETMANT_PS (k, a, interv, sc), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_GETMANT_PS (f(k), f(a), f(interv), f(sc)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTUSEPI32_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTUSEPI32_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK2_PERMUTEX2VAR_EPI64 (a, idx, k, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK2_PERMUTEX2VAR_EPI64 (f(a), f(idx), f(k), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TEST_EPI64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TEST_EPI64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_AND_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_AND_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPLE_EPU64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPLE_EPU64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_UNPACKLO_EPI16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_UNPACKLO_EPI16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_PS (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_PS (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2A23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2A23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_BROADCASTB_EPI8 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_BROADCASTB_EPI8 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPU16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPU16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTUSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTUSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SCALEF_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_SCALEF_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKHI_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKHI_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_RCP28_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_RCP28_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPEQ_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPEQ_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUNDSCALE_SS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_ROUNDSCALE_SS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MADD52HI_EPU64 (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MADD52HI_EPU64 (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CVTPH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTPH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_COMPRESSSTOREU_EPI64 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_COMPRESSSTOREU_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_LOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_LOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_CVTSEPI64_STOREU_EPI16 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CVTSEPI64_STOREU_EPI16 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOVEDUP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOVEDUP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MULTISHIFT_EPI64_EPI8 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MULTISHIFT_EPI64_EPI8 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTEVAR_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTEVAR_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDSCALE_ROUND_PS (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDSCALE_ROUND_PS (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMP_PS_MASK (k1, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMP_PS_MASK (f(k1), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTEPU64_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTEPU64_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTN_EPI64_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTN_EPI64_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPGE_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPGE_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPLE_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPLE_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CONFLICT_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CONFLICT_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MOV_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MOV_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_CMPLE_EPU64_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_CMPLE_EPU64_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI8 (base_addr, k, a, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTUSEPI32_STOREU_EPI8 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MAX_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAX_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCAST_F64X4 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCAST_F64X4 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI16 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI16 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_GETEXP_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_GETEXP_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_INSERTF64X2 (k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_INSERTF64X2 (f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_BROADCASTW_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_BROADCASTW_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMP_EPI16_MASK (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_CMP_EPI16_MASK (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_MUL_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_MUL_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PREFETCH_I32SCATTER_PD (base_addr, mask, vinde, scale, hint, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PREFETCH_I32SCATTER_PD (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(mask, f), iDef.cont.applyTransformer(vinde, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_UNPACKHI_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_UNPACKHI_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPU16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPU16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTPD_EPU64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTPD_EPU64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SLLV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SLLV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I32SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I32SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_STOREU_PS (mem_addr, k, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_STOREU_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DBSAD_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_DBSAD_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2INT (k1), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2INT (f(k1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROR_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROR_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDSCALE_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDSCALE_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTTPD_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTTPD_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_ANDNOT_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_ANDNOT_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_LOAD_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_LOAD_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SHUFFLE_PD (src, k, a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SHUFFLE_PD (f(src), f(k), f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_ROUND_PD (src, k, a, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_ROUND_PD (f(src), f(k), f(a), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TEST_EPI16_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TEST_EPI16_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPS_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPS_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MIN_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MIN_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRLI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRLI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2A23_PD (a, k, src), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2A23_PD (f(a), f(k), f(src)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_TESTN_EPI32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_TESTN_EPI32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTEPI32_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTEPI32_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CMPLT_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CMPLT_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBS_EPU16 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBS_EPU16 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_PERMUTEX2VAR_PS (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_PERMUTEX2VAR_PS (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SHUFFLEHI_EPI16 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SHUFFLEHI_EPI16 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_PERMUTEX2VAR_EPI32 (a, k, idx, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_PERMUTEX2VAR_EPI32 (f(a), f(k), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU64_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU64_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_BLEND_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_BLEND_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_OR_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_OR_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_MASK_LOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_LOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROR_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROR_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SET1_EPI16 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SET1_EPI16 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TEST_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_SRAI_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_SRAI_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MAX_EPU8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MAX_EPU8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I32SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I32SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SRAV_EPI32 (k, a, count), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SRAV_EPI32 (f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_EPI32 (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_EPI32 (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_EPI64 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_EPI64 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI64_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI64_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTSD_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTSD_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FNMSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FNMSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTPD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTPD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_UNPACKLO_EPI64 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_UNPACKLO_EPI64 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_RCP14_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_RCP14_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROLV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ROLV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_CVTSEPI64_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_CVTSEPI64_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_SCALEF_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_SCALEF_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_MUL_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_MUL_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_BLEND_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_BLEND_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_COMPRESS_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_COMPRESS_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPGE_EPU32_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPGE_EPU32_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_PERMUTE_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_PERMUTE_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_LZCNT_EPI32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_LZCNT_EPI32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CMPLT_EPU8_MASK (k1, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CMPLT_EPU8_MASK (f(k1), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_AND_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_AND_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MIN_EPU16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MIN_EPU16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTEPU16_EPI64 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTEPU16_EPI64 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_EXTRACTF64X2_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_EXTRACTF64X2_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CMPEQ_EPI16_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_CMPEQ_EPI16_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRAV_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRAV_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_EPI64 (src, k, vindex, base_addr, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CMPEQ_EPI8_MASK (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_CMPEQ_EPI8_MASK (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_MOVELDUP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_MOVELDUP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPD_EPU32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPD_EPU32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_MASK_I64SCATTER_EPI32 (base_addr, k, vindex, a, scale, base_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_MASK_I64SCATTER_EPI32 (iDef.cont.applyTransformer(base_addr, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(vindex, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(base_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_EPU32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_EPU32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_PERMUTEX2VAR_EPI32 (k, a, idx, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_PERMUTEX2VAR_EPI32 (f(k), f(a), f(idx), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FNMADD_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FNMADD_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CVTUSEPI64_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM256_CVTUSEPI64_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_SUBS_EPI16 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_SUBS_EPI16 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASKZ_UNPACKLO_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM256_MASKZ_UNPACKLO_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_ADD_EPI32 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_ADD_EPI32 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_MASK_SRL_EPI32 (src, k, a, count), u, es) =>
      reflectMirrored(Reflect(MM256_MASK_SRL_EPI32 (f(src), f(k), f(a), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_SUB_EPI8 (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_SUB_EPI8 (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_CVTUSEPI32_EPI16 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASK_CVTUSEPI32_EPI16 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_CVTPS_EPU64 (k, a), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_CVTPS_EPU64 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_MAX_ROUND_PD (k, a, b, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_MAX_ROUND_PD (f(k), f(a), f(b), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX512010 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_MASK_MIN_EPU64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_min_epu64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_COMPRESS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_compress_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_TESTN_EPI8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_testn_epi8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_DIV_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MUL_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mul_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_I64SCATTER_PD(base_addr, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_i64scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_RSQRT14_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rsqrt14_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM256_PERMUTEX2VAR_EPI32(a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_permutex2var_epi32(${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM256_MASK_TESTN_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_testn_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTSS_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_i64(${quote(a)})")
    case iDef@MM_CVTSEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsepi32_epi8(${quote(a)})")
    case iDef@MM256_CVTEPU64_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepu64_pd(${quote(a)})")
    case iDef@MM256_MASK_SET1_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_set1_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_KMOV(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmov(${quote(a)})")
    case iDef@MM256_CMP_EPU16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epu16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_PERMUTEXVAR_PD(k, idx, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_permutexvar_pd(${quote(k)}, ${quote(idx)}, ${quote(a)})")
    case iDef@MM_MASKZ_ADDS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_adds_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BROADCASTQ_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_broadcastq_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTPS_EPU64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtps_epu64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PERMUTEVAR_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutevar_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_DIV_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MADD52LO_EPU64(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_madd52lo_epu64(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_SET1_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_set1_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_MUL_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_mul_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_UNPACKHI_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpackhi_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_RORV_EPI64(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rorv_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_FNMADD_SD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fnmadd_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_MAX_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CMPLE_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmple_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_OR_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_or_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_RCP28_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_rcp28_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_CMPGE_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmpge_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUB_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sub_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_REDUCE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_reduce_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_GETMANT_PS(k, a, interv, sc) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_getmant_ps(${quote(k)}, ${quote(a)}, ${quote(interv)}, ${quote(sc)})")
    case iDef@MM_CVTUSEPI32_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtusepi32_epi16(${quote(a)})")
    case iDef@MM256_MASK2_PERMUTEX2VAR_EPI64(a, idx, k, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask2_permutex2var_epi64(${quote(a)}, ${quote(idx)}, ${quote(k)}, ${quote(b)})")
    case iDef@MM512_MASK_TEST_EPI64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_test_epi64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_AND_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_and_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPLE_EPU64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmple_epu64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_UNPACKLO_EPI16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_unpacklo_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SHUFFLE_PS(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_EXP2A23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2a23_ps(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_BROADCASTB_EPI8(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_broadcastb_epi8(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CMPLT_EPU16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epu16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTUSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtusepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_expandloadu_pd(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_SCALEF_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_scalef_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKHI_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpackhi_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_RCP28_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_rcp28_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPEQ_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpeq_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ROUNDSCALE_SS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_roundscale_ss(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MADD52HI_EPU64(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_madd52hi_epu64(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASK_CVTPH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cvtph_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_COMPRESSSTOREU_EPI64(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_compressstoreu_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM_MASK_LOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_loadu_ps(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM256_MASK_CVTSEPI64_STOREU_EPI16(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_cvtsepi64_storeu_epi16((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_MASK_MOVEDUP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_movedup_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_MULTISHIFT_EPI64_EPI8(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_multishift_epi64_epi8(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PERMUTEVAR_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permutevar_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ROUNDSCALE_ROUND_PS(src, k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundscale_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM256_MASK_CMP_PS_MASK(k1, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmp_ps_mask(${quote(k1)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_CVTEPU64_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtepu64_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_TESTN_EPI64_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testn_epi64_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CMPGE_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpge_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CMPLE_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmple_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CONFLICT_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_conflict_epi32(${quote(a)})")
    case iDef@MM512_MASK_MOV_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mov_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_CMPLE_EPU64_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_cmple_epu64_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_CVTUSEPI32_STOREU_EPI8(base_addr, k, a, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_cvtusepi32_storeu_epi8((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM512_MAX_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_max_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_UNPACKHI_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_DIV_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_BROADCAST_F64X4(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcast_f64x4(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_PERMUTEX2VAR_EPI16(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex2var_epi16(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_GETEXP_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_getexp_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM256_MASKZ_INSERTF64X2(k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_insertf64x2(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_BROADCASTW_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_broadcastw_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_ADD_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMP_EPI16_MASK(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmp_epi16_mask(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_MUL_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_mul_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_PREFETCH_I32SCATTER_PD(base_addr, mask, vinde, scale, hint, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_prefetch_i32scatter_pd((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(mask)}, ${quote(vinde)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM256_MASK_SQRT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_sqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_UNPACKHI_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_unpackhi_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_CMPEQ_EPU16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epu16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTTPD_EPU64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttpd_epu64(${quote(a)})")
    case iDef@MM256_MASKZ_SLLV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_sllv_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_FIXUPIMM_PD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_I32SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i32scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM256_MASK_STOREU_PS(mem_addr, k, a, mem_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm256_mask_storeu_ps((void*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(k)}, ${quote(a)});")
    case iDef@MM256_DBSAD_EPU8(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_dbsad_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK2INT(k1) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2int(${quote(k1)})")
    case iDef@MM512_ROR_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_ror_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_ROUNDSCALE_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundscale_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_CVTTPD_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvttpd_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_ANDNOT_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_andnot_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_LOAD_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_load_ps(${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_SHUFFLE_PD(src, k, a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_shuffle_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM512_MASK_REDUCE_ROUND_PD(src, k, a, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_TEST_EPI16_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_test_epi16_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTPS_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtps_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASKZ_MIN_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_min_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_SRLI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srli_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXP2A23_PD(a, k, src) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2a23_pd(${quote(a)}, ${quote(k)}, ${quote(src)})")
    case iDef@MM_MASK_TESTN_EPI32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_testn_epi32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTEPI32_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtepi32_epi8(${quote(a)})")
    case iDef@MM512_MASK_CMPLT_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cmplt_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUBS_EPU16(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subs_epu16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_PERMUTEX2VAR_PS(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_permutex2var_ps(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASK_SHUFFLEHI_EPI16(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_shufflehi_epi16(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASK_PERMUTEX2VAR_EPI32(a, k, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_permutex2var_epi32(${quote(a)}, ${quote(k)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM512_MASKZ_CVTEPU64_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu64_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_BLEND_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_blend_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_OR_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_or_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_CVTEPU32_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32_ps(${quote(a)})")
    case iDef@MM256_MASK_LOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_loadu_pd(${quote(src)}, ${quote(k)}, (void const*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM512_MASK_ROR_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_ror_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_SET1_EPI16(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_set1_epi16(${quote(k)}, ${quote(a)})")
    case iDef@MM_TEST_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_SRAI_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_srai_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_MAX_EPU8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_max_epu8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_FIXUPIMM_PS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_I32SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i32scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASKZ_SRAV_EPI32(k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_srav_epi32(${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_CVT_ROUNDPD_EPI32(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM_MASK_I64SCATTER_EPI64(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i64scatter_epi64((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM_MASK_CVTUSEPI64_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi64_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTSD_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtsd_i64(${quote(a)})")
    case iDef@MM_MASK3_FNMSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_CVTPD_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtpd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_UNPACKLO_EPI64(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_unpacklo_epi64(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_CVTUSEPI64_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi64_epi16(${quote(a)})")
    case iDef@MM256_MASK_RCP14_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_rcp14_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ROLV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rolv_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_CVTSEPI64_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_cvtsepi64_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_SCALEF_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_scalef_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_MUL_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_mul_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_BLEND_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_blend_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASKZ_COMPRESS_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_compress_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPGE_EPU32_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmpge_epu32_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_PERMUTE_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_permute_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM256_MASKZ_LZCNT_EPI32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_lzcnt_epi32(${quote(k)}, ${quote(a)})")
    case iDef@MM_MASK_CMPLT_EPU8_MASK(k1, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cmplt_epu8_mask(${quote(k1)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_AND_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_and_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_FMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_MIN_EPU16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_min_epu16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTEPU16_EPI64(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtepu16_epi64(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_EXPAND_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_MASK_EXTRACTF64X2_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_extractf64x2_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM_MASK_FMADDSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_CMPEQ_EPI16_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cmpeq_epi16_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SRAV_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srav_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASK_EXPAND_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_I64GATHER_EPI64(src, k, vindex, base_addr, scale, base_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_epi64(${quote(src)}, ${quote(k)}, ${quote(vindex)}, (void const*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(scale)})")
    case iDef@MM256_CMPEQ_EPI8_MASK(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cmpeq_epi8_mask(${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_MOVELDUP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_moveldup_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_CVTT_ROUNDPD_EPU32(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundpd_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_CVTEPU8_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu8_epi16(${quote(a)})")
    case iDef@MM_MASK_I64SCATTER_EPI32(base_addr, k, vindex, a, scale, base_addrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_mask_i64scatter_epi32((void*) (${quote(base_addr)  + (if(base_addrOffset == Const(0)) "" else " + " + quote(base_addrOffset))}), ${quote(k)}, ${quote(vindex)}, ${quote(a)}, ${quote(scale)});")
    case iDef@MM512_MASKZ_MAX_EPU32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_epu32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_PERMUTEX2VAR_EPI32(k, a, idx, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_permutex2var_epi32(${quote(k)}, ${quote(a)}, ${quote(idx)}, ${quote(b)})")
    case iDef@MM_MASKZ_FNMADD_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fnmadd_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM256_CVTUSEPI64_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cvtusepi64_epi32(${quote(a)})")
    case iDef@MM_MASKZ_SUBS_EPI16(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_subs_epi16(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_FMSUBADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_MASKZ_UNPACKLO_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_maskz_unpacklo_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_ADD_EPI32(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_add_epi32(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_MASK_SRL_EPI32(src, k, a, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_mask_srl_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(count)})")
    case iDef@MM512_MASKZ_SUB_EPI8(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_sub_epi8(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASK_CVTUSEPI32_EPI16(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_cvtusepi32_epi16(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_MASKZ_CVTPS_EPU64(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_cvtps_epu64(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_MAX_ROUND_PD(k, a, b, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_max_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(sae)})")
    case _ => super.emitNode(sym, rhs)
  }
}
