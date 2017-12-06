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

    
trait SVML02 extends IntrinsicsBase {
  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_TAN_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_ERFINV_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_LOG_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_ASINH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m512
   */
  case class MM512_FLOOR_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_ERFC_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_TAN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPU64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_TAN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_DIV_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m128, b: __m128
   */
  case class MM_ATAN2_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cube root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CBRT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_COS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SIND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512d
   */
  case class MM512_SVML_ROUND_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_LOG10_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ACOSH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", store the
   * truncated results in "dst", and store the remainders as packed 32-bit integers
   * into memory at "mem_addr".
   * mem_addr: __m128i *, a: __m128i, b: __m128i, mem_addrOffset: int
   */
  case class MM_IDIVREM_EPI32[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], b: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_INVSQRT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_SIN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_LOG10_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ERF_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_ERF_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ERFCINV_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundpd"/"vroundpd" instruction.
   * a: __m256d
   */
  case class MM256_SVML_CEIL_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_ACOSH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision floating-point number representing the
   * integer exponent, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOGB_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPU16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_TAN_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed single-precision
   * (32-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m256
   */
  case class MM256_CDFNORM_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m128d
   */
  case class MM_COSD_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cube root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_CBRT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_SIN_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_ATANH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_SINH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed double-precision (64-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_HYPOT_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_ACOSH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_SIN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * single-precision (32-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m128
   */
  case class MM_CDFNORMINV_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512d
   */
  case class MM512_FLOOR_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed double-precision (64-bit) floating-point elements in "a",
   * and store the results as packed double-precision floating-point elements in
   * "dst". This intrinsic may generate the "roundpd"/"vroundpd" instruction.
   * a: __m256d
   */
  case class MM256_TRUNC_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_EXP10_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_SINH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_LOG_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256
   */
  case class MM256_EXP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision floating-point number representing the
   * integer exponent, and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set). This
   * intrinsic essentially calculates "floor(log2(x))" for each element.
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_LOGB_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_COS_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_LOG_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_COS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_LOG_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed single-precision (32-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_POW_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed single-precision (32-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_POW_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_tan_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_TAN_PS(a)
  }
            
  def _mm_erfinv_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERFINV_PD(a)
  }
            
  def _mm512_mask_log_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOG_PD(src, k, a)
  }
            
  def _mm512_asinh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ASINH_PD(a)
  }
            
  def _mm256_rem_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPU16(a, b)
  }
            
  def _mm512_floor_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_FLOOR_PS(a)
  }
            
  def _mm_erfc_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ERFC_PS(a)
  }
            
  def _mm512_tan_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_TAN_PS(a)
  }
            
  def _mm512_rem_epu64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPU64(a, b)
  }
            
  def _mm512_mask_tan_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_TAN_PD(src, k, a)
  }
            
  def _mm512_mask_div_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_DIV_EPI32(src, k, a, b)
  }
            
  def _mm_atan2_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ATAN2_PS(a, b)
  }
            
  def _mm_rem_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPU16(a, b)
  }
            
  def _mm512_cbrt_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_CBRT_PD(a)
  }
            
  def _mm512_mask_cos_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COS_PD(src, k, a)
  }
            
  def _mm512_mask_sind_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SIND_PD(src, k, a)
  }
            
  def _mm512_svml_round_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SVML_ROUND_PD(a)
  }
            
  def _mm_log10_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOG10_PD(a)
  }
            
  def _mm512_mask_acosh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ACOSH_PD(src, k, a)
  }
            
  def _mm_idivrem_epi32[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], b: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.write(mem_addr)(MM_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_invsqrt_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_INVSQRT_PS(src, k, a)
  }
            
  def _mm512_mask_sin_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_SIN_PD(src, k, a)
  }
            
  def _mm_log10_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG10_PS(a)
  }
            
  def _mm512_mask_erf_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ERF_PS(src, k, a)
  }
            
  def _mm_erf_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERF_PD(a)
  }
            
  def _mm512_erfcinv_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ERFCINV_PD(a)
  }
            
  def _mm256_svml_ceil_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SVML_CEIL_PD(a)
  }
            
  def _mm256_acosh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ACOSH_PD(a)
  }
            
  def _mm512_mask_logb_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOGB_PS(src, k, a)
  }
            
  def _mm512_div_epu16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPU16(a, b)
  }
            
  def _mm_tan_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_TAN_PS(a)
  }
            
  def _mm256_cdfnorm_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CDFNORM_PS(a)
  }
            
  def _mm512_rem_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPI16(a, b)
  }
            
  def _mm_cosd_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_COSD_PD(a)
  }
            
  def _mm512_cbrt_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_CBRT_PS(a)
  }
            
  def _mm512_sin_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_SIN_PD(a)
  }
            
  def _mm256_atanh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ATANH_PS(a)
  }
            
  def _mm256_sinh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SINH_PD(a)
  }
            
  def _mm256_hypot_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_HYPOT_PD(a, b)
  }
            
  def _mm_acosh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ACOSH_PS(a)
  }
            
  def _mm512_sin_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_SIN_PS(a)
  }
            
  def _mm_cdfnorminv_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CDFNORMINV_PS(a)
  }
            
  def _mm512_floor_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_FLOOR_PD(a)
  }
            
  def _mm256_trunc_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_TRUNC_PD(a)
  }
            
  def _mm512_mask_exp10_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP10_PD(src, k, a)
  }
            
  def _mm_div_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPU32(a, b)
  }
            
  def _mm_sinh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SINH_PD(a)
  }
            
  def _mm512_log_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG_PS(a)
  }
            
  def _mm256_exp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_EXP_PS(a)
  }
            
  def _mm512_mask_logb_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOGB_PD(src, k, a)
  }
            
  def _mm512_cos_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_COS_PD(a)
  }
            
  def _mm_log_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG_PS(a)
  }
            
  def _mm512_mask_cos_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COS_PS(src, k, a)
  }
            
  def _mm256_log_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOG_PS(a)
  }
            
  def _mm256_pow_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_POW_PS(a, b)
  }
            
  def _mm_pow_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_POW_PS(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_TAN_PS (a) =>
      _mm256_tan_ps(f(a))
    case MM_ERFINV_PD (a) =>
      _mm_erfinv_pd(f(a))
    case MM512_MASK_LOG_PD (src, k, a) =>
      _mm512_mask_log_pd(f(src), f(k), f(a))
    case MM512_ASINH_PD (a) =>
      _mm512_asinh_pd(f(a))
    case MM256_REM_EPU16 (a, b) =>
      _mm256_rem_epu16(f(a), f(b))
    case MM512_FLOOR_PS (a) =>
      _mm512_floor_ps(f(a))
    case MM_ERFC_PS (a) =>
      _mm_erfc_ps(f(a))
    case MM512_TAN_PS (a) =>
      _mm512_tan_ps(f(a))
    case MM512_REM_EPU64 (a, b) =>
      _mm512_rem_epu64(f(a), f(b))
    case MM512_MASK_TAN_PD (src, k, a) =>
      _mm512_mask_tan_pd(f(src), f(k), f(a))
    case MM512_MASK_DIV_EPI32 (src, k, a, b) =>
      _mm512_mask_div_epi32(f(src), f(k), f(a), f(b))
    case MM_ATAN2_PS (a, b) =>
      _mm_atan2_ps(f(a), f(b))
    case MM_REM_EPU16 (a, b) =>
      _mm_rem_epu16(f(a), f(b))
    case MM512_CBRT_PD (a) =>
      _mm512_cbrt_pd(f(a))
    case MM512_MASK_COS_PD (src, k, a) =>
      _mm512_mask_cos_pd(f(src), f(k), f(a))
    case MM512_MASK_SIND_PD (src, k, a) =>
      _mm512_mask_sind_pd(f(src), f(k), f(a))
    case MM512_SVML_ROUND_PD (a) =>
      _mm512_svml_round_pd(f(a))
    case MM_LOG10_PD (a) =>
      _mm_log10_pd(f(a))
    case MM512_MASK_ACOSH_PD (src, k, a) =>
      _mm512_mask_acosh_pd(f(src), f(k), f(a))
    case iDef@MM_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset) =>
      _mm_idivrem_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM512_MASK_INVSQRT_PS (src, k, a) =>
      _mm512_mask_invsqrt_ps(f(src), f(k), f(a))
    case MM512_MASK_SIN_PD (src, k, a) =>
      _mm512_mask_sin_pd(f(src), f(k), f(a))
    case MM_LOG10_PS (a) =>
      _mm_log10_ps(f(a))
    case MM512_MASK_ERF_PS (src, k, a) =>
      _mm512_mask_erf_ps(f(src), f(k), f(a))
    case MM_ERF_PD (a) =>
      _mm_erf_pd(f(a))
    case MM512_ERFCINV_PD (a) =>
      _mm512_erfcinv_pd(f(a))
    case MM256_SVML_CEIL_PD (a) =>
      _mm256_svml_ceil_pd(f(a))
    case MM256_ACOSH_PD (a) =>
      _mm256_acosh_pd(f(a))
    case MM512_MASK_LOGB_PS (src, k, a) =>
      _mm512_mask_logb_ps(f(src), f(k), f(a))
    case MM512_DIV_EPU16 (a, b) =>
      _mm512_div_epu16(f(a), f(b))
    case MM_TAN_PS (a) =>
      _mm_tan_ps(f(a))
    case MM256_CDFNORM_PS (a) =>
      _mm256_cdfnorm_ps(f(a))
    case MM512_REM_EPI16 (a, b) =>
      _mm512_rem_epi16(f(a), f(b))
    case MM_COSD_PD (a) =>
      _mm_cosd_pd(f(a))
    case MM512_CBRT_PS (a) =>
      _mm512_cbrt_ps(f(a))
    case MM512_SIN_PD (a) =>
      _mm512_sin_pd(f(a))
    case MM256_ATANH_PS (a) =>
      _mm256_atanh_ps(f(a))
    case MM256_SINH_PD (a) =>
      _mm256_sinh_pd(f(a))
    case MM256_HYPOT_PD (a, b) =>
      _mm256_hypot_pd(f(a), f(b))
    case MM_ACOSH_PS (a) =>
      _mm_acosh_ps(f(a))
    case MM512_SIN_PS (a) =>
      _mm512_sin_ps(f(a))
    case MM_CDFNORMINV_PS (a) =>
      _mm_cdfnorminv_ps(f(a))
    case MM512_FLOOR_PD (a) =>
      _mm512_floor_pd(f(a))
    case MM256_TRUNC_PD (a) =>
      _mm256_trunc_pd(f(a))
    case MM512_MASK_EXP10_PD (src, k, a) =>
      _mm512_mask_exp10_pd(f(src), f(k), f(a))
    case MM_DIV_EPU32 (a, b) =>
      _mm_div_epu32(f(a), f(b))
    case MM_SINH_PD (a) =>
      _mm_sinh_pd(f(a))
    case MM512_LOG_PS (a) =>
      _mm512_log_ps(f(a))
    case MM256_EXP_PS (a) =>
      _mm256_exp_ps(f(a))
    case MM512_MASK_LOGB_PD (src, k, a) =>
      _mm512_mask_logb_pd(f(src), f(k), f(a))
    case MM512_COS_PD (a) =>
      _mm512_cos_pd(f(a))
    case MM_LOG_PS (a) =>
      _mm_log_ps(f(a))
    case MM512_MASK_COS_PS (src, k, a) =>
      _mm512_mask_cos_ps(f(src), f(k), f(a))
    case MM256_LOG_PS (a) =>
      _mm256_log_ps(f(a))
    case MM256_POW_PS (a, b) =>
      _mm256_pow_ps(f(a), f(b))
    case MM_POW_PS (a, b) =>
      _mm_pow_ps(f(a), f(b))

    case Reflect(MM256_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ASINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ASINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_TAN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_TAN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATAN2_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ATAN2_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SVML_ROUND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SVML_ROUND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ACOSH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ACOSH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_IDIVREM_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INVSQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INVSQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SIN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SIN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERF_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERF_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERF_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERF_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFCINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFCINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ACOSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ACOSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOGB_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOGB_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CDFNORM_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CDFNORM_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_COSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ATANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HYPOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HYPOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ACOSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ACOSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_SIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CDFNORMINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CDFNORMINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TRUNC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_TRUNC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP10_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP10_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOGB_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOGB_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_COS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_POW_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_POW_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_POW_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_POW_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSVML02 extends CGenIntrinsics {

  val IR: SVML
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_TAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tan_ps(${quote(a)})")
    case iDef@MM_ERFINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfinv_pd(${quote(a)})")
    case iDef@MM512_MASK_LOG_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ASINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_asinh_pd(${quote(a)})")
    case iDef@MM256_REM_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_floor_ps(${quote(a)})")
    case iDef@MM_ERFC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfc_ps(${quote(a)})")
    case iDef@MM512_TAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_tan_ps(${quote(a)})")
    case iDef@MM512_REM_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_TAN_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_tan_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_DIV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_ATAN2_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atan2_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_CBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cbrt_pd(${quote(a)})")
    case iDef@MM512_MASK_COS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cos_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SIND_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sind_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SVML_ROUND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_svml_round_pd(${quote(a)})")
    case iDef@MM_LOG10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log10_pd(${quote(a)})")
    case iDef@MM512_MASK_ACOSH_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_acosh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_idivrem_epi32((__m128i *) (${quote(mem_addr)  + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}), ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_INVSQRT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_invsqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_SIN_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_sin_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_LOG10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log10_ps(${quote(a)})")
    case iDef@MM512_MASK_ERF_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erf_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_ERF_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erf_pd(${quote(a)})")
    case iDef@MM512_ERFCINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfcinv_pd(${quote(a)})")
    case iDef@MM256_SVML_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_ceil_pd(${quote(a)})")
    case iDef@MM256_ACOSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_acosh_pd(${quote(a)})")
    case iDef@MM512_MASK_LOGB_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_logb_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_DIV_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_TAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tan_ps(${quote(a)})")
    case iDef@MM256_CDFNORM_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cdfnorm_ps(${quote(a)})")
    case iDef@MM512_REM_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_COSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cosd_pd(${quote(a)})")
    case iDef@MM512_CBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cbrt_ps(${quote(a)})")
    case iDef@MM512_SIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sin_pd(${quote(a)})")
    case iDef@MM256_ATANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atanh_ps(${quote(a)})")
    case iDef@MM256_SINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sinh_pd(${quote(a)})")
    case iDef@MM256_HYPOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hypot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ACOSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_acosh_ps(${quote(a)})")
    case iDef@MM512_SIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sin_ps(${quote(a)})")
    case iDef@MM_CDFNORMINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cdfnorminv_ps(${quote(a)})")
    case iDef@MM512_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_floor_pd(${quote(a)})")
    case iDef@MM256_TRUNC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_trunc_pd(${quote(a)})")
    case iDef@MM512_MASK_EXP10_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp10_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM_DIV_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sinh_pd(${quote(a)})")
    case iDef@MM512_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log_ps(${quote(a)})")
    case iDef@MM256_EXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp_ps(${quote(a)})")
    case iDef@MM512_MASK_LOGB_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_logb_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cos_pd(${quote(a)})")
    case iDef@MM_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log_ps(${quote(a)})")
    case iDef@MM512_MASK_COS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cos_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM256_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log_ps(${quote(a)})")
    case iDef@MM256_POW_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_pow_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_POW_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_pow_ps(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
