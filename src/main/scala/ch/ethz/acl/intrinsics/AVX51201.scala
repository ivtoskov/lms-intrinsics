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

    
trait AVX51201 extends IntrinsicsBase {
  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst". 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all exceptions.
   * a: __m512, sae: int
   */
  case class MM512_CVTT_ROUNDPS_EPU32(a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst".
   * a: __m512
   */
  case class MM512_CVTTPS_EPU32(a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).  
   * 	Pass __MM_FROUND_NO_EXC to "sae" to
   * suppress all exceptions.
   * src: __m512i, k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASK_CVTT_ROUNDPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, a: __m512
   */
  case class MM512_MASK_CVTTPS_EPU32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed single-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set). 
   * 	Pass __MM_FROUND_NO_EXC to "sae" to suppress all
   * exceptions.
   * k: __mmask16, a: __m512, sae: int
   */
  case class MM512_MASKZ_CVTT_ROUNDPS_EPU32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed double-precision (32-bit) floating-point elements in "a" to
   * packed unsigned 32-bit integers with truncation, and store the results in
   * "dst" using zeromask "k" (elements are zeroed out when the corresponding mask
   * bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_CVTTPS_EPU32(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_I32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_I64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_SI32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_SI64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_I32(a: Exp[__m128d]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_U32(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 64-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128d, rounding: int
   */
  case class MM_CVTT_ROUNDSD_U64(a: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[ULong] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower double-precision (64-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in "dst".
   * a: __m128d
   */
  case class MM_CVTTSD_U32(a: Exp[__m128d]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_I32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_I64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_SI32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 64-bit integer with truncation, and store the result in "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_SI64(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[Long] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the lower single-precision (32-bit) floating-point element in "a" to a
   * 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_I32(a: Exp[__m128]) extends IntrinsicsDef[Int] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in
   * "dst".
   * 	[round_note]
   * a: __m128, rounding: int
   */
  case class MM_CVTT_ROUNDSS_U32(a: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Convert the lower single-precision (32-bit) floating-point element in "a" to
   * an unsigned 32-bit integer with truncation, and store the result in "dst".
   * a: __m128
   */
  case class MM_CVTTSS_U32(a: Exp[__m128]) extends IntrinsicsDef[UInt] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst".
   * a: __m256i
   */
  case class MM512_CVTEPU32_PD(a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512d, k: __mmask8, a: __m256i
   */
  case class MM512_MASK_CVTEPU32_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed double-precision
   * (64-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask8, a: __m256i
   */
  case class MM512_MASKZ_CVTEPU32_PD(k: Exp[Int], a: Exp[__m256i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in
   * "dst".
   * 	[round_note]
   * a: __m512i, rounding: int
   */
  case class MM512_CVT_ROUNDEPU32_PS(a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set). 
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDEPU32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * src: __m512, k: __mmask16, a: __m512i
   */
  case class MM512_MASK_CVTEPU32_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512i, rounding: int
   */
  case class MM512_MASKZ_CVT_ROUNDEPU32_PS(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert packed unsigned 32-bit integers in "a" to packed single-precision
   * (32-bit) floating-point elements, and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set).
   * k: __mmask16, a: __m512i
   */
  case class MM512_MASKZ_CVTEPU32_PS(k: Exp[Int], a: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * 
   * 	[round_note]
   * a: __m128d, b: unsigned __int64, rounding: int
   */
  case class MM_CVT_ROUNDU64_SD(a: Exp[__m128d], b: Exp[ULong], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 32-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: unsigned int
   */
  case class MM_CVTU32_SD(a: Exp[__m128d], b: Exp[UInt]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 64-bit integer "b" to a double-precision (64-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper element from "a" to the upper element of "dst".
   * a: __m128d, b: unsigned __int64
   */
  case class MM_CVTU64_SD(a: Exp[__m128d], b: Exp[ULong]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Convert the unsigned 32-bit integer "b" to a single-precision (32-bit)
   * floating-point element, store the result in the lower element of "dst", and
   * copy the upper 3 packed elements from "a" to the upper elements of "dst".
   * 
   * 	[round_note]
   * a: __m128, b: unsigned int, rounding: int
   */
  case class MM_CVT_ROUNDU32_SS(a: Exp[__m128], b: Exp[UInt], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
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
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst".
   * a: __m512d, b: __m512d
   */
  case class MM512_DIV_PD(a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", =and store the results in "dst".
   * 	[round_note]
   * a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_DIV_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASK_DIV_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512d, k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASK_DIV_ROUND_PD(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d
   */
  case class MM512_MASKZ_DIV_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed double-precision (64-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, rounding: int
   */
  case class MM512_MASKZ_DIV_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASK_DIV_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_DIV_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512
   */
  case class MM512_MASKZ_DIV_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide packed single-precision (32-bit) floating-point elements in "a" by
   * packed elements in "b", and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASKZ_DIV_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper element from "a" to
   * the upper element of "dst".
   * 		[round_note]
   * a: __m128d, b: __m128d, rounding: int
   */
  case class MM_DIV_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * 		[round_note]
   * src: __m128d, k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASK_DIV_ROUND_SD(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * 		[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, rounding: int
   */
  case class MM_MASKZ_DIV_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower double-precision (64-bit) floating-point element in "a" by
   * the lower double-precision (64-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper element from "a" to the
   * upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d
   */
  case class MM_MASKZ_DIV_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst", and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 		[round_note]
   * a: __m128, b: __m128, rounding: int
   */
  case class MM_DIV_ROUND_SS(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using writemask "k" (the element is
   * copied from "src" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 		[round_note]
   * src: __m128, k: __mmask8, a: __m128, b: __m128, rounding: int
   */
  case class MM_MASK_DIV_ROUND_SS(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Divide the lower single-precision (32-bit) floating-point element in "a" by
   * the lower single-precision (32-bit) floating-point element in "b", store the
   * result in the lower element of "dst" using zeromask "k" (the element is zeroed
   * out when mask bit 0 is not set), and copy the upper 3 packed elements from "a"
   * to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128
   */
  case class MM_MASKZ_DIV_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active double-precision (64-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d
   */
  case class MM512_MASKZ_EXPAND_PD(k: Exp[Int], a: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
  case class MM512_MASKZ_EXPANDLOADU_PD[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m512, k: __mmask16, a: __m512
   */
  case class MM512_MASK_EXPAND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using writemask "k" (elements are copied
   * from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASK_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * "a" (those with their respective bit set in mask "k"), and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask16, a: __m512
   */
  case class MM512_MASKZ_EXPAND_PS(k: Exp[Int], a: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Load contiguous active single-precision (32-bit) floating-point elements from
   * unaligned memory at "mem_addr" (those with their respective bit set in mask
   * "k"), and store the results in "dst" using zeromask "k" (elements are zeroed
   * out when the corresponding mask bit is not set).
   * k: __mmask16, mem_addr: void const*, mem_addrOffset: int
   */
  case class MM512_MASKZ_EXPANDLOADU_PS[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load, IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the result
   * in "dst".
   * a: __m512d, imm8: int
   */
  case class MM512_EXTRACTF64X4_PD(a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using writemask "k" (elements are copied from "src" when the
   * corresponding mask bit is not set).
   * src: __m256d, k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASK_EXTRACTF64X4_PD(src: Exp[__m256d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed double-precision (64-bit)
   * floating-point elements) from "a", selected with "imm8", and store the results
   * in "dst" using zeromask "k" (elements are zeroed out when the corresponding
   * mask bit is not set).
   * k: __mmask8, a: __m512d, imm8: int
   */
  case class MM512_MASKZ_EXTRACTF64X4_PD(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]) extends IntrinsicsDef[__m256d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI32X4_EPI32(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m128i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI32X4_EPI32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 128 bits (composed of 4 packed 32-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI32X4_EPI32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m128i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the result in "dst".
   * a: __m512i, imm8: int
   */
  case class MM512_EXTRACTI64X4_EPI64(a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m256i, k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASK_EXTRACTI64X4_EPI64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Extract 256 bits (composed of 4 packed 64-bit integers) from "a", selected
   * with "imm8", and store the results in "dst" using zeromask "k" (elements are
   * zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512i, imm8: int
   */
  case class MM512_MASKZ_EXTRACTI64X4_EPI64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m256i] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_FIXUPIMM_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512i, imm8: int
   */
  case class MM512_MASK_FIXUPIMM_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASK_FIXUPIMM_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512i, imm8: int
   */
  case class MM512_MASKZ_FIXUPIMM_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed double-precision (64-bit) floating-point elements in "a" and "b"
   * using packed 64-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASKZ_FIXUPIMM_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * a: __m512, b: __m512, c: __m512i, imm8: int
   */
  case class MM512_FIXUPIMM_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst". "imm8" is
   * used to set the required flags reporting.
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_FIXUPIMM_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * a: __m512, k: __mmask16, b: __m512, c: __m512i, imm8: int
   */
  case class MM512_MASK_FIXUPIMM_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * writemask "k" (elements are copied from "a" when the corresponding mask bit is
   * not set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASK_FIXUPIMM_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
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
   * Fix up packed single-precision (32-bit) floating-point elements in "a" and "b"
   * using packed 32-bit integers in "c", and store the results in "dst" using
   * zeromask "k" (elements are zeroed out when the corresponding mask bit is not
   * set). "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512i, imm8: int, rounding: int
   */
  case class MM512_MASKZ_FIXUPIMM_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASK_FIXUPIMM_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASKZ_FIXUPIMM_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower double-precision (64-bit) floating-point elements in "a" and
   * "b" using the lower 64-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper element from "a" to the upper element of
   * "dst". "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_FIXUPIMM_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst", and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_FIXUPIMM_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASK_FIXUPIMM_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using writemask "k" (the element is copied from "a" when mask
   * bit 0 is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * a: __m128, k: __mmask8, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASK_FIXUPIMM_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags
   * reporting.
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128i, imm8: int, rounding: int
   */
  case class MM_MASKZ_FIXUPIMM_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Fix up the lower single-precision (32-bit) floating-point elements in "a" and
   * "b" using the lower 32-bit integer in "c", store the result in the lower
   * element of "dst" using zeromask "k" (the element is zeroed out when mask bit 0
   * is not set), and copy the upper 3 packed elements from "a" to the upper
   * elements of "dst". "imm8" is used to set the required flags reporting.
   * k: __mmask8, a: __m128, b: __m128, c: __m128i, imm8: int
   */
  case class MM_MASKZ_FIXUPIMM_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", add the intermediate result to packed elements in "c", and store the
   * results in "a" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMADD_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_FMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMADD_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8
   */
  case class MM_MASK3_FMADD_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASK_FMADD_ROUND_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper element from
   * "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMADD_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "c" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMADD_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
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
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FMADD_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FMADD_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using writemask "k" (the element is
   * copied from "a" when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMADD_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FMADD_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and add the intermediate result to the lower element in "c". Store
   * the result in the lower element of "dst" using zeromask "k" (the element is
   * zeroed out when mask bit 0 is not set), and copy the upper 3 packed elements
   * from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMADD_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMADDSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_FMADDSUB_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMADDSUB_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMADDSUB_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * [round_note]
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASK_FMADDSUB_ROUND_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMADDSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMADDSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMADDSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_FMADDSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMADDSUB_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: const int
   */
  case class MM512_MASK3_FMADDSUB_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMADDSUB_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * [round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASK_FMADDSUB_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMADDSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively add and subtract packed elements in "c" to/from the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMADDSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMSUB_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMSUB_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMSUB_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", subtract packed elements in "c" from the intermediate result, and store
   * the results in "dst" using zeromask "k" (elements are zeroed out when the
   * corresponding mask bit is not set). 
   * 	[round_note]
   * k: __mmask16, a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASKZ_FMSUB_ROUND_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * 	[round_note]
   * a: __m128d, b: __m128d, c: __m128d, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMSUB_ROUND_SD(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper
   * element from "a" to the upper element of "dst".
   * a: __m128d, k: __mmask8, b: __m128d, c: __m128d
   */
  case class MM_MASK_FMSUB_SD(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d, rounding: int
   */
  case class MM_MASKZ_FMSUB_ROUND_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]) extends IntrinsicsDef[__m128d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower double-precision (64-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper element from "a"
   * to the upper element of "dst".
   * k: __mmask8, a: __m128d, b: __m128d, c: __m128d
   */
  case class MM_MASKZ_FMSUB_SD(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]) extends IntrinsicsDef[__m128d] {
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
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_FMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, b: __m128, c: __m128, k: __mmask8, rounding: int
   */
  case class MM_MASK3_FMSUB_ROUND_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "c" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, b: __m128, c: __m128, k: __mmask8
   */
  case class MM_MASK3_FMSUB_SS(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * a: __m128, k: __mmask8, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASK_FMSUB_ROUND_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using writemask "k" (the
   * element is copied from "a" when mask bit 0 is not set), and copy the upper 3
   * packed elements from "a" to the upper elements of "dst".
   * a: __m128, k: __mmask8, b: __m128, c: __m128
   */
  case class MM_MASK_FMSUB_SS(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst". 
   * 	[round_note]
   * k: __mmask8, a: __m128, b: __m128, c: __m128, rounding: int
   */
  case class MM_MASKZ_FMSUB_ROUND_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply the lower single-precision (32-bit) floating-point elements in "a"
   * and "b", and subtract the lower element in "c" from the intermediate result.
   * Store the result in the lower element of "dst" using zeromask "k" (the element
   * is zeroed out when mask bit 0 is not set), and copy the upper 3 packed
   * elements from "a" to the upper elements of "dst".
   * k: __mmask8, a: __m128, b: __m128, c: __m128
   */
  case class MM_MASKZ_FMSUB_SS(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]) extends IntrinsicsDef[__m128] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_FMSUBADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_FMSUBADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8
   */
  case class MM512_MASK3_FMSUBADD_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512d, b: __m512d, c: __m512d, k: __mmask8, rounding: const int
   */
  case class MM512_MASK3_FMSUBADD_ROUND_PD(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512d, k: __mmask8, b: __m512d, c: __m512d
   */
  case class MM512_MASK_FMSUBADD_PD(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d
   */
  case class MM512_MASKZ_FMSUBADD_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed double-precision (64-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * 
   * 	[round_note]
   * k: __mmask8, a: __m512d, b: __m512d, c: __m512d, rounding: const int
   */
  case class MM512_MASKZ_FMSUBADD_ROUND_PD(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst".
   * a: __m512, b: __m512, c: __m512
   */
  case class MM512_FMSUBADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst". 
   * 	[round_note]
   * a: __m512, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_FMSUBADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set).
   * a: __m512, b: __m512, c: __m512, k: __mmask16
   */
  case class MM512_MASK3_FMSUBADD_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "c" when the corresponding mask bit is not set). 
   * [round_note]
   * a: __m512, b: __m512, c: __m512, k: __mmask16, rounding: const int
   */
  case class MM512_MASK3_FMSUBADD_ROUND_PS(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not set).
   * a: __m512, k: __mmask16, b: __m512, c: __m512
   */
  case class MM512_MASK_FMSUBADD_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using writemask "k"
   * (elements are copied from "a" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * a: __m512, k: __mmask16, b: __m512, c: __m512, rounding: const int
   */
  case class MM512_MASK_FMSUBADD_ROUND_PS(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in "a" and
   * "b", alternatively subtract and add packed elements in "c" from/to the
   * intermediate result, and store the results in "dst" using zeromask "k"
   * (elements are zeroed out when the corresponding mask bit is not set).
   * k: __mmask16, a: __m512, b: __m512, c: __m512
   */
  case class MM512_MASKZ_FMSUBADD_PS(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  def _mm512_cvtt_roundps_epu32(a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_CVTT_ROUNDPS_EPU32(a, sae)
  }
            
  def _mm512_cvttps_epu32(a: Exp[__m512]): Exp[__m512i] = {
    MM512_CVTTPS_EPU32(a)
  }
            
  def _mm512_mask_cvtt_roundps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTT_ROUNDPS_EPU32(src, k, a, sae)
  }
            
  def _mm512_mask_cvttps_epu32(src: Exp[__m512i], k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASK_CVTTPS_EPU32(src, k, a)
  }
            
  def _mm512_maskz_cvtt_roundps_epu32(k: Exp[Int], a: Exp[__m512], sae: Exp[Int]): Exp[__m512i] = {
    MM512_MASKZ_CVTT_ROUNDPS_EPU32(k, a, sae)
  }
            
  def _mm512_maskz_cvttps_epu32(k: Exp[Int], a: Exp[__m512]): Exp[__m512i] = {
    MM512_MASKZ_CVTTPS_EPU32(k, a)
  }
            
  def _mm_cvtt_roundsd_i32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSD_I32(a, rounding)
  }
            
  def _mm_cvtt_roundsd_i64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSD_I64(a, rounding)
  }
            
  def _mm_cvtt_roundsd_si32(a: Exp[__m128d], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSD_SI32(a, rounding)
  }
            
  def _mm_cvtt_roundsd_si64(a: Exp[__m128d], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSD_SI64(a, rounding)
  }
            
  def _mm_cvttsd_i32(a: Exp[__m128d]): Exp[Int] = {
    MM_CVTTSD_I32(a)
  }
            
  def _mm_cvttsd_i64(a: Exp[__m128d]): Exp[Long] = {
    MM_CVTTSD_I64(a)
  }
            
  def _mm_cvtt_roundsd_u32(a: Exp[__m128d], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVTT_ROUNDSD_U32(a, rounding)
  }
            
  def _mm_cvtt_roundsd_u64(a: Exp[__m128d], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVTT_ROUNDSD_U64(a, rounding)
  }
            
  def _mm_cvttsd_u32(a: Exp[__m128d]): Exp[UInt] = {
    MM_CVTTSD_U32(a)
  }
            
  def _mm_cvttsd_u64(a: Exp[__m128d]): Exp[ULong] = {
    MM_CVTTSD_U64(a)
  }
            
  def _mm_cvtt_roundss_i32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSS_I32(a, rounding)
  }
            
  def _mm_cvtt_roundss_i64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSS_I64(a, rounding)
  }
            
  def _mm_cvtt_roundss_si32(a: Exp[__m128], rounding: Exp[Int]): Exp[Int] = {
    MM_CVTT_ROUNDSS_SI32(a, rounding)
  }
            
  def _mm_cvtt_roundss_si64(a: Exp[__m128], rounding: Exp[Int]): Exp[Long] = {
    MM_CVTT_ROUNDSS_SI64(a, rounding)
  }
            
  def _mm_cvttss_i32(a: Exp[__m128]): Exp[Int] = {
    MM_CVTTSS_I32(a)
  }
            
  def _mm_cvttss_i64(a: Exp[__m128]): Exp[Long] = {
    MM_CVTTSS_I64(a)
  }
            
  def _mm_cvtt_roundss_u32(a: Exp[__m128], rounding: Exp[Int]): Exp[UInt] = {
    MM_CVTT_ROUNDSS_U32(a, rounding)
  }
            
  def _mm_cvtt_roundss_u64(a: Exp[__m128], rounding: Exp[Int]): Exp[ULong] = {
    MM_CVTT_ROUNDSS_U64(a, rounding)
  }
            
  def _mm_cvttss_u32(a: Exp[__m128]): Exp[UInt] = {
    MM_CVTTSS_U32(a)
  }
            
  def _mm_cvttss_u64(a: Exp[__m128]): Exp[ULong] = {
    MM_CVTTSS_U64(a)
  }
            
  def _mm512_cvtepu32_pd(a: Exp[__m256i]): Exp[__m512d] = {
    MM512_CVTEPU32_PD(a)
  }
            
  def _mm512_mask_cvtepu32_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASK_CVTEPU32_PD(src, k, a)
  }
            
  def _mm512_maskz_cvtepu32_pd(k: Exp[Int], a: Exp[__m256i]): Exp[__m512d] = {
    MM512_MASKZ_CVTEPU32_PD(k, a)
  }
            
  def _mm512_cvt_roundepu32_ps(a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_CVT_ROUNDEPU32_PS(a, rounding)
  }
            
  def _mm512_cvtepu32_ps(a: Exp[__m512i]): Exp[__m512] = {
    MM512_CVTEPU32_PS(a)
  }
            
  def _mm512_mask_cvt_roundepu32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDEPU32_PS(src, k, a, rounding)
  }
            
  def _mm512_mask_cvtepu32_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_CVTEPU32_PS(src, k, a)
  }
            
  def _mm512_maskz_cvt_roundepu32_ps(k: Exp[Int], a: Exp[__m512i], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_CVT_ROUNDEPU32_PS(k, a, rounding)
  }
            
  def _mm512_maskz_cvtepu32_ps(k: Exp[Int], a: Exp[__m512i]): Exp[__m512] = {
    MM512_MASKZ_CVTEPU32_PS(k, a)
  }
            
  def _mm_cvt_roundu64_sd(a: Exp[__m128d], b: Exp[ULong], rounding: Exp[Int]): Exp[__m128d] = {
    MM_CVT_ROUNDU64_SD(a, b, rounding)
  }
            
  def _mm_cvtu32_sd(a: Exp[__m128d], b: Exp[UInt]): Exp[__m128d] = {
    MM_CVTU32_SD(a, b)
  }
            
  def _mm_cvtu64_sd(a: Exp[__m128d], b: Exp[ULong]): Exp[__m128d] = {
    MM_CVTU64_SD(a, b)
  }
            
  def _mm_cvt_roundu32_ss(a: Exp[__m128], b: Exp[UInt], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDU32_SS(a, b, rounding)
  }
            
  def _mm_cvt_roundu64_ss(a: Exp[__m128], b: Exp[ULong], rounding: Exp[Int]): Exp[__m128] = {
    MM_CVT_ROUNDU64_SS(a, b, rounding)
  }
            
  def _mm_cvtu32_ss(a: Exp[__m128], b: Exp[UInt]): Exp[__m128] = {
    MM_CVTU32_SS(a, b)
  }
            
  def _mm_cvtu64_ss(a: Exp[__m128], b: Exp[ULong]): Exp[__m128] = {
    MM_CVTU64_SS(a, b)
  }
            
  def _mm512_div_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_DIV_PD(a, b)
  }
            
  def _mm512_div_round_pd(a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_DIV_ROUND_PD(a, b, rounding)
  }
            
  def _mm512_mask_div_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_DIV_PD(src, k, a, b)
  }
            
  def _mm512_mask_div_round_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_DIV_ROUND_PD(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_div_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_DIV_PD(k, a, b)
  }
            
  def _mm512_maskz_div_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_DIV_ROUND_PD(k, a, b, rounding)
  }
            
  def _mm512_div_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_DIV_PS(a, b)
  }
            
  def _mm512_div_round_ps(a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_DIV_ROUND_PS(a, b, rounding)
  }
            
  def _mm512_mask_div_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_DIV_PS(src, k, a, b)
  }
            
  def _mm512_mask_div_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_DIV_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_maskz_div_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_DIV_PS(k, a, b)
  }
            
  def _mm512_maskz_div_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_DIV_ROUND_PS(k, a, b, rounding)
  }
            
  def _mm_div_round_sd(a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_DIV_ROUND_SD(a, b, rounding)
  }
            
  def _mm_mask_div_round_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_DIV_ROUND_SD(src, k, a, b, rounding)
  }
            
  def _mm_mask_div_sd(src: Exp[__m128d], k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_DIV_SD(src, k, a, b)
  }
            
  def _mm_maskz_div_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_DIV_ROUND_SD(k, a, b, rounding)
  }
            
  def _mm_maskz_div_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_DIV_SD(k, a, b)
  }
            
  def _mm_div_round_ss(a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_DIV_ROUND_SS(a, b, rounding)
  }
            
  def _mm_mask_div_round_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_DIV_ROUND_SS(src, k, a, b, rounding)
  }
            
  def _mm_mask_div_ss(src: Exp[__m128], k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASK_DIV_SS(src, k, a, b)
  }
            
  def _mm_maskz_div_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_DIV_ROUND_SS(k, a, b, rounding)
  }
            
  def _mm_maskz_div_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_DIV_SS(k, a, b)
  }
            
  def _mm512_mask_expand_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_EXPAND_PD(src, k, a)
  }
            
  def _mm512_mask_expandloadu_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_expand_pd(k: Exp[Int], a: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_EXPAND_PD(k, a)
  }
            
  def _mm512_maskz_expandloadu_pd[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mem_addr)(MM512_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_expand_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_EXPAND_PS(src, k, a)
  }
            
  def _mm512_mask_expandloadu_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_maskz_expand_ps(k: Exp[Int], a: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_EXPAND_PS(k, a)
  }
            
  def _mm512_maskz_expandloadu_ps[A[_], T:Typ, U:Integral](k: Exp[Int], mem_addr: Exp[A[T]], mem_addrOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mem_addr)(MM512_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extractf32x4_ps(a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_EXTRACTF32X4_PS(a, imm8)
  }
            
  def _mm512_mask_extractf32x4_ps(src: Exp[__m128], k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_MASK_EXTRACTF32X4_PS(src, k, a, imm8)
  }
            
  def _mm512_maskz_extractf32x4_ps(k: Exp[Int], a: Exp[__m512], imm8: Exp[Int]): Exp[__m128] = {
    MM512_MASKZ_EXTRACTF32X4_PS(k, a, imm8)
  }
            
  def _mm512_extractf64x4_pd(a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_EXTRACTF64X4_PD(a, imm8)
  }
            
  def _mm512_mask_extractf64x4_pd(src: Exp[__m256d], k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_MASK_EXTRACTF64X4_PD(src, k, a, imm8)
  }
            
  def _mm512_maskz_extractf64x4_pd(k: Exp[Int], a: Exp[__m512d], imm8: Exp[Int]): Exp[__m256d] = {
    MM512_MASKZ_EXTRACTF64X4_PD(k, a, imm8)
  }
            
  def _mm512_extracti32x4_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_EXTRACTI32X4_EPI32(a, imm8)
  }
            
  def _mm512_mask_extracti32x4_epi32(src: Exp[__m128i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8)
  }
            
  def _mm512_maskz_extracti32x4_epi32(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m128i] = {
    MM512_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8)
  }
            
  def _mm512_extracti64x4_epi64(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_EXTRACTI64X4_EPI64(a, imm8)
  }
            
  def _mm512_mask_extracti64x4_epi64(src: Exp[__m256i], k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASK_EXTRACTI64X4_EPI64(src, k, a, imm8)
  }
            
  def _mm512_maskz_extracti64x4_epi64(k: Exp[Int], a: Exp[__m512i], imm8: Exp[Int]): Exp[__m256i] = {
    MM512_MASKZ_EXTRACTI64X4_EPI64(k, a, imm8)
  }
            
  def _mm512_fixupimm_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_FIXUPIMM_PD(a, b, c, imm8)
  }
            
  def _mm512_fixupimm_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FIXUPIMM_ROUND_PD(a, b, c, imm8, rounding)
  }
            
  def _mm512_mask_fixupimm_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FIXUPIMM_PD(a, k, b, c, imm8)
  }
            
  def _mm512_mask_fixupimm_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FIXUPIMM_ROUND_PD(a, k, b, c, imm8, rounding)
  }
            
  def _mm512_maskz_fixupimm_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8)
  }
            
  def _mm512_maskz_fixupimm_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FIXUPIMM_ROUND_PD(k, a, b, c, imm8, rounding)
  }
            
  def _mm512_fixupimm_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_FIXUPIMM_PS(a, b, c, imm8)
  }
            
  def _mm512_fixupimm_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FIXUPIMM_ROUND_PS(a, b, c, imm8, rounding)
  }
            
  def _mm512_mask_fixupimm_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FIXUPIMM_PS(a, k, b, c, imm8)
  }
            
  def _mm512_mask_fixupimm_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FIXUPIMM_ROUND_PS(a, k, b, c, imm8, rounding)
  }
            
  def _mm512_maskz_fixupimm_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8)
  }
            
  def _mm512_maskz_fixupimm_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FIXUPIMM_ROUND_PS(k, a, b, c, imm8, rounding)
  }
            
  def _mm_fixupimm_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_ROUND_SD(a, b, c, imm8, rounding)
  }
            
  def _mm_fixupimm_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_FIXUPIMM_SD(a, b, c, imm8)
  }
            
  def _mm_mask_fixupimm_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FIXUPIMM_ROUND_SD(a, k, b, c, imm8, rounding)
  }
            
  def _mm_mask_fixupimm_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FIXUPIMM_SD(a, k, b, c, imm8)
  }
            
  def _mm_maskz_fixupimm_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_ROUND_SD(k, a, b, c, imm8, rounding)
  }
            
  def _mm_maskz_fixupimm_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FIXUPIMM_SD(k, a, b, c, imm8)
  }
            
  def _mm_fixupimm_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_ROUND_SS(a, b, c, imm8, rounding)
  }
            
  def _mm_fixupimm_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_FIXUPIMM_SS(a, b, c, imm8)
  }
            
  def _mm_mask_fixupimm_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_ROUND_SS(a, k, b, c, imm8, rounding)
  }
            
  def _mm_mask_fixupimm_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASK_FIXUPIMM_SS(a, k, b, c, imm8)
  }
            
  def _mm_maskz_fixupimm_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_ROUND_SS(k, a, b, c, imm8, rounding)
  }
            
  def _mm_maskz_fixupimm_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128i], imm8: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FIXUPIMM_SS(k, a, b, c, imm8)
  }
            
  def _mm512_maskz_fmadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMADD_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fmadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fmadd_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMADD_PS(k, a, b, c)
  }
            
  def _mm512_maskz_fmadd_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMADD_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm_fmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FMADD_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm_mask3_fmadd_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fmadd_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMADD_SD(a, b, c, k)
  }
            
  def _mm_mask_fmadd_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FMADD_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_mask_fmadd_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMADD_SD(a, k, b, c)
  }
            
  def _mm_maskz_fmadd_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FMADD_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fmadd_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMADD_SD(k, a, b, c)
  }
            
  def _mm_mask3_fmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADD_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fmadd_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMADD_SS(a, b, c, k)
  }
            
  def _mm_fmadd_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FMADD_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm_mask_fmadd_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FMADD_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm_mask_fmadd_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMADD_SS(a, k, b, c)
  }
            
  def _mm_maskz_fmadd_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FMADD_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fmadd_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMADD_SS(k, a, b, c)
  }
            
  def _mm512_fmaddsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMADDSUB_PD(a, b, c)
  }
            
  def _mm512_fmaddsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMADDSUB_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmaddsub_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADDSUB_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fmaddsub_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMADDSUB_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmaddsub_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMADDSUB_PD(a, k, b, c)
  }
            
  def _mm512_mask_fmaddsub_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMADDSUB_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_fmaddsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMADDSUB_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fmaddsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMADDSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_fmaddsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMADDSUB_PS(a, b, c)
  }
            
  def _mm512_fmaddsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMADDSUB_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmaddsub_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADDSUB_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fmaddsub_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMADDSUB_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmaddsub_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADDSUB_PS(a, k, b, c)
  }
            
  def _mm512_mask_fmaddsub_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADDSUB_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_fmaddsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMADDSUB_PS(k, a, b, c)
  }
            
  def _mm512_maskz_fmaddsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMADDSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fmsub_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMSUB_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fmsub_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMSUB_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_maskz_fmsub_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMSUB_PS(k, a, b, c)
  }
            
  def _mm512_maskz_fmsub_round_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASKZ_FMSUB_ROUND_PS(k, a, b, c, rounding)
  }
            
  def _mm_fmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_FMSUB_ROUND_SD(a, b, c, rounding)
  }
            
  def _mm_mask3_fmsub_round_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_ROUND_SD(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fmsub_sd(a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], k: Exp[Int]): Exp[__m128d] = {
    MM_MASK3_FMSUB_SD(a, b, c, k)
  }
            
  def _mm_mask_fmsub_round_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASK_FMSUB_ROUND_SD(a, k, b, c, rounding)
  }
            
  def _mm_mask_fmsub_sd(a: Exp[__m128d], k: Exp[Int], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASK_FMSUB_SD(a, k, b, c)
  }
            
  def _mm_maskz_fmsub_round_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d], rounding: Exp[Int]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_ROUND_SD(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fmsub_sd(k: Exp[Int], a: Exp[__m128d], b: Exp[__m128d], c: Exp[__m128d]): Exp[__m128d] = {
    MM_MASKZ_FMSUB_SD(k, a, b, c)
  }
            
  def _mm_fmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_FMSUB_ROUND_SS(a, b, c, rounding)
  }
            
  def _mm_mask3_fmsub_round_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_ROUND_SS(a, b, c, k, rounding)
  }
            
  def _mm_mask3_fmsub_ss(a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], k: Exp[Int]): Exp[__m128] = {
    MM_MASK3_FMSUB_SS(a, b, c, k)
  }
            
  def _mm_mask_fmsub_round_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASK_FMSUB_ROUND_SS(a, k, b, c, rounding)
  }
            
  def _mm_mask_fmsub_ss(a: Exp[__m128], k: Exp[Int], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASK_FMSUB_SS(a, k, b, c)
  }
            
  def _mm_maskz_fmsub_round_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128], rounding: Exp[Int]): Exp[__m128] = {
    MM_MASKZ_FMSUB_ROUND_SS(k, a, b, c, rounding)
  }
            
  def _mm_maskz_fmsub_ss(k: Exp[Int], a: Exp[__m128], b: Exp[__m128], c: Exp[__m128]): Exp[__m128] = {
    MM_MASKZ_FMSUB_SS(k, a, b, c)
  }
            
  def _mm512_fmsubadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_FMSUBADD_PD(a, b, c)
  }
            
  def _mm512_fmsubadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_FMSUBADD_ROUND_PD(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmsubadd_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUBADD_PD(a, b, c, k)
  }
            
  def _mm512_mask3_fmsubadd_round_pd(a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], k: Exp[Int], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK3_FMSUBADD_ROUND_PD(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmsubadd_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASK_FMSUBADD_PD(a, k, b, c)
  }
            
  def _mm512_mask_fmsubadd_round_pd(a: Exp[__m512d], k: Exp[Int], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_FMSUBADD_ROUND_PD(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_fmsubadd_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d]): Exp[__m512d] = {
    MM512_MASKZ_FMSUBADD_PD(k, a, b, c)
  }
            
  def _mm512_maskz_fmsubadd_round_pd(k: Exp[Int], a: Exp[__m512d], b: Exp[__m512d], c: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_MASKZ_FMSUBADD_ROUND_PD(k, a, b, c, rounding)
  }
            
  def _mm512_fmsubadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_FMSUBADD_PS(a, b, c)
  }
            
  def _mm512_fmsubadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_FMSUBADD_ROUND_PS(a, b, c, rounding)
  }
            
  def _mm512_mask3_fmsubadd_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUBADD_PS(a, b, c, k)
  }
            
  def _mm512_mask3_fmsubadd_round_ps(a: Exp[__m512], b: Exp[__m512], c: Exp[__m512], k: Exp[Int], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK3_FMSUBADD_ROUND_PS(a, b, c, k, rounding)
  }
            
  def _mm512_mask_fmsubadd_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMSUBADD_PS(a, k, b, c)
  }
            
  def _mm512_mask_fmsubadd_round_ps(a: Exp[__m512], k: Exp[Int], b: Exp[__m512], c: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMSUBADD_ROUND_PS(a, k, b, c, rounding)
  }
            
  def _mm512_maskz_fmsubadd_ps(k: Exp[Int], a: Exp[__m512], b: Exp[__m512], c: Exp[__m512]): Exp[__m512] = {
    MM512_MASKZ_FMSUBADD_PS(k, a, b, c)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_CVTT_ROUNDPS_EPU32 (a, sae) =>
      _mm512_cvtt_roundps_epu32(f(a), f(sae))
    case MM512_CVTTPS_EPU32 (a) =>
      _mm512_cvttps_epu32(f(a))
    case MM512_MASK_CVTT_ROUNDPS_EPU32 (src, k, a, sae) =>
      _mm512_mask_cvtt_roundps_epu32(f(src), f(k), f(a), f(sae))
    case MM512_MASK_CVTTPS_EPU32 (src, k, a) =>
      _mm512_mask_cvttps_epu32(f(src), f(k), f(a))
    case MM512_MASKZ_CVTT_ROUNDPS_EPU32 (k, a, sae) =>
      _mm512_maskz_cvtt_roundps_epu32(f(k), f(a), f(sae))
    case MM512_MASKZ_CVTTPS_EPU32 (k, a) =>
      _mm512_maskz_cvttps_epu32(f(k), f(a))
    case MM_CVTT_ROUNDSD_I32 (a, rounding) =>
      _mm_cvtt_roundsd_i32(f(a), f(rounding))
    case MM_CVTT_ROUNDSD_I64 (a, rounding) =>
      _mm_cvtt_roundsd_i64(f(a), f(rounding))
    case MM_CVTT_ROUNDSD_SI32 (a, rounding) =>
      _mm_cvtt_roundsd_si32(f(a), f(rounding))
    case MM_CVTT_ROUNDSD_SI64 (a, rounding) =>
      _mm_cvtt_roundsd_si64(f(a), f(rounding))
    case MM_CVTTSD_I32 (a) =>
      _mm_cvttsd_i32(f(a))
    case MM_CVTTSD_I64 (a) =>
      _mm_cvttsd_i64(f(a))
    case MM_CVTT_ROUNDSD_U32 (a, rounding) =>
      _mm_cvtt_roundsd_u32(f(a), f(rounding))
    case MM_CVTT_ROUNDSD_U64 (a, rounding) =>
      _mm_cvtt_roundsd_u64(f(a), f(rounding))
    case MM_CVTTSD_U32 (a) =>
      _mm_cvttsd_u32(f(a))
    case MM_CVTTSD_U64 (a) =>
      _mm_cvttsd_u64(f(a))
    case MM_CVTT_ROUNDSS_I32 (a, rounding) =>
      _mm_cvtt_roundss_i32(f(a), f(rounding))
    case MM_CVTT_ROUNDSS_I64 (a, rounding) =>
      _mm_cvtt_roundss_i64(f(a), f(rounding))
    case MM_CVTT_ROUNDSS_SI32 (a, rounding) =>
      _mm_cvtt_roundss_si32(f(a), f(rounding))
    case MM_CVTT_ROUNDSS_SI64 (a, rounding) =>
      _mm_cvtt_roundss_si64(f(a), f(rounding))
    case MM_CVTTSS_I32 (a) =>
      _mm_cvttss_i32(f(a))
    case MM_CVTTSS_I64 (a) =>
      _mm_cvttss_i64(f(a))
    case MM_CVTT_ROUNDSS_U32 (a, rounding) =>
      _mm_cvtt_roundss_u32(f(a), f(rounding))
    case MM_CVTT_ROUNDSS_U64 (a, rounding) =>
      _mm_cvtt_roundss_u64(f(a), f(rounding))
    case MM_CVTTSS_U32 (a) =>
      _mm_cvttss_u32(f(a))
    case MM_CVTTSS_U64 (a) =>
      _mm_cvttss_u64(f(a))
    case MM512_CVTEPU32_PD (a) =>
      _mm512_cvtepu32_pd(f(a))
    case MM512_MASK_CVTEPU32_PD (src, k, a) =>
      _mm512_mask_cvtepu32_pd(f(src), f(k), f(a))
    case MM512_MASKZ_CVTEPU32_PD (k, a) =>
      _mm512_maskz_cvtepu32_pd(f(k), f(a))
    case MM512_CVT_ROUNDEPU32_PS (a, rounding) =>
      _mm512_cvt_roundepu32_ps(f(a), f(rounding))
    case MM512_CVTEPU32_PS (a) =>
      _mm512_cvtepu32_ps(f(a))
    case MM512_MASK_CVT_ROUNDEPU32_PS (src, k, a, rounding) =>
      _mm512_mask_cvt_roundepu32_ps(f(src), f(k), f(a), f(rounding))
    case MM512_MASK_CVTEPU32_PS (src, k, a) =>
      _mm512_mask_cvtepu32_ps(f(src), f(k), f(a))
    case MM512_MASKZ_CVT_ROUNDEPU32_PS (k, a, rounding) =>
      _mm512_maskz_cvt_roundepu32_ps(f(k), f(a), f(rounding))
    case MM512_MASKZ_CVTEPU32_PS (k, a) =>
      _mm512_maskz_cvtepu32_ps(f(k), f(a))
    case MM_CVT_ROUNDU64_SD (a, b, rounding) =>
      _mm_cvt_roundu64_sd(f(a), f(b), f(rounding))
    case MM_CVTU32_SD (a, b) =>
      _mm_cvtu32_sd(f(a), f(b))
    case MM_CVTU64_SD (a, b) =>
      _mm_cvtu64_sd(f(a), f(b))
    case MM_CVT_ROUNDU32_SS (a, b, rounding) =>
      _mm_cvt_roundu32_ss(f(a), f(b), f(rounding))
    case MM_CVT_ROUNDU64_SS (a, b, rounding) =>
      _mm_cvt_roundu64_ss(f(a), f(b), f(rounding))
    case MM_CVTU32_SS (a, b) =>
      _mm_cvtu32_ss(f(a), f(b))
    case MM_CVTU64_SS (a, b) =>
      _mm_cvtu64_ss(f(a), f(b))
    case MM512_DIV_PD (a, b) =>
      _mm512_div_pd(f(a), f(b))
    case MM512_DIV_ROUND_PD (a, b, rounding) =>
      _mm512_div_round_pd(f(a), f(b), f(rounding))
    case MM512_MASK_DIV_PD (src, k, a, b) =>
      _mm512_mask_div_pd(f(src), f(k), f(a), f(b))
    case MM512_MASK_DIV_ROUND_PD (src, k, a, b, rounding) =>
      _mm512_mask_div_round_pd(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_DIV_PD (k, a, b) =>
      _mm512_maskz_div_pd(f(k), f(a), f(b))
    case MM512_MASKZ_DIV_ROUND_PD (k, a, b, rounding) =>
      _mm512_maskz_div_round_pd(f(k), f(a), f(b), f(rounding))
    case MM512_DIV_PS (a, b) =>
      _mm512_div_ps(f(a), f(b))
    case MM512_DIV_ROUND_PS (a, b, rounding) =>
      _mm512_div_round_ps(f(a), f(b), f(rounding))
    case MM512_MASK_DIV_PS (src, k, a, b) =>
      _mm512_mask_div_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_DIV_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_div_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case MM512_MASKZ_DIV_PS (k, a, b) =>
      _mm512_maskz_div_ps(f(k), f(a), f(b))
    case MM512_MASKZ_DIV_ROUND_PS (k, a, b, rounding) =>
      _mm512_maskz_div_round_ps(f(k), f(a), f(b), f(rounding))
    case MM_DIV_ROUND_SD (a, b, rounding) =>
      _mm_div_round_sd(f(a), f(b), f(rounding))
    case MM_MASK_DIV_ROUND_SD (src, k, a, b, rounding) =>
      _mm_mask_div_round_sd(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_DIV_SD (src, k, a, b) =>
      _mm_mask_div_sd(f(src), f(k), f(a), f(b))
    case MM_MASKZ_DIV_ROUND_SD (k, a, b, rounding) =>
      _mm_maskz_div_round_sd(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_DIV_SD (k, a, b) =>
      _mm_maskz_div_sd(f(k), f(a), f(b))
    case MM_DIV_ROUND_SS (a, b, rounding) =>
      _mm_div_round_ss(f(a), f(b), f(rounding))
    case MM_MASK_DIV_ROUND_SS (src, k, a, b, rounding) =>
      _mm_mask_div_round_ss(f(src), f(k), f(a), f(b), f(rounding))
    case MM_MASK_DIV_SS (src, k, a, b) =>
      _mm_mask_div_ss(f(src), f(k), f(a), f(b))
    case MM_MASKZ_DIV_ROUND_SS (k, a, b, rounding) =>
      _mm_maskz_div_round_ss(f(k), f(a), f(b), f(rounding))
    case MM_MASKZ_DIV_SS (k, a, b) =>
      _mm_maskz_div_ss(f(k), f(a), f(b))
    case MM512_MASK_EXPAND_PD (src, k, a) =>
      _mm512_mask_expand_pd(f(src), f(k), f(a))
    case iDef@MM512_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_EXPAND_PD (k, a) =>
      _mm512_maskz_expand_pd(f(k), f(a))
    case iDef@MM512_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_expandloadu_pd(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_EXPAND_PS (src, k, a) =>
      _mm512_mask_expand_ps(f(src), f(k), f(a))
    case iDef@MM512_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset) =>
      _mm512_mask_expandloadu_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASKZ_EXPAND_PS (k, a) =>
      _mm512_maskz_expand_ps(f(k), f(a))
    case iDef@MM512_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset) =>
      _mm512_maskz_expandloadu_ps(iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_EXTRACTF32X4_PS (a, imm8) =>
      _mm512_extractf32x4_ps(f(a), f(imm8))
    case MM512_MASK_EXTRACTF32X4_PS (src, k, a, imm8) =>
      _mm512_mask_extractf32x4_ps(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTF32X4_PS (k, a, imm8) =>
      _mm512_maskz_extractf32x4_ps(f(k), f(a), f(imm8))
    case MM512_EXTRACTF64X4_PD (a, imm8) =>
      _mm512_extractf64x4_pd(f(a), f(imm8))
    case MM512_MASK_EXTRACTF64X4_PD (src, k, a, imm8) =>
      _mm512_mask_extractf64x4_pd(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTF64X4_PD (k, a, imm8) =>
      _mm512_maskz_extractf64x4_pd(f(k), f(a), f(imm8))
    case MM512_EXTRACTI32X4_EPI32 (a, imm8) =>
      _mm512_extracti32x4_epi32(f(a), f(imm8))
    case MM512_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8) =>
      _mm512_mask_extracti32x4_epi32(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8) =>
      _mm512_maskz_extracti32x4_epi32(f(k), f(a), f(imm8))
    case MM512_EXTRACTI64X4_EPI64 (a, imm8) =>
      _mm512_extracti64x4_epi64(f(a), f(imm8))
    case MM512_MASK_EXTRACTI64X4_EPI64 (src, k, a, imm8) =>
      _mm512_mask_extracti64x4_epi64(f(src), f(k), f(a), f(imm8))
    case MM512_MASKZ_EXTRACTI64X4_EPI64 (k, a, imm8) =>
      _mm512_maskz_extracti64x4_epi64(f(k), f(a), f(imm8))
    case MM512_FIXUPIMM_PD (a, b, c, imm8) =>
      _mm512_fixupimm_pd(f(a), f(b), f(c), f(imm8))
    case MM512_FIXUPIMM_ROUND_PD (a, b, c, imm8, rounding) =>
      _mm512_fixupimm_round_pd(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASK_FIXUPIMM_PD (a, k, b, c, imm8) =>
      _mm512_mask_fixupimm_pd(f(a), f(k), f(b), f(c), f(imm8))
    case MM512_MASK_FIXUPIMM_ROUND_PD (a, k, b, c, imm8, rounding) =>
      _mm512_mask_fixupimm_round_pd(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8) =>
      _mm512_maskz_fixupimm_pd(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_FIXUPIMM_ROUND_PD (k, a, b, c, imm8, rounding) =>
      _mm512_maskz_fixupimm_round_pd(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_FIXUPIMM_PS (a, b, c, imm8) =>
      _mm512_fixupimm_ps(f(a), f(b), f(c), f(imm8))
    case MM512_FIXUPIMM_ROUND_PS (a, b, c, imm8, rounding) =>
      _mm512_fixupimm_round_ps(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASK_FIXUPIMM_PS (a, k, b, c, imm8) =>
      _mm512_mask_fixupimm_ps(f(a), f(k), f(b), f(c), f(imm8))
    case MM512_MASK_FIXUPIMM_ROUND_PS (a, k, b, c, imm8, rounding) =>
      _mm512_mask_fixupimm_round_ps(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM512_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8) =>
      _mm512_maskz_fixupimm_ps(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_FIXUPIMM_ROUND_PS (k, a, b, c, imm8, rounding) =>
      _mm512_maskz_fixupimm_round_ps(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_FIXUPIMM_ROUND_SD (a, b, c, imm8, rounding) =>
      _mm_fixupimm_round_sd(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_FIXUPIMM_SD (a, b, c, imm8) =>
      _mm_fixupimm_sd(f(a), f(b), f(c), f(imm8))
    case MM_MASK_FIXUPIMM_ROUND_SD (a, k, b, c, imm8, rounding) =>
      _mm_mask_fixupimm_round_sd(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM_MASK_FIXUPIMM_SD (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_sd(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASKZ_FIXUPIMM_ROUND_SD (k, a, b, c, imm8, rounding) =>
      _mm_maskz_fixupimm_round_sd(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_MASKZ_FIXUPIMM_SD (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_sd(f(k), f(a), f(b), f(c), f(imm8))
    case MM_FIXUPIMM_ROUND_SS (a, b, c, imm8, rounding) =>
      _mm_fixupimm_round_ss(f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_FIXUPIMM_SS (a, b, c, imm8) =>
      _mm_fixupimm_ss(f(a), f(b), f(c), f(imm8))
    case MM_MASK_FIXUPIMM_ROUND_SS (a, k, b, c, imm8, rounding) =>
      _mm_mask_fixupimm_round_ss(f(a), f(k), f(b), f(c), f(imm8), f(rounding))
    case MM_MASK_FIXUPIMM_SS (a, k, b, c, imm8) =>
      _mm_mask_fixupimm_ss(f(a), f(k), f(b), f(c), f(imm8))
    case MM_MASKZ_FIXUPIMM_ROUND_SS (k, a, b, c, imm8, rounding) =>
      _mm_maskz_fixupimm_round_ss(f(k), f(a), f(b), f(c), f(imm8), f(rounding))
    case MM_MASKZ_FIXUPIMM_SS (k, a, b, c, imm8) =>
      _mm_maskz_fixupimm_ss(f(k), f(a), f(b), f(c), f(imm8))
    case MM512_MASKZ_FMADD_PD (k, a, b, c) =>
      _mm512_maskz_fmadd_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMADD_PS (k, a, b, c) =>
      _mm512_maskz_fmadd_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMADD_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmadd_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM_FMADD_ROUND_SD (a, b, c, rounding) =>
      _mm_fmadd_round_sd(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FMADD_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fmadd_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FMADD_SD (a, b, c, k) =>
      _mm_mask3_fmadd_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMADD_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fmadd_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FMADD_SD (a, k, b, c) =>
      _mm_mask_fmadd_sd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMADD_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fmadd_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FMADD_SD (k, a, b, c) =>
      _mm_maskz_fmadd_sd(f(k), f(a), f(b), f(c))
    case MM_MASK3_FMADD_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fmadd_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FMADD_SS (a, b, c, k) =>
      _mm_mask3_fmadd_ss(f(a), f(b), f(c), f(k))
    case MM_FMADD_ROUND_SS (a, b, c, rounding) =>
      _mm_fmadd_round_ss(f(a), f(b), f(c), f(rounding))
    case MM_MASK_FMADD_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fmadd_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FMADD_SS (a, k, b, c) =>
      _mm_mask_fmadd_ss(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMADD_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fmadd_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FMADD_SS (k, a, b, c) =>
      _mm_maskz_fmadd_ss(f(k), f(a), f(b), f(c))
    case MM512_FMADDSUB_PD (a, b, c) =>
      _mm512_fmaddsub_pd(f(a), f(b), f(c))
    case MM512_FMADDSUB_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmaddsub_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADDSUB_PD (a, b, c, k) =>
      _mm512_mask3_fmaddsub_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMADDSUB_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmaddsub_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMADDSUB_PD (a, k, b, c) =>
      _mm512_mask_fmaddsub_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMADDSUB_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmaddsub_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMADDSUB_PD (k, a, b, c) =>
      _mm512_maskz_fmaddsub_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMADDSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmaddsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_FMADDSUB_PS (a, b, c) =>
      _mm512_fmaddsub_ps(f(a), f(b), f(c))
    case MM512_FMADDSUB_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmaddsub_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMADDSUB_PS (a, b, c, k) =>
      _mm512_mask3_fmaddsub_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMADDSUB_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmaddsub_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMADDSUB_PS (a, k, b, c) =>
      _mm512_mask_fmaddsub_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMADDSUB_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmaddsub_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMADDSUB_PS (k, a, b, c) =>
      _mm512_maskz_fmaddsub_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMADDSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmaddsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMSUB_PD (k, a, b, c) =>
      _mm512_maskz_fmsub_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMSUB_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmsub_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMSUB_PS (k, a, b, c) =>
      _mm512_maskz_fmsub_ps(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMSUB_ROUND_PS (k, a, b, c, rounding) =>
      _mm512_maskz_fmsub_round_ps(f(k), f(a), f(b), f(c), f(rounding))
    case MM_FMSUB_ROUND_SD (a, b, c, rounding) =>
      _mm_fmsub_round_sd(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FMSUB_ROUND_SD (a, b, c, k, rounding) =>
      _mm_mask3_fmsub_round_sd(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FMSUB_SD (a, b, c, k) =>
      _mm_mask3_fmsub_sd(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUB_ROUND_SD (a, k, b, c, rounding) =>
      _mm_mask_fmsub_round_sd(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FMSUB_SD (a, k, b, c) =>
      _mm_mask_fmsub_sd(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUB_ROUND_SD (k, a, b, c, rounding) =>
      _mm_maskz_fmsub_round_sd(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FMSUB_SD (k, a, b, c) =>
      _mm_maskz_fmsub_sd(f(k), f(a), f(b), f(c))
    case MM_FMSUB_ROUND_SS (a, b, c, rounding) =>
      _mm_fmsub_round_ss(f(a), f(b), f(c), f(rounding))
    case MM_MASK3_FMSUB_ROUND_SS (a, b, c, k, rounding) =>
      _mm_mask3_fmsub_round_ss(f(a), f(b), f(c), f(k), f(rounding))
    case MM_MASK3_FMSUB_SS (a, b, c, k) =>
      _mm_mask3_fmsub_ss(f(a), f(b), f(c), f(k))
    case MM_MASK_FMSUB_ROUND_SS (a, k, b, c, rounding) =>
      _mm_mask_fmsub_round_ss(f(a), f(k), f(b), f(c), f(rounding))
    case MM_MASK_FMSUB_SS (a, k, b, c) =>
      _mm_mask_fmsub_ss(f(a), f(k), f(b), f(c))
    case MM_MASKZ_FMSUB_ROUND_SS (k, a, b, c, rounding) =>
      _mm_maskz_fmsub_round_ss(f(k), f(a), f(b), f(c), f(rounding))
    case MM_MASKZ_FMSUB_SS (k, a, b, c) =>
      _mm_maskz_fmsub_ss(f(k), f(a), f(b), f(c))
    case MM512_FMSUBADD_PD (a, b, c) =>
      _mm512_fmsubadd_pd(f(a), f(b), f(c))
    case MM512_FMSUBADD_ROUND_PD (a, b, c, rounding) =>
      _mm512_fmsubadd_round_pd(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMSUBADD_PD (a, b, c, k) =>
      _mm512_mask3_fmsubadd_pd(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMSUBADD_ROUND_PD (a, b, c, k, rounding) =>
      _mm512_mask3_fmsubadd_round_pd(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMSUBADD_PD (a, k, b, c) =>
      _mm512_mask_fmsubadd_pd(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMSUBADD_ROUND_PD (a, k, b, c, rounding) =>
      _mm512_mask_fmsubadd_round_pd(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMSUBADD_PD (k, a, b, c) =>
      _mm512_maskz_fmsubadd_pd(f(k), f(a), f(b), f(c))
    case MM512_MASKZ_FMSUBADD_ROUND_PD (k, a, b, c, rounding) =>
      _mm512_maskz_fmsubadd_round_pd(f(k), f(a), f(b), f(c), f(rounding))
    case MM512_FMSUBADD_PS (a, b, c) =>
      _mm512_fmsubadd_ps(f(a), f(b), f(c))
    case MM512_FMSUBADD_ROUND_PS (a, b, c, rounding) =>
      _mm512_fmsubadd_round_ps(f(a), f(b), f(c), f(rounding))
    case MM512_MASK3_FMSUBADD_PS (a, b, c, k) =>
      _mm512_mask3_fmsubadd_ps(f(a), f(b), f(c), f(k))
    case MM512_MASK3_FMSUBADD_ROUND_PS (a, b, c, k, rounding) =>
      _mm512_mask3_fmsubadd_round_ps(f(a), f(b), f(c), f(k), f(rounding))
    case MM512_MASK_FMSUBADD_PS (a, k, b, c) =>
      _mm512_mask_fmsubadd_ps(f(a), f(k), f(b), f(c))
    case MM512_MASK_FMSUBADD_ROUND_PS (a, k, b, c, rounding) =>
      _mm512_mask_fmsubadd_round_ps(f(a), f(k), f(b), f(c), f(rounding))
    case MM512_MASKZ_FMSUBADD_PS (k, a, b, c) =>
      _mm512_maskz_fmsubadd_ps(f(k), f(a), f(b), f(c))

    case Reflect(MM512_CVTT_ROUNDPS_EPU32 (a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_CVTT_ROUNDPS_EPU32 (f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTTPS_EPU32 (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTTPS_EPU32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTT_ROUNDPS_EPU32 (src, k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTT_ROUNDPS_EPU32 (f(src), f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTTPS_EPU32 (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTTPS_EPU32 (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU32 (k, a, sae), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTT_ROUNDPS_EPU32 (f(k), f(a), f(sae)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTTPS_EPU32 (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTTPS_EPU32 (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSD_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSD_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSD_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSD_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_I32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_I32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_I64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_I64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_SI32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_SI32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_SI64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_SI64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_I32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_I32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_I64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_I64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_U32 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_U32 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTT_ROUNDSS_U64 (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVTT_ROUNDSS_U64 (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_U32 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_U32 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTTSS_U64 (a), u, es) =>
      reflectMirrored(Reflect(MM_CVTTSS_U64 (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU32_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU32_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU32_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU32_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVT_ROUNDEPU32_PS (a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVT_ROUNDEPU32_PS (f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTEPU32_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_CVTEPU32_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDEPU32_PS (src, k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDEPU32_PS (f(src), f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTEPU32_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTEPU32_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVT_ROUNDEPU32_PS (k, a, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVT_ROUNDEPU32_PS (f(k), f(a), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_CVTEPU32_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_CVTEPU32_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU64_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU64_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU32_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU32_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU64_SD (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU64_SD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU32_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU32_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVT_ROUNDU64_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_CVT_ROUNDU64_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU32_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU32_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_CVTU64_SS (a, b), u, es) =>
      reflectMirrored(Reflect(MM_CVTU64_SS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_ROUND_PD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_ROUND_PD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_PD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_PD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_ROUND_PD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_ROUND_PD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_PD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_PD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_ROUND_PD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_ROUND_PD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_DIV_ROUND_PS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_DIV_ROUND_PS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_DIV_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_DIV_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_PS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_PS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_DIV_ROUND_PS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_DIV_ROUND_PS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_ROUND_SD (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_DIV_ROUND_SD (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_ROUND_SD (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_ROUND_SD (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_SD (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_SD (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_ROUND_SD (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_ROUND_SD (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_SD (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_SD (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_DIV_ROUND_SS (a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_DIV_ROUND_SS (f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_ROUND_SS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_ROUND_SS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_DIV_SS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASK_DIV_SS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_ROUND_SS (k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_ROUND_SS (f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_DIV_SS (k, a, b), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_DIV_SS (f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_PD (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_PD (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_PD (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_EXPANDLOADU_PD (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPANDLOADU_PD (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXPAND_PS (src, k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPAND_PS (f(src), f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXPANDLOADU_PS (src, k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXPANDLOADU_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXPAND_PS (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPAND_PS (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASKZ_EXPANDLOADU_PS (k, mem_addr, mem_addrOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXPANDLOADU_PS (iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mem_addr, f), iDef.cont.applyTransformer(mem_addrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF32X4_PS (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF32X4_PS (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF32X4_PS (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF32X4_PS (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF32X4_PS (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF32X4_PS (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTF64X4_PD (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTF64X4_PD (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTF64X4_PD (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTF64X4_PD (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTF64X4_PD (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTF64X4_PD (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI32X4_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI32X4_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI32X4_EPI32 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI32X4_EPI32 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI32X4_EPI32 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI32X4_EPI32 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXTRACTI64X4_EPI64 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_EXTRACTI64X4_EPI64 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXTRACTI64X4_EPI64 (src, k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTRACTI64X4_EPI64 (f(src), f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_EXTRACTI64X4_EPI64 (k, a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_EXTRACTI64X4_EPI64 (f(k), f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_PD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_PD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_ROUND_PD (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_ROUND_PD (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_PD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_PD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_ROUND_PD (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_ROUND_PD (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_PD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_PD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PD (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PD (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_PS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_PS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPIMM_ROUND_PS (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPIMM_ROUND_PS (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_PS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_PS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FIXUPIMM_ROUND_PS (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FIXUPIMM_ROUND_PS (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_PS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_PS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PS (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FIXUPIMM_ROUND_PS (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_ROUND_SD (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_ROUND_SD (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_SD (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_SD (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_ROUND_SD (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_ROUND_SD (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_SD (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_SD (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_ROUND_SD (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_ROUND_SD (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_SD (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_SD (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_ROUND_SS (a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_ROUND_SS (f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FIXUPIMM_SS (a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_FIXUPIMM_SS (f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_ROUND_SS (a, k, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_ROUND_SS (f(a), f(k), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FIXUPIMM_SS (a, k, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FIXUPIMM_SS (f(a), f(k), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_ROUND_SS (k, a, b, c, imm8, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_ROUND_SS (f(k), f(a), f(b), f(c), f(imm8), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FIXUPIMM_SS (k, a, b, c, imm8), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FIXUPIMM_SS (f(k), f(a), f(b), f(c), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADD_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADD_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMADD_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMADD_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMADD_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMADD_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMADD_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMADD_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMADD_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMADD_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMADDSUB_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMADDSUB_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMADDSUB_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMADDSUB_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADDSUB_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADDSUB_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMADDSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMADDSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUB_ROUND_PS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUB_ROUND_PS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_ROUND_SD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_ROUND_SD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_ROUND_SD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_ROUND_SD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_SD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_SD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_ROUND_SD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_ROUND_SD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_SD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_SD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_ROUND_SD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_ROUND_SD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_SD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_SD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_FMSUB_ROUND_SS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_FMSUB_ROUND_SS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_ROUND_SS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_ROUND_SS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK3_FMSUB_SS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM_MASK3_FMSUB_SS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_ROUND_SS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_ROUND_SS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASK_FMSUB_SS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASK_FMSUB_SS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_ROUND_SS (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_ROUND_SS (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_MASKZ_FMSUB_SS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM_MASKZ_FMSUB_SS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_PD (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_PD (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_ROUND_PD (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_ROUND_PD (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_PD (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_PD (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_ROUND_PD (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_ROUND_PD (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_PD (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_PD (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_ROUND_PD (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_ROUND_PD (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_PD (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_PD (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_ROUND_PD (k, a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_ROUND_PD (f(k), f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_PS (a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_PS (f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FMSUBADD_ROUND_PS (a, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_FMSUBADD_ROUND_PS (f(a), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_PS (a, b, c, k), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_PS (f(a), f(b), f(c), f(k)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK3_FMSUBADD_ROUND_PS (a, b, c, k, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK3_FMSUBADD_ROUND_PS (f(a), f(b), f(c), f(k), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_PS (a, k, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_PS (f(a), f(k), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMSUBADD_ROUND_PS (a, k, b, c, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMSUBADD_ROUND_PS (f(a), f(k), f(b), f(c), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASKZ_FMSUBADD_PS (k, a, b, c), u, es) =>
      reflectMirrored(Reflect(MM512_MASKZ_FMSUBADD_PS (f(k), f(a), f(b), f(c)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenAVX51201 extends CGenIntrinsics {

  val IR: AVX512
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_CVTT_ROUNDPS_EPU32(a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtt_roundps_epu32(${quote(a)}, ${quote(sae)})")
    case iDef@MM512_CVTTPS_EPU32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvttps_epu32(${quote(a)})")
    case iDef@MM512_MASK_CVTT_ROUNDPS_EPU32(src, k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtt_roundps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASK_CVTTPS_EPU32(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvttps_epu32(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTT_ROUNDPS_EPU32(k, a, sae) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtt_roundps_epu32(${quote(k)}, ${quote(a)}, ${quote(sae)})")
    case iDef@MM512_MASKZ_CVTTPS_EPU32(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvttps_epu32(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVTT_ROUNDSD_I32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_i32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSD_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSD_SI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_si32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSD_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTTSD_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_i32(${quote(a)})")
    case iDef@MM_CVTTSD_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_i64(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSD_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSD_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundsd_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTTSD_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_u32(${quote(a)})")
    case iDef@MM_CVTTSD_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttsd_u64(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_I32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_i32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSS_I64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_i64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSS_SI32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_si32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSS_SI64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_si64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTTSS_I32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_i32(${quote(a)})")
    case iDef@MM_CVTTSS_I64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_i64(${quote(a)})")
    case iDef@MM_CVTT_ROUNDSS_U32(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_u32(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTT_ROUNDSS_U64(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtt_roundss_u64(${quote(a)}, ${quote(rounding)})")
    case iDef@MM_CVTTSS_U32(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_u32(${quote(a)})")
    case iDef@MM_CVTTSS_U64(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvttss_u64(${quote(a)})")
    case iDef@MM512_CVTEPU32_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32_pd(${quote(a)})")
    case iDef@MM512_MASK_CVTEPU32_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu32_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVTEPU32_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu32_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_CVT_ROUNDEPU32_PS(a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvt_roundepu32_ps(${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_CVTEPU32_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtepu32_ps(${quote(a)})")
    case iDef@MM512_MASK_CVT_ROUNDEPU32_PS(src, k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundepu32_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASK_CVTEPU32_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtepu32_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_CVT_ROUNDEPU32_PS(k, a, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvt_roundepu32_ps(${quote(k)}, ${quote(a)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_CVTEPU32_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_cvtepu32_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM_CVT_ROUNDU64_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu64_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CVTU32_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu32_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTU64_SD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu64_sd(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVT_ROUNDU32_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu32_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CVT_ROUNDU64_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvt_roundu64_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_CVTU32_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu32_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM_CVTU64_SS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_cvtu64_ss(${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_ROUND_PD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_round_pd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_DIV_PD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_DIV_ROUND_PD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_round_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_DIV_PD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_pd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_DIV_ROUND_PD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_DIV_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_DIV_ROUND_PS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_div_round_ps(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASK_DIV_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_DIV_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_div_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_DIV_PS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_ps(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASKZ_DIV_ROUND_PS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_div_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_DIV_ROUND_SD(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_round_sd(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_DIV_ROUND_SD(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_round_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_DIV_SD(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_sd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_DIV_ROUND_SD(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_DIV_SD(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_sd(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_DIV_ROUND_SS(a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_div_round_ss(${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_DIV_ROUND_SS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_round_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASK_DIV_SS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_div_ss(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM_MASKZ_DIV_ROUND_SS(k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_DIV_SS(k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_div_ss(${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_EXPAND_PD(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_pd(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXPANDLOADU_PD(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_pd(${quote(src)}, ${quote(k)}, (void const*) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case iDef@MM512_MASKZ_EXPAND_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_EXPANDLOADU_PD(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expandloadu_pd(${quote(k)}, (void const*) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case iDef@MM512_MASK_EXPAND_PS(src, k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expand_ps(${quote(src)}, ${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASK_EXPANDLOADU_PS(src, k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_expandloadu_ps(${quote(src)}, ${quote(k)}, (void const*) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case iDef@MM512_MASKZ_EXPAND_PS(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expand_ps(${quote(k)}, ${quote(a)})")
    case iDef@MM512_MASKZ_EXPANDLOADU_PS(k, mem_addr, mem_addrOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_expandloadu_ps(${quote(k)}, (void const*) ${quote(mem_addr) + (if(mem_addrOffset == Const(0)) "" else " + " + quote(mem_addrOffset))})")
    case iDef@MM512_EXTRACTF32X4_PS(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extractf32x4_ps(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTF32X4_PS(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extractf32x4_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_EXTRACTF32X4_PS(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf32x4_ps(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_EXTRACTF64X4_PD(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extractf64x4_pd(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTF64X4_PD(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extractf64x4_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_EXTRACTF64X4_PD(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extractf64x4_pd(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_EXTRACTI32X4_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti32x4_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTI32X4_EPI32(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti32x4_epi32(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_EXTRACTI32X4_EPI32(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti32x4_epi32(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_EXTRACTI64X4_EPI64(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extracti64x4_epi64(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_EXTRACTI64X4_EPI64(src, k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extracti64x4_epi64(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_EXTRACTI64X4_EPI64(k, a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_extracti64x4_epi64(${quote(k)}, ${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_FIXUPIMM_PD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_FIXUPIMM_ROUND_PD(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FIXUPIMM_PD(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FIXUPIMM_ROUND_PD(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FIXUPIMM_PD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FIXUPIMM_ROUND_PD(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_FIXUPIMM_PS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_FIXUPIMM_ROUND_PS(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupimm_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FIXUPIMM_PS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASK_FIXUPIMM_ROUND_PS(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fixupimm_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FIXUPIMM_PS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FIXUPIMM_ROUND_PS(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fixupimm_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_FIXUPIMM_ROUND_SD(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_FIXUPIMM_SD(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_FIXUPIMM_ROUND_SD(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_FIXUPIMM_SD(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_FIXUPIMM_ROUND_SD(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FIXUPIMM_SD(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_FIXUPIMM_ROUND_SS(a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_FIXUPIMM_SS(a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fixupimm_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASK_FIXUPIMM_ROUND_SS(a, k, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASK_FIXUPIMM_SS(a, k, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fixupimm_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM_MASKZ_FIXUPIMM_ROUND_SS(k, a, b, c, imm8, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FIXUPIMM_SS(k, a, b, c, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fixupimm_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(imm8)})")
    case iDef@MM512_MASKZ_FMADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMADD_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMADD_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmadd_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_FMADD_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMADD_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMADD_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_FMADD_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMADD_SD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_FMADD_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMADD_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASK3_FMADD_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMADD_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmadd_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_FMADD_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmadd_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMADD_ROUND_SS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMADD_SS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmadd_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_FMADD_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMADD_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmadd_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMADDSUB_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMADDSUB_ROUND_PD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMADDSUB_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK3_FMADDSUB_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMADDSUB_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_FMADDSUB_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMADDSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMADDSUB_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_FMADDSUB_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMADDSUB_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmaddsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMADDSUB_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK3_FMADDSUB_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmaddsub_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMADDSUB_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_FMADDSUB_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmaddsub_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMADDSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMADDSUB_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmaddsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUB_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMSUB_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUB_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMSUB_ROUND_PS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsub_round_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_FMSUB_ROUND_SD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMSUB_ROUND_SD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_round_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMSUB_SD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_sd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_FMSUB_ROUND_SD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_round_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMSUB_SD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_sd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_FMSUB_ROUND_SD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_round_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMSUB_SD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_sd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_FMSUB_ROUND_SS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_fmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMSUB_ROUND_SS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_round_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM_MASK3_FMSUB_SS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask3_fmsub_ss(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM_MASK_FMSUB_ROUND_SS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_round_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASK_FMSUB_SS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_mask_fmsub_ss(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM_MASKZ_FMSUB_ROUND_SS(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_round_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM_MASKZ_FMSUB_SS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm_maskz_fmsub_ss(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMSUBADD_PD(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMSUBADD_ROUND_PD(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMSUBADD_PD(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK3_FMSUBADD_ROUND_PD(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_round_pd(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMSUBADD_PD(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_FMSUBADD_ROUND_PD(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_round_pd(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUBADD_PD(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASKZ_FMSUBADD_ROUND_PD(k, a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_round_pd(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_FMSUBADD_PS(a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_FMSUBADD_ROUND_PS(a, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fmsubadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASK3_FMSUBADD_PS(a, b, c, k) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)})")
    case iDef@MM512_MASK3_FMSUBADD_ROUND_PS(a, b, c, k, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask3_fmsubadd_round_ps(${quote(a)}, ${quote(b)}, ${quote(c)}, ${quote(k)}, ${quote(rounding)})")
    case iDef@MM512_MASK_FMSUBADD_PS(a, k, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)})")
    case iDef@MM512_MASK_FMSUBADD_ROUND_PS(a, k, b, c, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmsubadd_round_ps(${quote(a)}, ${quote(k)}, ${quote(b)}, ${quote(c)}, ${quote(rounding)})")
    case iDef@MM512_MASKZ_FMSUBADD_PS(k, a, b, c) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_maskz_fmsubadd_ps(${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(c)})")
    case _ => super.emitNode(sym, rhs)
  }
}
