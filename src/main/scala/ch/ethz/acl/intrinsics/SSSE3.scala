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

    
trait SSSE3 extends IntrinsicsBase {
  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst".
   * a: __m64, b: __m64
   */
  case class MM_MULHRS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m128i
   */
  case class MM_ABS_EPI32(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m64
   */
  case class MM_ABS_PI16(a: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 32-bit integers in "a" and "b", and pack
   * the signed 32-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HADD_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Concatenate 16-byte blocks in "a" and "b" into a 32-byte temporary result,
   * shift the result right by "count" bytes, and store the low 16 bytes in "dst".
   * a: __m128i, b: __m128i, count: int
   */
  case class MM_ALIGNR_EPI8(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_SHUFFLE_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 32-bit integers in "a" and "b", and pack
   * the signed 32-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HADD_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 32-bit integers in "a" and "b", and
   * pack the signed 32-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HSUB_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 8-bit integers in "a" when the corresponding signed 8-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_SIGN_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 8-bit integers in "a" when the corresponding signed 8-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m64, b: __m64
   */
  case class MM_SIGN_PI8(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HADDS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 32-bit integers in "a" and "b", and
   * pack the signed 32-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HSUB_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m64
   */
  case class MM_ABS_PI8(a: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 32-bit integers in "a" when the corresponding signed 32-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m64, b: __m64
   */
  case class MM_SIGN_PI32(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HSUBS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b", and
   * pack the signed 16-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HSUB_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b", and pack
   * the signed 16-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HADD_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Vertically multiply each unsigned 8-bit integer from "a" with the
   * corresponding signed 8-bit integer from "b", producing intermediate signed
   * 16-bit integers. Horizontally add adjacent pairs of intermediate signed 16-bit
   * integers, and pack the saturated results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_MADDUBS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HSUBS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 16-bit integers in "a" when the corresponding signed 16-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_SIGN_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 16-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m128i
   */
  case class MM_ABS_EPI16(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b" using
   * saturation, and pack the signed 16-bit results in "dst".
   * a: __m64, b: __m64
   */
  case class MM_HADDS_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Shuffle packed 8-bit integers in "a" according to shuffle control mask in the
   * corresponding 8-bit element of "b", and store the results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_SHUFFLE_EPI8(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 16-bit integers in "a" when the corresponding signed 16-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m64, b: __m64
   */
  case class MM_SIGN_PI16(a: Exp[__m64], b: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally subtract adjacent pairs of 16-bit integers in "a" and "b", and
   * pack the signed 16-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HSUB_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Concatenate 8-byte blocks in "a" and "b" into a 16-byte temporary result,
   * shift the result right by "count" bytes, and store the low 16 bytes in "dst".
   * a: __m64, b: __m64, count: int
   */
  case class MM_ALIGNR_PI8(a: Exp[__m64], b: Exp[__m64], count: Exp[Int]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Horizontally add adjacent pairs of 16-bit integers in "a" and "b", and pack
   * the signed 16-bit results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_HADD_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 8-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m128i
   */
  case class MM_ABS_EPI8(a: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Compute the absolute value of packed 32-bit integers in "a", and store the
   * unsigned results in "dst".
   * a: __m64
   */
  case class MM_ABS_PI32(a: Exp[__m64]) extends IntrinsicsDef[__m64] {
    val category = List(IntrinsicsCategory.SpecialMathFunctions)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Negate packed 32-bit integers in "a" when the corresponding signed 32-bit
   * integer in "b" is negative, and store the results in "dst". Element in "dst"
   * are zeroed out when the corresponding element in "b" is zero.
   * a: __m128i, b: __m128i
   */
  case class MM_SIGN_EPI32(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Vertically multiply each unsigned 8-bit integer from "a" with the
   * corresponding signed 8-bit integer from "b", producing intermediate signed
   * 16-bit integers. Horizontally add adjacent pairs of intermediate signed 16-bit
   * integers, and pack the saturated results in "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MADDUBS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  /**
   * Multiply packed 16-bit integers in "a" and "b", producing intermediate signed
   * 32-bit integers. Truncate each intermediate integer to the 18 most significant
   * bits, round by adding 1, and store bits [16:1] to "dst".
   * a: __m128i, b: __m128i
   */
  case class MM_MULHRS_EPI16(a: Exp[__m128i], b: Exp[__m128i]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "tmmintrin.h"
  }
      

  def _mm_mulhrs_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MULHRS_PI16(a, b)
  }
            
  def _mm_abs_epi32(a: Exp[__m128i]): Exp[__m128i] = {
    MM_ABS_EPI32(a)
  }
            
  def _mm_abs_pi16(a: Exp[__m64]): Exp[__m64] = {
    MM_ABS_PI16(a)
  }
            
  def _mm_hadd_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HADD_EPI32(a, b)
  }
            
  def _mm_alignr_epi8(a: Exp[__m128i], b: Exp[__m128i], count: Exp[Int]): Exp[__m128i] = {
    MM_ALIGNR_EPI8(a, b, count)
  }
            
  def _mm_shuffle_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SHUFFLE_PI8(a, b)
  }
            
  def _mm_hadd_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HADD_PI32(a, b)
  }
            
  def _mm_hsub_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HSUB_PI32(a, b)
  }
            
  def _mm_sign_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SIGN_EPI8(a, b)
  }
            
  def _mm_sign_pi8(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SIGN_PI8(a, b)
  }
            
  def _mm_hadds_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HADDS_EPI16(a, b)
  }
            
  def _mm_hsub_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HSUB_EPI32(a, b)
  }
            
  def _mm_abs_pi8(a: Exp[__m64]): Exp[__m64] = {
    MM_ABS_PI8(a)
  }
            
  def _mm_sign_pi32(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SIGN_PI32(a, b)
  }
            
  def _mm_hsubs_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HSUBS_EPI16(a, b)
  }
            
  def _mm_hsub_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HSUB_PI16(a, b)
  }
            
  def _mm_hadd_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HADD_PI16(a, b)
  }
            
  def _mm_maddubs_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_MADDUBS_PI16(a, b)
  }
            
  def _mm_hsubs_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HSUBS_PI16(a, b)
  }
            
  def _mm_sign_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SIGN_EPI16(a, b)
  }
            
  def _mm_abs_epi16(a: Exp[__m128i]): Exp[__m128i] = {
    MM_ABS_EPI16(a)
  }
            
  def _mm_hadds_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_HADDS_PI16(a, b)
  }
            
  def _mm_shuffle_epi8(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SHUFFLE_EPI8(a, b)
  }
            
  def _mm_sign_pi16(a: Exp[__m64], b: Exp[__m64]): Exp[__m64] = {
    MM_SIGN_PI16(a, b)
  }
            
  def _mm_hsub_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HSUB_EPI16(a, b)
  }
            
  def _mm_alignr_pi8(a: Exp[__m64], b: Exp[__m64], count: Exp[Int]): Exp[__m64] = {
    MM_ALIGNR_PI8(a, b, count)
  }
            
  def _mm_hadd_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_HADD_EPI16(a, b)
  }
            
  def _mm_abs_epi8(a: Exp[__m128i]): Exp[__m128i] = {
    MM_ABS_EPI8(a)
  }
            
  def _mm_abs_pi32(a: Exp[__m64]): Exp[__m64] = {
    MM_ABS_PI32(a)
  }
            
  def _mm_sign_epi32(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_SIGN_EPI32(a, b)
  }
            
  def _mm_maddubs_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MADDUBS_EPI16(a, b)
  }
            
  def _mm_mulhrs_epi16(a: Exp[__m128i], b: Exp[__m128i]): Exp[__m128i] = {
    MM_MULHRS_EPI16(a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM_MULHRS_PI16 (a, b) =>
      _mm_mulhrs_pi16(f(a), f(b))
    case MM_ABS_EPI32 (a) =>
      _mm_abs_epi32(f(a))
    case MM_ABS_PI16 (a) =>
      _mm_abs_pi16(f(a))
    case MM_HADD_EPI32 (a, b) =>
      _mm_hadd_epi32(f(a), f(b))
    case MM_ALIGNR_EPI8 (a, b, count) =>
      _mm_alignr_epi8(f(a), f(b), f(count))
    case MM_SHUFFLE_PI8 (a, b) =>
      _mm_shuffle_pi8(f(a), f(b))
    case MM_HADD_PI32 (a, b) =>
      _mm_hadd_pi32(f(a), f(b))
    case MM_HSUB_PI32 (a, b) =>
      _mm_hsub_pi32(f(a), f(b))
    case MM_SIGN_EPI8 (a, b) =>
      _mm_sign_epi8(f(a), f(b))
    case MM_SIGN_PI8 (a, b) =>
      _mm_sign_pi8(f(a), f(b))
    case MM_HADDS_EPI16 (a, b) =>
      _mm_hadds_epi16(f(a), f(b))
    case MM_HSUB_EPI32 (a, b) =>
      _mm_hsub_epi32(f(a), f(b))
    case MM_ABS_PI8 (a) =>
      _mm_abs_pi8(f(a))
    case MM_SIGN_PI32 (a, b) =>
      _mm_sign_pi32(f(a), f(b))
    case MM_HSUBS_EPI16 (a, b) =>
      _mm_hsubs_epi16(f(a), f(b))
    case MM_HSUB_PI16 (a, b) =>
      _mm_hsub_pi16(f(a), f(b))
    case MM_HADD_PI16 (a, b) =>
      _mm_hadd_pi16(f(a), f(b))
    case MM_MADDUBS_PI16 (a, b) =>
      _mm_maddubs_pi16(f(a), f(b))
    case MM_HSUBS_PI16 (a, b) =>
      _mm_hsubs_pi16(f(a), f(b))
    case MM_SIGN_EPI16 (a, b) =>
      _mm_sign_epi16(f(a), f(b))
    case MM_ABS_EPI16 (a) =>
      _mm_abs_epi16(f(a))
    case MM_HADDS_PI16 (a, b) =>
      _mm_hadds_pi16(f(a), f(b))
    case MM_SHUFFLE_EPI8 (a, b) =>
      _mm_shuffle_epi8(f(a), f(b))
    case MM_SIGN_PI16 (a, b) =>
      _mm_sign_pi16(f(a), f(b))
    case MM_HSUB_EPI16 (a, b) =>
      _mm_hsub_epi16(f(a), f(b))
    case MM_ALIGNR_PI8 (a, b, count) =>
      _mm_alignr_pi8(f(a), f(b), f(count))
    case MM_HADD_EPI16 (a, b) =>
      _mm_hadd_epi16(f(a), f(b))
    case MM_ABS_EPI8 (a) =>
      _mm_abs_epi8(f(a))
    case MM_ABS_PI32 (a) =>
      _mm_abs_pi32(f(a))
    case MM_SIGN_EPI32 (a, b) =>
      _mm_sign_epi32(f(a), f(b))
    case MM_MADDUBS_EPI16 (a, b) =>
      _mm_maddubs_epi16(f(a), f(b))
    case MM_MULHRS_EPI16 (a, b) =>
      _mm_mulhrs_epi16(f(a), f(b))

    case Reflect(MM_MULHRS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHRS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_EPI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_EPI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_PI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_PI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_EPI8 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_EPI8 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_PI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_PI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADDS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADDS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_PI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_PI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_PI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_PI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADDUBS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MADDUBS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUBS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUBS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_EPI16 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_EPI16 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADDS_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADDS_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SHUFFLE_EPI8 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SHUFFLE_EPI8 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_PI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_PI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HSUB_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HSUB_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ALIGNR_PI8 (a, b, count), u, es) =>
      reflectMirrored(Reflect(MM_ALIGNR_PI8 (f(a), f(b), f(count)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_HADD_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_HADD_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_EPI8 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_EPI8 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_ABS_PI32 (a), u, es) =>
      reflectMirrored(Reflect(MM_ABS_PI32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SIGN_EPI32 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_SIGN_EPI32 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MADDUBS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MADDUBS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MULHRS_EPI16 (a, b), u, es) =>
      reflectMirrored(Reflect(MM_MULHRS_EPI16 (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenSSSE3 extends CGenIntrinsics {

  val IR: SSSE3
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM_MULHRS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhrs_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ABS_EPI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_epi32(${quote(a)})")
    case iDef@MM_ABS_PI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_pi16(${quote(a)})")
    case iDef@MM_HADD_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_ALIGNR_EPI8(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_alignr_epi8(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_SHUFFLE_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_HADD_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUB_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_SIGN_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SIGN_PI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_pi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_HADDS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadds_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUB_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_ABS_PI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_pi8(${quote(a)})")
    case iDef@MM_SIGN_PI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_pi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsubs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUB_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_HADD_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MADDUBS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maddubs_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUBS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsubs_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SIGN_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ABS_EPI16(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_epi16(${quote(a)})")
    case iDef@MM_HADDS_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadds_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_SHUFFLE_EPI8(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_shuffle_epi8(${quote(a)}, ${quote(b)})")
    case iDef@MM_SIGN_PI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_pi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_HSUB_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hsub_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ALIGNR_PI8(a, b, count) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_alignr_pi8(${quote(a)}, ${quote(b)}, ${quote(count)})")
    case iDef@MM_HADD_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_hadd_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_ABS_EPI8(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_epi8(${quote(a)})")
    case iDef@MM_ABS_PI32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_abs_pi32(${quote(a)})")
    case iDef@MM_SIGN_EPI32(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_sign_epi32(${quote(a)}, ${quote(b)})")
    case iDef@MM_MADDUBS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maddubs_epi16(${quote(a)}, ${quote(b)})")
    case iDef@MM_MULHRS_EPI16(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mulhrs_epi16(${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
