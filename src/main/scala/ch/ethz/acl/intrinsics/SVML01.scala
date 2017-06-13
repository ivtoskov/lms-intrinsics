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

    
trait SVML01 extends IntrinsicsBase {
  /**
   * Compute the natural logarithm of one plus packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_LOG1P_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_LOG1P_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256d
   */
  case class MM256_LOG2_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m256
   */
  case class MM256_LOG2_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * a: __m256d
   */
  case class MM256_LOGB_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * a: __m256
   */
  case class MM256_LOGB_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of packed double-precision (64-bit)
   * floating-point elements in "a" raised by packed elements in "b", and store the
   * results in "dst".
   * a: __m256d, b: __m256d
   */
  case class MM256_POW_PD(a: Exp[__m256d], b: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPI8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPI16(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPI64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 8-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPU8(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPU32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 64-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_REM_EPU64(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_SIN_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_SIN_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine and cosine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, store the sine in "dst", and store the
   * cosine into memory at "mem_addr".
   * mem_addr: __m256d *, a: __m256d, mem_addrOffset: int
   */
  case class MM256_SINCOS_PD[A[_], U:Integral](mem_addr: Exp[A[__m256d]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine and cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, store the sine in "dst", and store the
   * cosine into memory at "mem_addr".
   * mem_addr: __m256 *, a: __m256, mem_addrOffset: int
   */
  case class MM256_SINCOS_PS[A[_], U:Integral](mem_addr: Exp[A[__m256]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_SIND_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the sine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m256
   */
  case class MM256_SIND_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * Compute the hyperbolic sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256
   */
  case class MM256_SINH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * a: __m256d
   */
  case class MM256_SVML_CEIL_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * a: __m256
   */
  case class MM256_SVML_CEIL_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * a: __m256d
   */
  case class MM256_SVML_FLOOR_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * a: __m256
   */
  case class MM256_SVML_FLOOR_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
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
   * a: __m256d
   */
  case class MM256_SVML_ROUND_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
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
   * a: __m256
   */
  case class MM256_SVML_ROUND_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst". Note that this intrinsic is
   * less efficient than "_mm_sqrt_pd".
   * a: __m256d
   */
  case class MM256_SVML_SQRT_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the square root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst". Note that this intrinsic is
   * less efficient than "_mm_sqrt_ps".
   * a: __m256
   */
  case class MM256_SVML_SQRT_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_TAN_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

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
   * Compute the tangent of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m256d
   */
  case class MM256_TAND_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in degrees, and store the results in "dst".
   * a: __m256
   */
  case class MM256_TAND_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256d
   */
  case class MM256_TANH_PD(a: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m256
   */
  case class MM256_TANH_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Trigonometry)
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
   * Truncate the packed single-precision (32-bit) floating-point elements in "a",
   * and store the results as packed single-precision floating-point elements in
   * "dst". This intrinsic may generate the "roundps"/"vroundps" instruction.
   * a: __m256
   */
  case class MM256_TRUNC_PS(a: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the truncated results in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UDIV_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", store
   * the truncated results in "dst", and store the remainders as packed unsigned
   * 32-bit integers into memory at "mem_addr".
   * mem_addr: __m256i *, a: __m256i, b: __m256i, mem_addrOffset: int
   */
  case class MM256_UDIVREM_EPI32[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], b: Exp[__m256i], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed unsigned 32-bit integers in "a" by packed elements in "b", and
   * store the remainders as packed unsigned 32-bit integers in "dst".
   * a: __m256i, b: __m256i
   */
  case class MM256_UREM_EPI32(a: Exp[__m256i], b: Exp[__m256i]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ACOS_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ACOS_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_ACOS_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cosine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ACOS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_ACOSH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
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
   * Compute the inverse hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_ACOSH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ACOSH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ASIN_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed double-precision (64-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ASIN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_ASIN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse sine of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ASIN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
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
   * Compute the inverse hyperbolic sine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ASINH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_ASINH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic sine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ASINH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m512d, b: __m512d
   */
  case class MM512_ATAN2_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_ATAN2_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians.
   * a: __m512, b: __m512
   */
  case class MM512_ATAN2_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" divided by packed elements in "b", and store the results in
   * "dst" expressed in radians using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_ATAN2_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a" and store the results in "dst" expressed in radians.
   * a: __m512d
   */
  case class MM512_ATAN_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" expressed in radians using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ATAN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" expressed in radians.
   * a: __m512
   */
  case class MM512_ATAN_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse tangent of packed single-precision (32-bit) floating-point
   * elements in "a" expressed in radians, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ATAN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a" and store the results in "dst" expressed in
   * radians.
   * a: __m512d
   */
  case class MM512_ATANH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" expressed in
   * radians using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ATANH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperblic tangent of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" expressed in
   * radians.
   * a: __m512
   */
  case class MM512_ATANH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse hyperbolic tangent of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ATANH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Compute the cube root of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CBRT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the cube root of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CBRT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed double-precision
   * (64-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m512d
   */
  case class MM512_CDFNORM_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed double-precision
   * (64-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CDFNORM_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed single-precision
   * (32-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst".
   * a: __m512
   */
  case class MM512_CDFNORM_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cumulative distribution function of packed single-precision
   * (32-bit) floating-point elements in "a" using the normal distribution, and
   * store the results in "dst" using writemask "k" (elements are copied from "src"
   * when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CDFNORM_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * double-precision (64-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_CDFNORMINV_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * double-precision (64-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CDFNORMINV_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * single-precision (32-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst".
   * a: __m512
   */
  case class MM512_CDFNORMINV_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse cumulative distribution function of packed
   * single-precision (32-bit) floating-point elements in "a" using the normal
   * distribution, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CDFNORMINV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512d
   */
  case class MM512_CEIL_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed double-precision (64-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_CEIL_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst".
   * a: __m512
   */
  case class MM512_CEIL_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" up
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CEIL_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
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
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in radians, and store the results in "dst".
   * a: __m512
   */
  case class MM512_COS_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
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
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_COSD_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed double-precision (64-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_COSD_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst".
   * a: __m512
   */
  case class MM512_COSD_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the cosine of packed single-precision (32-bit) floating-point elements
   * in "a" expressed in degrees, and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_COSD_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512d
   */
  case class MM512_COSH_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed double-precision (64-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_COSH_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_COSH_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the hyperbolic cosine of packed single-precision (32-bit)
   * floating-point elements in "a" expressed in radians, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_COSH_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Trigonometry)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ERF_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed double-precision (64-bit) floating-point
   * elements in "a", and store the results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ERF_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ERFC_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ERFC_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the error function of packed single-precision (32-bit) floating-point
   * elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_ERF_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the complementary error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_ERFC_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the complementary error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ERFC_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_ERFINV_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ERFINV_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_ERFINV_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse error function of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ERFINV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
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
   * Compute the inverse complementary error function of packed double-precision
   * (64-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_ERFCINV_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_ERFCINV_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse complementary error function of packed single-precision
   * (32-bit) floating-point elements in "a", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_ERFCINV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ProbabilityStatistics)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512d
   */
  case class MM512_EXP10_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the exponential value of 10 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512
   */
  case class MM512_EXP10_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 10 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXP10_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512d
   */
  case class MM512_EXP2_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_EXP2_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512
   */
  case class MM512_EXP2_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of 2 raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXP2_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512d
   */
  case class MM512_EXP_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_EXP_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst".
   * a: __m512
   */
  case class MM512_EXP_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", and store the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXP_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m512d
   */
  case class MM512_EXPM1_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * double-precision (64-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_EXPM1_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst".
   * a: __m512
   */
  case class MM512_EXPM1_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the exponential value of "e" raised to the power of packed
   * single-precision (32-bit) floating-point elements in "a", subtract one from
   * each element, and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXPM1_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Round the packed double-precision (64-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed double-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_FLOOR_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Round the packed single-precision (32-bit) floating-point elements in "a" down
   * to an integer value, and store the results as packed single-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_FLOOR_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed double-precision (64-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_HYPOT_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed double-precision (64-bit)
   * floating-point elements in "a" and "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_HYPOT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed single-precision (32-bit)
   * floating-point elements in "a" and "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_HYPOT_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the length of the hypotenous of a right triangle, with the lengths of
   * the other two sides of the triangle stored as packed single-precision (32-bit)
   * floating-point elements in "a" and "b", and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_HYPOT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 16-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPI16(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * truncated results in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_DIV_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_INVSQRT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_INVSQRT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the inverse square root of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_INVSQRT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 32-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_REM_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed 8-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPI8(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Divide packed 64-bit integers in "a" by packed elements in "b", and store the
   * remainders as packed 32-bit integers in "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_REM_EPI64(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_LOG10_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_LOG10_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_LOG10_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-10 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG10_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_LOG1P_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_LOG1P_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_LOG1P_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of one plus packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG1P_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_LOG2_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_LOG2_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the natural logarithm of packed double-precision (64-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512d
   */
  case class MM512_LOG_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Compute the natural logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
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
   * a: __m512d
   */
  case class MM512_LOGB_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
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
   * Convert the exponent of each packed single-precision (32-bit) floating-point
   * element in "a" to a single-precision floating-point number representing the
   * integer exponent, and store the results in "dst". This intrinsic essentially
   * calculates "floor(log2(x))" for each element.
   * a: __m512
   */
  case class MM512_LOGB_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Rounds each packed double-precision (64-bit) floating-point element in "a" to
   * the nearest integer value and stores the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512d
   */
  case class MM512_NEARBYINT_PD(a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds each packed double-precision (64-bit) floating-point element in "a" to
   * the nearest integer value and stores the results as packed double-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d
   */
  case class MM512_MASK_NEARBYINT_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds each packed single-precision (32-bit) floating-point element in "a" to
   * the nearest integer value and stores the results as packed double-precision
   * floating-point elements in "dst".
   * a: __m512
   */
  case class MM512_NEARBYINT_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Rounds each packed single-precision (32-bit) floating-point element in "a" to
   * the nearest integer value and stores the results as packed double-precision
   * floating-point elements in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_NEARBYINT_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_log1p_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_LOG1P_PD(a)
  }
            
  def _mm256_log1p_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOG1P_PS(a)
  }
            
  def _mm256_log2_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_LOG2_PD(a)
  }
            
  def _mm256_log2_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOG2_PS(a)
  }
            
  def _mm256_logb_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_LOGB_PD(a)
  }
            
  def _mm256_logb_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_LOGB_PS(a)
  }
            
  def _mm256_pow_pd(a: Exp[__m256d], b: Exp[__m256d]): Exp[__m256d] = {
    MM256_POW_PD(a, b)
  }
            
  def _mm256_pow_ps(a: Exp[__m256], b: Exp[__m256]): Exp[__m256] = {
    MM256_POW_PS(a, b)
  }
            
  def _mm256_rem_epi8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPI8(a, b)
  }
            
  def _mm256_rem_epi16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPI16(a, b)
  }
            
  def _mm256_rem_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPI32(a, b)
  }
            
  def _mm256_rem_epi64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPI64(a, b)
  }
            
  def _mm256_rem_epu8(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPU8(a, b)
  }
            
  def _mm256_rem_epu16(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPU16(a, b)
  }
            
  def _mm256_rem_epu32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPU32(a, b)
  }
            
  def _mm256_rem_epu64(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_REM_EPU64(a, b)
  }
            
  def _mm256_sin_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SIN_PD(a)
  }
            
  def _mm256_sin_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SIN_PS(a)
  }
            
  def _mm256_sincos_pd[A[_], U:Integral](mem_addr: Exp[A[__m256d]], a: Exp[__m256d], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256d] = {
    cont.write(mem_addr)(MM256_SINCOS_PD(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sincos_ps[A[_], U:Integral](mem_addr: Exp[A[__m256]], a: Exp[__m256], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256] = {
    cont.write(mem_addr)(MM256_SINCOS_PS(mem_addr, a, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_sind_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SIND_PD(a)
  }
            
  def _mm256_sind_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SIND_PS(a)
  }
            
  def _mm256_sinh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SINH_PD(a)
  }
            
  def _mm256_sinh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SINH_PS(a)
  }
            
  def _mm256_svml_ceil_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SVML_CEIL_PD(a)
  }
            
  def _mm256_svml_ceil_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SVML_CEIL_PS(a)
  }
            
  def _mm256_svml_floor_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SVML_FLOOR_PD(a)
  }
            
  def _mm256_svml_floor_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SVML_FLOOR_PS(a)
  }
            
  def _mm256_svml_round_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SVML_ROUND_PD(a)
  }
            
  def _mm256_svml_round_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SVML_ROUND_PS(a)
  }
            
  def _mm256_svml_sqrt_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_SVML_SQRT_PD(a)
  }
            
  def _mm256_svml_sqrt_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_SVML_SQRT_PS(a)
  }
            
  def _mm256_tan_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_TAN_PD(a)
  }
            
  def _mm256_tan_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_TAN_PS(a)
  }
            
  def _mm256_tand_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_TAND_PD(a)
  }
            
  def _mm256_tand_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_TAND_PS(a)
  }
            
  def _mm256_tanh_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_TANH_PD(a)
  }
            
  def _mm256_tanh_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_TANH_PS(a)
  }
            
  def _mm256_trunc_pd(a: Exp[__m256d]): Exp[__m256d] = {
    MM256_TRUNC_PD(a)
  }
            
  def _mm256_trunc_ps(a: Exp[__m256]): Exp[__m256] = {
    MM256_TRUNC_PS(a)
  }
            
  def _mm256_udiv_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UDIV_EPI32(a, b)
  }
            
  def _mm256_udivrem_epi32[A[_], U:Integral](mem_addr: Exp[A[__m256i]], a: Exp[__m256i], b: Exp[__m256i], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m256i] = {
    cont.write(mem_addr)(MM256_UDIVREM_EPI32(mem_addr, a, b, mem_addrOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm256_urem_epi32(a: Exp[__m256i], b: Exp[__m256i]): Exp[__m256i] = {
    MM256_UREM_EPI32(a, b)
  }
            
  def _mm512_acos_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ACOS_PD(a)
  }
            
  def _mm512_mask_acos_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ACOS_PD(src, k, a)
  }
            
  def _mm512_acos_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ACOS_PS(a)
  }
            
  def _mm512_mask_acos_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ACOS_PS(src, k, a)
  }
            
  def _mm512_acosh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ACOSH_PD(a)
  }
            
  def _mm512_mask_acosh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ACOSH_PD(src, k, a)
  }
            
  def _mm512_acosh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ACOSH_PS(a)
  }
            
  def _mm512_mask_acosh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ACOSH_PS(src, k, a)
  }
            
  def _mm512_asin_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ASIN_PD(a)
  }
            
  def _mm512_mask_asin_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ASIN_PD(src, k, a)
  }
            
  def _mm512_asin_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ASIN_PS(a)
  }
            
  def _mm512_mask_asin_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ASIN_PS(src, k, a)
  }
            
  def _mm512_asinh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ASINH_PD(a)
  }
            
  def _mm512_mask_asinh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ASINH_PD(src, k, a)
  }
            
  def _mm512_asinh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ASINH_PS(a)
  }
            
  def _mm512_mask_asinh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ASINH_PS(src, k, a)
  }
            
  def _mm512_atan2_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_ATAN2_PD(a, b)
  }
            
  def _mm512_mask_atan2_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ATAN2_PD(src, k, a, b)
  }
            
  def _mm512_atan2_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_ATAN2_PS(a, b)
  }
            
  def _mm512_mask_atan2_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ATAN2_PS(src, k, a, b)
  }
            
  def _mm512_atan_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ATAN_PD(a)
  }
            
  def _mm512_mask_atan_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ATAN_PD(src, k, a)
  }
            
  def _mm512_atan_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ATAN_PS(a)
  }
            
  def _mm512_mask_atan_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ATAN_PS(src, k, a)
  }
            
  def _mm512_atanh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ATANH_PD(a)
  }
            
  def _mm512_mask_atanh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ATANH_PD(src, k, a)
  }
            
  def _mm512_atanh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ATANH_PS(a)
  }
            
  def _mm512_mask_atanh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ATANH_PS(src, k, a)
  }
            
  def _mm512_cbrt_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_CBRT_PD(a)
  }
            
  def _mm512_mask_cbrt_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_CBRT_PD(src, k, a)
  }
            
  def _mm512_cbrt_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_CBRT_PS(a)
  }
            
  def _mm512_mask_cbrt_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_CBRT_PS(src, k, a)
  }
            
  def _mm512_cdfnorm_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_CDFNORM_PD(a)
  }
            
  def _mm512_mask_cdfnorm_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_CDFNORM_PD(src, k, a)
  }
            
  def _mm512_cdfnorm_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_CDFNORM_PS(a)
  }
            
  def _mm512_mask_cdfnorm_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_CDFNORM_PS(src, k, a)
  }
            
  def _mm512_cdfnorminv_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_CDFNORMINV_PD(a)
  }
            
  def _mm512_mask_cdfnorminv_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_CDFNORMINV_PD(src, k, a)
  }
            
  def _mm512_cdfnorminv_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_CDFNORMINV_PS(a)
  }
            
  def _mm512_mask_cdfnorminv_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_CDFNORMINV_PS(src, k, a)
  }
            
  def _mm512_ceil_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_CEIL_PD(a)
  }
            
  def _mm512_mask_ceil_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_CEIL_PD(src, k, a)
  }
            
  def _mm512_ceil_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_CEIL_PS(a)
  }
            
  def _mm512_mask_ceil_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_CEIL_PS(src, k, a)
  }
            
  def _mm512_cos_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_COS_PD(a)
  }
            
  def _mm512_mask_cos_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COS_PD(src, k, a)
  }
            
  def _mm512_cos_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_COS_PS(a)
  }
            
  def _mm512_mask_cos_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COS_PS(src, k, a)
  }
            
  def _mm512_cosd_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_COSD_PD(a)
  }
            
  def _mm512_mask_cosd_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COSD_PD(src, k, a)
  }
            
  def _mm512_cosd_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_COSD_PS(a)
  }
            
  def _mm512_mask_cosd_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COSD_PS(src, k, a)
  }
            
  def _mm512_cosh_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_COSH_PD(a)
  }
            
  def _mm512_mask_cosh_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_COSH_PD(src, k, a)
  }
            
  def _mm512_cosh_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_COSH_PS(a)
  }
            
  def _mm512_mask_cosh_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_COSH_PS(src, k, a)
  }
            
  def _mm512_erf_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ERF_PD(a)
  }
            
  def _mm512_mask_erf_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ERF_PD(src, k, a)
  }
            
  def _mm512_erfc_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ERFC_PD(a)
  }
            
  def _mm512_mask_erfc_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ERFC_PD(src, k, a)
  }
            
  def _mm512_erf_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ERF_PS(a)
  }
            
  def _mm512_mask_erf_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ERF_PS(src, k, a)
  }
            
  def _mm512_erfc_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ERFC_PS(a)
  }
            
  def _mm512_mask_erfc_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ERFC_PS(src, k, a)
  }
            
  def _mm512_erfinv_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ERFINV_PD(a)
  }
            
  def _mm512_mask_erfinv_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ERFINV_PD(src, k, a)
  }
            
  def _mm512_erfinv_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ERFINV_PS(a)
  }
            
  def _mm512_mask_erfinv_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ERFINV_PS(src, k, a)
  }
            
  def _mm512_erfcinv_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_ERFCINV_PD(a)
  }
            
  def _mm512_mask_erfcinv_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_ERFCINV_PD(src, k, a)
  }
            
  def _mm512_erfcinv_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_ERFCINV_PS(a)
  }
            
  def _mm512_mask_erfcinv_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_ERFCINV_PS(src, k, a)
  }
            
  def _mm512_exp10_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXP10_PD(a)
  }
            
  def _mm512_mask_exp10_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP10_PD(src, k, a)
  }
            
  def _mm512_exp10_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXP10_PS(a)
  }
            
  def _mm512_mask_exp10_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXP10_PS(src, k, a)
  }
            
  def _mm512_exp2_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXP2_PD(a)
  }
            
  def _mm512_mask_exp2_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP2_PD(src, k, a)
  }
            
  def _mm512_exp2_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXP2_PS(a)
  }
            
  def _mm512_mask_exp2_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXP2_PS(src, k, a)
  }
            
  def _mm512_exp_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXP_PD(a)
  }
            
  def _mm512_mask_exp_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXP_PD(src, k, a)
  }
            
  def _mm512_exp_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXP_PS(a)
  }
            
  def _mm512_mask_exp_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXP_PS(src, k, a)
  }
            
  def _mm512_expm1_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_EXPM1_PD(a)
  }
            
  def _mm512_mask_expm1_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXPM1_PD(src, k, a)
  }
            
  def _mm512_expm1_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_EXPM1_PS(a)
  }
            
  def _mm512_mask_expm1_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXPM1_PS(src, k, a)
  }
            
  def _mm512_floor_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_FLOOR_PD(a)
  }
            
  def _mm512_mask_floor_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FLOOR_PD(src, k, a)
  }
            
  def _mm512_floor_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_FLOOR_PS(a)
  }
            
  def _mm512_mask_floor_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FLOOR_PS(src, k, a)
  }
            
  def _mm512_hypot_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_HYPOT_PD(a, b)
  }
            
  def _mm512_mask_hypot_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_HYPOT_PD(src, k, a, b)
  }
            
  def _mm512_hypot_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_HYPOT_PS(a, b)
  }
            
  def _mm512_mask_hypot_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_HYPOT_PS(src, k, a, b)
  }
            
  def _mm512_div_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPI32(a, b)
  }
            
  def _mm512_mask_div_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_DIV_EPI32(src, k, a, b)
  }
            
  def _mm512_div_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPI8(a, b)
  }
            
  def _mm512_div_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPI16(a, b)
  }
            
  def _mm512_div_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_DIV_EPI64(a, b)
  }
            
  def _mm512_invsqrt_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_INVSQRT_PD(a)
  }
            
  def _mm512_mask_invsqrt_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_INVSQRT_PD(src, k, a)
  }
            
  def _mm512_invsqrt_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_INVSQRT_PS(a)
  }
            
  def _mm512_mask_invsqrt_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_INVSQRT_PS(src, k, a)
  }
            
  def _mm512_rem_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPI32(a, b)
  }
            
  def _mm512_mask_rem_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_REM_EPI32(src, k, a, b)
  }
            
  def _mm512_rem_epi8(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPI8(a, b)
  }
            
  def _mm512_rem_epi16(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPI16(a, b)
  }
            
  def _mm512_rem_epi64(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_REM_EPI64(a, b)
  }
            
  def _mm512_log10_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_LOG10_PD(a)
  }
            
  def _mm512_mask_log10_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOG10_PD(src, k, a)
  }
            
  def _mm512_log10_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG10_PS(a)
  }
            
  def _mm512_mask_log10_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG10_PS(src, k, a)
  }
            
  def _mm512_log1p_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_LOG1P_PD(a)
  }
            
  def _mm512_mask_log1p_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOG1P_PD(src, k, a)
  }
            
  def _mm512_log1p_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG1P_PS(a)
  }
            
  def _mm512_mask_log1p_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG1P_PS(src, k, a)
  }
            
  def _mm512_log2_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_LOG2_PD(a)
  }
            
  def _mm512_mask_log2_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOG2_PD(src, k, a)
  }
            
  def _mm512_log_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_LOG_PD(a)
  }
            
  def _mm512_mask_log_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOG_PD(src, k, a)
  }
            
  def _mm512_log_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG_PS(a)
  }
            
  def _mm512_mask_log_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG_PS(src, k, a)
  }
            
  def _mm512_logb_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_LOGB_PD(a)
  }
            
  def _mm512_mask_logb_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_LOGB_PD(src, k, a)
  }
            
  def _mm512_logb_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOGB_PS(a)
  }
            
  def _mm512_mask_logb_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOGB_PS(src, k, a)
  }
            
  def _mm512_nearbyint_pd(a: Exp[__m512d]): Exp[__m512d] = {
    MM512_NEARBYINT_PD(a)
  }
            
  def _mm512_mask_nearbyint_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_NEARBYINT_PD(src, k, a)
  }
            
  def _mm512_nearbyint_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_NEARBYINT_PS(a)
  }
            
  def _mm512_mask_nearbyint_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_NEARBYINT_PS(src, k, a)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_LOG1P_PD (a) =>
      _mm256_log1p_pd(f(a))
    case MM256_LOG1P_PS (a) =>
      _mm256_log1p_ps(f(a))
    case MM256_LOG2_PD (a) =>
      _mm256_log2_pd(f(a))
    case MM256_LOG2_PS (a) =>
      _mm256_log2_ps(f(a))
    case MM256_LOGB_PD (a) =>
      _mm256_logb_pd(f(a))
    case MM256_LOGB_PS (a) =>
      _mm256_logb_ps(f(a))
    case MM256_POW_PD (a, b) =>
      _mm256_pow_pd(f(a), f(b))
    case MM256_POW_PS (a, b) =>
      _mm256_pow_ps(f(a), f(b))
    case MM256_REM_EPI8 (a, b) =>
      _mm256_rem_epi8(f(a), f(b))
    case MM256_REM_EPI16 (a, b) =>
      _mm256_rem_epi16(f(a), f(b))
    case MM256_REM_EPI32 (a, b) =>
      _mm256_rem_epi32(f(a), f(b))
    case MM256_REM_EPI64 (a, b) =>
      _mm256_rem_epi64(f(a), f(b))
    case MM256_REM_EPU8 (a, b) =>
      _mm256_rem_epu8(f(a), f(b))
    case MM256_REM_EPU16 (a, b) =>
      _mm256_rem_epu16(f(a), f(b))
    case MM256_REM_EPU32 (a, b) =>
      _mm256_rem_epu32(f(a), f(b))
    case MM256_REM_EPU64 (a, b) =>
      _mm256_rem_epu64(f(a), f(b))
    case MM256_SIN_PD (a) =>
      _mm256_sin_pd(f(a))
    case MM256_SIN_PS (a) =>
      _mm256_sin_ps(f(a))
    case iDef@MM256_SINCOS_PD (mem_addr, a, mem_addrOffset) =>
      _mm256_sincos_pd(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM256_SINCOS_PS (mem_addr, a, mem_addrOffset) =>
      _mm256_sincos_ps(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_SIND_PD (a) =>
      _mm256_sind_pd(f(a))
    case MM256_SIND_PS (a) =>
      _mm256_sind_ps(f(a))
    case MM256_SINH_PD (a) =>
      _mm256_sinh_pd(f(a))
    case MM256_SINH_PS (a) =>
      _mm256_sinh_ps(f(a))
    case MM256_SVML_CEIL_PD (a) =>
      _mm256_svml_ceil_pd(f(a))
    case MM256_SVML_CEIL_PS (a) =>
      _mm256_svml_ceil_ps(f(a))
    case MM256_SVML_FLOOR_PD (a) =>
      _mm256_svml_floor_pd(f(a))
    case MM256_SVML_FLOOR_PS (a) =>
      _mm256_svml_floor_ps(f(a))
    case MM256_SVML_ROUND_PD (a) =>
      _mm256_svml_round_pd(f(a))
    case MM256_SVML_ROUND_PS (a) =>
      _mm256_svml_round_ps(f(a))
    case MM256_SVML_SQRT_PD (a) =>
      _mm256_svml_sqrt_pd(f(a))
    case MM256_SVML_SQRT_PS (a) =>
      _mm256_svml_sqrt_ps(f(a))
    case MM256_TAN_PD (a) =>
      _mm256_tan_pd(f(a))
    case MM256_TAN_PS (a) =>
      _mm256_tan_ps(f(a))
    case MM256_TAND_PD (a) =>
      _mm256_tand_pd(f(a))
    case MM256_TAND_PS (a) =>
      _mm256_tand_ps(f(a))
    case MM256_TANH_PD (a) =>
      _mm256_tanh_pd(f(a))
    case MM256_TANH_PS (a) =>
      _mm256_tanh_ps(f(a))
    case MM256_TRUNC_PD (a) =>
      _mm256_trunc_pd(f(a))
    case MM256_TRUNC_PS (a) =>
      _mm256_trunc_ps(f(a))
    case MM256_UDIV_EPI32 (a, b) =>
      _mm256_udiv_epi32(f(a), f(b))
    case iDef@MM256_UDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset) =>
      _mm256_udivrem_epi32(iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont)
    case MM256_UREM_EPI32 (a, b) =>
      _mm256_urem_epi32(f(a), f(b))
    case MM512_ACOS_PD (a) =>
      _mm512_acos_pd(f(a))
    case MM512_MASK_ACOS_PD (src, k, a) =>
      _mm512_mask_acos_pd(f(src), f(k), f(a))
    case MM512_ACOS_PS (a) =>
      _mm512_acos_ps(f(a))
    case MM512_MASK_ACOS_PS (src, k, a) =>
      _mm512_mask_acos_ps(f(src), f(k), f(a))
    case MM512_ACOSH_PD (a) =>
      _mm512_acosh_pd(f(a))
    case MM512_MASK_ACOSH_PD (src, k, a) =>
      _mm512_mask_acosh_pd(f(src), f(k), f(a))
    case MM512_ACOSH_PS (a) =>
      _mm512_acosh_ps(f(a))
    case MM512_MASK_ACOSH_PS (src, k, a) =>
      _mm512_mask_acosh_ps(f(src), f(k), f(a))
    case MM512_ASIN_PD (a) =>
      _mm512_asin_pd(f(a))
    case MM512_MASK_ASIN_PD (src, k, a) =>
      _mm512_mask_asin_pd(f(src), f(k), f(a))
    case MM512_ASIN_PS (a) =>
      _mm512_asin_ps(f(a))
    case MM512_MASK_ASIN_PS (src, k, a) =>
      _mm512_mask_asin_ps(f(src), f(k), f(a))
    case MM512_ASINH_PD (a) =>
      _mm512_asinh_pd(f(a))
    case MM512_MASK_ASINH_PD (src, k, a) =>
      _mm512_mask_asinh_pd(f(src), f(k), f(a))
    case MM512_ASINH_PS (a) =>
      _mm512_asinh_ps(f(a))
    case MM512_MASK_ASINH_PS (src, k, a) =>
      _mm512_mask_asinh_ps(f(src), f(k), f(a))
    case MM512_ATAN2_PD (a, b) =>
      _mm512_atan2_pd(f(a), f(b))
    case MM512_MASK_ATAN2_PD (src, k, a, b) =>
      _mm512_mask_atan2_pd(f(src), f(k), f(a), f(b))
    case MM512_ATAN2_PS (a, b) =>
      _mm512_atan2_ps(f(a), f(b))
    case MM512_MASK_ATAN2_PS (src, k, a, b) =>
      _mm512_mask_atan2_ps(f(src), f(k), f(a), f(b))
    case MM512_ATAN_PD (a) =>
      _mm512_atan_pd(f(a))
    case MM512_MASK_ATAN_PD (src, k, a) =>
      _mm512_mask_atan_pd(f(src), f(k), f(a))
    case MM512_ATAN_PS (a) =>
      _mm512_atan_ps(f(a))
    case MM512_MASK_ATAN_PS (src, k, a) =>
      _mm512_mask_atan_ps(f(src), f(k), f(a))
    case MM512_ATANH_PD (a) =>
      _mm512_atanh_pd(f(a))
    case MM512_MASK_ATANH_PD (src, k, a) =>
      _mm512_mask_atanh_pd(f(src), f(k), f(a))
    case MM512_ATANH_PS (a) =>
      _mm512_atanh_ps(f(a))
    case MM512_MASK_ATANH_PS (src, k, a) =>
      _mm512_mask_atanh_ps(f(src), f(k), f(a))
    case MM512_CBRT_PD (a) =>
      _mm512_cbrt_pd(f(a))
    case MM512_MASK_CBRT_PD (src, k, a) =>
      _mm512_mask_cbrt_pd(f(src), f(k), f(a))
    case MM512_CBRT_PS (a) =>
      _mm512_cbrt_ps(f(a))
    case MM512_MASK_CBRT_PS (src, k, a) =>
      _mm512_mask_cbrt_ps(f(src), f(k), f(a))
    case MM512_CDFNORM_PD (a) =>
      _mm512_cdfnorm_pd(f(a))
    case MM512_MASK_CDFNORM_PD (src, k, a) =>
      _mm512_mask_cdfnorm_pd(f(src), f(k), f(a))
    case MM512_CDFNORM_PS (a) =>
      _mm512_cdfnorm_ps(f(a))
    case MM512_MASK_CDFNORM_PS (src, k, a) =>
      _mm512_mask_cdfnorm_ps(f(src), f(k), f(a))
    case MM512_CDFNORMINV_PD (a) =>
      _mm512_cdfnorminv_pd(f(a))
    case MM512_MASK_CDFNORMINV_PD (src, k, a) =>
      _mm512_mask_cdfnorminv_pd(f(src), f(k), f(a))
    case MM512_CDFNORMINV_PS (a) =>
      _mm512_cdfnorminv_ps(f(a))
    case MM512_MASK_CDFNORMINV_PS (src, k, a) =>
      _mm512_mask_cdfnorminv_ps(f(src), f(k), f(a))
    case MM512_CEIL_PD (a) =>
      _mm512_ceil_pd(f(a))
    case MM512_MASK_CEIL_PD (src, k, a) =>
      _mm512_mask_ceil_pd(f(src), f(k), f(a))
    case MM512_CEIL_PS (a) =>
      _mm512_ceil_ps(f(a))
    case MM512_MASK_CEIL_PS (src, k, a) =>
      _mm512_mask_ceil_ps(f(src), f(k), f(a))
    case MM512_COS_PD (a) =>
      _mm512_cos_pd(f(a))
    case MM512_MASK_COS_PD (src, k, a) =>
      _mm512_mask_cos_pd(f(src), f(k), f(a))
    case MM512_COS_PS (a) =>
      _mm512_cos_ps(f(a))
    case MM512_MASK_COS_PS (src, k, a) =>
      _mm512_mask_cos_ps(f(src), f(k), f(a))
    case MM512_COSD_PD (a) =>
      _mm512_cosd_pd(f(a))
    case MM512_MASK_COSD_PD (src, k, a) =>
      _mm512_mask_cosd_pd(f(src), f(k), f(a))
    case MM512_COSD_PS (a) =>
      _mm512_cosd_ps(f(a))
    case MM512_MASK_COSD_PS (src, k, a) =>
      _mm512_mask_cosd_ps(f(src), f(k), f(a))
    case MM512_COSH_PD (a) =>
      _mm512_cosh_pd(f(a))
    case MM512_MASK_COSH_PD (src, k, a) =>
      _mm512_mask_cosh_pd(f(src), f(k), f(a))
    case MM512_COSH_PS (a) =>
      _mm512_cosh_ps(f(a))
    case MM512_MASK_COSH_PS (src, k, a) =>
      _mm512_mask_cosh_ps(f(src), f(k), f(a))
    case MM512_ERF_PD (a) =>
      _mm512_erf_pd(f(a))
    case MM512_MASK_ERF_PD (src, k, a) =>
      _mm512_mask_erf_pd(f(src), f(k), f(a))
    case MM512_ERFC_PD (a) =>
      _mm512_erfc_pd(f(a))
    case MM512_MASK_ERFC_PD (src, k, a) =>
      _mm512_mask_erfc_pd(f(src), f(k), f(a))
    case MM512_ERF_PS (a) =>
      _mm512_erf_ps(f(a))
    case MM512_MASK_ERF_PS (src, k, a) =>
      _mm512_mask_erf_ps(f(src), f(k), f(a))
    case MM512_ERFC_PS (a) =>
      _mm512_erfc_ps(f(a))
    case MM512_MASK_ERFC_PS (src, k, a) =>
      _mm512_mask_erfc_ps(f(src), f(k), f(a))
    case MM512_ERFINV_PD (a) =>
      _mm512_erfinv_pd(f(a))
    case MM512_MASK_ERFINV_PD (src, k, a) =>
      _mm512_mask_erfinv_pd(f(src), f(k), f(a))
    case MM512_ERFINV_PS (a) =>
      _mm512_erfinv_ps(f(a))
    case MM512_MASK_ERFINV_PS (src, k, a) =>
      _mm512_mask_erfinv_ps(f(src), f(k), f(a))
    case MM512_ERFCINV_PD (a) =>
      _mm512_erfcinv_pd(f(a))
    case MM512_MASK_ERFCINV_PD (src, k, a) =>
      _mm512_mask_erfcinv_pd(f(src), f(k), f(a))
    case MM512_ERFCINV_PS (a) =>
      _mm512_erfcinv_ps(f(a))
    case MM512_MASK_ERFCINV_PS (src, k, a) =>
      _mm512_mask_erfcinv_ps(f(src), f(k), f(a))
    case MM512_EXP10_PD (a) =>
      _mm512_exp10_pd(f(a))
    case MM512_MASK_EXP10_PD (src, k, a) =>
      _mm512_mask_exp10_pd(f(src), f(k), f(a))
    case MM512_EXP10_PS (a) =>
      _mm512_exp10_ps(f(a))
    case MM512_MASK_EXP10_PS (src, k, a) =>
      _mm512_mask_exp10_ps(f(src), f(k), f(a))
    case MM512_EXP2_PD (a) =>
      _mm512_exp2_pd(f(a))
    case MM512_MASK_EXP2_PD (src, k, a) =>
      _mm512_mask_exp2_pd(f(src), f(k), f(a))
    case MM512_EXP2_PS (a) =>
      _mm512_exp2_ps(f(a))
    case MM512_MASK_EXP2_PS (src, k, a) =>
      _mm512_mask_exp2_ps(f(src), f(k), f(a))
    case MM512_EXP_PD (a) =>
      _mm512_exp_pd(f(a))
    case MM512_MASK_EXP_PD (src, k, a) =>
      _mm512_mask_exp_pd(f(src), f(k), f(a))
    case MM512_EXP_PS (a) =>
      _mm512_exp_ps(f(a))
    case MM512_MASK_EXP_PS (src, k, a) =>
      _mm512_mask_exp_ps(f(src), f(k), f(a))
    case MM512_EXPM1_PD (a) =>
      _mm512_expm1_pd(f(a))
    case MM512_MASK_EXPM1_PD (src, k, a) =>
      _mm512_mask_expm1_pd(f(src), f(k), f(a))
    case MM512_EXPM1_PS (a) =>
      _mm512_expm1_ps(f(a))
    case MM512_MASK_EXPM1_PS (src, k, a) =>
      _mm512_mask_expm1_ps(f(src), f(k), f(a))
    case MM512_FLOOR_PD (a) =>
      _mm512_floor_pd(f(a))
    case MM512_MASK_FLOOR_PD (src, k, a) =>
      _mm512_mask_floor_pd(f(src), f(k), f(a))
    case MM512_FLOOR_PS (a) =>
      _mm512_floor_ps(f(a))
    case MM512_MASK_FLOOR_PS (src, k, a) =>
      _mm512_mask_floor_ps(f(src), f(k), f(a))
    case MM512_HYPOT_PD (a, b) =>
      _mm512_hypot_pd(f(a), f(b))
    case MM512_MASK_HYPOT_PD (src, k, a, b) =>
      _mm512_mask_hypot_pd(f(src), f(k), f(a), f(b))
    case MM512_HYPOT_PS (a, b) =>
      _mm512_hypot_ps(f(a), f(b))
    case MM512_MASK_HYPOT_PS (src, k, a, b) =>
      _mm512_mask_hypot_ps(f(src), f(k), f(a), f(b))
    case MM512_DIV_EPI32 (a, b) =>
      _mm512_div_epi32(f(a), f(b))
    case MM512_MASK_DIV_EPI32 (src, k, a, b) =>
      _mm512_mask_div_epi32(f(src), f(k), f(a), f(b))
    case MM512_DIV_EPI8 (a, b) =>
      _mm512_div_epi8(f(a), f(b))
    case MM512_DIV_EPI16 (a, b) =>
      _mm512_div_epi16(f(a), f(b))
    case MM512_DIV_EPI64 (a, b) =>
      _mm512_div_epi64(f(a), f(b))
    case MM512_INVSQRT_PD (a) =>
      _mm512_invsqrt_pd(f(a))
    case MM512_MASK_INVSQRT_PD (src, k, a) =>
      _mm512_mask_invsqrt_pd(f(src), f(k), f(a))
    case MM512_INVSQRT_PS (a) =>
      _mm512_invsqrt_ps(f(a))
    case MM512_MASK_INVSQRT_PS (src, k, a) =>
      _mm512_mask_invsqrt_ps(f(src), f(k), f(a))
    case MM512_REM_EPI32 (a, b) =>
      _mm512_rem_epi32(f(a), f(b))
    case MM512_MASK_REM_EPI32 (src, k, a, b) =>
      _mm512_mask_rem_epi32(f(src), f(k), f(a), f(b))
    case MM512_REM_EPI8 (a, b) =>
      _mm512_rem_epi8(f(a), f(b))
    case MM512_REM_EPI16 (a, b) =>
      _mm512_rem_epi16(f(a), f(b))
    case MM512_REM_EPI64 (a, b) =>
      _mm512_rem_epi64(f(a), f(b))
    case MM512_LOG10_PD (a) =>
      _mm512_log10_pd(f(a))
    case MM512_MASK_LOG10_PD (src, k, a) =>
      _mm512_mask_log10_pd(f(src), f(k), f(a))
    case MM512_LOG10_PS (a) =>
      _mm512_log10_ps(f(a))
    case MM512_MASK_LOG10_PS (src, k, a) =>
      _mm512_mask_log10_ps(f(src), f(k), f(a))
    case MM512_LOG1P_PD (a) =>
      _mm512_log1p_pd(f(a))
    case MM512_MASK_LOG1P_PD (src, k, a) =>
      _mm512_mask_log1p_pd(f(src), f(k), f(a))
    case MM512_LOG1P_PS (a) =>
      _mm512_log1p_ps(f(a))
    case MM512_MASK_LOG1P_PS (src, k, a) =>
      _mm512_mask_log1p_ps(f(src), f(k), f(a))
    case MM512_LOG2_PD (a) =>
      _mm512_log2_pd(f(a))
    case MM512_MASK_LOG2_PD (src, k, a) =>
      _mm512_mask_log2_pd(f(src), f(k), f(a))
    case MM512_LOG_PD (a) =>
      _mm512_log_pd(f(a))
    case MM512_MASK_LOG_PD (src, k, a) =>
      _mm512_mask_log_pd(f(src), f(k), f(a))
    case MM512_LOG_PS (a) =>
      _mm512_log_ps(f(a))
    case MM512_MASK_LOG_PS (src, k, a) =>
      _mm512_mask_log_ps(f(src), f(k), f(a))
    case MM512_LOGB_PD (a) =>
      _mm512_logb_pd(f(a))
    case MM512_MASK_LOGB_PD (src, k, a) =>
      _mm512_mask_logb_pd(f(src), f(k), f(a))
    case MM512_LOGB_PS (a) =>
      _mm512_logb_ps(f(a))
    case MM512_MASK_LOGB_PS (src, k, a) =>
      _mm512_mask_logb_ps(f(src), f(k), f(a))
    case MM512_NEARBYINT_PD (a) =>
      _mm512_nearbyint_pd(f(a))
    case MM512_MASK_NEARBYINT_PD (src, k, a) =>
      _mm512_mask_nearbyint_pd(f(src), f(k), f(a))
    case MM512_NEARBYINT_PS (a) =>
      _mm512_nearbyint_ps(f(a))
    case MM512_MASK_NEARBYINT_PS (src, k, a) =>
      _mm512_mask_nearbyint_ps(f(src), f(k), f(a))

    case Reflect(MM256_LOG1P_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG1P_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG1P_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG1P_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOG2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOG2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOGB_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOGB_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_LOGB_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_LOGB_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_POW_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_POW_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_POW_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_POW_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPU8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPU8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPU16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPU16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_REM_EPU64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_REM_EPU64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_SINCOS_PD (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_SINCOS_PD (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_SINCOS_PS (mem_addr, a, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_SINCOS_PS (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SIND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SIND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SIND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_CEIL_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_CEIL_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_ROUND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_ROUND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_ROUND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_ROUND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_SQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_SQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_SVML_SQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_SVML_SQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_TAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_TAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TAND_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_TAND_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TAND_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_TAND_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_TANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_TANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TRUNC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM256_TRUNC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_TRUNC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM256_TRUNC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UDIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UDIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM256_UDIVREM_EPI32 (mem_addr, a, b, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM256_UDIVREM_EPI32 (iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(a, f), iDef.cont.applyTransformer(b, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_UREM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM256_UREM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ACOS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ACOS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ACOS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ACOS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ACOS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ACOS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ACOS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ACOS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ACOSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ACOSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ACOSH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ACOSH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ACOSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ACOSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ACOSH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ACOSH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ASIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ASIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ASIN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ASIN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ASIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ASIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ASIN_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ASIN_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ASINH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ASINH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ASINH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ASINH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ASINH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ASINH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ASINH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ASINH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATAN2_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ATAN2_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATAN2_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATAN2_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATAN2_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_ATAN2_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATAN2_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATAN2_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATAN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ATAN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATAN_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATAN_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATAN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ATAN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATAN_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATAN_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATANH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ATANH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATANH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATANH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ATANH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ATANH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ATANH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ATANH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CBRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CBRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CBRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CBRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CBRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CBRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CBRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CBRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CDFNORM_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CDFNORM_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CDFNORM_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CDFNORM_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CDFNORM_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CDFNORM_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CDFNORM_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CDFNORM_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CDFNORMINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CDFNORMINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CDFNORMINV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CDFNORMINV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CDFNORMINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CDFNORMINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CDFNORMINV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CDFNORMINV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CEIL_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CEIL_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CEIL_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CEIL_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CEIL_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CEIL_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CEIL_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CEIL_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COS_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_COS_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COS_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COS_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COS_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_COS_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COS_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COS_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COSD_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_COSD_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COSD_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COSD_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COSD_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_COSD_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COSD_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COSD_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COSH_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_COSH_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COSH_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COSH_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_COSH_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_COSH_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_COSH_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_COSH_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERF_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERF_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERF_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERF_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFC_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFC_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFC_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFC_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERF_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERF_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERF_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERF_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFC_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFC_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFC_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFC_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFINV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFINV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFINV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFINV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFCINV_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFCINV_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFCINV_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFCINV_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ERFCINV_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_ERFCINV_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ERFCINV_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ERFCINV_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP10_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP10_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP10_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP10_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP2_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP2_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXP_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXPM1_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXPM1_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPM1_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPM1_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXPM1_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_EXPM1_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPM1_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPM1_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FLOOR_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_FLOOR_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FLOOR_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FLOOR_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FLOOR_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_FLOOR_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FLOOR_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FLOOR_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_HYPOT_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_HYPOT_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_HYPOT_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_HYPOT_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_HYPOT_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_HYPOT_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_HYPOT_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_HYPOT_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INVSQRT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_INVSQRT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INVSQRT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INVSQRT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INVSQRT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_INVSQRT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_INVSQRT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_INVSQRT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REM_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REM_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REM_EPI64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_REM_EPI64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG10_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG10_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG10_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG10_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG10_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG10_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG10_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG10_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG1P_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG1P_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG1P_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG1P_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG1P_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG1P_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG1P_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG1P_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG2_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG2_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG2_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG2_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOGB_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOGB_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOGB_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOGB_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOGB_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOGB_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOGB_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOGB_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_NEARBYINT_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_NEARBYINT_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_NEARBYINT_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_NEARBYINT_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_NEARBYINT_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_NEARBYINT_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_NEARBYINT_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_NEARBYINT_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSVML01 extends CGenIntrinsics {

  val IR: SVML
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_LOG1P_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log1p_pd(${quote(a)})")
    case iDef@MM256_LOG1P_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log1p_ps(${quote(a)})")
    case iDef@MM256_LOG2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log2_pd(${quote(a)})")
    case iDef@MM256_LOG2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_log2_ps(${quote(a)})")
    case iDef@MM256_LOGB_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_logb_pd(${quote(a)})")
    case iDef@MM256_LOGB_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_logb_ps(${quote(a)})")
    case iDef@MM256_POW_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_pow_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM256_POW_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_pow_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPU8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epu8(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPU16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epu16(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_REM_EPU64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_rem_epu64(${quote(a)}, ${quote(b)})")
    case iDef@MM256_SIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sin_pd(${quote(a)})")
    case iDef@MM256_SIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sin_ps(${quote(a)})")
    case iDef@MM256_SINCOS_PD(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sincos_pd((__m256d *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)})")
    case iDef@MM256_SINCOS_PS(mem_addr, a, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sincos_ps((__m256 *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)})")
    case iDef@MM256_SIND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sind_pd(${quote(a)})")
    case iDef@MM256_SIND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sind_ps(${quote(a)})")
    case iDef@MM256_SINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sinh_pd(${quote(a)})")
    case iDef@MM256_SINH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_sinh_ps(${quote(a)})")
    case iDef@MM256_SVML_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_ceil_pd(${quote(a)})")
    case iDef@MM256_SVML_CEIL_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_ceil_ps(${quote(a)})")
    case iDef@MM256_SVML_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_floor_pd(${quote(a)})")
    case iDef@MM256_SVML_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_floor_ps(${quote(a)})")
    case iDef@MM256_SVML_ROUND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_round_pd(${quote(a)})")
    case iDef@MM256_SVML_ROUND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_round_ps(${quote(a)})")
    case iDef@MM256_SVML_SQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_sqrt_pd(${quote(a)})")
    case iDef@MM256_SVML_SQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_svml_sqrt_ps(${quote(a)})")
    case iDef@MM256_TAN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tan_pd(${quote(a)})")
    case iDef@MM256_TAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tan_ps(${quote(a)})")
    case iDef@MM256_TAND_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tand_pd(${quote(a)})")
    case iDef@MM256_TAND_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tand_ps(${quote(a)})")
    case iDef@MM256_TANH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tanh_pd(${quote(a)})")
    case iDef@MM256_TANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_tanh_ps(${quote(a)})")
    case iDef@MM256_TRUNC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_trunc_pd(${quote(a)})")
    case iDef@MM256_TRUNC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_trunc_ps(${quote(a)})")
    case iDef@MM256_UDIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_udiv_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM256_UDIVREM_EPI32(mem_addr, a, b, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_udivrem_epi32((__m256i *) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))}, ${quote(a)}, ${quote(b)})")
    case iDef@MM256_UREM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_urem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_ACOS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_acos_pd(${quote(a)})")
    case iDef@MM512_MASK_ACOS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_acos_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ACOS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_acos_ps(${quote(a)})")
    case iDef@MM512_MASK_ACOS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_acos_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ACOSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_acosh_pd(${quote(a)})")
    case iDef@MM512_MASK_ACOSH_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_acosh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ACOSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_acosh_ps(${quote(a)})")
    case iDef@MM512_MASK_ACOSH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_acosh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ASIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_asin_pd(${quote(a)})")
    case iDef@MM512_MASK_ASIN_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_asin_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ASIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_asin_ps(${quote(a)})")
    case iDef@MM512_MASK_ASIN_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_asin_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ASINH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_asinh_pd(${quote(a)})")
    case iDef@MM512_MASK_ASINH_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_asinh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ASINH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_asinh_ps(${quote(a)})")
    case iDef@MM512_MASK_ASINH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_asinh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ATAN2_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atan2_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ATAN2_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atan2_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ATAN2_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atan2_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_ATAN2_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atan2_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_ATAN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atan_pd(${quote(a)})")
    case iDef@MM512_MASK_ATAN_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atan_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ATAN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atan_ps(${quote(a)})")
    case iDef@MM512_MASK_ATAN_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atan_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ATANH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atanh_pd(${quote(a)})")
    case iDef@MM512_MASK_ATANH_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atanh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ATANH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_atanh_ps(${quote(a)})")
    case iDef@MM512_MASK_ATANH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_atanh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CBRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cbrt_pd(${quote(a)})")
    case iDef@MM512_MASK_CBRT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cbrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CBRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cbrt_ps(${quote(a)})")
    case iDef@MM512_MASK_CBRT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cbrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CDFNORM_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cdfnorm_pd(${quote(a)})")
    case iDef@MM512_MASK_CDFNORM_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cdfnorm_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CDFNORM_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cdfnorm_ps(${quote(a)})")
    case iDef@MM512_MASK_CDFNORM_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cdfnorm_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CDFNORMINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cdfnorminv_pd(${quote(a)})")
    case iDef@MM512_MASK_CDFNORMINV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cdfnorminv_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CDFNORMINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cdfnorminv_ps(${quote(a)})")
    case iDef@MM512_MASK_CDFNORMINV_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cdfnorminv_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CEIL_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_ceil_pd(${quote(a)})")
    case iDef@MM512_MASK_CEIL_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_ceil_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_CEIL_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_ceil_ps(${quote(a)})")
    case iDef@MM512_MASK_CEIL_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_ceil_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COS_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cos_pd(${quote(a)})")
    case iDef@MM512_MASK_COS_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cos_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COS_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cos_ps(${quote(a)})")
    case iDef@MM512_MASK_COS_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cos_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COSD_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cosd_pd(${quote(a)})")
    case iDef@MM512_MASK_COSD_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cosd_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COSD_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cosd_ps(${quote(a)})")
    case iDef@MM512_MASK_COSD_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cosd_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COSH_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cosh_pd(${quote(a)})")
    case iDef@MM512_MASK_COSH_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cosh_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_COSH_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cosh_ps(${quote(a)})")
    case iDef@MM512_MASK_COSH_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cosh_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERF_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erf_pd(${quote(a)})")
    case iDef@MM512_MASK_ERF_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erf_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFC_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfc_pd(${quote(a)})")
    case iDef@MM512_MASK_ERFC_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfc_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERF_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erf_ps(${quote(a)})")
    case iDef@MM512_MASK_ERF_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erf_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFC_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfc_ps(${quote(a)})")
    case iDef@MM512_MASK_ERFC_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfc_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfinv_pd(${quote(a)})")
    case iDef@MM512_MASK_ERFINV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfinv_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfinv_ps(${quote(a)})")
    case iDef@MM512_MASK_ERFINV_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfinv_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFCINV_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfcinv_pd(${quote(a)})")
    case iDef@MM512_MASK_ERFCINV_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfcinv_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ERFCINV_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_erfcinv_ps(${quote(a)})")
    case iDef@MM512_MASK_ERFCINV_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_erfcinv_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp10_pd(${quote(a)})")
    case iDef@MM512_MASK_EXP10_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp10_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp10_ps(${quote(a)})")
    case iDef@MM512_MASK_EXP10_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp10_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2_pd(${quote(a)})")
    case iDef@MM512_MASK_EXP2_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp2_ps(${quote(a)})")
    case iDef@MM512_MASK_EXP2_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp2_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp_pd(${quote(a)})")
    case iDef@MM512_MASK_EXP_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXP_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp_ps(${quote(a)})")
    case iDef@MM512_MASK_EXP_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXPM1_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_expm1_pd(${quote(a)})")
    case iDef@MM512_MASK_EXPM1_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expm1_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_EXPM1_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_expm1_ps(${quote(a)})")
    case iDef@MM512_MASK_EXPM1_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expm1_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_FLOOR_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_floor_pd(${quote(a)})")
    case iDef@MM512_MASK_FLOOR_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_floor_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_FLOOR_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_floor_ps(${quote(a)})")
    case iDef@MM512_MASK_FLOOR_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_floor_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_HYPOT_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_hypot_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_HYPOT_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_hypot_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_HYPOT_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_hypot_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_HYPOT_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_hypot_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_DIV_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_INVSQRT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_invsqrt_pd(${quote(a)})")
    case iDef@MM512_MASK_INVSQRT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_invsqrt_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_INVSQRT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_invsqrt_ps(${quote(a)})")
    case iDef@MM512_MASK_INVSQRT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_invsqrt_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_REM_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_REM_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rem_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_REM_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM512_REM_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM512_REM_EPI64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rem_epi64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_LOG10_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log10_pd(${quote(a)})")
    case iDef@MM512_MASK_LOG10_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log10_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG10_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log10_ps(${quote(a)})")
    case iDef@MM512_MASK_LOG10_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log10_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG1P_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log1p_pd(${quote(a)})")
    case iDef@MM512_MASK_LOG1P_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log1p_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG1P_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log1p_ps(${quote(a)})")
    case iDef@MM512_MASK_LOG1P_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log1p_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG2_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log2_pd(${quote(a)})")
    case iDef@MM512_MASK_LOG2_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log2_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log_pd(${quote(a)})")
    case iDef@MM512_MASK_LOG_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOG_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log_ps(${quote(a)})")
    case iDef@MM512_MASK_LOG_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOGB_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_logb_pd(${quote(a)})")
    case iDef@MM512_MASK_LOGB_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_logb_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_LOGB_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_logb_ps(${quote(a)})")
    case iDef@MM512_MASK_LOGB_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_logb_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_NEARBYINT_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_nearbyint_pd(${quote(a)})")
    case iDef@MM512_MASK_NEARBYINT_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_nearbyint_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_NEARBYINT_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_nearbyint_ps(${quote(a)})")
    case iDef@MM512_MASK_NEARBYINT_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_nearbyint_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case _ => super.emitNode(sym, rhs)
  }
}
