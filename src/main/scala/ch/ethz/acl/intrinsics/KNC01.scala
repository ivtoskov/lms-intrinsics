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

    
trait KNC01 extends IntrinsicsBase {
  /**
   * Determines the maximum of the absolute elements of each pair of corresponding
   * elements of packed single-precision (32-bit) floating-point elements in "a"
   * and "b", storing the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_MAXABS_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of the absolute elements of each pair of corresponding
   * elements of packed single-precision (32-bit) floating-point elements in "a"
   * and "b", storing the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_MAXABS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements in packed
   * single-precision (32-bit) floating-point elements in "a" and "b", storing the
   * results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_GMAX_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements of packed
   * single-precision (32-bit) floating-point elements in "a" and "b", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_GMAX_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of the absolute elements of each pair of corresponding
   * elements of packed single-precision (32-bit) floating-point elements in "a"
   * and "b", storing the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_GMAXABS_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of the absolute elements of each pair of corresponding
   * elements of packed single-precision (32-bit) floating-point elements in "a"
   * and "b", storing the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_GMAXABS_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements in packed
   * double-precision (64-bit) floating-point elements in "a" and "b", storing the
   * results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_GMAX_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements of packed
   * double-precision (64-bit) floating-point elements in "a" and "b", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_GMAX_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum of each pair of corresponding elements in packed
   * single-precision (32-bit) floating-point elements in "a" and "b", storing the
   * results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_GMIN_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements of packed
   * single-precision (32-bit) floating-point elements in "a" and "b", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_GMIN_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum of each pair of corresponding elements in packed
   * double-precision (64-bit) floating-point elements in "a" and "b", storing the
   * results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_GMIN_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum of each pair of corresponding elements of packed
   * double-precision (64-bit) floating-point elements in "a" and "b", storing the
   * results in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_GMIN_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element multiplication between packed 32-bit integer
   * elements in "a" and "b" and stores the high 32 bits of each result into "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHI_EPI32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element multiplication between packed 32-bit integer
   * elements in "a" and "b" and stores the high 32 bits of each result into "dst"
   * using writemask "k" (elements are copied from "src" when the corresponding
   * mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element multiplication between packed unsigned 32-bit
   * integer elements in "a" and "b" and stores the high 32 bits of each result
   * into "dst".
   * a: __m512i, b: __m512i
   */
  case class MM512_MULHI_EPU32(a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element multiplication between packed unsigned 32-bit
   * integer elements in "a" and "b" and stores the high 32 bits of each result
   * into "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, b: __m512i
   */
  case class MM512_MASK_MULHI_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Permutes 128-bit blocks of the packed 32-bit integer vector "a" using constant
   * "imm8". The results are stored in "dst".
   * a: __m512i, imm8: _MM_PERM_ENUM
   */
  case class MM512_PERMUTE4F128_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Permutes 128-bit blocks of the packed 32-bit integer vector "a" using constant
   * "imm8". The results are stored in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512i, imm8: _MM_PERM_ENUM
   */
  case class MM512_MASK_PERMUTE4F128_EPI32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Approximates the reciprocals of packed single-precision (32-bit)
   * floating-point elements in "a" to 23 bits of precision, storing the results in
   * "dst".
   * a: __m512
   */
  case class MM512_RCP23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Approximates the reciprocals of packed single-precision (32-bit)
   * floating-point elements in "a" to 23 bits of precision, storing the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RCP23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" to
   * the nearest integer value using "expadj" and in the direction of "rounding",
   * and store the results as packed single-precision floating-point elements in
   * "dst".
   * 	[round_note]
   * a: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_ROUND_PS(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Round the packed single-precision (32-bit) floating-point elements in "a" to
   * the nearest integer value using "expadj" and in the direction of "rounding",
   * and store the results as packed single-precision floating-point elements in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_MASK_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element rounding of packed single-precision (32-bit)
   * floating-point elements in "a" using "expadj" and in the direction of
   * "rounding" and stores results in "dst".
   * 	[round_note]
   * a: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_ROUNDFXPNT_ADJUST_PS(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element rounding of packed single-precision (32-bit)
   * floating-point elements in "a" using "expadj" and in the direction of
   * "rounding" and stores results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_MASK_ROUNDFXPNT_ADJUST_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element rounding of packed double-precision (64-bit)
   * floating-point elements in "a" using "expadj" and in the direction of
   * "rounding" and stores results in "dst".
   * 	[round_note]
   * a: __m512d, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_ROUNDFXPNT_ADJUST_PD(a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element rounding of packed double-precision (64-bit)
   * floating-point elements in "a" using "expadj" and in the direction of
   * "rounding" and stores results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, rounding: int, expadj: _MM_EXP_ADJ_ENUM
   */
  case class MM512_MASK_ROUNDFXPNT_ADJUST_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculates the reciprocal square root of packed single-precision (32-bit)
   * floating-point elements in "a" to 23 bits of accuracy and stores the result in
   * "dst".
   * a: __m512
   */
  case class MM512_RSQRT23_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Calculates the reciprocal square root of packed single-precision (32-bit)
   * floating-point elements in "a" to 23 bits of accuracy and stores the result in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_RSQRT23_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scales each single-precision (32-bit) floating-point element in "a" by
   * multiplying it by 2**exponent, where the exponent is the corresponding 32-bit
   * integer element in "b", storing results in "dst".
   * a: __m512, b: __m512i
   */
  case class MM512_SCALE_PS(a: Exp[__m512], b: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scales each single-precision (32-bit) floating-point element in "a" by
   * multiplying it by 2**exponent, where the exponenet is the corresponding 32-bit
   * integer element in "b", storing results in "dst" using writemask "k" (elements
   * are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512i
   */
  case class MM512_MASK_SCALE_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scales each single-precision (32-bit) floating-point element in "a" by
   * multiplying it by 2**exponent, where the exponenet is the corresponding 32-bit
   * integer element in "b", storing results in "dst". Intermediate elements are
   * rounded using "rounding".
   * 	[round_note]
   * a: __m512, b: __m512i, rounding: int
   */
  case class MM512_SCALE_ROUND_PS(a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Scales each single-precision (32-bit) floating-point element in "a" by
   * multiplying it by 2**exp, where the exp is the corresponding 32-bit integer
   * element in "b", storing results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set). Results are
   * rounded using constant "rounding".
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512i, rounding: int
   */
  case class MM512_MASK_SCALE_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst".
   * a: __m512
   */
  case class MM512_LOG2_PS(a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Compute the base-2 logarithm of packed single-precision (32-bit)
   * floating-point elements in "a", and store the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_LOG2_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum element of the packed single-precision (32-bit)
   * floating-point elements stored in "a" and stores the result in "dst".
   * a: __m512
   */
  case class MM512_REDUCE_GMIN_PS(a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum element of the packed single-precision (32-bit)
   * floating-point elements stored in "a" and stores the result in "dst" using
   * writemask "k" (elements are ignored when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASK_REDUCE_GMIN_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum element of the packed double-precision (64-bit)
   * floating-point elements stored in "a" and stores the result in "dst".
   * a: __m512d
   */
  case class MM512_REDUCE_GMIN_PD(a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the minimum element of the packed double-precision (64-bit)
   * floating-point elements stored in "a" and stores the result in "dst". Bitmask
   * "k" is used to exclude certain elements (elements are ignored when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASK_REDUCE_GMIN_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum element of the packed single-precision (32-bit)
   * floating-point elements stored in "a" and stores the result in "dst".
   * a: __m512
   */
  case class MM512_REDUCE_GMAX_PS(a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum element of the packed single-precision (32-bit)
   * floating-point elements stored in "a" and stores the result in "dst". Bitmask
   * "k" is used to exclude certain elements (elements are ignored when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASK_REDUCE_GMAX_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[Float] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum element of the packed double-precision (64-bit)
   * floating-point elements stored in "a" and stores the result in "dst".
   * a: __m512d
   */
  case class MM512_REDUCE_GMAX_PD(a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Determines the maximum element of the packed double-precision (64-bit)
   * floating-point elements stored in "a" and stores the result in "dst". Bitmask
   * "k" is used to exclude certain elements (elements are ignored when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASK_REDUCE_GMAX_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[Double] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of trailing bits in unsigned 32-bit integer "x" starting at
   * bit "a" storing the result in "dst".
   * a: int, x: unsigned int
   */
  case class MM_TZCNTI_32(a: Exp[Int], x: Exp[UInt]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Counts the number of trailing bits in unsigned 64-bit integer "x" starting at
   * bit "a" storing the result in "dst".
   * a: __int64, x: unsigned __int64
   */
  case class MM_TZCNTI_64(a: Exp[Long], x: Exp[ULong]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.BitManipulation)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stalls a thread without blocking other threads for 32-bit unsigned integer
   * "r1" clock cycles.
   * r1: unsigned int
   */
  case class MM_DELAY_32(r1: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stalls a thread without blocking other threads for 64-bit unsigned integer
   * "r1" clock cycles.
   * r1: unsigned __int64
   */
  case class MM_DELAY_64(r1: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set performance monitoring filtering mask to 32-bit unsigned integer "r1".
   * r1: unsigned int
   */
  case class MM_SPFLT_32(r1: Exp[UInt]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Set performance monitoring filtering mask to 64-bit unsigned integer "r1".
   * r1: unsigned __int64
   */
  case class MM_SPFLT_64(r1: Exp[ULong]) extends IntrinsicsDef[Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Evicts the cache line containing the address "ptr" from cache level "level"
   * (can be either 0 or 1).
   * ptr: const void *, level: int, ptrOffset: int
   */
  case class MM_CLEVICT[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], level: Exp[Int], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.GeneralSupport)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a bitwise AND operation between NOT of "k2" and "k1", storing the
   * result in "dst".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KANDNR(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Moves high byte from "k2" to low byte of "k1", and moves low byte of "k2" to
   * high byte of "k1".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KSWAPB(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
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
   * Converts integer "mask" into bitmask, storing the result in "dst".
   * mask: int
   */
  case class MM512_INT2MASK(mask: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List()
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Packs masks "k1" and "k2" into the high 32 bits of "dst". The rest of "dst" is
   * set to 0.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KCONCATHI_64(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Packs masks "k1" and "k2" into the low 32 bits of "dst". The rest of "dst" is
   * set to 0.
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KCONCATLO_64(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extracts 16-bit value "b" from 64-bit integer "a", storing the result in
   * "dst".
   * a: __int64, b: const int
   */
  case class MM512_KEXTRACT_64(a: Exp[Long], b: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst".
   * a: __m512, b: __m512
   */
  case class MM512_FMADD233_PS(a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_FMADD233_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 single-precision (32-bit) memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to 32-bit integer elements and stores them in "dst". "hint"
   * indicates to the processor whether the data is non-temporal.
   * index: __m512i, mv: void const*, conv: _MM_UPCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTGATHER_EPI32LO[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 single-precision (32-bit) memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to 32-bit integer elements and stores them in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). "hint" indicates to the processor whether the data is
   * non-temporal.
   * src: __m512i, k: __mmask8, index: __m512i, mv: void const*, conv: _MM_UPCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTGATHER_EPI32LO[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to 64-bit integer elements and stores them in "dst". "hint"
   * indicates to the processor whether the load is non-temporal.
   * index: __m512i, mv: void const*, conv: _MM_UPCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTGATHER_EPI64[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale"
   * using "conv" to 64-bit integer elements and stores them in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). "hint" indicates to the processor whether the load is
   * non-temporal.
   * src: __m512i, k: __mmask8, index: __m512i, mv: void const*, conv: _MM_UPCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTGATHER_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 memory locations starting at location "mv" at packed 64-bit
   * integer indices stored in "index" scaled by "scale" using "conv" to
   * single-precision (32-bit) floating-point elements and stores them in the lower
   * half of "dst". "hint" indicates to the processor whether the load is
   * non-temporal.
   * index: __m512i, mv: void const *, conv: _MM_UPCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTGATHER_PSLO[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 memory locations starting at location "mv" at packed 64-bit
   * integer indices stored in "index" scaled by "scale" using "conv" to
   * single-precision (32-bit) floating-point elements and stores them in the lower
   * half of "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set). "hint" indicates to the processor whether
   * the load is non-temporal.
   * src: __m512, k: __mmask8, index: __m512i, mv: void const *, conv: _MM_UPCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTGATHER_PSLO[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) floating-point elements stored in
   * memory starting at location "mv" at packed 64-bit integer indices stored in
   * "index" scaled by "scale" using "conv" to 64-bit floating-point elements and
   * stores them in "dst". "hint" indicates to the processor whether the data is
   * non-temporal.
   * index: __m512i, mv: void const *, conv: _MM_UPCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTGATHER_PD[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Up-converts 8 double-precision (64-bit) floating-point elements stored in
   * memory starting at location "mv" at packed 64-bit integer indices stored in
   * "index" scaled by "scale" using "conv" to 64-bit floating-point elements and
   * stores them in "dst" using writemask "k" (elements are copied from "src" when
   * the corresponding mask bit is not set). "hint" indicates to the processor
   * whether the data is non-temporal.
   * src: __m512d, k: __mmask8, index: __m512i, mv: void const *, conv: _MM_UPCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTGATHER_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed single-precision (32-bit) floating-point elements in
   * "v1" using "conv" and stores them in memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale".
   * "hint" indicates to the processor whether the data is non-temporal.
   * mv: void *, index: __m512i, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTSCATTER_PSLO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed single-precision (32-bit) floating-point elements in
   * "v1" using "conv" and stores them in memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale".
   * Elements are only written when the corresponding mask bit is set in "k";
   * otherwise, elements are unchanged in memory. "hint" indicates to the processor
   * whether the data is non-temporal.
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTSCATTER_PSLO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed double-precision (64-bit) floating-point elements in
   * "v1" using "conv" and stores them in memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale".
   * "hint" indicates to the processor whether the data is non-temporal.
   * mv: void *, index: __m512i, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTSCATTER_PD[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed double-precision (64-bit) floating-point elements in
   * "v1" using "conv" and stores them in memory locations starting at location
   * "mv" at packed 64-bit integer indices stored in "index" scaled by "scale".
   * Elements are written to memory using writemask "k" (elements are not stored to
   * memory when the corresponding mask bit is not set; the memory location is left
   * unchagned). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512d, conv: _MM_DOWNCONV_PD_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTSCATTER_PD[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts the low 8 packed 32-bit integer elements in "v1" using "conv"
   * and stores them in memory locations starting at location "mv" at packed 64-bit
   * integer indices stored in "index" scaled by "scale". "hint" indicates to the
   * processor whether the data is non-temporal.
   * mv: void *, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTSCATTER_EPI32LO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts the low 8 packed 32-bit integer elements in "v1" using "conv"
   * and stores them in memory locations starting at location "mv" at packed 64-bit
   * integer indices stored in "index" scaled by "scale". Elements are written to
   * memory using writemask "k" (elements are only written when the corresponding
   * mask bit is set; otherwise, the memory location is left unchanged). "hint"
   * indicates to the processor whether the data is non-temporal.
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTSCATTER_EPI32LO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed 64-bit integer elements in "v1" using "conv" and stores
   * them in memory locations starting at location "mv" at packed 64-bit integer
   * indices stored in "index" scaled by "scale". "hint" indicates to the processor
   * whether the load is non-temporal.
   * mv: void *, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_I64EXTSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts 8 packed 64-bit integer elements in "v1" using "conv" and stores
   * them in memory locations starting at location "mv" at packed 64-bit integer
   * indices stored in "index" scaled by "scale". Only those elements whose
   * corresponding mask bit is set in writemask "k" are written to memory.
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, scale: int, hint: int, mvOffset: int
   */
  case class MM512_MASK_I64EXTSCATTER_EPI64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Permutes 128-bit blocks of the packed single-precision (32-bit) floating-point
   * elements in "a" using constant "imm8". The results are stored in "dst".
   * a: __m512, imm8: _MM_PERM_ENUM
   */
  case class MM512_PERMUTE4F128_PS(a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Permutes 128-bit blocks of the packed single-precision (32-bit) floating-point
   * elements in "a" using constant "imm8". The results are stored in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512, imm8: _MM_PERM_ENUM
   */
  case class MM512_MASK_PERMUTE4F128_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads 8 32-bit integer memory locations starting at location "mv" at packed
   * 64-bit integer indices stored in "index" scaled by "scale" to "dst".
   * index: __m512i, mv: void const *, scale: int, mvOffset: int
   */
  case class MM512_I64GATHER_EPI32LO[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads 8 32-bit integer memory locations starting at location "mv" at packed
   * 64-bit integer indices stored in "index" scaled by "scale" to "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512i, k: __mmask8, index: __m512i, mv: void const *, scale: int, mvOffset: int
   */
  case class MM512_MASK_I64GATHER_EPI32LO[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads 8 single-precision (32-bit) floating-point memory locations starting at
   * location "mv" at packed 64-bit integer indices stored in "index" scaled by
   * "scale" to "dst".
   * index: __m512i, mv: void const *, scale: int, mvOffset: int
   */
  case class MM512_I64GATHER_PSLO[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads 8 single-precision (32-bit) floating-point memory locations starting at
   * location "mv" at packed 64-bit integer indices stored in "index" scaled by
   * "scale" to "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask8, index: __m512i, mv: void const *, scale: int, mvOffset: int
   */
  case class MM512_MASK_I64GATHER_PSLO[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed single-precision (32-bit) floating-point elements in "v" in
   * memory locations starting at location "mv" at packed 64-bit integer indices
   * stored in "index" scaled by "scale".
   * mv: void *, index: __m512i, v: __m512, scale: int, mvOffset: int
   */
  case class MM512_I64SCATTER_PSLO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed single-precision (32-bit) floating-point elements in "v1" in
   * memory locations starting at location "mv" at packed 64-bit integer indices
   * stored in "index" scaled by "scale" using writemask "k" (elements are only
   * written to memory when the corresponding mask bit is set).
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512, scale: int, mvOffset: int
   */
  case class MM512_MASK_I64SCATTER_PSLO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 32-bit integer elements in "v1" in memory locations starting
   * at location "mv" at packed 64-bit integer indices stored in "index" scaled by
   * "scale".
   * mv: void *, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_I64SCATTER_EPI32LO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores 8 packed 32-bit integer elements in "v1" in memory locations starting
   * at location "mv" at packed 64-bit integer indices stored in "index" scaled by
   * "scale" using writemask "k" (elements are only written to memory when the
   * corresponding mask bit is set).
   * mv: void *, k: __mmask8, index: __m512i, v1: __m512i, scale: int, mvOffset: int
   */
  case class MM512_MASK_I64SCATTER_EPI32LO[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Move the high element from "k1" to the low element of "k1", and insert the low
   * element of "k2" into the high element of "k1".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KMERGE2L1H(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Insert the low element of "k2" into the high element of "k1".
   * k1: __mmask16, k2: __mmask16
   */
  case class MM512_KMERGE2L1L(k1: Exp[Int], k2: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Mask)
    val intrinsicType = List(IntrinsicsType.Mask)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_maxabs_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MAXABS_PS(a, b)
  }
            
  def _mm512_mask_maxabs_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_MAXABS_PS(src, k, a, b)
  }
            
  def _mm512_gmax_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMAX_PS(a, b)
  }
            
  def _mm512_mask_gmax_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMAX_PS(src, k, a, b)
  }
            
  def _mm512_gmaxabs_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMAXABS_PS(a, b)
  }
            
  def _mm512_mask_gmaxabs_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMAXABS_PS(src, k, a, b)
  }
            
  def _mm512_gmax_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_GMAX_PD(a, b)
  }
            
  def _mm512_mask_gmax_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GMAX_PD(src, k, a, b)
  }
            
  def _mm512_gmin_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMIN_PS(a, b)
  }
            
  def _mm512_mask_gmin_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMIN_PS(src, k, a, b)
  }
            
  def _mm512_gmin_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_GMIN_PD(a, b)
  }
            
  def _mm512_mask_gmin_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_GMIN_PD(src, k, a, b)
  }
            
  def _mm512_mulhi_epi32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPI32(a, b)
  }
            
  def _mm512_mask_mulhi_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPI32(src, k, a, b)
  }
            
  def _mm512_mulhi_epu32(a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MULHI_EPU32(a, b)
  }
            
  def _mm512_mask_mulhi_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], b: Exp[__m512i]): Exp[__m512i] = {
    MM512_MASK_MULHI_EPU32(src, k, a, b)
  }
            
  def _mm512_permute4f128_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_PERMUTE4F128_EPI32(a, imm8)
  }
            
  def _mm512_mask_permute4f128_epi32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_PERMUTE4F128_EPI32(src, k, a, imm8)
  }
            
  def _mm512_rcp23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RCP23_PS(a)
  }
            
  def _mm512_mask_rcp23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RCP23_PS(src, k, a)
  }
            
  def _mm512_round_ps(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_ROUND_PS(a, rounding, expadj)
  }
            
  def _mm512_mask_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUND_PS(src, k, a, rounding, expadj)
  }
            
  def _mm512_roundfxpnt_adjust_ps(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_ROUNDFXPNT_ADJUST_PS(a, rounding, expadj)
  }
            
  def _mm512_mask_roundfxpnt_adjust_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDFXPNT_ADJUST_PS(src, k, a, rounding, expadj)
  }
            
  def _mm512_roundfxpnt_adjust_pd(a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512d] = {
    MM512_ROUNDFXPNT_ADJUST_PD(a, rounding, expadj)
  }
            
  def _mm512_mask_roundfxpnt_adjust_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDFXPNT_ADJUST_PD(src, k, a, rounding, expadj)
  }
            
  def _mm512_rsqrt23_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_RSQRT23_PS(a)
  }
            
  def _mm512_mask_rsqrt23_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_RSQRT23_PS(src, k, a)
  }
            
  def _mm512_scale_ps(a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_SCALE_PS(a, b)
  }
            
  def _mm512_mask_scale_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_SCALE_PS(src, k, a, b)
  }
            
  def _mm512_scale_round_ps(a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SCALE_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_scale_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SCALE_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_log2_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG2_PS(a)
  }
            
  def _mm512_mask_log2_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_LOG2_PS(src, k, a)
  }
            
  def _mm512_reduce_gmin_ps(a: Exp[__m512]): Exp[Float] = {
    MM512_REDUCE_GMIN_PS(a)
  }
            
  def _mm512_mask_reduce_gmin_ps(k: Exp[Int], a: Exp[__m512]): Exp[Float] = {
    MM512_MASK_REDUCE_GMIN_PS(k, a)
  }
            
  def _mm512_reduce_gmin_pd(a: Exp[__m512d]): Exp[Double] = {
    MM512_REDUCE_GMIN_PD(a)
  }
            
  def _mm512_mask_reduce_gmin_pd(k: Exp[Int], a: Exp[__m512d]): Exp[Double] = {
    MM512_MASK_REDUCE_GMIN_PD(k, a)
  }
            
  def _mm512_reduce_gmax_ps(a: Exp[__m512]): Exp[Float] = {
    MM512_REDUCE_GMAX_PS(a)
  }
            
  def _mm512_mask_reduce_gmax_ps(k: Exp[Int], a: Exp[__m512]): Exp[Float] = {
    MM512_MASK_REDUCE_GMAX_PS(k, a)
  }
            
  def _mm512_reduce_gmax_pd(a: Exp[__m512d]): Exp[Double] = {
    MM512_REDUCE_GMAX_PD(a)
  }
            
  def _mm512_mask_reduce_gmax_pd(k: Exp[Int], a: Exp[__m512d]): Exp[Double] = {
    MM512_MASK_REDUCE_GMAX_PD(k, a)
  }
            
  def _mm_tzcnti_32(a: Exp[Int], x: Exp[UInt]): Exp[Int] = {
    MM_TZCNTI_32(a, x)
  }
            
  def _mm_tzcnti_64(a: Exp[Long], x: Exp[ULong]): Exp[Long] = {
    MM_TZCNTI_64(a, x)
  }
            
  def _mm_delay_32(r1: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_DELAY_32(r1))
  }
            
  def _mm_delay_64(r1: Exp[ULong]): Exp[Unit] = {
    reflectEffect(MM_DELAY_64(r1))
  }
            
  def _mm_spflt_32(r1: Exp[UInt]): Exp[Unit] = {
    reflectEffect(MM_SPFLT_32(r1))
  }
            
  def _mm_spflt_64(r1: Exp[ULong]): Exp[Unit] = {
    reflectEffect(MM_SPFLT_64(r1))
  }
            
  def _mm_clevict[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], level: Exp[Int], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(MM_CLEVICT(ptr, level, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kandnr(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KANDNR(k1, k2)
  }
            
  def _mm512_kswapb(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KSWAPB(k1, k2)
  }
            
  def _mm512_kortestz(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTZ(k1, k2)
  }
            
  def _mm512_kortestc(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KORTESTC(k1, k2)
  }
            
  def _mm512_mask2int(k1: Exp[Int]): Exp[Int] = {
    MM512_MASK2INT(k1)
  }
            
  def _mm512_int2mask(mask: Exp[Int]): Exp[Int] = {
    MM512_INT2MASK(mask)
  }
            
  def _mm512_kconcathi_64(k1: Exp[Int], k2: Exp[Int]): Exp[Long] = {
    MM512_KCONCATHI_64(k1, k2)
  }
            
  def _mm512_kconcatlo_64(k1: Exp[Int], k2: Exp[Int]): Exp[Long] = {
    MM512_KCONCATLO_64(k1, k2)
  }
            
  def _mm512_kextract_64(a: Exp[Long], b: Exp[Int]): Exp[Int] = {
    MM512_KEXTRACT_64(a, b)
  }
            
  def _mm512_fmadd233_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_FMADD233_PS(a, b)
  }
            
  def _mm512_mask_fmadd233_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADD233_PS(src, k, a, b)
  }
            
  def _mm512_i64extgather_epi32lo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64EXTGATHER_EPI32LO(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extgather_epi32lo[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_EPI32LO(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extgather_epi64[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64EXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extgather_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_EPI64(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extgather_pslo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_I64EXTGATHER_PSLO(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extgather_pslo[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_PSLO(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extgather_pd[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mv)(MM512_I64EXTGATHER_PD(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extgather_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mv)(MM512_MASK_I64EXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extscatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_PSLO(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_PSLO(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_pd[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512d], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_PD(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extscatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_EPI32LO(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_EPI32LO(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_epi64[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_EPI64(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_permute4f128_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_PERMUTE4F128_PS(a, imm8)
  }
            
  def _mm512_mask_permute4f128_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_PERMUTE4F128_PS(src, k, a, imm8)
  }
            
  def _mm512_i64gather_epi32lo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64GATHER_EPI32LO(index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64gather_epi32lo[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64GATHER_EPI32LO(src, k, index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64gather_pslo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_I64GATHER_PSLO(index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64gather_pslo[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_MASK_I64GATHER_PSLO(src, k, index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64SCATTER_PSLO(mv, index, v, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64SCATTER_PSLO(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64SCATTER_EPI32LO(mv, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64SCATTER_EPI32LO(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kmerge2l1h(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMERGE2L1H(k1, k2)
  }
            
  def _mm512_kmerge2l1l(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMERGE2L1L(k1, k2)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MAXABS_PS (a, b) =>
      _mm512_maxabs_ps(f(a), f(b))
    case MM512_MASK_MAXABS_PS (src, k, a, b) =>
      _mm512_mask_maxabs_ps(f(src), f(k), f(a), f(b))
    case MM512_GMAX_PS (a, b) =>
      _mm512_gmax_ps(f(a), f(b))
    case MM512_MASK_GMAX_PS (src, k, a, b) =>
      _mm512_mask_gmax_ps(f(src), f(k), f(a), f(b))
    case MM512_GMAXABS_PS (a, b) =>
      _mm512_gmaxabs_ps(f(a), f(b))
    case MM512_MASK_GMAXABS_PS (src, k, a, b) =>
      _mm512_mask_gmaxabs_ps(f(src), f(k), f(a), f(b))
    case MM512_GMAX_PD (a, b) =>
      _mm512_gmax_pd(f(a), f(b))
    case MM512_MASK_GMAX_PD (src, k, a, b) =>
      _mm512_mask_gmax_pd(f(src), f(k), f(a), f(b))
    case MM512_GMIN_PS (a, b) =>
      _mm512_gmin_ps(f(a), f(b))
    case MM512_MASK_GMIN_PS (src, k, a, b) =>
      _mm512_mask_gmin_ps(f(src), f(k), f(a), f(b))
    case MM512_GMIN_PD (a, b) =>
      _mm512_gmin_pd(f(a), f(b))
    case MM512_MASK_GMIN_PD (src, k, a, b) =>
      _mm512_mask_gmin_pd(f(src), f(k), f(a), f(b))
    case MM512_MULHI_EPI32 (a, b) =>
      _mm512_mulhi_epi32(f(a), f(b))
    case MM512_MASK_MULHI_EPI32 (src, k, a, b) =>
      _mm512_mask_mulhi_epi32(f(src), f(k), f(a), f(b))
    case MM512_MULHI_EPU32 (a, b) =>
      _mm512_mulhi_epu32(f(a), f(b))
    case MM512_MASK_MULHI_EPU32 (src, k, a, b) =>
      _mm512_mask_mulhi_epu32(f(src), f(k), f(a), f(b))
    case MM512_PERMUTE4F128_EPI32 (a, imm8) =>
      _mm512_permute4f128_epi32(f(a), f(imm8))
    case MM512_MASK_PERMUTE4F128_EPI32 (src, k, a, imm8) =>
      _mm512_mask_permute4f128_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_RCP23_PS (a) =>
      _mm512_rcp23_ps(f(a))
    case MM512_MASK_RCP23_PS (src, k, a) =>
      _mm512_mask_rcp23_ps(f(src), f(k), f(a))
    case MM512_ROUND_PS (a, rounding, expadj) =>
      _mm512_round_ps(f(a), f(rounding), f(expadj))
    case MM512_MASK_ROUND_PS (src, k, a, rounding, expadj) =>
      _mm512_mask_round_ps(f(src), f(k), f(a), f(rounding), f(expadj))
    case MM512_ROUNDFXPNT_ADJUST_PS (a, rounding, expadj) =>
      _mm512_roundfxpnt_adjust_ps(f(a), f(rounding), f(expadj))
    case MM512_MASK_ROUNDFXPNT_ADJUST_PS (src, k, a, rounding, expadj) =>
      _mm512_mask_roundfxpnt_adjust_ps(f(src), f(k), f(a), f(rounding), f(expadj))
    case MM512_ROUNDFXPNT_ADJUST_PD (a, rounding, expadj) =>
      _mm512_roundfxpnt_adjust_pd(f(a), f(rounding), f(expadj))
    case MM512_MASK_ROUNDFXPNT_ADJUST_PD (src, k, a, rounding, expadj) =>
      _mm512_mask_roundfxpnt_adjust_pd(f(src), f(k), f(a), f(rounding), f(expadj))
    case MM512_RSQRT23_PS (a) =>
      _mm512_rsqrt23_ps(f(a))
    case MM512_MASK_RSQRT23_PS (src, k, a) =>
      _mm512_mask_rsqrt23_ps(f(src), f(k), f(a))
    case MM512_SCALE_PS (a, b) =>
      _mm512_scale_ps(f(a), f(b))
    case MM512_MASK_SCALE_PS (src, k, a, b) =>
      _mm512_mask_scale_ps(f(src), f(k), f(a), f(b))
    case MM512_SCALE_ROUND_PS (a, b, rounding) =>
      _mm512_scale_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_SCALE_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_scale_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_LOG2_PS (a) =>
      _mm512_log2_ps(f(a))
    case MM512_MASK_LOG2_PS (src, k, a) =>
      _mm512_mask_log2_ps(f(src), f(k), f(a))
    case MM512_REDUCE_GMIN_PS (a) =>
      _mm512_reduce_gmin_ps(f(a))
    case MM512_MASK_REDUCE_GMIN_PS (k, a) =>
      _mm512_mask_reduce_gmin_ps(f(k), f(a))
    case MM512_REDUCE_GMIN_PD (a) =>
      _mm512_reduce_gmin_pd(f(a))
    case MM512_MASK_REDUCE_GMIN_PD (k, a) =>
      _mm512_mask_reduce_gmin_pd(f(k), f(a))
    case MM512_REDUCE_GMAX_PS (a) =>
      _mm512_reduce_gmax_ps(f(a))
    case MM512_MASK_REDUCE_GMAX_PS (k, a) =>
      _mm512_mask_reduce_gmax_ps(f(k), f(a))
    case MM512_REDUCE_GMAX_PD (a) =>
      _mm512_reduce_gmax_pd(f(a))
    case MM512_MASK_REDUCE_GMAX_PD (k, a) =>
      _mm512_mask_reduce_gmax_pd(f(k), f(a))
    case MM_TZCNTI_32 (a, x) =>
      _mm_tzcnti_32(f(a), f(x))
    case MM_TZCNTI_64 (a, x) =>
      _mm_tzcnti_64(f(a), f(x))
    case MM_DELAY_32 (r1) =>
      _mm_delay_32(f(r1))
    case MM_DELAY_64 (r1) =>
      _mm_delay_64(f(r1))
    case MM_SPFLT_32 (r1) =>
      _mm_spflt_32(f(r1))
    case MM_SPFLT_64 (r1) =>
      _mm_spflt_64(f(r1))
    case iDef@MM_CLEVICT (ptr, level, ptrOffset) =>
      _mm_clevict(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(level, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KANDNR (k1, k2) =>
      _mm512_kandnr(f(k1), f(k2))
    case MM512_KSWAPB (k1, k2) =>
      _mm512_kswapb(f(k1), f(k2))
    case MM512_KORTESTZ (k1, k2) =>
      _mm512_kortestz(f(k1), f(k2))
    case MM512_KORTESTC (k1, k2) =>
      _mm512_kortestc(f(k1), f(k2))
    case MM512_MASK2INT (k1) =>
      _mm512_mask2int(f(k1))
    case MM512_INT2MASK (mask) =>
      _mm512_int2mask(f(mask))
    case MM512_KCONCATHI_64 (k1, k2) =>
      _mm512_kconcathi_64(f(k1), f(k2))
    case MM512_KCONCATLO_64 (k1, k2) =>
      _mm512_kconcatlo_64(f(k1), f(k2))
    case MM512_KEXTRACT_64 (a, b) =>
      _mm512_kextract_64(f(a), f(b))
    case MM512_FMADD233_PS (a, b) =>
      _mm512_fmadd233_ps(f(a), f(b))
    case MM512_MASK_FMADD233_PS (src, k, a, b) =>
      _mm512_mask_fmadd233_ps(f(src), f(k), f(a), f(b))
    case iDef@MM512_I64EXTGATHER_EPI32LO (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_epi32lo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTGATHER_EPI32LO (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_epi32lo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_epi64(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTGATHER_EPI64 (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTGATHER_PSLO (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_pslo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTGATHER_PSLO (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_pslo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTGATHER_PD (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_pd(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extgather_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTSCATTER_PSLO (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_PSLO (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_PD (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_pd(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTSCATTER_EPI32LO (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_EPI32LO (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_EPI64 (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_epi64(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_PERMUTE4F128_PS (a, imm8) =>
      _mm512_permute4f128_ps(f(a), f(imm8))
    case MM512_MASK_PERMUTE4F128_PS (src, k, a, imm8) =>
      _mm512_mask_permute4f128_ps(f(src), f(k), f(a), f(imm8))
    case iDef@MM512_I64GATHER_EPI32LO (index, mv, scale, mvOffset) =>
      _mm512_i64gather_epi32lo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64GATHER_EPI32LO (src, k, index, mv, scale, mvOffset) =>
      _mm512_mask_i64gather_epi32lo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64GATHER_PSLO (index, mv, scale, mvOffset) =>
      _mm512_i64gather_pslo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64GATHER_PSLO (src, k, index, mv, scale, mvOffset) =>
      _mm512_mask_i64gather_pslo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_PSLO (mv, index, v, scale, mvOffset) =>
      _mm512_i64scatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_PSLO (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i64scatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_EPI32LO (mv, index, v1, scale, mvOffset) =>
      _mm512_i64scatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_EPI32LO (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i64scatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KMERGE2L1H (k1, k2) =>
      _mm512_kmerge2l1h(f(k1), f(k2))
    case MM512_KMERGE2L1L (k1, k2) =>
      _mm512_kmerge2l1l(f(k1), f(k2))

    case Reflect(MM512_MAXABS_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MAXABS_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MAXABS_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MAXABS_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAX_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAX_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAX_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAX_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAXABS_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAXABS_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAXABS_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAXABS_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAX_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAX_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMIN_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMIN_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMIN_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMIN_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMIN_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMIN_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPI32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPI32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MULHI_EPU32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MULHI_EPU32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_MULHI_EPU32 (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_MULHI_EPU32 (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE4F128_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE4F128_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE4F128_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE4F128_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RCP23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RCP23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RCP23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RCP23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUND_PS (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUND_PS (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUND_PS (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUND_PS (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDFXPNT_ADJUST_PS (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDFXPNT_ADJUST_PS (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PS (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PS (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDFXPNT_ADJUST_PD (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDFXPNT_ADJUST_PD (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PD (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PD (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_RSQRT23_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_RSQRT23_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_RSQRT23_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_RSQRT23_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALE_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_SCALE_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALE_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALE_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SCALE_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SCALE_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALE_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALE_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_LOG2_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOG2_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMIN_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMIN_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMIN_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMIN_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMIN_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMIN_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMIN_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMIN_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMAX_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMAX_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMAX_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMAX_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMAX_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMAX_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMAX_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMAX_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNTI_32 (a, x), u, es) =>
      reflectMirrored(Reflect(MM_TZCNTI_32 (f(a), f(x)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_TZCNTI_64 (a, x), u, es) =>
      reflectMirrored(Reflect(MM_TZCNTI_64 (f(a), f(x)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DELAY_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_DELAY_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DELAY_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_DELAY_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SPFLT_32 (r1), u, es) =>
      reflectMirrored(Reflect(MM_SPFLT_32 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SPFLT_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_SPFLT_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM_CLEVICT (ptr, level, ptrOffset), u, es) =>
      reflectMirrored(Reflect(MM_CLEVICT (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(level, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KANDNR (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KANDNR (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KSWAPB (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KSWAPB (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTZ (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTZ (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KORTESTC (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KORTESTC (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK2INT (k1), u, es) =>
      reflectMirrored(Reflect(MM512_MASK2INT (f(k1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_INT2MASK (mask), u, es) =>
      reflectMirrored(Reflect(MM512_INT2MASK (f(mask)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KCONCATHI_64 (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KCONCATHI_64 (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KCONCATLO_64 (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KCONCATLO_64 (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KEXTRACT_64 (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_KEXTRACT_64 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADD233_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_FMADD233_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_EPI32LO (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_EPI32LO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_EPI32LO (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_EPI32LO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_EPI64 (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_EPI64 (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_EPI64 (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_PSLO (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_PSLO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_PSLO (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_PSLO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_PD (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_PD (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTGATHER_PD (src, k, index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTGATHER_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_PSLO (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_PSLO (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_PD (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_PD (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_PD (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_EPI32LO (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_EPI32LO (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_EPI64 (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_EPI64 (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_EPI64 (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE4F128_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE4F128_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_PERMUTE4F128_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PERMUTE4F128_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_EPI32LO (index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_EPI32LO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_EPI32LO (src, k, index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_EPI32LO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PSLO (index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PSLO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_PSLO (src, k, index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PSLO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PSLO (mv, index, v, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_PSLO (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_EPI32LO (mv, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_EPI32LO (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMERGE2L1H (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMERGE2L1H (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMERGE2L1L (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMERGE2L1L (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenKNC01 extends CGenIntrinsics {

  val IR: KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MAXABS_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maxabs_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MAXABS_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_maxabs_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMAX_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmax_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMAX_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmax_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMAXABS_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmaxabs_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMAXABS_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmaxabs_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMAX_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmax_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMAX_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmax_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMIN_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmin_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMIN_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmin_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_GMIN_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmin_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMIN_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmin_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MULHI_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhi_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MULHI_EPI32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MULHI_EPU32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mulhi_epu32(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_MULHI_EPU32(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_mulhi_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_PERMUTE4F128_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute4f128_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_PERMUTE4F128_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute4f128_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_RCP23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rcp23_ps(${quote(a)})")
    case iDef@MM512_MASK_RCP23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rcp23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_ROUND_PS(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_round_ps(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_ROUND_PS(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_ROUNDFXPNT_ADJUST_PS(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundfxpnt_adjust_ps(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_ROUNDFXPNT_ADJUST_PS(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundfxpnt_adjust_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_ROUNDFXPNT_ADJUST_PD(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundfxpnt_adjust_pd(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_ROUNDFXPNT_ADJUST_PD(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundfxpnt_adjust_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_RSQRT23_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_rsqrt23_ps(${quote(a)})")
    case iDef@MM512_MASK_RSQRT23_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_rsqrt23_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_SCALE_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scale_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SCALE_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_SCALE_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_scale_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_SCALE_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scale_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_LOG2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log2_ps(${quote(a)})")
    case iDef@MM512_MASK_LOG2_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_log2_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_REDUCE_GMIN_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmin_ps(${quote(a)})")
    case iDef@MM512_MASK_REDUCE_GMIN_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmin_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_REDUCE_GMIN_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmin_pd(${quote(a)})")
    case iDef@MM512_MASK_REDUCE_GMIN_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmin_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_REDUCE_GMAX_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmax_ps(${quote(a)})")
    case iDef@MM512_MASK_REDUCE_GMAX_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmax_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_REDUCE_GMAX_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmax_pd(${quote(a)})")
    case iDef@MM512_MASK_REDUCE_GMAX_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmax_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM_TZCNTI_32(a, x) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnti_32(${quote(a)}, ${quote(x)})")
    case iDef@MM_TZCNTI_64(a, x) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_tzcnti_64(${quote(a)}, ${quote(x)})")
    case iDef@MM_DELAY_32(r1) =>
      headers += iDef.header
      stream.println(s"_mm_delay_32(${quote(r1)});")
    case iDef@MM_DELAY_64(r1) =>
      headers += iDef.header
      stream.println(s"_mm_delay_64(${quote(r1)});")
    case iDef@MM_SPFLT_32(r1) =>
      headers += iDef.header
      stream.println(s"_mm_spflt_32(${quote(r1)});")
    case iDef@MM_SPFLT_64(r1) =>
      headers += iDef.header
      stream.println(s"_mm_spflt_64(${quote(r1)});")
    case iDef@MM_CLEVICT(ptr, level, ptrOffset) =>
      headers += iDef.header
      stream.println(s"_mm_clevict((const void *) ${quote(ptr) + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}, ${quote(level)});")
    case iDef@MM512_KANDNR(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kandnr(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KSWAPB(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kswapb(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KORTESTZ(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kortestz(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KORTESTC(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kortestc(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_MASK2INT(k1) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask2int(${quote(k1)})")
    case iDef@MM512_INT2MASK(mask) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_int2mask(${quote(mask)})")
    case iDef@MM512_KCONCATHI_64(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kconcathi_64(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KCONCATLO_64(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kconcatlo_64(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KEXTRACT_64(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kextract_64(${quote(a)}, ${quote(b)})")
    case iDef@MM512_FMADD233_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmadd233_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_FMADD233_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd233_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_I64EXTGATHER_EPI32LO(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_epi32lo(${quote(index)}, (void const*) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_I64EXTGATHER_EPI32LO(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_epi32lo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const*) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_I64EXTGATHER_EPI64(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_epi64(${quote(index)}, (void const*) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_I64EXTGATHER_EPI64(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_epi64(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const*) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_I64EXTGATHER_PSLO(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_pslo(${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_I64EXTGATHER_PSLO(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_pslo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_I64EXTGATHER_PD(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_pd(${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_I64EXTGATHER_PD(src, k, index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64extgather_pd(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_I64EXTSCATTER_PSLO(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_pslo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_I64EXTSCATTER_PSLO(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_pslo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_I64EXTSCATTER_PD(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_pd((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_I64EXTSCATTER_PD(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_pd((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_I64EXTSCATTER_EPI32LO(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_epi32lo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_I64EXTSCATTER_EPI32LO(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_epi32lo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_I64EXTSCATTER_EPI64(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_epi64((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_I64EXTSCATTER_EPI64(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_epi64((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_PERMUTE4F128_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute4f128_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_PERMUTE4F128_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_permute4f128_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_I64GATHER_EPI32LO(index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_epi32lo(${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(scale)})")
    case iDef@MM512_MASK_I64GATHER_EPI32LO(src, k, index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_epi32lo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(scale)})")
    case iDef@MM512_I64GATHER_PSLO(index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_pslo(${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(scale)})")
    case iDef@MM512_MASK_I64GATHER_PSLO(src, k, index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_pslo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(scale)})")
    case iDef@MM512_I64SCATTER_PSLO(mv, index, v, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_pslo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v)}, ${quote(scale)});")
    case iDef@MM512_MASK_I64SCATTER_PSLO(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_pslo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_I64SCATTER_EPI32LO(mv, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_epi32lo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_I64SCATTER_EPI32LO(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_epi32lo((void *) ${quote(mv) + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}, ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_KMERGE2L1H(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmerge2l1h(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_KMERGE2L1L(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmerge2l1l(${quote(k1)}, ${quote(k2)})")
    case _ => super.emitNode(sym, rhs)
  }
}
