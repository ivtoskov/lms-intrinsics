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
   * Performs a swizzle transformation of each of the four groups of packed 4x
   * single-precision (32-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v: __m512, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_PS(src: Exp[__m512], k: Exp[Int], v: Exp[__m512], s: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Swizzle)
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
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag). Results are stored using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not
   * set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, sign: __mmask16 *, rounding: int, signOffset: int
   */
  case class MM512_MASK_ADDSETS_ROUND_PS[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed double-precision (64-bit) floating-point values in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quadwords that occur at or after the first 64-byte-aligned address following
   * (mt-64) are loaded. Elements in the resulting vector that do not map to those
   * quadwords are taken from "src". "hint" indicates to the processor whether the
   * loaded data is non-temporal.
   * src: __m512d, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates their sum, storing the
   * results in "dst".
   * v2: __m512, v3: __m512
   */
  case class MM512_ADDN_PS(v2: Exp[__m512], v3: Exp[__m512]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element addition of packed 32-bit integers in "v2" and
   * "v3" and the corresponding bit in "k2", storing the result of the addition in
   * "dst" and the result of the carry in "k2_res".
   * v2: __m512i, k2: __mmask16, v3: __m512i, k2_res: __mmask16 *, k2_resOffset: int
   */
  case class MM512_ADC_EPI32[A[_], U:Integral](v2: Exp[__m512i], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in
   * "dst".
   * 	[round_note]
   * v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_SUBR_ROUND_PS(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Performs element-by-element subtraction of packed single-precision (32-bit)
   * floating-point elements in "v2" from "v3" storing the results in "dst" using
   * writemask "k" (elements are copied from "src" when the corresponding mask bit
   * is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_MASK_SUBR_ROUND_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed 64-bit integer elements of "v1" into a quadword stream at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)).
   * mt: void*, v1: __m512i, mtOffset: int
   */
  case class MM512_PACKSTOREHI_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed 32-bit integers in "dst". The initial values
   * of "dst" are copied from "src". Only those converted doublewords that occur
   * before first 64-byte-aligned address following "mt" are loaded. Elements in
   * the resulting vector that do not map to those doublewords are taken from
   * "src". "hint" indicates to the processor whether the loaded data is
   * non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
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
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64, up-converted depending on the value
   * of "conv", and expanded into packed single-precision (32-bit) floating-point
   * elements in "dst". The initial values of "dst" are copied from "src". Only
   * those converted quadwords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those quadwords are taken from "src". "hint" indicates to the
   * processor whether the loaded data is non-temporal.
   * src: __m512, mt: void const *, conv: _MM_UPCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKHI_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed double-precision (64-bit) floating-point elements in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src". "hint" indicates to the processor whether the loaded
   * data is non-temporal. Elements are copied to "dst" according to element
   * selector "k" (elemenst are skipped when the corresponding mask bit is not
   * set).
   * src: __m512d, k: __mmask8, mt: void const *, conv: _MM_UPCONV_PD_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_PD[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512d] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed single-precision (32-bit) floating-point
   * elements of "v1" into a byte/word/doubleword stream according to "conv" at a
   * logically mapped starting address (mt-64), storing the high-64-byte elements
   * of that stream (those elemetns of the stream that map at or after the first
   * 64-byte-aligned address following (m5-64)). "hint" indicates to the processor
   * whether the data is non-temporal. Elements are stored to memory according to
   * element selector "k" (elements are skipped when the corresponding mask bit is
   * not set).
   * mt: void *, k: __mmask16, v1: __m512, conv: _MM_DOWNCONV_PS_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTOREHI_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt, up-converted depending on the value of "conv", and
   * expanded into packed 64-bit integers in "dst". The initial values of "dst" are
   * copied from "src". Only those converted quad that occur before first
   * 64-byte-aligned address following "mt" are loaded. Elements in the resulting
   * vector that do not map to those quadwords are taken from "src". "hint"
   * indicates to the processor whether the loaded data is non-temporal.
   * src: __m512i, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Approximates the base-2 exponent of the packed single-precision (32-bit)
   * floating-point elements in "v2" with eight bits for sign and magnitude and 24
   * bits for the fractional part. Results are stored in "dst".
   * v2: __m512i
   */
  case class MM512_EXP223_PS(v2: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
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
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements,
   * storing the results in "dst" using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set). Results are written to the
   * lower half of "dst", and the upper half locations are set to
   * '0'.
   * 	[round_note]
   * src: __m512i, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores quad word-sized (64-bit) "data" to address "ptr" in big-endian
   * format.
   * ptr: void *, data: __int64, ptrOffset: int
   */
  case class STOREBE_I64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Long], ptrOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List()
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
   * Loads the low-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt, up-converted depending on the value of
   * "conv", and expanded into packed 32-bit integers in "dst". The initial values
   * of "dst" are copied from "src". Only those converted doublewords that occur
   * before first 64-byte-aligned address following "mt" are loaded. Elements in
   * the resulting vector that do not map to those doublewords are taken from
   * "src". "hint" indicates to the processor whether the loaded data is
   * non-temporal. Elements are copied to "dst" according to element selector "k"
   * (elements are skipped when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKLO_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v3" from "v2", storing the results in "dst" and the nth borrow bit in the nth
   * position of "borrow" (borrow flag). Results are stored using writemask "k"
   * (elements are copied from "v2" and "k_old" when the corresponding mask bit is
   * not set).
   * v2: __m512i, k: __mmask16, k_old: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_MASK_SUBSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs a swizzle transformation of each of the two groups of packed 4x64-bit
   * integer elements in "v" using swizzle parameter "s", storing the results in
   * "dst".
   * v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_EPI64(v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the byte/word/doubleword stream
   * starting at element-aligned address mt-64 and expands them into packed 32-bit
   * integers in "dst". The initial values of "dst" are copied from "src". Only
   * those converted doublewords that occur at or after the first 64-byte-aligned
   * address following (mt-64) are loaded. Elements in the resulting vector that do
   * not map to those doublewords are taken from "src". Elements are loaded from
   * memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, mt: void const *, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKHI_EPI32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element three-input subtraction of packed 32-bit integer
   * elements of "v2" as well as the corresponding bit from "k" from "v3". The
   * borrowed value from the subtraction difference for the nth element is written
   * to the nth bit of "borrow" (borrow flag). Results are stored in "dst".
   * v2: __m512i, k: __mmask16, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SBBR_EPI32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the high-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt-64, up-converted depending on the value of "conv",
   * and expanded into packed 64-bit integers in "dst". The initial values of "dst"
   * are copied from "src". Only those converted quadwords that occur at or after
   * the first 64-byte-aligned address following (mt-64) are loaded. Elements in
   * the resulting vector that do not map to those quadwords are taken from "src".
   * "hint" indicates to the processor whether the loaded data is non-temporal.
   * Elements are copied to "dst" according to element selector "k" (elements are
   * skipped when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask8, mt: void const *, conv: _MM_UPCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOADUNPACKHI_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Fixes up NaN's from packed double-precision (64-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" and storing the quietized NaN's
   * from "v1" in "v3".
   * v1: __m512d, v2: __m512d, v3: __m512i
   */
  case class MM512_FIXUPNAN_PD(v1: Exp[__m512d], v2: Exp[__m512d], v3: Exp[__m512i]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to 32-bit integer
   * elements, storing the results in "dst". "hint" indicates to the processor
   * whether the data is non-temporal.
   * mt: void const *, conv: _MM_UPCONV_EPI32_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTLOAD_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs element-by-element subtraction of packed 32-bit integer elements in
   * "v2" from "v3", storing the results in "dst" and "v2". The borrowed value from
   * the subtraction difference for the nth element is written to the nth bit of
   * "borrow" (borrow flag).
   * v2: __m512i, v3: __m512i, borrow: __mmask16 *, borrowOffset: int
   */
  case class MM512_SUBRSETB_EPI32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
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
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * "mt", storing the low-64-byte elements of that stream (those elements of the
   * stream that map before the first 64-byte-aligned address follwing "mt").
   * "hint" indicates to the processor whether the data is non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs an element-by-element addition of packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3", storing the results in "dst" and the
   * sign of the sum in "sign" (sign flag).
   * 	[round_note]
   * v2: __m512, v3: __m512, sign: __mmask16 *, rounding: int, signOffset: int
   */
  case class MM512_ADDSETS_ROUND_PS[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Depending on "bc", loads 1, 4, or 16 elements of type and size determined by
   * "conv" from memory address "mt" and converts all elements to single-precision
   * (32-bit) floating-point elements, storing the results in "dst" using writemask
   * "k" (elements are copied from "src" when the corresponding mask bit is not
   * set). "hint" indicates to the processor whether the data is non-temporal.
   * src: __m512, k: __mmask16, mt: void const *, conv: _MM_UPCONV_PS_ENUM, bc: _MM_BROADCAST32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTLOAD_PS[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the two groups of packed 4x
   * double-precision (64-bit) floating-point elements in "v" using swizzle
   * parameter "s", storing the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * src: __m512d, k: __mmask8, v: __m512d, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_MASK_SWIZZLE_PD(src: Exp[__m512d], k: Exp[Int], v: Exp[__m512d], s: Exp[Int]) extends IntrinsicsDef[__m512d] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Performs an element-by-element addition of packed 32-bit integer elements in
   * "v2" and "v3", storing the results in "dst" and the sign of the sum in "sign"
   * (sign flag). Results are stored using writemask "k" (elements are copied from
   * "src" when the corresponding mask bit is not set).
   * src: __m512i, k: __mmask16, v2: __m512i, v3: __m512i, sign: __mmask16 *, signOffset: int
   */
  case class MM512_MASK_ADDSETS_EPI32[A[_], U:Integral](src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit val cont: Container[A]) extends PointerIntrinsicsDef[U, __m512i] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element by element addition between packed single-precision (32-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst".
   * 	[round_note]
   * v2: __m512, v3: __m512, rounding: int
   */
  case class MM512_ADDN_ROUND_PS(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Downconverts packed 64-bit integer elements stored in "v" to a smaller type
   * depending on "conv" and stores them in memory location "mt" (elements in "mt"
   * are unaltered when the corresponding mask bit is not set). "hint" indicates to
   * the processor whether the data is non-temporal.
   * mt: void *, k: __mmask8, v: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTSTORE_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed single-precision (32-bit)
   * floating-point elements, storing the results in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * Results are written to the lower half of "dst", and the upper half locations
   * are set to '0'.
   * 	[round_note]
   * src: __m512, k: __mmask8, v2: __m512d, rounding: int
   */
  case class MM512_MASK_CVT_ROUNDPD_PSLO(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Convert)
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
   * Performs element-by-element conversion of packed double-precision (64-bit)
   * floating-point elements in "v2" to packed 32-bit unsigned integer elements,
   * storing the results in "dst". Results are written to the lower half of "dst",
   * and the upper half locations are set to '0'.
   * 	[round_note]
   * v2: __m512d, rounding: int
   */
  case class MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Convert)
    val intrinsicType = List(IntrinsicsType.FloatingPoint, IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address "mt", storing the low-64-byte elements of that stream (those elements
   * of the stream that map before the first 64-byte-aligned address follwing
   * "mt"). "hint" indicates to the processor whether the data is non-temporal.
   * Elements are written to memory according to element selector "k" (elements are
   * skipped when the corresponding mask bit is not set).
   * mt: void *, k: __mmask16, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Multiply packed single-precision (32-bit) floating-point elements in each
   * 4-element set of "a" and by element 1 of the corresponding 4-element set from
   * "b", add the intermediate result to element 0 of the corresponding 4-element
   * set from "b", and store the results in "dst" using writemask "k" (elements are
   * copied from "src" when the corresponding mask bit is not set).
   * 	[round_note]
   * src: __m512, k: __mmask16, a: __m512, b: __m512, rounding: int
   */
  case class MM512_MASK_FMADD233_ROUND_PS(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Arithmetic)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
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
   * Approximates the base-2 exponent of the packed single-precision (32-bit)
   * floating-point elements in "v2" with eight bits for sign and magnitude and 24
   * bits for the fractional part. Results are stored in "dst" using writemask "k"
   * (elements are copied from "src" when the corresponding mask bit is not set).
   * src: __m512, k: __mmask16, v2: __m512i
   */
  case class MM512_MASK_EXP223_PS(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.ElementaryMathFunctions)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 64-bit integer elements of "v1" into a
   * quadword stream according to "conv" at a logically mapped starting address
   * "mt", storing the low-64-byte elements of that stream (those elements of the
   * stream that map before the first 64-byte-aligned address follwing "mt").
   * "hint" indicates to the processor whether the data is non-temporal. Elements
   * are stored to memory according to element selector "k" (elements are skipped
   * whent he corresponding mask bit is not set).
   * mt: void *, k: __mmask8, v1: __m512i, conv: _MM_DOWNCONV_EPI64_ENUM, hint: int, mtOffset: int
   */
  case class MM512_MASK_EXTPACKSTORELO_EPI64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt"). Elements are loaded
   * from memory according to element selector "k" (elements are skipped when the
   * corresponding mask bit is not set).
   * mt: void*, k: __mmask16, v1: __m512, mtOffset: int
   */
  case class MM512_MASK_PACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Performs a swizzle transformation of each of the four groups of packed 4x
   * 32-bit integer elements in "v" using swizzle parameter "s", storing the
   * results in "dst".
   * v: __m512i, s: _MM_SWIZZLE_ENUM
   */
  case class MM512_SWIZZLE_EPI32(v: Exp[__m512i], s: Exp[Int]) extends IntrinsicsDef[__m512i] {
    val category = List(IntrinsicsCategory.Swizzle)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Fixes up NaN's from packed single-precision (32-bit) floating-point elements
   * in "v1" and "v2", storing the results in "dst" and storing the quietized NaN's
   * from "v1" in "v3".
   * v1: __m512, v2: __m512, v3: __m512i
   */
  case class MM512_FIXUPNAN_PS(v1: Exp[__m512], v2: Exp[__m512], v3: Exp[__m512i]) extends IntrinsicsDef[__m512] {
    val category = List(IntrinsicsCategory.Miscellaneous)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Stores packed single-precision (32-bit) floating-point elements of "v1" into a
   * doubleword stream at a logically mapped starting address "mt", storing the
   * low-64-byte elements of that stream (those elements of the stream that map
   * before the first 64-byte-aligned address follwing "mt").
   * mt: void*, v1: __m512, mtOffset: int
   */
  case class MM512_PACKSTORELO_PS[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.FloatingPoint)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Loads the low-64-byte-aligned portion of the quadword stream starting at
   * element-aligned address mt and expands them into packed 64-bit integers in
   * "dst". The initial values of "dst" are copied from "src". Only those converted
   * quad that occur before first 64-byte-aligned address following "mt" are
   * loaded. Elements in the resulting vector that do not map to those quadwords
   * are taken from "src". Elements are loaded from memory according to element
   * selector "k" (elements are skipped when the corresponding mask bit is not
   * set).
   * src: __m512i, k: __mmask8, mt: void const*, mtOffset: int
   */
  case class MM512_MASK_LOADUNPACKLO_EPI64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, __m512i] {
    val category = List(IntrinsicsCategory.Load)
    val intrinsicType = List(IntrinsicsType.Integer)
    val performance = Map.empty[MicroArchType, Performance]
    val header = "immintrin.h"
  }
      

  /**
   * Down-converts and stores packed 32-bit integer elements of "v1" into a
   * byte/word/doubleword stream according to "conv" at a logically mapped starting
   * address (mt-64), storing the high-64-byte elements of that stream (those
   * elemetns of the stream that map at or after the first 64-byte-aligned address
   * following (m5-64)). "hint" indicates to the processor whether the data is
   * non-temporal.
   * mt: void *, v1: __m512i, conv: _MM_DOWNCONV_EPI32_ENUM, hint: int, mtOffset: int
   */
  case class MM512_EXTPACKSTOREHI_EPI32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit val cont: Container[A]) extends VoidPointerIntrinsicsDef[T, U, Unit] {
    val category = List(IntrinsicsCategory.Store)
    val intrinsicType = List(IntrinsicsType.Integer)
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
   * Performs element by element addition between packed double-precision (64-bit)
   * floating-point elements in "v2" and "v3" and negates the sum, storing the
   * result in "dst".
   * 	[round_note]
   * v2: __m512d, v3: __m512d, rounding: int
   */
  case class MM512_ADDN_ROUND_PD(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]) extends IntrinsicsDef[__m512d] {
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
      

  def _mm512_mask_swizzle_ps(src: Exp[__m512], k: Exp[Int], v: Exp[__m512], s: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SWIZZLE_PS(src, k, v, s)
  }
            
  def _mm512_i64scatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64SCATTER_EPI32LO(mv, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_addsets_round_ps[A[_], U:Integral](src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_MASK_ADDSETS_ROUND_PS(src, k, v2, v3, sign, rounding, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64scatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64SCATTER_PSLO(mv, index, v, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_PD(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_addn_ps(v2: Exp[__m512], v3: Exp[__m512]): Exp[__m512] = {
    MM512_ADDN_PS(v2, v3)
  }
            
  def _mm512_adc_epi32[A[_], U:Integral](v2: Exp[__m512i], k2: Exp[Int], v3: Exp[__m512i], k2_res: Exp[A[Int]], k2_resOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(k2_res)(MM512_ADC_EPI32(v2, k2, v3, k2_res, k2_resOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_subr_round_ps(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_SUBR_ROUND_PS(v2, v3, rounding)
  }
            
  def _mm512_gmax_pd(a: Exp[__m512d], b: Exp[__m512d]): Exp[__m512d] = {
    MM512_GMAX_PD(a, b)
  }
            
  def _mm512_mask_gmaxabs_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_GMAXABS_PS(src, k, a, b)
  }
            
  def _mm512_mask_subr_round_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_SUBR_ROUND_PS(src, k, v2, v3, rounding)
  }
            
  def _mm512_packstorehi_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTOREHI_EPI64(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_EPI32(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64gather_pslo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_I64GATHER_PSLO(index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64SCATTER_EPI32LO(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64gather_epi32lo[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_MASK_I64GATHER_EPI32LO(src, k, index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpackhi_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_EXTLOADUNPACKHI_PS(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpacklo_pd[A[_], T:Typ, U:Integral](src: Exp[__m512d], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512d] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_PD(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extpackstorehi_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTOREHI_PS(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extloadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOADUNPACKLO_EPI64(src, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_exp223_ps(v2: Exp[__m512i]): Exp[__m512] = {
    MM512_EXP223_PS(v2)
  }
            
  def _mm512_reduce_gmax_ps(a: Exp[__m512]): Exp[Float] = {
    MM512_REDUCE_GMAX_PS(a)
  }
            
  def _mm512_mask_cvtfxpnt_roundpd_epu32lo(src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src, k, v2, rounding)
  }
            
  def _storebe_i64[A[_], T:Typ, U:Integral](ptr: Exp[A[T]], data: Exp[Long], ptrOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(ptr)(STOREBE_I64(ptr, data, ptrOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_roundfxpnt_adjust_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_MASK_ROUNDFXPNT_ADJUST_PS(src, k, a, rounding, expadj)
  }
            
  def _mm512_mask_extloadunpacklo_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKLO_EPI32(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_subsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], k_old: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_MASK_SUBSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_roundfxpnt_adjust_pd(src: Exp[__m512d], k: Exp[Int], a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_ROUNDFXPNT_ADJUST_PD(src, k, a, rounding, expadj)
  }
            
  def _mm512_gmin_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMIN_PS(a, b)
  }
            
  def _mm512_roundfxpnt_adjust_pd(a: Exp[__m512d], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512d] = {
    MM512_ROUNDFXPNT_ADJUST_PD(a, rounding, expadj)
  }
            
  def _mm512_swizzle_epi64(v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_SWIZZLE_EPI64(v, s)
  }
            
  def _mm512_mask_loadunpackhi_epi32[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKHI_EPI32(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_sbbr_epi32[A[_], U:Integral](v2: Exp[__m512i], k: Exp[Int], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SBBR_EPI32(v2, k, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extloadunpackhi_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_EXTLOADUNPACKHI_EPI64(src, k, mt, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm_spflt_64(r1: Exp[ULong]): Exp[Unit] = {
    reflectEffect(MM_SPFLT_64(r1))
  }
            
  def _mm512_mask_scale_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_SCALE_PS(src, k, a, b)
  }
            
  def _mm512_fixupnan_pd(v1: Exp[__m512d], v2: Exp[__m512d], v3: Exp[__m512i]): Exp[__m512d] = {
    MM512_FIXUPNAN_PD(v1, v2, v3)
  }
            
  def _mm512_extload_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_EXTLOAD_EPI32(mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_subrsetb_epi32[A[_], U:Integral](v2: Exp[__m512i], v3: Exp[__m512i], borrow: Exp[A[Int]], borrowOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(borrow)(MM512_SUBRSETB_EPI32(v2, v3, borrow, borrowOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64extscatter_epi32lo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512i], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64EXTSCATTER_EPI32LO(mv, k, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTORELO_EPI64(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_addsets_round_ps[A[_], U:Integral](v2: Exp[__m512], v3: Exp[__m512], sign: Exp[A[Int]], rounding: Exp[Int], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.write(sign)(MM512_ADDSETS_ROUND_PS(v2, v3, sign, rounding, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_extload_ps[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], mt: Exp[A[T]], conv: Exp[Int], bc: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mt)(MM512_MASK_EXTLOAD_PS(src, k, mt, conv, bc, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_swizzle_pd(src: Exp[__m512d], k: Exp[Int], v: Exp[__m512d], s: Exp[Int]): Exp[__m512d] = {
    MM512_MASK_SWIZZLE_PD(src, k, v, s)
  }
            
  def _mm512_permute4f128_epi32(a: Exp[__m512i], imm8: Exp[Int]): Exp[__m512i] = {
    MM512_PERMUTE4F128_EPI32(a, imm8)
  }
            
  def _mm512_mask_addsets_epi32[A[_], U:Integral](src: Exp[__m512i], k: Exp[Int], v2: Exp[__m512i], v3: Exp[__m512i], sign: Exp[A[Int]], signOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.write(sign)(MM512_MASK_ADDSETS_EPI32(src, k, v2, v3, sign, signOffset)(implicitly[Integral[U]], cont))
  }
            
  def _mm512_gmaxabs_ps(a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_GMAXABS_PS(a, b)
  }
            
  def _mm512_kmerge2l1h(k1: Exp[Int], k2: Exp[Int]): Exp[Int] = {
    MM512_KMERGE2L1H(k1, k2)
  }
            
  def _mm512_addn_round_ps(v2: Exp[__m512], v3: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_ADDN_ROUND_PS(v2, v3, rounding)
  }
            
  def _mm512_mask_extstore_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTSTORE_EPI64(mt, k, v, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64gather_epi32lo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mv)(MM512_I64GATHER_EPI32LO(index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_i64extscatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], index: Exp[__m512i], v1: Exp[__m512], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_I64EXTSCATTER_PSLO(mv, index, v1, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_cvt_roundpd_pslo(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_CVT_ROUNDPD_PSLO(src, k, v2, rounding)
  }
            
  def _mm512_mask_i64gather_pslo[A[_], T:Typ, U:Integral](src: Exp[__m512], k: Exp[Int], index: Exp[__m512i], mv: Exp[A[T]], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_MASK_I64GATHER_PSLO(src, k, index, mv, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_cvtfxpnt_roundpd_epu32lo(v2: Exp[__m512d], rounding: Exp[Int]): Exp[__m512i] = {
    MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2, rounding)
  }
            
  def _mm512_mask_extpackstorelo_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_EPI32(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_fmadd233_round_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512], rounding: Exp[Int]): Exp[__m512] = {
    MM512_MASK_FMADD233_ROUND_PS(src, k, a, b, rounding)
  }
            
  def _mm512_i64extgather_pslo[A[_], T:Typ, U:Integral](index: Exp[__m512i], mv: Exp[A[T]], conv: Exp[Int], scale: Exp[Int], hint: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512] = {
    cont.read(mv)(MM512_I64EXTGATHER_PSLO(index, mv, conv, scale, hint, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_i64scatter_pslo[A[_], T:Typ, U:Integral](mv: Exp[A[T]], k: Exp[Int], index: Exp[__m512i], v1: Exp[__m512], scale: Exp[Int], mvOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mv)(MM512_MASK_I64SCATTER_PSLO(mv, k, index, v1, scale, mvOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_exp223_ps(src: Exp[__m512], k: Exp[Int], v2: Exp[__m512i]): Exp[__m512] = {
    MM512_MASK_EXP223_PS(src, k, v2)
  }
            
  def _mm512_mask_extpackstorelo_epi64[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_EXTPACKSTORELO_EPI64(mt, k, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_reduce_gmax_pd(a: Exp[__m512d]): Exp[Double] = {
    MM512_REDUCE_GMAX_PD(a)
  }
            
  def _mm512_mask_packstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], k: Exp[Int], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_MASK_PACKSTORELO_PS(mt, k, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_swizzle_epi32(v: Exp[__m512i], s: Exp[Int]): Exp[__m512i] = {
    MM512_SWIZZLE_EPI32(v, s)
  }
            
  def _mm512_mask_reduce_gmax_pd(k: Exp[Int], a: Exp[__m512d]): Exp[Double] = {
    MM512_MASK_REDUCE_GMAX_PD(k, a)
  }
            
  def _mm512_round_ps(a: Exp[__m512], rounding: Exp[Int], expadj: Exp[Int]): Exp[__m512] = {
    MM512_ROUND_PS(a, rounding, expadj)
  }
            
  def _mm512_fixupnan_ps(v1: Exp[__m512], v2: Exp[__m512], v3: Exp[__m512i]): Exp[__m512] = {
    MM512_FIXUPNAN_PS(v1, v2, v3)
  }
            
  def _mm512_packstorelo_ps[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_PACKSTORELO_PS(mt, v1, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_mask_loadunpacklo_epi64[A[_], T:Typ, U:Integral](src: Exp[__m512i], k: Exp[Int], mt: Exp[A[T]], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[__m512i] = {
    cont.read(mt)(MM512_MASK_LOADUNPACKLO_EPI64(src, k, mt, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_extpackstorehi_epi32[A[_], T:Typ, U:Integral](mt: Exp[A[T]], v1: Exp[__m512i], conv: Exp[Int], hint: Exp[Int], mtOffset: Exp[U])(implicit cont: Container[A]): Exp[Unit] = {
    cont.write(mt)(MM512_EXTPACKSTOREHI_EPI32(mt, v1, conv, hint, mtOffset)(typ[T], implicitly[Integral[U]], cont))
  }
            
  def _mm512_kconcathi_64(k1: Exp[Int], k2: Exp[Int]): Exp[Long] = {
    MM512_KCONCATHI_64(k1, k2)
  }
            
  def _mm512_addn_round_pd(v2: Exp[__m512d], v3: Exp[__m512d], rounding: Exp[Int]): Exp[__m512d] = {
    MM512_ADDN_ROUND_PD(v2, v3, rounding)
  }
            
  def _mm512_log2_ps(a: Exp[__m512]): Exp[__m512] = {
    MM512_LOG2_PS(a)
  }
            
  def _mm512_mask_fmadd233_ps(src: Exp[__m512], k: Exp[Int], a: Exp[__m512], b: Exp[__m512]): Exp[__m512] = {
    MM512_MASK_FMADD233_PS(src, k, a, b)
  }
            
  override def mirror[A:Typ](e: Def[A], f: Transformer)(implicit pos: SourceContext): Exp[A] = (e match {
    case MM512_MASK_SWIZZLE_PS (src, k, v, s) =>
      _mm512_mask_swizzle_ps(f(src), f(k), f(v), f(s))
    case iDef@MM512_I64SCATTER_EPI32LO (mv, index, v1, scale, mvOffset) =>
      _mm512_i64scatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_ADDSETS_ROUND_PS (src, k, v2, v3, sign, rounding, signOffset) =>
      _mm512_mask_addsets_round_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_I64SCATTER_PSLO (mv, index, v, scale, mvOffset) =>
      _mm512_i64scatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_PD (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_ADDN_PS (v2, v3) =>
      _mm512_addn_ps(f(v2), f(v3))
    case iDef@MM512_ADC_EPI32 (v2, k2, v3, k2_res, k2_resOffset) =>
      _mm512_adc_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont)
    case MM512_SUBR_ROUND_PS (v2, v3, rounding) =>
      _mm512_subr_round_ps(f(v2), f(v3), f(rounding))
    case MM512_GMAX_PD (a, b) =>
      _mm512_gmax_pd(f(a), f(b))
    case MM512_MASK_GMAXABS_PS (src, k, a, b) =>
      _mm512_mask_gmaxabs_ps(f(src), f(k), f(a), f(b))
    case MM512_MASK_SUBR_ROUND_PS (src, k, v2, v3, rounding) =>
      _mm512_mask_subr_round_ps(f(src), f(k), f(v2), f(v3), f(rounding))
    case iDef@MM512_PACKSTOREHI_EPI64 (mt, v1, mtOffset) =>
      _mm512_packstorehi_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_EPI32 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64GATHER_PSLO (index, mv, scale, mvOffset) =>
      _mm512_i64gather_pslo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_EPI32LO (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i64scatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64GATHER_EPI32LO (src, k, index, mv, scale, mvOffset) =>
      _mm512_mask_i64gather_epi32lo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKHI_PS (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpackhi_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PD (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_pd(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTPACKSTOREHI_PS (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorehi_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTLOADUNPACKLO_EPI64 (src, mt, conv, hint, mtOffset) =>
      _mm512_extloadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_EXP223_PS (v2) =>
      _mm512_exp223_ps(f(v2))
    case MM512_REDUCE_GMAX_PS (a) =>
      _mm512_reduce_gmax_ps(f(a))
    case MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (src, k, v2, rounding) =>
      _mm512_mask_cvtfxpnt_roundpd_epu32lo(f(src), f(k), f(v2), f(rounding))
    case iDef@STOREBE_I64 (ptr, data, ptrOffset) =>
      _storebe_i64(iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_ROUNDFXPNT_ADJUST_PS (src, k, a, rounding, expadj) =>
      _mm512_mask_roundfxpnt_adjust_ps(f(src), f(k), f(a), f(rounding), f(expadj))
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI32 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpacklo_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_SUBSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset) =>
      _mm512_mask_subsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case MM512_MASK_ROUNDFXPNT_ADJUST_PD (src, k, a, rounding, expadj) =>
      _mm512_mask_roundfxpnt_adjust_pd(f(src), f(k), f(a), f(rounding), f(expadj))
    case MM512_GMIN_PS (a, b) =>
      _mm512_gmin_ps(f(a), f(b))
    case MM512_ROUNDFXPNT_ADJUST_PD (a, rounding, expadj) =>
      _mm512_roundfxpnt_adjust_pd(f(a), f(rounding), f(expadj))
    case MM512_SWIZZLE_EPI64 (v, s) =>
      _mm512_swizzle_epi64(f(v), f(s))
    case iDef@MM512_MASK_LOADUNPACKHI_EPI32 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpackhi_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_SBBR_EPI32 (v2, k, v3, borrow, borrowOffset) =>
      _mm512_sbbr_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI64 (src, k, mt, conv, hint, mtOffset) =>
      _mm512_mask_extloadunpackhi_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM_SPFLT_64 (r1) =>
      _mm_spflt_64(f(r1))
    case MM512_MASK_SCALE_PS (src, k, a, b) =>
      _mm512_mask_scale_ps(f(src), f(k), f(a), f(b))
    case MM512_FIXUPNAN_PD (v1, v2, v3) =>
      _mm512_fixupnan_pd(f(v1), f(v2), f(v3))
    case iDef@MM512_EXTLOAD_EPI32 (mt, conv, bc, hint, mtOffset) =>
      _mm512_extload_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_SUBRSETB_EPI32 (v2, v3, borrow, borrowOffset) =>
      _mm512_subrsetb_epi32(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64EXTSCATTER_EPI32LO (mv, k, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_mask_i64extscatter_epi32lo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTORELO_EPI64 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_ADDSETS_ROUND_PS (v2, v3, sign, rounding, signOffset) =>
      _mm512_addsets_round_ps(iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_EXTLOAD_PS (src, k, mt, conv, bc, hint, mtOffset) =>
      _mm512_mask_extload_ps(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_SWIZZLE_PD (src, k, v, s) =>
      _mm512_mask_swizzle_pd(f(src), f(k), f(v), f(s))
    case MM512_PERMUTE4F128_EPI32 (a, imm8) =>
      _mm512_permute4f128_epi32(f(a), f(imm8))
    case iDef@MM512_MASK_ADDSETS_EPI32 (src, k, v2, v3, sign, signOffset) =>
      _mm512_mask_addsets_epi32(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont)
    case MM512_GMAXABS_PS (a, b) =>
      _mm512_gmaxabs_ps(f(a), f(b))
    case MM512_KMERGE2L1H (k1, k2) =>
      _mm512_kmerge2l1h(f(k1), f(k2))
    case MM512_ADDN_ROUND_PS (v2, v3, rounding) =>
      _mm512_addn_round_ps(f(v2), f(v3), f(rounding))
    case iDef@MM512_MASK_EXTSTORE_EPI64 (mt, k, v, conv, hint, mtOffset) =>
      _mm512_mask_extstore_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64GATHER_EPI32LO (index, mv, scale, mvOffset) =>
      _mm512_i64gather_epi32lo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_I64EXTSCATTER_PSLO (mv, index, v1, conv, scale, hint, mvOffset) =>
      _mm512_i64extscatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_CVT_ROUNDPD_PSLO (src, k, v2, rounding) =>
      _mm512_mask_cvt_roundpd_pslo(f(src), f(k), f(v2), f(rounding))
    case iDef@MM512_MASK_I64GATHER_PSLO (src, k, index, mv, scale, mvOffset) =>
      _mm512_mask_i64gather_pslo(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_CVTFXPNT_ROUNDPD_EPU32LO (v2, rounding) =>
      _mm512_cvtfxpnt_roundpd_epu32lo(f(v2), f(rounding))
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI32 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_FMADD233_ROUND_PS (src, k, a, b, rounding) =>
      _mm512_mask_fmadd233_round_ps(f(src), f(k), f(a), f(b), f(rounding))
    case iDef@MM512_I64EXTGATHER_PSLO (index, mv, conv, scale, hint, mvOffset) =>
      _mm512_i64extgather_pslo(iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_I64SCATTER_PSLO (mv, k, index, v1, scale, mvOffset) =>
      _mm512_mask_i64scatter_pslo(iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_MASK_EXP223_PS (src, k, v2) =>
      _mm512_mask_exp223_ps(f(src), f(k), f(v2))
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI64 (mt, k, v1, conv, hint, mtOffset) =>
      _mm512_mask_extpackstorelo_epi64(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_REDUCE_GMAX_PD (a) =>
      _mm512_reduce_gmax_pd(f(a))
    case iDef@MM512_MASK_PACKSTORELO_PS (mt, k, v1, mtOffset) =>
      _mm512_mask_packstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_SWIZZLE_EPI32 (v, s) =>
      _mm512_swizzle_epi32(f(v), f(s))
    case MM512_MASK_REDUCE_GMAX_PD (k, a) =>
      _mm512_mask_reduce_gmax_pd(f(k), f(a))
    case MM512_ROUND_PS (a, rounding, expadj) =>
      _mm512_round_ps(f(a), f(rounding), f(expadj))
    case MM512_FIXUPNAN_PS (v1, v2, v3) =>
      _mm512_fixupnan_ps(f(v1), f(v2), f(v3))
    case iDef@MM512_PACKSTORELO_PS (mt, v1, mtOffset) =>
      _mm512_packstorelo_ps(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_MASK_LOADUNPACKLO_EPI64 (src, k, mt, mtOffset) =>
      _mm512_mask_loadunpacklo_epi64(iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case iDef@MM512_EXTPACKSTOREHI_EPI32 (mt, v1, conv, hint, mtOffset) =>
      _mm512_extpackstorehi_epi32(iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont)
    case MM512_KCONCATHI_64 (k1, k2) =>
      _mm512_kconcathi_64(f(k1), f(k2))
    case MM512_ADDN_ROUND_PD (v2, v3, rounding) =>
      _mm512_addn_round_pd(f(v2), f(v3), f(rounding))
    case MM512_LOG2_PS (a) =>
      _mm512_log2_ps(f(a))
    case MM512_MASK_FMADD233_PS (src, k, a, b) =>
      _mm512_mask_fmadd233_ps(f(src), f(k), f(a), f(b))

    case Reflect(MM512_MASK_SWIZZLE_PS (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_PS (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_EPI32LO (mv, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_ROUND_PS (src, k, v2, v3, sign, rounding, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_ROUND_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64SCATTER_PSLO (mv, index, v, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64SCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_PD (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_PS (v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_PS (f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADC_EPI32 (v2, k2, v3, k2_res, k2_resOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADC_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(k2_res, f), iDef.cont.applyTransformer(k2_resOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SUBR_ROUND_PS (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_SUBR_ROUND_PS (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAX_PD (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAX_PD (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_GMAXABS_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_GMAXABS_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SUBR_ROUND_PS (src, k, v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBR_ROUND_PS (f(src), f(k), f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTOREHI_EPI64 (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTOREHI_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_EPI32 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_PSLO (index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_PSLO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_EPI32LO (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_EPI32LO (src, k, index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_EPI32LO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKHI_PS (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKHI_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_PD (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_PD (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTOREHI_PS (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTOREHI_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOADUNPACKLO_EPI64 (src, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_EXP223_PS (v2), u, es) =>
      reflectMirrored(Reflect(MM512_EXP223_PS (f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMAX_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMAX_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@STOREBE_I64 (ptr, data, ptrOffset), u, es) =>
      reflectMirrored(Reflect(STOREBE_I64 (iDef.cont.applyTransformer(ptr, f), iDef.cont.applyTransformer(data, f), iDef.cont.applyTransformer(ptrOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PS (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PS (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKLO_EPI32 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKLO_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_SUBSETB_EPI32 (v2, k, k_old, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SUBSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(k_old, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PD (src, k, a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ROUNDFXPNT_ADJUST_PD (f(src), f(k), f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMIN_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMIN_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUNDFXPNT_ADJUST_PD (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUNDFXPNT_ADJUST_PD (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_EPI64 (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_EPI64 (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKHI_EPI32 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKHI_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SBBR_EPI32 (v2, k, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SBBR_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOADUNPACKHI_EPI64 (src, k, mt, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOADUNPACKHI_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM_SPFLT_64 (r1), u, es) =>
      reflectMirrored(Reflect(MM_SPFLT_64 (f(r1)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SCALE_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SCALE_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPNAN_PD (v1, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPNAN_PD (f(v1), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTLOAD_EPI32 (mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTLOAD_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_SUBRSETB_EPI32 (v2, v3, borrow, borrowOffset), u, es) =>
      reflectMirrored(Reflect(MM512_SUBRSETB_EPI32 (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(borrow, f), iDef.cont.applyTransformer(borrowOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64EXTSCATTER_EPI32LO (mv, k, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64EXTSCATTER_EPI32LO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTORELO_EPI64 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_ADDSETS_ROUND_PS (v2, v3, sign, rounding, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_ADDSETS_ROUND_PS (iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(rounding, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTLOAD_PS (src, k, mt, conv, bc, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTLOAD_PS (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(bc, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_SWIZZLE_PD (src, k, v, s), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_SWIZZLE_PD (f(src), f(k), f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_PERMUTE4F128_EPI32 (a, imm8), u, es) =>
      reflectMirrored(Reflect(MM512_PERMUTE4F128_EPI32 (f(a), f(imm8)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_ADDSETS_EPI32 (src, k, v2, v3, sign, signOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_ADDSETS_EPI32 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v2, f), iDef.cont.applyTransformer(v3, f), iDef.cont.applyTransformer(sign, f), iDef.cont.applyTransformer(signOffset, f))(iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_GMAXABS_PS (a, b), u, es) =>
      reflectMirrored(Reflect(MM512_GMAXABS_PS (f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KMERGE2L1H (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KMERGE2L1H (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_ROUND_PS (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_ROUND_PS (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTSTORE_EPI64 (mt, k, v, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTSTORE_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64GATHER_EPI32LO (index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64GATHER_EPI32LO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTSCATTER_PSLO (mv, index, v1, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTSCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_CVT_ROUNDPD_PSLO (src, k, v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_CVT_ROUNDPD_PSLO (f(src), f(k), f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64GATHER_PSLO (src, k, index, mv, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64GATHER_PSLO (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_CVTFXPNT_ROUNDPD_EPU32LO (v2, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_CVTFXPNT_ROUNDPD_EPU32LO (f(v2), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_EPI32 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_ROUND_PS (src, k, a, b, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_ROUND_PS (f(src), f(k), f(a), f(b), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_I64EXTGATHER_PSLO (index, mv, conv, scale, hint, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_I64EXTGATHER_PSLO (iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_I64SCATTER_PSLO (mv, k, index, v1, scale, mvOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_I64SCATTER_PSLO (iDef.cont.applyTransformer(mv, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(index, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(scale, f), iDef.cont.applyTransformer(mvOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_EXP223_PS (src, k, v2), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXP223_PS (f(src), f(k), f(v2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_EXTPACKSTORELO_EPI64 (mt, k, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_EXTPACKSTORELO_EPI64 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_REDUCE_GMAX_PD (a), u, es) =>
      reflectMirrored(Reflect(MM512_REDUCE_GMAX_PD (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_PACKSTORELO_PS (mt, k, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_PACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_SWIZZLE_EPI32 (v, s), u, es) =>
      reflectMirrored(Reflect(MM512_SWIZZLE_EPI32 (f(v), f(s)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_REDUCE_GMAX_PD (k, a), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_REDUCE_GMAX_PD (f(k), f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ROUND_PS (a, rounding, expadj), u, es) =>
      reflectMirrored(Reflect(MM512_ROUND_PS (f(a), f(rounding), f(expadj)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_FIXUPNAN_PS (v1, v2, v3), u, es) =>
      reflectMirrored(Reflect(MM512_FIXUPNAN_PS (f(v1), f(v2), f(v3)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_PACKSTORELO_PS (mt, v1, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_PACKSTORELO_PS (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_MASK_LOADUNPACKLO_EPI64 (src, k, mt, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_LOADUNPACKLO_EPI64 (iDef.cont.applyTransformer(src, f), iDef.cont.applyTransformer(k, f), iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(iDef@MM512_EXTPACKSTOREHI_EPI32 (mt, v1, conv, hint, mtOffset), u, es) =>
      reflectMirrored(Reflect(MM512_EXTPACKSTOREHI_EPI32 (iDef.cont.applyTransformer(mt, f), iDef.cont.applyTransformer(v1, f), iDef.cont.applyTransformer(conv, f), iDef.cont.applyTransformer(hint, f), iDef.cont.applyTransformer(mtOffset, f))(iDef.voidType, iDef.integralType, iDef.cont), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_KCONCATHI_64 (k1, k2), u, es) =>
      reflectMirrored(Reflect(MM512_KCONCATHI_64 (f(k1), f(k2)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_ADDN_ROUND_PD (v2, v3, rounding), u, es) =>
      reflectMirrored(Reflect(MM512_ADDN_ROUND_PD (f(v2), f(v3), f(rounding)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_LOG2_PS (a), u, es) =>
      reflectMirrored(Reflect(MM512_LOG2_PS (f(a)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case Reflect(MM512_MASK_FMADD233_PS (src, k, a, b), u, es) =>
      reflectMirrored(Reflect(MM512_MASK_FMADD233_PS (f(src), f(k), f(a), f(b)), mapOver(f,u), f(es)))(mtype(typ[A]), pos)
    case _ => super.mirror(e, f)
  }).asInstanceOf[Exp[A]] // why??
}

trait CGenKNC01 extends CGenIntrinsics {

  val IR: KNC
  import IR._

  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = rhs match {
       
    case iDef@MM512_MASK_SWIZZLE_PS(src, k, v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_swizzle_ps(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case iDef@MM512_I64SCATTER_EPI32LO(mv, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_epi32lo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_ADDSETS_ROUND_PS(src, k, v2, v3, sign, rounding, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addsets_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}), ${quote(rounding)})")
    case iDef@MM512_I64SCATTER_PSLO(mv, index, v, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64scatter_pslo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v)}, ${quote(scale)});")
    case iDef@MM512_EXTLOADUNPACKHI_PD(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpackhi_pd(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_ADDN_PS(v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addn_ps(${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_ADC_EPI32(v2, k2, v3, k2_res, k2_resOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_adc_epi32(${quote(v2)}, ${quote(k2)}, ${quote(v3)}, (__mmask16 *) (${quote(k2_res)  + (if(k2_resOffset == Const(0)) "" else " + " + quote(k2_resOffset))}))")
    case iDef@MM512_SUBR_ROUND_PS(v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subr_round_ps(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_GMAX_PD(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmax_pd(${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_GMAXABS_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_gmaxabs_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_MASK_SUBR_ROUND_PS(src, k, v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subr_round_ps(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_PACKSTOREHI_EPI64(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorehi_epi64((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_EXTLOADUNPACKLO_EPI32(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpacklo_epi32(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_I64GATHER_PSLO(index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_pslo(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(scale)})")
    case iDef@MM512_MASK_I64SCATTER_EPI32LO(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_epi32lo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_I64GATHER_EPI32LO(src, k, index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_epi32lo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(scale)})")
    case iDef@MM512_EXTLOADUNPACKHI_PS(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpackhi_ps(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_MASK_EXTLOADUNPACKLO_PD(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_pd(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_MASK_EXTPACKSTOREHI_PS(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorehi_ps((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_EXTLOADUNPACKLO_EPI64(src, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extloadunpacklo_epi64(${quote(src)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_EXP223_PS(v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_exp223_ps(${quote(v2)})")
    case iDef@MM512_REDUCE_GMAX_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmax_ps(${quote(a)})")
    case iDef@MM512_MASK_CVTFXPNT_ROUNDPD_EPU32LO(src, k, v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvtfxpnt_roundpd_epu32lo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case iDef@STOREBE_I64(ptr, data, ptrOffset) =>
      headers += iDef.header
      stream.println(s"_storebe_i64((void *) (${quote(ptr)  + (if(ptrOffset == Const(0)) "" else " + " + quote(ptrOffset))}), ${quote(data)});")
    case iDef@MM512_MASK_ROUNDFXPNT_ADJUST_PS(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundfxpnt_adjust_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_MASK_EXTLOADUNPACKLO_EPI32(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpacklo_epi32(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM512_MASK_SUBSETB_EPI32(v2, k, k_old, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_subsetb_epi32(${quote(v2)}, ${quote(k)}, ${quote(k_old)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_MASK_ROUNDFXPNT_ADJUST_PD(src, k, a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_roundfxpnt_adjust_pd(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_GMIN_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmin_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_ROUNDFXPNT_ADJUST_PD(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_roundfxpnt_adjust_pd(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_SWIZZLE_EPI64(v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_swizzle_epi64(${quote(v)}, ${quote(s)})")
    case iDef@MM512_MASK_LOADUNPACKHI_EPI32(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpackhi_epi32(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_SBBR_EPI32(v2, k, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_sbbr_epi32(${quote(v2)}, ${quote(k)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_MASK_EXTLOADUNPACKHI_EPI64(src, k, mt, conv, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extloadunpackhi_epi64(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(hint)})")
    case iDef@MM_SPFLT_64(r1) =>
      headers += iDef.header
      stream.println(s"_mm_spflt_64(${quote(r1)});")
    case iDef@MM512_MASK_SCALE_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_scale_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case iDef@MM512_FIXUPNAN_PD(v1, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupnan_pd(${quote(v1)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_EXTLOAD_EPI32(mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_extload_epi32((void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_SUBRSETB_EPI32(v2, v3, borrow, borrowOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_subrsetb_epi32(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(borrow)  + (if(borrowOffset == Const(0)) "" else " + " + quote(borrowOffset))}))")
    case iDef@MM512_MASK_I64EXTSCATTER_EPI32LO(mv, k, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64extscatter_epi32lo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_EXTPACKSTORELO_EPI64(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorelo_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_ADDSETS_ROUND_PS(v2, v3, sign, rounding, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addsets_round_ps(${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}), ${quote(rounding)})")
    case iDef@MM512_MASK_EXTLOAD_PS(src, k, mt, conv, bc, hint, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_extload_ps(${quote(src)}, ${quote(k)}, (void const *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(conv)}, ${quote(bc)}, ${quote(hint)})")
    case iDef@MM512_MASK_SWIZZLE_PD(src, k, v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_swizzle_pd(${quote(src)}, ${quote(k)}, ${quote(v)}, ${quote(s)})")
    case iDef@MM512_PERMUTE4F128_EPI32(a, imm8) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_permute4f128_epi32(${quote(a)}, ${quote(imm8)})")
    case iDef@MM512_MASK_ADDSETS_EPI32(src, k, v2, v3, sign, signOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_addsets_epi32(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(v3)}, (__mmask16 *) (${quote(sign)  + (if(signOffset == Const(0)) "" else " + " + quote(signOffset))}))")
    case iDef@MM512_GMAXABS_PS(a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_gmaxabs_ps(${quote(a)}, ${quote(b)})")
    case iDef@MM512_KMERGE2L1H(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kmerge2l1h(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_ADDN_ROUND_PS(v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addn_round_ps(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_MASK_EXTSTORE_EPI64(mt, k, v, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extstore_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_I64GATHER_EPI32LO(index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64gather_epi32lo(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(scale)})")
    case iDef@MM512_I64EXTSCATTER_PSLO(mv, index, v1, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_i64extscatter_pslo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(index)}, ${quote(v1)}, ${quote(conv)}, ${quote(scale)}, ${quote(hint)});")
    case iDef@MM512_MASK_CVT_ROUNDPD_PSLO(src, k, v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_cvt_roundpd_pslo(${quote(src)}, ${quote(k)}, ${quote(v2)}, ${quote(rounding)})")
    case iDef@MM512_MASK_I64GATHER_PSLO(src, k, index, mv, scale, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_i64gather_pslo(${quote(src)}, ${quote(k)}, ${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(scale)})")
    case iDef@MM512_CVTFXPNT_ROUNDPD_EPU32LO(v2, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_cvtfxpnt_roundpd_epu32lo(${quote(v2)}, ${quote(rounding)})")
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI32(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorelo_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_MASK_FMADD233_ROUND_PS(src, k, a, b, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd233_round_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)}, ${quote(rounding)})")
    case iDef@MM512_I64EXTGATHER_PSLO(index, mv, conv, scale, hint, mvOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_i64extgather_pslo(${quote(index)}, (void const *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(conv)}, ${quote(scale)}, ${quote(hint)})")
    case iDef@MM512_MASK_I64SCATTER_PSLO(mv, k, index, v1, scale, mvOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_i64scatter_pslo((void *) (${quote(mv)  + (if(mvOffset == Const(0)) "" else " + " + quote(mvOffset))}), ${quote(k)}, ${quote(index)}, ${quote(v1)}, ${quote(scale)});")
    case iDef@MM512_MASK_EXP223_PS(src, k, v2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_exp223_ps(${quote(src)}, ${quote(k)}, ${quote(v2)})")
    case iDef@MM512_MASK_EXTPACKSTORELO_EPI64(mt, k, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_extpackstorelo_epi64((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_REDUCE_GMAX_PD(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_reduce_gmax_pd(${quote(a)})")
    case iDef@MM512_MASK_PACKSTORELO_PS(mt, k, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_mask_packstorelo_ps((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(k)}, ${quote(v1)});")
    case iDef@MM512_SWIZZLE_EPI32(v, s) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_swizzle_epi32(${quote(v)}, ${quote(s)})")
    case iDef@MM512_MASK_REDUCE_GMAX_PD(k, a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_reduce_gmax_pd(${quote(k)}, ${quote(a)})")
    case iDef@MM512_ROUND_PS(a, rounding, expadj) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_round_ps(${quote(a)}, ${quote(rounding)}, ${quote(expadj)})")
    case iDef@MM512_FIXUPNAN_PS(v1, v2, v3) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_fixupnan_ps(${quote(v1)}, ${quote(v2)}, ${quote(v3)})")
    case iDef@MM512_PACKSTORELO_PS(mt, v1, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_packstorelo_ps((void*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)});")
    case iDef@MM512_MASK_LOADUNPACKLO_EPI64(src, k, mt, mtOffset) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_loadunpacklo_epi64(${quote(src)}, ${quote(k)}, (void const*) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}))")
    case iDef@MM512_EXTPACKSTOREHI_EPI32(mt, v1, conv, hint, mtOffset) =>
      headers += iDef.header
      stream.println(s"_mm512_extpackstorehi_epi32((void *) (${quote(mt)  + (if(mtOffset == Const(0)) "" else " + " + quote(mtOffset))}), ${quote(v1)}, ${quote(conv)}, ${quote(hint)});")
    case iDef@MM512_KCONCATHI_64(k1, k2) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_kconcathi_64(${quote(k1)}, ${quote(k2)})")
    case iDef@MM512_ADDN_ROUND_PD(v2, v3, rounding) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_addn_round_pd(${quote(v2)}, ${quote(v3)}, ${quote(rounding)})")
    case iDef@MM512_LOG2_PS(a) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_log2_ps(${quote(a)})")
    case iDef@MM512_MASK_FMADD233_PS(src, k, a, b) =>
      headers += iDef.header
      emitValDef(sym, s"_mm512_mask_fmadd233_ps(${quote(src)}, ${quote(k)}, ${quote(a)}, ${quote(b)})")
    case _ => super.emitNode(sym, rhs)
  }
}
