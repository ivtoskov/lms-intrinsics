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

    
trait SVML00 extends IntrinsicsBase {
  /**
   * Compute the inverse cosine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_ACOS_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_ACOS_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_ACOSH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * Compute the inverse sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_ASIN_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_ASIN_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_ASINH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_ASINH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_ATAN_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_ATAN_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m128d, b: __m128d
   */
  case class MM_ATAN2_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the inverse hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_ATANH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_ATANH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cube root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_CBRT_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cube root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_CBRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed double-precision
   * (64-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m128d
   */
  case class MM_CDFNORM_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed single-precision
   * (32-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m128
   */
  case class MM_CDFNORM_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * double-precision (64-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m128d
   */
  case class MM_CDFNORMINV_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the exponential value of "e" raised to the power of packed complex
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_CEXP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed complex single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_CLOG_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_COS_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_COS_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m128
   */
  case class MM_COSD_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_COSH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_COSH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed complex single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_CSQRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPU16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_DIV_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the error function of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_ERF_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_ERFC_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the inverse complementary error function of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_ERFCINV_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_ERFCINV_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the inverse error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_ERFINV_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128d
   */
  case class MM_EXP_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_EXP_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128d
   */
  case class MM_EXP10_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_EXP10_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128d
   */
  case class MM_EXP2_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m128
   */
  case class MM_EXP2_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m128d
   */
  case class MM_EXPM1_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m128
   */
  case class MM_EXPM1_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed double-precision (64-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_HYPOT_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed single-precision (32-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m128, b: __m128
   */
  case class MM_HYPOT_PS(a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_IDIV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Compute the inverse cube root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_INVCBRT_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cube root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_INVCBRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_INVSQRT_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_INVSQRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_IREM_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_LOG_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the natural logarithm of one plus packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_LOG1P_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_LOG1P_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128d
   */
  case class MM_LOG2_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m128
   */
  case class MM_LOG2_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed double-precision (64-bit) floating-point
   * element in "a" to a double-precision floating-point number representing the
   * integer exponent, and store the results in "dst". This intrinsic essentially
   * calculates "floor(log2(x))" for each element.
   * a: __m128d
   */
  case class MM_LOGB_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision floating-point number representing the
   * integer exponent, and store the results in "dst". This intrinsic essentially
   * calculates "floor(log2(x))" for each element.
   * a: __m128
   */
  case class MM_LOGB_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed double-precision (64-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m128d, b: __m128d
   */
  case class MM_POW_PD(a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
      

  /**
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPI64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPU8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPU32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_REM_EPU64(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_SIN_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_SIN_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine and cosine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, store the sine in "dst", and store the
   * cosine into memory at "mem_addr".
   * mem_addr: __m128d *, a: __m128d, mem_addrOffset: int
   */
  case class MM_SINCOS_PD[A[_], U:Integral](mem_addr: Exp[A[__m128d]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine and cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, store the sine in "dst", and store the
   * cosine into memory at "mem_addr".
   * mem_addr: __m128 *, a: __m128, mem_addrOffset: int
   */
  case class MM_SINCOS_PS[A[_], U:Integral](mem_addr: Exp[A[__m128]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m128d
   */
  case class MM_SIND_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m128
   */
  case class MM_SIND_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the hyperbolic sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128
   */
  case class MM_SINH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundpd"/"vroundpd" instruction.
   * a: __m128d
   */
  case class MM_SVML_CEIL_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundps"/"vroundps" instruction.
   * a: __m128
   */
  case class MM_SVML_CEIL_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundpd"/"vroundpd" instruction.
   * a: __m128d
   */
  case class MM_SVML_FLOOR_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundps"/"vroundps" instruction.
   * a: __m128
   */
  case class MM_SVML_FLOOR_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" to
   * the nearest integer value, and store the results as packed double-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundpd"/"vroundpd" instruction.
   * a: __m128d
   */
  case class MM_SVML_ROUND_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" to
   * the nearest integer value, and store the results as packed single-precision
   * floating-point elements in "dst". This intrinsic may generate the
   * "roundps"/"vroundps" instruction.
   * a: __m128
   */
  case class MM_SVML_ROUND_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". Note that this intrinsic is
   * less efficient than "_mm_sqrt_pd".
   * a: __m128d
   */
  case class MM_SVML_SQRT_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". Note that this intrinsic is
   * less efficient than "_mm_sqrt_ps".
   * a: __m128
   */
  case class MM_SVML_SQRT_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m128d
   */
  case class MM_TAN_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m128d
   */
  case class MM_TAND_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m128
   */
  case class MM_TAND_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128d
   */
  case class MM_TANH_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m128
   */
  case class MM_TANH_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed double-precision (64-bit) floating-point elements in "a",
   * and store the results as packed double-precision floating-point elements in
   * "dst". This intrinsic may generate the "roundpd"/"vroundpd" instruction.
   * a: __m128d
   */
  case class MM_TRUNC_PD(a: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Truncate the packed single-precision (32-bit) floating-point elements in "a",
   * and store the results as packed single-precision floating-point elements in
   * "dst". This intrinsic may generate the "roundps"/"vroundps" instruction.
   * a: __m128
   */
  case class MM_TRUNC_PS(a: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UDIV_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", store
   * the truncated results in "dst", and store the remainders as packed unsigned
   * 32-bit integers into memory at "mem_addr".
   * mem_addr: __m128i *, a: __m128i, b: __m128i, mem_addrOffset: int
   */
  case class MM_UDIVREM_EPI32[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], b: Exp[__m128i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_UREM_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ACOS_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_ACOS_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
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
   * Compute the inverse hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_ACOSH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ASIN_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_ASIN_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_ASINH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_ASINH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ATAN_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_ATAN_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m256d, b: __m256d
   */
  case class MM256_ATAN2_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m256, b: __m256
   */
  case class MM256_ATAN2_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_ATANH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * Compute the cube root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CBRT_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cube root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_CBRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed double-precision
   * (64-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m256d
   */
  case class MM256_CDFNORM_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the inverse cumulative distribution function of packed
   * double-precision (64-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_CDFNORMINV_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * single-precision (32-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m256
   */
  case class MM256_CDFNORMINV_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed complex
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256
   */
  case class MM256_CEXP_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed complex single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_CLOG_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_COS_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_COS_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_COSD_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m256
   */
  case class MM256_COSD_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_COSH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_COSH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed complex single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_CSQRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 16-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPU16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPU32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_DIV_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ERF_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_ERF_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ERFC_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_ERFC_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ERFCINV_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_ERFCINV_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_ERFINV_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_ERFINV_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256d
   */
  case class MM256_EXP_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * Compute the exponential value of 10 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256d
   */
  case class MM256_EXP10_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256
   */
  case class MM256_EXP10_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256d
   */
  case class MM256_EXP2_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m256
   */
  case class MM256_EXP2_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_EXPM1_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m256
   */
  case class MM256_EXPM1_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed single-precision (32-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m256, b: __m256
   */
  case class MM256_HYPOT_PS(a: Exp[__m256], b: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_IDIV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", store the
   * truncated results in "dst", and store the remainders as packed 32-bit integers
   * into memory at "mem_addr".
   * mem_addr: __m256i *, a: __m256i, b: __m256i, mem_addrOffset: int
   */
  case class MM256_IDIVREM_EPI32[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], b: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cube root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_INVCBRT_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cube root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_INVCBRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_INVSQRT_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_INVSQRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_IREM_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_LOG_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the base-10 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_LOG10_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_LOG10_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm_acos_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ACOS_PD(a)
  }
            
  def _mm_acos_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ACOS_PS(a)
  }
            
  def _mm_acosh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ACOSH_PD(a)
  }
            
  def _mm_acosh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ACOSH_PS(a)
  }
            
  def _mm_asin_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ASIN_PD(a)
  }
            
  def _mm_asin_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ASIN_PS(a)
  }
            
  def _mm_asinh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ASINH_PD(a)
  }
            
  def _mm_asinh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ASINH_PS(a)
  }
            
  def _mm_atan_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ATAN_PD(a)
  }
            
  def _mm_atan_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ATAN_PS(a)
  }
            
  def _mm_atan2_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_ATAN2_PD(a, b)
  }
            
  def _mm_atan2_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_ATAN2_PS(a, b)
  }
            
  def _mm_atanh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ATANH_PD(a)
  }
            
  def _mm_atanh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ATANH_PS(a)
  }
            
  def _mm_cbrt_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_CBRT_PD(a)
  }
            
  def _mm_cbrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CBRT_PS(a)
  }
            
  def _mm_cdfnorm_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_CDFNORM_PD(a)
  }
            
  def _mm_cdfnorm_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CDFNORM_PS(a)
  }
            
  def _mm_cdfnorminv_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_CDFNORMINV_PD(a)
  }
            
  def _mm_cdfnorminv_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CDFNORMINV_PS(a)
  }
            
  def _mm_cexp_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CEXP_PS(a)
  }
            
  def _mm_clog_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CLOG_PS(a)
  }
            
  def _mm_cos_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_COS_PD(a)
  }
            
  def _mm_cos_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_COS_PS(a)
  }
            
  def _mm_cosd_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_COSD_PD(a)
  }
            
  def _mm_cosd_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_COSD_PS(a)
  }
            
  def _mm_cosh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_COSH_PD(a)
  }
            
  def _mm_cosh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_COSH_PS(a)
  }
            
  def _mm_csqrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_CSQRT_PS(a)
  }
            
  def _mm_div_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPI8(a, b)
  }
            
  def _mm_div_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPI16(a, b)
  }
            
  def _mm_div_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPI32(a, b)
  }
            
  def _mm_div_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPI64(a, b)
  }
            
  def _mm_div_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPU8(a, b)
  }
            
  def _mm_div_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPU16(a, b)
  }
            
  def _mm_div_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPU32(a, b)
  }
            
  def _mm_div_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_DIV_EPU64(a, b)
  }
            
  def _mm_erf_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERF_PD(a)
  }
            
  def _mm_erf_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ERF_PS(a)
  }
            
  def _mm_erfc_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERFC_PD(a)
  }
            
  def _mm_erfc_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ERFC_PS(a)
  }
            
  def _mm_erfcinv_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERFCINV_PD(a)
  }
            
  def _mm_erfcinv_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ERFCINV_PS(a)
  }
            
  def _mm_erfinv_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_ERFINV_PD(a)
  }
            
  def _mm_erfinv_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_ERFINV_PS(a)
  }
            
  def _mm_exp_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_EXP_PD(a)
  }
            
  def _mm_exp_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_EXP_PS(a)
  }
            
  def _mm_exp10_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_EXP10_PD(a)
  }
            
  def _mm_exp10_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_EXP10_PS(a)
  }
            
  def _mm_exp2_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_EXP2_PD(a)
  }
            
  def _mm_exp2_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_EXP2_PS(a)
  }
            
  def _mm_expm1_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_EXPM1_PD(a)
  }
            
  def _mm_expm1_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_EXPM1_PS(a)
  }
            
  def _mm_hypot_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_HYPOT_PD(a, b)
  }
            
  def _mm_hypot_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_HYPOT_PS(a, b)
  }
            
  def _mm_idiv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_IDIV_EPI32(a, b)
  }
            
  def _mm_idivrem_epi32[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], b: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.write(mem_addr)(MM_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_invcbrt_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_INVCBRT_PD(a)
  }
            
  def _mm_invcbrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_INVCBRT_PS(a)
  }
            
  def _mm_invsqrt_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_INVSQRT_PD(a)
  }
            
  def _mm_invsqrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_INVSQRT_PS(a)
  }
            
  def _mm_irem_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_IREM_EPI32(a, b)
  }
            
  def _mm_log_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOG_PD(a)
  }
            
  def _mm_log_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG_PS(a)
  }
            
  def _mm_log10_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOG10_PD(a)
  }
            
  def _mm_log10_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG10_PS(a)
  }
            
  def _mm_log1p_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOG1P_PD(a)
  }
            
  def _mm_log1p_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG1P_PS(a)
  }
            
  def _mm_log2_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOG2_PD(a)
  }
            
  def _mm_log2_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOG2_PS(a)
  }
            
  def _mm_logb_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_LOGB_PD(a)
  }
            
  def _mm_logb_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_LOGB_PS(a)
  }
            
  def _mm_pow_pd(a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_POW_PD(a, b)
  }
            
  def _mm_pow_ps(a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_POW_PS(a, b)
  }
            
  def _mm_rem_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPI8(a, b)
  }
            
  def _mm_rem_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPI16(a, b)
  }
            
  def _mm_rem_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPI32(a, b)
  }
            
  def _mm_rem_epi64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPI64(a, b)
  }
            
  def _mm_rem_epu8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPU8(a, b)
  }
            
  def _mm_rem_epu16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPU16(a, b)
  }
            
  def _mm_rem_epu32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPU32(a, b)
  }
            
  def _mm_rem_epu64(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_REM_EPU64(a, b)
  }
            
  def _mm_sin_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SIN_PD(a)
  }
            
  def _mm_sin_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SIN_PS(a)
  }
            
  def _mm_sincos_pd[A[_], U:Integral](mem_addr: Exp[A[__m128d]], a: Exp[__m128d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128d] = {
    cont.write(mem_addr)(MM_SINCOS_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sincos_ps[A[_], U:Integral](mem_addr: Exp[A[__m128]], a: Exp[__m128], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128] = {
    cont.write(mem_addr)(MM_SINCOS_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_sind_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SIND_PD(a)
  }
            
  def _mm_sind_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SIND_PS(a)
  }
            
  def _mm_sinh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SINH_PD(a)
  }
            
  def _mm_sinh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SINH_PS(a)
  }
            
  def _mm_svml_ceil_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SVML_CEIL_PD(a)
  }
            
  def _mm_svml_ceil_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SVML_CEIL_PS(a)
  }
            
  def _mm_svml_floor_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SVML_FLOOR_PD(a)
  }
            
  def _mm_svml_floor_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SVML_FLOOR_PS(a)
  }
            
  def _mm_svml_round_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SVML_ROUND_PD(a)
  }
            
  def _mm_svml_round_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SVML_ROUND_PS(a)
  }
            
  def _mm_svml_sqrt_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_SVML_SQRT_PD(a)
  }
            
  def _mm_svml_sqrt_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_SVML_SQRT_PS(a)
  }
            
  def _mm_tan_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_TAN_PD(a)
  }
            
  def _mm_tan_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_TAN_PS(a)
  }
            
  def _mm_tand_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_TAND_PD(a)
  }
            
  def _mm_tand_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_TAND_PS(a)
  }
            
  def _mm_tanh_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_TANH_PD(a)
  }
            
  def _mm_tanh_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_TANH_PS(a)
  }
            
  def _mm_trunc_pd(a: Exp[__m128d]): Exp[__m128d] = {
    MM_TRUNC_PD(a)
  }
            
  def _mm_trunc_ps(a: Exp[__m128]): Exp[__m128] = {
    MM_TRUNC_PS(a)
  }
            
  def _mm_udiv_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UDIV_EPI32(a, b)
  }
            
  def _mm_udivrem_epi32[A[_], U:Integral](mem_addr: Exp[A[__m128i]], a: Exp[__m128i], b: Exp[__m128i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m128i] = {
    cont.write(mem_addr)(MM_UDIVREM_EPI32(mem_addr, a, b, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm_urem_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_UREM_EPI32(a, b)
  }
            
  def _mm256_acos_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ACOS_PD(a)
  }
            
  def _mm256_acos_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ACOS_PS(a)
  }
            
  def _mm256_acosh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ACOSH_PD(a)
  }
            
  def _mm256_acosh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ACOSH_PS(a)
  }
            
  def _mm256_asin_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ASIN_PD(a)
  }
            
  def _mm256_asin_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ASIN_PS(a)
  }
            
  def _mm256_asinh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ASINH_PD(a)
  }
            
  def _mm256_asinh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ASINH_PS(a)
  }
            
  def _mm256_atan_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ATAN_PD(a)
  }
            
  def _mm256_atan_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ATAN_PS(a)
  }
            
  def _mm256_atan2_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_ATAN2_PD(a, b)
  }
            
  def _mm256_atan2_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_ATAN2_PS(a, b)
  }
            
  def _mm256_atanh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ATANH_PD(a)
  }
            
  def _mm256_atanh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ATANH_PS(a)
  }
            
  def _mm256_cbrt_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_CBRT_PD(a)
  }
            
  def _mm256_cbrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CBRT_PS(a)
  }
            
  def _mm256_cdfnorm_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_CDFNORM_PD(a)
  }
            
  def _mm256_cdfnorm_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CDFNORM_PS(a)
  }
            
  def _mm256_cdfnorminv_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_CDFNORMINV_PD(a)
  }
            
  def _mm256_cdfnorminv_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CDFNORMINV_PS(a)
  }
            
  def _mm256_cexp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CEXP_PS(a)
  }
            
  def _mm256_clog_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CLOG_PS(a)
  }
            
  def _mm256_cos_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_COS_PD(a)
  }
            
  def _mm256_cos_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_COS_PS(a)
  }
            
  def _mm256_cosd_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_COSD_PD(a)
  }
            
  def _mm256_cosd_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_COSD_PS(a)
  }
            
  def _mm256_cosh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_COSH_PD(a)
  }
            
  def _mm256_cosh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_COSH_PS(a)
  }
            
  def _mm256_csqrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_CSQRT_PS(a)
  }
            
  def _mm256_div_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPI8(a, b)
  }
            
  def _mm256_div_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPI16(a, b)
  }
            
  def _mm256_div_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPI32(a, b)
  }
            
  def _mm256_div_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPI64(a, b)
  }
            
  def _mm256_div_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPU8(a, b)
  }
            
  def _mm256_div_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPU16(a, b)
  }
            
  def _mm256_div_epu32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPU32(a, b)
  }
            
  def _mm256_div_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_DIV_EPU64(a, b)
  }
            
  def _mm256_erf_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ERF_PD(a)
  }
            
  def _mm256_erf_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ERF_PS(a)
  }
            
  def _mm256_erfc_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ERFC_PD(a)
  }
            
  def _mm256_erfc_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ERFC_PS(a)
  }
            
  def _mm256_erfcinv_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ERFCINV_PD(a)
  }
            
  def _mm256_erfcinv_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ERFCINV_PS(a)
  }
            
  def _mm256_erfinv_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_ERFINV_PD(a)
  }
            
  def _mm256_erfinv_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_ERFINV_PS(a)
  }
            
  def _mm256_exp_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_EXP_PD(a)
  }
            
  def _mm256_exp_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_EXP_PS(a)
  }
            
  def _mm256_exp10_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_EXP10_PD(a)
  }
            
  def _mm256_exp10_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_EXP10_PS(a)
  }
            
  def _mm256_exp2_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_EXP2_PD(a)
  }
            
  def _mm256_exp2_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_EXP2_PS(a)
  }
            
  def _mm256_expm1_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_EXPM1_PD(a)
  }
            
  def _mm256_expm1_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_EXPM1_PS(a)
  }
            
  def _mm256_hypot_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_HYPOT_PD(a, b)
  }
            
  def _mm256_hypot_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_HYPOT_PS(a, b)
  }
            
  def _mm256_idiv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_IDIV_EPI32(a, b)
  }
            
  def _mm256_idivrem_epi32[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], b: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.write(mem_addr)(MM256_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_invcbrt_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_INVCBRT_PD(a)
  }
            
  def _mm256_invcbrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_INVCBRT_PS(a)
  }
            
  def _mm256_invsqrt_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_INVSQRT_PD(a)
  }
            
  def _mm256_invsqrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_INVSQRT_PS(a)
  }
            
  def _mm256_irem_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_IREM_EPI32(a, b)
  }
            
  def _mm256_log_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_LOG_PD(a)
  }
            
  def _mm256_log_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOG_PS(a)
  }
            
  def _mm256_log10_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_LOG10_PD(a)
  }
            
  def _mm256_log10_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOG10_PS(a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_ACOS_PD (a) =>
      _mm_acos_pd(f(a))
    case MM_ACOS_PS (a) =>
      _mm_acos_ps(f(a))
    case MM_ACOSH_PD (a) =>
      _mm_acosh_pd(f(a))
    case MM_ACOSH_PS (a) =>
      _mm_acosh_ps(f(a))
    case MM_ASIN_PD (a) =>
      _mm_asin_pd(f(a))
    case MM_ASIN_PS (a) =>
      _mm_asin_ps(f(a))
    case MM_ASINH_PD (a) =>
      _mm_asinh_pd(f(a))
    case MM_ASINH_PS (a) =>
      _mm_asinh_ps(f(a))
    case MM_ATAN_PD (a) =>
      _mm_atan_pd(f(a))
    case MM_ATAN_PS (a) =>
      _mm_atan_ps(f(a))
    case MM_ATAN2_PD (a, b) =>
      _mm_atan2_pd(f(a), f(b))
    case MM_ATAN2_PS (a, b) =>
      _mm_atan2_ps(f(a), f(b))
    case MM_ATANH_PD (a) =>
      _mm_atanh_pd(f(a))
    case MM_ATANH_PS (a) =>
      _mm_atanh_ps(f(a))
    case MM_CBRT_PD (a) =>
      _mm_cbrt_pd(f(a))
    case MM_CBRT_PS (a) =>
      _mm_cbrt_ps(f(a))
    case MM_CDFNORM_PD (a) =>
      _mm_cdfnorm_pd(f(a))
    case MM_CDFNORM_PS (a) =>
      _mm_cdfnorm_ps(f(a))
    case MM_CDFNORMINV_PD (a) =>
      _mm_cdfnorminv_pd(f(a))
    case MM_CDFNORMINV_PS (a) =>
      _mm_cdfnorminv_ps(f(a))
    case MM_CEXP_PS (a) =>
      _mm_cexp_ps(f(a))
    case MM_CLOG_PS (a) =>
      _mm_clog_ps(f(a))
    case MM_COS_PD (a) =>
      _mm_cos_pd(f(a))
    case MM_COS_PS (a) =>
      _mm_cos_ps(f(a))
    case MM_COSD_PD (a) =>
      _mm_cosd_pd(f(a))
    case MM_COSD_PS (a) =>
      _mm_cosd_ps(f(a))
    case MM_COSH_PD (a) =>
      _mm_cosh_pd(f(a))
    case MM_COSH_PS (a) =>
      _mm_cosh_ps(f(a))
    case MM_CSQRT_PS (a) =>
      _mm_csqrt_ps(f(a))
    case MM_DIV_EPI8 (a, b) =>
      _mm_div_epi8(f(a), f(b))
    case MM_DIV_EPI16 (a, b) =>
      _mm_div_epi16(f(a), f(b))
    case MM_DIV_EPI32 (a, b) =>
      _mm_div_epi32(f(a), f(b))
    case MM_DIV_EPI64 (a, b) =>
      _mm_div_epi64(f(a), f(b))
    case MM_DIV_EPU8 (a, b) =>
      _mm_div_epu8(f(a), f(b))
    case MM_DIV_EPU16 (a, b) =>
      _mm_div_epu16(f(a), f(b))
    case MM_DIV_EPU32 (a, b) =>
      _mm_div_epu32(f(a), f(b))
    case MM_DIV_EPU64 (a, b) =>
      _mm_div_epu64(f(a), f(b))
    case MM_ERF_PD (a) =>
      _mm_erf_pd(f(a))
    case MM_ERF_PS (a) =>
      _mm_erf_ps(f(a))
    case MM_ERFC_PD (a) =>
      _mm_erfc_pd(f(a))
    case MM_ERFC_PS (a) =>
      _mm_erfc_ps(f(a))
    case MM_ERFCINV_PD (a) =>
      _mm_erfcinv_pd(f(a))
    case MM_ERFCINV_PS (a) =>
      _mm_erfcinv_ps(f(a))
    case MM_ERFINV_PD (a) =>
      _mm_erfinv_pd(f(a))
    case MM_ERFINV_PS (a) =>
      _mm_erfinv_ps(f(a))
    case MM_EXP_PD (a) =>
      _mm_exp_pd(f(a))
    case MM_EXP_PS (a) =>
      _mm_exp_ps(f(a))
    case MM_EXP10_PD (a) =>
      _mm_exp10_pd(f(a))
    case MM_EXP10_PS (a) =>
      _mm_exp10_ps(f(a))
    case MM_EXP2_PD (a) =>
      _mm_exp2_pd(f(a))
    case MM_EXP2_PS (a) =>
      _mm_exp2_ps(f(a))
    case MM_EXPM1_PD (a) =>
      _mm_expm1_pd(f(a))
    case MM_EXPM1_PS (a) =>
      _mm_expm1_ps(f(a))
    case MM_HYPOT_PD (a, b) =>
      _mm_hypot_pd(f(a), f(b))
    case MM_HYPOT_PS (a, b) =>
      _mm_hypot_ps(f(a), f(b))
    case MM_IDIV_EPI32 (a, b) =>
      _mm_idiv_epi32(f(a), f(b))
    case iDef@MM_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset) =>
      _mm_idivrem_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_INVCBRT_PD (a) =>
      _mm_invcbrt_pd(f(a))
    case MM_INVCBRT_PS (a) =>
      _mm_invcbrt_ps(f(a))
    case MM_INVSQRT_PD (a) =>
      _mm_invsqrt_pd(f(a))
    case MM_INVSQRT_PS (a) =>
      _mm_invsqrt_ps(f(a))
    case MM_IREM_EPI32 (a, b) =>
      _mm_irem_epi32(f(a), f(b))
    case MM_LOG_PD (a) =>
      _mm_log_pd(f(a))
    case MM_LOG_PS (a) =>
      _mm_log_ps(f(a))
    case MM_LOG10_PD (a) =>
      _mm_log10_pd(f(a))
    case MM_LOG10_PS (a) =>
      _mm_log10_ps(f(a))
    case MM_LOG1P_PD (a) =>
      _mm_log1p_pd(f(a))
    case MM_LOG1P_PS (a) =>
      _mm_log1p_ps(f(a))
    case MM_LOG2_PD (a) =>
      _mm_log2_pd(f(a))
    case MM_LOG2_PS (a) =>
      _mm_log2_ps(f(a))
    case MM_LOGB_PD (a) =>
      _mm_logb_pd(f(a))
    case MM_LOGB_PS (a) =>
      _mm_logb_ps(f(a))
    case MM_POW_PD (a, b) =>
      _mm_pow_pd(f(a), f(b))
    case MM_POW_PS (a, b) =>
      _mm_pow_ps(f(a), f(b))
    case MM_REM_EPI8 (a, b) =>
      _mm_rem_epi8(f(a), f(b))
    case MM_REM_EPI16 (a, b) =>
      _mm_rem_epi16(f(a), f(b))
    case MM_REM_EPI32 (a, b) =>
      _mm_rem_epi32(f(a), f(b))
    case MM_REM_EPI64 (a, b) =>
      _mm_rem_epi64(f(a), f(b))
    case MM_REM_EPU8 (a, b) =>
      _mm_rem_epu8(f(a), f(b))
    case MM_REM_EPU16 (a, b) =>
      _mm_rem_epu16(f(a), f(b))
    case MM_REM_EPU32 (a, b) =>
      _mm_rem_epu32(f(a), f(b))
    case MM_REM_EPU64 (a, b) =>
      _mm_rem_epu64(f(a), f(b))
    case MM_SIN_PD (a) =>
      _mm_sin_pd(f(a))
    case MM_SIN_PS (a) =>
      _mm_sin_ps(f(a))
    case iDef@MM_SINCOS_PD (mem_addr, a, mem_addrOffset) =>
      _mm_sincos_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM_SINCOS_PS (mem_addr, a, mem_addrOffset) =>
      _mm_sincos_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_SIND_PD (a) =>
      _mm_sind_pd(f(a))
    case MM_SIND_PS (a) =>
      _mm_sind_ps(f(a))
    case MM_SINH_PD (a) =>
      _mm_sinh_pd(f(a))
    case MM_SINH_PS (a) =>
      _mm_sinh_ps(f(a))
    case MM_SVML_CEIL_PD (a) =>
      _mm_svml_ceil_pd(f(a))
    case MM_SVML_CEIL_PS (a) =>
      _mm_svml_ceil_ps(f(a))
    case MM_SVML_FLOOR_PD (a) =>
      _mm_svml_floor_pd(f(a))
    case MM_SVML_FLOOR_PS (a) =>
      _mm_svml_floor_ps(f(a))
    case MM_SVML_ROUND_PD (a) =>
      _mm_svml_round_pd(f(a))
    case MM_SVML_ROUND_PS (a) =>
      _mm_svml_round_ps(f(a))
    case MM_SVML_SQRT_PD (a) =>
      _mm_svml_sqrt_pd(f(a))
    case MM_SVML_SQRT_PS (a) =>
      _mm_svml_sqrt_ps(f(a))
    case MM_TAN_PD (a) =>
      _mm_tan_pd(f(a))
    case MM_TAN_PS (a) =>
      _mm_tan_ps(f(a))
    case MM_TAND_PD (a) =>
      _mm_tand_pd(f(a))
    case MM_TAND_PS (a) =>
      _mm_tand_ps(f(a))
    case MM_TANH_PD (a) =>
      _mm_tanh_pd(f(a))
    case MM_TANH_PS (a) =>
      _mm_tanh_ps(f(a))
    case MM_TRUNC_PD (a) =>
      _mm_trunc_pd(f(a))
    case MM_TRUNC_PS (a) =>
      _mm_trunc_ps(f(a))
    case MM_UDIV_EPI32 (a, b) =>
      _mm_udiv_epi32(f(a), f(b))
    case iDef@MM_UDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset) =>
      _mm_udivrem_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM_UREM_EPI32 (a, b) =>
      _mm_urem_epi32(f(a), f(b))
    case MM256_ACOS_PD (a) =>
      _mm256_acos_pd(f(a))
    case MM256_ACOS_PS (a) =>
      _mm256_acos_ps(f(a))
    case MM256_ACOSH_PD (a) =>
      _mm256_acosh_pd(f(a))
    case MM256_ACOSH_PS (a) =>
      _mm256_acosh_ps(f(a))
    case MM256_ASIN_PD (a) =>
      _mm256_asin_pd(f(a))
    case MM256_ASIN_PS (a) =>
      _mm256_asin_ps(f(a))
    case MM256_ASINH_PD (a) =>
      _mm256_asinh_pd(f(a))
    case MM256_ASINH_PS (a) =>
      _mm256_asinh_ps(f(a))
    case MM256_ATAN_PD (a) =>
      _mm256_atan_pd(f(a))
    case MM256_ATAN_PS (a) =>
      _mm256_atan_ps(f(a))
    case MM256_ATAN2_PD (a, b) =>
      _mm256_atan2_pd(f(a), f(b))
    case MM256_ATAN2_PS (a, b) =>
      _mm256_atan2_ps(f(a), f(b))
    case MM256_ATANH_PD (a) =>
      _mm256_atanh_pd(f(a))
    case MM256_ATANH_PS (a) =>
      _mm256_atanh_ps(f(a))
    case MM256_CBRT_PD (a) =>
      _mm256_cbrt_pd(f(a))
    case MM256_CBRT_PS (a) =>
      _mm256_cbrt_ps(f(a))
    case MM256_CDFNORM_PD (a) =>
      _mm256_cdfnorm_pd(f(a))
    case MM256_CDFNORM_PS (a) =>
      _mm256_cdfnorm_ps(f(a))
    case MM256_CDFNORMINV_PD (a) =>
      _mm256_cdfnorminv_pd(f(a))
    case MM256_CDFNORMINV_PS (a) =>
      _mm256_cdfnorminv_ps(f(a))
    case MM256_CEXP_PS (a) =>
      _mm256_cexp_ps(f(a))
    case MM256_CLOG_PS (a) =>
      _mm256_clog_ps(f(a))
    case MM256_COS_PD (a) =>
      _mm256_cos_pd(f(a))
    case MM256_COS_PS (a) =>
      _mm256_cos_ps(f(a))
    case MM256_COSD_PD (a) =>
      _mm256_cosd_pd(f(a))
    case MM256_COSD_PS (a) =>
      _mm256_cosd_ps(f(a))
    case MM256_COSH_PD (a) =>
      _mm256_cosh_pd(f(a))
    case MM256_COSH_PS (a) =>
      _mm256_cosh_ps(f(a))
    case MM256_CSQRT_PS (a) =>
      _mm256_csqrt_ps(f(a))
    case MM256_DIV_EPI8 (a, b) =>
      _mm256_div_epi8(f(a), f(b))
    case MM256_DIV_EPI16 (a, b) =>
      _mm256_div_epi16(f(a), f(b))
    case MM256_DIV_EPI32 (a, b) =>
      _mm256_div_epi32(f(a), f(b))
    case MM256_DIV_EPI64 (a, b) =>
      _mm256_div_epi64(f(a), f(b))
    case MM256_DIV_EPU8 (a, b) =>
      _mm256_div_epu8(f(a), f(b))
    case MM256_DIV_EPU16 (a, b) =>
      _mm256_div_epu16(f(a), f(b))
    case MM256_DIV_EPU32 (a, b) =>
      _mm256_div_epu32(f(a), f(b))
    case MM256_DIV_EPU64 (a, b) =>
      _mm256_div_epu64(f(a), f(b))
    case MM256_ERF_PD (a) =>
      _mm256_erf_pd(f(a))
    case MM256_ERF_PS (a) =>
      _mm256_erf_ps(f(a))
    case MM256_ERFC_PD (a) =>
      _mm256_erfc_pd(f(a))
    case MM256_ERFC_PS (a) =>
      _mm256_erfc_ps(f(a))
    case MM256_ERFCINV_PD (a) =>
      _mm256_erfcinv_pd(f(a))
    case MM256_ERFCINV_PS (a) =>
      _mm256_erfcinv_ps(f(a))
    case MM256_ERFINV_PD (a) =>
      _mm256_erfinv_pd(f(a))
    case MM256_ERFINV_PS (a) =>
      _mm256_erfinv_ps(f(a))
    case MM256_EXP_PD (a) =>
      _mm256_exp_pd(f(a))
    case MM256_EXP_PS (a) =>
      _mm256_exp_ps(f(a))
    case MM256_EXP10_PD (a) =>
      _mm256_exp10_pd(f(a))
    case MM256_EXP10_PS (a) =>
      _mm256_exp10_ps(f(a))
    case MM256_EXP2_PD (a) =>
      _mm256_exp2_pd(f(a))
    case MM256_EXP2_PS (a) =>
      _mm256_exp2_ps(f(a))
    case MM256_EXPM1_PD (a) =>
      _mm256_expm1_pd(f(a))
    case MM256_EXPM1_PS (a) =>
      _mm256_expm1_ps(f(a))
    case MM256_HYPOT_PD (a, b) =>
      _mm256_hypot_pd(f(a), f(b))
    case MM256_HYPOT_PS (a, b) =>
      _mm256_hypot_ps(f(a), f(b))
    case MM256_IDIV_EPI32 (a, b) =>
      _mm256_idiv_epi32(f(a), f(b))
    case iDef@MM256_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset) =>
      _mm256_idivrem_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_INVCBRT_PD (a) =>
      _mm256_invcbrt_pd(f(a))
    case MM256_INVCBRT_PS (a) =>
      _mm256_invcbrt_ps(f(a))
    case MM256_INVSQRT_PD (a) =>
      _mm256_invsqrt_pd(f(a))
    case MM256_INVSQRT_PS (a) =>
      _mm256_invsqrt_ps(f(a))
    case MM256_IREM_EPI32 (a, b) =>
      _mm256_irem_epi32(f(a), f(b))
    case MM256_LOG_PD (a) =>
      _mm256_log_pd(f(a))
    case MM256_LOG_PS (a) =>
      _mm256_log_ps(f(a))
    case MM256_LOG10_PD (a) =>
      _mm256_log10_pd(f(a))
    case MM256_LOG10_PS (a) =>
      _mm256_log10_ps(f(a))

    case Reflect(MM_ACOS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ACOS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ACOS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ACOS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ACOSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ACOSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ACOSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ACOSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ASIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ASIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ASIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ASIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ASINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ASINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ASINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ASINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ATAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ATAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATAN2_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ATAN2_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATAN2_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_ATAN2_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ATANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ATANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ATANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CDFNORM_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CDFNORM_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CDFNORM_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CDFNORM_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CDFNORMINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_CDFNORMINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CDFNORMINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CDFNORMINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CLOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CLOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_COS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_COS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_COSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COSD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_COSD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_COSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_COSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_COSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_CSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_DIV_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERF_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERF_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERF_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ERF_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFCINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFCINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFCINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFCINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ERFINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_ERFINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXP2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_EXP2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXPM1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_EXPM1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_EXPM1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_EXPM1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HYPOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HYPOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HYPOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HYPOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_IDIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_IDIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_IDIVREM_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INVCBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_INVCBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INVCBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_INVCBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INVSQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_INVSQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_INVSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_INVSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_IREM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_IREM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG1P_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG1P_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG1P_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG1P_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOG2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOG2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOGB_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_LOGB_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_LOGB_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_LOGB_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_POW_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_POW_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_POW_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_POW_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_REM_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_REM_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_SINCOS_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_SINCOS_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_SINCOS_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_SINCOS_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SIND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SIND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_CEIL_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_CEIL_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_ROUND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_ROUND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_ROUND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_ROUND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SVML_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_SVML_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_TAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TAND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_TAND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TAND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_TAND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_TANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_TANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TRUNC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM_TRUNC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TRUNC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM_TRUNC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UDIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UDIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_UDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM_UDIVREM_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_UREM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_UREM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ACOS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ACOS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ACOS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ACOS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ACOSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ACOSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ACOSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ACOSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ASIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ASIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ASIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ASIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ASINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ASINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ASINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ASINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ATAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ATAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATAN2_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ATAN2_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATAN2_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_ATAN2_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ATANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ATANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ATANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CDFNORM_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CDFNORM_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CDFNORM_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CDFNORM_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CDFNORMINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_CDFNORMINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CDFNORMINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CDFNORMINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CEXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CEXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CLOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CLOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_COS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_COS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_COSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COSD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_COSD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_COSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_COSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_COSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_CSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_CSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_DIV_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_DIV_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERF_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERF_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERF_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERF_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFCINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFCINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFCINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFCINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_ERFINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_ERFINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXP2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXP2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXPM1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXPM1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_EXPM1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_EXPM1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HYPOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HYPOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_HYPOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_HYPOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_IDIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_IDIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_IDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_IDIVREM_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INVCBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_INVCBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INVCBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_INVCBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INVSQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_INVSQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_INVSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_INVSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_IREM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_IREM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSVML00 extends CGenIntrinsics {

  val IR: SVML
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_ACOS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_acos_pd(${quote(a)})")
    case iDef@MM_ACOS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_acos_ps(${quote(a)})")
    case iDef@MM_ACOSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_acosh_pd(${quote(a)})")
    case iDef@MM_ACOSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_acosh_ps(${quote(a)})")
    case iDef@MM_ASIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_asin_pd(${quote(a)})")
    case iDef@MM_ASIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_asin_ps(${quote(a)})")
    case iDef@MM_ASINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_asinh_pd(${quote(a)})")
    case iDef@MM_ASINH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_asinh_ps(${quote(a)})")
    case iDef@MM_ATAN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atan_pd(${quote(a)})")
    case iDef@MM_ATAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atan_ps(${quote(a)})")
    case iDef@MM_ATAN2_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atan2_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_ATAN2_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atan2_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_ATANH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atanh_pd(${quote(a)})")
    case iDef@MM_ATANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_atanh_ps(${quote(a)})")
    case iDef@MM_CBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cbrt_pd(${quote(a)})")
    case iDef@MM_CBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cbrt_ps(${quote(a)})")
    case iDef@MM_CDFNORM_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cdfnorm_pd(${quote(a)})")
    case iDef@MM_CDFNORM_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cdfnorm_ps(${quote(a)})")
    case iDef@MM_CDFNORMINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cdfnorminv_pd(${quote(a)})")
    case iDef@MM_CDFNORMINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cdfnorminv_ps(${quote(a)})")
    case iDef@MM_CEXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cexp_ps(${quote(a)})")
    case iDef@MM_CLOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_clog_ps(${quote(a)})")
    case iDef@MM_COS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cos_pd(${quote(a)})")
    case iDef@MM_COS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cos_ps(${quote(a)})")
    case iDef@MM_COSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cosd_pd(${quote(a)})")
    case iDef@MM_COSD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cosd_ps(${quote(a)})")
    case iDef@MM_COSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cosh_pd(${quote(a)})")
    case iDef@MM_COSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cosh_ps(${quote(a)})")
    case iDef@MM_CSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_csqrt_ps(${quote(a)})")
    case iDef@MM_DIV_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM_ERF_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erf_pd(${quote(a)})")
    case iDef@MM_ERF_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erf_ps(${quote(a)})")
    case iDef@MM_ERFC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfc_pd(${quote(a)})")
    case iDef@MM_ERFC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfc_ps(${quote(a)})")
    case iDef@MM_ERFCINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfcinv_pd(${quote(a)})")
    case iDef@MM_ERFCINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfcinv_ps(${quote(a)})")
    case iDef@MM_ERFINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfinv_pd(${quote(a)})")
    case iDef@MM_ERFINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_erfinv_ps(${quote(a)})")
    case iDef@MM_EXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp_pd(${quote(a)})")
    case iDef@MM_EXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp_ps(${quote(a)})")
    case iDef@MM_EXP10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp10_pd(${quote(a)})")
    case iDef@MM_EXP10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp10_ps(${quote(a)})")
    case iDef@MM_EXP2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp2_pd(${quote(a)})")
    case iDef@MM_EXP2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_exp2_ps(${quote(a)})")
    case iDef@MM_EXPM1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_expm1_pd(${quote(a)})")
    case iDef@MM_EXPM1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_expm1_ps(${quote(a)})")
    case iDef@MM_HYPOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hypot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_HYPOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hypot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_IDIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_idiv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_idivrem_epi32((__m128i *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_INVCBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_invcbrt_pd(${quote(a)})")
    case iDef@MM_INVCBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_invcbrt_ps(${quote(a)})")
    case iDef@MM_INVSQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_invsqrt_pd(${quote(a)})")
    case iDef@MM_INVSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_invsqrt_ps(${quote(a)})")
    case iDef@MM_IREM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_irem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_LOG_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log_pd(${quote(a)})")
    case iDef@MM_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log_ps(${quote(a)})")
    case iDef@MM_LOG10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log10_pd(${quote(a)})")
    case iDef@MM_LOG10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log10_ps(${quote(a)})")
    case iDef@MM_LOG1P_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log1p_pd(${quote(a)})")
    case iDef@MM_LOG1P_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log1p_ps(${quote(a)})")
    case iDef@MM_LOG2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log2_pd(${quote(a)})")
    case iDef@MM_LOG2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_log2_ps(${quote(a)})")
    case iDef@MM_LOGB_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_logb_pd(${quote(a)})")
    case iDef@MM_LOGB_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_logb_ps(${quote(a)})")
    case iDef@MM_POW_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_pow_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM_POW_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_pow_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM_REM_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_rem_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM_SIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sin_pd(${quote(a)})")
    case iDef@MM_SIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sin_ps(${quote(a)})")
    case iDef@MM_SINCOS_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sincos_pd((__m128d *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)})")
    case iDef@MM_SINCOS_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sincos_ps((__m128 *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)})")
    case iDef@MM_SIND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sind_pd(${quote(a)})")
    case iDef@MM_SIND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sind_ps(${quote(a)})")
    case iDef@MM_SINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sinh_pd(${quote(a)})")
    case iDef@MM_SINH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sinh_ps(${quote(a)})")
    case iDef@MM_SVML_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_ceil_pd(${quote(a)})")
    case iDef@MM_SVML_CEIL_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_ceil_ps(${quote(a)})")
    case iDef@MM_SVML_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_floor_pd(${quote(a)})")
    case iDef@MM_SVML_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_floor_ps(${quote(a)})")
    case iDef@MM_SVML_ROUND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_round_pd(${quote(a)})")
    case iDef@MM_SVML_ROUND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_round_ps(${quote(a)})")
    case iDef@MM_SVML_SQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_sqrt_pd(${quote(a)})")
    case iDef@MM_SVML_SQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_svml_sqrt_ps(${quote(a)})")
    case iDef@MM_TAN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tan_pd(${quote(a)})")
    case iDef@MM_TAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tan_ps(${quote(a)})")
    case iDef@MM_TAND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tand_pd(${quote(a)})")
    case iDef@MM_TAND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tand_ps(${quote(a)})")
    case iDef@MM_TANH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tanh_pd(${quote(a)})")
    case iDef@MM_TANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tanh_ps(${quote(a)})")
    case iDef@MM_TRUNC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_trunc_pd(${quote(a)})")
    case iDef@MM_TRUNC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_trunc_ps(${quote(a)})")
    case iDef@MM_UDIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_udiv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_UDIVREM_EPI32(mem_addr, a, b, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_udivrem_epi32((__m128i *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_UREM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_urem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ACOS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_acos_pd(${quote(a)})")
    case iDef@MM256_ACOS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_acos_ps(${quote(a)})")
    case iDef@MM256_ACOSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_acosh_pd(${quote(a)})")
    case iDef@MM256_ACOSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_acosh_ps(${quote(a)})")
    case iDef@MM256_ASIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_asin_pd(${quote(a)})")
    case iDef@MM256_ASIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_asin_ps(${quote(a)})")
    case iDef@MM256_ASINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_asinh_pd(${quote(a)})")
    case iDef@MM256_ASINH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_asinh_ps(${quote(a)})")
    case iDef@MM256_ATAN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atan_pd(${quote(a)})")
    case iDef@MM256_ATAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atan_ps(${quote(a)})")
    case iDef@MM256_ATAN2_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atan2_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ATAN2_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atan2_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ATANH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atanh_pd(${quote(a)})")
    case iDef@MM256_ATANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_atanh_ps(${quote(a)})")
    case iDef@MM256_CBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cbrt_pd(${quote(a)})")
    case iDef@MM256_CBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cbrt_ps(${quote(a)})")
    case iDef@MM256_CDFNORM_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cdfnorm_pd(${quote(a)})")
    case iDef@MM256_CDFNORM_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cdfnorm_ps(${quote(a)})")
    case iDef@MM256_CDFNORMINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cdfnorminv_pd(${quote(a)})")
    case iDef@MM256_CDFNORMINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cdfnorminv_ps(${quote(a)})")
    case iDef@MM256_CEXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cexp_ps(${quote(a)})")
    case iDef@MM256_CLOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_clog_ps(${quote(a)})")
    case iDef@MM256_COS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cos_pd(${quote(a)})")
    case iDef@MM256_COS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cos_ps(${quote(a)})")
    case iDef@MM256_COSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cosd_pd(${quote(a)})")
    case iDef@MM256_COSD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cosd_ps(${quote(a)})")
    case iDef@MM256_COSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cosh_pd(${quote(a)})")
    case iDef@MM256_COSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_cosh_ps(${quote(a)})")
    case iDef@MM256_CSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_csqrt_ps(${quote(a)})")
    case iDef@MM256_DIV_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_DIV_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_div_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_ERF_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erf_pd(${quote(a)})")
    case iDef@MM256_ERF_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erf_ps(${quote(a)})")
    case iDef@MM256_ERFC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfc_pd(${quote(a)})")
    case iDef@MM256_ERFC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfc_ps(${quote(a)})")
    case iDef@MM256_ERFCINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfcinv_pd(${quote(a)})")
    case iDef@MM256_ERFCINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfcinv_ps(${quote(a)})")
    case iDef@MM256_ERFINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfinv_pd(${quote(a)})")
    case iDef@MM256_ERFINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_erfinv_ps(${quote(a)})")
    case iDef@MM256_EXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp_pd(${quote(a)})")
    case iDef@MM256_EXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp_ps(${quote(a)})")
    case iDef@MM256_EXP10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp10_pd(${quote(a)})")
    case iDef@MM256_EXP10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp10_ps(${quote(a)})")
    case iDef@MM256_EXP2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp2_pd(${quote(a)})")
    case iDef@MM256_EXP2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_exp2_ps(${quote(a)})")
    case iDef@MM256_EXPM1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_expm1_pd(${quote(a)})")
    case iDef@MM256_EXPM1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_expm1_ps(${quote(a)})")
    case iDef@MM256_HYPOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hypot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_HYPOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_hypot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_IDIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_idiv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_IDIVREM_EPI32(mem_addr, a, b, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_idivrem_epi32((__m256i *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_INVCBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_invcbrt_pd(${quote(a)})")
    case iDef@MM256_INVCBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_invcbrt_ps(${quote(a)})")
    case iDef@MM256_INVSQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_invsqrt_pd(${quote(a)})")
    case iDef@MM256_INVSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_invsqrt_ps(${quote(a)})")
    case iDef@MM256_IREM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_irem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_LOG_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log_pd(${quote(a)})")
    case iDef@MM256_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log_ps(${quote(a)})")
    case iDef@MM256_LOG10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log10_pd(${quote(a)})")
    case iDef@MM256_LOG10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log10_ps(${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
