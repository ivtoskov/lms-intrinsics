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

    
trait FMA extends IntrinsicsBase {
  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FNMADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FNMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMADDSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FNMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMADDSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FNMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMSUB_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the negated intermediate result to the lower element in "c".
   * Store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FNMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FMADDSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FNMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FMADDSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMSUBADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FMSUBADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst", and copy the upper element from "a"
   * to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FMSUBADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FNMSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FNMADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the negated intermediate result, and
   * store the results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FNMSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the negated intermediate
   * result. Store the result in the lower element of "dst", and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FNMSUB_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map (
      Haswell -> Performance(Some(5.0), Some(0.5))
    )
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FMADD_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst", and copy the upper element
   * from "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FMSUB_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FNMADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMSUBADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FMSUB_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m256, b: __m256, c: __m256
   */
  case class MM256_FMSUB_PS(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]) extends IntrinsicsDef[__m256] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMADD_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst".
   * a: __m128, b: __m128, c: __m128
   */
  case class MM_FMSUB_PS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst".
   * a: __m256d, b: __m256d, c: __m256d
   */
  case class MM256_FMADD_PD(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the negated intermediate result to packed elements in "c", and store
   * the results in "dst".
   * a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_FNMADD_PD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm256_fnmadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FNMADD_PD(a, b, c)
  }
            
  def _mm_fnmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FNMSUB_PD(a, b, c)
  }
            
  def _mm_fmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMADD_PD(a, b, c)
  }
            
  def _mm_fmaddsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMADDSUB_PD(a, b, c)
  }
            
  def _mm_fnmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FNMSUB_SS(a, b, c)
  }
            
  def _mm_fmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMSUB_SS(a, b, c)
  }
            
  def _mm_fmaddsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMADDSUB_PS(a, b, c)
  }
            
  def _mm_fnmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FNMADD_SS(a, b, c)
  }
            
  def _mm_fmsub_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMSUB_PD(a, b, c)
  }
            
  def _mm_fnmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FNMADD_SD(a, b, c)
  }
            
  def _mm256_fmaddsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FMADDSUB_PS(a, b, c)
  }
            
  def _mm256_fnmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FNMSUB_PD(a, b, c)
  }
            
  def _mm256_fmaddsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FMADDSUB_PD(a, b, c)
  }
            
  def _mm_fmsubadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMSUBADD_PD(a, b, c)
  }
            
  def _mm256_fmsubadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FMSUBADD_PD(a, b, c)
  }
            
  def _mm_fmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMADD_SD(a, b, c)
  }
            
  def _mm256_fmsubadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FMSUBADD_PS(a, b, c)
  }
            
  def _mm256_fnmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FNMSUB_PS(a, b, c)
  }
            
  def _mm256_fnmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FNMADD_PS(a, b, c)
  }
            
  def _mm_fnmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FNMSUB_PS(a, b, c)
  }
            
  def _mm_fnmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FNMSUB_SD(a, b, c)
  }
            
  def _mm256_fmadd_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FMADD_PS(a, b, c)
  }
            
  def _mm_fmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FMSUB_SD(a, b, c)
  }
            
  def _mm_fnmadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FNMADD_PS(a, b, c)
  }
            
  def _mm_fmsubadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMSUBADD_PS(a, b, c)
  }
            
  def _mm_fmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMADD_SS(a, b, c)
  }
            
  def _mm256_fmsub_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FMSUB_PD(a, b, c)
  }
            
  def _mm256_fmsub_ps(a: Exp[__m256], b: Exp[__m256], c: Exp[__m256]): Exp[__m256] = {
    MM256_FMSUB_PS(a, b, c)
  }
            
  def _mm_fmadd_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMADD_PS(a, b, c)
  }
            
  def _mm_fmsub_ps(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_FMSUB_PS(a, b, c)
  }
            
  def _mm256_fmadd_pd(a: Exp[__m256d], b: Exp[__m256d], c: Exp[__m256d]): Exp[__m256d] = {
    MM256_FMADD_PD(a, b, c)
  }
            
  def _mm_fnmadd_pd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_FNMADD_PD(a, b, c)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM256_FNMADD_PD (a, b, c) =>
      _mm256_fnmadd_pd(f(a), f(b), f(c))
    case MM_FNMSUB_PD (a, b, c) =>
      _mm_fnmsub_pd(f(a), f(b), f(c))
    case MM_FMADD_PD (a, b, c) =>
      _mm_fmadd_pd(f(a), f(b), f(c))
    case MM_FMADDSUB_PD (a, b, c) =>
      _mm_fmaddsub_pd(f(a), f(b), f(c))
    case MM_FNMSUB_SS (a, b, c) =>
      _mm_fnmsub_ss(f(a), f(b), f(c))
    case MM_FMSUB_SS (a, b, c) =>
      _mm_fmsub_ss(f(a), f(b), f(c))
    case MM_FMADDSUB_PS (a, b, c) =>
      _mm_fmaddsub_ps(f(a), f(b), f(c))
    case MM_FNMADD_SS (a, b, c) =>
      _mm_fnmadd_ss(f(a), f(b), f(c))
    case MM_FMSUB_PD (a, b, c) =>
      _mm_fmsub_pd(f(a), f(b), f(c))
    case MM_FNMADD_SD (a, b, c) =>
      _mm_fnmadd_sd(f(a), f(b), f(c))
    case MM256_FMADDSUB_PS (a, b, c) =>
      _mm256_fmaddsub_ps(f(a), f(b), f(c))
    case MM256_FNMSUB_PD (a, b, c) =>
      _mm256_fnmsub_pd(f(a), f(b), f(c))
    case MM256_FMADDSUB_PD (a, b, c) =>
      _mm256_fmaddsub_pd(f(a), f(b), f(c))
    case MM_FMSUBADD_PD (a, b, c) =>
      _mm_fmsubadd_pd(f(a), f(b), f(c))
    case MM256_FMSUBADD_PD (a, b, c) =>
      _mm256_fmsubadd_pd(f(a), f(b), f(c))
    case MM_FMADD_SD (a, b, c) =>
      _mm_fmadd_sd(f(a), f(b), f(c))
    case MM256_FMSUBADD_PS (a, b, c) =>
      _mm256_fmsubadd_ps(f(a), f(b), f(c))
    case MM256_FNMSUB_PS (a, b, c) =>
      _mm256_fnmsub_ps(f(a), f(b), f(c))
    case MM256_FNMADD_PS (a, b, c) =>
      _mm256_fnmadd_ps(f(a), f(b), f(c))
    case MM_FNMSUB_PS (a, b, c) =>
      _mm_fnmsub_ps(f(a), f(b), f(c))
    case MM_FNMSUB_SD (a, b, c) =>
      _mm_fnmsub_sd(f(a), f(b), f(c))
    case MM256_FMADD_PS (a, b, c) =>
      _mm256_fmadd_ps(f(a), f(b), f(c))
    case MM_FMSUB_SD (a, b, c) =>
      _mm_fmsub_sd(f(a), f(b), f(c))
    case MM_FNMADD_PS (a, b, c) =>
      _mm_fnmadd_ps(f(a), f(b), f(c))
    case MM_FMSUBADD_PS (a, b, c) =>
      _mm_fmsubadd_ps(f(a), f(b), f(c))
    case MM_FMADD_SS (a, b, c) =>
      _mm_fmadd_ss(f(a), f(b), f(c))
    case MM256_FMSUB_PD (a, b, c) =>
      _mm256_fmsub_pd(f(a), f(b), f(c))
    case MM256_FMSUB_PS (a, b, c) =>
      _mm256_fmsub_ps(f(a), f(b), f(c))
    case MM_FMADD_PS (a, b, c) =>
      _mm_fmadd_ps(f(a), f(b), f(c))
    case MM_FMSUB_PS (a, b, c) =>
      _mm_fmsub_ps(f(a), f(b), f(c))
    case MM256_FMADD_PD (a, b, c) =>
      _mm256_fmadd_pd(f(a), f(b), f(c))
    case MM_FNMADD_PD (a, b, c) =>
      _mm_fnmadd_pd(f(a), f(b), f(c))

    case Reflect(MM256_FNMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FNMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADDSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADDSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_SS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_SS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_SS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_SS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADDSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADDSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_SS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_SS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_SD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_SD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMADDSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMADDSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FNMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FNMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMADDSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMADDSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUBADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUBADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMSUBADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMSUBADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_SD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_SD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMSUBADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMSUBADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FNMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FNMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FNMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FNMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMSUB_SD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMSUB_SD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_SD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_SD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUBADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUBADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_SS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_SS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM256_FMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM256_FMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FNMADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_FNMADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenFMA extends CGenIntrinsics {

  val IR: FMA
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM256_FNMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADDSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMSUB_SS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUB_SS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADDSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMADD_SS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMADD_SD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMADDSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FNMSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fnmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMADDSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUBADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMSUBADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADD_SD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMSUBADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FNMSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FNMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMSUB_SD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUB_SD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUBADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADD_SS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM256_FMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm256_fmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FNMADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fnmadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case _ => super.emitNode(sym, rhs)
  }
}
