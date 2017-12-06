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

    
trait SSE41 extends IntrinsicsBase {
  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return 1 if both the "ZF" and "CF" values
   * are zero, otherwise return 0.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTNZC_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Convert packed 32-bit integers from "a" and "b" to packed 16-bit integers
   * using unsigned saturation, and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_PACKUS_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Extract a 32-bit integer from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_EXTRACT_EPI32(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m128d
   */
  case class MM_FLOOR_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a"
   * using the "rounding" parameter, and store the results as packed
   * double-precision floating-point elements in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_ROUND_PD(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "b" up to
   * an integer value, store the result as a single-precision floating-point
   * element in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_CEIL_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a"
   * using the "rounding" parameter, and store the results as packed
   * single-precision floating-point elements in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_ROUND_PS(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the lower 8-bit integer from "i" into "dst" at
   * the location specified by "imm8".
   * a: __m128i, i: int, imm8: const int
   */
  case class MM_INSERT_EPI8(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using control mask "imm8", and store the results in "dst".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_BLEND_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Extract a 64-bit integer from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_EXTRACT_EPI64(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed 64-bit integers in "a" and "b" for equality, and store the
   * results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_CMPEQ_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Compare)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "b" using
   * the "rounding" parameter, store the result as a double-precision
   * floating-point element in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m128
   */
  case class MM_FLOOR_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using control mask "imm8", and store the results in "dst".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_BLEND_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU16_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed single-precision (32-bit) floating-point elements from "a" and
   * "b" using "mask", and store the results in "dst".
   * a: __m128, b: __m128, mask: __m128
   */
  case class MM_BLENDV_PS(a: Exp[__m128], b: Exp[__m128], mask: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m128d
   */
  case class MM_CEIL_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Extract a single-precision (32-bit) floating-point element from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m128, imm8: const int
   */
  case class MM_EXTRACT_PS(a: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 32-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI32_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m128
   */
  case class MM_CEIL_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 16-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 32-bit integer "i" into "dst" at the
   * location specified by "imm8".
   * a: __m128i, i: int, imm8: const int
   */
  case class MM_INSERT_EPI32(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Copy "a" to "tmp", then insert a single-precision (32-bit) floating-point
   * element from "b" into "tmp" using the control in "imm8". Store "tmp" to "dst"
   * using the mask in "imm8" (elements are zeroed out when the corresponding bit
   * is set).
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_INSERT_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the bitwise NOT of "a" and then AND with a 128-bit vector containing
   * all 1's, and return 1 if the result is zero, otherwise return 0.
   * a: __m128i
   */
  case class MM_TEST_ALL_ONES(a: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "mask", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0.
   * Compute the bitwise NOT of "a" and then AND with "mask", and set "CF" to 1 if
   * the result is zero, otherwise set "CF" to 0. Return 1 if both the "ZF" and
   * "CF" values are zero, otherwise return 0.
   * a: __m128i, mask: __m128i
   */
  case class MM_TEST_MIX_ONES_ZEROS(a: Exp[__m128i], mask: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Extract an 8-bit integer from "a", selected with "imm8", and store the result
   * in the lower element of "dst".
   * a: __m128i, imm8: const int
   */
  case class MM_EXTRACT_EPI8(a: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "b" down
   * to an integer value, store the result as a single-precision floating-point
   * element in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * a: __m128, b: __m128
   */
  case class MM_FLOOR_SS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "b" down
   * to an integer value, store the result as a double-precision floating-point
   * element in the lower element of "dst", and copy the upper element from "a" to
   * the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_FLOOR_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 64-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI16_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Horizontally compute the minimum amongst the packed unsigned 16-bit integers
   * in "a", store the minimum and index in "dst", and zero the remaining bits in
   * "dst".
   * a: __m128i
   */
  case class MM_MINPOS_EPU16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower double-precision (64-bit) floating-point element in "b" up to
   * an integer value, store the result as a double-precision floating-point
   * element in the lower element of "dst", and copy the upper element from "a" to
   * the upper element of "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_CEIL_SD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed 16-bit integers from "a" and "b" using control mask "imm8", and
   * store the results in "dst".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_BLEND_EPI16(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Multiply the low 32-bit integers from each packed 64-bit element in "a" and
   * "b", and store the signed 64-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MUL_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in "a" to packed 16-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI8_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 32-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU8_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Conditionally multiply the packed double-precision (64-bit) floating-point
   * elements in "a" and "b" using the high 4 bits in "imm8", sum the four
   * products, and conditionally store the sum in "dst" using the low 4 bits of
   * "imm8".
   * a: __m128d, b: __m128d, imm8: const int
   */
  case class MM_DP_PD(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 32-bit integers in "a" to packed 64-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU32_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed unsigned 32-bit integers in "a" and "b", and store packed
   * maximum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed unsigned 16-bit integers in "a" and "b", and store packed
   * minimum values in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed maximum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MAX_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the sum of absolute differences (SADs) of quadruplets of unsigned
   * 8-bit integers in "a" compared to those in "b", and store the 16-bit results
   * in "dst".
   * 	Eight SADs are performed using one quadruplet from "b" and eight
   * quadruplets from "a". One quadruplet is selected from "b" starting at on the
   * offset specified in "imm8". Eight quadruplets are formed from sequential 8-bit
   * integers selected from "a" starting at the offset specified in "imm8".
   * a: __m128i, b: __m128i, imm8: const int
   */
  case class MM_MPSADBW_EPU8(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic, IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in "a" to packed 16-bit integers,
   * and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU8_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 8-bit integers in the low 8 bytes of "a" to packed 64-bit
   * integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Conditionally multiply the packed single-precision (32-bit) floating-point
   * elements in "a" and "b" using the high 4 bits in "imm8", sum the four
   * products, and conditionally store the sum in "dst" using the low 4 bits of
   * "imm8".
   * a: __m128, b: __m128, imm8: const int
   */
  case class MM_DP_PS(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return the "ZF" value.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTZ_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed 8-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Round the lower single-precision (32-bit) floating-point element in "b" using
   * the "rounding" parameter, store the result as a single-precision
   * floating-point element in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "b", and set "ZF" to 1 if the result is zero, otherwise set "ZF" to 0. Compute
   * the bitwise NOT of "a" and then AND with "b", and set "CF" to 1 if the result
   * is zero, otherwise set "CF" to 0. Return the "CF" value.
   * a: __m128i, b: __m128i
   */
  case class MM_TESTC_SI128(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compute the bitwise AND of 128 bits (representing integer data) in "a" and
   * "mask", and return 1 if the result is zero, otherwise return 0.
   * a: __m128i, mask: __m128i
   */
  case class MM_TEST_ALL_ZEROS(a: Exp[__m128i], mask: Exp[__m128i]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Logical)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed double-precision (64-bit) floating-point elements from "a" and
   * "b" using "mask", and store the results in "dst".
   * a: __m128d, b: __m128d, mask: __m128d
   */
  case class MM_BLENDV_PD(a: Exp[__m128d], b: Exp[__m128d], mask: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Load 128-bits of integer data from memory into "dst" using a non-temporal
   * memory hint.
   * 	"mem_addr" must be aligned on a 16-byte boundary or a
   * general-protection exception may be generated.
   * mem_addr: const __m128i*, mem_addrOffset: int
   */
  case class MM_STREAM_LOAD_SI128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Zero extend packed unsigned 8-bit integers in the low 8 byte sof "a" to packed
   * 64-bit integers, and store the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPU8_EPI64(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Copy "a" to "dst", and insert the 64-bit integer "i" into "dst" at the
   * location specified by "imm8".
   * a: __m128i, i: __int64, imm8: const int
   */
  case class MM_INSERT_EPI64(a: Exp[__m128i], i: Exp[Long], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Sign extend packed 16-bit integers in "a" to packed 32-bit integers, and store
   * the results in "dst".
   * a: __m128i
   */
  case class MM_CVTEPI16_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Multiply the packed 32-bit integers in "a" and "b", producing intermediate
   * 64-bit integers, and store the low 32 bits of the intermediate integers in
   * "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULLO_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Blend packed 8-bit integers from "a" and "b" using "mask", and store the
   * results in "dst".
   * a: __m128i, b: __m128i, mask: __m128i
   */
  case class MM_BLENDV_EPI8(a: Exp[__m128i], b: Exp[__m128i], mask: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  /**
   * Compare packed 32-bit integers in "a" and "b", and store packed minimum values
   * in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MIN_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "smmintrin.h"
  }
      

  def _mm_testnzc_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTNZC_SI128(a, b)
  }
            
  def _mm_packus_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_PACKUS_EPI32(a, b)
  }
            
  def _mm_extract_epi32(a: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_EXTRACT_EPI32(a, imm8)
  }
            
  def _mm_floor_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_FLOOR_PD(a)
  }
            
  def _mm_round_pd(a: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_ROUND_PD(a, rounding)
  }
            
  def _mm_ceil_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_CEIL_SS(a, b)
  }
            
  def _mm_max_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPU16(a, b)
  }
            
  def _mm_round_ps(a: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_ROUND_PS(a, rounding)
  }
            
  def _mm_insert_epi8(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]): Exp[__m128i] = {
    MM_INSERT_EPI8(a, i, imm8)
  }
            
  def _mm_cvtepi8_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI8_EPI32(a)
  }
            
  def _mm_blend_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_BLEND_PD(a, b, imm8)
  }
            
  def _mm_extract_epi64(a: Exp[__m128i], imm8: Exp[Int]): Exp[Long] = {
    MM_EXTRACT_EPI64(a, imm8)
  }
            
  def _mm_cmpeq_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_CMPEQ_EPI64(a, b)
  }
            
  def _mm_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_ROUND_SD(a, b, rounding)
  }
            
  def _mm_floor_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_FLOOR_PS(a)
  }
            
  def _mm_blend_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_BLEND_PS(a, b, imm8)
  }
            
  def _mm_cvtepu16_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU16_EPI32(a)
  }
            
  def _mm_max_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPI8(a, b)
  }
            
  def _mm_min_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPU32(a, b)
  }
            
  def _mm_blendv_ps(a: Exp[__m128], b: Exp[__m128], mask: Exp[__m128]): Exp[__m128] = {
    MM_BLENDV_PS(a, b, mask)
  }
            
  def _mm_ceil_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_CEIL_PD(a)
  }
            
  def _mm_extract_ps(a: Exp[__m128], imm8: Exp[Int]): Exp[Int] = {
    MM_EXTRACT_PS(a, imm8)
  }
            
  def _mm_cvtepi32_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI32_EPI64(a)
  }
            
  def _mm_ceil_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CEIL_PS(a)
  }
            
  def _mm_cvtepu16_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU16_EPI64(a)
  }
            
  def _mm_insert_epi32(a: Exp[__m128i], i: Exp[Int], imm8: Exp[Int]): Exp[__m128i] = {
    MM_INSERT_EPI32(a, i, imm8)
  }
            
  def _mm_insert_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_INSERT_PS(a, b, imm8)
  }
            
  def _mm_test_all_ones(a: Exp[__m128i]): Exp[Int] = {
    MM_TEST_ALL_ONES(a)
  }
            
  def _mm_test_mix_ones_zeros(a: Exp[__m128i], mask: Exp[__m128i]): Exp[Int] = {
    MM_TEST_MIX_ONES_ZEROS(a, mask)
  }
            
  def _mm_extract_epi8(a: Exp[__m128i], imm8: Exp[Int]): Exp[Int] = {
    MM_EXTRACT_EPI8(a, imm8)
  }
            
  def _mm_floor_ss(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_FLOOR_SS(a, b)
  }
            
  def _mm_floor_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_FLOOR_SD(a, b)
  }
            
  def _mm_cvtepi16_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI16_EPI64(a)
  }
            
  def _mm_minpos_epu16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_MINPOS_EPU16(a)
  }
            
  def _mm_ceil_sd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_CEIL_SD(a, b)
  }
            
  def _mm_blend_epi16(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_BLEND_EPI16(a, b, imm8)
  }
            
  def _mm_mul_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MUL_EPI32(a, b)
  }
            
  def _mm_cvtepi8_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI8_EPI16(a)
  }
            
  def _mm_cvtepu8_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU8_EPI32(a)
  }
            
  def _mm_dp_pd(a: Exp[__m128d], b: Exp[__m128d], imm8: Exp[Int]): Exp[__m128d] = {
    MM_DP_PD(a, b, imm8)
  }
            
  def _mm_cvtepu32_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU32_EPI64(a)
  }
            
  def _mm_max_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPU32(a, b)
  }
            
  def _mm_min_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPU16(a, b)
  }
            
  def _mm_max_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MAX_EPI32(a, b)
  }
            
  def _mm_mpsadbw_epu8(a: Exp[__m128i], b: Exp[__m128i], imm8: Exp[Int]): Exp[__m128i] = {
    MM_MPSADBW_EPU8(a, b, imm8)
  }
            
  def _mm_cvtepu8_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU8_EPI16(a)
  }
            
  def _mm_cvtepi8_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI8_EPI64(a)
  }
            
  def _mm_dp_ps(a: Exp[__m128], b: Exp[__m128], imm8: Exp[Int]): Exp[__m128] = {
    MM_DP_PS(a, b, imm8)
  }
            
  def _mm_testz_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTZ_SI128(a, b)
  }
            
  def _mm_min_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPI8(a, b)
  }
            
  def _mm_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_ROUND_SS(a, b, rounding)
  }
            
  def _mm_testc_si128(a: Exp[__m128i], b: Exp[__m128i]): Exp[Int] = {
    MM_TESTC_SI128(a, b)
  }
            
  def _mm_test_all_zeros(a: Exp[__m128i], mask: Exp[__m128i]): Exp[Int] = {
    MM_TEST_ALL_ZEROS(a, mask)
  }
            
  def _mm_blendv_pd(a: Exp[__m128d], b: Exp[__m128d], mask: Exp[__m128d]): Exp[__m128d] = {
    MM_BLENDV_PD(a, b, mask)
  }
            
  def _mm_stream_load_si128[A[_], U:Integral](mem_addr: Exp[A[__m128i]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.read(mem_addr)(MM_STREAM_LOAD_SI128(mem_addr, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_cvtepu8_epi64(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPU8_EPI64(a)
  }
            
  def _mm_insert_epi64(a: Exp[__m128i], i: Exp[Long], imm8: Exp[Int]): Exp[__m128i] = {
    MM_INSERT_EPI64(a, i, imm8)
  }
            
  def _mm_cvtepi16_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_CVTEPI16_EPI32(a)
  }
            
  def _mm_mullo_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULLO_EPI32(a, b)
  }
            
  def _mm_blendv_epi8(a: Exp[__m128i], b: Exp[__m128i], mask: Exp[__m128i]): Exp[__m128i] = {
    MM_BLENDV_EPI8(a, b, mask)
  }
            
  def _mm_min_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MIN_EPI32(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_TESTNZC_SI128 (a, b) =>
      _mm_testnzc_si128(f(a), f(b))
    case MM_PACKUS_EPI32 (a, b) =>
      _mm_packus_epi32(f(a), f(b))
    case MM_EXTRACT_EPI32 (a, imm8) =>
      _mm_extract_epi32(f(a), f(imm8))
    case MM_FLOOR_PD (a) =>
      _mm_floor_pd(f(a))
    case MM_ROUND_PD (a, rounding) =>
      _mm_round_pd(f(a), f(rounding))
    case MM_CEIL_SS (a, b) =>
      _mm_ceil_ss(f(a), f(b))
    case MM_MAX_EPU16 (a, b) =>
      _mm_max_epu16(f(a), f(b))
    case MM_ROUND_PS (a, rounding) =>
      _mm_round_ps(f(a), f(rounding))
    case MM_INSERT_EPI8 (a, i, imm8) =>
      _mm_insert_epi8(f(a), f(i), f(imm8))
    case MM_CVTEPI8_EPI32 (a) =>
      _mm_cvtepi8_epi32(f(a))
    case MM_BLEND_PD (a, b, imm8) =>
      _mm_blend_pd(f(a), f(b), f(imm8))
    case MM_EXTRACT_EPI64 (a, imm8) =>
      _mm_extract_epi64(f(a), f(imm8))
    case MM_CMPEQ_EPI64 (a, b) =>
      _mm_cmpeq_epi64(f(a), f(b))
    case MM_ROUND_SD (a, b, rounding) =>
      _mm_round_sd(f(a), f(b), f(rounding))
    case MM_FLOOR_PS (a) =>
      _mm_floor_ps(f(a))
    case MM_BLEND_PS (a, b, imm8) =>
      _mm_blend_ps(f(a), f(b), f(imm8))
    case MM_CVTEPU16_EPI32 (a) =>
      _mm_cvtepu16_epi32(f(a))
    case MM_MAX_EPI8 (a, b) =>
      _mm_max_epi8(f(a), f(b))
    case MM_MIN_EPU32 (a, b) =>
      _mm_min_epu32(f(a), f(b))
    case MM_BLENDV_PS (a, b, mask) =>
      _mm_blendv_ps(f(a), f(b), f(mask))
    case MM_CEIL_PD (a) =>
      _mm_ceil_pd(f(a))
    case MM_EXTRACT_PS (a, imm8) =>
      _mm_extract_ps(f(a), f(imm8))
    case MM_CVTEPI32_EPI64 (a) =>
      _mm_cvtepi32_epi64(f(a))
    case MM_CEIL_PS (a) =>
      _mm_ceil_ps(f(a))
    case MM_CVTEPU16_EPI64 (a) =>
      _mm_cvtepu16_epi64(f(a))
    case MM_INSERT_EPI32 (a, i, imm8) =>
      _mm_insert_epi32(f(a), f(i), f(imm8))
    case MM_INSERT_PS (a, b, imm8) =>
      _mm_insert_ps(f(a), f(b), f(imm8))
    case MM_TEST_ALL_ONES (a) =>
      _mm_test_all_ones(f(a))
    case MM_TEST_MIX_ONES_ZEROS (a, mask) =>
      _mm_test_mix_ones_zeros(f(a), f(mask))
    case MM_EXTRACT_EPI8 (a, imm8) =>
      _mm_extract_epi8(f(a), f(imm8))
    case MM_FLOOR_SS (a, b) =>
      _mm_floor_ss(f(a), f(b))
    case MM_FLOOR_SD (a, b) =>
      _mm_floor_sd(f(a), f(b))
    case MM_CVTEPI16_EPI64 (a) =>
      _mm_cvtepi16_epi64(f(a))
    case MM_MINPOS_EPU16 (a) =>
      _mm_minpos_epu16(f(a))
    case MM_CEIL_SD (a, b) =>
      _mm_ceil_sd(f(a), f(b))
    case MM_BLEND_EPI16 (a, b, imm8) =>
      _mm_blend_epi16(f(a), f(b), f(imm8))
    case MM_MUL_EPI32 (a, b) =>
      _mm_mul_epi32(f(a), f(b))
    case MM_CVTEPI8_EPI16 (a) =>
      _mm_cvtepi8_epi16(f(a))
    case MM_CVTEPU8_EPI32 (a) =>
      _mm_cvtepu8_epi32(f(a))
    case MM_DP_PD (a, b, imm8) =>
      _mm_dp_pd(f(a), f(b), f(imm8))
    case MM_CVTEPU32_EPI64 (a) =>
      _mm_cvtepu32_epi64(f(a))
    case MM_MAX_EPU32 (a, b) =>
      _mm_max_epu32(f(a), f(b))
    case MM_MIN_EPU16 (a, b) =>
      _mm_min_epu16(f(a), f(b))
    case MM_MAX_EPI32 (a, b) =>
      _mm_max_epi32(f(a), f(b))
    case MM_MPSADBW_EPU8 (a, b, imm8) =>
      _mm_mpsadbw_epu8(f(a), f(b), f(imm8))
    case MM_CVTEPU8_EPI16 (a) =>
      _mm_cvtepu8_epi16(f(a))
    case MM_CVTEPI8_EPI64 (a) =>
      _mm_cvtepi8_epi64(f(a))
    case MM_DP_PS (a, b, imm8) =>
      _mm_dp_ps(f(a), f(b), f(imm8))
    case MM_TESTZ_SI128 (a, b) =>
      _mm_testz_si128(f(a), f(b))
    case MM_MIN_EPI8 (a, b) =>
      _mm_min_epi8(f(a), f(b))
    case MM_ROUND_SS (a, b, rounding) =>
      _mm_round_ss(f(a), f(b), f(rounding))
    case MM_TESTC_SI128 (a, b) =>
      _mm_testc_si128(f(a), f(b))
    case MM_TEST_ALL_ZEROS (a, mask) =>
      _mm_test_all_zeros(f(a), f(mask))
    case MM_BLENDV_PD (a, b, mask) =>
      _mm_blendv_pd(f(a), f(b), f(mask))
    case iDef@MM_STREAM_LOAD_SI128 (mem_addr, mem_addrOffset) =>
      _mm_stream_load_si128(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_CVTEPU8_EPI64 (a) =>
      _mm_cvtepu8_epi64(f(a))
    case MM_INSERT_EPI64 (a, i, imm8) =>
      _mm_insert_epi64(f(a), f(i), f(imm8))
    case MM_CVTEPI16_EPI32 (a) =>
      _mm_cvtepi16_epi32(f(a))
    case MM_MULLO_EPI32 (a, b) =>
      _mm_mullo_epi32(f(a), f(b))
    case MM_BLENDV_EPI8 (a, b, mask) =>
      _mm_blendv_epi8(f(a), f(b), f(mask))
    case MM_MIN_EPI32 (a, b) =>
      _mm_min_epi32(f(a), f(b))

    case Reflect(MM_TESTNZC_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTNZC_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_PACKUS_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_PACKUS_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUND_PD (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUND_PD (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CEIL_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CEIL_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUND_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUND_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_EPI8 (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_EPI8 (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLEND_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BLEND_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CMPEQ_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CMPEQ_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLEND_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BLEND_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLENDV_PS (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM_BLENDV_PS (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CEIL_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CEIL_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_EPI32 (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_EPI32 (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_ALL_ONES (a), u, es) =>
      reflectMirrored(Reflect(MM_TEST_ALL_ONES (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_MIX_ONES_ZEROS (a, mask), u, es) =>
      reflectMirrored(Reflect(MM_TEST_MIX_ONES_ZEROS (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXTRACT_EPI8 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM_EXTRACT_EPI8 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FLOOR_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_FLOOR_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FLOOR_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_FLOOR_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI16_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI16_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MINPOS_EPU16 (a), u, es) =>
      reflectMirrored(Reflect(MM_MINPOS_EPU16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CEIL_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CEIL_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLEND_EPI16 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_BLEND_EPI16 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MUL_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MUL_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU8_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU8_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DP_PD (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_DP_PD (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU32_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU32_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MAX_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MAX_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MPSADBW_EPU8 (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MPSADBW_EPU8 (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU8_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU8_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DP_PS (a, b, imm8), u, es) =>
      reflectMirrored(Reflect(MM_DP_PS (f(a), f(b), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTZ_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTZ_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TESTC_SI128 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_TESTC_SI128 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TEST_ALL_ZEROS (a, mask), u, es) =>
      reflectMirrored(Reflect(MM_TEST_ALL_ZEROS (f(a), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLENDV_PD (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM_BLENDV_PD (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_STREAM_LOAD_SI128 (mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_STREAM_LOAD_SI128 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPU8_EPI64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPU8_EPI64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INSERT_EPI64 (a, i, imm8), u, es) =>
      reflectMirrored(Reflect(MM_INSERT_EPI64 (f(a), f(i), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTEPI16_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTEPI16_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULLO_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULLO_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_BLENDV_EPI8 (a, b, mask), u, es) =>
      reflectMirrored(Reflect(MM_BLENDV_EPI8 (f(a), f(b), f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MIN_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MIN_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSE41 extends CGenIntrinsics {

  val IR: SSE41
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_TESTNZC_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testnzc_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_PACKUS_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_packus_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_EXTRACT_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_floor_pd(${quote(a)})")
    case iDef@MM_ROUND_PD(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_round_pd(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CEIL_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ceil_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ROUND_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_round_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_INSERT_EPI8(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_epi8(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_CVTEPI8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi8_epi32(${quote(a)})")
    case iDef@MM_BLEND_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blend_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_EXTRACT_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CMPEQ_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cmpeq_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_floor_ps(${quote(a)})")
    case iDef@MM_BLEND_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blend_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTEPU16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu16_epi32(${quote(a)})")
    case iDef@MM_MAX_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_BLENDV_PS(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blendv_ps(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ceil_pd(${quote(a)})")
    case iDef@MM_EXTRACT_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_CVTEPI32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi32_epi64(${quote(a)})")
    case iDef@MM_CEIL_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ceil_ps(${quote(a)})")
    case iDef@MM_CVTEPU16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu16_epi64(${quote(a)})")
    case iDef@MM_INSERT_EPI32(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_epi32(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_INSERT_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_TEST_ALL_ONES(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_all_ones(${quote(a)})")
    case iDef@MM_TEST_MIX_ONES_ZEROS(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_mix_ones_zeros(${quote(a)}, ${quote(mask)})")
    case iDef@MM_EXTRACT_EPI8(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_extract_epi8(${quote(a)}, ${quote(imm8)})")
    case iDef@MM_FLOOR_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_floor_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_FLOOR_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_floor_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTEPI16_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi16_epi64(${quote(a)})")
    case iDef@MM_MINPOS_EPU16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_minpos_epu16(${quote(a)})")
    case iDef@MM_CEIL_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_ceil_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_BLEND_EPI16(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blend_epi16(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_MUL_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mul_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTEPI8_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi8_epi16(${quote(a)})")
    case iDef@MM_CVTEPU8_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu8_epi32(${quote(a)})")
    case iDef@MM_DP_PD(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_dp_pd(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTEPU32_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu32_epi64(${quote(a)})")
    case iDef@MM_MAX_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MAX_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_max_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MPSADBW_EPU8(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mpsadbw_epu8(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_CVTEPU8_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu8_epi16(${quote(a)})")
    case iDef@MM_CVTEPI8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi8_epi64(${quote(a)})")
    case iDef@MM_DP_PS(a, b, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_dp_ps(${quote(a)}, ${quote(b)}, ${quote(imm8)})")
    case iDef@MM_TESTZ_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testz_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_MIN_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_TESTC_SI128(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_testc_si128(${quote(a)}, ${quote(b)})")
    case iDef@MM_TEST_ALL_ZEROS(a, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_test_all_zeros(${quote(a)}, ${quote(mask)})")
    case iDef@MM_BLENDV_PD(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blendv_pd(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM_STREAM_LOAD_SI128(mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_stream_load_si128((const __m128i*) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}))")
    case iDef@MM_CVTEPU8_EPI64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepu8_epi64(${quote(a)})")
    case iDef@MM_INSERT_EPI64(a, i, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_insert_epi64(${quote(a)}, ${quote(i)}, ${quote(imm8)})")
    case iDef@MM_CVTEPI16_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtepi16_epi32(${quote(a)})")
    case iDef@MM_MULLO_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mullo_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_BLENDV_EPI8(a, b, mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_blendv_epi8(${quote(a)}, ${quote(b)}, ${quote(mask)})")
    case iDef@MM_MIN_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_min_epi32(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
